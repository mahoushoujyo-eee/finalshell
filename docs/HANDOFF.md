# HANDOFF — FinalShell 逆向重建工程

> 本文件记录**当前实测状态**。所有数字都来自实际编译/统计，不是目标值。
> 仓库：<https://github.com/mahoushoujyo-eee/finalshell.git>

---

## 1. 一句话现状

把 ZKM 混淆的 `finalshell.jar`（49 MB）逆向重建成 Java 17 / Maven 工程：
**5,386 个 `.java` 文件**、**16 个 `com.finalshell.*` 语义包**、类名/文件名/目录已全部语义化；
字节码层的结构性破坏（反射折叠、假枚举、仅大小写包冲突、非法标识符、静态初始化块）**已在字节码层修掉**，
剩余是反编译器（Vineflower）在**不可约控制流**上的类型推断瑕疵。

---

## 2. 实测数据

| 项 | 数值 | 怎么测的 |
|---|---|---|
| 源码文件 | **5,386** 个 `.java` | `src/main/java` 递归计数 |
| 语义包 | **16** 个 `com.finalshell.*` | 直接含 `.java` 的目录数 |
| 第三方类 | **12,764** 个 `.class`（19.3 MiB） | `lib/bundled-libs.jar` 条目数 |
| 资源文件 | **3,032** 个 | `src/main/resources` |
| 入口类 | `com.finalshell.core.St_2` | 原 `Main-Class: st`（默认包混淆名） |
| 反射调用折叠 | 字节码层 **23,386** 处 → 源码可见 **8,274** 处 | `Ref.h(` / `Ref.h2(` |
| 反编译失败占位 | **3,206** 处 / **757** 个文件 | `decompilation failed (Vineflower)` |
| **剩余编译错误** | **21,651** 个 / 19,961 个文件 | `javac -Xmaxerrs 100000` 全量 |

---

## 3. 字节码层已完成的修复（`tools/`）

这些是**源码层修不掉**的，必须在字节码层做（ASM `ClassRemapper` 自动跟随全部引用）：

| # | 问题 | 处理 | 规模 |
|---|---|---|---|
| ① | 同名不同返回类型的方法 | 按返回类型派生唯一名 `m` → `m$int` | 1,550 类 / 11,020 方法 |
| ② | 仅大小写不同的包/类 | 加后缀改名（Windows 文件系统无法共存） | 5 组包冲突 / 3,101 条 |
| ③ | 非法标识符（Java 关键字做类名） | 重命名 | 50 个类 |
| ④ | 假枚举 | 清除 `ACC_ENUM` | 594 个类 |
| ⑤ | 反射调用 | `com.c.d(key).invoke(...)` → `Ref.h/h2/s/g` | **23,386 处** |
| ⑥ | 语义改名 + 归包 | 5,383 个类 → 16 个语义包 | 5,383 条 |
| ⑦ | 静态初始化块 | `<clinit>` 提取为 `__vfClinit__()`，避开静态块里非法的 `return;` | 5,477 / 5,479 个类 |
| ⑧ | 跨包可见性 | 成员统一 `public`（语义化重分包会打断包级私有访问） | 全量 |
| ⑨ | 接口的 static 方法 | 1,254 个接口的 class 版本提到 52（Java 8 才允许接口 static 方法） | 1,254 个类 |

---

## 4. 剩余 21,651 个错误的分布

| 错误类别 | 数量 | 性质 |
|---|---:|---|
| `cannot find symbol` (variable) | **7,436** | 局部变量声明在 `catch`/`switch` 分支内、使用在分支外 —— Vineflower 对不可约控制流的变量作用域推断错误 |
| `incompatible types: Object[] → X` | 2,182 | 变量类型抖动：先按初始值声明成 `Object[]`，后面又 `(DY3)varN` 强转赋值 |
| `incompatible types: int/boolean/String → X` | 2,656 | 同上（primitive 方向） |
| `bad operand types for '!=' / '=='` | 1,006 | 混淆器故意让 boolean 与 int 混用 |
| `cannot find symbol` (method) | 906 | 继承链成员在重命名后失联 |
| `method cannot be applied to given types` | 397 | 参数个数/类型不匹配 |
| `call to super must be first statement` | 283 | 构造器里 `super()` 不在第一条语句 |
| `constructor cannot be applied` | 246 | 假枚举构造器的 `super(name, ordinal)` |
| `classes cannot directly extend java.lang.Enum` | 114 | 假枚举的父类没改（需字节码层） |

**为什么会"越改越多"**：javac 分阶段编译，**只要还有 1 个语法错误，它就不做类型检查**，类型错误一条都不报。
所以「剩 1 个错误」从来不是「只差 1 个」，而是「只差 1 个挡在类型检查前面的」。
解除 100 条上限后，真实错误量一次性暴露 —— 数字暴涨是**逐层剥洋葱**，不是改坏了。

---

## 5. 已知限制

1. **成员名仍是混淆基名**。类名和包名已语义化，但字段/方法名没有 —— 下一轮的活。
2. **字符串/数值常量没回填**。源码里仍是 `a(-7992, 16228)` 这种解密器调用。
   解密结果已拿到：`tables-lit/strings.tsv` **28,441** 条明文、`tables-lit/numbers.tsv` **39,761** 条数值，
   `tools/LiteralRewrite.java` / `tools/Rewrite.java` 负责回填 —— 回填后可读性会有一次阶跃式提升。
3. **3,206 处方法体原程序就反编译不出来**。源码里是 `throw new UnsupportedOperationException("decompilation failed (Vineflower)")`，
   后面跟着 Vineflower 打印的字节码注释。**运行时走到这些路径会抛异常** —— 不是重建引入的缺陷。
4. **反射调用是运行时反射，不是直译**。字节码层已折叠成 `Ref.h(key, target, args)`，辅助方法内部仍走反射，
   **运行时行为与原程序一致**，但没还原成直接成员调用。要彻底直译需要把反射注册表反向映射成 `invokevirtual`。
5. **`Ref.h` 的参数顺序与原 jar 的字节码相反**。Vineflower 反编译 `invokestatic` 时把参数按逆栈序输出，
   所以源码层统一采用「key 在前」。源码与源码自洽，运行时行为不变，但与原 jar 的字节码不逐字节一致。
6. **`Registry` 的辅助方法已泛型化**（`<T> T`）以消除类型不匹配，泛型只影响编译期；
   运行时若把返回值赋给非 `Object[]` 的具体类型，调用点会插入 `checkcast`，理论上可能抛 `ClassCastException`。
7. **原 jar 本身缺 `/sk` 资源**，不是重建丢的。

---

## 6. 工具链

`tools/` 下 45 个 `.java`，纯 Java 17，除 ASM 外无外部依赖。核心：

| 工具 | 作用 |
|---|---|
| `FixBytecode.java` | 字节码层：dup 改名 / 假枚举 / 包冲突 / 非法标识符 / `--clinit` 提取 / `--publicize` |
| `ReflectHelper2.java` | 反射调用折叠成 `Ref.h/h2/s/g` |
| `ApplyRename.java` | 按改名表执行类改名 + 归包（ASM `ClassRemapper` 跟随全部引用） |
| `BuildBundledLibs.java` | 从原 jar 切出第三方类打进 `lib/bundled-libs.jar` |
| `FixVineflower.java` | 反编译产物修复（接口降级 / 假枚举 / 注解 / dup 方法 / 不可约流占位） |
| `FixTree.java` | **错误驱动**的源码修复循环：读 javac 完整日志，按错误类型定点修补并迭代 |
| `FixAnnotations.java` | 注解元素名断裂的修复（`--dup` 改名没传播到注解使用处） |
| `Ref.java` | 手写的反射辅助类（**非**反编译产物） |

---

## 7. 复现管线

```
finalshell.jar
  → FixBytecode   (--dup --enum --publicize --clinit --rename=com/c=com/Registry)
  → ReflectHelper2                    (反射折叠 + 注入 Ref.class)
  → ApplyRename                       (class-rename-kind.tsv)
  → BuildBundledLibs                  (切第三方类)
  → Vineflower 1.10.1                 (反编译)
  → FixVineflower                     (反编译产物修复)
  → 组装源码树 → FixTree 循环（8~10 轮）→ javac 全量验证
```

脚本在 `D:\chat_work\temp\fsbuild\`（`LAST2.ps1` / `stage11.ps1` / `loop3.ps1`）。

---

## 8. 下一步（按收益排序）

1. **局部变量作用域提升**（7,436 个）—— 最大的单块，需要跨块的声明提升
2. **primitive / Object[] 类型错配**（4,838 个）—— 变量类型提升 + 初值强转，规则已写好，边界情况待补
3. **假枚举的字节码层父类修正**（114 + 246 个）—— `extends java/lang/Enum` → `java/lang/Object`，构造器 `super(name, ordinal)` → `super()`
4. **`call to super must be first statement`**（283 个）—— 构造器里把 `super()` 提到最前
5. **常量回填**（28,441 + 39,761 条）—— 可读性阶跃提升
6. **成员语义命名**（字段/方法）—— 需要按用途逐个推断，是最耗人工的一步
