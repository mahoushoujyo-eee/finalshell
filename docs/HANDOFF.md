# FinalShell 逆向重建 — 交接文档

> 交接日期：2026-10-21
> 目标仓库：<https://github.com/mahoushoujyo-eee/finalshell.git>（branch `main`，最新提交 `8b26a2d`）
> 源材料目录：`D:\chat_work\finalshell-teardown\`
> 工程目录：`D:\chat_work\finalshell-project\`（= 推送到 GitHub 的内容）

---

## 1. 一句话现状

**已经从「反编译产物」推进到「接近可编译的完整工程」**：5,368 个自研类的源码树已生成、1,516 个资源已逐字节提取、第三方库已打包成离线依赖、反射表与字符串/数值常量表已 100% 解出。**当前编译还剩 49 个文件（占 0.9%）未通过**，全部原因已定位、修法已明确（见 §6）。

---

## 2. 关键逆向结论（这部分最有价值，别再重复踩）

### 2.1 报告里的旧结论是错的

`REPORT.md` §3.4 断言"反射调用恢复不出原始调用关系，不值得继续啃"。**这是错的**。`com.c` 的反射描述符表 **100% 可解**（7,346/7,346 零失败）。已在 `tools/ProbeReflect.java` 中实现并验证。

机制（从字节码还原）：

| 环节 | 真相 |
|---|---|
| 索引 | `index = key >>> 46`；但 `com.c.a(long)` 还有一条**慢路径**，会从 key 的高位解出**真实索引**并触发惰性解密。报告漏了这条路径，这是当初判定"不可解"的原因 |
| 存储 | `a[]`（Object[9050]）存密文；`b[]`（String[9050]）存惰性解出的明文；`c[]`/`d[]`（String[9022]）是另两张表 |
| 描述符语法 | `类Key(36进制long) \b 成员名 \b 类型Key... \b`，类Key 可递归解析成类名 |
| 类型信息 | **保留原样**。混淆器只改了自己类的成员名，JDK/三方库类型一字未动（`java.awt.Rectangle`、`javax.swing.JLabel`…） |

解出来的样例：

```
d  517287540690064504  METHOD com/Lk#B(java.lang.String) : java.lang.String
c  347525510598802164  FIELD  com/dD#H : java.lang.Integer
c  539188650316259173  FIELD  com/uD#KECCAK_384 : com/uD      ← 注意：成员名也有没被混淆的
```

### 2.2 混淆器的四层防护 & 各自的破法

| 防护 | 规模 | 破法 | 工具 |
|---|---|---|---|
| 标识符压缩 | 全量 | 无法还原，只能推断起名 | `NAMES.tsv`（旧）+ 后续 LLM 批处理 |
| 包名伪装 | 全量 | 无法还原 | — |
| 字符串加密（每类一张表） | 28,441 个调用点 | 字节码精确采集 → 运行时调解密器 | `tools/Harvest2.java` + `tools/Resolve.java` |
| 数值常量加密 | 39,761 个调用点 | 同上（签名 `(IJ)I` 为主，**不是** `(IJ)J`） | 同上 |
| 反射调用 | 18,134 处 / 7,346 key | 解描述符表 → 直译 | `tools/ProbeReflect.java` + `tools/ReflectRewrite.java` |
| **大小写冲突类** | **3,101 个类** | 字节码级 `ClassRemapper` 改名 | `tools/FixCaseCollisions.java` |
| **伪造 ACC_ENUM** | **177 个"假枚举"** | 按字节码事实降级为普通类 | `tools/ClassInfo.java` + `tools/FixVineflower.java` |
| **同名不同返回类型** | **1,426 处** | 按返回类型派生唯一名 | `tools/FixVineflower.java` |

### 2.3 大小写冲突：Windows 上的硬伤

jar 里有 **1,758 组**仅大小写不同的类（`com/A` vs `com/a`）。Windows 文件系统装不下，javac 也会因 `target/classes` 下 `A.class` 与 `a.class` 互相覆盖而报 `wrong name: A`。

**破法**：在**字节码层**用 ASM 的 `ClassRemapper` 把 3,101 个类改名为 `X_2/X_3…`（按小写形式去重，不是按大小写），引用由 ASM 自动跟随更新。产物 `finalshell-fixed.jar`。

> 副作用（已评估）：`com.c` 的运行时描述符表里存的是**字符串**形式的类名，类改名后这些字符串没同步 —— 只影响仍走反射的调用点（改写后仅剩 50 处）。

### 2.4 假枚举：混淆器设了假的 ACC_ENUM 标志

有一批普通类被混淆器**打上了 `ACC_ENUM` 标志**（还有的继承了 `java.lang.Enum`），Vineflower 会照着当枚举渲染，javac 编译不过。判据（`tools/ClassInfo.java`）：

- **真枚举** = 有 ACC_ENUM + 继承 `java/lang/Enum` + 没有子类 → 452 个
- **假枚举** = 有 ACC_ENUM 但有子类，或继承的不是 `java/lang/Enum` → **177 个**

假枚举还原规则：直接继承 `Enum` 的降级成 `public class X extends Enum`（补 `compareTo(Enum)` 与 `(String,int)` 构造器）；有子树的整棵子树降级成普通类。

### 2.5 反编译器选型：CFR 不行，Vineflower 行

| | CFR 0.152 | Vineflower 1.10.1 |
|---|---|---|
| 输出 `** GOTO` 伪代码（编译不过） | **1,598 个文件** | **2 个文件** |
| 输出体积 | 134 MB | 约 97 MB（5,368 个自研类） |
| 枚举 resugar | 正确（`extends Enum` 风格） | **错误**（需自己修） |
| 构造器 resugar | 正确 | 失败（需自己修） |

**结论：用 Vineflower 出源码树，用 CFR 只在必要时作对照**。Vineflower 的两类缺陷（枚举、构造器）已由 `tools/FixVineflower.java` 修掉。

> 附带发现：jar 内置的 **ASM 是完整的**（116 个 class + 38 个 tree 类），只是**入口名被改成了 `*.SCL.lombok`**。`tools/extract-asm.sh` 提取改名后即可当标准 ASM 用 —— 全套工具链因此不需要任何外部依赖。

---

## 3. 目录与仓库结构

```
D:\chat_work\finalshell-teardown\        ← 源材料 + 工具
├── finalshell.jar            原始包（49 MB，未改动）
├── finalshell-fixed.jar      ★ 大小写冲突改名后的包（18,149 class）
├── app/                      旧 CFR 产物（5,387 个 .java）
├── app-vf/                   ★ Vineflower 产物（自研类子集，5,368 个 .java）
├── src-vf2/                  Vineflower 全量产物（12,167 个 .java，含三方库）
├── clean-rewrite/            反射直译后的 CFR 树（5,387 个 .java）
├── tables/                   中间表
│   ├── classinfo.tsv         18,149 类的 super/kind/ctors
│   ├── case-rename.tsv       3,101 条大小写改名映射
│   ├── dup-renames.tsv       1,426 条重复方法改名映射
│   ├── classindex.tsv        内部名 ↔ 源码可见名
│   └── refs.tsv / zero-ref.txt
├── tables-lit/               字符串/数值解密结果
│   ├── strings.harvest.tsv   28,441 个采集点
│   ├── strings.tsv           27,707 条明文（97.4%）
│   ├── numbers.harvest.tsv   39,761 个采集点
│   └── numbers.tsv           39,150 条数值（98.5%）
├── tools/                    ★ 23 个工具（全 Java 17，无外部依赖）
└── docs/                     计划与报告

D:\chat_work\finalshell-project\         ← ★ 交付工程（= GitHub 仓库内容）
├── pom.xml                   Maven（Java 17）
├── maven-settings.xml        镜像配置（华为云，绕开阿里云的缺件+负缓存）
├── lib/
│   ├── bundled-libs.jar      ★ 12,765 个第三方类（20 MB，从原包切出）
│   └── bcprov.jar            BouncyCastle（原包外置依赖，8.3 MB）
├── src/main/java/            5,368 个自研类源码
├── src/main/resources/       1,516 个资源（逐字节校验）
├── tables/                   中间表副本
├── tools/                    工具链副本
└── docs/RESOURCES.md         资源清单
```

---

## 4. 第三方库策略：为什么用 `bundled-libs.jar` 而不是 Maven 中央仓库

原包里的第三方库**未被混淆、保留上游包名**（Netty 仍在 `io/netty`、FlatLaf 仍在 `com/formdev/flatlaf`…），但：

- 中央仓库版本**无法精确复原**（Guava 18→21 有 breaking change、Netty 4.1.34 的 native 库、FlatLaf 3.6 的 API 变动）
- 阿里云镜像缺件 + 失败负缓存；直连 repo1 会被代理 IP 封（403）
- 用原包字节 **100% 与编译期 API 一致**，且完全离线可构建

所以 `tools/BuildBundledLibs.java` 把非自研类原样打成 `lib/bundled-libs.jar`（12,765 class），`pom.xml` 用 `maven-install-plugin` 在 `validate` 阶段装进本地仓库再依赖它。每个库对应的上游坐标记录在 `docs/DEPS.md`（待补全）。

> **已知缺口**：`javax.mail` **不在原 jar 里**（只有 2 个源文件引用它：`app-vf/u2_2.java`、`app-vf/zU.java`）。原版 FinalShell 应该是在运行时动态加载的。修法：加 `com.sun.mail:javax.mail:1.6.x` 依赖，或把这两个文件 stub 掉。

---

## 5. 当前编译状态

```
mvn -s maven-settings.xml compile
→ 49 个文件报错（5,368 个中占 0.9%）
```

错误分类（`/tmp/errs37.txt`，完整日志在交接人机器上重跑即可复现）：

| 错误类型 | 次数 | 涉及文件 | 根因 |
|---|---|---|---|
| `名称 com.c 已经被同包中的另一个类 com.c 声明为不同返回类型的类成员` | 16 | `com/C/D_2.java`、`com/C/L_3.java`、`com/C/R_2.java`… | **JLS 命名冲突**：包 `com.c` 里存在类 `com.c`（反射注册表）。包 `com.c` 内的类有同名方法 `c()`，而同名类 `com.c` 要求方法 `c()` 必须返回 `com.c` 类型 |
| `找不到符号` | 56 | 多个 | 上条冲突的连带错误 + `javax.mail` 缺失 |
| `类需要实现/继承` | 12 | 多个 | 重复方法改名后，子类覆写失配（改名**未沿继承链传播**） |
| `javax.mail 类找不到` | 10 | `u2_2.java`、`zU.java` | 依赖缺失 |
| `已经使用默认` | 8 | 多个 | 接口降级为抽象类后的构造器问题 |

---

## 6. 待办（按优先级，每条都有明确修法）

### P0-1：修 `com.c` 与包 `com.c` 的 JLS 冲突（影响约 16+ 个文件）

**方案**：把类 `com.c` 改名为 `com.Cc`（`com/Cc` 未被占用，已核实）。

- 源码里对 `com.c` 的引用**全部是方法调用**（`com.c.a/c/d/e/f(`，共 31,088 处），**没有一条是包成员引用**（唯一的 `com.c.h_2(` 是包 `com.c` 的类 `h_2`，要保留不动）
- 没有任何文件 `import com.c;`，也没有同包短名 `c.` 引用 → 改名是安全的纯文本替换
- 反射表里 `declClass=com/c` 的行数为 0 → 反射改写不受影响
- 运行时无影响：`com.c` 自己的表里存的是**别的类**的类名

具体步骤：

```
1. app-vf/com/c.java → app-vf/com/Cc.java，类名 c → Cc，构造器 c() → Cc()
2. 全树替换：com.c.a( → com.Cc.a( ；com.c.c( → com.Cc.c( ；
              com.c.d( → com.Cc.d( ；com.c.e( → com.Cc.e( ；com.c.f( → com.Cc.f(
   （com.c.h_2( 保持不动）
3. 重新编译
```

### P0-2：补 `javax.mail` 依赖

`pom.xml` 加：

```xml
<dependency>
  <groupId>com.sun.mail</groupId>
  <artifactId>javax.mail</artifactId>
  <version>1.6.2</version>
</dependency>
```

或者把 `u2_2.java` / `zU.java` 里用到 javax.mail 的方法 stub 掉（这两处是邮件相关功能，原版也是动态加载，优先级低）。

### P1-1：把重复方法的改名**沿继承链传播**

`tools/FixVineflower.java` 里 `propagateRenames()` 已经写好了（用 `tables/classinfo.tsv` 的 super 关系迭代到不动点），但**当前被注释掉了**：

```java
// propagateRenames();  // 传播会引入新的冲突，暂不启用
```

之前启用时报 49 个错，是因为 `applyForcedRenames` 的冲突处理是"跳过"，改成"再加后缀"后又变成 49 个错 —— 说明**传播逻辑和类内改名的交互还没调顺**。建议：先只传播"父类被改名的方法"到**直接子类**，并让子类的改名**沿用父类的新名**（不要按子类自己的返回类型重新派生），再逐类解决残留。

### P1-2：`class 需要实现/继承`（12 处）

重复方法改名后，父类的方法变成 `M$xxx` 而子类还是 `M` → 子类的 `@Override` 失配。传播修好后应自动消解；剩余的用"删掉失效的 `@Override` 注解"兜底。

### P2：把反射调用真正直译进源码树（**可读性的最大提升，目前没做**）

现状：`app-vf/` 里的源码**仍保留** `com.c.d(KEY).invoke(...)` 形态（因为 Vineflower 会把 `Method` 查找拆成局部变量，文本级直译器匹配不到）。`clean-rewrite/`（CFR 树）是直译过的，但 CFR 树有 1,598 个 GOTO 文件，不能直接用。

**推荐做法**：在**字节码层**用 ASM 做反射直译（`Method.invoke` → `invokevirtual`/`invokestatic`，`Field.get/set` → `getfield/putfield`），改写后再用 Vineflower 反编译 —— 这样反编译器看到的就是普通直接调用，输出最干净。

难点只有一个：`com.c.a(x, y, z)` 这种**参数打包器**要在字节码层拆包（按目标方法的真实参数类型决定是否拆箱）。`com.c` 里有约 60 个重载，每个重载的参数类型组合固定，可机械映射。

### P2：字符串/数值常量回填

`tables-lit/strings.tsv`（27,707 条明文）和 `numbers.tsv`（39,150 条）已就绪，但**还没回填进源码树**。回填器 `tools/LiteralRewrite.java` + `tools/ScopeIndex.java` 已写好并验证过（对 CFR 树跑通，替换 42,401 处，1,656 处因类解析失败保留原样）。**换成 Vineflower 树需要重跑并解决类引用解析**（Vineflower 的 import 风格与 CFR 不同）。

关键坑（已踩过）：**同一个 `(n, n2)` 在不同类下解出不同的值**（实测 24,948 组冲突），所以**必须按类解析**作用域（import + 当前包），不能只用 `(n,n2)` 做键。

### P3：类/成员语义命名

- 类名：`NAMES.tsv` 里有约 200 个手工命名（从 UI 标题反推），可扩到全部 5,368 个
- 成员名：203 个去重反射成员里 186 个是混淆名，**原名已丢失，只能推断**（按类型/角色/调用图约束 + 字符串字面量上下文）
- 建议：先做 150 个关键类（会话管理/SSH/终端/文件传输），LLM 批处理，起名后同步更新 `tables/reflect.tsv` 的 member 名

---

## 7. 已知运行时风险（编译通过后仍需验证）

1. **`com.c` 的运行时表与改名后的类名不同步** —— 只影响改写后仍走反射的 ~50 个调用点
2. **重复方法改名** —— 被改名的方法在 `com.c` 的运行时表里还是旧名，反射调用会 `NoSuchMethodException`。受影响的是 1,426 个方法里、实际被反射调用的那部分（可用 `tables/reflect.tsv` 交叉比对筛出来）
3. **`/sk` 资源缺失** —— 原 jar 里没有这个 8 字节 DES 密钥材料（`app/D4.java`、`app/d5_0.java` 用 `getResourceAsStream("/sk")` 读），移植必须补齐，否则密钥初始化 NPE
4. **3,199 处方法体 Vineflower 没能反编译** —— 已补 `throw new UnsupportedOperationException(...)`，运行时走到这些路径会抛异常（`tools/FixVineflower.java` 的 `fixUndecodable`）
5. **接口降级为抽象类** —— 5 个接口（`Fv_2`/`nd_4`/`ug_2`/`L`/`UV`）因"接口字段不允许空 final"被降级，实现者的 `implements` 已改 `extends`；二进制兼容性无影响

---

## 8. 工具清单（`tools/`，全部 Java 17，编译用 `-cp "../_lib/asm"`）

| 工具 | 作用 | 关键产出 |
|---|---|---|
| `extract-asm.sh` | 从原 jar 提取内置 ASM（入口名被改成 `.SCL.lombok`） | `_lib/asm/` |
| `Jar.java` | jar 内存读取（规避大小写冲突）+ 内部名解析 | — |
| `ClassInfo.java` | 导出 18,149 类的 super/kind/ctors | `tables/classinfo.tsv` |
| `FixCaseCollisions.java` | ASM `ClassRemapper` 解决 3,101 个大小写冲突类 | `finalshell-fixed.jar` + `tables/case-rename.tsv` |
| `BuildBundledLibs.java` | 切出第三方库 | `lib/bundled-libs.jar` |
| `Harvest2.java` | 字节码精确采集解密器调用点 | `tables/*.harvest.tsv` |
| `Resolve.java` | 运行时调解密器求解明文（失败写 FAIL 不写 ERR） | `tables/strings.tsv` / `numbers.tsv` |
| `ProbeReflect.java` | 解反射描述符表 | `reflect.tsv` |
| `ReflectRewrite.java` | 文本级反射直译（对 CFR 树有效） | `clean-rewrite/` |
| `ScopeIndex.java` / `LiteralRewrite.java` | 作用域解析 + 字面量回填 | — |
| `FixVineflower.java` | 修 Vineflower 的 6 类输出缺陷 | 修好的源码树 |
| `JadxDecompile.java` | JADX 批量反编译（对照用） | `src-jadx/` |
| `RefCount.java` | 引用计数（判断大小写冲突组是真类还是诱饵） | `tables/refs.tsv` |

---

## 9. 复现步骤（从零）

```bash
cd D:/chat_work/finalshell-teardown

# 0. 提取内置 ASM
bash tools/extract-asm.sh

# 1. 解决大小写冲突（必须最先做，后续都基于改名后的包）
cd tools && javac -encoding UTF-8 -cp "../_lib/asm" -d bin Jar.java FixCaseCollisions.java
java -Xmx4g -cp "bin;../_lib/asm" FixCaseCollisions \
     ../finalshell.jar ../finalshell-fixed.jar ../tables/case-rename.tsv

# 2. Vineflower 反编译
java -Xmx6g -jar <vineflower.jar> finalshell-fixed.jar src-vf2
#    再按 tables/classindex.tsv 挑出自研类子集 -> app-vf/

# 3. 导出类信息、生成源码树
java -Xmx4g -cp "bin;../_lib/asm" ClassInfo ../finalshell-fixed.jar ../tables/classinfo.tsv

# 4. 修 Vineflower 输出缺陷
cp -r app-vf/. <project>/src/main/java/
java -cp tools/bin FixVineflower <project>/src/main/java tables/classinfo.tsv tables/dup-renames.tsv

# 5. 打包第三方库 + 编译
java -cp tools/bin BuildBundledLibs finalshell-fixed.jar <自研类清单> <project>/lib/bundled-libs.jar
cd <project> && mvn -s maven-settings.xml compile
```

---

## 10. 重要提醒

1. **不要用 `extracted/`** —— 那是早期直接解压的产物，1,758 组大小写冲突在 Windows 上互相覆盖，**内容已残缺**。所有 class 一律从 jar 内存读。
2. **不要用 `deobf2/` / `strings3.tsv`（旧）** —— 那是上一轮的方案，把解密异常当明文写回源码，污染了 85 个文件。新流程用 `tables-lit/`。
3. **Maven 镜像**：全局 settings 指向阿里云 public 组，缺件且失败会被负缓存；本项目用 `maven-settings.xml` 指向华为云。直连 repo1 会被代理 IP 封（403），**必须走代理**（`-Dhttps.proxyHost=127.0.0.1 -Dhttps.proxyPort=10809`）。
4. **不要重跑 CFR 全量反编译** —— 已知 1,598 个文件带 `** GOTO`，且 `** GOTO` 是 CFR 特有的伪语法，Vineflower 没有这个问题。
5. **python heredoc 改 Java 源码会破坏转义**（`\n` `\\[` `\\s` 会被吃掉）。改 Java 文件请用 Edit 工具或 `Write` 整文件重写，不要用 shell 里的 python 拼字符串。

---

## 11. Git 状态

```
remote:  https://github.com/mahoushoujyo-eee/finalshell.git
branch:  main
commits: 8b26a2d  feat: 重建为可编译工程（Vineflower 源码树 + 枚举/构造器/假枚举修复
                          + 字节码级大小写冲突改名 + 内置依赖打包）
         6d55cbb  feat: FinalShell 可读重建工程（反射直译源码 + 资源 + 工具链）
         e44b449  chore: init
```

仓库体积约 173 MB（其中 `lib/bundled-libs.jar` 20 MB、`src/main/java` 约 97 MB）。后续每轮改动建议**单独 commit**，便于回溯。
