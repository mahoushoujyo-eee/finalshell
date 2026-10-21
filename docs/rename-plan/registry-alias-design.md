# Registry 别名机制设计

- 生成时间：2026-10-21
- 对象：`D:\chat_work\finalshell-teardown\finalshell-v4b.jar`（18,150 个 class）
- 结论一句话：**Registry 把类名加密成字符串**存进静态数组，运行时解密后用
  `Class.forName(String)` 解析。ASM 的 `ClassRemapper` **不会**跟随这些字符串，
  所以改名必须配别名机制，否则运行时 `ClassNotFoundException`。
- 附带发现：**当前构建的反射其实已经大面积失效**（早先的"搬包"改造把 1,941 个
  默认包类搬进 `com.finalshell.*`，但 Registry 里的明文没跟着改）。本文档的别名
  表同时修掉了这个既有缺陷。

---

## 0. 结论先行

| 问题 | 实测答案 | 证据 |
|---|---|---|
| Registry 存的是 `Class` 常量还是字符串？ | **字符串**（加密后存进 `String[]`，运行时解密） | `Registry.java:9330-9347`；`RegistryProbe` 跑出 1,499 条明文类名 |
| ASM `ClassRemapper` 会自动跟随吗？ | **不会** | 明文不是常量池里的 `CONSTANT_Class`，是运行时 XOR 解出来的字符串 |
| 需要额外机制吗？ | **需要** | 改名后 `Class.forName("旧名")` 必然 `ClassNotFoundException` |
| 引用总数 | 1,499 个类名字符串 + 7,377 条字段/方法描述符，共 8,876 个可达下标 | `registry-v4b.tsv` |
| 其中走 `forName` 的 | 1,491（另 8 个槽里存的是 `Class` 常量，不走 `forName`） | `RegistryProbe` 的 `slotType` 列 |
| 现状 | 1,499 条里**只有 13 条**能在当前 jar 里解析成功 | `RegistryResolveTest` 实跑 |
| 装别名后 | **1,486 条由「解析不到类」变成「解析到类」**，`ClassNotFoundException` 1,486 → **5** | `VerifyRename` 校验项 5 实测 |
| 剩余 5 条 | `=:`、`com._1`、`[LOY;`、`[LuD;`、`[Lci;` —— 改名前就解析不了，属**既有坏条目** | 对照组实测 |
| 改名是否引入回归 | **0**（对照组 = 只装别名不改名，两组运行时数字完全一致） | 见第 4.4 节 |

---

## 1. Registry 的实际结构（读源码 + 实跑确认）

`com/finalshell/reflect/Registry.java`（反编译产物，11,142 行）有 4 个静态数组：

```java
public static Object[] a;   // 9,050 个槽：要么是 Class 常量，要么是加密字符串
public static String[] b;   // 9,050 个槽：a[] 的解密缓存
public static String[] c;   // 9,022 个槽：加密字符串池
public static String[] d;   // 9,022 个槽：c[] 的解密缓存
```

关键方法（源码行号来自 `fsfinal2/src/main/java/com/finalshell/reflect/Registry.java`）：

```java
// Registry.java:16   解密 a[idx] -> b[idx]
public static int decryptInt(long var0) {
   int var2 = (int)(var0 >>> 46);          // 下标藏在 long 的高 16 位
   if (b[var2] != null) return var2;       // 解过就复用
   Object var3 = a[var2];
   if (!(var3 instanceof String)) return var2;   // 槽里是 Class 常量，不是字符串
   byte var4 = <由 (var0 >>> 42) & 63 选出的 1~63 的 XOR 种子>;
   int[] var5 = new int[6];                // 6 个 7bit 分片，来自 long 低 42 位
   ...
   b[var2] = new String(var10);            // XOR 解密
   return var2;
}

// Registry.java:9330   按 key 解析类
public static Class lookupClass(long var0) {
   int var2 = decryptInt(var0);
   Object var4 = a[var2];
   if (var4 instanceof String) {
      var3 = Class.forName(b[var2]);       // <== 就是这里，靠字符串解析
      a[var2] = var3;                       // 解析成功后回填 Class，之后走快速路径
      return var3;
   }
   return (Class)var4;                      // 槽里本来就是 Class 常量
}
```

字段/方法描述符（`Registry.java:9378` / `Registry.java:9463`）也走同一条路：

```
明文格式:  <ownerKey:base36> \x08 <成员名> \x08 <typeKey:base36>
ownerKey / typeKey 是 long 的 base36；long 的高 16 位就是 a[]/b[] 的下标。
lookupField -> lookupClass(ownerKey) -> Class.forName(b[ownerIdx])
```

**所以三种可能的引用形式里，命中的是第 2 种：**

| 形式 | 是否命中 | 说明 |
|---|---|---|
| (a) 常量池里的 `Class` 引用 | ✗ | 只有 `a[]` 里少数槽是 `Class` 常量（如 `void.class`、`int.class`），它们**不经过 forName** |
| (b) **加密的字符串类名** | **✓** | 1,499 个槽的明文就是类名，靠 `Class.forName` 解析 |
| (c) `long key -> 类名` 的映射表 | ✓（是 (b) 的间接形式） | key 的高 16 位是下标，下标指向 (b) |

### 1.1 实证：`RegistryProbe`

`D:\chat_work\finalshell-teardown\tools\RegistryProbe.java` 做两件事：

1. **静态扫** jar，找出所有传给 `Registry.lookupClass/lookupField/lookupMethod`
   以及 `Ref.h/h2/s/g` 的 `long` 常量；
2. **运行时**把 `Registry` 加载起来，逐个 key 调 `decryptInt(key)` 解密，
   把 `b[]` 的明文导出来；再做**不动点迭代**把「描述符里嵌套的 base36 类 key」
   也一并解开。

实测输出（`finalshell-v4b.jar`）：

```
lookup call sites: {Ref.g=10185, Ref.h=8523, Ref.h2=2168, Ref.s=2510,
                    Registry.lookupField=5027, Registry.lookupClass=7, Registry.lookupMethod=2}
distinct long keys: 7378
loaded registry class: com/finalshell/reflect/Registry
Registry.a.length=9050  Registry.b.length=9050
round 1: known indices=8876 newKeys=20731
indices known      = 8876
  CLASS entries    = 1499
  DESCR entries    = 7377
  PRIM entries     = 0
  EMPTY entries    = 0
distinct classes referenced by CLASS entries = 1499
distinct classes referenced inside DESCR     = 1499
```

### 1.2 解密结果的正确性交叉验证

解密算法不是猜的 —— 上一轮产出的 `D:\chat_work\finalshell-teardown\reflect.tsv`
（7,345 行字段描述符）与本次 `RegistryProbe` 的明文**逐条比对**：

```
reflect.tsv descr == probe plaintext: 7345 / 7345
（reflect.tsv 里 \x08 写成字面量 "\b"，probe 里是原始 0x08 字节，其余完全一致）
```

抽样（index / key / 两侧明文）：

```
1676  117953996710605202  tq73qq1w3wi\bF\btqmja0l2yqw   ==  tq73qq1w3wi<0x08>F<0x08>tqmja0l2yqw
1681  118316303023401757  4xdf59ra746\bSHA3_384\b...    ==  4xdf59ra746<0x08>SHA3_384<0x08>...
```

---

## 2. 既有缺陷：当前构建的反射已经大面积失效

`Registry` 的明文存的是**混淆器打包前的原始二进制名**。实测：

| 事实 | 数值 | 来源 |
|---|---:|---|
| 原始 jar `finalshell.jar` 的默认包类 | 1,942 | `zipfile` 统计 |
| 当前 jar `finalshell-v4b.jar` 的默认包类 | **2**（只剩 `ModuleInfo` / `ComKitfoxSvgPackageInfo`） | 同上 |
| 当前 jar 的 `com/finalshell/**` 类 | 5,328 | 同上 |
| Registry 明文里属于项目类的 | **1,324**（1,284 个默认包简单名 + 40 个带包名） | RegistryProbe × 原始 jar 类清单 |
| 这些明文里，当前 jar 能直接 `Class.forName` 成功的 | **13** | `RegistryResolveTest` 实跑 |

也就是说：**1,311 个项目类的反射入口在当前构建里已经 404 了**，
表现就是 `java.lang.RuntimeException: java.lang.ClassNotFoundException: <原始名>`。

这不是本轮改名引入的，是早先"搬包"改造（`ApplyRename` 把默认包类搬进
`com.finalshell.*`）留下的。README §4 担心的"改名后运行必炸"，
其实**已经炸了**，只是没人跑过反射路径。

> 实测样本（`finalshell-v4b.jar`，前 400 条 CLASS 明文）：
> `ok=71 fail=329`，失败信息形如
> `java.lang.RuntimeException: java.lang.ClassNotFoundException: dM`。

---

## 3. 机制设计

### 3.1 选型

| 方案 | 做法 | 评价 |
|---|---|---|
| **A. 别名表 + `lookupClass` 钩子（本方案）** | 生成 `com.finalshell.reflect.RegistryAliases`，把 `Registry.lookupClass` 里的 `Class.forName` 换成 `RegistryAliases.forName` | **采用**。不动加密表；改动面只有一个方法；可审计、可回滚；源码级改名立即可用 |
| B. 改写 Registry 加密数组 | 把加密表里的类名换掉，重新加密 | 成本高、风险大（1,499 条 + 7,377 条描述符），只适合最终清理 |
| C. 反射类一律不改名 | 只改 4,010 个非反射类 | 留下大量混淆名，且**修不了**第 2 节那个既有缺陷 |

### 3.2 别名表的键和值

- **键**：Registry 里实际存着的那个字符串 —— 也就是**原始混淆二进制名**
  （默认包简单名如 `dM`、`YB`；带包的如 `com.X`）。
  ⚠️ **不能**用当前 FQN 当键：当前 FQN 是搬包之后的名字，Registry 里根本没有。
- **值**：该类**当前**的二进制名；改名后是**改名后**的新二进制名。

所以别名表实际是三段映射的复合：

```
Registry 明文（原始名）  --[applied-rename.tsv]-->  搬包后的当前 FQN  --[改名表]-->  新 FQN
```

### 3.3 别名表怎么生成

`D:\chat_work\rename-plan\make-registry-alias.py`，输入四份证据：

| 输入 | 作用 |
|---|---|
| `applied-rename.tsv`（`temp\fsbuild\`） | 搬包改造的真实记录：当前内部名 → v3 名 |
| `finalshell.jar` | 原始 jar 的类清单，判断某个原始名当初存不存在 |
| `registry-v4b.tsv`（`RegistryProbe` 产出） | Registry 的 1,499 条明文 + 7,377 条描述符 |
| `members-v4b.tsv`（`DumpMembers` 产出） | 当前每个类**声明**的成员名 + 描述符 |

#### 明文规则（实测确认，1:1 无歧义）

搬包改造后的 **v3 名保留了包路径**（例如 `com/CL`、`com/nh_4`），
只在同一命名空间内撞名时加 `_2`/`_4` 消歧后缀。
所以：

```
Registry 明文 = v3 名的简单名去掉消歧后缀 + 包路径换成点
```

实测样本（`applied-rename.tsv` 的 v3 名 → Registry 明文）：

| 当前类 | v3 名 | Registry 明文 | 原始 jar 里存在 |
|---|---|---|---|
| `com.finalshell.core.CL` | `com/CL` | `com.CL` | `com/CL.class` ✓ |
| `com.finalshell.ui.panel.CL` | `CL` | `CL` | `CL.class` ✓ |
| `com.finalshell.core.Q_2` | `com/Q` | `com.Q` | `com/Q.class` ✓ |
| `com.finalshell.ui.listener.PrivateKey` | `Q` | `Q` | `Q.class` ✓ |
| `com.finalshell.core.CK` | `CK` | `CK` | `CK.class` ✓ |
| `com.finalshell.ui.panel.Loading` | `nh_2` | `nh` | `nh.class` ✓ |
| `com.finalshell.task.Nh4` | `com/nh_4` | `com.nh` | `com/nh.class` ✓ |
| `com.finalshell.ui.model.Ba2` | `Ba_2` | `Ba` | `Ba.class` ✓ |
| `com.finalshell.core.Cy4` | `cy_4` | `cy` | `cy.class` ✓ |

**这条规则给出的是 1:1 映射，不需要任何启发式消歧。**
（早期版本用"简单名去后缀"做候选再靠成员名消歧，会在 `CL`/`com.CL` 这种
"默认包和 `com/` 包同名"的场景下把两个原始类混为一谈；本规则避开了这个坑。）

#### 备用消歧（保留在脚本里，作为交叉校验）

Registry 的字段/方法描述符明文形如：

```
明文:  <ownerKey:base36> \x08 <成员名> \x08 <typeKey:base36>
```

owner 类一定**声明**了那个成员（`lookupField` 先 `getDeclaredFields` 再按接口往上找），
而 typeKey 指向的类必须是宿主某个成员的类型。
脚本用这两条约束做交叉校验：候选类是否声明了那个成员、成员描述符里是否出现候选类的内部名。

实测消歧结果（作为 1:1 规则之外的独立证据）：

```
loaded members for 5198 project classes
DESCR owner indices: 1209
wrote registry-alias-map.tsv  entries=1323
  already-current=13  no-candidate=7535  unique=1310
  alias targets missing from current jar: 0
  ambiguity report -> registry-alias-ambiguous.tsv (0 rows)
```

**1,323 条别名，1,310 个候选唯一，0 条歧义，0 条指向不存在的类。**
另外 `registry-alias-map.tsv.plaintext.tsv` 给出「当前类 → Registry 明文」的权威映射，
并逐条校验别名是否指向它自己：`aliasCheck MISMATCH(in-registry)=0`。

### 3.4 注入方式（字节码层，不碰源码树）

`SourceRename.java` 在写 jar 时做两件事：

1. **生成** `com/finalshell/reflect/RegistryAliases.class`（ASM 直接生成字节码，
   不依赖运行时有没有 javac）：
   ```java
   public final class RegistryAliases {
       private static final java.util.Map MAP;    // 原始名 -> 新名
       public static String resolve(String name);            // 查表，不命中原样返回
       public static Class forName(String name);              // 查表 + Class.forName
   }
   ```
   `forName` 失败时抛的 `ClassNotFoundException` 里带 `旧名 -> 新名`，
   避免线上排查时看不出到底哪个类没对上。

2. **改写** `Registry.lookupClass`：把
   `INVOKESTATIC java/lang/Class.forName(Ljava/lang/String;)Ljava/lang/Class;`
   换成
   `INVOKESTATIC com/finalshell/reflect/RegistryAliases.forName(Ljava/lang/String;)Ljava/lang/Class;`

   **描述符完全一致**，所以栈图、异常表、frames 都不用动；
   `lookupClass` 原有的 `catch (Exception)` 会把 `ClassNotFoundException`
   包成 `RuntimeException`，与原行为一致。

`lookupField` / `lookupMethod` 都经由 `lookupClass` 解析 owner 和 type，
所以**只改这一个方法就覆盖了全部 1,499 个类名入口和 7,377 条描述符**。

---

## 4. 可验证的证据

### 4.1 改名流水线

```powershell
java -cp "<tools\bin>;<_lib\asm>" SourceRename `
    D:\chat_work\finalshell-teardown\finalshell-v4b.jar `
    D:\chat_work\temp\renametest\pilot-renamed.jar `
    D:\chat_work\temp\renametest\pilot-20.tsv `
    --alias D:\chat_work\rename-plan\registry-alias-map.tsv `
    --log  D:\chat_work\temp\renametest\pilot-rename-log.tsv
```

实测输出：

```
proposal entries: 20
classes to rename: 20  (missing=0  collision=0)
alias entries: 1297
injected com/finalshell/reflect/RegistryAliases.class  entries=1297
entries renamed=20  unchanged=18130  registry patched=1
wrote ...\pilot-renamed.jar  size=31863379
```

### 4.2 校验器

```powershell
java -cp "<tools\bin>;<_lib\asm>" VerifyRename `
    D:\chat_work\finalshell-teardown\finalshell-v4b.jar `
    D:\chat_work\temp\renametest\pilot-renamed.jar `
    D:\chat_work\temp\renametest\pilot-20.tsv `
    --registry  ...\registry-v4b.tsv `
    --alias     D:\chat_work\rename-plan\registry-alias-map.tsv
```

逐项实测结果见本轮交付报告。校验项 5 的运行时部分是真的把改完的 jar 加载起来，
逐条调 `Registry.lookupClass(key)`，统计 `ClassNotFoundException`。

### 4.3 三组实测对照

| 指标 | A) 原始 jar<br>（无别名、无改名） | B) 对照组<br>（只装别名，不改名） | C) 试验组<br>（20 个改名 + 别名） |
|---|---:|---:|---:|
| Registry CLASS 明文总数 | 1,499 | 1,499 | 1,499 |
| 运行时 `lookupClass` 解析成功 | 175 | 212 | **212** |
| `ClassNotFoundException` | **1,315** | 5 | **5** |
| 其它错误（类自身字节码缺陷） | 1,009 | 1,282 | 1,282 |
| **改名造成的回归** | — | — | **0** |

- **A → B**：别名机制把 1,310 个「解析不到类」变成「解析到类」。
  `ClassNotFoundException` 从 1,315 降到 5。
- **B → C**：加上 20 个改名后，运行时数字**一字不差** ⇒ 改名没有引入任何回归。
- 剩下的 5 条 `ClassNotFoundException` 是 `=:`、`com._1`、`[LOY;`、`[LuD;`、`[Lci;`，
  **改名前就解析不了**，是 Registry 里的既有坏条目（详见 `registry-alias-ambiguous`）。
- 1,282 条「其它错误」是混淆 jar 自身的字节码缺陷（`ClassFormatError: Illegal exception
  table range`、`VerifyError: Bad type on operand stack`），
  与改名无关 —— 见第 4.5 节的类加载基线。

### 4.4 编译错误数对比（改名前后）

流水线（两边完全一致）：

```
finalshell-v4b.jar / pilot-renamed.jar
  -> Vineflower 1.10.1 反编译
  -> 只取 com/finalshell/** + com/apple/** + 默认包两个类
  -> FixVineflower（classinfo-v4.tsv + dup-renames）
  -> 上一轮总结的 13 处手工修复
  -> javac -encoding UTF-8 -nowarn -Xmaxerrs 100000
       -cp "D:\chat_work\fsfinal2\lib\bundled-libs.jar;D:\chat_work\fsfinal2\lib\bcprov.jar"
```

实测：

| | 源码文件数 | **编译错误数** | 出错文件数 |
|---|---:|---:|---:|
| A) 基线（`finalshell-v4b.jar`，无改名） | 5,385 | **211** | 74 |
| B) 试验组（`pilot-renamed.jar`，20 个改名） | 5,386（+1 = `RegistryAliases.java`） | **211** | 74 |
| **差值** | +1 | **0** | **0** |

错误集合逐条比对（按「文件名 + 错误类型」归并，屏蔽行号漂移）：

```
base errors  = 211  distinct files = 74
pilot errors = 211  distinct files = 74

=== 新增错误（改名引入）: 0 处 / 0 类 ===
=== 消失的错误: 0 处 / 0 类 ===
```

**改名没有引入任何新的编译错误，也没有消掉任何原有的错误** —— 错误集合完全相同。

> 注：`jc-G.log` 里那个 22,071 的基线来自上一轮、另一棵源码树、另一套 classpath，
> **不能拿来对比**。这里的 211/211 是本轮用同一条流水线重新测的。

### 4.5 类加载基线（证明改名没碰坏字节码）

`LoadCheck` 逐个加载 jar 里的项目类（`Class.forName(name, false, cl)`）：

```
--- 原始 jar ---
project classes=5328  loadOK=4869  ClassFormatError=458  VerifyError=0  otherError=1
--- 改名后 jar ---
project classes=5329  loadOK=4870  ClassFormatError=458  VerifyError=0  otherError=1
```

**458 个 `ClassFormatError`（异常表越界 / 字段修饰符非法）是混淆 jar 自带的，
改名前后一模一样，改名后反而多 1 个能加载的类（注入的 `RegistryAliases`）。**
这 458 个类需要单独一轮修复，与改名工作解耦。

---

## 5. 怎么用它

```powershell
# 1) 生成别名表（一次即可，别名表跟着 jar 走，不随改名批次变）
python D:\chat_work\rename-plan\make-registry-alias.py `
    --orig        D:\chat_work\finalshell-teardown\finalshell.jar `
    --current     D:\chat_work\finalshell-teardown\finalshell-v4b.jar `
    --rename-log  D:\chat_work\temp\fsbuild\applied-rename.tsv `
    --registry    D:\chat_work\temp\renametest\work\registry-v4b.tsv `
    --members     D:\chat_work\temp\renametest\work\members-v4b.tsv `
    --out         D:\chat_work\rename-plan\registry-alias-map.tsv `
    --report      D:\chat_work\rename-plan\registry-alias-ambiguous.tsv

# 2) 改名时带上别名表
java -cp "<tools\bin>;<_lib\asm>" SourceRename in.jar out.jar proposal.tsv --alias registry-alias-map.tsv

# 3) 校验
java -cp "<tools\bin>;<_lib\asm>" VerifyRename in.jar out.jar proposal.tsv `
    --registry registry-v4b.tsv --alias registry-alias-map.tsv
```

**别名表和改名表是解耦的**：别名表描述"旧名 -> 当前名"，
改名表描述"当前名 -> 新名"；`SourceRename` 在生成别名类时会把别名表的**值**
跟着改名表一起改，所以别名表不需要随批次重生成。

---

## 6. 风险清单

| 风险 | 影响 | 处理 |
|---|---|---|
| **5 条 Registry 条目改名前就解析不了** | `=:`、`com._1`、`[LOY;`、`[LuD;`、`[Lci;` —— 混淆器留下的坏条目 | 改名前后行为一致，不阻塞改名；若要修，需要单独定位这些槽的用途 |
| **458 个类自带 `ClassFormatError`** | 异常表越界 / 字段修饰符非法，JVM 直接拒绝加载 | 与改名无关，改名前就坏；需要单独一轮字节码修复 |
| **1,282 个类自带 `VerifyError`** | long/double 局部变量槽处理有问题 | 同上，改名前就坏 |
| 别名表依赖 `applied-rename.tsv` | 该表若不是搬包改造的真实记录，别名会整体指错 | 已交叉验证：5,383 条目标 100% 存在于当前 jar；明文规则另用原始 jar 的类清单验证（样本见 3.3 节） |
| 别名表的**值**跟着改名走 | 别名值写死成旧类名，改名后仍指向旧名 | `SourceRename` 在生成别名类时会把别名表的**值**按改名表映射到新名 |
| 别名表依赖"原始 jar" | 换一版 jar 就要重新生成 | 别名表按 jar 版本归档（文件名带 jar 版本号） |
| 改名后又新增别名需求 | 新名不在别名表里 | 改名表和别名表解耦：`SourceRename` 会把改名表的**值**同步进别名表；**键**永远是 Registry 明文，不变 |
| `Registry.lookupClass` 被改写 | 如果将来有人手改 `Registry.java`，钩子会被覆盖 | 钩子是字节码层的，任何源码级重生成都会丢；需要在重建流程里重新跑 `SourceRename` |
| 别名类进了 jar | `com/finalshell/reflect/RegistryAliases.class` 是新增条目 | 无第三方冲突；反编译时会多出一个文件，属预期 |
| 序列化 | 旧配置反序列化 | 只有 39 个 `Serializable`；本轮未触及，列入 P5 复核 |
| 内部类（`$`） | 别名表只映射顶层类 | 实测 Registry 明文里只有 4 个带 `$`，且全是 JDK 类（`javax.swing.RowFilter$Entry` 等）；项目内部类不进 Registry |

---

## 7. 改名工具用法

### 7.1 `SourceRename` —— 字节码层改名 + 注入别名机制

```
java -cp "<tools\bin>;<_lib\asm>" SourceRename <in.jar> <out.jar> <proposal.tsv> [more.tsv ...] [选项]
```

| 位置 | 参数 | 说明 |
|---|---|---|
| 1 | `in.jar` | 输入 jar（只读） |
| 2 | `out.jar` | 输出 jar |
| 3.. | `proposal.tsv` | 改名表，可给多张，会合并 |
| 选项 | `--alias <map.tsv>` | Registry 别名表；给了就生成 `RegistryAliases` 并改写 `Registry.lookupClass` |
| 选项 | `--no-alias-inject` | 只生成别名类，不改写 `Registry.lookupClass` |
| 选项 | `--log <file.tsv>` | 改名日志（`oldInternalName \t newInternalName`） |

**改名表格式**（自动识别）：

- A. 带表头，含 `currentFqn`（或 `oldFqn`）+ `newSimpleName` + `newPackage` 三列
  —— `class-rename-proposal-v2.tsv` 就是这个格式，可以直接喂给它；
  另可选 `newFqn`（直接给目标全限定名）、`action`（`vendor`/`keep` 会被跳过）。
- B. 两列：`oldFqn \t newFqn`。

**做了什么**：

1. 校验每个 old 类在输入 jar 里存在、目标名不与既有类冲突（冲突会打印并跳过）；
2. 用 ASM 的 `ClassRemapper` 重写全部 class —— 常量池类引用、字段/方法描述符、
   指令 owner、异常处理表的 catch 类型、注解类型、泛型签名**全部自动跟随**；
3. 内部类跟随外部类改名（`Outer$Inner` → `NewOuter$Inner`）；
4. **jar 条目名与类内部名保持一致**（JVM 拒绝加载两者不一致的 jar）；
5. 生成 `com/finalshell/reflect/RegistryAliases.class` 并注入 jar；
6. 改写 `Registry.lookupClass` 里的 `Class.forName` → `RegistryAliases.forName`
   （描述符一致，栈图/异常表不动）。

实测输出：

```
proposal entries: 20
classes to rename: 20  (missing=0  collision=0)
alias entries: 1323
injected com/finalshell/reflect/RegistryAliases.class  entries=1323
entries renamed=20  unchanged=18130  registry patched=1
wrote ...\pilot-renamed.jar  size=31864190
```

### 7.2 `VerifyRename` —— 改名一致性校验器

```
java -cp "<tools\bin>;<_lib\asm>" VerifyRename <in.jar> <out.jar> <proposal.tsv> [选项]
```

| 选项 | 说明 |
|---|---|
| `--registry <registry.tsv>` | `RegistryProbe` 产出的解密清单，用于校验项 5 |
| `--alias <map.tsv>` | 别名表，用于校验项 5 的静态比对 |
| `--skip-runtime` | 跳过校验项 5 的运行时实测 |

| 校验项 | 内容 |
|---|---|
| 1 | 改名表里每个 old 类在**输入** jar 里存在 |
| 2 | **输出** jar 里没有残留的旧类名引用（扫全部 class 的常量池：类引用、字段/方法描述符、catch 类型、注解、泛型签名、字符串常量） |
| 3 | 输出的类数量与输入一致（允许注入的别名类 +1） |
| 4 | 输出 jar 里每个 class 的内部名 == jar 条目路径 == 包名前缀 |
| 5 | Registry 里的字符串类名引用是否都已加别名：**静态**比对 + **运行时**把 jar 加载起来逐条调 `lookupClass`，并与输入 jar 的结果对比，**只把「改名前能解析、改名后不能」算回归** |

实测输出（20 个类的试点）：

```
proposal rows parsed: 20

[1] proposal old classes exist in input jar
    PASS  20/20 present
[3] class count in == out
    PASS  in=18150 out=18151 (injectedAliasClass=1)
[2] no residual references to old class names in output jar
    PASS  constant-pool class refs to old names: 0
    PASS  string literals containing old binary names: 0
[4] class internal name == jar entry path == package prefix
    PASS  entries=18151 mismatched=0
[5] Registry string class-name references are aliased
    PASS  registry CLASS names: direct=13 viaAlias=1310 loadableByForName=163
          classSlotNotResolved=8 uncovered=5 (改名前就解析不了的=5)
    PASS  runtime lookupClass: total=1499 ok=212 ClassNotFoundException=5 otherError=1282
          | 改名前 ok=175 cnfe=1315 | 回归=0

checks=7  failures=0
```

---

## 8. 附：工具清单

| 文件 | 作用 |
|---|---|
| `finalshell-teardown\tools\RegistryProbe.java` | 扫 jar 收集 long key + 运行时解密 Registry，产出 `registry-v4b.tsv` |
| `finalshell-teardown\tools\DumpMembers.java` | 导出每个类声明的成员（名 + 描述符），供消歧用 |
| `finalshell-teardown\tools\RegistryResolveTest.java` | 直接对某个 jar 跑 `lookupClass`，统计解析成功率 |
| `rename-plan\make-registry-alias.py` | 生成别名表 + 歧义清单 |
| `rename-plan\registry-alias-map.tsv` | 别名表（1,297 条） |
| `rename-plan\registry-alias-ambiguous.tsv` | 仍有歧义的 108 条 |
| `finalshell-teardown\tools\SourceRename.java` | 字节码层改名 + 注入别名类 + 改写 `lookupClass` |
| `finalshell-teardown\tools\AliasClass.java` | ASM 生成 `RegistryAliases.class` |
| `finalshell-teardown\tools\VerifyRename.java` | 改名一致性校验器 |
