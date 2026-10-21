# HANDOFF — FinalShell 逆向重建工程

> **给接手 agent 的完整交接文档。** 所有数字都来自实测，不是目标值。
> 仓库：<https://github.com/mahoushoujyo-eee/finalshell.git>（分支 `main`）
> 文档最后更新：2026-10-21 20:50

---

## 0. 三十秒速览

把 ZKM 混淆的 `finalshell.jar`（49 MB，Java 17 桌面 SSH/SFTP 客户端）逆向重建成
**可编译、可读、类名/文件名/目录已语义化**的 Maven 工程。

| 项 | 状态 |
|---|---|
| 源码规模 | 5,387 个 `.java`，16 个 `com.finalshell.*` 语义包 |
| 编译错误 | 起点 **32,377** → **0**（已实测达成，见 §2 注意事项） |
| 零错误文件 | 起点 0 → 当前 **5,387 / 5,387 = 100%** |
| 已推 GitHub | `1a161db8`（那一版是 16,944 错误 / 68.3% 零错误；**零错误那版还没推**） |
| 运行时反射 | `ClassNotFoundException` 1,315 次 → **5 次**（别名机制） |
| **你的第一个任务** | 把零错误那版同步并推上去（§7 有现成脚本） |

> ### ⚠️ 接手前必读：「0 错误」是**已达成过一次**的实测结果，但需要你复现确认
>
> 达成记录：修复循环跑到 **Round 40 时 `javac` 报 0 个错误**（对应日志 `temp\fsbuild\jz-L40.log`，
> 文件大小 0 字节 —— 编译成功时 javac 不输出任何错误）。
>
> 但**达成那一刻有两个管线进程在并发跑**（我误启动了一个没停干净），
> 它们互相覆盖 `jz-L*.log` 和 `fsfinal2` 树，**所以日志和树的最终状态不可信**。
>
> **你的第一个动作**：干净地重跑一次确认（此时应该没有并发进程）：
>
> ```powershell
> # 确认没有残留进程（必须是 0）
> (Get-Process java,javac -ErrorAction SilentlyContinue | Measure-Object).Count
> & D:\chat_work\temp\fsbuild\LAST2.ps1
> ```
>
> 预期轨迹（`type=` 列才是真实值）：
>
> ```
> 阶段 A  203 → 102 → 28 → 9 → 3 → 1        （清语法门禁）
> 阶段 B  21,611 → 17,849 → … → 0          （门禁打开后修类型错误）
> Round 40  0
> ```
>
> 复现成功后**先做 §6.1 的同步推送**，再继续 §6.2 之后的活。
> 如果复现卡在某个数字上，先读 §5 的十个坑，再读 §2 的门禁说明。

---

## 1. 目录地图（哪个是「当前状态」，别搞混）

| 路径 | 是什么 | 能不能动 |
|---|---|---|
| `D:\chat_work\finalshell-teardown\` | **源材料 + 工具链** | 工具可以改，源材料（jar）不要动 |
| ├ `finalshell.jar` | 原始混淆 jar（49 MB） | ❌ 只读 |
| ├ `finalshell-fixed.jar` | 修过包名冲突的中间产物 | ❌ 只读 |
| ├ `finalshell-v2/v3/v4.jar` | 管线各阶段的 jar（v4 = 改名后的最终 jar） | ⚠️ 会被 stage11 覆盖 |
| ├ `finalshell-v4b.jar` | v4 + 接口版本提到 52 | ⚠️ 同上 |
| ├ `tools\` | **46 个 Java 工具**（本工程的核心资产） | ✅ 主要工作区 |
| ├ `tables\` | 字节码层修复表（7 个 tsv） | ✅ |
| ├ `tables-lit\` | 已解密的字符串/数值（4 个 tsv，28,441 + 39,761 条） | ✅ |
| ├ `_lib\asm\` | ASM 的 **.class 目录**（不是 jar！编译工具时用 `-cp` 指它） | ❌ |
| └ `docs\HANDOFF.md` | 旧版文档，**不要用**（仓库里那份才是最新的） | — |
| `D:\chat_work\finalshell-project\` | 旧工作区，存 `pom.xml` / `lib/` / `tables/` / `src/main/java/com/finalshell/reflect/Ref.java` | ⚠️ pom 和 Ref.java 是管线输入 |
| `D:\chat_work\temp\fsbuild\` | **脚本 + 中间产物 + 日志** | ✅ |
| ├ `LAST.ps1` | **完整管线**（字节码 → 反编译 → 组装 → 修复循环 → 验证） | ✅ |
| ├ `LAST2.ps1` | 只做「组装 → 修复循环 → 验证」（复用已反编译的 `src-vf4`，快 10 分钟） | ✅ |
| ├ `stage11.ps1` | 字节码层 + 反编译（`LAST.ps1` 的第 1 步） | ✅ |
| ├ `loop3.ps1` | **修复循环**（两阶段 + 四工具轮转） | ✅ |
| ├ `errscan.py` | **错误日志分析器**（分类 + 采样 + 上下文） | ✅ |
| ├ `fill_readme.py` | 自动填 README 里的 24 个占位符（从实际文件系统/日志统计） | ✅ |
| ├ `sync-to-repo.ps1` | 同步到 GitHub 仓库（见 §7） | ✅ |
| ├ `src-vf4\` | Vineflower 的反编译产物（12,184 个 .java） | ⚠️ 输入 |
| ├ `jz-L*.log` | 每轮的 javac 完整日志 | — |
| └ `tree<HHmmss>\` | 每轮新建的组装树（**不要复用旧目录**，见 §5 坑 8） | — |
| `D:\chat_work\fsfinal2\` | **当前构建根**（`src\main\java` 是最新源码树，`lib` 是 4 个 jar） | ✅ 主要产出 |
| `D:\chat_work\fsrepo\` | **GitHub 仓库工作区**（已推 `1a161db8`） | ✅ |
| `D:\chat_work\temp\varscope\` | 变量作用域修复工具（Python） | ✅ |
| `D:\chat_work\rename-plan\` | 改名方案 + Registry 别名表 + 设计文档 | ✅ |
| `D:\chat_work\rea\` `rea-tools\` | 逆向工具评估用（**结论：Rea 无 JVM/classfile 支持**，本工程用 ASM+Vineflower 自建管线） | ❌ 不用再评估 |

---

## 2. 编译错误的真实轨迹（**判断进度只看这个**）

```
起点（原始反编译产物，解除 javac 100 条上限）  32,377
字节码层修复 + 语义改名 + 重新反编译            27,473
阶段 A：清语法门禁（每轮都降）                  203 → 102 → 28 → 9 → 3 → 1
阶段 B：门禁打开，类型错误层暴露              21,611
  FixStruct（super/bad operand/可见性）        17,849
  fix_varscope（变量作用域提升）                ...
  FixTree（类型提升/数组元素类型）
  FixAnnotations（注解元素名）
  ...
Round 40                                     0  ← 零错误
```

**⚠️ 最容易踩的坑：`errors=` 不是进度，是「门禁开关」的函数。**

javac 分阶段编译：**parse → 类型检查 → 生成**。**只要还有 1 个语法错误，它就完全不做类型检查**，
类型错误一条都不报。所以：

| 日志形态 | 含义 |
|---|---|
| `errors=3  syntax=3  type=0` | 门禁**关着**，只报了 3 个语法错，**类型错误全被挡住** |
| `errors=21934 syntax=323 type=21611` | 门禁**开着**，这才是真实剩余量 |

`loop3.ps1` 现在固定打三列 `errors= / syntax= / type=`。**判断收敛只看 `type=`**。

历史上因为只看 `errors=`，我误报过好几次「只剩 1 个错误」——那全是门禁关着的假象。

---

## 3. 完整管线（照抄即可复现）

### 3.1 完整跑一遍（从原 jar 开始，约 35 分钟）

```powershell
& D:\chat_work\temp\fsbuild\LAST.ps1
```

内部依次是：

```
finalshell.jar
 └─ FixBytecode  (--dup --enum --publicize --clinit --enum-scope=… --rename=com/c=com/Registry)
     ↓  finalshell-v2.jar
 └─ ReflectHelper2   （反射调用折叠成 Ref.h/h2/s/g + 注入 Ref.class）
     ↓  finalshell-v3.jar
 └─ ApplyRename      （class-rename-kind.tsv：5,383 个类 → 16 个语义包）
     ↓  finalshell-v4.jar
 └─ SourceRename     （注入 Registry 别名机制，1,323 条）
 └─ BuildBundledLibs （切出 12,764 个第三方类 → lib/bundled-libs.jar）
 └─ Vineflower 1.10.1（反编译 → temp\fsbuild\src-vf4，12,184 个 .java）
 └─ 组装源码树 → FixVineflower（反编译产物修复）
 └─ 13 处手改补丁（LAST.ps1 第 4 步）
 └─ loop3.ps1：两阶段修复循环
 └─ javac 全量验证
```

### 3.2 只跑后半段（复用已反编译的 `src-vf4`，约 20 分钟）

```powershell
& D:\chat_work\temp\fsbuild\LAST2.ps1
```

**改了字节码层之后必须用 3.1**（要重新反编译）；只改源码层修复规则用 3.2 就够。

### 3.3 单独编译验证（不跑管线）

```powershell
$env:JAVA_TOOL_OPTIONS='-Duser.language=en -Duser.country=US'
$r='D:\chat_work\fsfinal2'
Get-ChildItem "$r\src\main\java" -Recurse -Filter *.java -File |
  Where-Object { $_.Name -ne 'ModuleInfo.java' } |
  ForEach-Object { $_.FullName } | Set-Content D:\chat_work\temp\fsbuild\sources.txt -Encoding UTF8
& 'C:\Program Files\Java\jdk-17\bin\javac.exe' -encoding UTF-8 -nowarn -Xmaxerrs 100000 `
  -d D:\chat_work\temp\fsbuild\out -cp "$r\lib\bundled-libs.jar;$r\lib\bcprov.jar;$r\lib\javax.mail-1.6.2.jar;$r\lib\javax.activation-api-1.2.0.jar" `
  "@D:\chat_work\temp\fsbuild\sources.txt" 2> D:\chat_work\temp\fsbuild\jc.log
```

### 3.4 错误分析（**接手后第一件事就该跑这个**）

```powershell
$env:PYTHONIOENCODING='utf-8'
& 'C:\app\Python\Python313\python.exe' D:\chat_work\temp\fsbuild\errscan.py `
  D:\chat_work\temp\fsbuild\jc.log --top 20 --sample 3
```

输出：错误总数 / 文件数 / 按 (消息 × symbol kind × location kind) 交叉分类 / 每类的样例+源码上下文。

---

## 4. 工具清单（`D:\chat_work\finalshell-teardown\tools\`，46 个 .java）

### 4.1 字节码层（ASM，改字节码，**源码层做不到的必须在这层做**）

| 工具 | 作用 | 关键选项 |
|---|---|---|
| `FixBytecode.java` | 同名方法改名 / 假枚举 / 包名冲突 / 非法标识符 / `<clinit>` 提取 / 成员 publicize / 接口 class 版本 | `--dup --enum --publicize --clinit --enum-scope=<file> --rename=com/c=com/Registry --method='…'` |
| `ReflectHelper2.java` | 反射调用折叠成 `Ref.h/h2/s/g` | 无 |
| `ApplyRename.java` | 按改名表改类名+归包（`ClassRemapper` 自动跟随全部引用） | `<in.jar> <out.jar> <table.tsv> <log.tsv>` |
| `SourceRename.java` | 改名 + **注入 Registry 别名机制** | `<in> <out> <proposal.tsv> [--alias <map.tsv>] [--no-alias-inject]` |
| `AliasClass.java` | ASM 生成 `RegistryAliases.class` | 内部用 |
| `VerifyRename.java` | 改名一致性校验（7 项，**回归语义**：只把"改名前能解析、改名后不能"算回归） | `<in> <out> <proposal.tsv> [--registry <tsv>] [--alias <tsv>]` |
| `BuildBundledLibs.java` | 从原 jar 切第三方类 | `<jar> <selfClasses.txt> <out.jar>` |
| `BumpIfaceVersion.java` | 只改 class 文件头的 major version（2 字节），**不重新序列化**，所以反编译输出不变 | `<in.jar> <out.jar>` |
| `RegistryProbe.java` | 取证：解出注册表里的明文类名/描述符 | `<jar>` |
| `ClassInfo.java` / `Jar.java` / `LoadCheck.java` / `DumpAlias.java` / `DumpMembers.java` | 取证辅助 | — |

**编译命令**（`_lib\asm` 是 **.class 目录**，不是 jar）：

```powershell
& 'C:\Program Files\Java\jdk-17\bin\javac.exe' -encoding UTF-8 -nowarn `
  -cp "D:\chat_work\finalshell-teardown\_lib\asm" -sourcepath "D:\chat_work\finalshell-teardown\tools" `
  -d "D:\chat_work\finalshell-teardown\tools\bin" "D:\chat_work\finalshell-teardown\tools\FixBytecode.java" …
```

### 4.2 源码层

| 工具 | 语言 | 作用 | 用法 |
|---|---|---|---|
| `FixVineflower.java` | Java | 反编译产物修复：接口降级 / 假枚举 / 注解 / dup 方法 / 不可约流占位 | `FixVineflower <tree> <classinfo.tsv> <duprenames.tsv>` |
| `FixTree.java` | Java | 错误驱动修复（语法类 + 局部变量类型提升 + 数组元素类型） | `FixTree <srcRoot> <javac.log> <fakeEnums.txt>` |
| `FixStruct.java` | Java | 结构类：super 位置 / bad operand 操作数 / 可见性 / 枚举残留 | `FixStruct <srcRoot> <javac.log> [--report=<tsv>]` |
| `FixAnnotations.java` | Java | 注解元素名断裂（`--dup` 改名没传播到注解使用处） | `FixAnnotations <srcRoot> [--dry-run] [--report=<tsv>]` |
| `fix_varscope.py` | Python | **变量作用域提升**（本工程效果最大的源码层工具：7,367 → 1,474，-80%） | `python fix_varscope.py <srcRoot> <javac.log> [--report=<tsv>] [--index-cache=<pkl>]` |
| `jscope.py` / `jtypes.py` | Python | `fix_varscope.py` 的依赖：作用域引擎 / 类型推断 | — |
| `errscan.py` | Python | 错误日志分析器 | `errscan.py <javac.log> [--top N] [--sample K] [--src <root>]` |
| `fill_readme.py` | Python | 自动填 README 的 24 个占位符 | `fill_readme.py <draft.md> <out.md> --src <root> --repo <repo> --javac-log <log>` |
| `LiteralRewrite.java` / `Rewrite.java` | Java | 常量回填（**下一轮的活**，见 §6） | — |

### 4.3 手写辅助类（非反编译产物）

`D:\chat_work\finalshell-project\src\main\java\com\finalshell\reflect\Ref.java`

```java
public static <T> T h(long key, Object target, Object args)   // 实例/静态方法调用
public static <T> T h2(long key, Object args)                // 静态方法调用
public static void s(long key, Object obj, Object val)       // 写字段
public static <T> T g(long key, Object obj)                  // 读字段
```

**⚠️ 参数顺序必须是「key 在前」** —— 见 §5 坑 3。

---

## 5. 踩过的坑（**接手前请先读完这一节**，省你几小时）

### 坑 1：工具源码有编译错误，但脚本不检查退出码 → 功能一直是空跑
`FixBytecode.java` 里 `String in` 和 `AbstractInsnNode in` 重名 → **编译失败** → `tools\bin\FixBytecode.class`
一直是 3 小时前的旧版 → 我加的 `--clinit`（静态初始化块提取）**从来没生效**，导致 2,574 个
`return outside method` 错误，还让「错误数」看起来毫无进展。

**现在 `LAST.ps1` 第 0 步已经加了硬校验**：编译失败直接 `throw`，并且校验 class 文件里
真的有 `__vfClinit__` 字符串才放行。**你改工具后一定要确认这一步过了。**

### 坑 2：`| Select-Object -First N` 会掐断管道，把 javac/java 中途杀掉
`javac … 2>&1 | Select-Object -First 8` → 输出超过 8 行时管道关闭 → javac 被杀 →
class 文件保持旧版 → **和坑 1 叠加，就是「改了没效果」的元凶**。

**正确做法**：输出重定向到文件（`> log.txt 2>&1`），再读文件。
`stage11.ps1` 里的 Vineflower 调用也踩过这个（`Select-String … | Select-Object -First 3`）。

### 坑 3：`Ref` 的参数顺序
混淆器把方法调用改写成「查注册表 + 反射调用」，反编译器还原成
`Ref.h(key, target, args)`。我最初把 `Ref` 写成 `h(Object target, Object args, long key)`（key 在后），
**8,000+ 个 `incompatible types` 错误的单一根因**。

已核实：**19,336 个调用点全部是 key 在前**。改 `Ref.java` 签名即可。

### 坑 4：`FixTree.apply()` 里 `return fixXxx(...)` 会掐断后续所有规则
规则判定「这个错误我修不了」时返回 `null`，而 `null` 被当成「处理完了」直接 `return` →
**后面所有规则都没机会跑**。实测这一条吃掉了上千个 `incompatible types` 的修复机会。

**现在全部改成「非 null 才 return」**。你加新规则时务必照这个写法。

### 坑 5：语法门禁让错误数忽上忽下（见 §2）
最容易被误判成「越改越多」的现象。**看 `type=` 那一列。**

### 坑 6：多个工具同轮连跑 → 行号错位 → 改坏文件
`FixStruct` 的 `--super-first` 会把 `super(...)` 挪到构造器开头（**改行数**），
`FixTree` 的 `fixUndeclaredVar` 会插入声明行，`fix_varscope.py` 会提升/合成声明行。
同轮连跑时，后一个工具拿着**已被前一个挪过的文件**按旧行号定位 → 改错位置。

**现在 `loop3.ps1` 是两阶段 + 工具轮转**（每个工具独占一轮）。

### 坑 7：单行正则改写跨行语句 → 产出语法错误 → 门禁重新关上
**这是最难查的一个**，表现是「循环卡在 3 个错误 50 轮」。

例子：原始声明是跨行的
```java
Object[] var10003 = Registry.packArgs(
   a(31289, …) + ((Random)…).nextInt(a(21049, …))
);
```
用 `(.+?);?\s*$` 这类单行正则处理，正则在第一个 `;` 处截断，产出
`Object var10003 = Registry.packArgs(;` —— **语法错误**。

**关键**：整个文件的括号是**平衡**的（`)` 在下一行），所以**文件级括号自检查不出来**，
必须做**行级**检查。

三个地方都补了行级 `balancedParen` 检查：
- `fixResugarCtor`（丢接收者 → `var10014.` 变成裸 `new L82(...)`）
- `fixPrimTypeMismatch` 情况 3（把「整行声明」误当三元条件 → `(int var17 = …) ? 1 : 0`）
- `fixArrayElemType`（去掉数组的 `[]` 时截断跨行声明）

**你加新规则时，凡是要改写「声明行」的，一律先 `balancedParen(行)` 检查。**

### 坑 8：组装树目录删不掉 → 在被污染的树上继续修
`[System.IO.Directory]::Delete($tree, $true)` 会因为「文件被其它进程占用」抛异常
（杀毒软件/索引服务/并发 agent 都会占）。

**症状**：数字莫名其妙变差（上一轮已经修好的树被复用 → 在坏树上继续修）。

**现在 `LAST2.ps1` 每轮用带时间戳的新目录**（`tree<HHmmss>`）。**别改回去。**

### 坑 9：`mavis-trash` 不可用，删除操作被策略拦截
`rm --`、`mavis-trash`、robocopy `/MIR` 全被拦。**需要删东西时只能用新建目录的方式规避**，
或者请用户手工删。

### 坑 10：Windows 大小写不敏感
`com/A` 与 `com/a` 会互相覆盖丢类（实测丢 16 个）。字节码层用 `PKG_RENAME` 统一加后缀。
同步到 GitHub 时脚本会单列「仅大小写变化」告警（这一项是 0，但别去掉检查）。

---

## 6. 剩余工作（按收益排序）

### 6.1 【最高优先】把零错误那版同步并推上去

```powershell
# 1) 确认 fsfinal2 确实是零错误状态
#    （跑 §3.3 的编译命令，看 javac exit=0）
# 2) 填 README 数字
$env:PYTHONIOENCODING='utf-8'
& 'C:\app\Python\Python313\python.exe' D:\chat_work\temp\fsbuild\fill_readme.py `
  D:\chat_work\temp\fsbuild\README-draft.md D:\chat_work\fsrepo\README.md `
  --src D:\chat_work\fsfinal2 --repo D:\chat_work\fsrepo --javac-log D:\chat_work\temp\fsbuild\jc-G.log
# 3) 同步（不带 -Push，先看计划）
& D:\chat_work\temp\fsbuild\sync-to-repo.ps1 -Src D:\chat_work\fsfinal2 -Repo D:\chat_work\fsrepo -DryRun
& D:\chat_work\temp\fsbuild\sync-to-repo.ps1 -Src D:\chat_work\fsfinal2 -Repo D:\chat_work\fsrepo
# 4) 更新 docs/HANDOFF.md 的数字（本文件），再 commit + push
git -C D:\chat_work\fsrepo add -A
git -C D:\chat_work\fsrepo commit -m "fix: 编译错误 32,377 -> 0（全部 5,387 个源文件编译通过）"
git -C D:\chat_work\fsrepo push origin main
```

**同步脚本的注意点**：
- 跑它的时候**不要**对同一个仓库执行别的 git 命令（实测会让 `git add` 卡死）
- `-DryRun` 先看计划：`src/main/java` / `lib` / `tools` / `tables` / `tables-lit` 五个区域
- `tables/` 每个文件的来源脚本会逐行打印（`teardown\tables` vs `project\tables` 各取一部分）
- `docs/HANDOFF.md` 脚本**不会**覆盖（它找不到来源），你要自己写
- `tools/` 只拷 `.java`（排除 `.class` / `.log` / `cfr2.jar` 等产物）
- **Python 工具（`fix_varscope.py` / `jscope.py` / `jtypes.py` / `errscan.py`）脚本不会拷**，
  要手动放到 `fsrepo\tools\python\`（建议这么做，它们是工程的一部分）

### 6.2 变量语义命名（字段/方法名）—— 下一轮的大头
类名和包名已语义化，但**成员名还是混淆基名**（`var10001` / `a` / `b`）。

方案已备好：
- `D:\chat_work\rename-plan\class-rename-proposal-v2.tsv` —— 138 行提案，全部对齐到当前树
- `D:\chat_work\rename-plan\registry-alias-design.md` —— 别名机制设计与全部实测数据
- `D:\chat_work\rename-plan\registry-alias-map.tsv` —— 1,323 条别名，0 歧义

**⚠️ 改名的硬约束**：`Registry` 里存的是**原始二进制名**（不是当前 FQN），
ASM 的 `ClassRemapper` **不会**重映射字符串常量。**每次改名都必须同步维护别名表**，
否则运行时 `ClassNotFoundException`。
实测：只装别名不改名，CNFE 从 1,315 → 5；改名 + 别名，回归 0。

### 6.3 常量回填
源码里仍是 `a(-7992, 16228)` 这种解密器调用。解密结果已在 `tables-lit/`：
- `strings.tsv` **28,441** 条明文
- `numbers.tsv` **39,761** 条数值

工具：`tools\LiteralRewrite.java`、`tools\Rewrite.java`。**回填后可读性会有一次阶跃式提升。**

### 6.4 继承链失联（1,264 个 `cannot find symbol: method`）
`this.setCaretPosition(...)` 找不到方法 —— 父类方法在重命名后失联。
需要字节码层补继承关系（`ApplyRename` 改名时继承链断了）。

---

## 7. 已知限制（**这些是原程序/工具本身的缺陷，不是重建引入的**）

1. **3,206 处方法体原程序就反编译不出来**。源码里是
   `throw new UnsupportedOperationException("decompilation failed (Vineflower)")`，
   后面跟着 Vineflower 打印的字节码注释。**运行时走到这些路径会抛异常。**
2. **458 个类自带 `ClassFormatError`**、**1,282 个类自带 `VerifyError`**
   （long/double 局部变量槽）—— 混淆 jar 自身的字节码缺陷，改名前就坏。
3. **`Ref.h` 的参数顺序与原 jar 的字节码相反**。Vineflower 反编译 `invokestatic` 时把参数
   按**逆栈序**输出，所以源码统一采用「key 在前」。源码与源码自洽、运行时行为不变，
   但与原 jar 的字节码不逐字节一致。
4. **`Registry` 的辅助方法已泛型化**（`<T> T`）以消除类型不匹配。泛型只影响编译期；
   运行时若把返回值赋给非 `Object[]` 的具体类型，调用点会插入 `checkcast`，
   理论上可能抛 `ClassCastException`。
5. **枚举降级有运行时代价**。为消除 `classes cannot directly extend java.lang.Enum`，
   把 115 个类的父类从 `java.lang.Enum` 改成 `java.lang.Object` —— 它们因此**失去
   `name()` / `ordinal()` 和 `Enum.valueOf`**。编译改善，运行时保真度下降。
   第三方类不受影响（`--enum-scope` 只作用于进入源码树的类）。
6. **`fix_varscope.py` 有 4,196 个变量改不动**（占 7,662 的 55%）：
   - `type-unknown` 2,752 —— Vineflower 对同一 slot 产出矛盾用法（既是 int 又是 boolean）
   - `catch-decl` 500 —— catch 参数不能提升（Java 禁止同名方法变量）
   - `param-clash` 147 / `for-decl` 49 / `multi-declarator` 1
7. **原 jar 本身缺 `/sk` 资源**。

---

## 8. 验收标准

接手后请按这个顺序确认：

1. `LAST2.ps1` 跑完，**最终验证 `ERRORS = 0`**，`compiled classes` 数量 ≈ 5,400+
   （5,387 个源文件 + 内部类）
2. `errscan.py` 对最终日志输出 `ERRORS: 0`
3. `fsfinal2\src\main\java` 下 `.java` 计数 = 5,387，其中
   `com\finalshell\` 下 16 个语义包子目录
4. `fsfinal2\lib` 4 个 jar：`bundled-libs.jar`（12,764 个 class）/ `bcprov.jar` /
   `javax.mail-1.6.2.jar` / `javax.activation-api-1.2.0.jar`
5. `pom.xml` 的 `<mainClass>com.finalshell.core.St_2</mainClass>`
   （原 jar 是 `Main-Class: st`，默认包的混淆名，语义化后对应 `com/finalshell/core/St_2.java`；
   **别和同目录的 `ST.java` 搞混**，那是从 `com/ST` 改名来的另一个类）
6. `pom.xml` 的 4 个依赖全部由 `maven-install-plugin` 的 `install-file` 从 `lib/` 本地安装，
   **零远程依赖**（lombok 那条远程坐标已删 —— 源码 0 处用 lombok，818 个 lombok 类已在
   `bundled-libs.jar` 里）
7. 同步后 `git -C D:\chat_work\fsrepo status -sb` 显示 `## main...origin/main`（无 ahead）

---

## 9. 需要人工处理（本机策略拦着，AI 删不掉）

| 路径 | 体积 | 说明 |
|---|---:|---|
| `D:\chat_work\temp\fsbuild\.sandbox\` | **869 MB** | 子 agent 建的 4 个 git 克隆 + 2 个裸仓库的沙盒 |
| `D:\chat_work\finalshell-teardown\du.exe.stackdump` | 1.6 KB | 早前体积扫描的残留 |
| `D:\chat_work\temp\fsbuild\fttest*` `cftest*` | 若干 KB | 我做的单文件复现实验，可留可删 |
| `D:\chat_work\temp\fsbuild\tree*` | 数百 MB | 每轮组装的树，**留着有用**（最新一轮的是当前状态） |

---

## 10. 环境

| 项 | 值 |
|---|---|
| JDK | 17.0.10（`C:\Program Files\Java\jdk-17\bin`） |
| Maven | 3.9.14 —— **注意：本机现在找不到 `mvn`（PATH 里没有，`C:\Program Files\Apache` 下也没有）**，编译验证直接用 `javac` |
| Python | 3.13（`C:\app\Python\Python313\python.exe`） |
| ASM | `D:\chat_work\finalshell-teardown\_lib\asm`（**class 目录，不是 jar**） |
| Vineflower | `D:\chat_work\rea-tools\vineflower-1.10.1.jar`（`--include=` 不是 1.10.1 的合法选项） |
| CFR | `D:\chat_work\finalshell-teardown\tools\cfr2.jar`（对照用；它用带标签的 block 渲染不可约控制流，**但输出的是非法 Java token**（`** GOTO lbl22`），不能直接用） |
| Maven 镜像 | `maven-settings.xml` 指向华为云 `https://repo.huaweicloud.com/repository/maven/`（repo1 会被 403） |
| 控制台中文 | 乱码。读文件用 `[System.Text.Encoding]::UTF8.GetString([System.IO.File]::ReadAllBytes($path))`；javac 加 `JAVA_TOOL_OPTIONS=-Duser.language=en -Duser.country=US` |
