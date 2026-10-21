# hybrid-build：可编译的混合构建分支

> `main` 分支是**完整源码工作区**（5,387 个 `.java`，当前 `javac` 仍有 6,268 个错误）。
> 本分支 `hybrid-build` 是**唯一已验证 `javac exit=0` 的可构建版本**：
> 健康源码继续用 `.java` 编译，尚未恢复到可编译状态的类用**原始字节码**兜底。

## 实测结果（2026-10-21）

| 项 | 值 |
|---|---:|
| 编译的源码 | **70** 个 `.java`（`ModuleInfo.java` 排除） |
| 字节码兜底类 | **5,316** 个（`lib/fallback-classes.jar`） |
| `javac` 结果 | **exit 0 / 0 errors** |
| 全量源码 | 5,316 个未编译源码保留在 `src/unrestored/java` |
| 兜底来源 | `finalshell-v4-renamed.jar`（已应用 88 个语义改名） |

保留源码的包：`com.apple.eawt`（56）、`com.finalshell.util`（6）、`com.finalshell.reflect`（3，手写 Ref/Registry）、
`com.finalshell.connection`（2）、`com.finalshell.serialization`（1）、`com.finalshell.config`（1）。

## 编译验证（不使用 Maven 也可）

```powershell
$r='D:\chat_work\fsfinal2-hybrid'
Get-ChildItem "$r\src\main\java" -Recurse -Filter *.java |
  Where-Object { $_.Name -ne 'ModuleInfo.java' } |
  ForEach-Object { $_.FullName } | Set-Content "$r\sources.txt" -Encoding UTF8
& 'C:\Program Files\Java\jdk-17\bin\javac.exe' -encoding UTF-8 -nowarn -Xmaxerrs 100000 `
  -d "$r\out" `
  -cp "$r\lib\bundled-libs.jar;$r\lib\bcprov.jar;$r\lib\javax.mail-1.6.2.jar;$r\lib\javax.activation-api-1.2.0.jar;$r\lib\fallback-classes.jar" `
  "@$r\sources.txt"
echo "javac exit=$LASTEXITCODE"   # 0
```

`pom.xml` 已加入 `fallback-classes` 的 `system` 依赖与 `maven-install-plugin` 安装项；本机没有 `mvn`，因此以 `javac` 验证为准。

## 重要说明

- 字节码兜底类**不是源码恢复**：它们来自原始（已改名）jar，保留原行为，但无法阅读/修改。
- `src/unrestored/java` 里的 5,316 个文件是完整反编译源码，供后续按文件修复；修好一个即可从兜底 jar 移除并加入 `src/main/java`。
- 这个分支解决「可构建」，不解决「全部源码可编译」。要推进全源码构建，回到 `main` 分支按 `docs/HANDOFF.md` §5 继续。
- 5,316 个兜底类中，45 个属于 89 个语义改名类；`finalshell-v4-renamed.jar` 已用 ASM 重命名，引用保持一致。
- `RegistryAliases`、`Ref` 是手写源码（已保留），不要用字节码覆盖。

## 复现兜底集

```powershell
# 从 v4 按 89 条改名表生成 renamed jar（工具在 tools/）
java -cp "finalshell-teardown\tools\bin;finalshell-teardown\_lib\asm" ApplyRename `
  finalshell-teardown\finalshell-v4.jar finalshell-teardown\finalshell-v4-renamed.jar `
  rename89-table.tsv rename89-log.tsv rename89-applied.tsv
# 本分支的 fallback-classes.jar 就是从 renamed jar 中抽取的无源码类
```
