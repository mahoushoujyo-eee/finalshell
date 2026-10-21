#!/usr/bin/env python3
"""Synthesize class fields for undeclared variables reported by javac."""
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
    return None, None


def infer(var, srcs):
    j = "\n".join(srcs)
    if re.search(r"\b" + re.escape(var) + r"\.setText\(", j):
        return "javax.swing.text.JTextComponent"
    if re.search(r"\b" + re.escape(var) + r"\.append\(", j):
        return "java.lang.StringBuilder"
    if re.search(r"\b" + re.escape(var) + r"\.(x|y)\b", j):
        return "java.awt.Point"
    if re.search(r"\b" + re.escape(var) + r"\.(size|get|add|iterator)\(", j):
        return "java.util.List"
    if re.search(r"\(int\)\s*" + re.escape(var) + r"\b|\bint\s+" + re.escape(var) + r"\b|\b" + re.escape(var) + r"\s*[-+*/%<>]\s*\w|\w\s*[-+*/%<>]\s*" + re.escape(var) + r"\b", j):
        return "int"
    return "Object"


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--log", required=True)
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()
    log = open(args.log, encoding="utf-8", errors="replace").read().splitlines()
    by_file = collections.defaultdict(lambda: collections.defaultdict(list))
    for i, l in enumerate(log):
        m = re.match(r"(.+?\.java):(\d+): error: cannot find symbol", l)
        if not m:
            continue
        src = log[i + 1] if i + 1 < len(log) else ""
        sym = ""
        for k in range(i + 1, min(i + 9, len(log))):
            s = log[k].strip()
            if s.startswith("symbol:"):
                sym = s
                break
        mv = re.search(r"variable\s+(\w+)$", sym)
        if mv:
            by_file[m.group(1)][mv.group(1)].append(src)
    stats = collections.Counter()
    touched = 0
    for path, vars_ in by_file.items():
        text = open(path, encoding="utf-8", errors="replace").read()
        lines = text.splitlines()
        close, kind = class_close(lines)
        if close is None or kind == "interface":
            continue
        add = []
        for var, srcs in vars_.items():
            if any(re.search(r"\b" + re.escape(var) + r"\b", ln) and
                   re.search(r"\b(?:int|long|boolean|Object|String|double|float|byte|short|char|List|Map|Point)\s+" + re.escape(var) + r"\b", ln)
                   for ln in lines):
                continue
            t = infer(var, srcs)
            add.append("   private static " + t + " " + var + ";")
            stats[t.split(".")[-1]] += 1
        if add:
            for f in reversed(add):
                lines.insert(close, f)
            touched += 1
            if args.apply:
                open(path, "w", encoding="utf-8", newline="").write("\n".join(lines) + ("\n" if text.endswith("\n") else ""))
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
