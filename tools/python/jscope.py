#!/usr/bin/env python
"""Java-ish lexical/scope analysis for Vineflower-decompiled sources.

Heuristic, but aimed at the shapes Vineflower emits:
  * brace-derived scope tree, with method / class-body / block classification
  * declaration sites for locals, catch params, for-vars, lambda params, method params
  * "is this declaration in scope at this point" reasoning
"""
import re

ID_RE = re.compile(r"[A-Za-z_$][A-Za-z0-9_$]*")
NUM_RE = re.compile(r"[0-9]+(?:\.[0-9]+)?[lLfFdD]?")

OPS = [
    ">>>=", "<<=", ">>=", ">>>", "...", "->", "::",
    "==", "!=", "<=", ">=", "&&", "||", "++", "--",
    "+=", "-=", "*=", "/=", "&=", "|=", "^=", "%=", "<<",
    "+", "-", "*", "/", "%", "=", "<", ">", "!", "~", "?", ":",
    "&", "|", "^", "(", ")", "[", "]", "{", "}", ";", ",", ".", "@",
]
OP_BY_FIRST = {}
for _op in OPS:
    OP_BY_FIRST.setdefault(_op[0], []).append(_op)
for _k in OP_BY_FIRST:
    OP_BY_FIRST[_k].sort(key=len, reverse=True)

KEYWORDS = {
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native", "new",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "void", "volatile", "while", "true", "false", "null",
    "yield", "record", "sealed", "permits", "non-sealed",
}
PRIMITIVES = {"boolean", "byte", "char", "short", "int", "long", "float", "double", "void"}
TYPE_TOKENS = PRIMITIVES | {"var"}
MODIFIERS = {
    "public", "protected", "private", "static", "final", "abstract", "native",
    "synchronized", "transient", "volatile", "strictfp", "default", "sealed",
}
CLASS_KEYWORDS = {"class", "interface", "enum", "record"}
# tokens that can never be the type of a method/constructor name
BAD_PREV = {
    "new", "return", "case", "throw", "else", "yield", "instanceof", "this",
    "super", "null", "true", "false", "assert", "break", "continue", "do",
    "while", "if", "for", "switch", "synchronized", "implements", "extends",
    "throws", "catch", "try", "finally", "class", "interface", "enum",
    "record", "const", "goto", "import", "package",
}


def strip_noncode(text):
    """Replace comments and string/char literals with spaces (keep offsets)."""
    out = list(text)
    i = 0
    n = len(text)
    while i < n:
        c = text[i]
        if c == "/" and i + 1 < n and text[i + 1] == "/":
            j = text.find("\n", i)
            if j == -1:
                j = n
            for k in range(i, j):
                out[k] = " "
            i = j
        elif c == "/" and i + 1 < n and text[i + 1] == "*":
            j = text.find("*/", i + 2)
            j = n if j == -1 else j + 2
            for k in range(i, j):
                if out[k] != "\n":
                    out[k] = " "
            i = j
        elif c == '"':
            j = i + 1
            while j < n:
                if text[j] == "\\":
                    j += 2
                    continue
                if text[j] == '"':
                    j += 1
                    break
                j += 1
            for k in range(i, min(j, n)):
                if out[k] != "\n":
                    out[k] = " "
            i = j
        elif c == "'":
            j = i + 1
            while j < n:
                if text[j] == "\\":
                    j += 2
                    continue
                if text[j] == "'":
                    j += 1
                    break
                j += 1
            for k in range(i, min(j, n)):
                if out[k] != "\n":
                    out[k] = " "
            i = j
        else:
            i += 1
    return "".join(out)


class Tok:
    __slots__ = ("kind", "text", "start", "end", "line")

    def __init__(self, kind, text, start, end, line):
        self.kind = kind
        self.text = text
        self.start = start
        self.end = end
        self.line = line

    def __repr__(self):
        return "Tok(%s,%r,L%d)" % (self.kind, self.text, self.line)


def tokenize(stripped, text):
    toks = []
    i = 0
    n = len(stripped)
    line_starts = [0]
    for idx, ch in enumerate(text):
        if ch == "\n":
            line_starts.append(idx + 1)

    def line_of(pos):
        lo, hi = 0, len(line_starts) - 1
        while lo < hi:
            mid = (lo + hi + 1) // 2
            if line_starts[mid] <= pos:
                lo = mid
            else:
                hi = mid - 1
        return lo + 1

    while i < n:
        ch = stripped[i]
        if ch in " \t\r\n\f":
            i += 1
            continue
        if ch.isalpha() or ch in "_$":
            m = ID_RE.match(stripped, i)
            toks.append(Tok("id", m.group(0), i, m.end(), line_of(i)))
            i = m.end()
            continue
        if ch.isdigit():
            m = NUM_RE.match(stripped, i)
            toks.append(Tok("num", m.group(0), i, m.end(), line_of(i)))
            i = m.end()
            continue
        matched = False
        for op in OP_BY_FIRST.get(ch, ()):
            if stripped.startswith(op, i):
                toks.append(Tok("op", op, i, i + len(op), line_of(i)))
                i += len(op)
                matched = True
                break
        if not matched:
            toks.append(Tok("op", ch, i, i + 1, line_of(i)))
            i += 1
    return toks


class Scope:
    __slots__ = ("sid", "parent", "children", "kind", "open_idx", "close_idx",
                 "start", "end", "open_tok", "close_tok")

    def __init__(self, sid, parent, kind, open_idx, open_tok):
        self.sid = sid
        self.parent = parent
        self.children = []
        self.kind = kind
        self.open_idx = open_idx
        self.close_idx = None
        self.open_tok = open_tok
        self.close_tok = None
        self.start = open_tok.start if open_tok is not None else 0
        self.end = None

    def path(self):
        out = []
        s = self
        while s is not None:
            out.append(s.sid)
            s = s.parent
        out.reverse()
        return tuple(out)

    def depth(self):
        return len(self.path()) - 1

    def __repr__(self):
        return "Scope(%d,%s,%s)" % (self.sid, self.kind, self.path())


def class_name_of_scope(tree, toks, sc):
    """The name of the class whose body is `sc`.

    The token right before '{' is the *superclass* when the declaration has an
    `extends` clause, so the name has to be looked up from the class keyword.
    """
    if sc is None or sc.open_idx is None:
        return None
    j = sc.open_idx - 2
    while j >= 0:
        t = toks[j]
        if t.text in (";", "{", "}", "(", ")"):
            break
        if t.kind == "id" and t.text in CLASS_KEYWORDS:
            k = j + 1
            while k < sc.open_idx and toks[k].kind != "id":
                k += 1
            if k < sc.open_idx:
                return toks[k].text
            return None
        j -= 1
    return None


class ScopeTree:
    def __init__(self, text, toks):
        self.text = text
        self.toks = toks
        self.scopes = []
        self.scope_of_tok = []
        self.scope_by_open_idx = {}
        self._build()
        self._classify()

    def _build(self):
        root = Scope(0, None, "file", None, None)
        self.scopes.append(root)
        stack = [root]
        for idx, t in enumerate(self.toks):
            if t.text == "{":
                self.scope_of_tok.append(stack[-1].sid)
                sc = Scope(len(self.scopes), stack[-1], "block", idx, t)
                self.scopes.append(sc)
                self.scope_by_open_idx[idx] = sc
                stack[-1].children.append(sc)
                stack.append(sc)
            elif t.text == "}":
                self.scope_of_tok.append(stack[-1].sid)
                stack[-1].close_idx = idx
                stack[-1].close_tok = t
                stack[-1].end = t.start
                if len(stack) > 1:
                    stack.pop()
            else:
                self.scope_of_tok.append(stack[-1].sid)
        for sc in self.scopes:
            if sc.end is None:
                sc.end = len(self.text)

    # -- statement-start scanning ---------------------------------------
    def _stmt_start_idx(self, tok_idx):
        """Index of the token that starts the statement containing tok_idx."""
        j = tok_idx - 1
        while j >= 0:
            if self.toks[j].text in (";", "{", "}"):
                return j + 1
            j -= 1
        return 0

    def _matching_open_paren(self, close_idx):
        depth = 0
        for j in range(close_idx, -1, -1):
            t = self.toks[j].text
            if t == ")":
                depth += 1
            elif t == "(":
                depth -= 1
                if depth == 0:
                    return j
        return None

    def _looks_like_method(self, sc):
        toks = self.toks
        i = sc.open_idx - 1
        if i < 0:
            return False
        # skip a `throws A, B` clause
        if toks[i].kind == "id" and i >= 1 and toks[i - 1].text == "throws":
            j = i - 1
            while j >= 0 and toks[j].text != ")":
                j -= 1
            if j < 0:
                return False
            i = j
        if toks[i].text != ")":
            return False
        op = self._matching_open_paren(i)
        if op is None or op == 0:
            return False
        name_tok = toks[op - 1]
        if name_tok.kind != "id" or name_tok.text in KEYWORDS:
            return False
        if op - 2 < 0:
            return False
        prev = toks[op - 2]
        if prev.kind == "id" and prev.text not in BAD_PREV:
            return True
        if prev.text in (">", "]"):
            return True
        return False

    def _looks_like_class(self, sc):
        """Class/interface/enum body: the name before `{` is introduced by a class keyword."""
        toks = self.toks
        if sc.open_idx < 1:
            return False
        name_tok = toks[sc.open_idx - 1]
        if name_tok.kind != "id" or name_tok.text in KEYWORDS:
            return False
        j = sc.open_idx - 2
        found = False
        while j >= 0:
            t = toks[j]
            if t.text in (";", "{", "}", "(", ")"):
                break
            if t.kind == "id" and t.text in CLASS_KEYWORDS:
                found = True
                break
            j -= 1
        if not found:
            return False
        # a '(' between the class keyword and the name means this is a method
        # inside a (local) class, not the class body itself
        for k in range(j + 1, sc.open_idx - 1):
            if toks[k].text == "(":
                return False
        return True

    def _looks_like_init(self, sc):
        toks = self.toks
        i = sc.open_idx - 1
        if i >= 0 and toks[i].text == "static":
            return True
        return False

    def _classify(self):
        for sc in self.scopes:
            if sc.open_idx is None:
                continue
            if self._looks_like_class(sc):
                sc.kind = "classbody"
            elif self._looks_like_method(sc):
                sc.kind = "method"
            elif self._looks_like_init(sc):
                sc.kind = "init"
            else:
                sc.kind = self._block_kind(sc)

    def _block_kind(self, sc):
        """Which construct introduced this block?"""
        toks = self.toks
        i = sc.open_idx - 1
        if i < 0:
            return "block"
        t = toks[i].text
        if t == ")":
            op = self._matching_open_paren(i)
            if op is not None and op > 0:
                head = toks[op - 1].text
                if head == "if":
                    return "if"
                if head == "for":
                    return "for"
                if head == "while":
                    return "while"
                if head == "switch":
                    return "switch"
                if head == "catch":
                    return "catch"
                if head == "synchronized":
                    return "synchronized"
            return "block"
        if t in ("else", "try", "finally", "do", "case", "default"):
            return t
        if t == ":":
            return "labeled"
        if toks[i].kind == "id" and t in ("try", "finally"):
            return t
        return "block"

    # -- lookups --------------------------------------------------------
    def scope_at_offset(self, off):
        best = self.scopes[0]
        for sc in self.scopes:
            if sc.start <= off and (sc.end is None or off <= sc.end):
                if sc.depth() >= best.depth():
                    best = sc
        return best

    def scope_of_tok_index(self, idx):
        return self.scopes[self.scope_of_tok[idx]]

    def enclosing(self, sc, kinds):
        s = sc
        while s is not None:
            if s.kind in kinds:
                return s
            s = s.parent
        return None

    def method_scope_of(self, sc):
        return self.enclosing(sc, ("method", "init"))

    def is_contained(self, outer, inner):
        if outer.sid == inner.sid:
            return False
        op, ip = outer.path(), inner.path()
        return ip[:len(op)] == op


# ------------------------------------------------------- declaration scan ---

class DeclSite:
    __slots__ = ("name", "type_text", "kind", "tok_idx", "scope", "line",
                 "start", "end", "has_init", "init_start", "init_end",
                 "stmt_start", "stmt_end", "raw", "block_scope")

    def __init__(self):
        self.kind = "decl"
        self.has_init = False
        self.init_start = None
        self.init_end = None
        self.stmt_start = None
        self.stmt_end = None
        self.block_scope = None

    def __repr__(self):
        return "Decl(%s:%s:%s@L%d)" % (self.name, self.type_text, self.kind, self.line)


def _matching_paren(toks, open_idx):
    depth = 0
    for j in range(open_idx, len(toks)):
        if toks[j].text == "(":
            depth += 1
        elif toks[j].text == ")":
            depth -= 1
            if depth == 0:
                return j
    return None


def type_span_before(toks, name_idx, text):
    """(start_offset, end_offset, type_text) of the type before toks[name_idx]."""
    i = name_idx - 1
    if i < 0:
        return None, None, None
    while i >= 1 and toks[i].text == "]" and toks[i - 1].text == "[":
        i -= 2
    if i >= 0 and toks[i].text == ">":
        depth = 0
        j = i
        while j >= 0:
            if toks[j].text == ">":
                depth += 1
            elif toks[j].text == "<":
                depth -= 1
                if depth == 0:
                    break
            j -= 1
        if j < 0:
            return None, None, None
        i = j - 1
    if i < 0:
        return None, None, None
    tk = toks[i]
    if tk.kind != "id":
        return None, None, None
    if tk.text in KEYWORDS and tk.text not in TYPE_TOKENS:
        return None, None, None
    # a qualified type name (com.foo.Bar) -- the '.' tokens belong to the type
    start = tk.start
    j = i
    while j >= 2 and toks[j - 1].text == "." and toks[j - 2].kind == "id":
        start = toks[j - 2].start
        j -= 2
    end = toks[name_idx].start
    return start, end, text[start:end].strip()


def type_text_before(toks, name_idx, text):
    """Reconstruct the declared type of the declarator named by toks[name_idx]."""
    _, _, ty = type_span_before(toks, name_idx, text)
    return ty


def find_param_ranges(toks, tree):
    """Token-index ranges for for-headers, catch clauses, lambda params, method params."""
    for_headers = []
    catch_params = []
    lambda_params = []
    method_params = []

    def block_after(idx):
        """Scope of the block that starts right after token idx, if any."""
        k = idx
        while k < len(toks) and toks[k].text != "{":
            if toks[k].text == ";":
                return None
            k += 1
        if k >= len(toks):
            return None
        return tree.scope_by_open_idx.get(k)

    for i, t in enumerate(toks):
        if t.kind == "id" and t.text == "for":
            j = i + 1
            while j < len(toks) and toks[j].text != "(":
                if toks[j].text == ";":
                    break
                j += 1
            if j < len(toks) and toks[j].text == "(":
                close = _matching_paren(toks, j)
                if close is not None:
                    for_headers.append((j, close, block_after(close)))
        elif t.kind == "id" and t.text == "catch":
            j = i + 1
            while j < len(toks) and toks[j].text != "(":
                if toks[j].text in (";", "{"):
                    break
                j += 1
            if j < len(toks) and toks[j].text == "(":
                close = _matching_paren(toks, j)
                if close is not None:
                    catch_params.append((j, close, block_after(close)))
        elif t.text == "->":
            depth = 0
            j = i - 1
            found = None
            while j >= 0:
                if toks[j].text == ")":
                    depth += 1
                elif toks[j].text == "(":
                    if depth == 0:
                        found = j
                        break
                    depth -= 1
                j -= 1
            if found is not None:
                lambda_params.append((found, i - 1, block_after(i)))

    # method parameter lists: scopes classified as "method"
    for sc in tree.scopes:
        if sc.kind != "method":
            continue
        i = sc.open_idx - 1
        if i < 0 or toks[i].text != ")":
            continue
        op = tree._matching_open_paren(i)
        if op is not None:
            method_params.append((op, i, sc))
    return {"for": for_headers, "catch": catch_params,
            "lambda": lambda_params, "method": method_params}


def scan_decls(text, toks, tree, want_names=None):
    """Find local variable declarations. Returns dict name -> [DeclSite]."""
    ranges = find_param_ranges(toks, tree)
    decls = {}

    def kind_for(idx):
        for a, b, blk in ranges["method"]:
            if a < idx < b:
                return "param", blk
        for a, b, blk in ranges["catch"]:
            if a < idx < b:
                return "catch", blk
        for a, b, blk in ranges["lambda"]:
            if a < idx < b:
                return "lambda", blk
        for a, b, blk in ranges["for"]:
            if a < idx < b:
                return "for", blk
        return "decl", None

    for idx, t in enumerate(toks):
        if t.kind != "id" or t.text in KEYWORDS:
            continue
        if want_names is not None and t.text not in want_names:
            continue
        if idx == 0:
            continue
        prev = toks[idx - 1]
        if prev.text == ".":
            continue
        # the token before the name is the type: an identifier, or the ']' of
        # an array type, or the '>' of a generic type
        if prev.kind != "id" and prev.text not in ("]", ">"):
            continue
        if prev.kind == "id" and prev.text in KEYWORDS and prev.text not in TYPE_TOKENS:
            continue
        if prev.text in ("return", "new", "case", "throw", "assert", "else",
                         "yield", "instanceof", "this", "super", "null",
                         "true", "false", "break", "continue", "do", "while",
                         "if", "for", "switch", "synchronized", "implements"):
            continue
        nxt = toks[idx + 1].text if idx + 1 < len(toks) else ""
        if nxt not in ("=", ";", ",", ")", "[", ":"):
            continue

        if prev.text == "var":
            typ = "var"
        else:
            typ = type_text_before(toks, idx, text)
            if not typ:
                continue

        kind, blk = kind_for(idx)
        ds = DeclSite()
        ds.name = t.text
        ds.type_text = typ
        ds.kind = kind
        ds.tok_idx = idx
        ds.line = t.line
        ds.start = prev.start
        ds.end = t.end
        ds.scope = tree.scopes[tree.scope_of_tok[idx]]
        ds.block_scope = blk
        # a declaration is visible in the block it introduces, not in the
        # enclosing block (catch params, for vars, lambda params)
        if kind in ("param", "catch") and blk is not None:
            ds.scope = blk
        elif kind in ("for", "lambda") and blk is not None:
            ds.scope = blk
        ds.raw = text[ds.start:ds.end]

        # statement bounds
        j = idx - 1
        st_start = prev.start
        while j >= 0:
            if toks[j].text in (";", "{", "}"):
                st_start = toks[j].end
                break
            j -= 1
        st_end = t.end
        depth = 0
        j = idx + 1
        while j < len(toks):
            tk = toks[j]
            if tk.text in ("(", "["):
                depth += 1
            elif tk.text in (")", "]"):
                depth -= 1
            elif tk.text == ";" and depth == 0:
                st_end = tk.start
                break
            j += 1
        ds.stmt_start = st_start
        ds.stmt_end = st_end

        if nxt == "=":
            k = idx + 1
            depth = 0
            while k < len(toks):
                tk = toks[k]
                if tk.text in ("(", "["):
                    depth += 1
                elif tk.text in (")", "]"):
                    depth -= 1
                elif tk.text == ";" and depth == 0:
                    ds.has_init = True
                    # the initializer starts after the '=' sign
                    ds.init_start = toks[idx + 1].end
                    ds.init_end = tk.start
                    break
                k += 1
        decls.setdefault(t.text, []).append(ds)
    return decls
