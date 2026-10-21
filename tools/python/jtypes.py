#!/usr/bin/env python
"""Source-based type inference for the decompiled tree.

Builds an index of every class's fields / methods / superclass from the .java
sources, then types expressions from that index. Everything is best-effort:
an unknown type is reported as None rather than guessed.
"""
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import jscope

PRIM = {"boolean", "byte", "char", "short", "int", "long", "float", "double"}
NUMERIC = {"byte", "short", "int", "long", "float", "double", "char"}
BOX = {
    "boolean": "Boolean", "byte": "Byte", "char": "Character", "short": "Short",
    "int": "Integer", "long": "Long", "float": "Float", "double": "Double",
    "void": "Void", "String": "String",
}
LITERAL_INT = re.compile(r"^[0-9]+$")
LITERAL_LONG = re.compile(r"^[0-9]+[lL]$")
LITERAL_FLOAT = re.compile(r"^[0-9]*\.[0-9]+[fF]$")
LITERAL_DOUBLE = re.compile(r"^[0-9]*\.[0-9]+$")
LITERAL_HEX = re.compile(r"^0[xX][0-9a-fA-F]+[lL]?$")

# Minimal JDK knowledge: enough for the common cases in this tree.
BUILTIN_METHODS = {
    "String": {
        "length": "int", "trim": "String", "strip": "String",
        "substring": "String", "toLowerCase": "String", "toUpperCase": "String",
        "charAt": "char", "indexOf": "int", "lastIndexOf": "int",
        "split": "String[]", "equals": "boolean", "equalsIgnoreCase": "boolean",
        "isEmpty": "boolean", "isBlank": "boolean", "toString": "String",
        "getBytes": "byte[]", "concat": "String", "replace": "String",
        "replaceAll": "String", "replaceFirst": "String", "hashCode": "int",
        "compareTo": "int", "compareToIgnoreCase": "int", "contains": "boolean",
        "startsWith": "boolean", "endsWith": "boolean", "valueOf": "String",
        "format": "String", "join": "String", "repeat": "String",
        "chars": "IntStream", "codePointAt": "int", "matches": "boolean",
        "intern": "String", "toCharArray": "char[]", "getBytes$": "byte[]",
    },
    "StringBuilder": {
        "append": "StringBuilder", "toString": "String", "length": "int",
        "insert": "StringBuilder", "reverse": "StringBuilder",
        "deleteCharAt": "StringBuilder", "charAt": "char", "setLength": "void",
        "delete": "StringBuilder", "replace": "StringBuilder",
    },
    "StringBuffer": {
        "append": "StringBuffer", "toString": "String", "length": "int",
        "insert": "StringBuffer", "reverse": "StringBuffer", "charAt": "char",
    },
    "Object": {
        "toString": "String", "hashCode": "int", "equals": "boolean",
        "getClass": "Class", "clone": "Object",
    },
    "Integer": {
        "intValue": "int", "longValue": "long", "doubleValue": "double",
        "floatValue": "float", "shortValue": "short", "byteValue": "byte",
        "toString": "String", "compareTo": "int", "compare": "int",
        "parseInt": "int", "valueOf": "Integer", "hashCode": "int",
        "equals": "boolean", "toHexString": "String", "bitCount": "int",
        "signum": "int", "max": "int", "min": "int", "sum": "int",
    },
    "Long": {
        "longValue": "long", "intValue": "int", "doubleValue": "double",
        "toString": "String", "parseLong": "long", "valueOf": "Long",
        "compareTo": "int", "hashCode": "int", "equals": "boolean",
        "MAX_VALUE": "long", "MIN_VALUE": "long", "sum": "long",
    },
    "Double": {
        "doubleValue": "double", "intValue": "int", "longValue": "long",
        "toString": "String", "parseDouble": "double", "valueOf": "Double",
        "compareTo": "int", "hashCode": "int", "equals": "boolean",
    },
    "Float": {
        "floatValue": "float", "intValue": "int", "doubleValue": "double",
        "toString": "String", "parseFloat": "float", "valueOf": "Float",
    },
    "Short": {"shortValue": "short", "intValue": "int", "toString": "String"},
    "Byte": {"byteValue": "byte", "intValue": "int", "toString": "String"},
    "Character": {
        "charValue": "char", "toString": "String", "isDigit": "boolean",
        "isLetter": "boolean", "isWhitespace": "boolean", "toUpperCase": "char",
        "toLowerCase": "char", "getNumericValue": "int", "compareTo": "int",
    },
    "Boolean": {"booleanValue": "boolean", "toString": "String",
                "parseBoolean": "boolean", "valueOf": "Boolean"},
    "List": {
        "size": "int", "isEmpty": "boolean", "contains": "boolean",
        "add": "boolean", "remove": "boolean", "clear": "void",
        "toString": "String", "hashCode": "int", "iterator": "Iterator",
        "get": "Object", "indexOf": "int", "set": "Object",
        "addAll": "boolean", "removeAll": "boolean", "retainAll": "boolean",
        "containsAll": "boolean", "subList": "List", "equals": "boolean",
    },
    "ArrayList": {
        "size": "int", "isEmpty": "boolean", "contains": "boolean",
        "add": "boolean", "remove": "boolean", "clear": "void",
        "toString": "String", "hashCode": "int", "iterator": "Iterator",
        "get": "Object", "indexOf": "int", "set": "Object",
        "addAll": "boolean", "removeAll": "boolean", "retainAll": "boolean",
        "containsAll": "boolean", "subList": "List", "equals": "boolean",
        "get$int": "int",
    },
    "Map": {
        "size": "int", "isEmpty": "boolean", "containsKey": "boolean",
        "containsValue": "boolean", "get": "Object", "put": "Object",
        "remove": "Object", "clear": "void", "keySet": "Set",
        "values": "Collection", "entrySet": "Set", "toString": "String",
        "hashCode": "int", "getOrDefault": "Object", "putAll": "void",
    },
    "HashMap": {
        "size": "int", "isEmpty": "boolean", "containsKey": "boolean",
        "containsValue": "boolean", "get": "Object", "put": "Object",
        "remove": "Object", "clear": "void", "keySet": "Set",
        "values": "Collection", "entrySet": "Set", "toString": "String",
        "getOrDefault": "Object", "putAll": "void",
    },
    "Set": {
        "size": "int", "isEmpty": "boolean", "contains": "boolean",
        "add": "boolean", "remove": "boolean", "clear": "void",
        "toString": "String", "iterator": "Iterator", "hashCode": "int",
        "addAll": "boolean", "equals": "boolean",
    },
    "HashSet": {
        "size": "int", "isEmpty": "boolean", "contains": "boolean",
        "add": "boolean", "remove": "boolean", "clear": "void",
        "toString": "String", "iterator": "Iterator", "addAll": "boolean",
    },
    "Collection": {
        "size": "int", "isEmpty": "boolean", "contains": "boolean",
        "add": "boolean", "remove": "boolean", "clear": "void",
        "toString": "String", "iterator": "Iterator", "addAll": "boolean",
    },
    "Iterator": {"hasNext": "boolean", "next": "Object", "remove": "void"},
    "Entry": {"getKey": "Object", "getValue": "Object", "setValue": "Object"},
    "Map$Entry": {"getKey": "Object", "getValue": "Object", "setValue": "Object"},
    "Class": {"getName": "String", "getSimpleName": "String",
              "toString": "String"},
    "Throwable": {"getMessage": "String", "getCause": "Throwable",
                  "printStackTrace": "void", "toString": "String",
                  "getStackTrace": "StackTraceElement[]"},
    "Exception": {"getMessage": "String", "getCause": "Throwable",
                  "printStackTrace": "void", "toString": "String"},
    "RuntimeException": {"getMessage": "String", "getCause": "Throwable",
                         "printStackTrace": "void", "toString": "String"},
    "Thread": {"sleep": "void", "currentThread": "Thread",
               "getName": "String", "start": "void", "join": "void",
               "setName": "void", "isAlive": "boolean", "interrupt": "void"},
    "Math": {"abs": "double", "max": "double", "min": "double", "round": "long",
             "floor": "double", "ceil": "double", "sqrt": "double",
             "pow": "double", "random": "double", "log": "double",
             "sin": "double", "cos": "double", "tan": "double",
             "atan2": "double", "exp": "double", "hypot": "double",
             "toIntExact": "int", "floorDiv": "int", "floorMod": "int",
             "addExact": "int", "subtractExact": "int", "multiplyExact": "int",
             "rint": "double", "signum": "double"},
    "System": {"currentTimeMillis": "long", "nanoTime": "long",
               "getProperty": "String", "exit": "void", "arraycopy": "void",
               "getenv": "String", "lineSeparator": "String"},
    "Integer$Type": {"parseInt": "int"},
}

BUILTIN_FIELDS = {
    "Integer": {"MAX_VALUE": "int", "MIN_VALUE": "int", "TYPE": "Class"},
    "Long": {"MAX_VALUE": "long", "MIN_VALUE": "long", "TYPE": "Class"},
    "Double": {"MAX_VALUE": "double", "MIN_VALUE": "double", "TYPE": "Class"},
    "Float": {"MAX_VALUE": "float", "MIN_VALUE": "float", "TYPE": "Class"},
    "System": {"out": "PrintStream", "err": "PrintStream", "in": "InputStream"},
    "Math": {"PI": "double", "E": "double"},
    "Boolean": {"TRUE": "Boolean", "FALSE": "Boolean", "TYPE": "Class"},
}



class ClassInfo:
    __slots__ = ("name", "fqn", "fields", "methods", "superclass",
                 "is_interface", "kind")

    def __init__(self, name, fqn, kind="class"):
        self.name = name
        self.fqn = fqn
        self.fields = {}      # name -> type
        self.methods = {}     # name -> return type
        self.superclass = None
        self.is_interface = kind in ("interface", "annotation")
        self.kind = kind

    def __repr__(self):
        return "ClassInfo(%s)" % self.fqn


class ClassIndex:
    def __init__(self):
        self.by_fqn = {}
        self.by_name = {}
        self._build = {}

    # -- construction ----------------------------------------------------
    @staticmethod
    def build(root, cache_path=None, verbose=False):
        """Build an index over every .java under root, optionally cached."""
        import pickle
        if cache_path and os.path.exists(cache_path):
            try:
                with open(cache_path, "rb") as fh:
                    idx = pickle.load(fh)
                if verbose:
                    print("loaded cached index: %d classes" % len(idx.by_fqn))
                return idx
            except Exception:
                pass
        idx = ClassIndex()
        files = []
        for dp, dn, fns in os.walk(root):
            for fn in fns:
                if fn.endswith(".java"):
                    files.append(os.path.join(dp, fn))
        for f in files:
            try:
                idx.add_file(f)
            except Exception:
                pass
        if verbose:
            print("indexed %d classes" % len(idx.by_fqn))
        if cache_path:
            try:
                with open(cache_path, "wb") as fh:
                    pickle.dump(idx, fh, protocol=4)
            except Exception:
                pass
        return idx

    def add_file(self, path):
        with open(path, encoding="utf-8", errors="replace") as fh:
            raw = fh.read()
        if raw.startswith("\ufeff"):
            raw = raw[1:]
        stripped = jscope.strip_noncode(raw)
        toks = jscope.tokenize(stripped, raw)
        tree = jscope.ScopeTree(raw, toks)

        pkg = ""
        for t in toks[:40]:
            if t.kind == "id" and t.text == "package":
                j = toks.index(t)
                parts = []
                k = j + 1
                while k < len(toks) and toks[k].text != ";":
                    if toks[k].kind == "id":
                        parts.append(toks[k].text)
                    k += 1
                pkg = ".".join(parts)
                break

        for sc in tree.scopes:
            if sc.kind != "classbody":
                continue
            # class name = token right before the '{'
            if sc.open_idx < 1:
                continue
            name_tok = toks[sc.open_idx - 1]
            if name_tok.kind != "id":
                continue
            ci = ClassInfo(name_tok.text,
                           (pkg + "." + name_tok.text) if pkg else name_tok.text)
            # kind / superclass
            start = tree._stmt_start_idx(sc.open_idx)
            j = start
            while j < sc.open_idx:
                t = toks[j]
                if t.kind == "id":
                    if t.text in ("interface",):
                        ci.kind = "interface"
                    elif t.text == "enum":
                        ci.kind = "enum"
                    elif t.text == "record":
                        ci.kind = "record"
                    elif t.text == "extends":
                        k = j + 1
                        nm = []
                        while k < sc.open_idx and toks[k].text not in ("{", "implements", ","):
                            if toks[k].kind == "id":
                                nm.append(toks[k].text)
                            elif nm:
                                break
                            k += 1
                        if nm:
                            ci.superclass = "".join(nm)
                j += 1
            self._index_members(ci, sc, tree, toks, raw)
            self.by_fqn[ci.fqn] = ci
            self.by_name.setdefault(ci.name, []).append(ci)

    def _index_members(self, ci, sc, tree, toks, raw):
        """Fields and methods that are direct children of the class body scope."""
        depth0 = sc.depth()
        i = sc.open_idx + 1
        end = sc.close_idx if sc.close_idx is not None else len(toks)
        while i < end:
            # only direct members: tokens whose scope is the class body scope
            if tree.scope_of_tok[i] != sc.sid:
                i += 1
                continue
            # collect a member: up to the next ';' or a '{' that opens a method body
            j = i
            member = []
            while j < end:
                t = toks[j]
                if t.text == ";" and tree.scope_of_tok[j] == sc.sid:
                    member.append(t)
                    j += 1
                    break
                if t.text == "{":
                    break
                member.append(t)
                j += 1
            if member:
                self._record_member(ci, member, toks, raw)
            i = j if j > i else i + 1

    def _record_member(self, ci, member, toks, raw):
        # method?  ident ( ... )  {  or  ;
        depth = 0
        paren = -1
        for k, t in enumerate(member):
            if t.text == "(":
                if depth == 0:
                    paren = k
                depth += 1
            elif t.text == ")":
                depth -= 1
        if paren > 0:
            name_tok = member[paren - 1]
            if name_tok.kind == "id" and name_tok.text not in jscope.KEYWORDS:
                # return type = tokens before the name
                rt = _type_before_tokens(member, paren - 1)
                if rt:
                    ci.methods.setdefault(name_tok.text, rt)
                return
        # field(s):  Type name (= ...)? (, name (= ...)?)* ;
        # find the type = first token run before the last identifier
        ids = [k for k, t in enumerate(member)
               if t.kind == "id" and t.text not in jscope.KEYWORDS]
        if not ids:
            return
        # the declared identifiers are those followed by '=', ',' or ';'
        for k in ids:
            nxt = member[k + 1].text if k + 1 < len(member) else ";"
            if nxt not in ("=", ",", ";"):
                continue
            # name must be preceded by a type-ish token
            if k == 0:
                continue
            prev = member[k - 1]
            if prev.kind != "id":
                continue
            if prev.text in jscope.KEYWORDS and prev.text not in jscope.TYPE_TOKENS:
                continue
            ty = _type_before_tokens(member, k)
            if ty:
                ci.fields.setdefault(member[k].text, ty)

    # -- lookup ----------------------------------------------------------
    def lookup(self, type_name):
        if not type_name:
            return None
        t = type_name.strip()
        t = t.split("<")[0].strip()
        arr = ""
        while t.endswith("[]"):
            arr += "[]"
            t = t[:-2].strip()
        if t in PRIM or t in ("String", "Object", "Void"):
            return None
        if t in self.by_fqn:
            return self.by_fqn[t]
        cands = self.by_name.get(t)
        if cands:
            return cands[0]
        # nested class reference like Outer.Inner
        if "." in t:
            simple = t.split(".")[-1]
            cands = self.by_name.get(simple)
            if cands:
                return cands[0]
        return None

    def field_type(self, type_name, field):
        if type_name and type_name.endswith("[]"):
            if field == "length":
                return "int"
            return None
        ci = self.lookup(type_name)
        seen = 0
        while ci is not None and seen < 12:
            if field in ci.fields:
                return ci.fields[field]
            ci = self.lookup(ci.superclass) if ci.superclass else None
            seen += 1
        return BUILTIN_FIELDS.get(type_name, {}).get(field)

    def method_return(self, type_name, method):
        if type_name and type_name.endswith("[]"):
            return None
        ci = self.lookup(type_name)
        seen = 0
        while ci is not None and seen < 12:
            if method in ci.methods:
                return ci.methods[method]
            ci = self.lookup(ci.superclass) if ci.superclass else None
            seen += 1
        return BUILTIN_METHODS.get(type_name, {}).get(method)


def _type_before_tokens(tokens, idx):
    """Type text preceding tokens[idx] (the declared name)."""
    i = idx - 1
    if i < 0:
        return None
    toks = tokens
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
            return None
        i = j - 1
    if i < 0:
        return None
    tk = toks[i]
    if tk.kind != "id":
        return None
    if tk.text in jscope.KEYWORDS and tk.text not in jscope.TYPE_TOKENS:
        return None
    start = tk.start
    j = i
    while j >= 2 and toks[j - 1].text == "." and toks[j - 2].kind == "id":
        start = toks[j - 2].start
        j -= 2
    return toks[idx].text and _slice(toks, start, toks[idx].start)


def _slice(toks, start_off, end_off):
    # reconstruct text from token offsets
    parts = []
    prev_end = None
    for t in toks:
        if t.start >= end_off:
            break
        if t.start >= start_off:
            parts.append(t.text)
    return "".join(parts).strip()


# ------------------------------------------------------------- expressions --

class Env:
    __slots__ = ("locals", "cls", "this_type", "index")

    def __init__(self, locals_, cls, this_type, index):
        self.locals = locals_
        self.cls = cls
        self.this_type = this_type
        self.index = index


def _strip_parens(toks, a, b):
    """Remove redundant outer parens from toks[a:b]."""
    while b - a >= 2 and toks[a].text == "(" and toks[b - 1].text == ")":
        depth = 0
        ok = True
        for k in range(a, b):
            if toks[k].text == "(":
                depth += 1
            elif toks[k].text == ")":
                depth -= 1
                if depth == 0 and k != b - 1:
                    ok = False
                    break
        if not ok:
            break
        a += 1
        b -= 1
    return a, b


def infer_expr(toks, a, b, env):
    """Return the type of toks[a:b] or None."""
    if a >= b:
        return None
    a, b = _strip_parens(toks, a, b)
    if a >= b:
        return None

    # `new Type(...)` / `new Type[...]`
    if toks[a].text == "new":
        j = a + 1
        if j < b and toks[j].kind == "id":
            parts = [toks[j].text]
            while j + 2 < b and toks[j + 1].text == "." and toks[j + 2].kind == "id":
                j += 2
                parts.append(toks[j].text)
            ty = ".".join(parts)
            if j + 1 < b and toks[j + 1].text == "[":
                return ty + "[]"
            return ty
        return None

    # binary operators
    op_idx = _top_level_op(toks, a, b)
    if op_idx is not None:
        op = toks[op_idx].text
        left = infer_expr(toks, a, op_idx, env)
        right = infer_expr(toks, op_idx + 1, b, env)
        if op in ("&&", "||", "==", "!=", "<", ">", "<=", ">="):
            return "boolean"
        if op == "instanceof":
            return "boolean"
        if op in ("+", "-", "*", "/", "%", "&", "|", "^", "<<", ">>", ">>>"):
            return _numeric_promote(left, right)
        if op == "?":
            if left == right:
                return left
            return None
        return None

    # unary
    if toks[a].text == "!":
        return "boolean"
    if toks[a].text == "-" or toks[a].text == "+":
        return infer_expr(toks, a + 1, b, env)

    # cast prefix: (Type) expr
    if toks[a].text == "(" and a + 1 < b and toks[a + 1].kind == "id":
        close = _matching_close(toks, a)
        if close is not None and close > a + 1:
            ty = _cast_type(toks, a + 1, close)
            if ty:
                return ty

    if b - a == 1:
        t = toks[a]
        if t.kind == "num":
            return _num_literal_type(t.text)
        if t.kind == "op" and t.text == '"':
            return "String"
        if t.kind == "id":
            if t.text in ("true", "false"):
                return "boolean"
            if t.text == "null":
                return None
            if t.text == "this":
                return env.this_type
            if t.text in env.locals:
                return env.locals[t.text]
            if env.cls is not None and t.text in env.cls.fields:
                return env.cls.fields[t.text]
            return None
        return None

    # bare method call on the current instance:  foo(args)
    if b - a >= 2 and toks[a].kind == "id" and toks[a + 1].text == "(" \
            and toks[a].text not in jscope.KEYWORDS:
        return env.index.method_return(env.this_type, toks[a].text)

    # field access / method call / array access chains
    return _infer_chain(toks, a, b, env)


def _cast_type(toks, a, b):
    """Type name if toks[a:b] is a type reference, else None."""
    i = a
    if i >= b or toks[i].kind != "id":
        return None
    if toks[i].text in jscope.KEYWORDS and toks[i].text not in jscope.TYPE_TOKENS:
        return None
    if toks[i].text in ("new", "return", "this", "super"):
        return None
    while i + 2 < b and toks[i + 1].text == "." and toks[i + 2].kind == "id":
        i += 2
    j = i + 1
    if j < b and toks[j].text == "<":
        depth = 0
        while j < b:
            if toks[j].text == "<":
                depth += 1
            elif toks[j].text == ">":
                depth -= 1
                if depth == 0:
                    j += 1
                    break
            j += 1
    while j + 1 < b and toks[j].text == "[" and toks[j + 1].text == "]":
        j += 2
    if j != b:
        return None
    # the '.' tokens are part of the name -- don't add separators on top
    parts = [toks[k].text for k in range(a, i + 1) if toks[k].text != "."]
    name = ".".join(parts)
    if name in PRIM or name in jscope.TYPE_TOKENS or name[0].isupper() or "." in name:
        return name
    return None


def _num_literal_type(s):
    if LITERAL_LONG.match(s):
        return "long"
    if LITERAL_FLOAT.match(s):
        return "float"
    if LITERAL_DOUBLE.match(s):
        return "double"
    if LITERAL_HEX.match(s):
        return "long" if s[-1] in "lL" else "int"
    if LITERAL_INT.match(s):
        return "int"
    return None


def _numeric_promote(l, r):
    if l is None or r is None:
        return None
    if l not in NUMERIC or r not in NUMERIC:
        return None
    if l == "double" or r == "double":
        return "double"
    if l == "float" or r == "float":
        return "float"
    if l == "long" or r == "long":
        return "long"
    return "int"


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


def _top_level_op(toks, a, b):
    """Index of the lowest-precedence binary operator, or None."""
    depth = 0
    for k in range(a, b):
        t = toks[k].text
        if t in ("(", "[", "{"):
            depth += 1
        elif t in (")", "]", "}"):
            depth -= 1
        elif depth == 0:
            if t in ("&&", "||", "==", "!=", "<", ">", "<=", ">=", "?", "+", "-",
                     "*", "/", "%", "&", "|", "^", "<<", ">>", ">>>"):
                # unary minus detection: previous token is an operator or start
                if t in ("+", "-") and k > a and toks[k - 1].text in (
                        "=", "(", ",", "+", "-", "*", "/", "%", "<", ">", "return",
                        "?", ":", "&&", "||", "==", "!="):
                    continue
                return k
    return None


def _infer_chain(toks, a, b, env):
    """Type of a.b.c / a.b() / a[i] style expressions."""
    # find the last '.' or '[' at depth 0
    depth = 0
    dot = -1
    brk = -1
    call = False
    for k in range(a, b):
        t = toks[k].text
        if t in ("(", "["):
            depth += 1
            if t == "(" and k + 1 < b and toks[k + 1].text == ")":
                call = True
        elif t in (")", "]"):
            depth -= 1
        elif depth == 0 and t == ".":
            dot = k
            brk = -1
        elif depth == 0 and t == "[":
            brk = k
            dot = -1
    if dot >= 0:
        base = infer_expr(toks, a, dot, env)
        name = toks[dot + 1].text if dot + 1 < b else None
        if name is None:
            return None
        is_call = (dot + 2 < b and toks[dot + 2].text == "(")
        if base is None:
            return None
        if is_call:
            return env.index.method_return(base, name)
        return env.index.field_type(base, name)
    if brk >= 0:
        base = infer_expr(toks, a, brk, env)
        if base is None:
            return None
        return base[:-2] if base.endswith("[]") else None
    # static access: Type.member  or  Type.method()
    if b - a >= 2 and toks[a].kind == "id" and toks[a].text not in jscope.KEYWORDS:
        base = toks[a].text
        name = toks[a + 1].text
        if toks[a + 1].text == ".":
            is_call = (a + 3 < b and toks[a + 3].text == "(")
            if is_call:
                return env.index.method_return(base, name)
            return env.index.field_type(base, name)
    return None
