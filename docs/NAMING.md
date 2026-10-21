# 命名说明

## 已完成

- 包名已按 16 个语义域组织（core/ui/task/network/crypto/io/connection/config/serialization/util/reflect 等）。
- 本轮按 `docs/rename-plan/class-rename-proposal-v2.tsv` 应用 **89** 个有证据支撑的类名，同步更新文件、引用、构造器与 `RegistryAliases`。
- 每个类的当前名字、包、文件路径、反射状态与改名状态见 `CLASS_INDEX.tsv`。

## 仍需证据的部分

- 当前可读类名 **429 / 5387**，其余 **4958** 个仍是混淆形态。
- 这些类缺少可支撑命名的 E1/E2 证据（继承/接口/字段签名/精确匹配的明文字符串）。提案 `class-rename-proposal-v2.tsv` 已把可确认的高/中置信类收敛到 207 个，其中能落地的就是本轮 89 个。
- 反射类改名必须先登记 `RegistryAliases`（原二进制名 → 新 FQN），否则编译通过但运行时 `ClassNotFoundException`。本轮的 reflect=1 类已全部登记。

## 扩展流程

1. 在提案表补一行（oldFqn、newSimpleName、newPackage、reflect、evidence）。
2. `python tools/python/rename_source.py --apply`（默认 dry-run）—— 字符串/注释屏蔽，按包作用域解析引用。
3. 全量 `javac` 验证；再跑 `build_class_index.py` 刷新本目录文档。
4. 不要凭猜测批量改名；第三方类（vendor-kept）保留原名，按 `vendor-quarantine.md` 处理。
