# HANDOFF — FinalShell 逆向重建工程（2026-10-21 21:55 更新）

> 本文件描述**当前真实状态**。旧版 HANDOFF 里「Round 40 = 0 错误」是**语法门禁造成的假象**，
> 本轮已在干净树上复现并证伪，见 §1。仓库：<https://github.com/mahoushoujyo-eee/finalshell.git>（`main`）

---

## 0. 当前状态（实测）

| 项 | 值 |
|---|---|
| 源码规模 | **5,387** 个 `.java`，16 个 `com.finalshell.*` 语义包（20 个叶包） |
| 当前 javac 错误 | **7,118** 个，涉及 **1,332** 个文件（`temp\fsbuild\kr1.log`，Xmaxerrs=100000） |
| 起点 | 32,377 → 本轮从干净组装树重新修复到 7,118 |
| 类名 | **429 / 5,387** 可读（非混淆形态）；本轮应用 **89** 个有证据的语义改名 |
| 其余类名 | 4,942 个仍是混淆形态，缺少 E1/E2 证据，**不要臆造** |
| 反射别名 | `RegistryAliases` 1,310 个类映射（改名后已同步） |
| 反编译空方法体 | 3,323 处 `UnsupportedOperationException("decompilation failed (Vineflower)")` |
| 资源 | 3,032 个；`lib/` 4 个 jar（bundled-libs 12,764 class） |
| 工具链 | 46 个 Java + Python 修复器（见 `tools/`、`tools/python/`） |

**这不是一个已编译通过的工程。** 目标状态仍是 0 错误；当前剩余错误集中在类型恢复的长尾。

---

## 1. 重要更正：「Round 40 = 0」是门禁假象

javac 在**存在语法错误**时会跳过类型检查。本轮实测：

1. 干净树修完语法后，`jr-R3.log` 只有 **1 个错误**（`C32.java` 的 `.length();` 语法错），看起来「快完成了」。
2. 注释掉这 1 行后重新编译，立刻暴露 **10,245 个类型错误**。
3. 因此**绝不能只看 `errors=`**。判断是否真的收敛，必须同时满足：
   - 语法错误数 = 0；
   - 类型错误数 = 0；
   - javac exit = 0；
   - 最好再做一次「删掉 out 目录后全量编译」。

旧文档里的「0 错误」与当时两个并发管线互相覆盖日志有关，不可复现。

---

## 2. 本轮实际完成

1. **清掉并发污染**：确认 MiniMax agent 会反复启动 `LAST2.ps1`；已加构建锁（见 §7）。
2. **干净重建**：从 `temp\fsbuild\tree210035`（FixVineflower 后的组装树）恢复，按 LAST2 顺序重放：
   - **必须先放 key-first 的 `Ref.java`**（`finalshell-project\src\main\java\com\finalshell\reflect\Ref.java`）；
   - 3 处接口/类修正（C_5、N2_5、Wc2）；
   - 13 处 `new return(...)` 手改补丁 + VC/AutoSelectTab 残片；
   - FixTree 多轮（`new <init>` / prim / array）；
   - FixStruct（super-first 159、bad-operand 897）；
   - `fix_super.py`（剩余 125 个 super：moved 146 / fallback 21 / non-ctor 75 / dup 18）；
   - 阶段 B：fix_varscope（20,476 → 12,619）、FixTree、FixStruct、FixAnnotations。
3. **类型长尾修复**（本轮新增脚本，均在 `temp\fsbuild\`）：
   - `fix_ref_types.py`：把被 javac 指出的 `Object[]` 参数袋声明改为 `Object`（两轮共 3,000+ 处）；
   - `fix_simple_errors.py`：`@Override` 失配（169）、无方法体（117）、int→byte（268）；
   - `fix_boolean.py`：boolean/int 互换、`if (int)`、setBoolean 等（约 400 处）；
   - 处理 `new X;`、`.length();` 残留。
4. **命名**：
   - 应用 `rename-plan\class-rename-proposal-v2.tsv` 中 88 个高置信改动 + `U → MainFrame`，共 **89** 个；
   - 同步更新文件、构造器、引用、`RegistryAliases`（reflect=1 的 51 个）；
   - 生成 `docs/CLASS_INDEX.tsv`（5,387 行）、`docs/STRUCTURE.md`、`docs/NAMING.md`、`docs/RENAME_MAP.tsv`。

---

## 3. 当前错误分布（`kr1.log`）

| 类别 | 数量 |
|---|---:|
| cannot find symbol（variable/method） | 2,831 |
| incompatible types: Object | 417 |
| incompatible types: boolean | 334 |
| incompatible types: int | 249 |
| incompatible types: String | 206 |
| bad operand `<` / `>` / `!=` / `-` / `==` / `>=` | 130 / 92 / 76 / 75 / 74 / 58 |
| incomparable boolean/int | 85 |
| Object[] 相关 | 129 |
| 其余 | … |

主要根因不是「差一点」，而是**反编译器把局部变量/字段类型推断错了**：
- `this` 被当成数值参与算术/比较（如 `int x = this - point.y;`）；
- 数值变量被声明成 `Object`/`Object[]`，方法调用（`append`/`setText`/`ordinal`）找不到；
- enum 降级后丢失 `ordinal()`/`name()`；
- 3,323 个方法体本来就是 Vineflower 反编译失败。

---

## 4. 复现 / 验证命令

```powershell
# 全量编译（推荐，不经 Maven）
& 'C:\Program Files\PowerShell\7\pwsh.exe' -NoProfile -ExecutionPolicy Bypass `
  -File D:\chat_work\temp\fsbuild\verify.ps1 `
  -Log D:\chat_work\temp\fsbuild\kr1.log -Out D:\chat_work\temp\fsbuild\outKr1

# 错误分类
$env:PYTHONIOENCODING='utf-8'
& 'C:\app\Python\Python313\python.exe' D:\chat_work\temp\fsbuild\errscan.py `
  D:\chat_work\temp\fsbuild\kr1.log --top 20 --sample 3

# 已应用的定向修复器（都可 --apply；默认 dry-run）
python D:\chat_work\temp\fsbuild\fix_ref_types.py --log <log> --apply
python D:\chat_work\temp\fsbuild\fix_simple_errors.py --log <log> --apply
python D:\chat_work\temp\fsbuild\fix_boolean.py --log <log> --apply
```

**关键顺序**：`Ref.java` 必须是 key-first，且必须在所有类型工具之前放好；从旧 tree 恢复会丢掉这一步。

---

## 5. 继续工作的优先级

1. **先冻结基线**：不要再并行跑任何 loop；`LOOP.lock`/`QODER_BUILD.lock` 存在时先确认无进程再删。
2. 处理 cannot find symbol 的 2,831 条：
   - 缺变量（`location: class X`）：在方法/类中补声明，类型按使用场景推断；
   - 缺方法（`ordinal`/`append`/`setText`）：给 enum 降级类补 `ordinal()`，或把接收者强转到 `JTextComponent`/`StringBuilder`/`Component`；
3. 处理 `this` 被当数值的算术/比较（bad operand）：这是反编译失真，需要按调用点人工判定，不能简单替换成 0。
4. 处理 boolean/int 长尾（约 300 条）与 `int cannot be dereferenced`（48）。
5. **不要**为了消错而盲改字符串/注释；不要用 `Select-Object -First` 截断 javac 管道。
6. 命名：剩余 4,942 个混淆类名缺证据，先补 E1/E2 证据再改名，并同步 `RegistryAliases`。

---

## 6. 命名与目录

- 全量索引：`docs/CLASS_INDEX.tsv`（路径 / FQN / simple / package / reflect / semantic / status / confidence / evidence）。
- 目录与包统计：`docs/STRUCTURE.md`；命名规范与扩展流程：`docs/NAMING.md`；本轮改名表：`docs/RENAME_MAP.tsv`。
- 命名规范、禁止项、Registry 硬约束见旧版文档与 `docs/rename-plan/registry-alias-design.md`。
- 可读类名 429 / 5,387；**不要**把低置信候选直接批量改名。

---

## 7. 并发与锁（本轮最大坑之一）

- 本机有 **MiniMax Code** agent 会反复启动 `LAST2.ps1`；两条管线同时写 `fsfinal2`、`jz-L*.log` 会让结果完全不可信。
- 已在 `LAST2.ps1` 顶部加 `QODER_BUILD.lock`；`loopType.ps1` 顶部加 `LOOP.lock`。启动前必须确认只有一个 pwsh。
- 检测方法（不要只数 java 进程，轮次间隙会采样为 0）：
  ```powershell
  Get-CimInstance Win32_Process | Where-Object { $_.Name -eq 'pwsh.exe' -and $_.CommandLine -like '*LAST2*' }
  ```
- 杀管线用 `taskkill /PID <pid> /T /F`（整个进程树），不要只杀 java 子进程。

---

## 8. 目录地图

| 路径 | 说明 |
|---|---|
| `D:\chat_work\finalshell-teardown\` | 源 jar + 工具链（46 Java）+ tables |
| `D:\chat_work\finalshell-project\` | `pom.xml`、`lib/`、**手写 key-first Ref.java**、改名表 |
| `D:\chat_work\temp\fsbuild\` | 脚本、日志、组装树、修复器 |
| `D:\chat_work\fsfinal2\` | **当前构建根**（5,387 源码、lib、docs） |
| `D:\chat_work\fsrepo\` | GitHub 工作区 |
| `D:\chat_work\rename-plan\` | 138 行提案、别名表、设计文档 |

关键中间态备份：
- `temp\fsfinal2-kw6-src`：本轮类型修复到 7,087 错误时；
- `temp\fsfinal2-kv6-src`：super 修复后、阶段 B 前；
- `temp\fsbuild\tree210035`：干净组装树（**不含 Ref/手改补丁**）。

---

## 9. 已知限制 / 验收

- 3,323 处方法体是反编译失败占位，运行时必抛 `UnsupportedOperationException`。
- 458 个类自带 `ClassFormatError`、1,282 个类自带 `VerifyError`（原 jar 缺陷）。
- 枚举降级导致失去 `name()/ordinal()/Enum.valueOf`；Ref 泛型化可能引入运行时 `ClassCastException`。
- 当前**未达验收**：`javac exit=0`、`ERRORS=0`、`compiled classes ≈ 5,400` 均未满足。
- 验收时应以 `verify.ps1` 的 `javac exit/ERRORS/syntax/type` 四个数为准，并做一次删除 `out` 目录后的全量编译。
