#!/usr/bin/env python3
"""Source-level semantic class renamer for the FinalShell reconstruction.

Reads the reviewed proposal table, rewrites class declarations/references with
package-scope resolution (comments and literals are masked), renames files and
updates RegistryAliases so reflective lookups keep working.

Default is dry-run; pass --apply to write.
"""
import argparse
import csv
import os
import re
import sys

IDENT = re.compile(r"[A-Za-z0-9_$]")


def load_index(root):
    index = {}
    for dp, dn, fn in os.walk(root):
        for f in fn:
            if not f.endswith(".java"):
                continue
            path = os.path.join(dp, f)
            rel = os.path.relpath(path, root).replace(os.sep, "/")
            fqn = rel[:-5].replace("/", ".")
            index[fqn] = path
    return index


def load_mappings(proposal, actions, include):
    rows = list(csv.DictReader(open(proposal, encoding="utf-8"), delimiter="\t"))
    out = {}
    for r in rows:
        if r["action"] not in actions:
            continue
        new_simple = (r["newSimpleName"] or "").strip()
        if not new_simple:
            continue
        out[r["currentFqn"]] = {
            "old": r["currentFqn"],
            "newSimple": new_simple,
            "newPkg": r["newPackage"],
            "reflect": r["reflect"] == "1",
            "registryKey": (r.get("registryPlaintext") or "").strip(),
            "action": r["action"],
        }
    by_fqn = {r["currentFqn"]: r for r in rows}
    for fqn in include:
        if fqn in out:
            continue
        r = by_fqn.get(fqn)
        if r is None or not (r.get("newSimpleName") or "").strip():
            raise SystemExit("included class has no proposed name: " + fqn)
        out[fqn] = {
            "old": fqn,
            "newSimple": r["newSimpleName"].strip(),
            "newPkg": r["newPackage"],
            "reflect": r["reflect"] == "1",
            "registryKey": (r.get("registryPlaintext") or "").strip(),
            "action": r["action"],
        }
    return out


def mask_java(text):
    """Return a same-length copy where comments/strings/chars are blanked."""
    out = list(text)
    i, n = 0, len(text)
    state = "code"
    while i < n:
        c = text[i]
        nxt = text[i + 1] if i + 1 < n else ""
        if state == "code":
            if c == "/" and nxt == "/":
                state = "line"; out[i] = out[i + 1] = " "; i += 2; continue
            if c == "/" and nxt == "*":
                state = "block"; out[i] = out[i + 1] = " "; i += 2; continue
            if c == '"' and text[i:i + 3] == '"""':
                state = "text"; out[i] = out[i + 1] = out[i + 2] = " "; i += 3; continue
            if c == '"':
                state = "string"; out[i] = " "; i += 1; continue
            if c == "'":
                state = "char"; out[i] = " "; i += 1; continue
            i += 1
        elif state == "line":
            if c == "\n":
                state = "code"
            else:
                out[i] = " "
            i += 1
        elif state == "block":
            if c == "*" and nxt == "/":
                out[i] = out[i + 1] = " "; i += 2; state = "code"; continue
            if c != "\n":
                out[i] = " "
            i += 1
        elif state in ("string", "char"):
            if c == "\\":
                if c != "\n":
                    out[i] = " "
                if i + 1 < n and text[i + 1] != "\n":
                    out[i + 1] = " "
                i += 2; continue
            if (state == "string" and c == '"') or (state == "char" and c == "'"):
                state = "code"
            if c != "\n":
                out[i] = " "
            i += 1
        elif state == "text":
            if c == "\\":
                if c != "\n":
                    out[i] = " "
                if i + 1 < n and text[i + 1] != "\n":
                    out[i + 1] = " "
                i += 2; continue
            if text[i:i + 3] == '"""':
                out[i] = out[i + 1] = out[i + 2] = " "; i += 3; state = "code"; continue
            if c != "\n":
                out[i] = " "
            i += 1
    return "".join(out)


def parse_scope(text):
    pkg = ""
    m = re.search(r"(?m)^\s*package\s+([\w.]+)\s*;", text)
    if m:
        pkg = m.group(1)
    imports = {}
    wildcards = set()
    for m in re.finditer(r"(?m)^\s*import\s+(?!static\b)([\w.]+?)(\.\*)?\s*;", text):
        name, star = m.group(1), m.group(2)
        if star:
            wildcards.add(name)
        else:
            imports[name.rsplit(".", 1)[-1]] = name
    return pkg, imports, wildcards


def word_re(old):
    return re.compile(r"(?<![\w$.])" + re.escape(old) + r"(?![\w$])")


def build_matchers(mappings):
    fqns = {m["old"]: m for m in mappings.values()}
    simples = {}
    for m in mappings.values():
        simples.setdefault(m["old"].rsplit(".", 1)[-1], []).append(m)
    tokens = sorted(list(fqns) + list(simples), key=len, reverse=True)
    pat = re.compile(r"(?<![\w$.])(?:" + "|".join(re.escape(t) for t in tokens) + r")(?![\w$])")
    return pat, fqns, simples


def choose_simple(token, candidates, pkg, imports, wildcards):
    imported = imports.get(token)
    for m in candidates:
        if imported == m["old"]:
            return m
    for m in candidates:
        if pkg == m["old"].rsplit(".", 1)[0]:
            return m
    for m in candidates:
        if m["old"].rsplit(".", 1)[0] in wildcards:
            return m
    return None


def plan_text(text, mappings, matcher, fqns, simples, pkg, imports, wildcards, stats):
    masked = mask_java(text)
    edits = []
    for mo in matcher.finditer(masked):
        token = mo.group(0)
        if token in fqns:
            m = fqns[token]
            rep = m["newPkg"] + "." + m["newSimple"]
            kind = "fqn"
        else:
            m = choose_simple(token, simples.get(token, []), pkg, imports, wildcards)
            if m is None:
                continue
            rep = m["newSimple"]
            kind = "simple"
        if rep == token:
            continue
        edits.append((mo.start(), mo.end(), rep, kind))
        stats[kind] += 1
    if not edits:
        return text, 0
    edits.sort(key=lambda x: x[0])
    out, pos = [], 0
    for s, e, rep, kind in edits:
        if s < pos:
            continue
        out.append(text[pos:s])
        out.append(rep)
        pos = e
    out.append(text[pos:])
    return "".join(out), len(edits)


def update_registry_aliases(path, mappings, apply, log):
    text = open(path, encoding="utf-8", errors="surrogateescape").read()
    changed = 0
    for m in mappings.values():
        if not m["reflect"]:
            continue
        old, new = m["old"], m["newPkg"] + "." + m["newSimple"]
        needle = '"' + old + '"'
        if needle in text:
            cnt = text.count(needle)
            text = text.replace(needle, '"' + new + '"')
            changed += cnt
            continue
        key = m["registryKey"]
        if not key:
            log.append("alias-missing-no-key\t" + old)
            continue
        pat = re.compile(r'MAP\.put\("' + re.escape(key) + r'",\s*"([^"]*)"\);')
        mo = pat.search(text)
        if mo:
            text = text[:mo.start(1)] + new + text[mo.end(1):]
            changed += 1
        else:
            text = text.replace("static {", 'static {\n      MAP.put("' + key + '", "' + new + '");', 1)
            changed += 1
            log.append("alias-added\t" + key + "\t" + new)
    if apply and changed:
        open(path, "w", encoding="utf-8", newline="").write(text)
    return changed


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--root", default=r"D:\chat_work\fsfinal2\src\main\java")
    ap.add_argument("--proposal", default=r"D:\chat_work\rename-plan\class-rename-proposal-v2.tsv")
    ap.add_argument("--actions", default="rename,rename+registry,fix,fix+registry")
    ap.add_argument("--include", action="append", default=["com.finalshell.ui.frame.U"])
    ap.add_argument("--apply", action="store_true")
    ap.add_argument("--log", default=r"D:\chat_work\temp\fsbuild\rename-source-log.tsv")
    args = ap.parse_args()

    actions = set(a.strip() for a in args.actions.split(",") if a.strip())
    mappings = load_mappings(args.proposal, actions, args.include)
    index = load_index(args.root)
    missing = [f for f in mappings if f not in index]
    if missing:
        raise SystemExit("missing source files:\n" + "\n".join(missing))
    for m in mappings.values():
        new_fqn = m["newPkg"] + "." + m["newSimple"]
        if new_fqn in index and new_fqn != m["old"]:
            raise SystemExit("target already exists: " + new_fqn)

    stats = {"fqn": 0, "simple": 0}
    matcher, fqns, simples = build_matchers(mappings)
    changed_files = 0
    log_lines = []
    file_renames = []
    for fqn in sorted(index):
        old_path = index[fqn]
        text = open(old_path, encoding="utf-8", errors="surrogateescape").read()
        pkg, imports, wildcards = parse_scope(text)
        new_text, count = plan_text(text, mappings, matcher, fqns, simples, pkg, imports, wildcards, stats)
        if count:
            changed_files += 1
            if fqn in mappings:
                m = mappings[fqn]
                log_lines.append("%s\t%s\t%d" % (fqn, m["newPkg"] + "." + m["newSimple"], count))
            if args.apply:
                open(old_path, "w", encoding="utf-8", newline="").write(new_text)
    for fqn in sorted(mappings):
        m = mappings[fqn]
        old_path = index[fqn]
        new_path = os.path.join(os.path.dirname(old_path), m["newSimple"] + ".java")
        if old_path != new_path:
            file_renames.append((old_path, new_path))
            if args.apply:
                os.replace(old_path, new_path)

    alias_path = os.path.join(args.root, "com", "finalshell", "reflect", "RegistryAliases.java")
    alias_changed = update_registry_aliases(alias_path, mappings, args.apply, log_lines)

    print("classes:", len(mappings))
    print("files changed:", changed_files)
    print("fqn edits:", stats["fqn"], "simple edits:", stats["simple"])
    print("file renames:", len(file_renames))
    print("alias edits:", alias_changed)
    print("apply:", args.apply)
    if args.apply:
        with open(args.log, "w", encoding="utf-8", newline="") as f:
            f.write("oldFqn\tnewFqn\tedits\n")
            f.writelines(l + "\n" for l in log_lines)


if __name__ == "__main__":
    main()
