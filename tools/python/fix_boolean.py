#!/usr/bin/env python3
"""Conservative boolean/int repairs driven by javac error lines."""
import argparse
import collections
import re


def bool_declared(lines, idx, var):
    pat = re.compile(r'^\s*(?:final\s+)?boolean\s+' + re.escape(var) + r'\b')
    for k in range(idx, -1, -1):
        if pat.match(lines[k]):
            return True
    return False


def simplify_boolean(expr):
    e = expr
    e = re.sub(r'\(boolean\)\s*', '', e)
    # drop semantically redundant != 0 around a boolean expression
    for _ in range(4):
        new = re.sub(r'\(([^()]*(?:!=|==|<|>|instanceof)[^()]*)\)\s*!=\s*0', r'\1', e)
        if new == e:
            break
        e = new
    return e


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
        by_file[m.group(1)].append((int(m.group(2)), m.group(3), src))
    stats = collections.Counter()
    touched = 0
    for path, errs in by_file.items():
        text = open(path, encoding="utf-8", errors="replace").read()
        lines = text.splitlines()
        edits = {}
        for ln, msg, src in errs:
            i = ln - 1
            if i < 0 or i >= len(lines):
                continue
            cur = lines[i]
            indent = cur[:len(cur) - len(cur.lstrip())]
            if "int cannot be converted to boolean" in msg:
                m = re.match(r'^(\s*)(if|while)\s*\(\s*([A-Za-z_$][\w$]*)\s*\)\s*(\{.*)$', cur)
                if m:
                    edits[i] = m.group(1) + m.group(2) + " (" + m.group(3) + " != 0) " + m.group(4)
                    stats["if-int"] += 1
                    continue
                m = re.match(r'^(\s*)return\s+\(boolean\)\s*(.*);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + "return (" + simplify_boolean(m.group(2)) + " != 0);"
                    stats["return-cast"] += 1
                    continue
                m = re.match(r'^(\s*)(.*setBoolean\s*\(.*,\s*)\(boolean\)\s*([^;]+)\);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + m.group(2) + simplify_boolean(m.group(3)) + " != 0);"
                    stats["setboolean"] += 1
                    continue
                if "(boolean)" in cur:
                    new = simplify_boolean(cur)
                    if new != cur and new.rstrip().endswith(";"):
                        edits[i] = new
                        stats["simplify"] += 1
                    continue
                m = re.match(r'^(\s*)(\w+)\s*=\s*(boolean|Boolean)\s*;', cur)
                continue
            if "incomparable types: boolean and int" in msg:
                m = re.match(r'^(\s*)if\s*\(\s*([A-Za-z_$][\w$]*)\s*(!=|==)\s*0\s*\)\s*(\{.*)$', cur)
                if m and bool_declared(lines, i, m.group(2)):
                    cond = m.group(2) if m.group(3) == "!=" else "!" + m.group(2)
                    edits[i] = m.group(1) + "if (" + cond + ") " + m.group(4)
                    stats["if-bool"] += 1
                    continue
                m = re.match(r'^(\s*)(\w+)\s*=\s*([A-Za-z_$][\w$]*)\s*(!=|==)\s*0\s*\?\s*(.*)$', cur)
                if m and bool_declared(lines, i, m.group(3)):
                    cond = m.group(3) if m.group(4) == "!=" else "!" + m.group(3)
                    edits[i] = m.group(1) + m.group(2) + " = " + cond + " ? " + m.group(5)
                    stats["ternary-bool"] += 1
                    continue
            if "boolean cannot be converted to int" in msg:
                m = re.match(r'^(\s*)return\s+(.*);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + "return (" + m.group(2) + ") ? 1 : 0;"
                    stats["return-bool"] += 1
                    continue
        if edits:
            for k, v in edits.items():
                lines[k] = v
            if args.apply:
                open(path, "w", encoding="utf-8", newline="").write("\n".join(lines) + ("\n" if text.endswith("\n") else ""))
            touched += 1
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
