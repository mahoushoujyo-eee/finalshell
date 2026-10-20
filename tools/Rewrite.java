import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/**
 * Rewrites decompiled sources, replacing decryptor call sites such as
 * `x.a(12345, -678)` with the decrypted literal.
 *
 * The decryptor owner is resolved through ident.tsv, so calls qualified with
 * another (possibly renamed) class still map to the right string table.
 *
 * Usage: java Rewrite <decompiledDir> <strings.tsv> <ident.tsv> <outDir>
 */
public class Rewrite {
    private static final Pattern DECL = Pattern.compile(
            "(?m)^\\s*(?:private|public|protected)?\\s*static\\s+String\\s+([A-Za-z_$][\\w$]*)\\s*\\(\\s*int\\s+\\w+\\s*,\\s*int\\s+\\w+\\s*\\)");

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        Path mapFile = Paths.get(args[1]);
        Path identFile = Paths.get(args[2]);
        Path outRoot = Paths.get(args[3]);

        Map<String, String> ident = new HashMap<>();
        try (BufferedReader r = Files.newBufferedReader(identFile, StandardCharsets.UTF_8)) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] f = line.split("\t");
                if (f.length >= 3) ident.put(f[0], f[1] + "\t" + f[2]);
            }
        }

        Map<String, String> values = new HashMap<>();
        try (BufferedReader r = Files.newBufferedReader(mapFile, StandardCharsets.UTF_8)) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] f = line.split("\t", 5);
                if (f.length < 5) continue;
                if (f[4].startsWith("\\u0000ERR")) continue;
                values.put(f[0] + "\t" + f[1] + "\t" + f[2] + "\t" + f[3], unescape(f[4]));
            }
        }

        List<Path> files;
        try (Stream<Path> s = Files.walk(root)) {
            files = s.filter(p -> p.toString().endsWith(".java")).collect(Collectors.toList());
        }

        int replaced = 0, changed = 0, unresolved = 0;
        for (Path p : files) {
            String rel = root.relativize(p).toString();
            String cls = rel.replace('\\', '/');
            cls = cls.substring(0, cls.length() - 5);
            String text;
            try { text = new String(Files.readAllBytes(p), StandardCharsets.UTF_8); }
            catch (Throwable t) { continue; }

            Set<String> names = new LinkedHashSet<>();
            Matcher d = DECL.matcher(text);
            while (d.find()) names.add(d.group(1));

            String outText = text;
            if (!names.isEmpty()) {
                StringBuilder alt = new StringBuilder();
                for (String n : names) {
                    if (alt.length() > 0) alt.append('|');
                    alt.append(Pattern.quote(n));
                }
                Pattern call = Pattern.compile(
                        "(?<![\\w$.])(?:([A-Za-z_$][\\w$]*)\\.)?(?:" + alt + ")\\(\\s*(-?\\d+)\\s*,\\s*(-?\\d+)\\s*\\)");
                Matcher m = call.matcher(text);
                StringBuilder sb = new StringBuilder(text.length());
                int hits = 0;
                while (m.find()) {
                    String qual = m.group(1);
                    String owner = (qual == null) ? cls : qual;
                    String id = ident.get(owner);
                    if (id == null) id = owner + "\t0";
                    String val = values.get(id + "\t" + m.group(2) + "\t" + m.group(3));
                    if (val == null) { unresolved++; continue; }
                    m.appendReplacement(sb, Matcher.quoteReplacement(quote(val)));
                    hits++;
                }
                m.appendTail(sb);
                if (hits > 0) { outText = sb.toString(); replaced += hits; changed++; }
            }

            Path dest = outRoot.resolve(rel);
            Files.createDirectories(dest.getParent());
            Files.write(dest, outText.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("REPLACED=" + replaced + " FILES_CHANGED=" + changed + " UNRESOLVED=" + unresolved);
    }

    private static String quote(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 8);
        sb.append('"');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '\\': sb.append("\\\\"); break;
                case '"': sb.append("\\\""); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (ch < 0x20 || ch == 0x7f) sb.append(String.format("\\u%04x", (int) ch));
                    else sb.append(ch);
            }
        }
        sb.append('"');
        return sb.toString();
    }

    private static String unescape(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '\\' || i + 1 >= s.length()) { sb.append(ch); continue; }
            char nx = s.charAt(++i);
            switch (nx) {
                case 'n': sb.append('\n'); break;
                case 'r': sb.append('\r'); break;
                case 't': sb.append('\t'); break;
                case '\\': sb.append('\\'); break;
                case 'u':
                    sb.append((char) Integer.parseInt(s.substring(i + 1, i + 5), 16));
                    i += 4;
                    break;
                default: sb.append(nx);
            }
        }
        return sb.toString();
    }
}
