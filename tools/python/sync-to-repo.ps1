<#
.SYNOPSIS
    把最新的重建产物同步进 GitHub 仓库的本地克隆，并（可选）提交并推送。

.DESCRIPTION
    同步内容：
      src/main/java   —— 整目录替换（先用 git rm -r --cached 摘掉索引项，再物理删除旧目录，最后拷入新目录）
      src/main/resources —— 若 $Src 下存在，整目录替换
      pom.xml / maven-settings.xml —— 从 $Src 拷
      lib/*.jar       —— 从 $Src\lib 拷（仓库里 $Src 没有的 jar 会被删掉）
      tables/         —— 从 $TablesDir 拷（+ $RenameTablesDir 里的 class-rename*.tsv）
      tables-lit/     —— 从 $TablesLitDir 拷
      tools/*.java    —— 只拷 .java 源码，不拷 .class/.log 等产物
      docs/HANDOFF.md —— 按优先级解析来源后拷

    设计约束：
      * 幂等：重复执行结果一致（git rm 用 --ignore-unmatch，空路径自动跳过）。
      * 不删除 $Repo 以外的任何东西（Remove-TreeSafe 会断言路径前缀）。
      * 每一步都检查退出码，失败立即抛错停止，绝不继续往下做。
      * 不带 -Push 时只做本地同步，停在 commit 之前。
      * Windows 上先删后拷，避免仅大小写不同的路径互相覆盖。

.EXAMPLE
    .\sync-to-repo.ps1 -DryRun
    查看计划，不做任何改动。

.EXAMPLE
    .\sync-to-repo.ps1
    本地同步 + git add -A，打印统计和 commit message 草稿，停在 commit 前。

.EXAMPLE
    .\sync-to-repo.ps1 -Push
    本地同步 + commit + git push origin main（会发布到公开的 GitHub 仓库）。
#>

[CmdletBinding()]
param(
    # 新的构建根（含 src\main\java、lib、pom.xml）
    [string]$Src = 'D:\chat_work\fsfinal',
    # 目标仓库的本地克隆
    [string]$Repo = 'D:\chat_work\fsrepo',
    # 是否 commit 并 push 到 GitHub
    [switch]$Push,
    # 字节码层中间表来源
    [string]$TablesDir = 'D:\chat_work\finalshell-teardown\tables',
    # 常量解密中间表来源
    [string]$TablesLitDir = 'D:\chat_work\finalshell-teardown\tables-lit',
    # 语义改名表来源（class-rename*.tsv，最新的一轮）
    [string]$RenameTablesDir = 'D:\chat_work\finalshell-project\tables',
    # 反射调用表（teardown 根目录那份是大小写改名之后的新版）
    [string]$ReflectTable = 'D:\chat_work\finalshell-teardown\reflect.tsv',
    # tools 来源；留空则依次尝试 $Src\tools、$ToolchainDir
    [string]$ToolsDir = '',
    # 逆向工具链（Java 源码）的权威位置，作为 $Src\tools 的后备
    [string]$ToolchainDir = 'D:\chat_work\finalshell-teardown\tools',
    # docs/HANDOFF.md 来源目录；留空则只用 $Src\docs\HANDOFF.md，否则保留仓库里现有那份
    [string]$HandoffDir = '',
    # 只打印计划，不做任何改动
    [switch]$DryRun,
    # 自定义 commit message；留空则用自动生成的草稿
    [string]$Message = '',
    # 允许传入不存在的 $Src（只用于测试脚本本身）
    [switch]$SkipPreflight
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
try {
    [Console]::OutputEncoding = [System.Text.Encoding]::UTF8
    $OutputEncoding = [System.Text.Encoding]::UTF8
} catch {
    # 控制台不支持 UTF-8 时忽略
}
if (Get-Variable -Name 'PSNativeCommandUseErrorActionPreference' -Scope Global -ErrorAction SilentlyContinue) {
    $global:PSNativeCommandUseErrorActionPreference = $false
}

$script:StartedAt = Get-Date

# ---------------------------------------------------------------- 输出helpers
function Write-Section {
    param([string]$Text)
    Write-Host ''
    Write-Host ('=' * 78) -ForegroundColor DarkCyan
    Write-Host $Text -ForegroundColor Cyan
    Write-Host ('=' * 78) -ForegroundColor DarkCyan
}
function Write-Info { param([string]$Text) Write-Host "  $Text" }
function Write-Warn2 { param([string]$Text) Write-Host "  [WARN] $Text" -ForegroundColor Yellow }
function Write-Fail { param([string]$Text) Write-Host "  [FAIL] $Text" -ForegroundColor Red }

# ---------------------------------------------------------------- 原生命令
function ConvertTo-CommandLineArg {
    <# 按 Windows 命令行规则转义单个参数。 #>
    param([string]$Arg)
    if ($null -eq $Arg) { return '""' }
    if ($Arg.Length -gt 0 -and $Arg -notmatch '[\s"]') { return $Arg }
    $sb = [System.Text.StringBuilder]::new()
    $null = $sb.Append('"')
    $bs = 0
    foreach ($ch in $Arg.ToCharArray()) {
        if ($ch -eq '\') { $bs++; continue }
        if ($ch -eq '"') {
            $null = $sb.Append('\' * ($bs * 2 + 1)).Append('"')
            $bs = 0
            continue
        }
        if ($bs -gt 0) { $null = $sb.Append('\' * $bs); $bs = 0 }
        $null = $sb.Append($ch)
    }
    if ($bs -gt 0) { $null = $sb.Append('\' * ($bs * 2)) }
    $null = $sb.Append('"')
    return $sb.ToString()
}

function Invoke-Native {
    <# 运行外部程序，检查退出码；失败立即抛错。 #>
    param(
        [Parameter(Mandatory)][string]$FilePath,
        [string[]]$ArgumentList = @(),
        [int[]]$SuccessCodes = @(0),
        [switch]$SuppressOutput
    )
    $psi = [System.Diagnostics.ProcessStartInfo]::new()
    $psi.FileName = $FilePath
    # 手工拼命令行，保证 Windows PowerShell 5.1（.NET Framework 无 ArgumentList）也能跑
    $psi.Arguments = (@($ArgumentList | ForEach-Object { ConvertTo-CommandLineArg $_ }) -join ' ')
    $psi.RedirectStandardOutput = $true
    $psi.RedirectStandardError = $true
    $psi.UseShellExecute = $false
    $psi.WorkingDirectory = $Repo
    $p = [System.Diagnostics.Process]::Start($psi)
    # 必须并发读取两个流：git add -A 在 autocrlf=true 下会往 stderr 写上万行警告，
    # 先读 stdout 会把 stderr 管道写满造成死锁。
    $outTask = $p.StandardOutput.ReadToEndAsync()
    $errTask = $p.StandardError.ReadToEndAsync()
    $p.WaitForExit()
    $stdout = $outTask.Result
    $stderr = $errTask.Result
    $code = $p.ExitCode
    if (-not $SuppressOutput) {
        if ($stdout.Trim()) { Write-Host ($stdout.TrimEnd()) }
        if ($stderr.Trim()) {
            $errLines = @($stderr -split "`r?`n" | Where-Object { $_ -ne '' })
            $show = @($errLines | Select-Object -First 5)
            foreach ($l in $show) { Write-Host $l -ForegroundColor DarkYellow }
            if ($errLines.Count -gt $show.Count) {
                Write-Host ("      ...（另外还有 {0} 行 stderr，已折叠；通常是 autocrlf 的换行符提示）" -f ($errLines.Count - $show.Count)) -ForegroundColor DarkYellow
            }
        }
    }
    if ($SuccessCodes -notcontains $code) {
        throw "[FAIL] $FilePath $($ArgumentList -join ' ') => exit $code`n$stderr"
    }
    return [PSCustomObject]@{ ExitCode = $code; StdOut = $stdout; StdErr = $stderr }
}

function Invoke-Git {
    param([Parameter(Mandatory)][string[]]$GitArgs, [switch]$SuppressOutput)
    return Invoke-Native -FilePath 'git' -ArgumentList (@('-C', $Repo) + $GitArgs) -SuppressOutput:$SuppressOutput
}

function Get-GitLines {
    <#
        只取 stdout 的行（stderr 丢弃），用于需要解析的命令。
        空结果时返回 @()（调用方务必用 @(...) 包住，否则拿到的是 $null）。
    #>
    param([Parameter(Mandatory)][string[]]$GitArgs)
    $r = Invoke-Native -FilePath 'git' -ArgumentList (@('-C', $Repo) + $GitArgs) -SuppressOutput
    if (-not $r.StdOut) { return @() }
    return @($r.StdOut -split "`r?`n" | Where-Object { $_ -ne '' })
}

# ---------------------------------------------------------------- 文件helpers
function Get-RelativeFileList {
    <# 返回 $Root 下所有文件的相对路径（正斜杠）。 #>
    param([string]$Root)
    if (-not (Test-Path -LiteralPath $Root)) { return @() }
    $rootFull = (Resolve-Path -LiteralPath $Root).Path.TrimEnd('\')
    return @(Get-ChildItem -LiteralPath $Root -Recurse -File -Force |
        ForEach-Object { $_.FullName.Substring($rootFull.Length + 1).Replace('\', '/') })
}

function Remove-PathPrefix {
    <# 去掉 git 路径的前缀，得到相对于该目录的路径。 #>
    param([string[]]$Paths, [string]$Prefix)
    if ($null -eq $Paths) { return @() }
    $out = New-Object System.Collections.Generic.List[string]
    foreach ($p in $Paths) {
        if ($null -eq $p) { continue }
        if ($p.StartsWith($Prefix, [System.StringComparison]::OrdinalIgnoreCase)) {
            $out.Add($p.Substring($Prefix.Length))
        } else {
            $out.Add($p)
        }
    }
    return @($out.ToArray())
}

function Compare-Tree {
    <#
        比较「仓库里已有的文件集合」与「源目录的文件集合」，给出新增/删除/修改/仅大小写变化。
        路径比较用大小写不敏感（Windows 语义），但「仅大小写变化」单独统计出来单独告警。
        $OldBase / $NewBase 给了才做基于文件大小的修改判定。
    #>
    param(
        [string[]]$OldPaths,
        [string[]]$NewPaths,
        [string]$OldBase = '',
        [string]$NewBase = ''
    )
    if ($null -eq $OldPaths) { $OldPaths = @() }
    if ($null -eq $NewPaths) { $NewPaths = @() }
    $oldMap = @{}; foreach ($f in $OldPaths) { $oldMap[$f.ToLowerInvariant()] = $f }
    $newMap = @{}; foreach ($f in $NewPaths) { $newMap[$f.ToLowerInvariant()] = $f }

    $add = @($NewPaths | Where-Object { -not $oldMap.ContainsKey($_.ToLowerInvariant()) })
    $del = @($OldPaths | Where-Object { -not $newMap.ContainsKey($_.ToLowerInvariant()) })
    $caseOnly = @($NewPaths | Where-Object {
        $oldMap.ContainsKey($_.ToLowerInvariant()) -and ($oldMap[$_.ToLowerInvariant()] -cne $_)
    })
    $mod = @()
    if ($OldBase -and $NewBase) {
        foreach ($f in $NewPaths) {
            $k = $f.ToLowerInvariant()
            if (-not $oldMap.ContainsKey($k)) { continue }
            if ($oldMap[$k] -cne $f) { continue }
            $o = Get-Item -LiteralPath (Join-Path $OldBase $f) -ErrorAction SilentlyContinue
            $n = Get-Item -LiteralPath (Join-Path $NewBase $f) -ErrorAction SilentlyContinue
            if ($o -and $n -and $o.Length -ne $n.Length) { $mod += $f }
        }
    }
    return [PSCustomObject]@{
        Old = $OldPaths.Count; New = $NewPaths.Count
        Add = $add; Del = $del; Mod = $mod; CaseOnly = $caseOnly
    }
}

function Remove-TreeSafe {
    <# 递归删除目录，硬性限制在 $Repo 之内。 #>
    param([Parameter(Mandatory)][string]$Path)
    if (-not (Test-Path -LiteralPath $Path)) { return }
    $full = (Resolve-Path -LiteralPath $Path).Path
    if (-not $full.StartsWith($Repo, [System.StringComparison]::OrdinalIgnoreCase)) {
        throw "[FAIL] 拒绝删除 $Repo 之外的路径：$full"
    }
    try {
        Remove-Item -LiteralPath $full -Recurse -Force -ErrorAction Stop
    } catch {
        Write-Warn2 "Remove-Item 失败（$($_.Exception.Message)），改用 cmd rd /s /q"
        $null = & cmd.exe /c "rd /s /q `"$full`""
        if ($LASTEXITCODE -ne 0) { throw "[FAIL] 删除目录失败：$full（rd exit $LASTEXITCODE）" }
    }
    if (Test-Path -LiteralPath $full) { throw "[FAIL] 删除目录失败，路径仍存在：$full" }
    Write-Info "已删除 $full"
}

function Copy-TreeSafe {
    <# 用 robocopy 复制整目录（先删后拷由调用方保证）。 #>
    param(
        [Parameter(Mandatory)][string]$Source,
        [Parameter(Mandatory)][string]$Destination,
        [string[]]$ExcludeFiles = @(),
        [string[]]$ExcludeDirs = @()
    )
    if (-not (Test-Path -LiteralPath $Source)) { throw "[FAIL] 源目录不存在：$Source" }
    $args = @($Source, $Destination, '/E', '/COPY:DAT', '/DCOPY:DAT', '/R:1', '/W:1', '/MT:8',
              '/NFL', '/NDL', '/NJH', '/NJS', '/NP', '/IS')
    if ($ExcludeFiles.Count -gt 0) { $args += '/XF'; $args += $ExcludeFiles }
    if ($ExcludeDirs.Count -gt 0)  { $args += '/XD'; $args += $ExcludeDirs }
    $r = Invoke-Native -FilePath 'robocopy.exe' -ArgumentList $args -SuccessCodes @(0, 1, 2, 3, 4, 5, 6, 7) -SuppressOutput
    # robocopy: 0=无需复制 1=已复制 2=目标有多余 3=1+2 4=不匹配 8+=失败
    if ($r.ExitCode -ge 8) { throw "[FAIL] robocopy 失败：$Source -> $Destination（exit $($r.ExitCode)）`n$($r.StdErr)" }
    if ($r.ExitCode -ge 2) { Write-Warn2 "robocopy exit $($r.ExitCode)（存在多余/不匹配项）：$Destination" }
    Write-Info "已复制 $Source -> $Destination"
}

function Copy-FileSafe {
    param([Parameter(Mandatory)][string]$Source, [Parameter(Mandatory)][string]$Destination)
    if (-not (Test-Path -LiteralPath $Source -PathType Leaf)) { return $false }
    $destDir = Split-Path -Parent $Destination
    if (-not (Test-Path -LiteralPath $destDir)) { New-Item -ItemType Directory -Path $destDir -Force | Out-Null }
    Copy-Item -LiteralPath $Source -Destination $Destination -Force
    return $true
}

function Get-Sha16 {
    param([string]$Path)
    if (-not (Test-Path -LiteralPath $Path -PathType Leaf)) { return '(缺失)' }
    return (Get-FileHash -LiteralPath $Path -Algorithm SHA256).Hash.Substring(0, 16)
}

# ---------------------------------------------------------------- 0. 前置检查
Write-Section "0. 前置检查"

if (-not (Test-Path -LiteralPath $Repo)) { throw "[FAIL] 目标仓库不存在：$Repo" }
$Repo = (Resolve-Path -LiteralPath $Repo).Path.TrimEnd('\')
if (-not (Test-Path -LiteralPath (Join-Path $Repo '.git'))) { throw "[FAIL] $Repo 不是 git 仓库（缺 .git）" }

$top = @(Get-GitLines @('rev-parse', '--show-toplevel'))[0]
if (-not $top -or ([System.IO.Path]::GetFullPath($top).TrimEnd('\') -ne $Repo)) {
    throw "[FAIL] $Repo 不是 git 仓库根目录（toplevel=$top）"
}
Write-Info "仓库根目录  : $Repo"

# 上一次 git 操作被中断会留下 index.lock，它会让后续所有 git 写操作失败
if (Test-Path -LiteralPath (Join-Path $Repo '.git\index.lock')) {
    throw "[FAIL] 存在陈旧的 .git\index.lock，说明上一次 git 操作被中断。`n       请先确认没有 git 进程在跑，然后手动删除 $Repo\.git\index.lock 再重跑。"
}
# 运行期间不要对该仓库执行其它 git 命令（实测会让 git add 卡死）
Write-Info '提示        : 运行期间请勿对该仓库执行其它 git 命令（实测会让 git add 卡死）'

$branch = @(Get-GitLines @('rev-parse', '--abbrev-ref', 'HEAD'))[0]
Write-Info "当前分支    : $branch"

$remotes = @(Get-GitLines @('remote', '-v'))
Write-Info "远程        : $($remotes -join ' | ')"

$statusBefore = @(Get-GitLines @('status', '--short'))
Write-Info "同步前工作区状态（$(($statusBefore | Measure-Object).Count) 条）："
foreach ($s in $statusBefore) { Write-Host "    $s" }

if (-not $SkipPreflight) {
    if (-not (Test-Path -LiteralPath $Src)) {
        throw "[FAIL] 源目录不存在：$Src`n       构建流程可能还没结束 —— 等 $Src 出现后再运行本脚本。"
    }
    $srcJava = Join-Path $Src 'src\main\java'
    if (-not (Test-Path -LiteralPath $srcJava -PathType Container)) {
        throw "[FAIL] 源目录缺少 src\main\java：$srcJava"
    }
    $srcJavaCount = (Get-ChildItem -LiteralPath $srcJava -Recurse -File -Filter *.java | Measure-Object).Count
    Write-Info "源 .java 数  : $srcJavaCount"
    if ($srcJavaCount -le 5000) {
        throw "[FAIL] 源目录只有 $srcJavaCount 个 .java（要求 > 5000），看起来不是完整重建产物。"
    }
}

# ---------------------------------------------------------------- 1. 计划
Write-Section "1. 同步计划"

$plan = [ordered]@{}

# --- src/main/java ---
$oldJavaRel = @(Remove-PathPrefix (Get-GitLines @('ls-files', '--', 'src/main/java')) 'src/main/java/')
$newJava = @(Get-RelativeFileList (Join-Path $Src 'src\main\java'))
$javaDelta = Compare-Tree -OldPaths $oldJavaRel -NewPaths $newJava `
    -OldBase (Join-Path $Repo 'src\main\java') -NewBase (Join-Path $Src 'src\main\java')
$javaAdd = $javaDelta.Add; $javaDel = $javaDelta.Del; $javaMod = $javaDelta.Mod; $javaCaseOnly = $javaDelta.CaseOnly
$oldJavaMap = @{}; foreach ($f in $oldJavaRel) { $oldJavaMap[$f.ToLowerInvariant()] = $f }
$plan['src/main/java'] = [PSCustomObject]@{
    Old = $oldJavaRel.Count; New = $newJava.Count
    Add = $javaAdd.Count; Del = $javaDel.Count; Mod = $javaMod.Count; CaseOnly = $javaCaseOnly.Count
}

# --- src/main/resources ---
$srcRes = Join-Path $Src 'src\main\resources'
$hasRes = Test-Path -LiteralPath $srcRes -PathType Container
$oldResRel = @(Remove-PathPrefix (Get-GitLines @('ls-files', '--', 'src/main/resources')) 'src/main/resources/')
$newRes = @(); if ($hasRes) { $newRes = @(Get-RelativeFileList $srcRes) }
$resDelta = Compare-Tree -OldPaths $oldResRel -NewPaths $newRes `
    -OldBase (Join-Path $Repo 'src\main\resources') -NewBase $srcRes
$plan['src/main/resources'] = [PSCustomObject]@{
    Old = $oldResRel.Count; New = $newRes.Count
    Add = $resDelta.Add.Count; Del = $resDelta.Del.Count; Mod = $resDelta.Mod.Count; CaseOnly = $resDelta.CaseOnly.Count
    Present = $hasRes
}

# --- lib ---
$srcLib = Join-Path $Src 'lib'
$srcJars = @(); if (Test-Path -LiteralPath $srcLib -PathType Container) {
    $srcJars = @(Get-ChildItem -LiteralPath $srcLib -File -Filter *.jar | Select-Object -ExpandProperty Name)
}
$oldJars = @(); if (Test-Path -LiteralPath (Join-Path $Repo 'lib') -PathType Container) {
    $oldJars = @(Get-ChildItem -LiteralPath (Join-Path $Repo 'lib') -File -Filter *.jar | Select-Object -ExpandProperty Name)
}
$plan['lib'] = [PSCustomObject]@{
    Old = $oldJars.Count; New = $srcJars.Count
    Add = @($srcJars | Where-Object { $oldJars -notcontains $_ }).Count
    Del = @($oldJars | Where-Object { $srcJars -notcontains $_ }).Count
    Mod = @($srcJars | Where-Object { $oldJars -contains $_ }).Count
    CaseOnly = 0
    OldNames = $oldJars; NewNames = $srcJars
}

# --- tools（只 .java） ---
# 依次挑第一个「确实含 .java」的工具目录（$Src\tools 里可能只有 .py 临时脚本）
$toolCandidates = @()
if ($ToolsDir) { $toolCandidates += $ToolsDir }
if (Test-Path -LiteralPath (Join-Path $Src 'tools') -PathType Container) { $toolCandidates += (Join-Path $Src 'tools') }
if ($ToolchainDir -and (Test-Path -LiteralPath $ToolchainDir -PathType Container)) { $toolCandidates += $ToolchainDir }
$resolvedTools = $null
$srcTools = @()
foreach ($cand in $toolCandidates) {
    $found = @(Get-RelativeFileList $cand | Where-Object { $_ -like '*.java' })
    if ($found.Count -gt 0) { $resolvedTools = $cand; $srcTools = $found; break }
}
if (-not $resolvedTools) { Write-Warn2 "未找到含 .java 的工具目录（试过：$($toolCandidates -join ', ')）" }
$oldToolsRel = @(Remove-PathPrefix (Get-GitLines @('ls-files', '--', 'tools') | Where-Object { $_ -like '*.java' }) 'tools/')
$toolsDelta = Compare-Tree -OldPaths $oldToolsRel -NewPaths $srcTools
$plan['tools'] = [PSCustomObject]@{
    Old = $oldToolsRel.Count; New = $srcTools.Count
    Add = $toolsDelta.Add.Count; Del = $toolsDelta.Del.Count; Mod = $toolsDelta.Mod.Count; CaseOnly = $toolsDelta.CaseOnly.Count
    Source = $resolvedTools
}

# --- tables / tables-lit ---
# tables/ 的每个文件都记录来源，方便核对
$tableSources = [ordered]@{}
if (Test-Path -LiteralPath $TablesDir -PathType Container) {
    foreach ($f in @(Get-RelativeFileList $TablesDir | Where-Object { $_ -like '*.tsv' -or $_ -like '*.txt' })) {
        $tableSources[$f] = (Join-Path $TablesDir $f)
    }
}
# teardown 根目录的 reflect.tsv 是「大小写改名之后」的版本，比仓库里现有的那份新
if ($ReflectTable -and (Test-Path -LiteralPath $ReflectTable -PathType Leaf)) {
    $tableSources['reflect.tsv'] = $ReflectTable
}
if ($RenameTablesDir -and (Test-Path -LiteralPath $RenameTablesDir -PathType Container)) {
    foreach ($f in @(Get-RelativeFileList $RenameTablesDir | Where-Object { $_ -like 'class-rename*.tsv' })) {
        $tableSources[$f] = (Join-Path $RenameTablesDir $f)
    }
}
$oldTablesRel = @(Remove-PathPrefix (Get-GitLines @('ls-files', '--', 'tables')) 'tables/')
$newTables = @($tableSources.Keys)
$tablesDelta = Compare-Tree -OldPaths $oldTablesRel -NewPaths $newTables
# tables/ 每个文件的来源不同，按来源逐个比大小
$tableMod = @()
foreach ($name in $newTables) {
    $oldPath = Join-Path $Repo ('tables/' + $name)
    $newPath = $tableSources[$name]
    $o = Get-Item -LiteralPath $oldPath -ErrorAction SilentlyContinue
    $n = Get-Item -LiteralPath $newPath -ErrorAction SilentlyContinue
    if ($o -and $n -and $o.Length -ne $n.Length) { $tableMod += $name }
}
$plan['tables'] = [PSCustomObject]@{
    Old = $oldTablesRel.Count; New = $newTables.Count
    Add = $tablesDelta.Add.Count; Del = $tablesDelta.Del.Count; Mod = $tableMod.Count; CaseOnly = $tablesDelta.CaseOnly.Count
    Sources = $tableSources
}

$srcTablesLit = @(); if (Test-Path -LiteralPath $TablesLitDir -PathType Container) {
    $srcTablesLit = @(Get-RelativeFileList $TablesLitDir | Where-Object { $_ -like '*.tsv' })
}
$oldTablesLitRel = @(Remove-PathPrefix (Get-GitLines @('ls-files', '--', 'tables-lit')) 'tables-lit/')
$tablesLitDelta = Compare-Tree -OldPaths $oldTablesLitRel -NewPaths $srcTablesLit `
    -OldBase (Join-Path $Repo 'tables-lit') -NewBase $TablesLitDir
$plan['tables-lit'] = [PSCustomObject]@{
    Old = $oldTablesLitRel.Count; New = $srcTablesLit.Count
    Add = $tablesLitDelta.Add.Count; Del = $tablesLitDelta.Del.Count; Mod = $tablesLitDelta.Mod.Count; CaseOnly = $tablesLitDelta.CaseOnly.Count
    Files = $srcTablesLit
}

# --- docs/HANDOFF.md 来源 ---
$handoffSrc = $null
if (Test-Path -LiteralPath (Join-Path $Src 'docs\HANDOFF.md') -PathType Leaf) {
    $handoffSrc = Join-Path $Src 'docs\HANDOFF.md'
} elseif ($HandoffDir -and (Test-Path -LiteralPath (Join-Path $HandoffDir 'HANDOFF.md') -PathType Leaf)) {
    $handoffSrc = Join-Path $HandoffDir 'HANDOFF.md'
}
Write-Info "HANDOFF.md 来源 : $(if ($handoffSrc) { $handoffSrc } else { '未找到 → 保留仓库里现有那份' })"

Write-Host ''
Write-Host '  目标区域                 现有      新增      修改      删除    仅大小写变化' -ForegroundColor White
Write-Host '  -----------------------  ------   ------   ------   ------   --------------'
foreach ($k in $plan.Keys) {
    $p = $plan[$k]
    Write-Host ('  {0,-23}  {1,6}   {2,6}   {3,6}   {4,6}   {5,14}' -f $k, $p.Old, $p.Add, $p.Mod, $p.Del, $p.CaseOnly)
}
Write-Host ''
Write-Info "src/main/java 总数：$($oldJavaRel.Count) -> $($newJava.Count)"
Write-Info "仅大小写变化的路径（Windows 上是高危项）：$($javaCaseOnly.Count)"
if ($javaCaseOnly.Count -gt 0) {
    foreach ($f in ($javaCaseOnly | Select-Object -First 10)) {
        Write-Host "      $f   <=>   $($oldJavaMap[$f.ToLowerInvariant()])"
    }
}
if ($plan['lib'].Del -gt 0) {
    Write-Host ''
    Write-Info "lib/ 将被移除的 jar：$((@($plan['lib'].OldNames | Where-Object { $plan['lib'].NewNames -notcontains $_ })) -join ', ')"
}
if ($plan['lib'].Mod -gt 0) {
    Write-Info "lib/ 同名 jar（会被 $Src 的版本覆盖）：$((@($plan['lib'].OldNames | Where-Object { $plan['lib'].NewNames -contains $_ })) -join ', ')"
}
if ($plan['tables'].Sources.Count -gt 0) {
    Write-Host ''
    Write-Info 'tables/ 每个文件的来源：'
    foreach ($k in $plan['tables'].Sources.Keys) { Write-Host ("      {0,-26} <- {1}" -f $k, $plan['tables'].Sources[$k]) }
}
if ($plan['tables'].Del -gt 0) {
    Write-Host ''
    Write-Info "tables/ 将被移除：$($tablesDelta.Del -join ', ')"
}
Write-Host ''

if ($DryRun) {
    Write-Section "DRY RUN 结束"
    Write-Info "没有做任何改动。去掉 -DryRun 即可真正执行。"
    exit 0
}

# ---------------------------------------------------------------- 2. 执行同步
Write-Section "2. 执行同步"

# --- 2.1 src/main/java ---
Write-Info "[2.1] src/main/java：git rm --cached -> 物理删除 -> 拷入新树"
$t0 = Get-Date
Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'src/main/java') | Out-Null
Write-Info ("      git rm --cached 完成（{0:N1}s）" -f ((Get-Date) - $t0).TotalSeconds)

Remove-TreeSafe (Join-Path $Repo 'src\main\java')
Copy-TreeSafe -Source (Join-Path $Src 'src\main\java') -Destination (Join-Path $Repo 'src\main\java')
$afterJava = (Get-ChildItem -LiteralPath (Join-Path $Repo 'src\main\java') -Recurse -File -Filter *.java | Measure-Object).Count
if ($afterJava -ne $newJava.Count) {
    throw "[FAIL] 拷完后 .java 数量对不上：期望 $($newJava.Count)，实际 $afterJava"
}
Write-Info "      拷入 .java 数量校验通过：$afterJava"

# --- 2.2 src/main/resources ---
if ($hasRes) {
    Write-Info "[2.2] src/main/resources：整目录替换"
    Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'src/main/resources') | Out-Null
    Remove-TreeSafe (Join-Path $Repo 'src\main\resources')
    Copy-TreeSafe -Source $srcRes -Destination (Join-Path $Repo 'src\main\resources')
} else {
    Write-Info "[2.2] src/main/resources：$Src 下不存在，跳过（保留仓库现有内容）"
}

# --- 2.3 pom.xml / maven-settings.xml ---
Write-Info "[2.3] pom.xml / maven-settings.xml"
foreach ($f in @('pom.xml', 'maven-settings.xml')) {
    $s = Join-Path $Src $f
    if (Test-Path -LiteralPath $s -PathType Leaf) {
        Copy-FileSafe -Source $s -Destination (Join-Path $Repo $f) | Out-Null
        Write-Info "      $f  <= $s  (sha16 $(Get-Sha16 (Join-Path $Repo $f)))"
    } else {
        Write-Warn2 "$f 在 $Src 下不存在 → 保留仓库里现有那份"
    }
}

# --- 2.4 lib ---
Write-Info "[2.4] lib/：jar 同步"
if (Test-Path -LiteralPath $srcLib -PathType Container) {
    Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'lib') | Out-Null
    Remove-TreeSafe (Join-Path $Repo 'lib')
    Copy-TreeSafe -Source $srcLib -Destination (Join-Path $Repo 'lib')
} else {
    Write-Warn2 "lib/ 在 $Src 下不存在 → 保留仓库现有内容"
}

# --- 2.5 tables / tables-lit ---
Write-Info "[2.5] tables/ 与 tables-lit/"
if ($tableSources.Count -gt 0) {
    Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'tables') | Out-Null
    Remove-TreeSafe (Join-Path $Repo 'tables')
    New-Item -ItemType Directory -Path (Join-Path $Repo 'tables') -Force | Out-Null
    foreach ($name in $tableSources.Keys) {
        Copy-FileSafe -Source $tableSources[$name] -Destination (Join-Path $Repo ('tables/' + $name)) | Out-Null
        Write-Info "      tables/$name  <= $($tableSources[$name])"
    }
} else {
    Write-Warn2 "没有可用的 tables/ 来源 → 保留仓库现有内容"
}
if (Test-Path -LiteralPath $TablesLitDir -PathType Container) {
    Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'tables-lit') | Out-Null
    Remove-TreeSafe (Join-Path $Repo 'tables-lit')
    Copy-TreeSafe -Source $TablesLitDir -Destination (Join-Path $Repo 'tables-lit')
} else {
    Write-Warn2 "tables-lit/ 来源不存在：$TablesLitDir → 保留仓库现有内容"
}

# --- 2.6 tools（只 .java） ---
Write-Info "[2.6] tools/：只同步 .java 源码"
if ($srcTools.Count -gt 0) {
    Invoke-Git @('rm', '-r', '--cached', '--quiet', '--force', '--ignore-unmatch', '--', 'tools') | Out-Null
    Remove-TreeSafe (Join-Path $Repo 'tools')
    New-Item -ItemType Directory -Path (Join-Path $Repo 'tools') -Force | Out-Null
    foreach ($f in $srcTools) {
        Copy-FileSafe -Source (Join-Path $resolvedTools $f) -Destination (Join-Path $Repo ('tools/' + $f)) | Out-Null
    }
    Write-Info "      同步 .java 工具 $(@($srcTools).Count) 个（已排除 .class/.log 等产物）"
} else {
    Write-Warn2 "未解析到 tools 来源 → 保留仓库现有内容"
}

# --- 2.6b tools/python/（Python 工具：变量作用域修复器 + 错误分析器）---
# tools/ 目录会被整目录删除重建，所以 Python 工具必须单独从来源目录拷，
# 否则每次同步都会把 tools/python/ 删掉。
Write-Info "[2.6b] tools/python/：Python 工具"
$pySources = @(
    @{ Src = 'D:\chat_work\temp\varscope\fix_varscope.py'; Dst = 'fix_varscope.py' },
    @{ Src = 'D:\chat_work\temp\varscope\jscope.py';        Dst = 'jscope.py' },
    @{ Src = 'D:\chat_work\temp\varscope\jtypes.py';       Dst = 'jtypes.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\errscan.py';       Dst = 'errscan.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fill_readme.py';   Dst = 'fill_readme.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\rename_source.py'; Dst = 'rename_source.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\build_class_index.py'; Dst = 'build_class_index.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_ref_types.py'; Dst = 'fix_ref_types.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_simple_errors.py'; Dst = 'fix_simple_errors.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_boolean.py';   Dst = 'fix_boolean.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_boolean2.py';  Dst = 'fix_boolean2.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_missing_vars.py'; Dst = 'fix_missing_vars.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_casts_this.py'; Dst = 'fix_casts_this.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_longtail.py';  Dst = 'fix_longtail.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\fix_super.py';     Dst = 'fix_super.py' },
    @{ Src = 'D:\chat_work\temp\fsbuild\verify.ps1';       Dst = 'verify.ps1' },
    @{ Src = 'D:\chat_work\temp\fsbuild\loopType.ps1';     Dst = 'loopType.ps1' }
)
New-Item -ItemType Directory -Path (Join-Path $Repo 'tools\python') -Force | Out-Null
$pyCopied = 0
foreach ($p in $pySources) {
    if (Test-Path $p.Src) {
        Copy-FileSafe -Source $p.Src -Destination (Join-Path $Repo ('tools\python\' + $p.Dst)) | Out-Null
        $pyCopied++
    }
}
Write-Info "      同步 Python 工具 $pyCopied 个"

# --- 2.6c rename-plan/（改名提案 + Registry 别名表）---
$renamePlanDir = 'D:\chat_work\rename-plan'
if (Test-Path $renamePlanDir) {
    New-Item -ItemType Directory -Path (Join-Path $Repo 'docs\rename-plan') -Force | Out-Null
    $rpCopied = 0
    foreach ($f in @('class-rename-proposal-v2.tsv','registry-alias-design.md',
                     'registry-alias-map.tsv','registry-alias-map.tsv.plaintext.tsv',
                     'registry-alias-ambiguous.tsv','vendor-quarantine.md')) {
        $s = Join-Path $renamePlanDir $f
        if (Test-Path $s) {
            Copy-FileSafe -Source $s -Destination (Join-Path $Repo ('docs\rename-plan\' + $f)) | Out-Null
            $rpCopied++
        }
    }
    Write-Info "[2.6c] docs/rename-plan/：同步 $rpCopied 个"
}

# --- 2.7 docs/HANDOFF.md ---
Write-Info "[2.7] docs/HANDOFF.md"
if ($handoffSrc) {
    Copy-FileSafe -Source $handoffSrc -Destination (Join-Path $Repo 'docs\HANDOFF.md') | Out-Null
    Write-Info "      <= $handoffSrc  (sha16 $(Get-Sha16 (Join-Path $Repo 'docs\HANDOFF.md')))"
} else {
    Write-Warn2 "未找到可用的 HANDOFF.md 来源 → 保留仓库里现有那份"
}

# ---------------------------------------------------------------- 3. 暂存与统计
Write-Section "3. git add -A 与状态统计"

Invoke-Git @('add', '-A') | Out-Null
Write-Info 'git add -A 完成'

$status = @(Get-GitLines @('status', '--short'))
$added = 0; $modified = 0; $deleted = 0; $renamed = 0; $untracked = 0; $other = 0
$byArea = @{}
foreach ($line in $status) {
    if ($line.Length -lt 3) { continue }
    $x = $line.Substring(0, 1)
    $path = $line.Substring(3).Trim()
    if ($x -eq '?') { $untracked++; continue }
    switch ($x) {
        'A' { $added++ }
        'M' { $modified++ }
        'D' { $deleted++ }
        'R' { $renamed++ }
        default { $other++ }
    }
    $area = ($path -split '/')[0]
    if (-not $byArea.ContainsKey($area)) { $byArea[$area] = 0 }
    $byArea[$area]++
}
Write-Host ''
Write-Info "暂存变更合计：$(($status | Measure-Object).Count) 条"
Write-Info "  added=$added  modified=$modified  deleted=$deleted  renamed=$renamed  other=$other  untracked=$untracked"
Write-Host ''
Write-Info '按顶层目录分布：'
foreach ($k in ($byArea.Keys | Sort-Object)) { Write-Host ("    {0,-24} {1,6}" -f $k, $byArea[$k]) }

# ---------------------------------------------------------------- 4. commit / push
$defaultMessage = @(
    "feat: 同步最新重建产物（语义包源码树 + 依赖 jar + 中间表）"
    ""
    "src/main/java   : $($oldJavaRel.Count) -> $($newJava.Count) 个 .java（仅大小写变化 $($javaCaseOnly.Count) 处）"
    "src/main/resources: $(if ($hasRes) { "$($newRes.Count) 个文件" } else { '未提供，保留原有' })"
    "lib/            : $(@(Get-ChildItem -LiteralPath (Join-Path $Repo 'lib') -File -Filter *.jar -ErrorAction SilentlyContinue).Count) 个 jar"
    "tables/         : $(@(Get-GitLines @('ls-files', '--', 'tables')).Count) 个文件"
    "tables-lit/     : $(@(Get-GitLines @('ls-files', '--', 'tables-lit')).Count) 个文件"
    "tools/          : $(@(Get-GitLines @('ls-files', '--', 'tools')).Count) 个 .java"
    ""
    "同步自：$Src"
) -join "`n"

Write-Section "4. Commit / Push"
if (-not $Message) { $Message = $defaultMessage }

Write-Host 'commit message 草稿：' -ForegroundColor White
Write-Host '----------------------------------------'
Write-Host $Message
Write-Host '----------------------------------------'

if (-not $Push) {
    Write-Host ''
    Write-Info '未指定 -Push：停在 commit 之前。变更已暂存（git add -A），可自行核对后提交。'
    Write-Info '确认无误后手动执行：'
    Write-Host ('    git -C "{0}" commit -m "<见上方草稿>"' -f $Repo) -ForegroundColor Yellow
    Write-Host ('    git -C "{0}" push origin {1}' -f $Repo, $branch) -ForegroundColor Yellow
    Write-Host ''
    Write-Info ("总耗时：{0:N1}s" -f ((Get-Date) - $script:StartedAt).TotalSeconds)
    exit 0
}

if ($added + $modified + $deleted + $renamed + $other -eq 0) {
    throw '[FAIL] 没有任何暂存变更，无需提交。'
}
if ($branch -ne 'main') {
    throw "[FAIL] 当前分支是 '$branch'，本脚本只允许在 main 上提交推送。"
}
$origin = @(Get-GitLines @('remote', 'get-url', 'origin'))
if (-not $origin) { throw '[FAIL] 没有配置 origin 远程。' }
Write-Warn2 "即将把上述变更提交并推送到公开远程：$($origin[0])（分支 $branch）"

Write-Info 'git commit ...'
Invoke-Git @('commit', '-m', $Message) | Out-Null
$newHead = @(Get-GitLines @('rev-parse', '--short', 'HEAD'))[0]
Write-Info "已提交：$newHead"

Write-Info "git push origin $branch ..."
Invoke-Git @('push', 'origin', $branch) | Out-Null
Write-Info "已推送：$($origin[0]) @ $branch"

$after = @(Get-GitLines @('status', '--short'))
Write-Host ''
Write-Info "推送后工作区状态：$(if ($after.Count -eq 0) { '干净' } else { "$($after.Count) 条未提交变更" })"
Write-Info ("总耗时：{0:N1}s" -f ((Get-Date) - $script:StartedAt).TotalSeconds)
