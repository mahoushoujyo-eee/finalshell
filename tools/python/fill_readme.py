#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
把 README 草稿里的 {{占位符}} 换成实测数字，输出最终 README。

用法:
    python fill_readme.py <README-draft.md> <输出路径> [--src <构建根>] [--javac-log <日志>]

设计原则:
  - 每个数字都从**实际文件系统/日志**统计，不接受手工输入
  - 统计不到的项保留占位符原样（并在末尾报告），绝不猜
"""
import os
import re
import sys
import subprocess
import zipfile
import glob


def count_files(root, pattern='*'):
    n = 0
    for dirpath, dirnames, filenames in os.walk(root):
        for f in filenames:
            if fnmatch(f, pattern):
                n += 1
    return n


def fnmatch(name, pattern):
    import fnmatch as _f
    return _f.fnmatch(name, pattern)


def tsv_rows(path):
    """TSV 行数（减表头）。文件不存在返回 None。"""
    if not os.path.exists(path):
        return None
    with open(path, 'r', encoding='utf-8', errors='replace') as f:
        n = sum(1 for _ in f)
    return max(0, n - 1)


def count_pattern_in_tree(root, pattern):
    """统计源码树里匹配正则的**出现次数**（不是文件数）。"""
    import re as _re
    rx = _re.compile(pattern)
    n = 0
    for dirpath, dirnames, filenames in os.walk(root):
        for f in filenames:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dirpath, f)
            try:
                with open(p, 'r', encoding='utf-8', errors='replace') as fh:
                    for line in fh:
                        n += len(rx.findall(line))
            except Exception:
                pass
    return n


def count_files_with_pattern(root, pattern):
    """统计匹配该正则的文件数。"""
    import re as _re
    rx = _re.compile(pattern)
    n = 0
    for dirpath, dirnames, filenames in os.walk(root):
        for f in filenames:
            if not f.endswith('.java'):
                continue
            p = os.path.join(dirpath, f)
            try:
                with open(p, 'r', encoding='utf-8', errors='replace') as fh:
                    for line in fh:
                        if rx.search(line):
                            n += 1
                            break
            except Exception:
                pass
    return n


def count_packages(root):
    """统计 root 下所有**直接含 .java 的目录**数（含 root 本身若含 .java）。"""
    n = 0
    if any(f.endswith('.java') for f in os.listdir(root) if os.path.isfile(os.path.join(root, f))):
        n += 1
    for dirpath, dirnames, filenames in os.walk(root):
        if any(f.endswith('.java') for f in filenames):
            n += 1
    return n


def main():
    args = sys.argv[1:]
    if len(args) < 2:
        print(__doc__)
        return 1
    draft = args[0]
    out = args[1]
    src = 'D:\\chat_work\\fsfinal2'
    javac_log = 'D:\\chat_work\\temp\\fsbuild\\jc-G.log'
    repo = 'D:\\chat_work\\fsrepo'
    i = 2
    while i < len(args):
        if args[i] == '--src':
            src = args[i + 1]; i += 2
        elif args[i] == '--javac-log':
            javac_log = args[i + 1]; i += 2
        elif args[i] == '--repo':
            repo = args[i + 1]; i += 2
        else:
            i += 1

    jroot = os.path.join(src, 'src', 'main', 'java')
    lib = os.path.join(src, 'lib')

    vals = {}

    # --- 源码树 ---
    vals['SRC_FILE_COUNT'] = count_files(jroot, '*.java')
    vals['LEAF_PACKAGE_COUNT'] = count_packages(jroot)
    fj = os.path.join(jroot, 'com', 'finalshell')
    if os.path.isdir(fj):
        vals['SEMANTIC_PACKAGE_COUNT'] = count_packages(fj)
    else:
        vals['SEMANTIC_PACKAGE_COUNT'] = 0
    vals['RESOURCE_COUNT'] = count_files(os.path.join(src, 'src', 'main', 'resources'))

    # --- 改名表 ---
    tdir = 'D:\\chat_work\\finalshell-project\\tables'
    tdir2 = 'D:\\chat_work\\finalshell-teardown\\tables'
    vals['CLASS_COUNT'] = tsv_rows(os.path.join(tdir, 'class-rename-kind.tsv'))
    vals['SEMANTIC_RENAME_ROWS'] = vals['CLASS_COUNT']
    vals['CASE_RENAME_COUNT'] = tsv_rows(os.path.join(tdir2, 'case-rename.tsv'))
    vals['DUP_RENAME_COUNT'] = tsv_rows(os.path.join(tdir2, 'dup-renames.tsv'))
    vals['REFLECT_ROW_COUNT'] = tsv_rows('D:\\chat_work\\finalshell-teardown\\reflect.tsv')
    vals['CLASSINDEX_ROWS'] = tsv_rows(os.path.join(tdir2, 'classindex.tsv'))
    vals['CLASSINFO_ROWS'] = tsv_rows(os.path.join(tdir2, 'classinfo.tsv'))

    # --- tables-lit ---
    lit = 'D:\\chat_work\\finalshell-teardown\\tables-lit'
    vals['STRING_LITERAL_COUNT'] = tsv_rows(os.path.join(lit, 'strings.tsv'))
    vals['NUMBER_LITERAL_COUNT'] = tsv_rows(os.path.join(lit, 'numbers.tsv'))

    # --- lib ---
    jars = [f for f in os.listdir(lib)] if os.path.isdir(lib) else []
    jars = [f for f in jars if f.endswith('.jar')]
    vals['LIB_JAR_COUNT'] = len(jars)
    bl = os.path.join(lib, 'bundled-libs.jar')
    if os.path.exists(bl):
        with zipfile.ZipFile(bl) as z:
            vals['BUNDLED_CLASS_COUNT'] = sum(1 for n in z.namelist() if n.endswith('.class'))
        vals['BUNDLED_LIB_SIZE'] = '{0:.1f}'.format(os.path.getsize(bl) / 1024 / 1024)
    else:
        vals['BUNDLED_CLASS_COUNT'] = None
        vals['BUNDLED_LIB_SIZE'] = None

    # --- tools ---
    tdir_tools = 'D:\\chat_work\\finalshell-teardown\\tools'
    vals['TOOL_COUNT'] = count_files(tdir_tools, '*.java')

    # --- 源码里的统计 ---
    vals['DECOMP_FAILED_COUNT'] = count_pattern_in_tree(jroot, r'decompilation failed \(Vineflower\)')
    vals['DECOMP_FAILED_FILES'] = count_files_with_pattern(jroot, r'decompilation failed \(Vineflower\)')
    vals['REFLECT_CALL_COUNT'] = count_pattern_in_tree(jroot, r'Ref\.h2?\(')

    # --- 编译错误 ---
    if os.path.exists(javac_log):
        with open(javac_log, 'r', encoding='utf-8', errors='replace') as f:
            txt = f.read()
        errs = [l for l in txt.split('\n') if ': error: ' in l]
        vals['ERROR_COUNT'] = len(errs)
        vals['ERROR_FILE_COUNT'] = len(set(l.split(': error')[0] for l in errs))
    else:
        vals['ERROR_COUNT'] = None
        vals['ERROR_FILE_COUNT'] = None

    # --- 仓库体积 ---
    vals['REPO_SIZE'] = '{0:,.0f}'.format(
        sum(os.path.getsize(os.path.join(dp, f))
            for dp, dn, fn in os.walk(repo) for f in fn
            if '.git' not in dp) / 1024 / 1024)

    # --- mainClass ---
    pom = os.path.join(src, 'pom.xml')
    mc = None
    if os.path.exists(pom):
        with open(pom, 'r', encoding='utf-8', errors='replace') as f:
            m = re.search(r'<mainClass>([^<]+)</mainClass>', f.read())
            if m:
                mc = m.group(1)
    vals['MAIN_CLASS'] = mc

    # --- 填占位符 ---
    with open(draft, 'r', encoding='utf-8') as f:
        text = f.read()
    missing = []
    for k, v in vals.items():
        token = '{{%s}}' % k
        if token not in text:
            continue
        if v is None:
            missing.append(k)
            continue
        text = text.replace(token, str(v))

    with open(out, 'w', encoding='utf-8') as f:
        f.write(text)

    print('写出: %s' % out)
    print('已填 %d 个占位符' % sum(1 for k in vals if vals[k] is not None and ('{{%s}}' % k) in open(draft, encoding='utf-8').read()))
    if missing:
        print('未能填（保留占位符）: %s' % ', '.join(missing))
    for k in sorted(vals):
        if vals[k] is not None:
            print('   %-26s = %s' % (k, vals[k]))
    return 0


if __name__ == '__main__':
    sys.exit(main())
