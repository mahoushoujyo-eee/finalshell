# FinalShell 资源清单 (RESOURCES.md)

> 本文件由自动化脚本生成，描述从 `finalshell.jar` 中提取出的**全部非 class 资源**。

## 0. 提取摘要

| 项 | 值 |
|---|---|
| 源 jar | `D:\chat_work\finalshell-teardown\finalshell.jar` (49,174,505 字节) |
| jar 内条目总数 | 20,338 (含 660 个目录条目) |
| jar 内文件条目总数 | 19,678 |
| **排除的 class 文件 (magic `CAFEBABE`)** | **18,162** |
| &nbsp;&nbsp;├ 其中正常 `.class` | 17,373 |
| &nbsp;&nbsp;└ 其中入口名被改写为 `*.SCL.lombok` | **789** |
| **提取出的资源文件总数** | **1,516** |
| 资源总字节数 (未压缩) | 29,744,107 |
| 输出目录 | `D:\chat_work\finalshell-project\src\main\resources\` |
| 完整性校验 | 1,516 / 1,516 与 jar 条目**逐字节一致** (0 丢失、0 损坏) |
| 非法文件名改名 | **0 个**（无 `: * ? " < > |`，无尾随空格/点，无 DOS 保留名） |
| jar 内重名条目 | 1 个（`module-info.class`，两份内容相同，均为 class，已排除） |

**判别依据**：所有条目按**文件内容**前 4 字节判定（`\xca\xfe\xba\xbe`），而非扩展名。
这正是 789 个 `*.SCL.lombok` 能被正确排除的原因——它们扩展名不是 `.class`，但内容确实是 class。
实测：789 个 `.SCL.lombok` 条目**全部**以 `CAFEBABE` 开头；
17,373 个 `.class` 条目**全部**以 `CAFEBABE` 开头（无误判）。

### 0.1 那 789 个 `*.SCL.lombok` 到底是什么

它们的真实路径前缀（jar 内实际条目名）：

| 前缀 | 数量 | 归属 |
|---|---:|---|
| `org/objectweb/asm/**` | 116 | **ASM** 字节码库（任务描述中的 "ASM 116"） |
| `lombok/**` | 650 | Lombok |
| `Class50/lombok/**` | 12 | Lombok |
| `com/**` | 11 | Lombok 相关 |
| **合计** | **789** | ASM 116 + Lombok 673 |

即：被改名的全部是 **Lombok 注解处理器及其 ASM 依赖**（编译期工具），
**不是 FinalShell 自身的业务类**。因此它们对运行时无影响，
排除掉它们不会破坏应用运行；`Main-Class: st` 对应的 `st.class` 是**正常的 `.class`**，位于 jar 根目录，未被改名。

## 1. 按顶层目录的分类统计

| 分类 | 文件数 | 总字节数 | 占比 |
|---|---:|---:|---:|
| `resources/font` | 22 | 9,180,968 | 30.9% |
| `com (其他)` | 643 | 6,326,100 | 21.3% |
| `resources/images` | 6 | 6,319,766 | 21.2% |
| `com/formdev/flatlaf` | 181 | 4,652,818 | 15.6% |
| `org` | 494 | 1,456,925 | 4.9% |
| `font` | 1 | 770,232 | 2.6% |
| `<根目录>` | 12 | 628,661 | 2.1% |
| `mozilla` | 1 | 218,626 | 0.7% |
| `lombok` | 16 | 147,510 | 0.5% |
| `resources/theme` | 124 | 35,470 | 0.1% |
| `images` | 15 | 6,874 | 0.0% |
| `META-INF` | 1 | 157 | 0.0% |
| **合计** | **1516** | **29,744,107** | **100%** |

### 1.1 按文件类型统计

| 类型 | 文件数 | 总字节数 |
|---|---:|---:|
| png | 626 | 1,115,432 |
| properties | 264 | 242,637 |
| json | 190 | 2,124,043 |
| txt | 156 | 577,165 |
| svg | 51 | 61,651 |
| flex | 48 | 898,328 |
| html | 30 | 15,993 |
| ttf | 27 | 10,473,868 |
| gif | 26 | 27,527 |
| xml | 20 | 155,283 |
| so | 20 | 2,914,851 |
| jfd | 12 | 140,807 |
| template | 11 | 4,656 |
| otf | 8 | 2,170,136 |
| dll | 5 | 764,880 |
| jpg | 5 | 6,312,278 |
| 其他(无扩展名) | 4 | 11,956 |
| dtd | 3 | 8,999 |
| a | 2 | 1,270,559 |
| jnilib | 2 | 267,208 |
| binary | 2 | 81,278 |
| jar | 1 | 3,004 |
| mf | 1 | 157 |
| dat | 1 | 100,361 |
| md | 1 | 1,050 |

## 2. 完整非 class 条目清单（按目录分组）

路径相对于 `src/main/resources/`。

### `./` — 12 个文件，628,661 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `.netbeans_automatic_build` | 0 | 其他(无扩展名) |
| `AUTHORS` | 2,609 | 其他(无扩展名) |
| `LICENSE` | 5,378 | 其他(无扩展名) |
| `README.md` | 1,050 | md |
| `changelog.txt` | 96,056 | txt |
| `fa-brands-400.ttf` | 130,552 | ttf |
| `fa-regular-400.ttf` | 34,096 | ttf |
| `fa-solid-900.ttf` | 192,472 | ttf |
| `fontawesome-webfont.ttf` | 165,548 | ttf |
| `latestchanges.html` | 511 | html |
| `log4j.properties` | 379 | properties |
| `release-timestamp.txt` | 10 | txt |

### `META-INF/` — 1 个文件，157 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `MANIFEST.MF` | 157 | mf |

### `com/` — 1 个文件，280 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `packageinfo.txt` | 280 | txt |

### `com/A/icons/` — 10 个文件，76,846 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `close.png` | 2,920 | png |
| `close_active.png` | 2,908 | png |
| `corner.png` | 2,859 | png |
| `maximize.png` | 2,898 | png |
| `maximize_active.png` | 2,880 | png |
| `minimize.png` | 2,847 | png |
| `minimize_active.png` | 2,846 | png |
| `restore.png` | 2,920 | png |
| `restore_active.png` | 2,925 | png |
| `watermark.png` | 50,843 | png |

### `com/C/icons/` — 4 个文件，11,437 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `close.png` | 2,900 | png |
| `maximize.png` | 2,841 | png |
| `minimize.png` | 2,822 | png |
| `restore.png` | 2,874 | png |

### `com/C/resources/` — 5 个文件，10,628 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `WebSkin.xml` | 625 | xml |
| `label.xml` | 3,320 | xml |
| `panel.xml` | 3,411 | xml |
| `popupMenu.xml` | 774 | xml |
| `scrollBar.xml` | 2,498 | xml |

### `com/I/icons/` — 5 个文件，3,098 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `class.png` | 576 | png |
| `file.png` | 485 | png |
| `jar.png` | 868 | png |
| `java.png` | 537 | png |
| `package.png` | 632 | png |

### `com/L/icons/` — 1 个文件，988 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `arrow.png` | 988 | png |

### `com/T/icons/` — 8 个文件，19,698 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `color_chooser.png` | 548 | png |
| `error.png` | 3,187 | png |
| `information.png` | 2,267 | png |
| `left.png` | 2,943 | png |
| `loop.png` | 2,886 | png |
| `question.png` | 3,385 | png |
| `right.png` | 2,940 | png |
| `warning.png` | 1,542 | png |

### `com/U/icons/` — 4 个文件，3,931 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `down.png` | 983 | png |
| `left.png` | 986 | png |
| `right.png` | 984 | png |
| `up.png` | 978 | png |

### `com/V/icons/` — 2 个文件，1,968 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `down.png` | 988 | png |
| `up.png` | 980 | png |

### `com/W/icons/` — 4 个文件，2,860 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `error.png` | 696 | png |
| `information.png` | 744 | png |
| `question.png` | 766 | png |
| `warning.png` | 654 | png |

### `com/Z/icons/` — 23 个文件，26,319 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `approve.png` | 634 | png |
| `backward.png` | 687 | png |
| `cancel.png` | 663 | png |
| `computer.png` | 545 | png |
| `cross.png` | 2,922 | png |
| `dir_icon.png` | 476 | png |
| `down.png` | 988 | png |
| `edit.png` | 503 | png |
| `file_icon.png` | 485 | png |
| `folder_home.png` | 1,552 | png |
| `folder_new.png` | 589 | png |
| `folder_up.png` | 708 | png |
| `forward.png` | 656 | png |
| `history.png` | 878 | png |
| `icons.png` | 3,174 | png |
| `left.png` | 986 | png |
| `refresh.png` | 836 | png |
| `remove.png` | 544 | png |
| `right.png` | 986 | png |
| `settings.png` | 916 | png |
| `table.png` | 2,906 | png |
| `tiles.png` | 3,141 | png |
| `view.png` | 544 | png |

### `com/b/icons/` — 4 个文件，2,089 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `file.png` | 485 | png |
| `folder.png` | 476 | png |
| `image.png` | 562 | png |
| `nonhidden.png` | 566 | png |

### `com/formdev/flatlaf/` — 6 个文件，77,639 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `FlatDarculaLaf.properties` | 2,019 | properties |
| `FlatDarkLaf.properties` | 14,073 | properties |
| `FlatIntelliJLaf.properties` | 2,471 | properties |
| `FlatLaf.properties` | 31,222 | properties |
| `FlatLightLaf.properties` | 14,487 | properties |
| `IntelliJTheme$ThemeLaf.properties` | 13,367 | properties |

### `com/formdev/flatlaf/demo/` — 12 个文件，132,600 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `BasicComponentsPanel.jfd` | 29,104 | jfd |
| `ControlBar.jfd` | 2,303 | jfd |
| `DataComponentsPanel.jfd` | 14,899 | jfd |
| `DemoFrame.jfd` | 18,138 | jfd |
| `FlatDarkLaf.properties` | 1,018 | properties |
| `FlatLaf.svg` | 590 | svg |
| `FlatLightLaf.properties` | 1,006 | properties |
| `HintManager.jfd` | 1,135 | jfd |
| `MoreComponentsPanel.jfd` | 17,650 | jfd |
| `NewDialog.jfd` | 8,459 | jfd |
| `OptionPanePanel.jfd` | 10,960 | jfd |
| `TabsPanel.jfd` | 27,338 | jfd |

### `com/formdev/flatlaf/demo/extras/` — 1 个文件，4,114 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ExtrasPanel.jfd` | 4,114 | jfd |

### `com/formdev/flatlaf/demo/extras/svg/` — 4 个文件，1,618 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `LICENSE.txt` | 206 | txt |
| `errorDialog.svg` | 497 | svg |
| `informationDialog.svg` | 527 | svg |
| `warningDialog.svg` | 388 | svg |

### `com/formdev/flatlaf/demo/extras/svg/actions/` — 6 个文件，2,967 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `colors.svg` | 550 | svg |
| `copy.svg` | 510 | svg |
| `execute.svg` | 309 | svg |
| `intentionBulb.svg` | 640 | svg |
| `quickfixOffBulb.svg` | 640 | svg |
| `suspend.svg` | 318 | svg |

### `com/formdev/flatlaf/demo/extras/svg/objects/` — 6 个文件，9,481 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `abstractClass.svg` | 1,523 | svg |
| `abstractMethod.svg` | 1,723 | svg |
| `annotationtype.svg` | 1,866 | svg |
| `css.svg` | 2,262 | svg |
| `javaScript.svg` | 1,462 | svg |
| `xhtml.svg` | 645 | svg |

### `com/formdev/flatlaf/demo/icons/` — 36 个文件，29,380 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `DataTables.svg` | 561 | svg |
| `LICENSE.txt` | 206 | txt |
| `RecentlyUsed.svg` | 1,263 | svg |
| `back.svg` | 589 | svg |
| `bookmarkGroup.svg` | 444 | svg |
| `buildLoadChanges.svg` | 1,128 | svg |
| `commit.svg` | 346 | svg |
| `copy.svg` | 510 | svg |
| `diff.svg` | 777 | svg |
| `download.svg` | 448 | svg |
| `favorite.svg` | 413 | svg |
| `forward.svg` | 631 | svg |
| `github.svg` | 1,898 | svg |
| `github_dark.svg` | 1,900 | svg |
| `intellij-showWriteAccess.png` | 325 | png |
| `intellij-showWriteAccess@2x.png` | 495 | png |
| `listFiles.svg` | 467 | svg |
| `matchCase.svg` | 1,698 | svg |
| `matchCaseHovered.svg` | 1,705 | svg |
| `matchCaseSelected.svg` | 1,670 | svg |
| `menu-cut.svg` | 2,076 | svg |
| `menu-paste.svg` | 426 | svg |
| `project.svg` | 473 | svg |
| `redo.svg` | 664 | svg |
| `refresh.svg` | 1,131 | svg |
| `regex.svg` | 770 | svg |
| `regexHovered.svg` | 770 | svg |
| `regexSelected.svg` | 752 | svg |
| `search.svg` | 714 | svg |
| `show.svg` | 699 | svg |
| `undo.svg` | 610 | svg |
| `user.svg` | 529 | svg |
| `users.svg` | 835 | svg |
| `words.svg` | 487 | svg |
| `wordsHovered.svg` | 494 | svg |
| `wordsSelected.svg` | 476 | svg |

### `com/formdev/flatlaf/demo/intellijthemes/` — 2 个文件，24,843 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `IJThemesPanel.jfd` | 2,730 | jfd |
| `themes.json` | 22,113 | json |

### `com/formdev/flatlaf/extras/` — 1 个文件，3,977 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `FlatUIDefaultsInspector.jfd` | 3,977 | jfd |

### `com/formdev/flatlaf/fonts/inter/` — 9 个文件，2,174,562 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Inter-Bold.otf` | 271,436 | otf |
| `Inter-BoldItalic.otf` | 278,016 | otf |
| `Inter-Italic.otf` | 271,400 | otf |
| `Inter-Light.otf` | 265,000 | otf |
| `Inter-LightItalic.otf` | 274,996 | otf |
| `Inter-Regular.otf` | 258,992 | otf |
| `Inter-SemiBold.otf` | 270,760 | otf |
| `Inter-SemiBoldItalic.otf` | 279,536 | otf |
| `LICENSE.txt` | 4,426 | txt |

### `com/formdev/flatlaf/intellijthemes/themes/` — 53 个文件，356,754 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Carbon.LICENSE.txt` | 11,357 | txt |
| `Carbon.theme.json` | 11,420 | json |
| `Cobalt_2.LICENSE.txt` | 1,055 | txt |
| `Cobalt_2.theme.json` | 4,631 | json |
| `Cyan.LICENSE.txt` | 1,077 | txt |
| `Cyan.theme.json` | 7,745 | json |
| `DarkFlatTheme.LICENSE.txt` | 1,071 | txt |
| `DarkFlatTheme.theme.json` | 14,626 | json |
| `DarkPurple.LICENSE.txt` | 1,077 | txt |
| `DarkPurple.theme.json` | 11,487 | json |
| `Dracula.LICENSE.txt` | 1,087 | txt |
| `Dracula.theme.json` | 11,050 | json |
| `Gradianto.LICENSE.txt` | 1,066 | txt |
| `Gradianto_Nature_Green.theme.json` | 7,962 | json |
| `Gradianto_dark_fuchsia.theme.json` | 8,145 | json |
| `Gradianto_deep_ocean.theme.json` | 7,797 | json |
| `Gradianto_midnight_blue.theme.json` | 7,757 | json |
| `Gray.LICENSE.txt` | 1,077 | txt |
| `Gray.theme.json` | 6,173 | json |
| `Hiberbee.LICENSE.txt` | 1,114 | txt |
| `HiberbeeDark.theme.json` | 15,471 | json |
| `HighContrast.LICENSE.txt` | 1,077 | txt |
| `HighContrast.theme.json` | 11,879 | json |
| `LightFlatTheme.LICENSE.txt` | 1,071 | txt |
| `LightFlatTheme.theme.json` | 14,563 | json |
| `MaterialTheme.LICENSE.txt` | 1,078 | txt |
| `MaterialTheme.theme.json` | 7,822 | json |
| `Monocai.LICENSE.txt` | 1,079 | txt |
| `Monocai.theme.json` | 9,732 | json |
| `Monokai_Pro.LICENSE.txt` | 1,045 | txt |
| `Monokai_Pro.default.theme.json` | 19,767 | json |
| `Solarized.LICENSE.txt` | 1,211 | txt |
| `SolarizedDark.theme.json` | 21,949 | json |
| `SolarizedLight.theme.json` | 22,410 | json |
| `Spacegray.LICENSE.txt` | 1,069 | txt |
| `Spacegray.theme.json` | 8,094 | json |
| `Xcode-Dark.LICENSE.txt` | 1,064 | txt |
| `Xcode-Dark.theme.json` | 5,756 | json |
| `arc-theme-orange.theme.json` | 6,885 | json |
| `arc-theme.theme.json` | 7,422 | json |
| `arc-themes.LICENSE.txt` | 1,070 | txt |
| `arc_theme_dark.theme.json` | 9,725 | json |
| `arc_theme_dark_orange.theme.json` | 9,698 | json |
| `gruvbox_dark_hard.theme.json` | 5,144 | json |
| `gruvbox_dark_medium.theme.json` | 5,119 | json |
| `gruvbox_dark_soft.theme.json` | 5,141 | json |
| `gruvbox_theme.LICENSE.txt` | 1,072 | txt |
| `nord.LICENSE.txt` | 1,247 | txt |
| `nord.theme.json` | 13,727 | json |
| `one_dark.LICENSE.txt` | 1,069 | txt |
| `one_dark.theme.json` | 12,435 | json |
| `vuesion_theme.LICENSE.txt` | 1,072 | txt |
| `vuesion_theme.theme.json` | 11,017 | json |

### `com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/` — 35 个文件，1,745,019 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Arc Dark Contrast.theme.json` | 51,287 | json |
| `Arc Dark.theme.json` | 51,278 | json |
| `Atom One Dark Contrast.theme.json` | 51,297 | json |
| `Atom One Dark.theme.json` | 51,288 | json |
| `Atom One Light Contrast.theme.json` | 51,300 | json |
| `Atom One Light.theme.json` | 51,291 | json |
| `Dracula Contrast.theme.json` | 51,285 | json |
| `Dracula.theme.json` | 51,276 | json |
| `GitHub Contrast.theme.json` | 51,284 | json |
| `GitHub Dark Contrast.theme.json` | 51,293 | json |
| `GitHub Dark.theme.json` | 51,284 | json |
| `GitHub.theme.json` | 51,275 | json |
| `Light Owl Contrast.theme.json` | 51,290 | json |
| `Light Owl.theme.json` | 51,281 | json |
| `Material Darker Contrast.theme.json` | 51,301 | json |
| `Material Darker.theme.json` | 51,292 | json |
| `Material Deep Ocean Contrast.theme.json` | 51,309 | json |
| `Material Deep Ocean.theme.json` | 51,300 | json |
| `Material Lighter Contrast.theme.json` | 51,304 | json |
| `Material Lighter.theme.json` | 51,295 | json |
| `Material Oceanic Contrast.theme.json` | 51,303 | json |
| `Material Oceanic.theme.json` | 51,294 | json |
| `Material Palenight Contrast.theme.json` | 51,307 | json |
| `Material Palenight.theme.json` | 51,298 | json |
| `Material Theme UI Lite.LICENSE.txt` | 1,108 | txt |
| `Monokai Pro Contrast.theme.json` | 51,293 | json |
| `Monokai Pro.theme.json` | 51,284 | json |
| `Moonlight Contrast.theme.json` | 51,289 | json |
| `Moonlight.theme.json` | 51,280 | json |
| `Night Owl Contrast.theme.json` | 51,289 | json |
| `Night Owl.theme.json` | 51,280 | json |
| `Solarized Dark Contrast.theme.json` | 51,299 | json |
| `Solarized Dark.theme.json` | 51,290 | json |
| `Solarized Light Contrast.theme.json` | 51,302 | json |
| `Solarized Light.theme.json` | 51,293 | json |

### `com/formdev/flatlaf/jideoss/` — 1 个文件，3,127 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `FlatLaf.properties` | 3,127 | properties |

### `com/formdev/flatlaf/natives/` — 3 个文件，59,512 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `flatlaf-windows-x86.dll` | 20,200 | dll |
| `flatlaf-windows-x86_64.dll` | 22,248 | dll |
| `libflatlaf-linux-x86_64.so` | 17,064 | so |

### `com/formdev/flatlaf/resources/` — 4 个文件，8,927 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Bundle.properties` | 2,440 | properties |
| `Bundle_de.properties` | 1,980 | properties |
| `Bundle_es.properties` | 2,553 | properties |
| `Bundle_fr.properties` | 1,954 | properties |

### `com/formdev/flatlaf/themes/` — 2 个文件，18,298 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `FlatMacDarkLaf.properties` | 9,215 | properties |
| `FlatMacLightLaf.properties` | 9,083 | properties |

### `com/h/icons/` — 3 个文件，8,780 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `c1.png` | 2,884 | png |
| `c2.png` | 2,925 | png |
| `c3.png` | 2,971 | png |

### `com/icons/` — 95 个文件，116,972 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `area_cursor.png` | 334 | png |
| `arrow.png` | 988 | png |
| `arrowLeft.png` | 990 | png |
| `arrowRight.png` | 985 | png |
| `arrows.gif` | 847 | gif |
| `auth.png` | 7,605 | png |
| `background_color.png` | 697 | png |
| `backward.png` | 687 | png |
| `box.png` | 355 | png |
| `boxCheck.png` | 435 | png |
| `c1.png` | 197 | png |
| `c2.png` | 230 | png |
| `c3.png` | 337 | png |
| `c4.png` | 392 | png |
| `cancel.png` | 663 | png |
| `circe.gif` | 673 | gif |
| `close-rollover.png` | 296 | png |
| `close.png` | 2,983 | png |
| `computer.png` | 545 | png |
| `content.png` | 3,185 | png |
| `copy.png` | 606 | png |
| `cross.png` | 2,922 | png |
| `cursor.png` | 3,092 | png |
| `date.png` | 624 | png |
| `default.png` | 2,916 | png |
| `dir_icon.png` | 476 | png |
| `dock_bottom.png` | 1,404 | png |
| `dock_bottom_.png` | 3,231 | png |
| `dock_left.png` | 308 | png |
| `dock_left_.png` | 3,303 | png |
| `dock_right.png` | 1,506 | png |
| `dock_right_.png` | 3,309 | png |
| `dock_top.png` | 1,081 | png |
| `dock_top_.png` | 3,216 | png |
| `down.png` | 988 | png |
| `edit.png` | 503 | png |
| `email.png` | 505 | png |
| `empty.png` | 2,808 | png |
| `example.png` | 1,321 | png |
| `eyedropper.png` | 3,326 | png |
| `facebook.gif` | 723 | gif |
| `failed.png` | 3,026 | png |
| `file_icon.png` | 485 | png |
| `folder.png` | 1,328 | png |
| `folder_home.png` | 1,552 | png |
| `folder_new.png` | 589 | png |
| `folder_up.png` | 708 | png |
| `foreground_color.png` | 548 | png |
| `forward.png` | 656 | png |
| `guidelines.png` | 212 | png |
| `guides.png` | 565 | png |
| `hide.png` | 3,129 | png |
| `hide_dark.png` | 3,130 | png |
| `icon.png` | 707 | png |
| `indicator.gif` | 1,849 | gif |
| `java.png` | 569 | png |
| `leaf.png` | 1,357 | png |
| `left.png` | 986 | png |
| `link.png` | 723 | png |
| `max.png` | 758 | png |
| `memory.png` | 349 | png |
| `min.png` | 736 | png |
| `next.png` | 1,155 | png |
| `next_skip.png` | 1,218 | png |
| `ok.png` | 634 | png |
| `open.png` | 511 | png |
| `paste.png` | 685 | png |
| `preview.png` | 646 | png |
| `previous.png` | 1,156 | png |
| `previous_skip.png` | 1,215 | png |
| `radio.png` | 415 | png |
| `radioCheck.png` | 478 | png |
| `redo.png` | 613 | png |
| `refresh.png` | 836 | png |
| `remove.png` | 544 | png |
| `right.png` | 986 | png |
| `roller.gif` | 1,456 | gif |
| `root.png` | 1,334 | png |
| `rotate_180.png` | 836 | png |
| `rotate_ccw.png` | 826 | png |
| `rotate_cw.png` | 829 | png |
| `ruler.png` | 623 | png |
| `ruler_cursor.png` | 544 | png |
| `save.png` | 468 | png |
| `saveas.png` | 520 | png |
| `settings.png` | 916 | png |
| `show_icon.png` | 646 | png |
| `show_text.png` | 524 | png |
| `snake.gif` | 1,737 | gif |
| `splitIcon.png` | 988 | png |
| `stretch.png` | 3,217 | png |
| `switch.png` | 2,978 | png |
| `transparent.png` | 599 | png |
| `undo.png` | 631 | png |
| `warning.png` | 654 | png |

### `com/icons/color/` — 2 个文件，3,355 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `color.png` | 494 | png |
| `transparent.png` | 2,861 | png |

### `com/icons/component/` — 48 个文件，34,500 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `button.png` | 348 | png |
| `checkBox.png` | 388 | png |
| `checkBoxMenuItem.png` | 469 | png |
| `colorChooser.png` | 783 | png |
| `comboBox.png` | 454 | png |
| `desktopIcon.png` | 689 | png |
| `desktopPane.png` | 552 | png |
| `editorPane.png` | 532 | png |
| `fileChooser.png` | 637 | png |
| `formattedTextField.png` | 307 | png |
| `internalFrame.png` | 3,297 | png |
| `label.png` | 524 | png |
| `list.png` | 405 | png |
| `menu.png` | 351 | png |
| `menuBar.png` | 3,708 | png |
| `menuItem.png` | 358 | png |
| `multiLineLabel.png` | 579 | png |
| `optionPane.png` | 448 | png |
| `panel.png` | 292 | png |
| `passwordField.png` | 275 | png |
| `popupMenu.png` | 351 | png |
| `popupMenuSeparator.png` | 134 | png |
| `progressBar.png` | 261 | png |
| `radioButton.png` | 463 | png |
| `radioButtonMenuItem.png` | 541 | png |
| `rootPane.png` | 741 | png |
| `scrollBar.png` | 390 | png |
| `scrollPane.png` | 378 | png |
| `separator.png` | 134 | png |
| `slider.png` | 505 | png |
| `spinner.png` | 316 | png |
| `splitButton.png` | 3,089 | png |
| `splitPane.png` | 329 | png |
| `styledLabel.png` | 445 | png |
| `tabbedPane.png` | 333 | png |
| `table.png` | 3,269 | png |
| `tableHeader.png` | 539 | png |
| `textArea.png` | 337 | png |
| `textField.png` | 359 | png |
| `textPane.png` | 480 | png |
| `toggleButton.png` | 416 | png |
| `toolBar.png` | 3,104 | png |
| `toolBarSeparator.png` | 182 | png |
| `toolTip.png` | 271 | png |
| `tree.png` | 527 | png |
| `tristateCheckBox.png` | 362 | png |
| `verticalLabel.png` | 556 | png |
| `viewport.png` | 292 | png |

### `com/icons/extensions/16/` — 108 个文件，69,657 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `file_extension_3gp.png` | 576 | png |
| `file_extension_7z.png` | 654 | png |
| `file_extension_ace.png` | 671 | png |
| `file_extension_ai.png` | 641 | png |
| `file_extension_aif.png` | 622 | png |
| `file_extension_aiff.png` | 643 | png |
| `file_extension_amr.png` | 570 | png |
| `file_extension_asf.png` | 676 | png |
| `file_extension_asx.png` | 647 | png |
| `file_extension_avi.png` | 688 | png |
| `file_extension_bat.png` | 663 | png |
| `file_extension_bin.png` | 557 | png |
| `file_extension_bmp.png` | 665 | png |
| `file_extension_bup.png` | 662 | png |
| `file_extension_cab.png` | 663 | png |
| `file_extension_cbr.png` | 617 | png |
| `file_extension_cd_drive.png` | 748 | png |
| `file_extension_cda.png` | 677 | png |
| `file_extension_cdl.png` | 729 | png |
| `file_extension_cdr.png` | 632 | png |
| `file_extension_chm.png` | 662 | png |
| `file_extension_computer.png` | 545 | png |
| `file_extension_dat.png` | 668 | png |
| `file_extension_divx.png` | 678 | png |
| `file_extension_dll.png` | 598 | png |
| `file_extension_dmg.png` | 669 | png |
| `file_extension_doc.png` | 624 | png |
| `file_extension_drive.png` | 430 | png |
| `file_extension_dss.png` | 609 | png |
| `file_extension_dvf.png` | 688 | png |
| `file_extension_dwg.png` | 643 | png |
| `file_extension_eml.png` | 639 | png |
| `file_extension_eps.png` | 614 | png |
| `file_extension_exe.png` | 613 | png |
| `file_extension_executable.png` | 341 | png |
| `file_extension_file.png` | 485 | png |
| `file_extension_fla.png` | 665 | png |
| `file_extension_flv.png` | 633 | png |
| `file_extension_folder.png` | 476 | png |
| `file_extension_gif.png` | 611 | png |
| `file_extension_gz.png` | 649 | png |
| `file_extension_hqx.png` | 643 | png |
| `file_extension_htm.png` | 673 | png |
| `file_extension_html.png` | 711 | png |
| `file_extension_ifo.png` | 691 | png |
| `file_extension_indd.png` | 702 | png |
| `file_extension_iso.png` | 643 | png |
| `file_extension_jar.png` | 649 | png |
| `file_extension_jpeg.png` | 678 | png |
| `file_extension_jpg.png` | 670 | png |
| `file_extension_lnk.png` | 629 | png |
| `file_extension_log.png` | 664 | png |
| `file_extension_m4a.png` | 600 | png |
| `file_extension_m4b.png` | 653 | png |
| `file_extension_m4p.png` | 645 | png |
| `file_extension_m4v.png` | 651 | png |
| `file_extension_mcd.png` | 699 | png |
| `file_extension_mdb.png` | 645 | png |
| `file_extension_mid.png` | 637 | png |
| `file_extension_mkv.png` | 674 | png |
| `file_extension_mov.png` | 697 | png |
| `file_extension_mp2.png` | 656 | png |
| `file_extension_mp3.png` | 656 | png |
| `file_extension_mp4.png` | 603 | png |
| `file_extension_mpeg.png` | 670 | png |
| `file_extension_mpg.png` | 645 | png |
| `file_extension_msi.png` | 697 | png |
| `file_extension_mswmm.png` | 791 | png |
| `file_extension_odt.png` | 624 | png |
| `file_extension_ogg.png` | 690 | png |
| `file_extension_pdf.png` | 657 | png |
| `file_extension_png.png` | 702 | png |
| `file_extension_pps.png` | 596 | png |
| `file_extension_ps.png` | 624 | png |
| `file_extension_psd.png` | 689 | png |
| `file_extension_pst.png` | 624 | png |
| `file_extension_ptb.png` | 664 | png |
| `file_extension_pub.png` | 650 | png |
| `file_extension_qbb.png` | 612 | png |
| `file_extension_qbw.png` | 595 | png |
| `file_extension_qxd.png` | 714 | png |
| `file_extension_ram.png` | 666 | png |
| `file_extension_rar.png` | 740 | png |
| `file_extension_rm.png` | 674 | png |
| `file_extension_rmvb.png` | 660 | png |
| `file_extension_rtf.png` | 664 | png |
| `file_extension_sea.png` | 649 | png |
| `file_extension_ses.png` | 668 | png |
| `file_extension_sit.png` | 680 | png |
| `file_extension_sitx.png` | 667 | png |
| `file_extension_ss.png` | 695 | png |
| `file_extension_swf.png` | 685 | png |
| `file_extension_tgz.png` | 621 | png |
| `file_extension_thm.png` | 635 | png |
| `file_extension_tif.png` | 646 | png |
| `file_extension_tmp.png` | 569 | png |
| `file_extension_torrent.png` | 618 | png |
| `file_extension_ttf.png` | 668 | png |
| `file_extension_txt.png` | 639 | png |
| `file_extension_vcd.png` | 673 | png |
| `file_extension_vob.png` | 632 | png |
| `file_extension_wav.png` | 648 | png |
| `file_extension_wma.png` | 694 | png |
| `file_extension_wmv.png` | 688 | png |
| `file_extension_wps.png` | 651 | png |
| `file_extension_xls.png` | 617 | png |
| `file_extension_xpi.png` | 612 | png |
| `file_extension_zip.png` | 644 | png |

### `com/icons/extensions/32/` — 108 个文件，172,439 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `file_extension_3gp.png` | 1,364 | png |
| `file_extension_7z.png` | 1,465 | png |
| `file_extension_ace.png` | 1,578 | png |
| `file_extension_ai.png` | 1,535 | png |
| `file_extension_aif.png` | 1,523 | png |
| `file_extension_aiff.png` | 1,498 | png |
| `file_extension_amr.png` | 1,491 | png |
| `file_extension_asf.png` | 1,739 | png |
| `file_extension_asx.png` | 1,709 | png |
| `file_extension_avi.png` | 1,755 | png |
| `file_extension_bat.png` | 1,802 | png |
| `file_extension_bin.png` | 1,223 | png |
| `file_extension_bmp.png` | 1,580 | png |
| `file_extension_bup.png` | 1,542 | png |
| `file_extension_cab.png` | 1,560 | png |
| `file_extension_cbr.png` | 1,558 | png |
| `file_extension_cd_drive.png` | 1,376 | png |
| `file_extension_cda.png` | 1,870 | png |
| `file_extension_cdl.png` | 1,732 | png |
| `file_extension_cdr.png` | 1,698 | png |
| `file_extension_chm.png` | 1,636 | png |
| `file_extension_computer.png` | 948 | png |
| `file_extension_dat.png` | 1,700 | png |
| `file_extension_divx.png` | 1,661 | png |
| `file_extension_dll.png` | 1,552 | png |
| `file_extension_dmg.png` | 1,635 | png |
| `file_extension_doc.png` | 1,536 | png |
| `file_extension_drive.png` | 869 | png |
| `file_extension_dss.png` | 1,389 | png |
| `file_extension_dvf.png` | 1,799 | png |
| `file_extension_dwg.png` | 1,490 | png |
| `file_extension_eml.png` | 1,542 | png |
| `file_extension_eps.png` | 1,509 | png |
| `file_extension_exe.png` | 1,367 | png |
| `file_extension_executable.png` | 670 | png |
| `file_extension_file.png` | 776 | png |
| `file_extension_fla.png` | 1,597 | png |
| `file_extension_flv.png` | 1,342 | png |
| `file_extension_folder.png` | 860 | png |
| `file_extension_gif.png` | 1,350 | png |
| `file_extension_gz.png` | 1,479 | png |
| `file_extension_hqx.png` | 1,552 | png |
| `file_extension_htm.png` | 1,755 | png |
| `file_extension_html.png` | 1,825 | png |
| `file_extension_ifo.png` | 1,636 | png |
| `file_extension_indd.png` | 1,628 | png |
| `file_extension_iso.png` | 1,850 | png |
| `file_extension_jar.png` | 1,704 | png |
| `file_extension_jpeg.png` | 1,580 | png |
| `file_extension_jpg.png` | 1,552 | png |
| `file_extension_lnk.png` | 1,435 | png |
| `file_extension_log.png` | 1,672 | png |
| `file_extension_m4a.png` | 1,558 | png |
| `file_extension_m4b.png` | 1,622 | png |
| `file_extension_m4p.png` | 1,714 | png |
| `file_extension_m4v.png` | 1,629 | png |
| `file_extension_mcd.png` | 1,694 | png |
| `file_extension_mdb.png` | 1,768 | png |
| `file_extension_mid.png` | 1,513 | png |
| `file_extension_mkv.png` | 1,777 | png |
| `file_extension_mov.png` | 1,822 | png |
| `file_extension_mp2.png` | 1,602 | png |
| `file_extension_mp3.png` | 4,300 | png |
| `file_extension_mp4.png` | 1,395 | png |
| `file_extension_mpeg.png` | 1,798 | png |
| `file_extension_mpg.png` | 1,786 | png |
| `file_extension_msi.png` | 1,745 | png |
| `file_extension_mswmm.png` | 2,123 | png |
| `file_extension_odt.png` | 1,536 | png |
| `file_extension_ogg.png` | 1,742 | png |
| `file_extension_pdf.png` | 1,424 | png |
| `file_extension_png.png` | 1,634 | png |
| `file_extension_pps.png` | 1,369 | png |
| `file_extension_ps.png` | 1,604 | png |
| `file_extension_psd.png` | 1,740 | png |
| `file_extension_pst.png` | 1,534 | png |
| `file_extension_ptb.png` | 1,542 | png |
| `file_extension_pub.png` | 1,515 | png |
| `file_extension_qbb.png` | 1,467 | png |
| `file_extension_qbw.png` | 1,497 | png |
| `file_extension_qxd.png` | 1,886 | png |
| `file_extension_ram.png` | 1,810 | png |
| `file_extension_rar.png` | 1,561 | png |
| `file_extension_rm.png` | 1,691 | png |
| `file_extension_rmvb.png` | 1,742 | png |
| `file_extension_rtf.png` | 1,470 | png |
| `file_extension_sea.png` | 1,768 | png |
| `file_extension_ses.png` | 1,588 | png |
| `file_extension_sit.png` | 1,636 | png |
| `file_extension_sitx.png` | 1,802 | png |
| `file_extension_ss.png` | 1,688 | png |
| `file_extension_swf.png` | 1,810 | png |
| `file_extension_tgz.png` | 1,519 | png |
| `file_extension_thm.png` | 1,507 | png |
| `file_extension_tif.png` | 1,373 | png |
| `file_extension_tmp.png` | 1,416 | png |
| `file_extension_torrent.png` | 1,122 | png |
| `file_extension_ttf.png` | 1,585 | png |
| `file_extension_txt.png` | 1,421 | png |
| `file_extension_vcd.png` | 1,861 | png |
| `file_extension_vob.png` | 1,530 | png |
| `file_extension_wav.png` | 1,691 | png |
| `file_extension_wma.png` | 1,943 | png |
| `file_extension_wmv.png` | 1,812 | png |
| `file_extension_wps.png` | 1,709 | png |
| `file_extension_xls.png` | 1,611 | png |
| `file_extension_xpi.png` | 1,470 | png |
| `file_extension_zip.png` | 1,473 | png |

### `com/icons/file/` — 3 个文件，1,694 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `date.png` | 608 | png |
| `size.png` | 434 | png |
| `type.png` | 652 | png |

### `com/icons/filter/` — 4 个文件，1,917 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `matchCase.png` | 305 | png |
| `searchFromStart.png` | 811 | png |
| `settings.png` | 601 | png |
| `useSpaceAsSeparator.png` | 200 | png |

### `com/icons/html/` — 2 个文件，8,476 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `missingImage.png` | 4,240 | png |
| `pendingImage.png` | 4,236 | png |

### `com/icons/icon/` — 8 个文件，149,184 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `icon128.png` | 15,885 | png |
| `icon16.png` | 3,245 | png |
| `icon24.png` | 4,186 | png |
| `icon256.png` | 31,516 | png |
| `icon32.png` | 4,906 | png |
| `icon48.png` | 6,084 | png |
| `icon512.png` | 75,174 | png |
| `icon64.png` | 8,188 | png |

### `com/icons/label/` — 2 个文件，898 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `f.9.png` | 456 | png |
| `n.9.png` | 442 | png |

### `com/icons/lang/` — 10 个文件，6,701 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ar.png` | 389 | png |
| `de.png` | 292 | png |
| `en.png` | 542 | png |
| `es.png` | 414 | png |
| `fr.png` | 421 | png |
| `it.png` | 421 | png |
| `other.png` | 3,130 | png |
| `pl.png` | 290 | png |
| `pt.png` | 515 | png |
| `ru.png` | 287 | png |

### `com/icons/menu/` — 12 个文件，12,742 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `bottom.png` | 457 | png |
| `close.png` | 476 | png |
| `closeOthers.png` | 476 | png |
| `left.png` | 3,158 | png |
| `right.png` | 445 | png |
| `rotate.png` | 650 | png |
| `swapHor.png` | 873 | png |
| `swapVer.png` | 877 | png |
| `top.png` | 3,201 | png |
| `unsplit.png` | 771 | png |
| `unsplitHor.png` | 680 | png |
| `unsplitVer.png` | 678 | png |

### `com/icons/os/16/` — 8 个文件，6,116 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `mac.png` | 747 | png |
| `mac_colored.png` | 747 | png |
| `solaris.png` | 660 | png |
| `solaris_colored.png` | 660 | png |
| `unix.png` | 717 | png |
| `unix_colored.png` | 717 | png |
| `win.png` | 934 | png |
| `win_colored.png` | 934 | png |

### `com/icons/os/32/` — 8 个文件，17,086 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `mac.png` | 470 | png |
| `mac_colored.png` | 1,779 | png |
| `solaris.png` | 1,364 | png |
| `solaris_colored.png` | 2,256 | png |
| `unix.png` | 3,387 | png |
| `unix_colored.png` | 2,086 | png |
| `win.png` | 622 | png |
| `win_colored.png` | 5,122 | png |

### `com/icons/panel/` — 5 个文件，3,879 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `bs.9.png` | 80 | png |
| `f.9.png` | 456 | png |
| `lrs.9.png` | 92 | png |
| `n.9.png` | 442 | png |
| `ts.9.png` | 2,809 | png |

### `com/icons/popup/` — 10 个文件，9,642 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `bevel.9.png` | 552 | png |
| `bordered.9.png` | 451 | png |
| `dark.9.png` | 452 | png |
| `gray.9.png` | 1,063 | png |
| `grayDownTip.9.png` | 931 | png |
| `grayEtched.9.png` | 483 | png |
| `graySmall.9.png` | 263 | png |
| `greenLarge.9.png` | 4,410 | png |
| `light.9.png` | 746 | png |
| `lightSmall.9.png` | 291 | png |

### `com/icons/scroll/` — 4 个文件，582 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `hsbg.9.png` | 127 | png |
| `hsthumb.9.png` | 175 | png |
| `vsbg.9.png` | 118 | png |
| `vsthumb.9.png` | 162 | png |

### `com/icons/selection/` — 18 个文件，7,346 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `conn.9.png` | 431 | png |
| `corners.9.png` | 484 | png |
| `corners_conn.9.png` | 907 | png |
| `full.9.png` | 541 | png |
| `full_conn.9.png` | 1,062 | png |
| `gripper.png` | 301 | png |
| `lr.9.png` | 427 | png |
| `lr_conn.9.png` | 733 | png |
| `selector1.9.png` | 170 | png |
| `selector2.9.png` | 169 | png |
| `selector3.9.png` | 164 | png |
| `selector4.9.png` | 165 | png |
| `selector5.9.png` | 167 | png |
| `selector6.9.png` | 164 | png |
| `selector7.9.png` | 166 | png |
| `selector8.9.png` | 166 | png |
| `ud.9.png` | 461 | png |
| `ud_conn.9.png` | 668 | png |

### `com/icons/status/` — 4 个文件，2,572 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `detected.png` | 678 | png |
| `failed.png` | 544 | png |
| `loaded.png` | 634 | png |
| `loading.png` | 716 | png |

### `com/icons/strategy/` — 3 个文件，4,770 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `after.png` | 3,365 | png |
| `any.png` | 740 | png |
| `before.png` | 665 | png |

### `com/icons/styles/` — 3 个文件，10,943 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `dark.9.png` | 2,321 | png |
| `mac.9.png` | 5,613 | png |
| `web.9.png` | 3,009 | png |

### `com/icons/textures/` — 10 个文件，180,682 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `alpha.png` | 100 | png |
| `darkLinen.png` | 22,749 | png |
| `darkMaze.png` | 600 | png |
| `escheresque.png` | 493 | png |
| `graphy.png` | 191 | png |
| `illusion.png` | 1,833 | png |
| `lightMaze.png` | 600 | png |
| `linen.png` | 84,178 | png |
| `washedWall.png` | 47,433 | png |
| `wildOliva.png` | 22,505 | png |

### `com/icons/types/` — 25 个文件，34,328 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `application.png` | 670 | png |
| `calendar.png` | 1,229 | png |
| `clock.png` | 2,143 | png |
| `color.png` | 1,681 | png |
| `cross.png` | 2,237 | png |
| `database.png` | 917 | png |
| `error.png` | 3,187 | png |
| `file.png` | 776 | png |
| `fileHor.png` | 660 | png |
| `film.png` | 1,434 | png |
| `folder.png` | 860 | png |
| `folderHor.png` | 744 | png |
| `image.png` | 1,188 | png |
| `information.png` | 2,267 | png |
| `keyboardButton.png` | 710 | png |
| `mail.png` | 924 | png |
| `map.png` | 1,722 | png |
| `minus.png` | 368 | png |
| `note.png` | 1,035 | png |
| `plus.png` | 963 | png |
| `question.png` | 3,385 | png |
| `table.png` | 1,028 | png |
| `text.png` | 1,126 | png |
| `tip.png` | 1,532 | png |
| `warning.png` | 1,542 | png |

### `com/language/icons/` — 5 个文件，2,385 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `dic.png` | 436 | png |
| `multidic.png` | 504 | png |
| `record.png` | 661 | png |
| `text.png` | 445 | png |
| `tooltip.png` | 339 | png |

### `com/m/icons/` — 6 个文件，5,865 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `closed.png` | 1,328 | png |
| `collapse.png` | 251 | png |
| `expand.png` | 267 | png |
| `leaf.png` | 1,357 | png |
| `open.png` | 1,328 | png |
| `root.png` | 1,334 | png |

### `com/resources/` — 7 个文件，117,900 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `NinePatchSkin.xml` | 726 | xml |
| `icons.xml` | 769 | xml |
| `label.xml` | 777 | xml |
| `language.xml` | 109,877 | xml |
| `panel.xml` | 4,490 | xml |
| `scrollBar.xml` | 1,180 | xml |
| `version.xml` | 81 | xml |

### `com/sun/jna/aix-ppc/` — 1 个文件，613,528 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.a` | 613,528 | a |

### `com/sun/jna/aix-ppc64/` — 1 个文件，657,031 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.a` | 657,031 | a |

### `com/sun/jna/darwin-aarch64/` — 1 个文件，159,816 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.jnilib` | 159,816 | jnilib |

### `com/sun/jna/darwin-x86-64/` — 1 个文件，107,392 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.jnilib` | 107,392 | jnilib |

### `com/sun/jna/freebsd-x86/` — 1 个文件，109,718 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 109,718 | so |

### `com/sun/jna/freebsd-x86-64/` — 1 个文件，121,307 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 121,307 | so |

### `com/sun/jna/linux-aarch64/` — 1 个文件，162,288 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 162,288 | so |

### `com/sun/jna/linux-arm/` — 1 个文件，130,788 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 130,788 | so |

### `com/sun/jna/linux-armel/` — 1 个文件，139,472 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 139,472 | so |

### `com/sun/jna/linux-loongarch64/` — 1 个文件，374,632 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 374,632 | so |

### `com/sun/jna/linux-mips64el/` — 1 个文件，144,056 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 144,056 | so |

### `com/sun/jna/linux-ppc/` — 1 个文件，127,724 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 127,724 | so |

### `com/sun/jna/linux-ppc64le/` — 1 个文件，145,072 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 145,072 | so |

### `com/sun/jna/linux-riscv64/` — 1 个文件，95,984 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 95,984 | so |

### `com/sun/jna/linux-s390x/` — 1 个文件，136,976 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 136,976 | so |

### `com/sun/jna/linux-x86/` — 1 个文件，123,384 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 123,384 | so |

### `com/sun/jna/linux-x86-64/` — 1 个文件，134,447 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 134,447 | so |

### `com/sun/jna/openbsd-x86/` — 1 个文件，108,073 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 108,073 | so |

### `com/sun/jna/openbsd-x86-64/` — 1 个文件，122,942 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 122,942 | so |

### `com/sun/jna/platform/` — 1 个文件，851 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 851 | html |

### `com/sun/jna/platform/dnd/` — 1 个文件，896 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 896 | html |

### `com/sun/jna/platform/linux/` — 1 个文件，824 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 824 | html |

### `com/sun/jna/platform/mac/` — 1 个文件，835 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 835 | html |

### `com/sun/jna/platform/unix/` — 1 个文件，846 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 846 | html |

### `com/sun/jna/platform/unix/aix/` — 1 个文件，834 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 834 | html |

### `com/sun/jna/platform/unix/solaris/` — 1 个文件，847 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 847 | html |

### `com/sun/jna/platform/win32/` — 1 个文件，838 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 838 | html |

### `com/sun/jna/platform/win32/COM/` — 1 个文件，871 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 871 | html |

### `com/sun/jna/platform/win32/COM/tlb/` — 1 个文件，853 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 853 | html |

### `com/sun/jna/platform/win32/COM/tlb/imp/` — 12 个文件，5,523 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `TlbCoClass.template` | 927 | template |
| `TlbDispInterface.template` | 552 | template |
| `TlbEnum.template` | 956 | template |
| `TlbFunctionDispId.template` | 398 | template |
| `TlbFunctionStub.template` | 160 | template |
| `TlbFunctionVTable.template` | 315 | template |
| `TlbInterface.template` | 508 | template |
| `TlbPropertyGet.template` | 284 | template |
| `TlbPropertyGetStub.template` | 145 | template |
| `TlbPropertyPut.template` | 260 | template |
| `TlbPropertyPutStub.template` | 151 | template |
| `package.html` | 867 | html |

### `com/sun/jna/platform/win32/COM/util/` — 1 个文件，837 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 837 | html |

### `com/sun/jna/platform/win32/COM/util/annotation/` — 1 个文件，847 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 847 | html |

### `com/sun/jna/platform/wince/` — 1 个文件，859 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 859 | html |

### `com/sun/jna/sunos-sparc/` — 1 个文件，230,996 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 230,996 | so |

### `com/sun/jna/sunos-sparcv9/` — 1 个文件，166,976 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 166,976 | so |

### `com/sun/jna/sunos-x86/` — 1 个文件，153,056 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 153,056 | so |

### `com/sun/jna/sunos-x86-64/` — 1 个文件，169,896 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `libjnidispatch.so` | 169,896 | so |

### `com/sun/jna/win32-aarch64/` — 1 个文件，256,512 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `jnidispatch.dll` | 256,512 | dll |

### `com/sun/jna/win32-x86/` — 1 个文件，211,456 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `jnidispatch.dll` | 211,456 | dll |

### `com/sun/jna/win32-x86-64/` — 1 个文件，254,464 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `jnidispatch.dll` | 254,464 | dll |

### `font/` — 1 个文件，770,232 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `DejaVu Sans Mono Nerd Font Complete Mono.ttf` | 770,232 | ttf |

### `images/` — 15 个文件，6,874 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `arrow.png` | 326 | png |
| `collapseall.png` | 153 | png |
| `config.png` | 500 | png |
| `expandall.png` | 179 | png |
| `file_linux.png` | 450 | png |
| `filenew.png` | 609 | png |
| `folder-horizontal-open.png` | 511 | png |
| `folder-open.png` | 647 | png |
| `folder.png` | 441 | png |
| `folder_linux.png` | 249 | png |
| `folder_new.png` | 578 | png |
| `remove.png` | 794 | png |
| `screen.png` | 605 | png |
| `terminal.png` | 455 | png |
| `window_new.png` | 377 | png |

### `lombok/core/handlers/` — 1 个文件，1,136 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `singulars.txt` | 1,136 | txt |

### `lombok/installer/` — 8 个文件，131,210 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `WindowsDriveInfo-i386.binary` | 14,472 | binary |
| `WindowsDriveInfo-x86_64.binary` | 66,806 | binary |
| `loading.gif` | 2,248 | gif |
| `lombok.png` | 24,994 | png |
| `lombok.svg` | 13,312 | svg |
| `lombokIcon.png` | 788 | png |
| `lombokText.png` | 3,055 | png |
| `lombokText.svg` | 5,535 | svg |

### `lombok/installer/eclipse/` — 6 个文件，12,160 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `STS.png` | 1,807 | png |
| `angular.png` | 1,012 | png |
| `eclipse.png` | 1,328 | png |
| `jbds.png` | 3,470 | png |
| `myeclipse.png` | 1,073 | png |
| `rhds.png` | 3,470 | png |

### `lombok/launch/` — 1 个文件，3,004 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `mavenEcjBootstrapAgent.jar` | 3,004 | jar |

### `mozilla/` — 1 个文件，218,626 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `public-suffix-list.txt` | 218,626 | txt |

### `org/apache/commons/codec/language/bm/` — 124 个文件，220,671 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ash_approx_any.txt` | 4,678 | txt |
| `ash_approx_common.txt` | 4,856 | txt |
| `ash_approx_cyrillic.txt` | 831 | txt |
| `ash_approx_english.txt` | 1,489 | txt |
| `ash_approx_french.txt` | 1,224 | txt |
| `ash_approx_german.txt` | 1,852 | txt |
| `ash_approx_hebrew.txt` | 812 | txt |
| `ash_approx_hungarian.txt` | 830 | txt |
| `ash_approx_polish.txt` | 2,228 | txt |
| `ash_approx_romanian.txt` | 830 | txt |
| `ash_approx_russian.txt` | 1,427 | txt |
| `ash_approx_spanish.txt` | 830 | txt |
| `ash_exact_any.txt` | 1,952 | txt |
| `ash_exact_approx_common.txt` | 1,736 | txt |
| `ash_exact_common.txt` | 1,095 | txt |
| `ash_exact_cyrillic.txt` | 830 | txt |
| `ash_exact_english.txt` | 830 | txt |
| `ash_exact_french.txt` | 830 | txt |
| `ash_exact_german.txt` | 826 | txt |
| `ash_exact_hebrew.txt` | 812 | txt |
| `ash_exact_hungarian.txt` | 830 | txt |
| `ash_exact_polish.txt` | 875 | txt |
| `ash_exact_romanian.txt` | 830 | txt |
| `ash_exact_russian.txt` | 830 | txt |
| `ash_exact_spanish.txt` | 830 | txt |
| `ash_hebrew_common.txt` | 2,854 | txt |
| `ash_languages.txt` | 888 | txt |
| `ash_rules_any.txt` | 9,473 | txt |
| `ash_rules_cyrillic.txt` | 2,366 | txt |
| `ash_rules_english.txt` | 2,970 | txt |
| `ash_rules_french.txt` | 2,274 | txt |
| `ash_rules_german.txt` | 2,783 | txt |
| `ash_rules_hebrew.txt` | 1,472 | txt |
| `ash_rules_hungarian.txt` | 1,960 | txt |
| `ash_rules_polish.txt` | 4,167 | txt |
| `ash_rules_romanian.txt` | 1,526 | txt |
| `ash_rules_russian.txt` | 3,980 | txt |
| `ash_rules_spanish.txt` | 2,073 | txt |
| `gen_approx_any.txt` | 3,870 | txt |
| `gen_approx_arabic.txt` | 927 | txt |
| `gen_approx_common.txt` | 4,874 | txt |
| `gen_approx_cyrillic.txt` | 831 | txt |
| `gen_approx_czech.txt` | 830 | txt |
| `gen_approx_dutch.txt` | 830 | txt |
| `gen_approx_english.txt` | 1,489 | txt |
| `gen_approx_french.txt` | 942 | txt |
| `gen_approx_german.txt` | 1,853 | txt |
| `gen_approx_greek.txt` | 830 | txt |
| `gen_approx_greeklatin.txt` | 845 | txt |
| `gen_approx_hebrew.txt` | 812 | txt |
| `gen_approx_hungarian.txt` | 831 | txt |
| `gen_approx_italian.txt` | 831 | txt |
| `gen_approx_polish.txt` | 2,183 | txt |
| `gen_approx_portuguese.txt` | 830 | txt |
| `gen_approx_romanian.txt` | 830 | txt |
| `gen_approx_russian.txt` | 1,437 | txt |
| `gen_approx_spanish.txt` | 868 | txt |
| `gen_approx_turkish.txt` | 830 | txt |
| `gen_exact_any.txt` | 1,123 | txt |
| `gen_exact_approx_common.txt` | 1,769 | txt |
| `gen_exact_arabic.txt` | 816 | txt |
| `gen_exact_common.txt` | 1,093 | txt |
| `gen_exact_cyrillic.txt` | 830 | txt |
| `gen_exact_czech.txt` | 830 | txt |
| `gen_exact_dutch.txt` | 812 | txt |
| `gen_exact_english.txt` | 830 | txt |
| `gen_exact_french.txt` | 812 | txt |
| `gen_exact_german.txt` | 826 | txt |
| `gen_exact_greek.txt` | 812 | txt |
| `gen_exact_greeklatin.txt` | 817 | txt |
| `gen_exact_hebrew.txt` | 812 | txt |
| `gen_exact_hungarian.txt` | 812 | txt |
| `gen_exact_italian.txt` | 812 | txt |
| `gen_exact_polish.txt` | 874 | txt |
| `gen_exact_portuguese.txt` | 812 | txt |
| `gen_exact_romanian.txt` | 812 | txt |
| `gen_exact_russian.txt` | 831 | txt |
| `gen_exact_spanish.txt` | 832 | txt |
| `gen_exact_turkish.txt` | 812 | txt |
| `gen_hebrew_common.txt` | 2,700 | txt |
| `gen_languages.txt` | 951 | txt |
| `gen_rules_any.txt` | 13,019 | txt |
| `gen_rules_arabic.txt` | 1,877 | txt |
| `gen_rules_cyrillic.txt` | 2,300 | txt |
| `gen_rules_czech.txt` | 1,561 | txt |
| `gen_rules_dutch.txt` | 1,867 | txt |
| `gen_rules_english.txt` | 3,013 | txt |
| `gen_rules_french.txt` | 2,778 | txt |
| `gen_rules_german.txt` | 2,731 | txt |
| `gen_rules_greek.txt` | 2,918 | txt |
| `gen_rules_greeklatin.txt` | 3,041 | txt |
| `gen_rules_hebrew.txt` | 1,462 | txt |
| `gen_rules_hungarian.txt` | 1,887 | txt |
| `gen_rules_italian.txt` | 1,873 | txt |
| `gen_rules_polish.txt` | 4,112 | txt |
| `gen_rules_portuguese.txt` | 2,600 | txt |
| `gen_rules_romanian.txt` | 1,509 | txt |
| `gen_rules_russian.txt` | 3,042 | txt |
| `gen_rules_spanish.txt` | 2,382 | txt |
| `gen_rules_turkish.txt` | 1,386 | txt |
| `lang.txt` | 7,462 | txt |
| `sep_approx_any.txt` | 830 | txt |
| `sep_approx_common.txt` | 3,195 | txt |
| `sep_approx_french.txt` | 812 | txt |
| `sep_approx_hebrew.txt` | 812 | txt |
| `sep_approx_italian.txt` | 830 | txt |
| `sep_approx_portuguese.txt` | 831 | txt |
| `sep_approx_spanish.txt` | 831 | txt |
| `sep_exact_any.txt` | 817 | txt |
| `sep_exact_approx_common.txt` | 1,685 | txt |
| `sep_exact_common.txt` | 1,109 | txt |
| `sep_exact_french.txt` | 815 | txt |
| `sep_exact_hebrew.txt` | 812 | txt |
| `sep_exact_italian.txt` | 812 | txt |
| `sep_exact_portuguese.txt` | 812 | txt |
| `sep_exact_spanish.txt` | 812 | txt |
| `sep_hebrew_common.txt` | 2,187 | txt |
| `sep_languages.txt` | 849 | txt |
| `sep_rules_any.txt` | 4,632 | txt |
| `sep_rules_french.txt` | 2,224 | txt |
| `sep_rules_hebrew.txt` | 1,459 | txt |
| `sep_rules_italian.txt` | 1,848 | txt |
| `sep_rules_portuguese.txt` | 2,575 | txt |
| `sep_rules_spanish.txt` | 2,480 | txt |

### `org/apache/hc/client5/` — 1 个文件，903 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `version.properties` | 903 | properties |

### `org/apache/hc/core5/` — 1 个文件，902 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `version.properties` | 902 | properties |

### `org/apache/log4j/lf5/config/` — 1 个文件，648 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `defaultconfig.properties` | 648 | properties |

### `org/apache/log4j/lf5/viewer/images/` — 3 个文件，2,283 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `channelexplorer_new.gif` | 778 | gif |
| `channelexplorer_satellite.gif` | 256 | gif |
| `lf5_small_icon.gif` | 1,249 | gif |

### `org/apache/log4j/xml/` — 1 个文件，4,913 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `log4j.dtd` | 4,913 | dtd |

### `org/fife/io/` — 1 个文件，54 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 54 | html |

### `org/fife/print/` — 1 个文件，101 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 101 | html |

### `org/fife/rsta/ui/` — 35 个文件，13,698 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `GoToDialog.properties` | 215 | properties |
| `GoToDialog_ar.properties` | 499 | properties |
| `GoToDialog_de.properties` | 233 | properties |
| `GoToDialog_es.properties` | 241 | properties |
| `GoToDialog_fr.properties` | 237 | properties |
| `GoToDialog_hu.properties` | 299 | properties |
| `GoToDialog_in.properties` | 209 | properties |
| `GoToDialog_it.properties` | 220 | properties |
| `GoToDialog_ja.properties` | 361 | properties |
| `GoToDialog_ko.properties` | 343 | properties |
| `GoToDialog_nl.properties` | 219 | properties |
| `GoToDialog_pl.properties` | 275 | properties |
| `GoToDialog_pt_BR.properties` | 245 | properties |
| `GoToDialog_ru.properties` | 508 | properties |
| `GoToDialog_tr.properties` | 218 | properties |
| `GoToDialog_zh_CN.properties` | 274 | properties |
| `GoToDialog_zh_TW.properties` | 281 | properties |
| `TextFilePropertiesDialog.properties` | 377 | properties |
| `TextFilePropertiesDialog_ar.properties` | 1,002 | properties |
| `TextFilePropertiesDialog_de.properties` | 435 | properties |
| `TextFilePropertiesDialog_es.properties` | 435 | properties |
| `TextFilePropertiesDialog_fr.properties` | 450 | properties |
| `TextFilePropertiesDialog_hu.properties` | 471 | properties |
| `TextFilePropertiesDialog_in.properties` | 372 | properties |
| `TextFilePropertiesDialog_it.properties` | 405 | properties |
| `TextFilePropertiesDialog_ja.properties` | 630 | properties |
| `TextFilePropertiesDialog_ko.properties` | 534 | properties |
| `TextFilePropertiesDialog_nl.properties` | 416 | properties |
| `TextFilePropertiesDialog_pl.properties` | 437 | properties |
| `TextFilePropertiesDialog_pt_BR.properties` | 453 | properties |
| `TextFilePropertiesDialog_ru.properties` | 944 | properties |
| `TextFilePropertiesDialog_tr.properties` | 420 | properties |
| `TextFilePropertiesDialog_zh_CN.properties` | 487 | properties |
| `TextFilePropertiesDialog_zh_TW.properties` | 475 | properties |
| `package.html` | 78 | html |

### `org/fife/rsta/ui/search/` — 36 个文件，17,498 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Search.properties` | 540 | properties |
| `SearchToolBar.properties` | 172 | properties |
| `SearchToolBar_ar.properties` | 221 | properties |
| `SearchToolBar_de.properties` | 221 | properties |
| `SearchToolBar_es.properties` | 177 | properties |
| `SearchToolBar_fr.properties` | 180 | properties |
| `SearchToolBar_hu.properties` | 178 | properties |
| `SearchToolBar_in.properties` | 170 | properties |
| `SearchToolBar_it.properties` | 191 | properties |
| `SearchToolBar_ja.properties` | 185 | properties |
| `SearchToolBar_ko.properties` | 191 | properties |
| `SearchToolBar_nl.properties` | 176 | properties |
| `SearchToolBar_pl.properties` | 196 | properties |
| `SearchToolBar_pt_BR.properties` | 179 | properties |
| `SearchToolBar_ru.properties` | 527 | properties |
| `SearchToolBar_tr.properties` | 176 | properties |
| `SearchToolBar_zh_CN.properties` | 199 | properties |
| `SearchToolBar_zh_TW.properties` | 199 | properties |
| `Search_ar.properties` | 1,272 | properties |
| `Search_de.properties` | 604 | properties |
| `Search_es.properties` | 619 | properties |
| `Search_fr.properties` | 639 | properties |
| `Search_hu.properties` | 740 | properties |
| `Search_in.properties` | 547 | properties |
| `Search_it.properties` | 595 | properties |
| `Search_ja.properties` | 855 | properties |
| `Search_ko.properties` | 760 | properties |
| `Search_nl.properties` | 629 | properties |
| `Search_pl.properties` | 664 | properties |
| `Search_pt_BR.properties` | 646 | properties |
| `Search_ru.properties` | 1,347 | properties |
| `Search_tr.properties` | 608 | properties |
| `Search_zh_CN.properties` | 747 | properties |
| `Search_zh_TW.properties` | 729 | properties |
| `lightbulb.png` | 1,267 | png |
| `package.html` | 152 | html |

### `org/fife/ui/autocomplete/` — 22 个文件，7,917 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `AutoCompleteDescWindow.properties` | 42 | properties |
| `AutoCompleteDescWindow_ar.properties` | 99 | properties |
| `AutoCompleteDescWindow_de.properties` | 51 | properties |
| `AutoCompleteDescWindow_es.properties` | 52 | properties |
| `AutoCompleteDescWindow_fr.properties` | 47 | properties |
| `AutoCompleteDescWindow_hu.properties` | 59 | properties |
| `AutoCompleteDescWindow_in.properties` | 42 | properties |
| `AutoCompleteDescWindow_it.properties` | 49 | properties |
| `AutoCompleteDescWindow_ja.properties` | 60 | properties |
| `AutoCompleteDescWindow_ko.properties` | 56 | properties |
| `AutoCompleteDescWindow_nl.properties` | 42 | properties |
| `AutoCompleteDescWindow_pl.properties` | 45 | properties |
| `AutoCompleteDescWindow_pt_BR.properties` | 59 | properties |
| `AutoCompleteDescWindow_ru.properties` | 85 | properties |
| `AutoCompleteDescWindow_tr.properties` | 54 | properties |
| `AutoCompleteDescWindow_zh_CN.properties` | 42 | properties |
| `AutoCompleteDescWindow_zh_TW.properties` | 42 | properties |
| `CompletionXml.dtd` | 1,200 | dtd |
| `arrow_left.png` | 345 | png |
| `arrow_right.png` | 349 | png |
| `bullet_black.png` | 221 | png |
| `osx_sizegrip.png` | 4,876 | png |

### `org/fife/ui/rsyntaxtextarea/` — 41 个文件，20,165 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ErrorStrip.properties` | 95 | properties |
| `ErrorStrip_ar.properties` | 269 | properties |
| `ErrorStrip_de.properties` | 98 | properties |
| `ErrorStrip_es.properties` | 106 | properties |
| `ErrorStrip_fi.properties` | 125 | properties |
| `ErrorStrip_fr.properties` | 108 | properties |
| `ErrorStrip_hu.properties` | 120 | properties |
| `ErrorStrip_in.properties` | 95 | properties |
| `ErrorStrip_it.properties` | 96 | properties |
| `ErrorStrip_ja.properties` | 193 | properties |
| `ErrorStrip_ko.properties` | 131 | properties |
| `ErrorStrip_nl.properties` | 100 | properties |
| `ErrorStrip_pl.properties` | 97 | properties |
| `ErrorStrip_pt.properties` | 109 | properties |
| `ErrorStrip_pt_BR.properties` | 110 | properties |
| `ErrorStrip_ru.properties` | 335 | properties |
| `ErrorStrip_tr.properties` | 127 | properties |
| `ErrorStrip_uk.properties` | 334 | properties |
| `ErrorStrip_zh_CN.properties` | 127 | properties |
| `ErrorStrip_zh_TW.properties` | 95 | properties |
| `RSyntaxTextArea.properties` | 597 | properties |
| `RSyntaxTextArea_ar.properties` | 1,480 | properties |
| `RSyntaxTextArea_de.properties` | 659 | properties |
| `RSyntaxTextArea_es.properties` | 657 | properties |
| `RSyntaxTextArea_fi.properties` | 766 | properties |
| `RSyntaxTextArea_fr.properties` | 690 | properties |
| `RSyntaxTextArea_hu.properties` | 856 | properties |
| `RSyntaxTextArea_in.properties` | 597 | properties |
| `RSyntaxTextArea_it.properties` | 621 | properties |
| `RSyntaxTextArea_ja.properties` | 1,185 | properties |
| `RSyntaxTextArea_ko.properties` | 1,011 | properties |
| `RSyntaxTextArea_nl.properties` | 626 | properties |
| `RSyntaxTextArea_pl.properties` | 684 | properties |
| `RSyntaxTextArea_pt.properties` | 664 | properties |
| `RSyntaxTextArea_pt_BR.properties` | 744 | properties |
| `RSyntaxTextArea_ru.properties` | 1,636 | properties |
| `RSyntaxTextArea_tr.properties` | 724 | properties |
| `RSyntaxTextArea_uk.properties` | 1,662 | properties |
| `RSyntaxTextArea_zh_CN.properties` | 771 | properties |
| `RSyntaxTextArea_zh_TW.properties` | 597 | properties |
| `package.html` | 68 | html |

### `org/fife/ui/rsyntaxtextarea/focusabletip/` — 21 个文件，1,480 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `FocusableTip.properties` | 33 | properties |
| `FocusableTip_ar.properties` | 117 | properties |
| `FocusableTip_de.properties` | 50 | properties |
| `FocusableTip_es.properties` | 40 | properties |
| `FocusableTip_fi.properties` | 35 | properties |
| `FocusableTip_fr.properties` | 63 | properties |
| `FocusableTip_hu.properties` | 89 | properties |
| `FocusableTip_in.properties` | 33 | properties |
| `FocusableTip_it.properties` | 36 | properties |
| `FocusableTip_ja.properties` | 163 | properties |
| `FocusableTip_ko.properties` | 92 | properties |
| `FocusableTip_nl.properties` | 36 | properties |
| `FocusableTip_pl.properties` | 56 | properties |
| `FocusableTip_pt.properties` | 33 | properties |
| `FocusableTip_pt_BR.properties` | 35 | properties |
| `FocusableTip_ru.properties` | 140 | properties |
| `FocusableTip_tr.properties` | 57 | properties |
| `FocusableTip_uk.properties` | 199 | properties |
| `FocusableTip_zh_CN.properties` | 64 | properties |
| `FocusableTip_zh_TW.properties` | 33 | properties |
| `package.html` | 76 | html |

### `org/fife/ui/rsyntaxtextarea/folding/` — 1 个文件，61 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 61 | html |

### `org/fife/ui/rsyntaxtextarea/modes/` — 49 个文件，898,424 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ActionScriptTokenMaker.flex` | 13,675 | flex |
| `Assembler6502TokenMaker.flex` | 10,382 | flex |
| `AssemblerX86TokenMaker.flex` | 16,126 | flex |
| `BBCodeTokenMaker.flex` | 8,107 | flex |
| `CPlusPlusTokenMaker.flex` | 15,490 | flex |
| `CSSTokenMaker.flex` | 18,795 | flex |
| `CSharpTokenMaker.flex` | 17,464 | flex |
| `CTokenMaker.flex` | 14,926 | flex |
| `ClojureTokenMaker.flex` | 13,876 | flex |
| `CsvTokenMaker.flex` | 8,342 | flex |
| `DTokenMaker.flex` | 19,006 | flex |
| `DartTokenMaker.flex` | 19,361 | flex |
| `DelphiTokenMaker.flex` | 15,232 | flex |
| `DockerTokenMaker.flex` | 7,838 | flex |
| `DtdTokenMaker.flex` | 10,872 | flex |
| `FortranTokenMaker.flex` | 19,017 | flex |
| `GoTokenMaker.flex` | 13,348 | flex |
| `GroovyTokenMaker.flex` | 26,120 | flex |
| `HTMLTokenMaker.flex` | 47,065 | flex |
| `HostsTokenMaker.flex` | 7,351 | flex |
| `HtaccessTokenMaker.flex` | 13,729 | flex |
| `IniTokenMaker.flex` | 6,596 | flex |
| `JSPTokenMaker.flex` | 65,082 | flex |
| `JavaScriptTokenMaker.flex` | 36,144 | flex |
| `JavaTokenMaker.flex` | 23,815 | flex |
| `JsonTokenMaker.flex` | 9,523 | flex |
| `KotlinTokenMaker.flex` | 24,143 | flex |
| `LatexTokenMaker.flex` | 8,345 | flex |
| `LispTokenMaker.flex` | 12,407 | flex |
| `LuaTokenMaker.flex` | 10,649 | flex |
| `MakefileTokenMaker.flex` | 9,728 | flex |
| `MarkdownTokenMaker.flex` | 28,204 | flex |
| `MxmlTokenMaker.flex` | 24,676 | flex |
| `NSISTokenMaker.flex` | 18,030 | flex |
| `PHPTokenMaker.flex` | 98,078 | flex |
| `PerlTokenMaker.flex` | 24,570 | flex |
| `PlainTextTokenMaker.flex` | 6,904 | flex |
| `PropertiesFileTokenMaker.flex` | 7,075 | flex |
| `PythonTokenMaker.flex` | 9,730 | flex |
| `RubyTokenMaker.flex` | 20,746 | flex |
| `SASTokenMaker.flex` | 14,143 | flex |
| `SQLTokenMaker.flex` | 10,716 | flex |
| `ScalaTokenMaker.flex` | 11,315 | flex |
| `TclTokenMaker.flex` | 15,669 | flex |
| `TypeScriptTokenMaker.flex` | 31,735 | flex |
| `VisualBasicTokenMaker.flex` | 11,550 | flex |
| `XMLTokenMaker.flex` | 15,143 | flex |
| `YamlTokenMaker.flex` | 7,490 | flex |
| `package.html` | 96 | html |

### `org/fife/ui/rsyntaxtextarea/parser/` — 1 个文件，346 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 346 | html |

### `org/fife/ui/rsyntaxtextarea/templates/` — 1 个文件，103 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 103 | html |

### `org/fife/ui/rsyntaxtextarea/themes/` — 9 个文件，29,641 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `dark.xml` | 3,228 | xml |
| `default-alt.xml` | 3,407 | xml |
| `default.xml` | 3,382 | xml |
| `druid.xml` | 3,311 | xml |
| `eclipse.xml` | 3,343 | xml |
| `idea.xml` | 3,508 | xml |
| `monokai.xml` | 3,272 | xml |
| `theme.dtd` | 2,886 | dtd |
| `vs.xml` | 3,304 | xml |

### `org/fife/ui/rtextarea/` — 21 个文件，30,745 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `RTextArea.properties` | 1,057 | properties |
| `RTextArea_ar.properties` | 2,311 | properties |
| `RTextArea_de.properties` | 1,351 | properties |
| `RTextArea_es.properties` | 1,179 | properties |
| `RTextArea_fi.properties` | 1,209 | properties |
| `RTextArea_fr.properties` | 1,194 | properties |
| `RTextArea_hu.properties` | 1,477 | properties |
| `RTextArea_in.properties` | 1,068 | properties |
| `RTextArea_it.properties` | 1,137 | properties |
| `RTextArea_ja.properties` | 1,861 | properties |
| `RTextArea_ko.properties` | 1,708 | properties |
| `RTextArea_nl.properties` | 1,198 | properties |
| `RTextArea_pl.properties` | 1,115 | properties |
| `RTextArea_pt.properties` | 1,289 | properties |
| `RTextArea_pt_BR.properties` | 1,202 | properties |
| `RTextArea_ru.properties` | 2,926 | properties |
| `RTextArea_tr.properties` | 1,020 | properties |
| `RTextArea_uk.properties` | 3,558 | properties |
| `RTextArea_zh_CN.properties` | 1,571 | properties |
| `RTextArea_zh_TW.properties` | 1,228 | properties |
| `package.html` | 86 | html |

### `org/fife/util/` — 1 个文件，58 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 58 | html |

### `org/jdesktop/animation/timing/` — 1 个文件，785 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 785 | html |

### `org/jdesktop/animation/timing/interpolation/` — 1 个文件，779 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `package.html` | 779 | html |

### `org/jdesktop/animation/timing/triggers/` — 2 个文件，4,703 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `TriggerNotes` | 3,969 | 其他(无扩展名) |
| `package.html` | 734 | html |

### `org/jdesktop/swingx/autocomplete/doc-files/` — 1 个文件，5,359 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `example.gif` | 5,359 | gif |

### `org/jdesktop/swingx/color/` — 2 个文件，1,783 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `colorwell.png` | 725 | png |
| `mag.png` | 1,058 | png |

### `org/jdesktop/swingx/plaf/basic/resources/` — 66 个文件，58,197 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `DatePicker.properties` | 400 | properties |
| `DatePicker_cs.properties` | 283 | properties |
| `DatePicker_da.properties` | 417 | properties |
| `DatePicker_de.properties` | 231 | properties |
| `DatePicker_en_GB.properties` | 234 | properties |
| `DatePicker_en_US.properties` | 228 | properties |
| `DatePicker_es.properties` | 94 | properties |
| `DatePicker_fr.properties` | 250 | properties |
| `DatePicker_it.properties` | 236 | properties |
| `DatePicker_nl.properties` | 241 | properties |
| `DatePicker_pl_PL.properties` | 232 | properties |
| `DatePicker_pt_BR.properties` | 233 | properties |
| `DatePicker_sv.properties` | 234 | properties |
| `ErrorPane.properties` | 302 | properties |
| `ErrorPane_cs.properties` | 339 | properties |
| `ErrorPane_da.properties` | 309 | properties |
| `ErrorPane_de.properties` | 321 | properties |
| `ErrorPane_es.properties` | 368 | properties |
| `ErrorPane_fr.properties` | 324 | properties |
| `ErrorPane_it.properties` | 315 | properties |
| `ErrorPane_nl.properties` | 311 | properties |
| `ErrorPane_pl.properties` | 345 | properties |
| `ErrorPane_pt_BR.properties` | 344 | properties |
| `ErrorPane_sv.properties` | 317 | properties |
| `LoginPane.properties` | 1,159 | properties |
| `LoginPane_cs.properties` | 1,695 | properties |
| `LoginPane_de.properties` | 1,334 | properties |
| `LoginPane_es.properties` | 1,345 | properties |
| `LoginPane_fr.properties` | 1,303 | properties |
| `LoginPane_it.properties` | 1,186 | properties |
| `LoginPane_nl.properties` | 1,221 | properties |
| `LoginPane_pl.properties` | 1,350 | properties |
| `LoginPane_pt_BR.properties` | 1,220 | properties |
| `LoginPane_sv.properties` | 1,369 | properties |
| `SearchField.properties` | 167 | properties |
| `SearchField_de.properties` | 185 | properties |
| `TipOfTheDay.properties` | 227 | properties |
| `TipOfTheDay24.gif` | 742 | gif |
| `TipOfTheDay_cs.properties` | 352 | properties |
| `TipOfTheDay_de.properties` | 256 | properties |
| `TipOfTheDay_es.properties` | 259 | properties |
| `TipOfTheDay_fr.properties` | 256 | properties |
| `TipOfTheDay_it.properties` | 256 | properties |
| `TipOfTheDay_nl.properties` | 241 | properties |
| `TipOfTheDay_pl.properties` | 246 | properties |
| `TipOfTheDay_pt_BR.properties` | 244 | properties |
| `TipOfTheDay_sv.properties` | 235 | properties |
| `clear.gif` | 1,026 | gif |
| `clear_pressed.gif` | 1,032 | gif |
| `clear_rollover.gif` | 1,025 | gif |
| `error16.png` | 3,582 | png |
| `month-down.png` | 3,138 | png |
| `month-up.png` | 3,139 | png |
| `search.gif` | 547 | gif |
| `search_popup.gif` | 556 | gif |
| `swingx.properties` | 1,705 | properties |
| `swingx_cs.properties` | 2,096 | properties |
| `swingx_da.properties` | 1,779 | properties |
| `swingx_de.properties` | 1,821 | properties |
| `swingx_es.properties` | 1,867 | properties |
| `swingx_fr.properties` | 1,869 | properties |
| `swingx_it.properties` | 1,785 | properties |
| `swingx_nl.properties` | 1,765 | properties |
| `swingx_pl.properties` | 1,962 | properties |
| `swingx_pt_BR.properties` | 1,876 | properties |
| `swingx_sv.properties` | 1,871 | properties |

### `org/jdesktop/swingx/plaf/linux/resources/` — 1 个文件，2,904 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `combo-gtk.png` | 2,904 | png |

### `org/jdesktop/swingx/plaf/macosx/resources/` — 16 个文件，7,037 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ErrorPane.properties` | 193 | properties |
| `ErrorPane_cs.properties` | 205 | properties |
| `ErrorPane_da.properties` | 197 | properties |
| `ErrorPane_de.properties` | 198 | properties |
| `ErrorPane_es.properties` | 30 | properties |
| `ErrorPane_fr.properties` | 204 | properties |
| `ErrorPane_it.properties` | 200 | properties |
| `ErrorPane_nl.properties` | 202 | properties |
| `ErrorPane_pt_BR.properties` | 208 | properties |
| `ErrorPane_sv.properties` | 205 | properties |
| `clear.png` | 322 | png |
| `clear_pressed.png` | 412 | png |
| `clear_rollover.png` | 326 | png |
| `combo-osx.png` | 2,850 | png |
| `search.png` | 331 | png |
| `search_popup.png` | 954 | png |

### `org/jdesktop/swingx/plaf/windows/resources/` — 28 个文件，23,376 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `TipOfTheDay.properties` | 74 | properties |
| `TipOfTheDay_cs.properties` | 174 | properties |
| `TipOfTheDay_de.properties` | 87 | properties |
| `TipOfTheDay_es.properties` | 93 | properties |
| `TipOfTheDay_fr.properties` | 96 | properties |
| `TipOfTheDay_it.properties` | 94 | properties |
| `TipOfTheDay_nl.properties` | 76 | properties |
| `TipOfTheDay_pl.properties` | 91 | properties |
| `TipOfTheDay_pt_BR.properties` | 84 | properties |
| `TipOfTheDay_sv.properties` | 89 | properties |
| `clear.gif` | 222 | gif |
| `clear_pressed.gif` | 660 | gif |
| `clear_rollover.gif` | 701 | gif |
| `combo-w2k.png` | 2,833 | png |
| `combo-xp.png` | 2,930 | png |
| `search.gif` | 609 | gif |
| `search_popup.gif` | 273 | gif |
| `search_popup_pressed.gif` | 228 | gif |
| `search_popup_rollover.gif` | 363 | gif |
| `search_pressed.gif` | 1,161 | gif |
| `search_rollover.gif` | 1,207 | gif |
| `silver-statusbar-left.png` | 223 | png |
| `silver-statusbar-middle.png` | 196 | png |
| `silver-statusbar-right.png` | 370 | png |
| `statusbar-left.png` | 3,200 | png |
| `statusbar-middle.png` | 2,864 | png |
| `statusbar-right.png` | 3,194 | png |
| `tipoftheday.png` | 1,184 | png |

### `org/pcap4j/` — 1 个文件，128 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `pcap4j.properties` | 128 | properties |

### `org/pcap4j/packet/` — 1 个文件，518 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `packet.properties` | 518 | properties |

### `org/threeten/bp/` — 1 个文件，100,361 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `TZDB.dat` | 100,361 | dat |

### `org/threeten/bp/format/` — 1 个文件，149 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `ChronologyText.properties` | 149 | properties |

### `org/v/` — 1 个文件，235 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `TODO.txt` | 235 | txt |

### `resources/font/` — 22 个文件，9,180,968 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `Consola.ttf` | 459,180 | ttf |
| `DejaVuSansMono-Bold.ttf` | 331,992 | ttf |
| `DejaVuSansMono.ttf` | 340,712 | ttf |
| `IBMPlexMono-Bold.ttf` | 111,440 | ttf |
| `IBMPlexMono-Medium.ttf` | 110,420 | ttf |
| `IBMPlexMono-Regular.ttf` | 109,272 | ttf |
| `Inconsolatat.ttf` | 343,368 | ttf |
| `JetBrainsMono.ttf` | 185,520 | ttf |
| `NanumGothicCoding-Bold.ttf` | 1,940,156 | ttf |
| `NanumGothicCoding-Regular.ttf` | 2,042,440 | ttf |
| `NotoSansMono.ttf` | 1,396,280 | ttf |
| `NovaMono-Regular.ttf` | 299,208 | ttf |
| `PTMono-Regular.ttf` | 169,036 | ttf |
| `RobotoMono.ttf` | 182,172 | ttf |
| `ShareTechMono-Regular.ttf` | 42,756 | ttf |
| `SourceCodePro-Bold.ttf` | 191,568 | ttf |
| `SourceCodePro-Medium.ttf` | 191,984 | ttf |
| `SourceCodePro-Regular.ttf` | 192,740 | ttf |
| `SpaceMono-Bold.ttf` | 86,740 | ttf |
| `SpaceMono-Regular.ttf` | 90,972 | ttf |
| `UbuntuMono-Bold.ttf` | 174,008 | ttf |
| `UbuntuMono-Regular.ttf` | 189,004 | ttf |

### `resources/images/` — 6 个文件，6,319,766 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `bg1.jpg` | 379,608 | jpg |
| `bg2.jpg` | 168,254 | jpg |
| `bg3.jpg` | 1,203,752 | jpg |
| `bg4.jpg` | 1,807,984 | jpg |
| `bg5.jpg` | 2,752,680 | jpg |
| `logo.png` | 7,488 | png |

### `resources/theme/` — 124 个文件，35,470 字节

| 文件 | 字节数 | 类型 |
|---|---:|---|
| `3024 Day.json` | 286 | json |
| `3024 Night.json` | 286 | json |
| `AdventureTime.json` | 286 | json |
| `Afterglow.json` | 286 | json |
| `AlienBlood.json` | 286 | json |
| `Argonaut.json` | 286 | json |
| `Arthur.json` | 286 | json |
| `AtelierSulphurpool.json` | 286 | json |
| `Atom.json` | 286 | json |
| `AtomOneLight.json` | 286 | json |
| `Batman.json` | 286 | json |
| `Belafonte Day.json` | 286 | json |
| `Belafonte Night.json` | 286 | json |
| `BirdsOfParadise.json` | 286 | json |
| `Borland.json` | 286 | json |
| `Broadcast.json` | 286 | json |
| `Brogrammer.json` | 286 | json |
| `CLRS.json` | 286 | json |
| `Chalkboard.json` | 286 | json |
| `Ciapre.json` | 286 | json |
| `Cobalt Neon.json` | 286 | json |
| `Cobalt2.json` | 286 | json |
| `CrayonPonyFish.json` | 286 | json |
| `Darkside.json` | 286 | json |
| `Default.json` | 292 | json |
| `DimmedMonokai.json` | 286 | json |
| `DotGov.json` | 286 | json |
| `Dracula.json` | 286 | json |
| `Duotone Dark.json` | 286 | json |
| `Earthsong.json` | 286 | json |
| `Elemental.json` | 286 | json |
| `Espresso.json` | 286 | json |
| `FirefoxDev.json` | 286 | json |
| `Firewatch.json` | 286 | json |
| `Flat.json` | 286 | json |
| `Flatland.json` | 286 | json |
| `ForestBlue.json` | 286 | json |
| `FrontEndDelight.json` | 286 | json |
| `FunForrest.json` | 286 | json |
| `Galaxy.json` | 286 | json |
| `Github.json` | 286 | json |
| `Glacier.json` | 286 | json |
| `Grape.json` | 286 | json |
| `Grass.json` | 286 | json |
| `Gruvbox Dark.json` | 286 | json |
| `Hardcore.json` | 286 | json |
| `Harper.json` | 286 | json |
| `Highway.json` | 286 | json |
| `Hipster Green.json` | 286 | json |
| `Homebrew.json` | 286 | json |
| `Hybrid.json` | 286 | json |
| `IC_Green_PPL.json` | 286 | json |
| `IC_Orange_PPL.json` | 286 | json |
| `Jackie Brown.json` | 286 | json |
| `Japanesque.json` | 286 | json |
| `Jellybeans.json` | 286 | json |
| `JetBrains Darcula.json` | 286 | json |
| `Kibble.json` | 286 | json |
| `Later This Evening.json` | 286 | json |
| `Lavandula.json` | 286 | json |
| `Man Page.json` | 286 | json |
| `Material.json` | 286 | json |
| `Mathias.json` | 286 | json |
| `Medallion.json` | 286 | json |
| `Misterioso.json` | 286 | json |
| `Monokai Soda.json` | 286 | json |
| `N0tch2k.json` | 286 | json |
| `Neopolitan.json` | 286 | json |
| `Neutron.json` | 286 | json |
| `Novel.json` | 286 | json |
| `Obsidian.json` | 286 | json |
| `Ocean.json` | 286 | json |
| `Ollie.json` | 286 | json |
| `Pandora.json` | 286 | json |
| `Parasio Dark.json` | 286 | json |
| `PaulMillr.json` | 286 | json |
| `PencilLight.json` | 286 | json |
| `Piatto Light.json` | 286 | json |
| `Pnevma.json` | 286 | json |
| `Pro.json` | 286 | json |
| `Red Alert.json` | 286 | json |
| `Red Sands.json` | 286 | json |
| `Rippedcasts.json` | 286 | json |
| `Royal.json` | 286 | json |
| `Ryuuko.json` | 286 | json |
| `SeaShells.json` | 286 | json |
| `Seti.json` | 286 | json |
| `Slate.json` | 286 | json |
| `Smyck.json` | 286 | json |
| `SoftServer.json` | 286 | json |
| `Solarized Darcula.json` | 286 | json |
| `Solarized Dark - Patched.json` | 286 | json |
| `Solarized Dark Higher Contrast.json` | 286 | json |
| `Solarized Dark.json` | 286 | json |
| `Solarized Light.json` | 286 | json |
| `SpaceGray Eighties Dull.json` | 286 | json |
| `SpaceGray Eighties.json` | 286 | json |
| `SpaceGray.json` | 286 | json |
| `Spacedust.json` | 286 | json |
| `Spiderman.json` | 286 | json |
| `Spring.json` | 286 | json |
| `Square.json` | 286 | json |
| `Sundried.json` | 286 | json |
| `Symfonic.json` | 286 | json |
| `Teerb.json` | 286 | json |
| `Terminal Basic.json` | 286 | json |
| `Thayer Bright.json` | 286 | json |
| `The Hulk.json` | 286 | json |
| `Tomorrow Night Blue.json` | 286 | json |
| `Tomorrow Night Bright.json` | 286 | json |
| `Tomorrow Night Eighties.json` | 286 | json |
| `Tomorrow Night.json` | 286 | json |
| `Tomorrow.json` | 286 | json |
| `ToyChest.json` | 286 | json |
| `Twilight.json` | 286 | json |
| `WarmNeon.json` | 286 | json |
| `Wez.json` | 286 | json |
| `WildCherry.json` | 286 | json |
| `Wombat.json` | 286 | json |
| `Wryan.json` | 286 | json |
| `Zenburn.json` | 286 | json |
| `ayu.json` | 286 | json |
| `ayu_light.json` | 286 | json |
| `idleToes.json` | 286 | json |

## 3. 重点资源（程序运行必需）

### 3.1 `theme/` — 终端配色主题（FinalShell 自有主题系统）

`resources/theme/` 共 **124** 个 JSON 文件，每个 286–292 字节，内容为终端配色方案（`ansi_color` 16 色 + `background_color` / `foreground_color` / `cursor_color` / `selected_color`），由 `app/kx_2.java:92` 的 `g(String)` 方法加载：

```java
object = com.c.d(607602864130007270L).invoke(null,
        com.c.a("/resources/theme/" + string + ".json"));
```

| 主题 | 主题 | 主题 | 主题 |
|---|---|---|---|
| 3024 Day.json | 3024 Night.json | AdventureTime.json | Afterglow.json |
| AlienBlood.json | Argonaut.json | Arthur.json | AtelierSulphurpool.json |
| Atom.json | AtomOneLight.json | ayu.json | ayu_light.json |
| Batman.json | Belafonte Day.json | Belafonte Night.json | BirdsOfParadise.json |
| Borland.json | Broadcast.json | Brogrammer.json | Chalkboard.json |
| Ciapre.json | CLRS.json | Cobalt Neon.json | Cobalt2.json |
| CrayonPonyFish.json | Darkside.json | Default.json | DimmedMonokai.json |
| DotGov.json | Dracula.json | Duotone Dark.json | Earthsong.json |
| Elemental.json | Espresso.json | FirefoxDev.json | Firewatch.json |
| Flat.json | Flatland.json | ForestBlue.json | FrontEndDelight.json |
| FunForrest.json | Galaxy.json | Github.json | Glacier.json |
| Grape.json | Grass.json | Gruvbox Dark.json | Hardcore.json |
| Harper.json | Highway.json | Hipster Green.json | Homebrew.json |
| Hybrid.json | IC_Green_PPL.json | IC_Orange_PPL.json | idleToes.json |
| Jackie Brown.json | Japanesque.json | Jellybeans.json | JetBrains Darcula.json |
| Kibble.json | Later This Evening.json | Lavandula.json | Man Page.json |
| Material.json | Mathias.json | Medallion.json | Misterioso.json |
| Monokai Soda.json | N0tch2k.json | Neopolitan.json | Neutron.json |
| Novel.json | Obsidian.json | Ocean.json | Ollie.json |
| Pandora.json | Parasio Dark.json | PaulMillr.json | PencilLight.json |
| Piatto Light.json | Pnevma.json | Pro.json | Red Alert.json |
| Red Sands.json | Rippedcasts.json | Royal.json | Ryuuko.json |
| SeaShells.json | Seti.json | Slate.json | Smyck.json |
| SoftServer.json | Solarized Darcula.json | Solarized Dark - Patched.json | Solarized Dark Higher Contrast.json |
| Solarized Dark.json | Solarized Light.json | Spacedust.json | SpaceGray Eighties Dull.json |
| SpaceGray Eighties.json | SpaceGray.json | Spiderman.json | Spring.json |
| Square.json | Sundried.json | Symfonic.json | Teerb.json |
| Terminal Basic.json | Thayer Bright.json | The Hulk.json | Tomorrow Night Blue.json |
| Tomorrow Night Bright.json | Tomorrow Night Eighties.json | Tomorrow Night.json | Tomorrow.json |
| ToyChest.json | Twilight.json | WarmNeon.json | Wez.json |
| WildCherry.json | Wombat.json | Wryan.json | Zenburn.json |

> 注意：文件名含空格（如 `Solarized Dark.json`），在 Windows 上合法；
> `getResource` 的 URL 解析会自动做 `%20` 编码，取用时无需额外处理。

### 3.2 FlatLaf / IntelliJ 主题（与 3.1 是两套独立体系）

`com/formdev/flatlaf/` 共 **181** 个文件（4,652,818 字节），是 FlatLaf L&F 本体资源：

| 路径 | 字节数 | 用途 |
|---|---:|---|
| `com/formdev/flatlaf/FlatLaf.properties` | 31,222 | FlatLaf 基础 L&F 默认值 |
| `com/formdev/flatlaf/FlatDarkLaf.properties` | 14,073 | FlatDarkLaf（暗色）L&F 默认值 |
| `com/formdev/flatlaf/FlatLightLaf.properties` | 14,487 | FlatLightLaf（亮色）L&F 默认值 |
| `com/formdev/flatlaf/FlatDarculaLaf.properties` | 2,019 | FlatDarculaLaf L&F 默认值 |
| `com/formdev/flatlaf/FlatIntelliJLaf.properties` | 2,471 | FlatIntelliJLaf L&F 默认值 |
| `com/formdev/flatlaf/IntelliJTheme$ThemeLaf.properties` | 13,367 | IntelliJ 主题 L&F 默认值 |
| `com/formdev/flatlaf/themes/FlatMacDarkLaf.properties` | 9,215 | macOS 暗色 L&F |
| `com/formdev/flatlaf/themes/FlatMacLightLaf.properties` | 9,083 | macOS 亮色 L&F |
| `com/formdev/flatlaf/jideoss/FlatLaf.properties` | 3,127 | JIDE (RSyntaxTextArea) 集成默认值 |
| `com/formdev/flatlaf/resources/Bundle.properties` | 2,440 | i18n 基线包 |
| `com/formdev/flatlaf/resources/Bundle_de.properties` | 1,980 | i18n 德语 |
| `com/formdev/flatlaf/resources/Bundle_es.properties` | 2,553 | i18n 西班牙语 |
| `com/formdev/flatlaf/resources/Bundle_fr.properties` | 1,954 | i18n 法语 |
| `com/formdev/flatlaf/demo/intellijthemes/themes.json` | 22,113 | IntelliJ 主题目录（themes.json） |
| `com/formdev/flatlaf/natives/flatlaf-windows-x86_64.dll` | 22,248 | Windows 原生外观加载器 |
| `com/formdev/flatlaf/natives/flatlaf-windows-x86.dll` | 20,200 | Windows 32 位原生外观加载器 |
| `com/formdev/flatlaf/natives/libflatlaf-linux-x86_64.so` | 17,064 | Linux 原生外观加载器 |

**IntelliJ 主题包**（`*.theme.json` + `*.LICENSE.txt`）：

| 目录 | 文件数 | 字节数 |
|---|---:|---:|
| `com/formdev/flatlaf/intellijthemes/themes/` | 53 | 356,754 |
| `com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/` | 35 | 1,745,019 |
| `com/formdev/flatlaf/demo/` | 12 | 132,600 |
| `com/formdev/flatlaf/demo/icons/` | 36 | 29,380 |
| `com/formdev/flatlaf/demo/extras/svg/` | 4 | 1,618 |
| `com/formdev/flatlaf/fonts/inter/` | 9 | 2,174,562 |

### 3.3 字体

| 路径 | 字节数 | 用途 |
|---|---:|---|
| `font/DejaVu Sans Mono Nerd Font Complete Mono.ttf` | 770,232 | Nerd Font 终端字体（`app/um_2.java:405` 用 `Font.createFont` 加载） |
| `fontawesome-webfont.ttf` | 165,548 | FontAwesome 图标字体（`app/aX.java:38`、`app/fx_2.java:161`） |
| `fa-brands-400.ttf` | 130,552 | FontAwesome 品牌图标字体 |
| `fa-regular-400.ttf` | 34,096 | FontAwesome 常规图标字体 |
| `fa-solid-900.ttf` | 192,472 | FontAwesome 实心图标字体 |
| `resources/font/Consola.ttf` | 459,180 | Consola — `app/lk_0.java:1742` 按 `/resources/font/` 前缀加载 |
| `resources/font/Consola.ttf` | 459,180 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/DejaVuSansMono-Bold.ttf` | 331,992 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/DejaVuSansMono.ttf` | 340,712 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/IBMPlexMono-Bold.ttf` | 111,440 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/IBMPlexMono-Medium.ttf` | 110,420 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/IBMPlexMono-Regular.ttf` | 109,272 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/Inconsolatat.ttf` | 343,368 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/JetBrainsMono.ttf` | 185,520 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/NanumGothicCoding-Bold.ttf` | 1,940,156 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/NanumGothicCoding-Regular.ttf` | 2,042,440 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/NotoSansMono.ttf` | 1,396,280 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/NovaMono-Regular.ttf` | 299,208 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/PTMono-Regular.ttf` | 169,036 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/RobotoMono.ttf` | 182,172 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/ShareTechMono-Regular.ttf` | 42,756 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/SourceCodePro-Bold.ttf` | 191,568 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/SourceCodePro-Medium.ttf` | 191,984 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/SourceCodePro-Regular.ttf` | 192,740 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/SpaceMono-Bold.ttf` | 86,740 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/SpaceMono-Regular.ttf` | 90,972 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/UbuntuMono-Bold.ttf` | 174,008 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `resources/font/UbuntuMono-Regular.ttf` | 189,004 | 等宽终端字体（`/resources/font/` 目录，代码前缀拼接加载） |
| `com/formdev/flatlaf/fonts/inter/Inter-Bold.otf` | 271,436 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-BoldItalic.otf` | 278,016 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-Italic.otf` | 271,400 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-Light.otf` | 265,000 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-LightItalic.otf` | 274,996 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-Regular.otf` | 258,992 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-SemiBold.otf` | 270,760 | FlatLaf 内置 Inter 字体 |
| `com/formdev/flatlaf/fonts/inter/Inter-SemiBoldItalic.otf` | 279,536 | FlatLaf 内置 Inter 字体 |

**字体合计：35 个文件，12,644,004 字节。**

### 3.4 配置文件（`*.properties` / `*.json` / `*.xml`）

- `.properties` **264** 个，242,637 字节
- `.json` **190** 个，2,124,043 字节
- `.xml` **20** 个，155,283 字节

**其中属于 FinalShell 自身（非第三方库）的配置/描述文件：**

| 路径 | 字节数 | 类型 | 用途 |
|---|---:|---|---|
| `log4j.properties` | 379 | properties | Log4j 1.x 输出配置（rootLogger=off,file → msg.log） |
| `com/resources/version.xml` | 81 | xml | WebLaF 版本信息（name=WebLaF version=1 build=29） |
| `com/resources/icons.xml` | 769 | xml | 图标映射表（`app/com/a9.java:948` 用 `com.a9.class.getResource` 加载） |
| `com/resources/language.xml` | 109,877 | xml | 语言/语法定义表（109,877 字节，最大的一份） |
| `com/resources/panel.xml` | 4,490 | xml | 面板定义 |
| `com/resources/scrollBar.xml` | 1,180 | xml | 滚动条定义 |
| `com/resources/label.xml` | 777 | xml | 标签定义 |
| `com/resources/NinePatchSkin.xml` | 726 | xml | NinePatch 皮肤定义 |
| `com/C/resources/WebSkin.xml` | 625 | xml | Web 皮肤定义 |
| `com/C/resources/label.xml` | 3,320 | xml | 标签定义（另一套） |
| `com/C/resources/panel.xml` | 3,411 | xml | 面板定义（另一套） |
| `com/C/resources/popupMenu.xml` | 774 | xml | 弹出菜单定义 |
| `com/C/resources/scrollBar.xml` | 2,498 | xml | 滚动条定义（另一套） |
| `META-INF/MANIFEST.MF` | 157 | mf | jar 清单（Main-Class: st；Class-Path: lib-run/bcprov.jar） |
| `release-timestamp.txt` | 10 | txt | 构建时间戳 |
| `changelog.txt` | 96,056 | txt | 变更日志（96,056 字节） |
| `latestchanges.html` | 511 | html | 最新变更（HTML） |

**第三方库的配置/资源文件**（同在 jar 内，供库自用）：

| 目录 | 文件数 | 说明 |
|---|---:|---|
| `org/apache/hc/client5/version.properties` | — | HttpClient5 版本号 |
| `org/apache/hc/core5/version.properties` | — | HttpCore5 版本号 |
| `org/apache/log4j/lf5/config/defaultconfig.properties` | — | Log4j 1.x LF5 默认配置 |
| `org/apache/log4j/xml/log4j.dtd` | — | Log4j XML 配置 DTD |
| `org/pcap4j/pcap4j.properties` | — | pcap4j 配置 |
| `org/pcap4j/packet/packet.properties` | — | pcap4j 包解析配置 |
| `org/threeten/bp/format/ChronologyText.properties` | — | ThreeTen 时区文本 |
| `org/fife/ui/rsyntaxtextarea/themes/*.xml` | 9 | RSyntaxTextArea 代码高亮主题（9 个） |
| `org/fife/ui/rsyntaxtextarea/modes/*.flex` | 49 | RSyntaxTextArea 词法定义（49 个） |
| `org/jdesktop/swingx/plaf/*/resources/*.properties` | 111 | SwingX 各 L&F 的 i18n |

### 3.5 `config` / `knownhosts` / `license` / `version` 命名文件

| 路径 | 字节数 | 类型 | 说明 |
|---|---:|---|---|
| `AUTHORS` | 2,609 | 其他(无扩展名) | 作者列表 |
| `LICENSE` | 5,378 | 其他(无扩展名) | 许可证文件 |
| `com/formdev/flatlaf/demo/extras/svg/LICENSE.txt` | 206 | txt | 许可证文件 |
| `com/formdev/flatlaf/demo/icons/LICENSE.txt` | 206 | txt | 许可证文件 |
| `com/formdev/flatlaf/fonts/inter/LICENSE.txt` | 4,426 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Carbon.LICENSE.txt` | 11,357 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Cobalt_2.LICENSE.txt` | 1,055 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Cyan.LICENSE.txt` | 1,077 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/DarkFlatTheme.LICENSE.txt` | 1,071 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/DarkPurple.LICENSE.txt` | 1,077 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Dracula.LICENSE.txt` | 1,087 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Gradianto.LICENSE.txt` | 1,066 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Gray.LICENSE.txt` | 1,077 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Hiberbee.LICENSE.txt` | 1,114 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/HighContrast.LICENSE.txt` | 1,077 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/LightFlatTheme.LICENSE.txt` | 1,071 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/MaterialTheme.LICENSE.txt` | 1,078 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Monocai.LICENSE.txt` | 1,079 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Monokai_Pro.LICENSE.txt` | 1,045 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Solarized.LICENSE.txt` | 1,211 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Spacegray.LICENSE.txt` | 1,069 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/Xcode-Dark.LICENSE.txt` | 1,064 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/arc-themes.LICENSE.txt` | 1,070 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/gruvbox_theme.LICENSE.txt` | 1,072 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/Material Theme UI Lite.LICENSE.txt` | 1,108 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/nord.LICENSE.txt` | 1,247 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/one_dark.LICENSE.txt` | 1,069 | txt | 许可证文件 |
| `com/formdev/flatlaf/intellijthemes/themes/vuesion_theme.LICENSE.txt` | 1,072 | txt | 许可证文件 |
| `com/icons/auth.png` | 7,605 | png | 作者列表 |
| `com/resources/version.xml` | 81 | xml | 版本信息 |
| `images/config.png` | 500 | png | 配置 |
| `org/apache/hc/client5/version.properties` | 903 | properties | 版本信息 |
| `org/apache/hc/core5/version.properties` | 902 | properties | 版本信息 |
| `org/apache/log4j/lf5/config/defaultconfig.properties` | 648 | properties | 配置 |

> **`knownhosts.json` 不在 jar 内** —— 它位于运行时数据目录 `C:\Users\李超\AppData\Local\finalshell\knownhosts.json`，由用户数据产生，不属于 classpath 资源。
> 同理 `config.json` / `tconfig.json` / `ipdata.dat` / `knownhosts.json` 都在 AppData 目录，不在 jar 里。

## 4. 代码 `getResource` 引用对照表

代码位于 `D:\chat_work\finalshell-teardown\app\`（5,387 个 .java）。
`getResource` / `getResourceAsStream` 共 **221 处调用点**。

> 路径字面量几乎全部被**逐类字符串解密器**混淆（形如 `com.A.d.a(-27691, -12277)`）。
> 下表中的路径是**运行时解密后的真实路径**，并已与本目录逐条核对。

### 4.1 根绝对路径（`getResource("/...")`）

| 资源路径 | 加载点 | 用途 | 状态 |
|---|---|---|---|
| `/fontawesome-webfont.ttf` | app/aX.java:38, app/fx_2.java:161 | FontAwesome 字体，`Font.createFont(0, stream)` | ✔ 已提取 |
| `/resources/images/logo.png` | app/cy_1.java:382 | 程序 logo | ✔ 已提取 |
| `/resources/images/bg1..bg5.jpg` | app/KM.java:324 | 背景图，`ImageIO.read("/resources/images/" + var)` | ✔ 已提取（6 个） |
| `/resources/font/<name>.ttf` | app/lk_0.java:1742 | 终端等宽字体，`Font.createFont` 遍历 22 个 ttf | ✔ 已提取（22 个） |
| `/font/DejaVu Sans Mono Nerd Font Complete Mono.ttf` | app/um_2.java:405 | Nerd Font 终端字体 | ✔ 已提取 |
| `/images/<name>.png` | app/lk_0.java:5988 | 图标，`new ImageIcon(getResource("/images/" + s))` | ✔ 已提取（15 个） |
| `/resources/theme/<name>.json` | app/kx_2.java:92 | 终端配色主题加载器 | ✔ 已提取（124 个） |
| `/sk` | app/D4.java:271, app/d5_0.java:278 | DES 密钥材料（8 字节） | **✘ 不在 jar 内** |

### 4.2 包相对路径（`getResource("icons/...")` → 解析为 `com/icons/...`）

| 资源路径 | 加载点 | 用途 | 状态 |
|---|---|---|---|
| `com/icons/*.png（24 个）` | app/com/kd_1.java:949-972 | 编辑器工具栏：open/save/saveas/undo/redo/copy/paste/rotate_*/guides/ruler/stretch/content/ruler_cursor/area_cursor/min/max/icon/show_icon/show_text/foreground_color/transparent/background_color | ✔ |
| `com/icons/{dir_icon,settings,ok,cancel}.png` | app/com/DK.java:341-344 | 主界面按钮 | ✔ |
| `com/icons/{radio,radioCheck}.png` | app/com/YN.java:223-224 | 单选控件 | ✔ |
| `com/icons/{box,boxCheck}.png` | app/com/YV.java:223-224 | 复选控件 | ✔ |
| `com/icons/{previous_skip,previous,next,next_skip}.png` | app/com/kv_1.java:796-799 | 导航按钮 | ✔ |
| `com/icons/dock_{top,left,right,bottom}[_].png` | app/com/kn_1.java:367, app/com/ku_2.java:416 | 停靠面板 | ✔ |
| `com/icons/filter/*.png` | app/com/nr_2.java:370-373 | 搜索过滤条 | ✔ |
| `com/icons/{arrowRight,arrowLeft}.png` | app/com/oc_1.java:758-759 | 箭头 | ✔ |
| `com/icons/{link,email}.png` | app/com/oj_0.java:503-504 | 超链接 / 邮件 | ✔ |
| `com/icons/eyedropper.png` | app/com/nx_2.java:629 | 取色器 | ✔ |
| `com/icons/date.png` | app/com/lk_2.java:719 | 日期 | ✔ |
| `com/icons/cross.png` | app/com/k4_0.java:527, app/com/kc_2.java:789 | 十字 | ✔ |
| `com/icons/color/{color,transparent}.png` | app/com/xg_0.java:1926-1927 | 取色面板 | ✔ |
| `com/icons/{hide,hide_dark}.png` | app/com/d1_0.java:380-381 | 显示/隐藏 | ✔ |
| `com/icons/java.png` | app/com/xd_1.java:131 | Java 文件图标 | ✔ |
| `com/icons/example.png` | app/com/xc_2.java:100 | 示例 | ✔ |
| `com/icons/lang/other.png` | app/com/i2_0.java:3014 | 语言 fallback | ✔ |
| `com/A/icons/*.png（9 个）` | app/com/A/d.java:1426-1433 | 窗口标题栏按钮 + watermark | ✔ |
| `com/c/icons/*.png（4 个）` | app/com/C/d_0.java:361-364 | 窗口按钮（min/max/restore/close） | ✔ |
| `com/I/icons/*.png（5 个）` | app/com/I/x.java:468-472 | jar/package/class/java/file | ✔ |
| `com/T/icons/{information,warning,error,question}.png` | app/com/T/s.java:445-448 | 对话框图标 | ✔ |
| `com/t/icons/{left,right}.png` | app/com/T/X.java:273-274 | 方向 | ✔ |
| `com/t/icons/loop.png` | app/com/T/L.java:341 | 循环 | ✔ |
| `com/t/icons/color_chooser.png` | app/com/T/s_1.java:200 | 颜色选择 | ✔ |
| `com/V/icons/{up,down}.png` | app/com/V/t.java:362-363 | 上下箭头 | ✔ |
| `com/Z/icons/*.png（15 个）` | app/com/Z/T.java:1582-1596 | 导航/工具栏图标 | ✔ |
| `com/b/icons/*.png（4 个）` | app/com/b/{H,q,o,R}.java | folder/file/image/nonhidden | ✔ |
| `com/m/icons/{expand,collapse,root}.png` | app/com/m/K.java:1441-1448 | 树节点展开/折叠 | ✔ |
| `com/h/icons/c{1,2,3}.png` | app/com/h/c.java:678 | 树连接线 | ✔ |
| `com/icons/selection/selector{1..8}.9.png` | app/com/GA.java:2714 | 选择框控制柄（9-patch） | ✔ |
| `com/icons/component/{button,checkBox,label,panel,tabbedPane,table}.png` | app/com/KH.java:256 | 组件图标 | ✔ |
| `com/icons/types/*.png（11 个）` | app/com/PP.java:78 | 数据类型图标 | ✔ |
| `com/icons/textures/{alpha,darkLinen,graphy,linen}.png` | app/com/lt_2.java:49 | 背景纹理 | ✔ |
| `com/icons/styles/{dark,mac,web}.9.png` | app/com/nb_2.java:57 | Look & Feel 样式 | ✔ |
| `com/icons/lang/*.png（10 个）` | app/com/i2_0.java:966 | 语言旗标 | ✔ |
| `com/resources/icons.xml` | app/com/a9.java:948 | 图标映射表 | ✔ |
| `images/{folder-open,folder,screen,remove,filenew}.png` | app/LE.java:49-63, app/tv_0.java:63 | 图标（无前导斜杠写法） | ✔ |

### 4.3 FlatLaf / RSyntaxTextArea 侧

| 资源路径 | 加载点 | 用途 | 状态 |
|---|---|---|---|
| `com/formdev/flatlaf/demo/intellijthemes/themes.json` | `dec-all/.../IJThemesManager.java:38` | IntelliJ 主题目录 | ✔ |
| `com/formdev/flatlaf/intellijthemes/themes/` | `dec-all/.../IJThemesPanel.java:511,577,586` | `.theme.json` + `.LICENSE.txt` | ✔ |
| `com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/` | `dec-all/.../materialthemeuilite/Utils.java:29` | Material Theme UI Lite | ✔ |
| `com/formdev/flatlaf/demo/icons/intellij-showWriteAccess.png` | `dec-all/.../MoreComponentsPanel.java:289` | 演示图标 | ✔ |

## 5. 代码引用了但 jar 里没有的资源

### 5.1 真正缺失（可能导致运行时 NPE）

| 路径 | 加载点 | 说明 |
|---|---|---|
| `/sk` | `app/D4.java:271`, `app/d5_0.java:278` | **DES 密钥材料**（`getResourceAsStream("/sk")` → `DataInputStream.readFully` → `DESKeySpec`）。jar 内无此条目；`lib-run/bcprov.jar` 内也无；安装目录 `C:\Users\李超\AppData\Local\finalshell\` 下也无。**该资源缺失会让 `D4.B()` / `d5_0` 的密钥初始化抛 NPE**。推测是 SCL（加固/改名）构建在打包时剥离，或由原生启动器 `finalshell.exe` 在运行时注入 classpath。移植时需要单独补齐这 8 字节密钥。 |

### 5.2 外部数据（预期不在 classpath，属正常）

| 路径 | 加载点 | 说明 |
|---|---|---|
| `/qqwry.dat` | `app/wi_0.java:310` | IP 地理库，运行时数据目录 |
| `/about.html` | `app/ug_0.java:35` | 通过 `URLClassLoader.findResource` + 包名拼路径加载 |
| `/cilin.db.gz` | `app/lr_0.java:51` | 词库 gzip 包，包相对路径 |
| `/F02-GB2312-to-PuTongHua-PinYin.txt` | `app/D5.java:23` | GB2312→拼音表，包相对路径 |
| `com/SkyColors.png` | `app/com/hw_1.java:98` | 天空渐变色，代码有 null 保护（可选） |
| `org.codehaus.commons.compiler.properties` | `app/org/Z.java:48` | ECJ 编译器配置，随 ecj 库分发 |
| `java/lang/Object.class` | `app/org/V/w_1.java:513`, `app/org/y/k.java:529` | 类加载探针，由 JDK 提供 |

> 运行时数据（非 classpath）：`knownhosts.json`、`config.json`、`tconfig.json`、`ipdata.dat`、`fileattribute.json`、`deletions.json`、`*_connect_config.json`、`acce.json` 等，全部位于 `C:\Users\李超\AppData\Local\finalshell\`。

### 5.3 交叉核对结论

把代码里出现的**每一个具体资源路径**（把 §4 中的模板前缀展开成实际文件名）逐一拿本目录比对：

| 结果 | 数量 |
|---|---:|
| 在本 resources 目录中找到 | **231** |
| 缺失 | **0** |

说明：

- 231 是**展开后的具体路径**数（一个前缀 `/resources/font/` 展开成 22 个 ttf，等等），
  比 §4 表中的“不同资源种类”数更多。
- 代码里另有约 11 条**动态拼接的路径模板**（`/images/`、`/resources/font/`、`/resources/theme/`、
  `com/icons/component/`、`com/icons/types/`、`com/icons/selection/selector<N>.9.png` 等），
  其**所有可能的具体取值**均已确认存在。
- 唯一缺失项是 `/sk`（§5.1），它是单独排查出来的，不在这 231 条之内。

## 6. 外置依赖：bcprov.jar（BouncyCastle）

原始 jar 的 `META-INF/MANIFEST.MF` 声明：

```
Main-Class: st
Class-Path: lib-run/bcprov.jar
```

**`bcprov.jar` 不在 `finalshell.jar` 内部**，必须外置。检查结果：

| 项 | 值 |
|---|---|
| 路径 | `C:\Users\李超\AppData\Local\finalshell\lib-run\bcprov.jar` |
| 是否存在 | **✔ 存在** |
| 大小 | 8,324,412 字节 (≈7.9 MB) |
| SHA256 | `add5915e6acfc6ab5836e1fd8a5e21c6488536a8c1f21f386eeb3bf280b702d7` |
| 内容 | 5,371 个条目：`org/bouncycastle/**` 4,250 + `META-INF/**` 1,121（含签名 `BC2048KE.SF` / `BC2048KE.DSA`） |
| 用途 | BouncyCastle 加密库（FinalShell 用于 SSH/SFTP 加密相关） |

**同目录（`lib-run/`）下的其它 jar：无。** `lib-run/` 里只有 `bcprov.jar` 一个文件。

安装目录下总共只有 2 个 jar：

| jar | 大小 |
|---|---:|
| `C:\Users\李超\AppData\Local\finalshell\finalshell.jar` | 49,174,505 字节（与本项目源 jar 同一文件） |
| `C:\Users\李超\AppData\Local\finalshell\lib-run\bcprov.jar` | 8,324,412 字节 |

> `finalshell.jar`（安装目录）与 `D:\chat_work\finalshell-teardown\finalshell.jar` **大小完全一致（49,174,505 字节，20,338 个条目，resources/theme 125 个条目含目录项）**，是同一份文件。

### 移植建议

要跑起一个可运行的构建，还需要：

1. 把 `bcprov.jar` 放到运行目录的 `lib-run/` 下（Maven 项目则作为 `system` 作用域依赖，或直接 shade 进来）。
2. 补齐缺失的 `/sk` DES 密钥资源（见 §5.1）。
3. `Main-Class: st` 对应的 **`st.class` 确实存在**于 jar 根目录，且是**未被改名的正常 class**，
   所以入口类本身是完整的。被改名的 789 个类全部是 Lombok/ASM 编译期工具，运行时用不到。
4. 其余 17,373 个业务 `.class` 需要反编译/重编译为可构建的源码（见 `app/` 下的 CFR 反编译产物）。

## 7. Windows 大小写目录合并（重要注意事项）

jar 内存在**仅大小写不同**的目录，Windows 文件系统大小写不敏感，会被合并为一个目录：

| jar 中的目录 | 文件数 | 合并情况 |
|---|---:|---|
| `com/C/` 与 `com/c/` | 5 + 4 = 9 | 合并为磁盘上的 `com/C/`（含 `icons/` 与 `resources/` 两个子目录） |
| `com/T/icons/` 与 `com/t/icons/` | 4 + 4 = 8 | 合并为磁盘上的 `com/T/icons/`（8 个 png） |

**影响：无数据丢失。** 合并目录下的 13 个文件全部落盘并通过逐字节校验；
`getResource` 在 Windows 上同样大小写不敏感，因此运行期取用不受影响。
但在 **Linux/macOS（大小写敏感）** 上构建或运行时，必须把两套目录分开存放，否则会丢文件。

> **完整无歧义的还原方式**：直接把 jar 里的 `resources/` 条目按原始大小写解压，或用 `java -jar` / `mvn` 从原始 jar 复制资源，而不是从本 Windows 目录反向拷贝。

## 8. 提取与校验脚本

临时脚本（按要求放在源材料目录，未写入项目源码目录）：

```
D:\chat_work\finalshell-teardown\_tmp_res\
  survey.py     # jar 结构摸底（class / 资源分类统计）
  detail.py     # 逐条目清单（分组、字节数）
  extract.py    # 主提取脚本（magic-byte 判别 + 落盘）
  verify.py     # 逐字节完整性校验 + 分类/类型统计
  collide.py    # 大小写目录冲突分析
  crosscheck.py # 代码引用路径交叉核对
```

核心判别逻辑（`extract.py`）：

```python
data = z.read(info)
if data[:4] == b"\xca\xfe\xba\xbe":   # class 文件（含被改名成 *.SCL.lombok 的）
    continue
target = out / info.filename            # 保持 jar 内原始相对路径
target.parent.mkdir(parents=True, exist_ok=True)
target.write_bytes(data)
```
