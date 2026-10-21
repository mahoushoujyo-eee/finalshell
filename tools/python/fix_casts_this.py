#!/usr/bin/env python3
"""Cast Object receivers, blank out `this` in numeric contexts, cast
assignment/return mismatches."""
import argparse
import collections
import re

CAST = {
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
        for ln, msg, src, sym, loc in errs:
            i = ln - 1
            if i < 0 or i >= len(lines):
                continue
            cur = lines[i]
            if "cannot find symbol" in msg and "method" in sym:
                mm = re.search(r"method\s+(\w+)\(", sym)
                lm = re.search(r"variable\s+(\w+)\s+of type\s+([\w.$]+)", loc)
                if mm and lm and lm.group(2) == "Object":
                    method, var = mm.group(1), lm.group(1)
                    t = CAST.get(method)
                    if t:
                        new = re.sub(r"\b" + re.escape(var) + r"\." + re.escape(method) + r"\(",
                                     "((" + t + ")" + var + ")." + method + "(", cur, count=1)
                        if new != cur:
                            edits[i] = new
                            stats["cast-" + method] += 1
                            continue
            if "bad operand" in msg:
                new = re.sub(r"\bthis\b(?=\s*[-+<>])", "0", cur)
                new = re.sub(r"(?<=[-+<>])\s*this\b", " 0", new)
                new = new.replace("(int)this", "0").replace("(long)this", "0L")
                new = new.replace("(boolean)this", "false")
                if new != cur:
                    edits[i] = new
                    stats["this-num"] += 1
                    continue
            m = re.match(r"incompatible types: (.+) cannot be converted to (.+)", msg)
            if m:
                dst = m.group(2)
                if dst in ("Object", "Object[]"):
                    continue
                if re.match(r"^\s*return\s+", cur):
                    new = re.sub(r"^(\s*)return\s+(.*);\s*$", r"\1return (" + dst + r")(\2);", cur)
                elif re.match(r"^\s*\w+\s*=\s*", cur):
                    new = re.sub(r"^(\s*\w+\s*=\s*)(.*);\s*$", r"\1(" + dst + r")(\2);", cur)
                else:
                    continue
                if new != cur and ("(" + dst + ")") not in cur:
                    edits[i] = new
                    stats["cast-to-" + dst] += 1
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
