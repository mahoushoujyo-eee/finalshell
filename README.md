# FinalShell — 可读重建工程

从 `finalshell.jar` 反编译重建的 FinalShell 工程（Java 17 / Maven）。

- `src/main/java/` —— 5,387 个自研类的反编译源码，**反射调用已直译**为直接调用
- `src/main/resources/` —— 从原包逐字节提取的 1,516 个资源
- `lib/bundled-libs.jar` —— 从原包切出的第三方库（12,765 个 class），与编译期 API 完全一致
- `lib/bcprov.jar` —— 外置的 BouncyCastle
- `tools/` —— 生成这套源码的工具链（ASM 精确采集、反射表解算、字面量回填）
- `docs/` —— 资源清单、依赖清单
- `tables/` —— 中间产物：反射表、类索引

构建：`mvn -s maven-settings.xml package` → `target/finalshell.jar`
