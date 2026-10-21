#!/usr/bin/env python3
"""Second boolean/int pass: (boolean)expr casts, Boolean->int, incomparable
comparisons, `var != false`, and `this` in equality comparisons."""
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
        if m:
            by_file[m.group(1)].append((int(m.group(2)), m.group(3), log[i + 1] if i + 1 < len(log) else ""))
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
            new = cur
            if "int cannot be converted to boolean" in msg:
                new = re.sub(r"^(\s*)(\w+)\s*=\s*\(boolean\)\s*(.+);\s*$", r"\1\2 = (\3 != 0);", new)
                new = re.sub(r"^(\s*)return\s+\(boolean\)\s*(.+);\s*$", r"\1return (\2 != 0);", new)
                new = re.sub(r"\(boolean\)\s*(\([^()]*\))", r"(\1 != 0)", new)
            if "Boolean cannot be converted to int" in msg:
                new = re.sub(r"^(\s*)(\w+)\s*=\s*\(int\)\s*\(\(Boolean\)\s*(\w+)\);\s*$", r"\1\2 = ((Boolean)\3) ? 1 : 0;", new)
            if "incomparable types: boolean and int" in msg:
                new = re.sub(r"if\s*\(\s*([A-Za-z_$][\w$]*)\s*==\s*0\s*\)", r"if (!\1)", new)
                new = re.sub(r"if\s*\(\s*([A-Za-z_$][\w$]*)\s*!=\s*0\s*\)", r"if (\1)", new)
            if "bad operand" in msg:
                new = re.sub(r"([A-Za-z_$][\w$]*)\s*!=\s*false", r"\1 != 0", new)
                new = re.sub(r"([A-Za-z_$][\w$]*)\s*==\s*false", r"\1 == 0", new)
                new = re.sub(r"\bthis\b(?=\s*(?:!=|==|[-+<>]))", "0", new)
                new = re.sub(r"(?<=[!=<>])\s*this\b", " 0", new)
            if new != cur:
                edits[i] = new
                stats[msg[:24]] += 1
        if edits:
            for k, v in edits.items():
                lines[k] = v
            touched += 1
            if args.apply:
                open(path, "w", encoding="utf-8", newline="").write("\n".join(lines) + ("\n" if text.endswith("\n") else ""))
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
