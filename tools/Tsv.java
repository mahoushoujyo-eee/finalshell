import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/** TSV 读取辅助（跳过表头）。 */
public class Tsv {
    public static List<String[]> read(String path) throws IOException {
        return read(Paths.get(path));
    }

    public static List<String[]> read(Path path) throws IOException {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line; boolean first = true;
            while ((line = r.readLine()) != null) {
                if (first) { first = false; continue; }
                if (line.isEmpty()) continue;
                rows.add(line.split("\t", -1));
            }
        }
        return rows;
    }
}
