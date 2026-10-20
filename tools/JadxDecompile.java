import jadx.api.JadxArgs;
import jadx.api.JadxDecompiler;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;
import java.util.List;

/**
 * 用 JADX 批量反编译整个 jar。
 *
 * 关键选项：
 *   setShowInconsistentCode(true)  —— JADX 默认会拒绝输出"反编译不可靠"的类，
 *                                     开启后强制输出，这是它比 CFR 覆盖更全的原因。
 *   setDeobfuscationOn(true)        —— JADX 内置的混淆改名通道。
 *   setGeneratedRenamesMappingFile  —— 导出改名映射表，供命名任务复用。
 *
 * 用法: java JadxDecompile <input.jar> <outDir> [threads] [deobf]
 */
public class JadxDecompile {
    public static void main(String[] args) throws Exception {
        File input = new File(args[0]);
        Path out = Paths.get(args[1]);
        int threads = args.length > 2 ? Integer.parseInt(args[2]) : 8;
        boolean deobf = args.length > 3 && "deobf".equals(args[3]);
        Files.createDirectories(out);

        JadxArgs ja = new JadxArgs();
        ja.setInputFile(input);
        ja.setOutDir(out.toFile());
        ja.setThreadsCount(threads);
        ja.setShowInconsistentCode(true);   // 强制输出反编译不可靠的类
        ja.setSkipResources(true);
        ja.setEscapeUnicode(false);
        ja.setDebugInfo(false);
        ja.setCommentsLevel(jadx.api.CommentsLevel.WARN);
        ja.setDeobfuscationOn(deobf);
        if (deobf) {
            ja.setDeobfuscationForceSave(true);
            ja.setGeneratedRenamesMappingFile(new File(out.toFile(), "renames.txt"));
            ja.setRenameFlags(EnumSet.of(JadxArgs.RenameEnum.VALID,
                                         JadxArgs.RenameEnum.PRINTABLE,
                                         JadxArgs.RenameEnum.CASE));
        }

        long t0 = System.currentTimeMillis();
        try (JadxDecompiler jadx = new JadxDecompiler(ja)) {
            jadx.load();
            System.out.println("loaded in " + (System.currentTimeMillis() - t0) / 1000 + "s"
                               + "  classes=" + jadx.getClasses().size()
                               + "  errors=" + jadx.getErrorsCount());
            long t1 = System.currentTimeMillis();
            jadx.save();
            System.out.println("saved in " + (System.currentTimeMillis() - t1) / 1000 + "s");
            List<jadx.api.JavaClass> all = jadx.getClasses();
            System.out.println("classes total=" + all.size());
        }
        System.out.println("total " + (System.currentTimeMillis() - t0) / 1000 + "s -> " + out);
    }
}
