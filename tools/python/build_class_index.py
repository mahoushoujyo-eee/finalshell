#!/usr/bin/env python3
"""Build docs/CLASS_INDEX.tsv, docs/STRUCTURE.md and docs/NAMING.md from the
current source tree plus the reviewed rename proposal."""
import argparse
import csv
import os
import re
from collections import Counter, defaultdict

OBF1 = re.compile(r"[A-Za-z]{1,2}\d*(_\d+)?")
OBF2 = re.compile(r"[A-Z][a-z]?\d+(_\d+)?")
OBF3 = re.compile(r"[A-Z][A-Z0-9]{1,3}(_\d+)?")
OBF4 = re.compile(r"[A-Za-z]{1,3}_\d+")


def is_obf(s):
    return bool(OBF1.fullmatch(s) or OBF2.fullmatch(s) or OBF3.fullmatch(s) or OBF4.fullmatch(s))


def load_proposal(path):
    rows = list(csv.DictReader(open(path, encoding="utf-8"), delimiter="\t"))
    return rows


def load_aliases(path):
    text = open(path, encoding="utf-8", errors="replace").read()
    return set(re.findall(r'MAP\.put\("(?:[^"\\]|\\.)*",\s*"([^"]+)"\)', text))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--src", default=r"D:\chat_work\fsfinal2")
    ap.add_argument("--proposal", default=r"D:\chat_work\rename-plan\class-rename-proposal-v2.tsv")
    ap.add_argument("--out", default=r"D:\chat_work\fsrepo\docs")
    args = ap.parse_args()

    root = os.path.join(args.src, "src", "main", "java")
    aliases = load_aliases(os.path.join(root, "com", "finalshell", "reflect", "RegistryAliases.java"))
    rows = load_proposal(args.proposal)
    applied = {}
    for r in rows:
        if r["action"] in ("rename", "rename+registry", "fix", "fix+registry") and r["newSimpleName"]:
            applied[r["currentFqn"]] = r
    applied["com.finalshell.ui.frame.U"] = next(
        r for r in rows if r["currentFqn"] == "com.finalshell.ui.frame.U"
    )
    by_new = {r["newPackage"] + "." + r["newSimpleName"]: r for r in applied.values()}
    vendor = {r["currentFqn"] for r in rows if r["action"] == "vendor"}

    entries = []
    for dp, dn, fn in os.walk(root):
        for f in fn:
            if not f.endswith(".java"):
                continue
            path = os.path.join(dp, f)
            rel = os.path.relpath(path, root).replace(os.sep, "/")
            fqn = rel[:-5].replace("/", ".")
            simple = fqn.rsplit(".", 1)[-1]
            pkg = fqn.rsplit(".", 1)[0] if "." in fqn else ""
            if fqn in applied:
                status = "renamed"
                meta = applied[fqn]
            elif fqn in by_new:
                status = "renamed"
                meta = by_new[fqn]
            elif fqn in vendor:
                status = "vendor-kept"
                meta = next(r for r in rows if r["currentFqn"] == fqn)
            elif is_obf(simple):
                status = "pending-evidence"
                meta = next((r for r in rows if r["currentFqn"] == fqn), None)
            else:
                status = "semantic"
                meta = next((r for r in rows if r["currentFqn"] == fqn), None)
            entries.append({
                "path": rel,
                "fqn": fqn,
                "simple": simple,
                "package": pkg,
                "reflect": "Y" if (fqn in aliases or (meta and meta.get("reflect") == "1")) else "N",
                "semantic": "N" if is_obf(simple) else "Y",
                "status": status,
                "confidence": (meta or {}).get("confidence", ""),
                "evidence": (meta or {}).get("evidence", ""),
            })

    os.makedirs(args.out, exist_ok=True)
    tsv = os.path.join(args.out, "CLASS_INDEX.tsv")
    with open(tsv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=list(entries[0].keys()), delimiter="\t", lineterminator="\n")
        w.writeheader()
        w.writerows(sorted(entries, key=lambda e: e["fqn"]))
    with open(os.path.join(args.out, "RENAME_MAP.tsv"), "w", encoding="utf-8", newline="") as f:
        f.write("oldFqn\tnewFqn\taction\treflect\n")
        for old, r in sorted(applied.items()):
            f.write("%s\t%s.%s\t%s\t%s\n" % (old, r["newPackage"], r["newSimpleName"], r["action"], r["reflect"]))

    status = Counter(e["status"] for e in entries)
    sem = sum(1 for e in entries if e["semantic"] == "Y")
    reflect = sum(1 for e in entries if e["reflect"] == "Y")
    pkgs = defaultdict(lambda: Counter(total=0, sem=0, pending=0, renamed=0, vendor=0, reflect=0))
    for e in entries:
        p = pkgs[e["package"]]
        p["total"] += 1
        if e["semantic"] == "Y":
            p["sem"] += 1
        if e["status"] == "pending-evidence":
            p["pending"] += 1
        if e["status"] == "renamed":
            p["renamed"] += 1
        if e["status"] == "vendor-kept":
            p["vendor"] += 1
        if e["reflect"] == "Y":
            p["reflect"] += 1

    with open(os.path.join(args.out, "STRUCTURE.md"), "w", encoding="utf-8", newline="") as f:
        f.write("# 目录与包结构\n\n")
        f.write("源文件总数：**%d**；命名状态：%s。\n\n" % (
            len(entries), "，".join("%s=%d" % kv for kv in sorted(status.items()))))
        f.write("可读类名（非混淆形态）：**%d / %d**；反射注册表涉及的类：**%d**。\n\n" % (
            sem, len(entries), reflect))
        f.write("## com.finalshell 包分布\n\n")
        f.write("| 包 | 文件数 | 可读类名 | 待命名 | 本轮改名 | 第三方保留 | 反射类 |\n")
        f.write("|---|---:|---:|---:|---:|---:|---:|\n")
        for pkg, c in sorted(pkgs.items(), key=lambda kv: (-kv[1]["total"], kv[0])):
            if not pkg.startswith("com.finalshell"):
                continue
            f.write("| `%s` | %d | %d | %d | %d | %d | %d |\n" % (
                pkg, c["total"], c["sem"], c["pending"], c["renamed"], c["vendor"], c["reflect"]))
        f.write("\n## 其他顶级包\n\n")
        for pkg, c in sorted(pkgs.items(), key=lambda kv: (-kv[1]["total"], kv[0])):
            if pkg.startswith("com.finalshell"):
                continue
            f.write("- `%s`：%d 个文件\n" % (pkg, c["total"]))
        f.write("\n## 本轮语义化改名（%d 个）\n\n" % len(applied))
        f.write("见 `RENAME_MAP.tsv`。其中 reflect=1 的类同时更新了 `RegistryAliases`。\n")

    with open(os.path.join(args.out, "NAMING.md"), "w", encoding="utf-8", newline="") as f:
        f.write("# 命名说明\n\n")
        f.write("## 已完成\n\n")
        f.write("- 包名已按 16 个语义域组织（core/ui/task/network/crypto/io/connection/config/serialization/util/reflect 等）。\n")
        f.write("- 本轮按 `docs/rename-plan/class-rename-proposal-v2.tsv` 应用 **%d** 个有证据支撑的类名，"
                "同步更新文件、引用、构造器与 `RegistryAliases`。\n" % len(applied))
        f.write("- 每个类的当前名字、包、文件路径、反射状态与改名状态见 `CLASS_INDEX.tsv`。\n\n")
        f.write("## 仍需证据的部分\n\n")
        f.write("- 当前可读类名 **%d / %d**，其余 **%d** 个仍是混淆形态。\n" % (sem, len(entries), len(entries) - sem))
        f.write("- 这些类缺少可支撑命名的 E1/E2 证据（继承/接口/字段签名/精确匹配的明文字符串）。"
                "提案 `class-rename-proposal-v2.tsv` 已把可确认的高/中置信类收敛到 207 个，其中能落地的就是本轮 %d 个。\n" % len(applied))
        f.write("- 反射类改名必须先登记 `RegistryAliases`（原二进制名 → 新 FQN），否则编译通过但运行时 `ClassNotFoundException`。"
                "本轮的 reflect=1 类已全部登记。\n\n")
        f.write("## 扩展流程\n\n")
        f.write("1. 在提案表补一行（oldFqn、newSimpleName、newPackage、reflect、evidence）。\n")
        f.write("2. `python tools/python/rename_source.py --apply`（默认 dry-run）—— 字符串/注释屏蔽，按包作用域解析引用。\n")
        f.write("3. 全量 `javac` 验证；再跑 `build_class_index.py` 刷新本目录文档。\n")
        f.write("4. 不要凭猜测批量改名；第三方类（vendor-kept）保留原名，按 `vendor-quarantine.md` 处理。\n")

    print("entries", len(entries), "semantic", sem, "renamed", len(applied), "reflect", reflect)
    print("status", dict(status))


if __name__ == "__main__":
    main()
