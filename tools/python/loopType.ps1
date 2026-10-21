param(
    [string]$Proj = 'D:\chat_work\fsfinal2',
    [int]$Rounds = 24
)
$ErrorActionPreference = 'Continue'
$work = 'D:\chat_work\temp\fsbuild'
$loopLock = "$work\LOOP.lock"
if (Test-Path $loopLock) { 'LOOP LOCKED: ' + ([System.IO.File]::ReadAllText($loopLock)).Trim(); exit 0 }
[System.IO.File]::WriteAllText($loopLock, 'loop pid=' + $PID + ' ' + (Get-Date -Format o))
Register-EngineEvent -SourceIdentifier PowerShell.Exiting -Action {
    Remove-Item 'D:\chat_work\temp\fsbuild\LOOP.lock' -Force -ErrorAction SilentlyContinue
} | Out-Null
$td = 'D:\chat_work\finalshell-teardown'
$env:JAVA_TOOL_OPTIONS = '-Duser.language=en -Duser.country=US'
$JC = 'C:\Program Files\Java\jdk-17\bin\javac.exe'
$J = 'C:\Program Files\Java\jdk-17\bin\java.exe'
$PY = 'C:\app\Python\Python313\python.exe'
$src = Join-Path $Proj 'src\main\java'
$list = "$work\sourcesR.txt"
$cp = "$Proj\lib\bundled-libs.jar;$Proj\lib\bcprov.jar;$Proj\lib\javax.mail-1.6.2.jar;$Proj\lib\javax.activation-api-1.2.0.jar"

for ($r = 1; $r -le $Rounds; $r++) {
    Get-ChildItem $src -Recurse -Filter *.java -File |
        Where-Object { $_.Name -ne 'ModuleInfo.java' } |
        ForEach-Object { $_.FullName } | Set-Content $list -Encoding UTF8
    $log = "$work\jr-R$r.log"
    & $JC -encoding UTF-8 -nowarn -Xmaxerrs 100000 -d "$work\outR" -cp $cp "@$list" 2> $log
    $t = [System.Text.Encoding]::UTF8.GetString([System.IO.File]::ReadAllBytes($log))
    $errs = @($t -split "`r?`n" | Where-Object { $_ -match ': error: ' })
    "ROUND $r errors=$($errs.Count)" | Tee-Object -FilePath "$work\jr-loop.log" -Append
    if ($errs.Count -eq 0) { 'CONVERGED' | Tee-Object -FilePath "$work\jr-loop.log" -Append; break }
    $slot = $r % 4
    if ($slot -eq 1) {
        & $PY 'D:\chat_work\temp\varscope\fix_varscope.py' $src $log "--report=$work\varscope-R$r.tsv" *> "$work\tool-R$r.log"
        "  varscope exit=$LASTEXITCODE" | Tee-Object -FilePath "$work\jr-loop.log" -Append
    } elseif ($slot -eq 2) {
        & $J -cp "$td\tools\bin" FixTree $src $log "$work\fake-enums.txt" *> "$work\tool-R$r.log"
        "  fixtree exit=$LASTEXITCODE" | Tee-Object -FilePath "$work\jr-loop.log" -Append
    } elseif ($slot -eq 3) {
        & $J -cp "$td\tools\bin" FixStruct $src $log "--report=$work\fixstruct-R$r.tsv" *> "$work\tool-R$r.log"
        "  fixstruct exit=$LASTEXITCODE" | Tee-Object -FilePath "$work\jr-loop.log" -Append
    } else {
        & $J -cp "$td\tools\bin" FixAnnotations $src "--report=$work\fixannot-R$r.tsv" *> "$work\tool-R$r.log"
        "  fixannot exit=$LASTEXITCODE" | Tee-Object -FilePath "$work\jr-loop.log" -Append
    }
}
