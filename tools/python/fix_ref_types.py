#!/usr/bin/env python3
"""Targeted repair for Object[] argument-bag declarations.

Uses javac's own error lines; only declarations that actually caused a type
error are changed from Object[] to Object (or the RHS type when obvious).
"""
import argparse
import collections
import os
import re

DECL = re.compile(r'^(\s*)Object\[\]\s+(\w+)\s*=\s*(.*);\s*$')
ASSIGN = re.compile(r'^(\s*)(\w+)\s*=\s*(.*);\s*$')
CAST = re.compile(r'\(\s*([A-Za-z_$][\w$.]*)\s*\)\s*([A-Za-z_$][\w$]*)')


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--log", required=True)
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    lines = open(args.log, encoding="utf-8", errors="replace").read().splitlines()
    by_file = collections.defaultdict(list)
    i = 0
    while i < len(lines):
        m = re.match(r'(.+?\.java):(\d+): error: (.*)', lines[i])
        if not m:
            i += 1
            continue
        src = lines[i + 1].strip() if i + 1 < len(lines) else ""
        by_file[m.group(1)].append((int(m.group(2)), m.group(3).strip(), src))
        i += 1

    stats = collections.Counter()
    touched = 0
    for path, errs in by_file.items():
        text = open(path, encoding="utf-8", errors="replace").read()
        file_lines = text.splitlines()
        edits = {}
        for ln, msg, src in errs:
            idx = ln - 1
            if idx < 0 or idx >= len(file_lines):
                continue
            cur = file_lines[idx]
            # 1) declaration itself is Object[] but RHS is not
            m = DECL.match(cur)
            if m and ("cannot be converted to Object[]" in msg or "cannot be converted to Object[]" in msg):
                new = m.group(1) + "Object " + m.group(2) + " = " + m.group(3) + ";"
                edits[idx] = new
                stats["decl-to-Object"] += 1
                continue
            # 2) cast of an Object[] variable to a scalar -> fix that variable's declaration
            cm = CAST.search(cur)
            if cm and "Object[] cannot be converted to" in msg:
                var = cm.group(2)
                pat = re.compile(r'^(\s*)Object\[\]\s+' + re.escape(var) + r'\b')
                for k in range(idx, -1, -1):
                    mm = pat.match(file_lines[k])
                    if mm:
                        edits[k] = re.sub(r'Object\[\]', 'Object', file_lines[k], count=1)
                        stats["var-decl-to-Object"] += 1
                        break
                continue
            # 3) stray chained call left by a boolean rewrite
            if cur.strip() == ".length();" and "cannot be converted to boolean" in msg:
                edits[idx] = cur[:len(cur) - len(cur.lstrip())] + "// [VF] .length();"
                stats["stray-length"] += 1
                continue
            # 4) assignment to a String variable from Ref.h -> cast to String
            if "Object cannot be converted to String" in msg:
                am = ASSIGN.match(cur)
                if am and "Ref.h(" in am.group(3):
                    new = am.group(1) + am.group(2) + " = (String)(" + am.group(3) + ");"
                    edits[idx] = new
                    stats["cast-String"] += 1
        if edits:
            for k, v in edits.items():
                file_lines[k] = v
            if args.apply:
                open(path, "w", encoding="utf-8", newline="").write("\n".join(file_lines) + ("\n" if text.endswith("\n") else ""))
            touched += 1
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
