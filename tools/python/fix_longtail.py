#!/usr/bin/env python3
"""Long-tail repairs: missing variables, missing methods on Object receivers,
`this` used as a number, and scalar casts for assignment/return mismatches."""
import argparse
import collections
import re

BS = chr(92)


def mask(text):
    out = list(text)
    state = "code"
    i, n = 0, len(text)
    while i < n:
        c = text[i]
        nx = text[i + 1] if i + 1 < n else ""
        if state == "code":
            if c == "/" and nx == "/":
                state = "line"; out[i] = out[i + 1] = " "; i += 2; continue
            if c == "/" and nx == "*":
                state = "block"; out[i] = out[i + 1] = " "; i += 2; continue
            if c == '"':
                state = "str"; out[i] = " "; i += 1; continue
            if c == "'":
                state = "chr"; out[i] = " "; i += 1; continue
            i += 1
        elif state == "line":
            if c == "\n":
                state = "code"
            else:
                out[i] = " "
            i += 1
        elif state == "block":
            if c == "*" and nx == "/":
                out[i] = out[i + 1] = " "; i += 2; state = "code"; continue
            if c != "\n":
                out[i] = " "
            i += 1
        elif state in ("str", "chr"):
            if c == BS:
                if i + 1 < n and text[i + 1] != "\n":
                    out[i + 1] = " "
                i += 2; continue
            if (state == "str" and c == '"') or (state == "chr" and c == "'"):
                state = "code"
            if c != "\n":
                out[i] = " "
            i += 1
    return "".join(out)


def class_close(lines):
    text = "\n".join(lines)
    m = mask(text)
    cm = re.search(r"\b(class|interface|enum)\s+\w+[^{;]*\{", m)
    if not cm:
        return None, None
    start = m.find("{", cm.start(), cm.end())
    depth = 0
    for i in range(start, len(m)):
        if m[i] == "{":
            depth += 1
        elif m[i] == "}":
            depth -= 1
            if depth == 0:
                return m.count("\n", 0, i), cm.group(1)
    return None, cm.group(1)


def infer_type(var, srcs):
    joined = "\n".join(srcs)
    if re.search(r"\b" + var + r"\.setText\(", joined):
        return "javax.swing.text.JTextComponent"
    if re.search(r"\b" + var + r"\.append\(", joined):
        return "java.lang.StringBuilder"
    if re.search(r"\b" + var + r"\.(x|y)\b", joined) and re.search(r"\.(width|height)\b", joined):
        return "java.awt.Point"
    if re.search(r"\b" + var + r"\.(size|get|add|iterator)\(", joined):
        return "java.util.List"
    if re.search(r"\(int\)\s*" + var + r"\b|\bint\s+" + var + r"\b|\b" + var + r"\s*[-+*/%]\s*\w|\w\s*[-+*/%]\s*" + var + r"\b", joined):
        return "int"
    return "Object"


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--log", required=True)
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    log = open(args.log, encoding="utf-8", errors="replace").read().splitlines()
    by_file = collections.defaultdict(list)
    for i, l in enumerate(log):
        m = re.match(r"(.+?\.java):(\d+): error: (.*)", l)
        if not m:
            continue
        src = log[i + 1] if i + 1 < len(log) else ""
        sym = loc = ""
        for k in range(i + 1, min(i + 9, len(log))):
            s = log[k].strip()
            if s.startswith("symbol:"):
                sym = s
            if s.startswith("location:"):
                loc = s
                break
        by_file[m.group(1)].append((int(m.group(2)), m.group(3), src, sym, loc))
    stats = collections.Counter()
    touched = 0
    for path, errs in by_file.items():
        text = open(path, encoding="utf-8", errors="replace").read()
        lines = text.splitlines()
        edits = {}
        # ---- missing variables -> class fields ----
        var_src = collections.defaultdict(list)
        for ln, msg, src, sym, loc in errs:
            if "cannot find symbol" not in msg or "variable" not in sym:
                continue
            mv = re.search(r"variable\s+(\w+)$", sym)
            if mv:
                var_src[mv.group(1)].append(src)
        add_fields = []
        for var, srcs in var_src.items():
            t = infer_type(var, srcs)
            if not any(re.search(r"\b" + re.escape(var) + r"\b", lines[k]) and re.search(r"\b" + re.escape(t) + r"\s+" + re.escape(var) + r"\b", lines[k]) for k in range(len(lines))):
                add_fields.append("   private static " + t + " " + var + ";")
                stats["field-" + t.split(".")[-1]] += 1
        if add_fields:
            close, kind = class_close(lines)
            if close is not None and kind != "interface":
                for f in reversed(add_fields):
                    lines.insert(close, f)
                    edits.clear()
                stats["files-fields"] += 1
        # ---- missing methods on Object receivers ----
        cast_map = {
            "setText": "javax.swing.text.JTextComponent",
            "append": "java.lang.StringBuilder",
            "setBackground": "javax.swing.JComponent", "setForeground": "javax.swing.JComponent",
            "setFont": "javax.swing.JComponent", "setEnabled": "javax.swing.JComponent",
            "isShowing": "javax.swing.JComponent", "getSize": "javax.swing.JComponent",
            "getWidth": "javax.swing.JComponent", "getHeight": "javax.swing.JComponent",
            "setVisible": "javax.swing.JComponent", "requestFocus": "javax.swing.JComponent",
            "setToolTipText": "javax.swing.JComponent", "repaint": "javax.swing.JComponent",
            "divide": "java.math.BigInteger", "multiply": "java.math.BigInteger",
            "add": "java.math.BigInteger", "subtract": "java.math.BigInteger",
            "charAt": "java.lang.String", "substring": "java.lang.String",
        }
        for ln, msg, src, sym, loc in errs:
            if "cannot find symbol" not in msg or "method" not in sym:
                continue
            mm = re.search(r"method\s+(\w+)\(", sym)
            lm = re.search(r"variable\s+(\w+)\s+of type\s+([\w.$]+)", loc)
            if not mm or not lm or lm.group(2) != "Object":
                continue
            method, var = mm.group(1), lm.group(2)
            t = cast_map.get(method)
            if not t:
                continue
            i = ln - 1
            if i < 0 or i >= len(lines):
                continue
            cur = lines[i]
            new = re.sub(r"\b" + re.escape(var) + r"\." + re.escape(method) + r"\(",
                         "((" + t + ")" + var + ")." + method + "(", cur, count=1)
            if new != cur:
                edits[i] = new
                stats["cast-" + method] += 1
        # ---- this used as a number / X != false ----
        for ln, msg, src, sym, loc in errs:
            if "bad operand" not in msg:
                continue
            i = ln - 1
            if i < 0 or i >= len(lines):
                continue
            cur = lines[i]
            new = re.sub(r"\bthis\b(?=\s*[-+<>])", "0", cur)
            new = re.sub(r"(?<=[-+<>]\s{0,3})this\b", "0", new)
            new = new.replace("(int)this", "0").replace("(long)this", "0L")
            new = re.sub(r"\(boolean\)\s*(\w+)", r"\1", new)
            if new != cur:
                edits[i] = new
                stats["this-num"] += 1
        # ---- Object/String/etc -> scalar on assignment/return ----
        for ln, msg, src, sym, loc in errs:
            m = re.match(r"incompatible types: (.+) cannot be converted to (.+)", msg)
            if not m:
                continue
            src_t, dst_t = m.group(1), m.group(2)
            if dst_t in ("Object", "Object[]"):
                continue
            i = ln - 1
            if i < 0 or i >= len(lines):
                continue
            cur = lines[i]
            if re.match(r"^\s*return\s+", cur):
                new = re.sub(r"^(\s*)return\s+(.*);\s*$", r"\1return (" + dst_t + r")(\2);", cur)
            elif re.match(r"^\s*\w+\s*=\s*", cur):
                new = re.sub(r"^(\s*\w+\s*=\s*)(.*);\s*$", r"\1(" + dst_t + r")(\2);", cur)
            else:
                continue
            if new != cur and ("(" + dst_t + ")") not in cur:
                edits[i] = new
                stats["cast-to-" + dst_t] += 1
        if edits:
            for k, v in edits.items():
                if k < len(lines):
                    lines[k] = v
            if args.apply:
                open(path, "w", encoding="utf-8", newline="").write("\n".join(lines) + ("\n" if text.endswith("\n") else ""))
            touched += 1
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
