# HANDOFF — FinalShell 逆向重建工程

> 本文件记录**当前实测状态**。所有数字都来自实际编译/统计，不是目标值。
> 仓库：<https://github.com/mahoushoujyo-eee/finalshell.git>

---

## 1. 一句话现状

把 ZKM 混淆的 `finalshell.jar`（49 MB）逆向重建成 Java 17 / Maven 工程：
**5,387 个 `.java` 文件**、**16 个 `com.finalshell.*` 语义包**、类名/文件名/目录已全部语义化。
字节码层的结构性破坏（反射折叠、假枚举、仅大小写包冲突、非法标识符、静态初始化块、
枚举父类、接口 class 版本）**已在字节码层修掉**；
源码层由 Vineflower 的不可约控制流造成的类型推断瑕疵，**68.3% 的文件已经零错误**。

---

## 2. 实测数据

| 项 | 数值 | 怎么测的 |
|---|---|---|
| 源码文件 | **5,387** 个 `.java` | `src/main/java` 递归计数 |
| 语义包 | **16** 个 `com.finalshell.*` | 直接含 `.java` 的目录数 |
| **零编译错误的文件** | **3,678 / 5,387 = 68.3%** | 全量 `javac -Xmaxerrs 100000` |
| 剩余编译错误 | **16,944** 个 / 1,709 个文件 | 同上 |
| 第三方类 | **12,764** 个 `.class`（19.3 MiB） | `lib/bundled-libs.jar` |
| 资源文件 | 3,032 个 | `src/main/resources` |
| 入口类 | `com.finalshell.core.St_2` | 原 `Main-Class: st`（默认包混淆名） |
| 反射调用折叠 | 字节码层 **23,386** 处 | `Ref.h/h2/s/g` |
| Registry 别名表 | **1,323** 条，0 歧义 | `com/finalshell/reflect/RegistryAliases.java` |
| 反编译失败占位 | **3,206** 处 / 757 个文件 | `decompilation failed (Vineflower)` |

### 剩余 16,944 个错误的分布

| 错误类别 | 数量 | 性质 |
|---|---:|---|
| `cannot find symbol` (variable) | **7,363** | 局部变量声明在 `catch`/`switch` 分支内、使用在分支外 |
| `cannot find symbol` (method) | 1,264 | 继承链成员在重命名后失联 |
| `incompatible types: Object[] → X` | 1,332 | 变量类型抖动：先按初始值声明成 `Object[]`，后面又 `(DY3)varN` 强转赋值 |
| `incompatible types: int/boolean/String → X` | 1,938 | 同上（primitive 方向） |
| `incompatible types: Object / ArrayList → X` | 508 | 同上 |
| `variable N is already defined in method N` | 222 | 同一方法内同名变量 |
| 其余 | ~4,300 | 逐类处理中 |

---

## 3. 字节码层已完成的修复（`tools/`）

这些是**源码层修不掉**的，必须在字节码层做（ASM `ClassRemapper` 自动跟随全部引用）：

| # | 问题 | 处理 | 规模 |
|---|---|---|---|
| ① | 同名不同返回类型的方法 | 按返回类型派生唯一名 `m` → `m$int` | 1,550 类 / 11,020 方法 |
| ② | 仅大小写不同的包/类 | 加后缀改名（Windows 文件系统无法共存） | 3,101 条 |
| ③ | 非法标识符（Java 关键字做类名） | 重命名 | 50 个类 |
| ④ | 假枚举 | 清 `ACC_ENUM` + 父类 `java/lang/Enum`→`java/lang/Object` + 构造器 `super(name,ordinal)`→`super()` | 594 个类 |
| ⑤ | 反射调用 | `com.c.d(key).invoke(...)` → `Ref.h/h2/s/g` | **23,386 处** |
| ⑥ | 语义改名 + 归包 | 5,383 个类 → 16 个语义包 | 5,383 条 |
| ⑦ | 静态初始化块 | `<clinit>` 提取为 `__vfClinit__()`，避开静态块里非法的 `return;` | 5,477 / 5,479 个类 |
| ⑧ | 跨包可见性 | 成员统一 `public`（含 package-private / protected） | 全量 |
| ⑨ | 接口的 static 方法 | 1,254 个接口的 class 版本提到 52（Java 8 才允许接口 static 方法） | 1,254 个类 |
| ⑩ | **Registry 字符串别名** | 生成 `RegistryAliases`，把 `Class.forName` 换成别名查表 | 1,323 条别名 |

### ⑩ 为什么必须有别名机制

`Registry.lookupClass(key)` 内部是 `Class.forName(<运行时 XOR 解密出来的字符串>)`。
**字符串常量不会被 ASM 的 `ClassRemapper` 重映射** —— 之前把 1,941 个默认包类搬进
`com.finalshell.*` 之后，注册表里存的还是原始名，运行时 `ClassNotFoundException`
高达 **1,315 次**（不是改名造成的，是**早先的搬包改造就已经炸了**，只是没人跑过反射路径）。

实测对照：

| | A) 未注入别名 | B) 注入别名 |
|---|---:|---:|
| `lookupClass` 解析成功 | 175 | **212** |
| `ClassNotFoundException` | **1,315** | **5** |

剩下 5 条（`=:`、`com._1`、`[LOY;` 等）是混淆器留下的坏条目，改名前后一致。
`lookupField` / `lookupMethod` 都走 `lookupClass`，所以**一个钩子覆盖全部 1,499 个类名入口
和 7,377 条字段/方法描述符**。

---

## 4. 源码层修复工具

| 工具 | 作用 |
|---|---|
| `FixTree.java` | 错误驱动修复：读 javac 完整日志，按错误类型定点修补（语法类 + 局部变量类型提升） |
| `FixStruct.java` | 结构类修复：`super` 位置、`bad operand` 操作数、可见性、枚举残留 |
| `FixVineflower.java` | 反编译产物修复：接口降级、假枚举、注解、dup 方法、不可约流占位 |
| `FixAnnotations.java` | 注解元素名断裂（`--dup` 改名没传播到注解使用处） |
| `SourceRename.java` | 字节码层改名 + **Registry 别名注入** |
| `VerifyRename.java` | 改名一致性校验（7 项，回归语义） |
| `AliasClass.java` | ASM 生成 `RegistryAliases.class` |
| `RegistryProbe.java` | 取证工具：解出注册表里的明文类名/描述符 |
| `Ref.java` | 手写的反射辅助类（**非**反编译产物） |

### 修复循环的正确做法

javac 分阶段编译：**parse → attribution（类型检查）→ 生成**。
**只要工程里还有 1 个语法错误，它就完全不做类型检查**，类型错误一条都不报。

所以修复循环必须：
1. **把语法错误和类型错误分开统计**（`errors=` / `syntax=` / `type=` 三列）
2. 语法错误清零后，才拿得到完整的类型错误列表
3. `FixTree` 与 `FixStruct` **交替执行**（`FixStruct` 的 super-first 会挪动行号，
   同轮连跑会让另一个工具拿着旧行号改错位置）

> 历史上「错误越改越多」就是这么来的：早期用「全量 javac 迭代」当反馈信号，
> 语法门禁一开一关，数字忽上忽下。现在三列分开打印，一眼能看出是门禁效应还是真实回归。

---

## 5. 已知限制

1. **成员名仍是混淆基名**。类名和包名已语义化，但字段/方法名没有 —— 下一轮的活。
2. **字符串/数值常量没回填**。源码里仍是 `a(-7992, 16228)` 这种解密器调用。
   解密结果已拿到：`tables-lit/strings.tsv` **28,441** 条明文、`tables-lit/numbers.tsv` **39,761** 条数值，
   `tools/LiteralRewrite.java` / `tools/Rewrite.java` 负责回填 —— 回填后可读性会有一次阶跃式提升。
3. **3,206 处方法体原程序就反编译不出来**。源码里是
   `throw new UnsupportedOperationException("decompilation failed (Vineflower)")`，
   后面跟着 Vineflower 打印的字节码注释。**运行时走到这些路径会抛异常** —— 不是重建引入的缺陷。
4. **反射调用是运行时反射，不是直译**。字节码层已折叠成 `Ref.h(key, target, args)`，
   辅助方法内部仍走反射，**运行时行为与原程序一致**，但没还原成直接成员调用。
5. **`Ref.h` 的参数顺序与原 jar 的字节码相反**。Vineflower 反编译 `invokestatic` 时把参数
   按逆栈序输出，所以源码层统一采用「key 在前」。源码与源码自洽，运行时行为不变，
   但与原 jar 的字节码不逐字节一致。
6. **`Registry` 的辅助方法已泛型化**（`<T> T`）以消除类型不匹配。泛型只影响编译期；
   运行时若把返回值赋给非 `Object[]` 的具体类型，调用点会插入 `checkcast`，理论上可能抛
   `ClassCastException`。
7. **枚举降级有运行时代价**。为消除 `classes cannot directly extend java.lang.Enum`，
   把 115 个类的父类从 `java.lang.Enum` 改成 `java.lang.Object` —— 它们因此**失去
   `name()` / `ordinal()` 和 `Enum.valueOf`**。编译改善，运行时保真度下降。
   第三方类不受影响（`--enum-scope` 只作用于进入源码树的类）。
8. **混淆 jar 自身有字节码缺陷**：458 个类自带 `ClassFormatError`，1,282 个类自带
   `VerifyError`（long/double 局部变量槽）。改名前就坏，与重建无关。
9. **原 jar 本身缺 `/sk` 资源**，不是重建丢的。
10. **改名是带运行时代价的**：`Registry` 里存的是**原始二进制名**，任何后续改名都必须
    同步维护别名表，否则运行时 `ClassNotFoundException`。别名表与 jar 版本绑定。

---

## 6. 复现管线

```
finalshell.jar
  → FixBytecode   (--dup --enum --publicize --clinit --enum-scope=… --rename=com/c=com/Registry)
  → ReflectHelper2                    (反射折叠 + 注入 Ref.class)
  → ApplyRename                       (class-rename-kind.tsv)
  → SourceRename                       (注入 Registry 别名机制)
  → BuildBundledLibs                  (切第三方类)
  → Vineflower 1.10.1                 (反编译)
  → FixVineflower                     (反编译产物修复)
  → 组装源码树 → FixTree / FixStruct 交替循环（≤20 轮）→ javac 全量验证
```

脚本：`D:\chat_work\temp\fsbuild\`（`LAST.ps1` / `stage11.ps1` / `loop3.ps1`）。

---

## 7. 下一步（按收益排序）

1. **局部变量作用域提升**（7,363 个）—— 最大的单块，需要跨块的声明提升
   （工具 `temp/varscope/fix_varscope.py` 已能工作，6,493 条修复记录，幂等性已验证）
2. **继承链成员失联**（1,264 个 `cannot find symbol` method）—— 需字节码层补继承关系
3. **剩余类型不匹配**（3,778 个）—— 变量类型提升 + 初值强转的边界情况
4. **常量回填**（28,441 + 39,761 条）—— 可读性阶跃提升
5. **成员语义命名**（字段/方法）—— 需要按用途逐个推断，是最耗人工的一步
6. **枚举降级的运行时保真**（115 个类）—— 可以改成保留 `Enum` 继承 + 补 `name()`/`ordinal()` 桩
