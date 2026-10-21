#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
javac 错误日志分析器。

用法:
    python errscan.py <javac.log> [--src <源码根>] [--top N] [--sample K]

输出:
    1. 错误总览（总数 / 文件数 / 语法错误 vs 语义错误）
    2. 按 (错误种类, symbol kind, location kind) 交叉分类
    3. 每类的代表性样例（文件:行 + 源码上下文）
"""
import re
import sys
import os
import collections

ERR_RE = re.compile(r'^(?P<file>.+?\.java):(?P<line>\d+): error: (?P<msg>.+)$')
SYM_RE = re.compile(r'^\s*symbol:\s+(?P<kind>\S+)\s+(?P<name>.+?)\s*$')
LOC_RE = re.compile(r'^\s*location:\s+(?P<kind>\S+)\s+(?P<name>.*?)\s*$')


def norm_msg(msg):
    """把错误信息归一化，便于聚类。"""
    m = re.sub(r'cannot be converted to \S+', 'X->T', msg)
    m = re.sub(r'\b(class|method|variable|package|constructor)\s+\S+', r'\1 N', m)
    m = re.sub(r'\b\d+\b', 'N', m)
    return m


def parse(log_path):
    """解析 javac 日志，返回错误列表。"""
    with open(log_path, 'r', encoding='utf-8', errors='replace') as f:
        lines = f.read().split('\n')
    errs = []
    i = 0
    n = len(lines)
    while i < n:
        m = ERR_RE.match(lines[i])
        if not m:
            i += 1
            continue
        rec = {
            'file': m.group('file'),
            'line': int(m.group('line')),
            'msg': m.group('msg'),
            'symbol_kind': '',
            'symbol': '',
            'location_kind': '',
            'location': '',
            'src_line': '',
        }
        # javac 错误块：错误行 / 源码行 / ^ / symbol: / location:
        if i + 1 < n and not ERR_RE.match(lines[i + 1]) and lines[i + 1].strip() and \
           not lines[i + 1].strip().startswith('symbol:') and not lines[i + 1].strip().startswith('location:'):
            rec['src_line'] = lines[i + 1].strip()
        j = i + 1
        while j < min(i + 8, n):
            s = lines[j].strip()
            sm = SYM_RE.match(lines[j])
            if sm and not rec['symbol_kind']:
                rec['symbol_kind'] = sm.group('kind')
                rec['symbol'] = sm.group('name')
            lm = LOC_RE.match(lines[j])
            if lm and not rec['location_kind']:
                rec['location_kind'] = lm.group('kind')
                rec['location'] = lm.group('name')
            if ERR_RE.match(lines[j]):
                break
            j += 1
        errs.append(rec)
        i += 1
    return errs


def is_syntax(msg):
    """判断是否语法/结构级错误（这类错误会阻断 javac 的类型检查阶段）。"""
    syntax_markers = (
        'expected', 'illegal start', 'not a statement', 'unclosed',
        'reached end of file', 'class, interface, enum, or record expected',
        'invalid method declaration', 'modifier', 'no interface expected',
        'enum constant expected', 'initializers not allowed',
        'call to super must be first statement', 'already defined',
        'missing return statement', 'unreachable statement',
        'constructor', 'bad operand', 'incompatible types',
    )
    return any(k in msg for k in syntax_markers)


def main():
    args = sys.argv[1:]
    if not args:
        print(__doc__)
        return
    log = args[0]
    src_root = None
    top = 25
    sample = 3
    k = 0
    while k < len(args):
        if args[k] == '--src':
            src_root = args[k + 1]; k += 2
        elif args[k] == '--top':
            top = int(args[k + 1]); k += 2
        elif args[k] == '--sample':
            sample = int(args[k + 1]); k += 2
        else:
            k += 1

    errs = parse(log)
    files = set(e['file'] for e in errs)
    print('=' * 72)
    print('LOG      : %s' % log)
    print('ERRORS   : %d' % len(errs))
    print('FILES    : %d' % len(files))
    syn = [e for e in errs if is_syntax(e['msg'])]
    print('SYNTAX-ish: %d   (这类错误会阻断 javac 的类型检查阶段)' % len(syn))
    print('=' * 72)

    # 交叉分类
    print('\n### 交叉分类 (msg | symbol kind | location kind) ###')
    c = collections.Counter(
        (norm_msg(e['msg']), e['symbol_kind'] or '-', e['location_kind'] or '-') for e in errs)
    for (msg, sk, lk), n in c.most_common(top):
        print('%7d  %-58s | sym=%-10s loc=%s' % (n, msg[:58], sk, lk))

    # 只按 msg 聚合
    print('\n### 按错误信息聚合 top %d ###' % top)
    c2 = collections.Counter(norm_msg(e['msg']) for e in errs)
    for msg, n in c2.most_common(top):
        print('%7d  %s' % (n, msg))

    # 样例
    print('\n### 各类样例 ###')
    groups = collections.defaultdict(list)
    for e in errs:
        groups[(norm_msg(e['msg']), e['symbol_kind'] or '-')].append(e)
    for key, lst in sorted(groups.items(), key=lambda kv: -len(kv[1]))[:top]:
        print('\n--- %s  (sym=%s)  x%d ---' % (key[0], key[1], len(lst)))
        for e in lst[:sample]:
            print('  %s:%d' % (e['file'], e['line']))
            print('     %s' % e['msg'])
            if e['src_line']:
                print('     > %s' % e['src_line'][:150])
            if e['symbol']:
                print('     symbol: %s %s   location: %s %s' % (
                    e['symbol_kind'], e['symbol'], e['location_kind'], e['location']))
            if src_root:
                ctx = show_context(e['file'], e['line'], src_root)
                for ln, txt in ctx:
                    print('       %5d | %s' % (ln, txt[:150]))


def show_context(path, line, src_root):
    p = path
    if src_root and not os.path.exists(p):
        rel = path
        # 去掉构建根前缀
        for pref in ('fsfinal2', 'fsfinal', 'fsb9', 'fsbuildY'):
            idx = rel.find(os.sep + pref + os.sep)
            if idx >= 0:
                rel = rel[idx + 1:]
                break
        p = os.path.join(src_root, rel)
    if not os.path.exists(p):
        return []
    try:
        with open(p, 'r', encoding='utf-8', errors='replace') as f:
            lines = f.read().split('\n')
    except Exception:
        return []
    lo = max(0, line - 6)
    hi = min(len(lines), line + 3)
    return [(i + 1, lines[i]) for i in range(lo, hi)]


if __name__ == '__main__':
    main()
