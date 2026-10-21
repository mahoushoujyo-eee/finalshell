# 第三方库隔离清单（P2）

本文件只做**标记和隔离规则**，不授权删除、不授权搬包、不授权改名。所有数量都以 `fsb8` 实际文件和字符串证据为准；命名表 `class-rename-kind.tsv` 只作交叉参考。

## 1. 为什么单列

`core` 有 3,077 个类，占全项目 57.3%。但其中至少 500 个是 Janino，另有 Commons IO、XStream、WebLaF、SwingX、PureJavaComm、pcap4j 等。把它们当业务类逐一起名，会得到一堆“看起来有意义、实际是第三方”的名字，后续升级/替换库时全部作废。

典型反例：`core/File2`（旧名 `J7`）有 147 条中文/英文文件冲突提示，直觉会叫 `FileConflictHelper`；实际它有 8,672 行、`import org.apache.commons.io.*`，主体是 **Apache Commons IO 的 FileUtils**。这就是为什么 P2 必须先于 P3。

## 2. 已确认组

| 组 | 判定依据 | 数量 | 当前落点 | 处理 |
|---|---|---:|---|---|
| Janino | 旧包前缀 `org/v`、`org/T`、`org/S`、`org/H`；字符串 `Compiling`、`Unrecognized JVM class file version`、`Reading class file from` | 500 | 绝大多数在 `core`，少量在 `io` | 标 `vendor.janino`，不逐类改名 |
| Apple EAWT | 包名 `com.apple.eawt` / `com.apple.eawt.event` | 56（命名表 41） | 已在 `com/apple` | 保留原包，不改名 |
| fastjson | 字符串 `fastjson.parser.deny`、`fastjson.parser.autoTypeAccept` | 1 个明确 + 若干疑似 | `core.IG` | `core.IG` 标 vendor；`B8_2`/`Cl4_2` 待确认 |
| Commons IO | `import org.apache.commons.io.*`；`File '...' cannot be read` 等 147 条 | 1 | `core.File2`（8,672 行） | 标 `vendor.commons-io`，保留 `FileUtils` 语义 |
| XStream | `extends ReflectionConverter` | 1 | `core.Nz2` | 标 `vendor.xstream` |
| WebLaF | 字符串 `weblaf.*` | 至少 9 个 owner | `core.Pg2`、`ui.model.Cc2` 等 | 标 `vendor.weblaf` |
| SwingX demo | 标题 `CheckBox Tree`、`Sorting Table`、`Rearrangeable Tree`、`Editable Tree Application` | 4+ | `core.ZR_2`、`core.GF`、`ui.frame.WY`、`ui.frame.TD3` | 先确认引用；无引用可删除，不要改名 |
| SwingX 辅助 | `image fetch aborted`、`cannot be determined! Make sure it points to existing field or getter` | 2+ | `core.X82`、`core.Ru2` | 标 `vendor.swingx` |
| PureJavaComm | `purejavacomm` 字符串签名；串口 API | 2+ | `core.X3_3` 等 | 标 `vendor.purejavacomm` |
| pcap4j | `org.pcap4j` 字符串签名 | 1+ | `core.U2_4` | 标 `vendor.pcap4j` |

合计：按旧包前缀可直接判定 **542 类**（Janino 500 + Apple 41 + fastjson 1），另有约 20 类按 import/字符串签名判定。

## 3. 疑似但未确认

这些类虽然命中第三方特征，但具体归属、版本或是否被裁剪仍不足以直接处理。P2 只打 `vendor?`，不改名、不删除：

| 类 | 现象 | 待确认 |
|---|---|---|
| `core.B8_2` | 14,177 行；`javax.xml.bind`、`fastjson`、大量反射/泛型/日期工具 | fastjson 的 TypeUtils，还是项目自研 JSON/XML 编解码 |
| `core.Cl4_2` | 2,633 行；无第三方 import 前缀 | 项目 JSON 解析器还是第三方裁剪版 |
| `ui.model.Cc2` | WebLaF + fastjson 字符串；`Serializable` | 具体是 WebLaF 模型还是项目序列化模型 |
| `core.X3_3` | 串口 API，`extends XJ_2` | PureJavaComm 版本/裁剪情况 |

## 4. 隔离规则

1. **P2 阶段只打标，不搬包、不改名。** 搬包会改变 FQN，可能触碰 Registry；等 P4 别名机制稳定后再做。
2. 第三方类一律 `vendor`，不进入语义命名池。即使它有中文 UI 字符串，也不代表它是业务类。
3. 第三方类如果被 Registry 命中（例如 `core/File2` reflect=1），**不要删除**。删除前必须确认调用点；当前只做隔离。
4. 确认无引用后的 SwingX demo 帧可以删除，但删除是单独决策，不在本方案授权内。
5. 保留原始 license/版权头；搬包时一并保留。
6. `com.apple.*` 保持原包。它靠 `Class.forName` 加载，改包名风险高、收益低。

## 5. 对命名池的影响

- `core` 的“业务类”不是 3,077，至少先减去 500+ Janino 和 1 个 Commons IO 大工具。
- 4,010 个非反射低置信类的安全池里，仍然可能混有第三方；P3 每批改名之前，先用本文件的规则过滤一遍。
- P5 搬包时，第三方类移到 `com.finalshell.vendor.<lib>` 只作为**可选**目标；没有 Registry 风险且引用清晰时才做。

## 6. 复核清单

- [ ] 确认 Janino 500 类在 `fsb8` 的实际落点（命名表与 `applied-rename.tsv` 有 `_2` 漂移）。
- [ ] 确认 `core/File2` 的主体是 Commons IO，并记录版本。
- [ ] 确认 `core/B8_2`、`core/Cl4_2` 的库归属，以及 `core/Nz2` 的 XStream 版本。
- [ ] 确认 SwingX demo 帧无引用（`grep` + 运行时类加载日志）。
- [ ] 确认 `com.apple` 56 类全部保留原包。
- [ ] 把本文件的组标记导入 `inventory.tsv` 的 `vendor` 列。
