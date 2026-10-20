/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class mG {
    public static void main(String[] stringArray) throws Exception {
        SortedMap<String, Charset> sortedMap = Charset.availableCharsets();
        Set<String> set = sortedMap.keySet();
        ky_2[] ky_2Array = yt_1.c();
        for (String string : set) {
            Charset charset = (Charset)sortedMap.get(string);
            System.out.println(charset.name());
            Set<String> set2 = charset.aliases();
            if (ky_2Array != null) continue;
        }
    }
}

