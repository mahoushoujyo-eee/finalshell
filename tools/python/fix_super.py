#!/usr/bin/env python3
"""Repair 'call to super must be first statement in constructor'.

- super(...) outside any constructor: comment it out (decompiler artifact).
- duplicate super/this in one constructor: keep the first, comment the rest.
- late super()/super(params-only): move it to the first statement.
- late super(locals): replace with super() at the first statement (documented loss).
"""
import argparse
import collections
import re
import sys

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


def parse_structure(text):
    masked = mask(text)
    lines = text.splitlines()
    offs = []
    p = 0
    for ln in lines:
        offs.append(p)
        p += len(ln) + 1
    st, pairs = [], {}
    for i, c in enumerate(masked):
        if c == "{":
            st.append(i)
        elif c == "}" and st:
            pairs[st.pop()] = i
    classes = []
    for m in re.finditer(r"\b(?:class|enum)\s+(\w+)[^{;]*\{", masked):
        ob = masked.rfind("{", m.start(), m.end())
        classes.append((m.group(1), ob, pairs.get(ob, 10 ** 18)))
    ctors = []
    for cls, cs, ce in classes:
        seg = masked[cs:ce]
        for m in re.finditer(r"(?:public|protected|private)?\s*" + re.escape(cls) + r"\s*\(([^;{}]*)\)\s*(?:throws [^{]+)?\{", seg):
            params = []
            for part in m.group(1).split(","):
                nm = re.findall(r"[A-Za-z_$][\w$]*", part.strip())
                if nm:
                    params.append(nm[-1])
            ob = cs + m.end() - 1
            ctors.append({
                "cls": cls, "start": ob, "end": pairs.get(ob, 10 ** 18),
                "params": set(params),
            })
    return lines, masked, offs, ctors


def line_of(offs, pos):
    import bisect
    return bisect.bisect_right(offs, pos)


def parse_super(line):
    m = re.match(r"\s*super\s*\((.*)\)\s*;", line)
    if not m:
        return None
    return m.group(1).strip()


def comment(line, tag):
    if line.strip().startswith("// [VF"):
        return line
    indent = line[:len(line) - len(line.lstrip())]
    return indent + "// [VF-super] " + line.strip()


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default=r"D:\chat_work\fsfinal2\src\main\java")
    ap.add_argument("--log", default=r"D:\chat_work\temp\fsbuild\jv5.log")
    ap.add_argument("--apply", action="store_true")
    args = ap.parse_args()

    errors = collections.defaultdict(list)
    for l in open(args.log, encoding="utf-8", errors="replace"):
        m = re.match(r"(.+?\.java):(\d+): error: (.*)", l)
        if m and "call to super must be first statement" in m.group(3):
            errors[m.group(1)].append(int(m.group(2)))

    touched = 0
    stats = collections.Counter()
    for path, lines_no in sorted(errors.items()):
        text = open(path, encoding="utf-8", errors="replace").read()
        lines, masked, offs, ctors = parse_structure(text)
        groups = collections.defaultdict(list)
        non_ctor = []
        for ln in lines_no:
            pos = offs[ln - 1]
            c = next((x for x in ctors if x["start"] < pos < x["end"]), None)
            if c is None:
                non_ctor.append(ln)
            else:
                groups[id(c)].append(ln)
        if not groups and not non_ctor:
            continue
        # comment stray supers first (no line-count change)
        for ln in non_ctor:
            if parse_super(lines[ln - 1]) is not None:
                lines[ln - 1] = comment(lines[ln - 1], "non-ctor")
                stats["non-ctor"] += 1
        # constructors, bottom-up so earlier line numbers stay valid
        ordered = sorted(ctors, key=lambda c: c["start"], reverse=True)
        for c in ordered:
            errs = sorted(groups.get(id(c), []))
            if not errs:
                continue
            a = line_of(offs, c["start"]) + 1      # first line after '{'
            b = line_of(offs, c["end"])            # closing '}'
            a = max(a, 1)
            first = None
            for k in range(a, b + 1):
                if masked[offs[k - 1]:offs[k - 1] + len(lines[k - 1])].strip():
                    first = k
                    break
            if first is None:
                continue
            earlier = any(re.match(r"\s*(super|this)\s*\(", masked[offs[k - 1]:offs[k - 1] + len(lines[k - 1])]) for k in range(a, errs[0]))
            moved = False
            shift = 0
            for i, orig_ln in enumerate(errs):
                ln = orig_ln + shift
                args_s = parse_super(lines[ln - 1])
                if args_s is None:
                    continue
                if ln <= first:
                    stats["already-first"] += 1
                    continue
                if earlier or i > 0:
                    lines[ln - 1] = comment(lines[ln - 1], "dup")
                    stats["dup/nonfirst"] += 1
                    continue
                ids = set(re.findall(r"[A-Za-z_$][\w$]*", re.sub(r'"[^"]*"', "", args_s)))
                ids = {x for x in ids if x not in ("new", "this", "null", "true", "false") and not x[0].isupper()}
                use_super = args_s
                if ids <= c["params"] and "this" not in args_s:
                    stats["moved"] += 1
                else:
                    use_super = ""
                    stats["fallback-empty"] += 1
                indent = lines[first - 1][:len(lines[first - 1]) - len(lines[first - 1].lstrip())]
                new_line = indent + "super(" + use_super + ");"
                lines.insert(first - 1, new_line)
                shift += 1
                ln += 1
                lines[ln - 1] = comment(lines[ln - 1], "moved")
                moved = True
                break
        if args.apply:
            open(path, "w", encoding="utf-8", newline="").write("\n".join(lines) + ("\n" if text.endswith("\n") else ""))
            touched += 1
    print("files touched", touched)
    print(dict(stats))


if __name__ == "__main__":
    main()
