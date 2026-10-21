#!/usr/bin/env python
"""fix_varscope.py -- repair `cannot find symbol: variable` errors caused by
Vineflower duplicating bytecode for irreducible control flow.

Usage:
    python fix_varscope.py <source_root> <javac.log> [--dry-run] [--report=<tsv>]

The log is a javac error log.  Only errors of the form

    <file>:<line>: error: cannot find symbol
    symbol:   variable varNN
    location: class

are considered; they are the ones where a local variable is used outside the
block that declares it.

Two repairs are applied per error:

  hoist    the declaration exists in the same method but in a nested block
           that does not cover the error line.  The declaration is moved to
           the method's outermost block; an initializer stays at its original
           position as a plain assignment.

  synth    no declaration is in scope at all (Vineflower dropped it).  A
           declaration is synthesised at the top of the method, with the type
           inferred from every use of the variable in that method.

Both repairs preserve execution order: the declaration (without initializer)
goes to the top of the method, the initializer stays where it was.

Anything that cannot be repaired safely is left alone and reported.
"""
import argparse
import collections
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import jscope
import jtypes

ERR_RE = re.compile(
    r"^(?P<file>[A-Za-z]:[\\/][^:]*\.java):(?P<line>\d+): error: (?P<msg>.*)$")
SYMBOL_RE = re.compile(r"^\s*symbol:\s*(?P<kind>\S+)\s*(?P<name>.*?)\s*$")
LOCATION_RE = re.compile(r"^\s*location:\s*(?P<kind>\S+)\s*(?P<name>.*?)\s*$")

MODIFIER_WORDS = {"final"}

# how many times a file is repaired before the tool gives up on it
MAX_PASSES = 6


# --------------------------------------------------------------- log parse --

def parse_log(path):
    """Return list of (file, line, name) for sym=variable / loc=class errors."""
    out = []
    cur = None
    with open(path, encoding="utf-8", errors="replace") as fh:
        for raw in fh:
            line = raw.rstrip("\n").rstrip("\r")
            m = ERR_RE.match(line)
            if m:
                cur = {"file": m.group("file"), "line": int(m.group("line")),
                       "msg": m.group("msg"), "kind": None, "name": None,
                       "loc_kind": None}
                if cur["msg"] == "cannot find symbol":
                    out.append(cur)
                else:
                    cur = None
                continue
            if cur is None:
                continue
            s = SYMBOL_RE.match(line)
            if s and cur["kind"] is None:
                cur["kind"] = s.group("kind")
                cur["name"] = s.group("name")
                continue
            l = LOCATION_RE.match(line)
            if l and cur["loc_kind"] is None:
                cur["loc_kind"] = l.group("kind")
    res = []
    seen = set()
    for e in out:
        if e["kind"] != "variable" or e["loc_kind"] != "class":
            continue
        k = (e["file"], e["line"], e["name"])
        if k in seen:
            continue
        seen.add(k)
        res.append(k)
    return res


def log_path_to_source(path, src_root):
    """Map a path from the javac log onto the source tree we are allowed to edit.

    The log was produced against some other checkout (e.g.
    D:\\...\\fsfinal2\\src\\main\\java\\com\\...).  We re-root it at
    `src_root` so that nothing outside the given tree is ever touched.
    """
    p = path.replace("/", "\\")
    norm = os.path.normcase(os.path.abspath(p))
    root = os.path.normcase(os.path.abspath(src_root))
    if norm.startswith(root + os.sep):
        return os.path.abspath(p)
    # cut the path at the last 'src\\main\\java' (or at the root marker)
    for marker in ("\\src\\main\\java\\", "\\src\\", "\\java\\"):
        idx = norm.rfind(marker)
        if idx >= 0:
            rel = norm[idx + len(marker):]
            return os.path.join(src_root, rel)
    # fall back: keep only the part below the first package directory
    parts = p.split("\\")
    for i, seg in enumerate(parts):
        if seg in ("com", "java", "javax", "org", "net", "io", "sun"):
            return os.path.join(src_root, *parts[i:])
    return os.path.abspath(p)


# ------------------------------------------------------------ source model --

class SourceFile:
    def __init__(self, path, text=None):
        if text is None:
            with open(path, encoding="utf-8", errors="replace") as fh:
                raw = fh.read()
        else:
            raw = text
        self.path = path
        self.has_bom = raw.startswith("\ufeff")
        if self.has_bom:
            raw = raw[1:]
        self.text = raw
        self.newline = "\r\n" if "\r\n" in raw else "\n"
        st = jscope.strip_noncode(raw)
        self.toks = jscope.tokenize(st, raw)
        self.tree = jscope.ScopeTree(raw, self.toks)
        self.decls = jscope.scan_decls(raw, self.toks, self.tree)

    def class_name_of(self, scope):
        ci = self.tree.enclosing(scope, ("classbody",))
        if ci is None:
            return None
        return jscope.class_name_of_scope(self.tree, self.toks, ci)

    def method_of(self, scope):
        return self.tree.method_scope_of(scope)

    def find_token(self, line, name):
        for i, t in enumerate(self.toks):
            if t.line == line and t.kind == "id" and t.text == name:
                return i
        return None

    def find_token_near(self, line, name, window=3):
        best = None
        for delta in range(0, window + 1):
            for cand in (line - delta, line + delta):
                if cand < 1:
                    continue
                idx = self.find_token(cand, name)
                if idx is not None:
                    if best is None or abs(cand - line) < abs(best[1] - line):
                        best = (idx, cand)
            if best is not None:
                return best
        return None

    def line_start_offset(self, line):
        off = 0
        for _ in range(line - 1):
            nxt = self.text.find("\n", off)
            if nxt < 0:
                return len(self.text)
            off = nxt + 1
        return off


# --------------------------------------------------------- type inference --

def _matching_close(toks, a):
    depth = 0
    for k in range(a, len(toks)):
        if toks[k].text == "(":
            depth += 1
        elif toks[k].text == ")":
            depth -= 1
            if depth == 0:
                return k
    return None


def _enclosing_paren(toks, i):
    depth = 0
    for k in range(i, -1, -1):
        t = toks[k].text
        if t == ")":
            depth += 1
        elif t == "(":
            if depth == 0:
                return k
            depth -= 1
    return None


def uses_in_method(sf, method, name):
    out = []
    tree = sf.tree
    for i, t in enumerate(sf.toks):
        if t.kind != "id" or t.text != name:
            continue
        sc = tree.scopes[tree.scope_of_tok[i]]
        if sc.sid != method.sid and not tree.is_contained(method, sc):
            continue
        out.append(i)
    return out


def method_return_type(sf, method):
    """Return type of the method whose body is `method` (None if unknown)."""
    toks = sf.toks
    i = method.open_idx - 1
    if i < 0 or toks[i].text != ")":
        return None
    op = sf.tree._matching_open_paren(i)
    if op is None or op < 2:
        return None
    prev = toks[op - 2]
    if prev.kind != "id":
        return None
    if prev.text in jscope.KEYWORDS and prev.text not in jscope.TYPE_TOKENS:
        return None
    return jtypes._type_before_tokens(toks, op - 1)


def method_locals(sf, method):
    """Types of the locals/params declared in `method`."""
    out = {}
    for d in sf.decls.values():
        for ds in d:
            m = sf.tree.method_scope_of(ds.scope)
            if m is not None and m.sid == method.sid and \
                    ds.kind in ("decl", "param", "catch", "for", "lambda"):
                out.setdefault(ds.name, ds.type_text)
    return out


# --- assignability ------------------------------------------------------

BOX_INV = {v: k for k, v in jtypes.BOX.items()}
NUM_ORDER = ["byte", "short", "char", "int", "long", "float", "double"]


def definitely_assignable(index, frm, to):
    """True = definitely assignable, False = definitely not, None = unknown."""
    if frm is None or to is None:
        return None
    if frm == to:
        return True
    frm = frm.split("<")[0].strip()
    to = to.split("<")[0].strip()
    if not frm or not to:
        return None
    if frm.endswith("[]") or to.endswith("[]"):
        # an array is only assignable to Object/Cloneable/Serializable and to
        # an array of a compatible component type
        if frm.endswith("[]") != to.endswith("[]"):
            return False
        return frm == to
    if frm in jtypes.PRIM and to in jtypes.PRIM:
        if frm in NUM_ORDER and to in NUM_ORDER:
            return NUM_ORDER.index(frm) <= NUM_ORDER.index(to)
        return False
    if frm in jtypes.PRIM and to in jtypes.BOX:
        return jtypes.BOX[frm] == to
    if frm in jtypes.BOX and to in jtypes.PRIM:
        return BOX_INV.get(frm) == to
    if to == "Object":
        return True
    if frm in jtypes.PRIM and to not in jtypes.BOX:
        return False          # primitive -> unrelated reference
    ci = index.lookup(frm)
    seen = 0
    while ci is not None and seen < 16:
        if ci.name == to or ci.fqn == to:
            return True
        ci = index.lookup(ci.superclass) if ci.superclass else None
        seen += 1
    return None               # unknown (interface / missing class)


def collect_constraints(sf, name, method, index, env):
    """Gather type constraints for `name` inside `method`.

    lower : types that must be assignable TO the variable (assignment RHS)
    upper : types the variable must be assignable TO (declarator initialiser)
    exact : the variable's type is exactly this (boolean context)
    weak  : the type Vineflower wrote in the declaration (unreliable)
    """
    lower, upper, exact, weak = [], [], [], []
    toks = sf.toks
    for idx in uses_in_method(sf, method, name):
        nxt = toks[idx + 1].text if idx + 1 < len(toks) else ""
        prev = toks[idx - 1].text if idx > 0 else ""

        # name = expr            -> expr's type must fit the variable
        if nxt == "=":
            j = idx + 1
            depth = 0
            while j < len(toks):
                t = toks[j].text
                if t in ("(", "["):
                    depth += 1
                elif t in (")", "]"):
                    depth -= 1
                elif t == ";" and depth == 0:
                    break
                j += 1
            ty = jtypes.infer_expr(toks, idx + 2, j, env)
            if ty:
                lower.append(ty)
            continue

        # Type other = name;      -> name's type must fit `Type`
        if prev == "=":
            d_idx = idx - 2
            if d_idx >= 0 and toks[d_idx].kind == "id":
                ty = jscope.type_text_before(toks, d_idx, sf.text)
                if ty:
                    upper.append(ty)
            continue

        # boolean contexts
        if prev == "!" or nxt in ("&&", "||"):
            exact.append("boolean")
            continue
        if nxt == "==" and idx + 2 < len(toks) and toks[idx + 2].text in ("true", "false"):
            exact.append("boolean")
            continue
        op = _enclosing_paren(toks, idx)
        if op is not None and op > 0 and toks[op - 1].text in ("if", "while"):
            close = _matching_close(toks, op)
            if close is not None and close == idx + 1:
                exact.append("boolean")
                continue

        # name instanceof T
        if prev == "instanceof" and idx + 1 < len(toks):
            upper.append(toks[idx + 1].text)
            continue

        # return name;
        if prev == "return":
            rt = method_return_type(sf, method)
            if rt:
                upper.append(rt)
            continue

        # name.foo()  -> name's type is a subtype of the class declaring foo
        if idx + 3 < len(toks) and toks[idx + 1].text == "." and \
                toks[idx + 2].kind == "id" and toks[idx + 3].text == "(":
            mname = toks[idx + 2].text
            owners = []
            for lst in index.by_name.values():
                for c in lst:
                    if mname in c.methods:
                        owners.append(c)
            if len(owners) == 1:
                lower.append(owners[0].name)
            continue

        # new T(name)  -> name must fit T
        if prev == "(" or (idx > 0 and toks[idx - 1].text == ","):
            k = idx
            depth = 0
            while k > 0:
                k -= 1
                if toks[k].text == ")":
                    depth += 1
                elif toks[k].text == "(":
                    if depth == 0:
                        break
                    depth -= 1
            if k > 0 and toks[k - 1].text == "new":
                ty = toks[k + 1].text if k + 1 < len(toks) else None
                if ty:
                    upper.append(ty)
            continue
    return lower, upper, exact, weak


TYPE_RE = re.compile(r"^[A-Za-z_$][\w$]*(\.[A-Za-z_$][\w$]*)*(\[\])*$")
GENERIC_TYPE_RE = re.compile(r"^[A-Za-z_$][\w.$]*\s*<[^<>]*>(\[\])*$")


def valid_type(ty):
    """True when `ty` can be written as a Java local variable type."""
    if not ty or ty == "void" or ".." in ty:
        return False
    ty = ty.strip()
    if TYPE_RE.match(ty) or GENERIC_TYPE_RE.match(ty):
        return True
    return False


def choose_type(lower, upper, exact, weak, index):
    """Pick one type consistent with every constraint, or None.

    `lower`/`upper`/`exact` come from how the variable is *used* and are
    trusted.  `weak` is the type Vineflower wrote in the declaration; it is
    only a hint, because the decompiler sometimes reuses one slot for
    different types.  When the hint and the usage evidence disagree the
    repair is skipped unless at least two independent usage constraints
    agree on the same type.
    """
    strong = [c for c in (list(lower) + list(upper) + list(exact))
              if c and c != "var" and c != "void"]
    cands = set(strong) | set(weak)
    cands = {c for c in cands if c and c != "var" and c != "void"}
    if not cands:
        return None, []
    viable = []
    for T in sorted(cands):
        ok = True
        for l in lower:
            if definitely_assignable(index, l, T) is False:
                ok = False
                break
        if ok:
            for u in upper:
                if definitely_assignable(index, T, u) is False:
                    ok = False
                    break
        if ok:
            for e in exact:
                if definitely_assignable(index, e, T) is False:
                    ok = False
                    break
        if ok:
            viable.append(T)
    if not viable:
        return None, sorted(cands)
    support = {}
    for c in strong:
        support[c] = support.get(c, 0) + 1
    best = max(viable, key=lambda T: (support.get(T, 0), T))
    # 1) the type Vineflower declared, when the usage evidence agrees with it
    for w in weak:
        if w in viable and support.get(w, 0) >= 1:
            return w, sorted(cands)
    # 2) otherwise the best supported usage type, but only when at least two
    #    independent usage constraints agree on it
    if support.get(best, 0) >= 2:
        return best, sorted(cands)
    # 3) no declaration to fall back on and a single unambiguous candidate
    if not weak and len(viable) == 1:
        return best, sorted(cands)
    # the declared type disagrees with the usage evidence and the evidence is
    # too weak to override it -- too uncertain to rewrite the declaration
    return None, sorted(cands)


def infer_var_type(sf, name, method, index, weak_types):
    """Infer a single consistent type for `name` inside `method`."""
    cname = sf.class_name_of(method)
    env = jtypes.Env(method_locals(sf, method),
                     index.lookup(cname) if cname else None, cname, index)
    lower, upper, exact, weak = collect_constraints(sf, name, method, index, env)
    weak = list(weak_types)
    return choose_type(lower, upper, exact, weak, index)


# ------------------------------------------------------------- edit making --

def method_insert_point(sf, method):
    """(offset, indent) where a declaration should be inserted in `method`."""
    toks = sf.toks
    off = method.open_tok.end
    # constructor: the explicit super()/this() call must stay first
    cls_sc = method.parent
    is_ctor = False
    cname = jscope.class_name_of_scope(sf.tree, sf.toks, cls_sc)
    if cname and cls_sc is not None and cls_sc.kind == "classbody":
        i = method.open_idx - 1
        if i >= 0 and sf.toks[i].text == ")":
            op = sf.tree._matching_open_paren(i)
            if op is not None and op >= 1 and sf.toks[op - 1].text == cname:
                is_ctor = True
    if is_ctor:
        # the explicit super()/this() call must stay the first statement, so
        # the declaration goes after it.  Vineflower often emits field
        # initialisers before the super() call, so scan the whole body.
        end = method.close_idx if method.close_idx is not None else len(toks)
        k = method.open_idx + 1
        while k < end:
            t = toks[k]
            if (t.kind == "id" and t.text in ("super", "this")
                    and sf.tree.scope_of_tok[k] == method.sid):
                j = k + 1
                if j < end and toks[j].text == "(":
                    close = _matching_close(toks, j)
                    if close is not None:
                        m = close + 1
                        while m < end and toks[m].text != ";":
                            m += 1
                        if m < end:
                            off = toks[m].end
                        break
            k += 1
    # indentation of the first statement inside the method
    indent = None
    k = method.open_idx + 1
    end = method.close_idx if method.close_idx is not None else len(toks)
    while k < end:
        if toks[k].kind == "id" or toks[k].text in ("{", ";"):
            ls = sf.text.rfind("\n", 0, toks[k].start) + 1
            seg = sf.text[ls:toks[k].start]
            if seg.strip() == "":
                indent = seg
            break
        k += 1
    if indent is None:
        ls = sf.text.rfind("\n", 0, method.open_tok.start) + 1
        base = sf.text[ls:method.open_tok.start]
        indent = (base if base.strip() == "" else base) + "   "
    return off, indent


def decl_statement_span(sf, ds):
    """(start, end) offsets of the whole declaration statement."""
    toks = sf.toks
    name_idx = ds.tok_idx
    # walk forward to the ';' at depth 0
    depth = 0
    semi = None
    multi = False
    j = name_idx + 1
    while j < len(toks):
        t = toks[j].text
        if t in ("(", "["):
            depth += 1
        elif t in (")", "]"):
            depth -= 1
        elif t == ";" and depth == 0:
            semi = j
            break
        elif t == "," and depth == 0:
            multi = True
        j += 1
    if semi is None:
        return None, None, multi
    # the statement starts at the type token (skipping `final` / annotations)
    tstart, tend, ttext = jscope.type_span_before(toks, name_idx, sf.text)
    if tstart is None:
        return None, None, multi
    start = tstart
    # include a leading `final` modifier and any annotations
    k = name_idx
    # walk back over the type tokens to find the modifier/annotation start
    ti = name_idx
    while ti > 0 and toks[ti].start > tstart:
        ti -= 1
    while ti > 0 and toks[ti - 1].kind == "id" and \
            toks[ti - 1].text in MODIFIER_WORDS:
        ti -= 1
        start = toks[ti].start
    while ti > 0 and toks[ti - 1].text == "@":
        k2 = ti - 1
        while k2 > 0 and toks[k2 - 1].text not in (";", "{", "}", ")", ","):
            k2 -= 1
        ti = k2
        start = toks[ti].start
    return start, toks[semi].end, multi


def plan_file(sf, errors, index, report):
    """Return (edits, stats) for one source file.

    The repair is driven by the *variable*, not by the line number in the log:
    for every variable the log complains about, every method that uses it
    without declaring it is repaired.  That keeps the tool idempotent -- after
    a repair the declaration is in scope, so a second run finds nothing to do,
    even though the inserted lines shifted every line number.
    """
    edits = []
    stats = collections.Counter()
    by_name = collections.defaultdict(list)
    for (line, name) in errors:
        by_name[name].append(line)

    for name, lines in sorted(by_name.items()):
        report_line = lines[0]
        uses = [i for i, t in enumerate(sf.toks)
                if t.kind == "id" and t.text == name]
        if not uses:
            stats["skip:no-token"] += len(lines)
            report.append((sf.path, report_line, name, "skip", "no-token",
                           "variable not found in the file"))
            continue
        handled = set()
        for idx in uses:
            use_scope = sf.tree.scopes[sf.tree.scope_of_tok[idx]]
            method = sf.method_of(use_scope)
            if method is None:
                continue
            if method.sid in handled:
                continue

            decls = []
            for d in sf.decls.get(name, []):
                m = sf.tree.method_scope_of(d.scope)
                if m is not None and m.sid == method.sid:
                    decls.append(d)

            # this particular use is fine -- but another use in the same
            # method may not be, so keep looking
            if any(sf.tree.is_contained(d.scope, use_scope) for d in decls):
                stats["skip:already-visible"] += 1
                continue
            handled.add(method.sid)

            # the name may be a field of the class rather than a local
            cname = sf.class_name_of(use_scope)
            if cname and index.field_type(cname, name):
                stats["skip:is-a-field"] += 1
                report.append((sf.path, report_line, name, "skip", "is-a-field",
                               "the class declares a field named %s" % name))
                continue

            # a parameter of the same name in the same method would clash
            if any(d.kind == "param" for d in decls):
                stats["skip:param-clash"] += 1
                report.append((sf.path, report_line, name, "skip", "param-clash",
                               "a parameter of the same name exists"))
                continue

            locals_decls = [d for d in decls if d.kind == "decl"]
            other_kinds = [d for d in decls if d.kind != "decl"]
            if other_kinds:
                kinds = sorted(set(d.kind for d in other_kinds))
                stats["skip:%s-decl" % "-".join(kinds)] += 1
                report.append((sf.path, report_line, name, "skip",
                               "%s-decl" % "-".join(kinds),
                               "declaration is a %s variable; hoisting it would "
                               "change the control flow" % "/".join(kinds)))
                continue
            weak = [d.type_text for d in locals_decls]
            ty, cands = infer_var_type(sf, name, method, index, weak)

            if not locals_decls:
                # nothing declared in this method -> synthesise a declaration
                if not ty or not valid_type(ty):
                    stats["skip:type-unknown"] += 1
                    report.append((sf.path, report_line, name, "skip", "type-unknown",
                                   "cannot infer a usable type (candidates: %s)" %
                                   (",".join(cands) if cands else "none")))
                    continue
                off, indent = method_insert_point(sf, method)
                edits.append((off, off, "%s%s%s %s;" % (sf.newline, indent, ty, name)))
                stats["synth"] += 1
                report.append((sf.path, report_line, name, "synth", "type=%s" % ty,
                               "declared the missing variable at method scope"))
                continue

            # a declaration exists -> hoist it (and every sibling declaration)
            if not ty or not valid_type(ty):
                stats["skip:type-unknown"] += 1
                report.append((sf.path, report_line, name, "skip", "type-unknown",
                               "cannot infer a usable type (candidates: %s)" %
                               (",".join(cands) if cands else "none")))
                continue

            off, indent = method_insert_point(sf, method)
            decl_edits = []
            failed = False
            for ds in locals_decls:
                start, end, multi = decl_statement_span(sf, ds)
                if multi:
                    failed = True
                    break
                if start is None:
                    failed = True
                    break
                if ds.has_init:
                    init = sf.text[ds.init_start:ds.init_end].strip()
                    decl_edits.append((start, end, "%s = %s;" % (name, init)))
                else:
                    ls = sf.text.rfind("\n", 0, start) + 1
                    nxt = sf.text.find("\n", end)
                    if nxt < 0:
                        nxt = len(sf.text)
                    if sf.text[ls:start].strip() == "":
                        decl_edits.append((ls, nxt + 1, ""))   # drop the whole line
                    else:
                        decl_edits.append((start, end, ""))
            if failed:
                stats["skip:multi-declarator"] += 1
                report.append((sf.path, report_line, name, "skip", "multi-declarator",
                               "declaration shares a statement with others"))
                continue
            edits.append((off, off, "%s%s%s %s;" % (sf.newline, indent, ty, name)))
            edits.extend(decl_edits)
            stats["hoist"] += 1
            report.append((sf.path, report_line, name, "hoist",
                           "decl@%s type=%s" %
                           (",".join(str(d.line) for d in locals_decls), ty),
                           "moved %d declaration(s) to the method scope" %
                           len(locals_decls)))
    return edits, stats


def apply_edits(text, edits):
    """Apply (start, end, replacement) edits; returns new text."""
    edits = sorted(edits, key=lambda e: (e[0], e[1]))
    out = []
    pos = 0
    for start, end, repl in edits:
        if start < pos:
            # overlapping edit -- skip the later one
            continue
        out.append(text[pos:start])
        out.append(repl)
        pos = end
    out.append(text[pos:])
    return "".join(out)


def sanity_check(sf, new_text, edits):
    """Cheap structural check: the edit must not change the brace balance and
    the statement count must move exactly as the edits predict."""
    st = jscope.strip_noncode(new_text)
    toks = jscope.tokenize(st, new_text)
    bo = sum(1 for t in sf.toks if t.text == "{")
    bc = sum(1 for t in sf.toks if t.text == "}")
    no = sum(1 for t in toks if t.text == "{")
    nc = sum(1 for t in toks if t.text == "}")
    if (bo, bc) != (no, nc):
        return False, "brace balance changed: %d/%d -> %d/%d" % (bo, bc, no, nc)
    # each insertion adds one statement, each dropped declaration removes one
    ins = sum(1 for s, e, r in edits if s == e and r.strip())
    rem = sum(1 for s, e, r in edits if r == "" and e > s)
    so = sum(1 for t in sf.toks if t.text == ";")
    sn = sum(1 for t in toks if t.text == ";")
    if sn - so != ins - rem:
        return False, ("statement count moved by %d, expected %d"
                       % (sn - so, ins - rem))
    return True, ""


# ------------------------------------------------------------------- main --

def main():
    ap = argparse.ArgumentParser(description=__doc__,
                                 formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("src_root")
    ap.add_argument("javac_log")
    ap.add_argument("--dry-run", action="store_true")
    ap.add_argument("--report", default=None)
    ap.add_argument("--index-cache", default=None)
    args = ap.parse_args()

    errors = parse_log(args.javac_log)
    print("variable-scope errors in log: %d" % len(errors))

    cache = args.index_cache
    if cache is None:
        cache = os.path.join(os.path.dirname(os.path.abspath(__file__)),
                             "classindex.pkl")
    print("building class index ...", flush=True)
    index = jtypes.ClassIndex.build(args.src_root, cache, verbose=True)

    byfile = collections.defaultdict(list)
    for f, ln, nm in errors:
        target = log_path_to_source(f, args.src_root)
        byfile[os.path.normcase(os.path.abspath(target))].append((ln, nm))
    missing = sum(1 for p in byfile if not os.path.exists(p))
    if missing:
        print("warning: %d files from the log are not present under %s"
              % (missing, args.src_root))

    report = []
    totals = collections.Counter()
    files_changed = 0
    for path, items in sorted(byfile.items()):
        if not os.path.exists(path):
            totals["file-missing"] += len(items)
            continue
        try:
            sf = SourceFile(path)
        except Exception as e:
            totals["file-error"] += len(items)
            report.append((path, 0, "", "skip", "file-error", repr(e)))
            continue
        original = sf.text
        last_stats = collections.Counter()
        # Repairing one variable can make the next one repairable (a type that
        # was unknown becomes known), so iterate until the file stops changing.
        # That also makes the tool idempotent: a second run finds nothing left.
        for _pass in range(MAX_PASSES):
            pass_report = []
            edits, stats = plan_file(sf, items, index, pass_report)
            last_stats = stats
            if not edits:
                report.extend(pass_report)
                break
            new_text = apply_edits(sf.text, edits)
            if new_text == sf.text:
                report.extend(pass_report)
                break
            ok, why = sanity_check(sf, new_text, edits)
            if not ok:
                totals["file-rejected"] += 1
                report.append((path, 0, "", "skip", "sanity-check",
                               "edit rejected: %s" % why))
                break
            report = [r for r in report if r[0] != path]
            report.extend(pass_report)
            sf = SourceFile(path, text=new_text)
        else:
            totals["max-passes-reached"] += 1
        totals.update(last_stats)
        if sf.text != original:
            files_changed += 1
            if not args.dry_run:
                with open(path, "w", encoding="utf-8", newline="") as fh:
                    fh.write(sf.text)

    print()
    print("files changed: %d" % files_changed)
    for k, v in totals.most_common():
        print("%8d  %s" % (v, k))
    fixed = sum(1 for r in report if r[3] in ("hoist", "synth"))
    hoisted = sum(1 for r in report if r[3] == "hoist")
    synthed = sum(1 for r in report if r[3] == "synth")
    print()
    print("variables repaired: %d (hoisted %d, synthesised %d)"
          % (fixed, hoisted, synthed))
    print("variables left alone: %d" % (len(report) - fixed))

    if args.report:
        with open(args.report, "w", encoding="utf-8", newline="") as fh:
            fh.write("file\tline\tvar\taction\tdetail\treason\n")
            for r in report:
                fh.write("%s\t%s\t%s\t%s\t%s\t%s\n" % r)
        print("report written -> %s" % args.report)


if __name__ == "__main__":
    main()
