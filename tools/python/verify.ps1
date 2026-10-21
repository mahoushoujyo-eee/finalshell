param(
    [string]$Proj = 'D:\chat_work\fsfinal2',
    [string]$Out = 'D:\chat_work\temp\fsbuild\outV',
    [string]$Log = 'D:\chat_work\temp\fsbuild\jv.log'
)
$ErrorActionPreference = 'Continue'
$env:JAVA_TOOL_OPTIONS = '-Duser.language=en -Duser.country=US'
$src = Join-Path $Proj 'src\main\java'
$list = 'D:\chat_work\temp\fsbuild\sourcesV.txt'
Get-ChildItem $src -Recurse -Filter *.java -File |
    Where-Object { $_.Name -ne 'ModuleInfo.java' } |
    ForEach-Object { $_.FullName } |
    Set-Content $list -Encoding UTF8
$cp = "$Proj\lib\bundled-libs.jar;$Proj\lib\bcprov.jar;$Proj\lib\javax.mail-1.6.2.jar;$Proj\lib\javax.activation-api-1.2.0.jar"
& 'C:\Program Files\Java\jdk-17\bin\javac.exe' -encoding UTF-8 -nowarn -Xmaxerrs 100000 -d $Out -cp $cp "@$list" 2> $Log
$code = $LASTEXITCODE
$t = [System.Text.Encoding]::UTF8.GetString([System.IO.File]::ReadAllBytes($Log))
$errs = @($t -split "`r?`n" | Where-Object { $_ -match ': error: ' })
$synPat = "error: <identifier> expected|error: '\(' or '\[' expected|error: ';' expected|error: illegal start of expression|error: '\)' expected|error: '\[' expected|error: '\]' expected|error: not a statement|error: class, interface, enum, or record expected|error: reached end of file while parsing|error: illegal start of type|error: '<' expected|error: malformed|error: '\(' expected|error: '\}' expected|error: duplicate class|error: '\{' expected|error: invalid method declaration|error: enum constant expected here|error: no interface expected here|error: modifier default not allowed here|error: initializers not allowed in interfaces|error: = expected|error: call to super must be first statement in constructor|error: classes cannot directly extend java.lang.Enum|error: unreachable statement|error: missing return statement|error: variable .* might not have been initialized"
$syn = @($errs | Where-Object { $_ -match $synPat })
"javac exit=$code  ERRORS=$($errs.Count)  syntax=$($syn.Count)  type=$($errs.Count - $syn.Count)  files=" + (($errs | ForEach-Object { ($_ -split ': error')[0] } | Sort-Object -Unique).Count)
$errs | ForEach-Object { if ($_ -match ': error: (.*)$') { $Matches[1] } } |
    Group-Object | Sort-Object Count -Descending | Select-Object -First 12 |
    ForEach-Object { '  {0,6}  {1}' -f $_.Count, $_.Name }
