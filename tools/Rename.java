import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * Applies the proposed names from Analyze to the application tree.
 *
 * Only identifiers are rewritten: string/char literals and comments are copied
 * verbatim, so decrypted UI text is never corrupted. Every file also gets a
 * one-line header describing the role evidence, which keeps even the classes
 * that could not be renamed navigable.
 *
 * Usage: java Rename <appDir> <candidates.tsv> <outDir> <mapping.tsv>
 */
public class Rename {
    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        Path cand = Paths.get(args[1]);
        Path outRoot = Paths.get(args[2]);
        Path mapOut = Paths.get(args[3]);

        Map<String, String> rename = new LinkedHashMap<>();
        Map<String, String> evidence = new LinkedHashMap<>();
        Set<String> used = new HashSet<>();

        List<String[]> rows = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(cand, StandardCharsets.UTF_8)) {
            String line = r.readLine(); // header
            while ((line = r.readLine()) != null) {
                String[] f = line.split("\t", -1);
                if (f.length < 7) continue;
                rows.add(f);
            }
        }

        // deterministic order: proposed name, then path
        rows.sort(Comparator.comparing((String[] f) -> f[6].isEmpty() ? "\uffff" + f[1] : f[6])
                            .thenComparing(f -> f[0]));

        for (String[] f : rows) {
            String path = f[0], name = f[1], proposed = f[6];
            if (proposed.isEmpty()) continue;
            String candidate = proposed;
            int n = 2;
            while (!used.add(candidate)) candidate = proposed + n++;
            rename.put(name, candidate);
            evidence.put(name, String.format("%s%s%s%s%s",
                    f[2], f[3].isEmpty() ? "" : " extends " + f[3],
                    f[4].isEmpty() ? "" : " implements " + f[4],
                    f[5].isEmpty() ? "" : " | title=\"" + f[5] + "\"",
                    candidate.equals(name) ? "" : " | renamed from " + name));
        }

        List<Path> files;
        try (Stream<Path> s = Files.walk(root)) {
            files = s.filter(p -> p.toString().endsWith(".java")).collect(Collectors.toList());
        }

        int rewritten = 0, renamedFiles = 0;
        for (Path p : files) {
            String rel = root.relativize(p).toString();
            String text;
            try { text = new String(Files.readAllBytes(p), StandardCharsets.UTF_8); } catch (Throwable t) { continue; }

            String fileName = p.getFileName().toString();
            String orig = fileName.substring(0, fileName.length() - 5);
            String mapped = rename.get(orig);
            String newText = substitute(text, rename);

            String header = (mapped != null
                    ? "// [named] " + mapped + " (was " + orig + ")"
                    : "// [obf] " + orig)
                    + " — " + roleOf(text);
            String withHeader = header + "\n" + newText;

            String outName = (mapped != null ? mapped : orig) + ".java";
            Path dest = outRoot.resolve(rel).resolveSibling(outName);
            Files.createDirectories(dest.getParent());
            Files.write(dest, withHeader.getBytes(StandardCharsets.UTF_8));
            if (mapped != null && !mapped.equals(orig)) { rewritten++; renamedFiles++; }
        }

        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(mapOut, StandardCharsets.UTF_8))) {
            w.println("original\tnew\tnote");
            for (Map.Entry<String, String> e : rename.entrySet()) {
                w.println(e.getKey() + "\t" + e.getValue() + "\t" + evidence.get(e.getKey()));
            }
        }
        System.out.println("RENAMED=" + rewritten + " MAPPING=" + rename.size() + " FILES=" + files.size());
    }

    static String roleOf(String text) {
        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("(?m)^\\s*(?:public\\s+|final\\s+|abstract\\s+)*(class|interface|enum)\\s+([A-Za-z_$][\\w$]*)")
                .matcher(text);
        if (!m.find()) return "?";
        String head = text.substring(m.end(), Math.min(text.length(), m.end() + 220));
        StringBuilder sb = new StringBuilder(m.group(1));

        java.util.regex.Matcher e = java.util.regex.Pattern
                .compile("extends\\s+([A-Za-z_$][\\w$.]*)").matcher(head);
        if (e.find()) sb.append(" extends ").append(e.group(1));

        java.util.regex.Matcher i = java.util.regex.Pattern
                .compile("implements\\s+([A-Za-z_$][\\w$.,\\s]*)").matcher(head);
        if (i.find()) {
            String impl = i.group(1).split("\\{")[0].replaceAll("\\s+", " ").trim();
            if (!impl.isEmpty()) sb.append(" implements ").append(impl);
        }

        java.util.regex.Matcher t = java.util.regex.Pattern
                .compile("setTitle\\(\\s*\"([^\"]{1,40})\"").matcher(text);
        if (t.find()) sb.append("  title=\"").append(t.group(1)).append('"');

        return sb.toString();
    }

    /** Replaces identifiers outside literals and comments. */
    static String substitute(String s, Map<String, String> rename) {
        if (rename.isEmpty()) return s;
        StringBuilder out = new StringBuilder(s.length() + 64);
        int i = 0, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '"' || c == '\'') {
                char q = c;
                out.append(c); i++;
                while (i < n) {
                    char d = s.charAt(i);
                    out.append(d);
                    if (d == '\\' && i + 1 < n) { out.append(s.charAt(i + 1)); i += 2; continue; }
                    i++;
                    if (d == q) break;
                }
                continue;
            }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '/') {
                int e = s.indexOf('\n', i);
                if (e < 0) e = n;
                out.append(s, i, e); i = e; continue;
            }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {
                int e = s.indexOf("*/", i + 2);
                e = (e < 0) ? n : e + 2;
                out.append(s, i, e); i = e; continue;
            }
            if (Character.isJavaIdentifierStart(c)) {
                int j = i + 1;
                while (j < n && Character.isJavaIdentifierPart(s.charAt(j))) j++;
                String id = s.substring(i, j);
                String rep = rename.get(id);
                out.append(rep != null ? rep : id);
                i = j;
                continue;
            }
            out.append(c); i++;
        }
        return out.toString();
    }
}
