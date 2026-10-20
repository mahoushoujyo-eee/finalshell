import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/**
 * Harvests string-decryptor call sites, keyed by the class that OWNS the
 * decryptor (not the calling file), because calls may be qualified with
 * another class's name.
 *
 * Outputs:
 *   <pairs.tsv>  <realName> \t <idx> \t <n> \t <n2>
 *   <ident.tsv>  <decompiledName> \t <realName> \t <idx>
 */
public class Harvest {
    private static final Pattern DECL = Pattern.compile(
            "(?m)^\\s*(?:private|public|protected)?\\s*static\\s+String\\s+([A-Za-z_$][\\w$]*)\\s*\\(\\s*int\\s+\\w+\\s*,\\s*int\\s+\\w+\\s*\\)");
    private static final Pattern RENAMED = Pattern.compile("/\\*[*\\s]*Renamed from\\s+(\\S+)");

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        Path pairsOut = Paths.get(args[1]);
        Path identOut = Paths.get(args[2]);

        List<Path> files;
        try (Stream<Path> s = Files.walk(root)) {
            files = s.filter(p -> p.toString().endsWith(".java")).collect(Collectors.toList());
        }

        Map<String, String[]> ident = new LinkedHashMap<>();   // decomp -> {real, idx}
        Map<String, String> text = new LinkedHashMap<>();
        for (Path p : files) {
            String rel = root.relativize(p).toString().replace('\\', '/');
            String cls = rel.substring(0, rel.length() - 5);
            String t;
            try { t = new String(Files.readAllBytes(p), StandardCharsets.UTF_8); }
            catch (Throwable e) { continue; }
            text.put(cls, t);
            Matcher rm = RENAMED.matcher(t);
            String real = cls;
            int idx = 0;
            if (rm.find()) {
                real = rm.group(1);
                int us = cls.lastIndexOf('_');
                if (us > 0) {
                    try { idx = Integer.parseInt(cls.substring(us + 1)) + 1; }
                    catch (NumberFormatException ignored) { }
                }
            }
            ident.put(cls, new String[]{real, String.valueOf(idx)});
        }

        Set<String> pairs = new LinkedHashSet<>();
        for (Map.Entry<String, String> ent : text.entrySet()) {
            String cls = ent.getKey();
            String body = ent.getValue();
            Set<String> names = new LinkedHashSet<>();
            Matcher d = DECL.matcher(body);
            while (d.find()) names.add(d.group(1));
            if (names.isEmpty()) continue;

            body = body.replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("(?m)//.*$", "");
            // group the alternation, otherwise '|' would split the whole pattern
            StringBuilder alt = new StringBuilder();
            for (String n : names) {
                if (alt.length() > 0) alt.append('|');
                alt.append(Pattern.quote(n));
            }
            Pattern call = Pattern.compile(
                    "(?<![\\w$.])(?:([A-Za-z_$][\\w$]*)\\.)?(?:" + alt + ")\\(\\s*(-?\\d+)\\s*,\\s*(-?\\d+)\\s*\\)");
            Matcher m = call.matcher(body);
            while (m.find()) {
                String qual = m.group(1);
                String owner = (qual == null) ? cls : qual;
                String[] id = ident.get(owner);
                if (id == null) id = new String[]{owner, "0"};
                pairs.add(id[0] + "\t" + id[1] + "\t" + m.group(2) + "\t" + m.group(3));
            }
        }

        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(pairsOut, StandardCharsets.UTF_8))) {
            for (String s : pairs) w.println(s);
        }
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(identOut, StandardCharsets.UTF_8))) {
            for (Map.Entry<String, String[]> e : ident.entrySet())
                w.println(e.getKey() + "\t" + e.getValue()[0] + "\t" + e.getValue()[1]);
        }
        System.out.println("PAIRS=" + pairs.size() + " IDENT=" + ident.size());
    }
}
