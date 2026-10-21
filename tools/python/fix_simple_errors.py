#!/usr/bin/env python3
"""Easy, error-line-driven repairs: @Override mismatch, bodyless methods,
lossy int->byte. One pass, no speculative edits."""
import argparse
import collections
import re


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
            # A) @Override mismatch: remove the annotation
            if "does not override or implement" in msg:
                if "@Override" in cur:
                    edits[i] = cur.replace("@Override", "").strip()
                    stats["override-inline"] += 1
                    continue
                if i - 1 >= 0 and "@Override" in lines[i - 1]:
                    edits[i - 1] = lines[i - 1][:len(lines[i - 1]) - len(lines[i - 1].lstrip())] + "// [VF] @Override"
                    stats["override-above"] += 1
                    continue
            # B) bodyless method in a class: give it an unsupported body
            if "missing method body" in msg and cur.rstrip().endswith(";"):
                indent = cur[:len(cur) - len(cur.lstrip())]
                edits[i] = cur.rstrip()[:-1] + ' { throw new UnsupportedOperationException("decompilation failed (Vineflower)"); }'
                stats["missing-body"] += 1
                continue
            # C) lossy int -> byte: cast the right-hand expression
            if "possible lossy conversion from int to byte" in msg:
                m = re.match(r'^(\s*)byte\s+(\w+)\s*=\s*(.*);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + "byte " + m.group(2) + " = (byte)(" + m.group(3) + ");"
                    stats["byte-decl"] += 1
                    continue
                m = re.match(r'^(\s*)return\s+(.*);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + "return (byte)(" + m.group(2) + ");"
                    stats["byte-return"] += 1
                    continue
                m = re.match(r'^(\s*)(\w+)\s*=\s*(.*);\s*$', cur)
                if m:
                    edits[i] = m.group(1) + m.group(2) + " = (byte)(" + m.group(3) + ");"
                    stats["byte-assign"] += 1
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
