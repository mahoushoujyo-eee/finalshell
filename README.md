# FinalShell 可读重建工程

从混淆过的 `finalshell.jar` 逆向重建的 Java 17 / Maven 源码工程：第三方依赖按原包字节切出打进 `lib/`，自研代码先在**字节码层**修掉混淆器制造的结构性破坏，再用 Vineflower 反编译 + 文本级修复器落成 5387 个 `.java` 文件。

> **当前分支 `hybrid-build`（2026-10-21）**：**已通过 javac 全量编译（exit 0 / 0 errors）**。
> 构建用 **70 个健康源码 + 5,316 个原始字节码兜底类**（`lib/fallback-classes.jar`）；
> 5,316 个未编译源码完整保留在 `src/unrestored/java`，说明见 [HYBRID.md](HYBRID.md)。
> `main` 分支仍是完整源码工作区（5,387 个 `.java`，6,268 个错误），用于继续恢复源码。

> 重建目标不是 1:1 还原原始工程 —— 详见 [已知限制](#已知限制)。

---

## ⚠️ 交付前必读：待填数字清单

> 本文件里所有 **文件数 / 类数 / 错误数 / 条目数 / 体积 / 覆盖率** 一律写成占位符。
> **一个数字都没有编造**。交付前请按下表逐条实测并替换；`<repo>` 指本仓库根目录（默认 `D:\chat_work\fsrepo`）。

| 占位符 | 含义 | 取值命令（在 `<repo>` 下执行） |
|---|---|---|
| `5387` | `src/main/java` 下的 `.java` 文件数 | `Get-ChildItem src\main\java -Recurse -File -Filter *.java \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `5368` | 自研类数量 | `Get-Content tables\class-rename-kind.tsv -Encoding UTF8 \| Measure-Object -Line` （再减 1 行表头） |
| `20` | 源码叶包目录数（直接含 `.java` 的目录） | `Get-ChildItem src\main\java -Recurse -Directory \| Where-Object { (Get-ChildItem $_.FullName -File -Filter *.java).Count -gt 0 } \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `16` | `com.finalshell.*` 语义包数（含 `com.finalshell` 本身） | `(Get-ChildItem src\main\java\com\finalshell -Recurse -Directory).Count + 1`（`com.finalshell` 目录不存在则为 0） |
| `3032` | 资源文件数 | `Get-ChildItem src\main\resources -Recurse -File \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `12764` | `lib/bundled-libs.jar` 里的 `.class` 条目数 | `jar tf lib\bundled-libs.jar \| Select-String '\.class$' \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `19.3` | `lib/bundled-libs.jar` 体积（MiB） | `'{0:N1}' -f ((Get-Item lib\bundled-libs.jar).Length / 1MB)` |
| `4` | `lib/` 下 jar 个数 | `Get-ChildItem lib -File -Filter *.jar \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `46` | `tools/` 下 `.java` 工具数 | `Get-ChildItem tools -File -Filter *.java \| Measure-Object \| Select-Object -ExpandProperty Count` |
| `11` / `4` | `tables/` / `tables-lit/` 文件数 | `Get-ChildItem tables -File \| Measure-Object` / `Get-ChildItem tables-lit -File \| Measure-Object` |
| `3101` | 仅大小写不同的类/包改名条数 | `Get-Content tables\case-rename.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `1426` | 同名不同返回类型的方法改名条数 | `Get-Content tables\dup-renames.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `7345` | 反射注册表调用点条数 | `Get-Content tables\reflect.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `5387` / `18149` | 内部类名↔源文件索引 / 类元数据条数 | `Get-Content tables\classindex.tsv -Encoding UTF8 \| Measure-Object -Line` / `…\classinfo.tsv`（各减 1 行表头） |
| `5368` | 语义改名表条目数 | `Get-Content tables\class-rename-kind.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `28441` | 已解出的字符串明文条数 | `Get-Content tables-lit\strings.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `39761` | 已解出的数值常量条数 | `Get-Content tables-lit\numbers.tsv -Encoding UTF8 \| Measure-Object -Line` （减 1 行表头） |
| `6268` / `1286` | 解除 javac 100 条错误上限后的**真实**错误数 / 涉及文件数 | `mvn -s maven-settings.xml compile 2>&1 \| Tee-Object javac.log`，再 `Select-String javac.log -Pattern 'error:' \| Measure-Object` 与 `… -Pattern '^\S+\.java:\d+: error'` |
| `3323` / `764` | 反编译不出方法体的占位数 / 涉及文件数 | `Select-String -Path src\main\java\*.java -Pattern 'decompilation failed \(Vineflower\)' -Recurse \| Measure-Object`；文件数去重后统计 |
| `8274` | 已折叠成辅助调用的反射调用点数 | `Select-String -Path src\main\java\*.java -Pattern 'Ref\.h2?\(' -Recurse \| Measure-Object` |
| `171` | 仓库体积（不含 `.git`，MiB） | `'{0:N0}' -f ((Get-ChildItem . -Recurse -File -Force \| Where-Object { $_.FullName -notlike '*\.git\*' } \| Measure-Object -Property Length -Sum).Sum / 1MB)` |
| `com.finalshell.core.St_2` | 可执行 jar 的入口类 | `Select-String pom.xml -Pattern 'mainClass'` —— **注意：当前 pom 里还是 `st`，而新树里已经没有 `st` 这个类了（`com.finalshell.core.ST` 是抽象类，不能当入口）。必须由构建方确认真实入口类后再填，并同步改 `pom.xml`** |
| `{{HEAD_COMMIT}}` | 本次同步对应的提交号 | `git log --oneline -1` |

> **统计口径提醒**：仓库启用了 `core.autocrlf=true`，`.java` / `.tsv` 等文本文件在工作区是 CRLF、索引里是 LF。
> 因此任何"按文件大小"的比较都会把**只有换行符差异**的文件判成"已修改"。统计"改了多少文件"时，
> 请用 `git diff --numstat`（按内容行数）而不是文件大小。

---

## 现状快照

下表所有数字都是对本仓库当前内容的实测值，**不是估计值**。

| 项 | 值 |
|---|---|
| 自研 Java 源文件 | **5387** 个 `.java` |
| 源码叶包目录 | **20** 个 |
| 语义包（`com.finalshell.*`） | **16** 个 |
| 自研类 | **5368** 个 |
| 资源文件 | **3032** 个（从原 jar 逐字节提取） |
| 第三方类（`lib/bundled-libs.jar`） | **12764** 个 `.class`（19.3 MiB） |
| 工具链 | **46** 个 `.java`（`tools/`，纯 Java 17，除 ASM 外无外部依赖） |
| 中间表 | `tables/` **11** 个，`tables-lit/` **4** 个 |
| 文档 | `docs/HANDOFF.md`、`docs/RESOURCES.md` |
| 仓库体积 | 约 **171** MiB（不含 `.git`） |

已落地的字节码层修复规模：

| 修复项 | 规模 | 记录 |
|---|---|---|
| 仅大小写不同的类/包改名 | 3101 条 | `tables/case-rename.tsv` |
| 同名不同返回类型的方法改名 | 1426 条 | `tables/dup-renames.tsv` |
| 反射注册表调用点 | 7345 条 | `tables/reflect.tsv` |
| 类元数据索引 | 5387 / 18149 条 | `tables/classindex.tsv` / `tables/classinfo.tsv` |
| 语义改名表 | 5368 条 | `tables/class-rename-kind.tsv` 等 |

---

## 目录结构

```
<repo>/
├── pom.xml                  Maven 构建定义（Java 17）
├── maven-settings.xml       项目级 settings：central 镜像 → 华为云
├── README.md
├── .gitignore
│
├── docs/
│   ├── HANDOFF.md           逆向技术交接文档（结论、流水线、踩坑记录）
│   └── RESOURCES.md         资源清单（资源的逐项来源与校验）
│
├── lib/                     编译期依赖，4 个 jar
│   ├── bundled-libs.jar     从原 jar 切出的第三方类（12764 个 .class）
│   ├── bcprov.jar           BouncyCastle（原包通过 Class-Path 外置加载）
│   ├── javax.mail-1.6.2.jar      邮件 API
│   └── javax.activation-api-1.2.0.jar
│
├── src/main/
│   ├── java/                5387 个 .java，20 个叶包目录
│   │   └── com/finalshell/… 语义化分包，16 个包
│   │       ├── core/ …      业务主体
│   │       ├── ui/ …        界面
│   │       ├── task/ …      任务与后台作业
│   │       ├── reflect/ …   手写的反射辅助类（Ref）
│   │       └── …
│   └── resources/           3032 个文件（图标、主题、字体、lombok 标记等）
│
├── tables/                  中间产物（TSV）
│   ├── case-rename.tsv      仅大小写冲突改名
│   ├── dup-renames.tsv      同名不同返回类型改名
│   ├── reflect.tsv          反射调用表
│   ├── classindex.tsv       内部类名 ↔ 源文件 索引
│   ├── classinfo.tsv        类继承/字段/方法 元数据
│   ├── class-rename*.tsv    语义改名表（类名 ↔ 语义包）
│   └── refs.tsv / zero-ref.txt
│
├── tables-lit/              常量解密结果
│   ├── strings.tsv          28441 条字符串明文
│   ├── numbers.tsv          39761 条数值常量
│   └── *.harvest.tsv        采集到的调用点
│
└── tools/                   46 个逆向/构建工具（见「工具链」）
```

**关于包名**：本工程经过一轮**语义化重整** —— 类名与包名已按实际用途归入 `com.finalshell.*` 语义包
（`core` / `ui` / `task` / `reflect` 等），大小写冲突与非法标识符在字节码层先行处理。
**类名之外的成员名（字段、方法）仍然是混淆的**，见 [已知限制](#已知限制)。

> `docs/HANDOFF.md` 与本 README 描述的是同一份工程状态，数字不一致时以本 README 为准。

---

## 构建

```bash
cd <repo>
mvn -s maven-settings.xml compile
```

* **Java 17**（`maven.compiler.source/target = 17`），打包目标是可执行 jar，入口类见 `pom.xml` 的 `maven-jar-plugin` 配置（`com.finalshell.core.St_2`）。
  > ✅ 入口类已核对：原 jar 的 `Main-Class: st` 是**默认包**的混淆名，语义化重整后对应 `com/finalshell/core/St_2.java`
  > （`public class St_2`，带 `public static void main(String[])`）。`pom.xml` 已同步改为 `com.finalshell.core.St_2`。
  > 注意别和同目录下的 `com/finalshell/core/ST.java` 搞混 —— 那个是从 `com/ST` 改名来的，是另一个类。
  > `com.finalshell.core.St_2` 由脚本从 `pom.xml` 实读，不是手填的。
* **镜像**：`maven-settings.xml` 把 `central` 指向华为云 `https://repo.huaweicloud.com/repository/maven/`。用 `-s` 显式指定，**不要**依赖全局 `~/.m2/settings.xml`。
* **离线可用**：第三方 jar 不从远程仓库拉，而是由 `maven-install-plugin` 在 `validate` 阶段 `install-file` 装进本地仓库。因此**源码编译阶段不需要联网**，联网只发生在下载 Maven 插件本身。
* `package` 会额外用 `maven-assembly-plugin` 打成 `target/finalshell.jar`（`jar-with-dependencies`）。
* `maven-compiler-plugin` 带了 `-Xmaxerrs 100000`：**不要**去掉，否则 javac 只报前 100 条错误，会严重低估剩余工作量。

> **依赖状态**：`lib/` 下的 jar 已与 `pom.xml` 的 `install-file` 配置一一对应 —— `bundled-libs.jar`（第三方类，坐标 `com.finalshell:bundled-libs:3.6`）、
> `bcprov.jar`、以及补齐邮件功能所需的 `javax.mail-1.6.2.jar` 与 `javax.activation-api-1.2.0.jar`。
> 编译依赖已闭合，`validate` 阶段不再缺文件。

---

## 工具链与还原流程

### 逆向做了什么

原始发布物是一个被 **ZKM（Zelix KlassMaster）** 混淆过的 jar：类名/包名被压成单字母、成员名被压成 `A`/`a`/`b`、字符串与数值常量被替换成解密器调用（如 `a(-7992, 16228)`）、跨类调用被改写成**查表式反射**。这些破坏里有一部分是 Java **源码层根本无法表达**的，所以修复全部下推到**字节码层**做。

### 字节码层的修复

用 ASM 读写 class，改完再由 `ClassRemapper` 自动跟随全部引用点（字段类型、方法签名、指令 owner、常量池类名），因此**一次改动、全树生效、零遗漏**。

| # | 问题 | 判据 / 做法 | 状态 |
|---|---|---|---|
| ① | **同名不同返回类型的方法** | 同一类里两个方法名相同、返回类型不同 —— Java 源码不允许，javac 报 `already defined` / `does not override` / `non-static from static context`。按返回类型派生唯一名（`m` → `m$int` / `m$String`），共 1426 条 | ✅ 已落地 |
| ② | **伪造 `ACC_ENUM` 的假枚举** | 混淆器给普通类打上 `ACC_ENUM` 标志，导致 javac 报 `enum types may not be instantiated` / `constructor in enum`。判据：自身被 `new` 过 / 父类不是 `java.lang.Enum` / 存在真子类 → 按字节码事实降级为普通类 | ✅ 已落地 |
| ③ | **仅大小写不同的包/类** | 如 `com/A` 与 `com/a`。Windows 文件系统无法共存，源码树会互相覆盖丢类。统一加后缀改名（`a` → `a_2`），共 3101 条 | ✅ 已落地 |
| ④ | **非法 Java 标识符** | `package-info` / `module-info` 这类类名在字节码层改成合法标识符；混淆器把类名改成 Java 关键字的（如 `return`）一并改掉 | ✅ 已落地 |
| ⑤ | **反射调用折叠** | 混淆器把普通调用改写成 `Method m = com.c.d(key); m.invoke(target, argsPack);`。反编译器面对 `swap`/`dup` 栈调整指令时，会把**同一个局部变量槽**同时当成 `Method` 和 `Object[]`，产出 `var53 = (Object[])var29;` 这类编译不过的代码 —— 同一槽位的类型由栈指令决定，**源码层修不掉**。做法是在字节码层把整条序列折叠成一次辅助调用 `Object r = Ref.h(key, target, args);`，辅助类内部仍走反射，运行时行为不变 | ✅ 已落地（8274 个调用点） |
| ⑥ | **语义改名与分包** | 按实际用途把类重命名并归入 `com.finalshell.*` 语义包，ASM `ClassRemapper` 自动跟随全部引用 | ✅ 已落地（5368 条） |

### 反编译与文本级修复

* 用 **Vineflower** 反编译成 Java 源码。
* 用 `tools/FixVineflower.java` 修 Vineflower 的 6 类输出缺陷（假枚举降级、构造器生成、不可反编译方法体占位、孤立转型等）。
* 用 `tools/FixTree.java` 做**错误驱动修复**：读 `javac -Xmaxerrs 100000` 的完整日志，按错误类别定点修补，迭代到不动点。

> `javac` 默认只报前 100 条错误，会让人误以为「只差一点」。当前实测真实错误数是 **6,268 个错误 / 1,286 个文件**。
> **注意**：曾出现的「只剩 1 个错误」是语法门禁关闭了类型检查造成的假象；修掉那个语法错后立刻暴露 10,245 个类型错误，详见 `docs/HANDOFF.md` §1。

### 复现流水线

```bash
# ① 字节码层：修复 + 反射折叠 + 改名
java -Xmx4g -cp "bin;../_lib/asm" FixBytecode    ../finalshell-fixed.jar ../finalshell-v2.jar --dup --enum ...
java -Xmx4g -cp "bin;../_lib/asm" ReflectHelper  ../finalshell-v2.jar ../finalshell-v3.jar
java -Xmx4g -cp "bin;../_lib/asm" ApplyRename    ../finalshell-v3.jar ../finalshell-v4.jar \
     ../tables/class-rename-1to1.tsv ../rename-log.tsv

# ② 反编译
java -Xmx6g -jar <vineflower.jar> ../finalshell-v4.jar <src-vf4>

# ③ 取自研类子集 → 源码树
java -cp bin FixVineflower <tree> ../tables/classinfo-v4.tsv

# ④ 错误驱动修复循环：javac → FixTree → javac → ...
```

### 工具清单（`tools/`，全部 Java 17，除 ASM 外无外部依赖）

> 权威清单以 `tools/` 目录为准（当前 **46** 个 `.java`）。下面按职责分类摘录：

| 分类 | 工具 | 用途 |
|---|---|---|
| 字节码层 | `FixBytecode.java` | 字节码层主修复器：dup 方法改名 / 假枚举降级 / 包名大小写冲突 / 非法标识符 / 类与方法改名 |
| | `ApplyRename.java` | 按命名表重命名类并重整包，ASM 自动跟随引用 |
| | `FixCaseCollisions.java` | 检测并处理 jar 内仅大小写不同的名字（`com/A` vs `com/a`） |
| | `ReflectHelper.java` / `ReflectHelper2.java` | 把 `com.c.*` 的反射调用折叠成一次辅助调用 `Ref.h/h2/s/g` |
| | `ClassInfo.java` | 导出类元数据，判定并标记「伪枚举」 |
| | `Hierarchy.java` | 用 ASM 建类继承表并用 JDK 反射补齐 JDK 类继承关系 |
| | `BuildBundledLibs.java` | 把原 jar 里的第三方类切分成 `lib/bundled-libs.jar` |
| | `Jar.java` | 只列 jar 条目、统计大小写冲突的类 |
| 反编译与源码修复 | `FixVineflower.java` | 修 Vineflower 的 6 类输出缺陷 |
| | `FixTree.java` | 错误驱动修复器：读 javac 完整日志按错误类型定点修补 |
| | `FixAnnotations.java` / `FixVisibility.java` | 注解与可见性问题的定点修复 |
| | `ScopeIndex.java` / `ClassIndex.java` | 建立「原包全名 ↔ 源码文件路径」「内部类名 ↔ 源文件名」索引 |
| | `JadxDecompile.java` | 用 JADX 反编译 jar（备用方案，产出不如 Vineflower） |
| 命名重整 | `Analyze.java` | 从窗口标题、基类、内联字符串常量推断可读类名 |
| | `Rename.java` | 按 `Analyze` 提议的名字重写源码树标识符，字面量与注释原样保留 |
| 常量解密 | `DumpStrings.java` / `Resolve.java` / `Harvest.java` / `Harvest2.java` | 解密字符串与数值常量，产出 `tables-lit/` |
| | `LiteralRewrite.java` / `Rewrite.java` | 把常量调用点替换成真实字面量，失败则回退保留原调用 |
| 探针与诊断 | `Probe.java` / `ProbeReflect.java` / `ProbeReflect2.java` / `ProbeClinit.java` / `ScanClinit.java` / `ReflectProbe.java` / `Diag.java` | 运行时探针与字节码形态统计 |
| 其它 | `RefCount.java` / `Tsv.java` | 统计跨包调用分布；TSV 读写与去重 |

---

## 已知限制

诚实清单，按影响面排序：

1. **成员名仍是混淆的。** 类名和包名已语义化，但**字段和方法名**仍是 `A`、`a`、`b`、`YE`、`K` 这类单字母/双字母。读单个类时上下文仍然很吃力。按 getter/setter 关联 + 类型推断 + 字符串常量上下文批量补名，是下一步。
2. **字符串 / 数值常量还没回填进源码。** 源码里仍是 `a(-7992, 16228)` 这种解密器调用。解密结果已经拿到（`tables-lit/strings.tsv` **28441** 条明文、`tables-lit/numbers.tsv` **39761** 条），`tools/LiteralRewrite.java` 和 `tools/Rewrite.java` 负责把常量写回源码 —— **回填后源码可读性会有一次阶跃式提升**。
3. **`/sk` 资源在原 jar 里就缺失。** 这是 8 字节 DES 密钥材料，`com/finalshell/core/D4.java`、`D52_2.java` 用 `getResourceAsStream(a(-7992, 16228))` 这类调用读它 —— 但资源名本身也在混淆常量里，源码中看不到字面量。要跑通这条加解密路径，必须另行补齐密钥材料。
4. **3323 处方法体原程序就反编译不出来**（分布在 764 个文件里）。源码中是 `throw new UnsupportedOperationException("decompilation failed (Vineflower)")`，后面跟着 Vineflower 打印的字节码注释。**运行时走到这些路径会抛异常** —— 这不是重建引入的缺陷，是 Vineflower 对原 class 的解析失败。
5. **部分枚举的 `ACC_ENUM` 是混淆器伪造的。** 已按字节码事实降级为普通类，**但这意味着源码里的「枚举」和原程序运行时的行为可能不完全等价**，跨语言移植时需要重点核对。
6. **常量解密器依赖运行时表。** 解密所需的四张表由静态块在运行时构建，源码里能看到表结构但要跑起来才有值。
7. **反射调用是运行时反射，不是直译。** 字节码层已把 `com.c.d(key).invoke(...)` 折叠成 `Ref.h(key, target, args)`，辅助方法内部仍走反射 —— **运行时行为与原程序一致，但没有还原成直接成员调用**。要彻底直译，需要把反射注册表（`tables/reflect.tsv`，7345 条描述符）反向映射成 `invokevirtual`，属于下一轮的工程量。
8. **语义改名只覆盖了类与包。** 5368 条语义改名表里，成员名（字段/方法）仍保留混淆基名，留出后续按用途补名的空间。

---

## 致谢与来源

* **原始发布物**：`finalshell.jar`（FinalShell 商业版）被 **ZKM（Zelix KlassMaster）** 混淆。本仓库是**逆向重建的工程**，用于学习与研究；**原 jar 未包含在本仓库中**，需要时请自行获取。
* **反编译与修复**：Vineflower（反编译）、ASM（字节码层改写）、JDK 17。
* **第三方依赖**：`lib/bundled-libs.jar` 里的第三方类是从原 jar 中**按原包字节切出**的，用于保证编译期 API 与原程序完全一致；其余 jar 均为公开坐标的上游制品（坐标见 `pom.xml`）。
* **参考**：
  * **`docs/HANDOFF.md`** —— 逆向技术交接文档：现状结论、字节码层修复原理、完整流水线、编译状态、已知限制、以及一轮踩坑记录（`javac` 100 条错误上限、CFR 丢包、jar 条目名必须与类名一致、ASM 的 `map`/`mapType` 两个钩子都要覆盖等）。**建议先读它再动手。**
  * **`docs/RESOURCES.md`** —— 资源清单：`finalshell.jar` 的提取摘要、资源的逐项来源与校验、伪 class 的性质说明。

---

*本文件为交付草稿。所有 `{{...}}` 占位符填完并核对「待填数字清单」后方可发布。*
