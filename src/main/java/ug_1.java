/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uG
 */
public class ug_1 {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static String b(byte[] byArray) throws UnsupportedEncodingException {
        String string;
        try {
            string = (String)ug_1.m((Object)byArray, (Object)"UTF-8");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }

    public static String m(byte[] byArray, String string) throws UnsupportedEncodingException {
        byte[] byArray2;
        try {
            if (byArray == null) {
                throw new IllegalArgumentException("byteData cannot be null");
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw ug_1.a(unsupportedEncodingException);
        }
        try {
            byArray2 = (byte[])ug_1.y(byArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new String(byArray2, string);
    }

    public static byte[] m(String string) throws UnsupportedEncodingException {
        byte[] byArray;
        try {
            byArray = (byte[])ug_1.T((Object)string, (Object)"UTF-8");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return byArray;
    }

    public static byte[] T(String string, String string2) throws UnsupportedEncodingException {
        byte[] byArray;
        String string3;
        block6: {
            block7: {
                ky_2[] ky_2Array = yt_1.c();
                try {
                    try {
                        string3 = string;
                        if (ky_2Array == null) break block6;
                        if (string3 != null) break block7;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        throw ug_1.a(unsupportedEncodingException);
                    }
                    throw new IllegalArgumentException("string cannot be null");
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw ug_1.a(unsupportedEncodingException);
                }
            }
            string3 = string;
        }
        try {
            byArray = (byte[])ug_1.y(string3.getBytes(string2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return byArray;
    }

    public static final byte[] y(byte[] byArray) {
        int n10;
        int n11;
        byte[] byArray2;
        block24: {
            block25: {
                try {
                    if (byArray == null) {
                        throw new IllegalArgumentException("byteData cannot be null");
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ug_1.a(illegalArgumentException);
                }
                byArray2 = new byte[(byArray.length + 2) / 3 * 4];
                n11 = 0;
                try {
                    for (n10 = 0; n10 < byArray.length - 2; n10 += 3) {
                        byArray2[n11++] = (byte)(byArray[n10] >>> 2 & ug_1.a(20495, 7728393675197007344L));
                        byArray2[n11++] = (byte)(byArray[n10 + 1] >>> 4 & ug_1.a(18514, 2714167139887898047L) | byArray[n10] << 4 & ug_1.a(20495, 7728393675197007344L));
                        byArray2[n11++] = (byte)(byArray[n10 + 2] >>> ug_1.a(32361, 140816247956630407L) & 3 | byArray[n10 + 1] << 2 & ug_1.a(20495, 7728393675197007344L));
                        byArray2[n11++] = (byte)(byArray[n10 + 2] & ug_1.a(20495, 7728393675197007344L));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ug_1.a(illegalArgumentException);
                }
                try {
                    try {
                        if (n10 >= byArray.length) break block24;
                        byArray2[n11++] = (byte)(byArray[n10] >>> 2 & ug_1.a(20495, 7728393675197007344L));
                        if (n10 >= byArray.length - 1) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                    byArray2[n11++] = (byte)(byArray[n10 + 1] >>> 4 & ug_1.a(18514, 2714167139887898047L) | byArray[n10] << 4 & ug_1.a(20495, 7728393675197007344L));
                    byArray2[n11++] = (byte)(byArray[n10 + 1] << 2 & ug_1.a(20495, 7728393675197007344L));
                    break block24;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ug_1.a(illegalArgumentException);
                }
            }
            byArray2[n11++] = (byte)(byArray[n10] << 4 & ug_1.a(20495, 7728393675197007344L));
        }
        n10 = 0;
        while (true) {
            block27: {
                block29: {
                    block28: {
                        block26: {
                            try {
                                try {
                                    if (n10 >= n11) break;
                                    if (byArray2[n10] >= ug_1.a(7864, 2353247203453242191L)) break block26;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ug_1.a(illegalArgumentException);
                                }
                                byArray2[n10] = (byte)(byArray2[n10] + ug_1.a(22929, 1082033647094549608L));
                                break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ug_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (byArray2[n10] >= ug_1.a(15245, 3724237089118006893L)) break block28;
                            byArray2[n10] = (byte)(byArray2[n10] + ug_1.a(16640, 923691574437172466L) - ug_1.a(7864, 2353247203453242191L));
                            break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ug_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (byArray2[n10] >= ug_1.a(29184, 6364926714141272061L)) break block29;
                        byArray2[n10] = (byte)(byArray2[n10] + ug_1.a(31610, 4965871026626752143L) - ug_1.a(15245, 3724237089118006893L));
                        break block27;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                }
                try {
                    byArray2[n10] = byArray2[n10] < ug_1.a(20495, 7728393675197007344L) ? ug_1.a(26150, 7690100522563728348L) : ug_1.a(3947, 4155993044760894103L);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ug_1.a(illegalArgumentException);
                }
            }
            ++n10;
        }
        try {
            while (n10 < byArray2.length) {
                byArray2[n10] = ug_1.a(16632, 8237639005652997407L);
                ++n10;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ug_1.a(illegalArgumentException);
        }
        return byArray2;
    }

    public static String A(byte[] byArray) throws UnsupportedEncodingException {
        String string;
        try {
            string = (String)ug_1.T((Object)byArray, (Object)"UTF-8");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string;
    }

    public static String T(byte[] byArray, String string) throws UnsupportedEncodingException {
        byte[] byArray2;
        try {
            if (byArray == null) {
                throw new IllegalArgumentException("encoded cannot be null");
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw ug_1.a(unsupportedEncodingException);
        }
        try {
            byArray2 = (byte[])ug_1.a(byArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new String(byArray2, string);
    }

    public static final byte[] z(String string) throws UnsupportedEncodingException {
        byte[] byArray;
        try {
            byArray = (byte[])ug_1.Q((Object)string, (Object)"UTF-8");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return byArray;
    }

    public static final byte[] Q(String string, String string2) throws IllegalArgumentException, UnsupportedEncodingException {
        byte[] byArray;
        try {
            if (null == string) {
                throw new IllegalArgumentException("encoded cannot be null");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ug_1.a(illegalArgumentException);
        }
        try {
            byArray = (byte[])ug_1.a(string.getBytes(string2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return byArray;
    }

    public static final byte[] a(byte[] byArray) throws IllegalArgumentException {
        byte[] byArray2;
        block43: {
            block45: {
                int n10;
                int n11;
                byte[] byArray3;
                block44: {
                    try {
                        if (byArray == null) {
                            throw new IllegalArgumentException("byteData cannot be null");
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                    byArray3 = new byte[byArray.length];
                    n11 = byArray.length;
                    try {
                        while (true) {
                            try {
                                if (n11 - 1 <= 0 || byArray[n11 - 1] != ug_1.a(25552, 7417280936586835516L)) break;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ug_1.a(illegalArgumentException);
                            }
                            --n11;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                    try {
                        if (n11 - 1 == 0) {
                            return null;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                    byArray2 = new byte[n11 * 3 / 4];
                    n10 = 0;
                    while (true) {
                        block38: {
                            block41: {
                                block40: {
                                    block39: {
                                        block37: {
                                            try {
                                                try {
                                                    if (n10 >= n11) break;
                                                    if (byArray[n10] != ug_1.a(379, 4598926727279547539L)) break block37;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw ug_1.a(illegalArgumentException);
                                                }
                                                byArray3[n10] = ug_1.a(12361, 1802049856819013030L);
                                                break block38;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ug_1.a(illegalArgumentException);
                                            }
                                        }
                                        try {
                                            if (byArray[n10] != ug_1.a(1767, 4057845754015814423L)) break block39;
                                            byArray3[n10] = ug_1.a(1229, 8628496987728875836L);
                                            break block38;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ug_1.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (byArray[n10] >= ug_1.a(1968, 5631632304775074385L)) break block40;
                                        byArray3[n10] = (byte)(byArray[n10] + ug_1.a(13979, 8402528043082326880L) - ug_1.a(23727, 191057382257969483L));
                                        break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ug_1.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    if (byArray[n10] >= ug_1.a(13275, 8706490897599145521L)) break block41;
                                    byArray3[n10] = (byte)(byArray[n10] - ug_1.a(4290, 2712257214316807484L));
                                    break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ug_1.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (byArray[n10] < ug_1.a(30994, 2482355405535341798L)) {
                                    byArray3[n10] = (byte)(byArray[n10] + ug_1.a(8207, 669584802857629158L) - ug_1.a(17585, 5060610596214755657L));
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ug_1.a(illegalArgumentException);
                            }
                        }
                        ++n10;
                    }
                    n10 = 0;
                    int n12 = 0;
                    try {
                        while (true) {
                            try {
                                if (n10 >= n11 || n12 >= byArray2.length / 3 * 3) break;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ug_1.a(illegalArgumentException);
                            }
                            byArray2[n12++] = (byte)(byArray3[n10] << 2 & ug_1.a(15958, 8352261126998666164L) | byArray3[n10 + 1] >>> 4 & 3);
                            byArray2[n12++] = (byte)(byArray3[n10 + 1] << 4 & ug_1.a(7342, 2844307031840622920L) | byArray3[n10 + 2] >>> 2 & ug_1.a(6009, 8749724598822765210L));
                            byArray2[n12++] = (byte)(byArray3[n10 + 2] << ug_1.a(21880, 2607349405371646109L) & ug_1.a(27730, 1140709507026483641L) | byArray3[n10 + 3] & ug_1.a(20495, 7728393675197007344L));
                            n10 += 4;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (n10 >= n11) break block43;
                            if (n10 >= n11 - 2) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ug_1.a(illegalArgumentException);
                        }
                        byArray2[n12++] = (byte)(byArray3[n10] << 2 & ug_1.a(332, 5606542952620102847L) | byArray3[n10 + 1] >>> 4 & 3);
                        byArray2[n12++] = (byte)(byArray3[n10 + 1] << 4 & ug_1.a(21208, 212071242378561326L) | byArray3[n10 + 2] >>> 2 & ug_1.a(18514, 2714167139887898047L));
                        break block43;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ug_1.a(illegalArgumentException);
                    }
                }
                try {
                    if (n10 >= n11 - 1) break block45;
                    byArray2[n12++] = (byte)(byArray3[n10] << 2 & ug_1.a(332, 5606542952620102847L) | byArray3[n10 + 1] >>> 4 & 3);
                    break block43;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ug_1.a(illegalArgumentException);
                }
            }
            throw new IllegalArgumentException("Warning: 1 input bytes left to process. This was not Base64 input");
        }
        return byArray2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[8];
                        var11_1 = 0;
                        var10_2 = "?\u00ca\u00c9\u008e\u00ff\u0091\u00a2a\u00c9v\u0098\u00d7\u00d8\u00d3\u00b3\u009f\u009aV%\u0085\u0010\u0000\u00f2\u00053)\u00ab2\u00bb\u00161\u0000\u00f8(\f\n\u00e8\u00d7\u00d1\u00cb\u00bf\"\u00d3v\u00a7\u0011\u00c1\u00c8\u00e7\u00a0\u00d6\u00dc\u0017\n\u0007o7+\u00a68\u0087\u009a\u00aa\u00f2L\u0095\u00a0\u001a\u00f1\u00af\u009b\u0083<\u00c47h\u0016\u008c4O\u00ae\u00fa\u00da6\u00cd\n\u0088\u00c4J\u00bc{J\u00b0|\u00fcP& \f\u0005\u00c0\u000e\u00d5\u00d6t";
                        var12_3 = "?\u00ca\u00c9\u008e\u00ff\u0091\u00a2a\u00c9v\u0098\u00d7\u00d8\u00d3\u00b3\u009f\u009aV%\u0085\u0010\u0000\u00f2\u00053)\u00ab2\u00bb\u00161\u0000\u00f8(\f\n\u00e8\u00d7\u00d1\u00cb\u00bf\"\u00d3v\u00a7\u0011\u00c1\u00c8\u00e7\u00a0\u00d6\u00dc\u0017\n\u0007o7+\u00a68\u0087\u009a\u00aa\u00f2L\u0095\u00a0\u001a\u00f1\u00af\u009b\u0083<\u00c47h\u0016\u008c4O\u00ae\u00fa\u00da6\u00cd\n\u0088\u00c4J\u00bc{J\u00b0|\u00fcP& \f\u0005\u00c0\u000e\u00d5\u00d6t".length();
                        var9_4 = 23;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 46;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00f6\u00a5\u009c\u009a\u00e0\u00c1#\u00f6?\u0092y\u00bfI\u00e9\u0097b\u00d1VJ\u00b4BA\u0082\u0019\u00b2\u00bd\"\u00cb\u00db\u00c6\u00ce\u00b9`h\u00f7\u0085\u000e\u00a4\u0017\u00b1\u009e\u00dd\\\u0014|\u00des}b\u0099\u00e4fk\u0083\u001a\u00d0\u00a0\u00dbv\u00ec@\u0081\u0006\u00c0Q\u0010c\u00d5\b\u00e1\u00d0iO\u00d7\u00f6c*\u00a9K\u0000\u00b9m\u00cdV1:2";
                            var12_3 = "\u00f6\u00a5\u009c\u009a\u00e0\u00c1#\u00f6?\u0092y\u00bfI\u00e9\u0097b\u00d1VJ\u00b4BA\u0082\u0019\u00b2\u00bd\"\u00cb\u00db\u00c6\u00ce\u00b9`h\u00f7\u0085\u000e\u00a4\u0017\u00b1\u009e\u00dd\\\u0014|\u00des}b\u0099\u00e4fk\u0083\u001a\u00d0\u00a0\u00dbv\u00ec@\u0081\u0006\u00c0Q\u0010c\u00d5\b\u00e1\u00d0iO\u00d7\u00f6c*\u00a9K\u0000\u00b9m\u00cdV1:2".length();
                            var9_4 = 21;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 52;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 92;
                                    break;
                                }
                                case 1: {
                                    v15 = 41;
                                    break;
                                }
                                case 2: {
                                    v15 = 20;
                                    break;
                                }
                                case 3: {
                                    v15 = 42;
                                    break;
                                }
                                case 4: {
                                    v15 = 17;
                                    break;
                                }
                                case 5: {
                                    v15 = 70;
                                    break;
                                }
                                default: {
                                    v15 = 44;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                ug_1.a = var13;
                ug_1.b = new String[8];
                var0_7 = 7845782360522453701L;
                var6_8 = new long[32];
                var3_9 = 0;
                var4_10 = "\u00f2_K\u0097\u0099\u008a\u009czFS\u0002\u00b9.\u00c3\u001eX\u0013\u00e1c\u0015\u00f9ty\u0090q\u007f\u0015\u000f*\u00fb\u00b5\u001b/\u00c5\u00fbT\u009c\u00ec\u00e3\u00c6\u0082\u0005|\u00dc6\u0087\u00e1\u00fd\u0018D\u00a7\u00ef\u00a3\u0013f\u0086j\u00b1\u0012\u00ff'\u00ae&V\u00df\u00f2|\u00e6^?\u0095\u0006\u00a1\u00cco\u0085V\u0000\u00e8}\u0092\u000b\u00ad\u00059\u00897\n\u00d3P\u00b9\u00b9\u0001/w\u00b8c\u0012\u0006\u00aeu\u00e0>\u00ec\u00d1\u00ca\u0010\u00f2\u0092\u0002#\u00ed\u00d0\u00f9P\u009e`\u00d9Q\u0091\u00f5\u00adgU\u0099\u0083\u00812\u00b0\u009f\u0099`\u00bfw\u00b2^\u0088Km\u00d2\u00be\u00c4\u00bb\u00be\u009ea\u00c8\u0016(.'\u00e76\u00c2\u001eC\u000e\u00f6\u00fb}8\u00b5\u001eb\u00a0L\u00e0\u00ae\u00c2\u00e7\u0002\u00d0c\u00c1\u00dc\u009c\u0095\f\u008co\u00d4\u00a3pP\u0011B\u00a0\u0005\u00dd\u00f8Y\u008dXt\u00fd~\u00dd\u00f9/u\u00c6>\b\u00b6W\u007f\u0084\u00c4\u00e4\u008d1\u009c\u00f8\u00ca\u00d7]\u00beZr\u009cQ\u00f9\u0099DT\u008cf|V\u00a3G9v\u00c8\u00b3\u0081\u00f0{f}";
                var5_11 = "\u00f2_K\u0097\u0099\u008a\u009czFS\u0002\u00b9.\u00c3\u001eX\u0013\u00e1c\u0015\u00f9ty\u0090q\u007f\u0015\u000f*\u00fb\u00b5\u001b/\u00c5\u00fbT\u009c\u00ec\u00e3\u00c6\u0082\u0005|\u00dc6\u0087\u00e1\u00fd\u0018D\u00a7\u00ef\u00a3\u0013f\u0086j\u00b1\u0012\u00ff'\u00ae&V\u00df\u00f2|\u00e6^?\u0095\u0006\u00a1\u00cco\u0085V\u0000\u00e8}\u0092\u000b\u00ad\u00059\u00897\n\u00d3P\u00b9\u00b9\u0001/w\u00b8c\u0012\u0006\u00aeu\u00e0>\u00ec\u00d1\u00ca\u0010\u00f2\u0092\u0002#\u00ed\u00d0\u00f9P\u009e`\u00d9Q\u0091\u00f5\u00adgU\u0099\u0083\u00812\u00b0\u009f\u0099`\u00bfw\u00b2^\u0088Km\u00d2\u00be\u00c4\u00bb\u00be\u009ea\u00c8\u0016(.'\u00e76\u00c2\u001eC\u000e\u00f6\u00fb}8\u00b5\u001eb\u00a0L\u00e0\u00ae\u00c2\u00e7\u0002\u00d0c\u00c1\u00dc\u009c\u0095\f\u008co\u00d4\u00a3pP\u0011B\u00a0\u0005\u00dd\u00f8Y\u008dXt\u00fd~\u00dd\u00f9/u\u00c6>\b\u00b6W\u007f\u0084\u00c4\u00e4\u008d1\u009c\u00f8\u00ca\u00d7]\u00beZr\u009cQ\u00f9\u0099DT\u008cf|V\u00a3G9v\u00c8\u00b3\u0081\u00f0{f}".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0001I|\u00bcI\u00ce\u000b\u00bc\u00a1B{7Pf\u00d4\u00af";
                    var5_11 = "\u0001I|\u00bcI\u00ce\u000b\u00bc\u00a1B{7Pf\u00d4\u00af".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        ug_1.c = var6_8;
        ug_1.d = new Integer[32];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD1E6) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 133;
                    break;
                }
                case 1: {
                    n14 = 213;
                    break;
                }
                case 2: {
                    n14 = 13;
                    break;
                }
                case 3: {
                    n14 = 22;
                    break;
                }
                case 4: {
                    n14 = 208;
                    break;
                }
                case 5: {
                    n14 = 47;
                    break;
                }
                case 6: {
                    n14 = 254;
                    break;
                }
                case 7: {
                    n14 = 96;
                    break;
                }
                case 8: {
                    n14 = 85;
                    break;
                }
                case 9: {
                    n14 = 103;
                    break;
                }
                case 10: {
                    n14 = 40;
                    break;
                }
                case 11: {
                    n14 = 232;
                    break;
                }
                case 12: {
                    n14 = 182;
                    break;
                }
                case 13: {
                    n14 = 37;
                    break;
                }
                case 14: {
                    n14 = 227;
                    break;
                }
                case 15: {
                    n14 = 136;
                    break;
                }
                case 16: {
                    n14 = 15;
                    break;
                }
                case 17: {
                    n14 = 114;
                    break;
                }
                case 18: {
                    n14 = 53;
                    break;
                }
                case 19: {
                    n14 = 229;
                    break;
                }
                case 20: {
                    n14 = 88;
                    break;
                }
                case 21: {
                    n14 = 72;
                    break;
                }
                case 22: {
                    n14 = 0;
                    break;
                }
                case 23: {
                    n14 = 4;
                    break;
                }
                case 24: {
                    n14 = 35;
                    break;
                }
                case 25: {
                    n14 = 63;
                    break;
                }
                case 26: {
                    n14 = 187;
                    break;
                }
                case 27: {
                    n14 = 94;
                    break;
                }
                case 28: {
                    n14 = 209;
                    break;
                }
                case 29: {
                    n14 = 245;
                    break;
                }
                case 30: {
                    n14 = 203;
                    break;
                }
                case 31: {
                    n14 = 59;
                    break;
                }
                case 32: {
                    n14 = 186;
                    break;
                }
                case 33: {
                    n14 = 253;
                    break;
                }
                case 34: {
                    n14 = 126;
                    break;
                }
                case 35: {
                    n14 = 20;
                    break;
                }
                case 36: {
                    n14 = 188;
                    break;
                }
                case 37: {
                    n14 = 214;
                    break;
                }
                case 38: {
                    n14 = 181;
                    break;
                }
                case 39: {
                    n14 = 102;
                    break;
                }
                case 40: {
                    n14 = 197;
                    break;
                }
                case 41: {
                    n14 = 183;
                    break;
                }
                case 42: {
                    n14 = 215;
                    break;
                }
                case 43: {
                    n14 = 97;
                    break;
                }
                case 44: {
                    n14 = 144;
                    break;
                }
                case 45: {
                    n14 = 41;
                    break;
                }
                case 46: {
                    n14 = 219;
                    break;
                }
                case 47: {
                    n14 = 199;
                    break;
                }
                case 48: {
                    n14 = 67;
                    break;
                }
                case 49: {
                    n14 = 34;
                    break;
                }
                case 50: {
                    n14 = 129;
                    break;
                }
                case 51: {
                    n14 = 8;
                    break;
                }
                case 52: {
                    n14 = 169;
                    break;
                }
                case 53: {
                    n14 = 68;
                    break;
                }
                case 54: {
                    n14 = 166;
                    break;
                }
                case 55: {
                    n14 = 174;
                    break;
                }
                case 56: {
                    n14 = 112;
                    break;
                }
                case 57: {
                    n14 = 38;
                    break;
                }
                case 58: {
                    n14 = 210;
                    break;
                }
                case 59: {
                    n14 = 201;
                    break;
                }
                case 60: {
                    n14 = 82;
                    break;
                }
                case 61: {
                    n14 = 100;
                    break;
                }
                case 62: {
                    n14 = 218;
                    break;
                }
                case 63: {
                    n14 = 17;
                    break;
                }
                case 64: {
                    n14 = 56;
                    break;
                }
                case 65: {
                    n14 = 205;
                    break;
                }
                case 66: {
                    n14 = 138;
                    break;
                }
                case 67: {
                    n14 = 61;
                    break;
                }
                case 68: {
                    n14 = 86;
                    break;
                }
                case 69: {
                    n14 = 151;
                    break;
                }
                case 70: {
                    n14 = 242;
                    break;
                }
                case 71: {
                    n14 = 128;
                    break;
                }
                case 72: {
                    n14 = 238;
                    break;
                }
                case 73: {
                    n14 = 143;
                    break;
                }
                case 74: {
                    n14 = 71;
                    break;
                }
                case 75: {
                    n14 = 255;
                    break;
                }
                case 76: {
                    n14 = 164;
                    break;
                }
                case 77: {
                    n14 = 179;
                    break;
                }
                case 78: {
                    n14 = 95;
                    break;
                }
                case 79: {
                    n14 = 116;
                    break;
                }
                case 80: {
                    n14 = 212;
                    break;
                }
                case 81: {
                    n14 = 125;
                    break;
                }
                case 82: {
                    n14 = 247;
                    break;
                }
                case 83: {
                    n14 = 26;
                    break;
                }
                case 84: {
                    n14 = 131;
                    break;
                }
                case 85: {
                    n14 = 251;
                    break;
                }
                case 86: {
                    n14 = 161;
                    break;
                }
                case 87: {
                    n14 = 123;
                    break;
                }
                case 88: {
                    n14 = 66;
                    break;
                }
                case 89: {
                    n14 = 39;
                    break;
                }
                case 90: {
                    n14 = 5;
                    break;
                }
                case 91: {
                    n14 = 51;
                    break;
                }
                case 92: {
                    n14 = 87;
                    break;
                }
                case 93: {
                    n14 = 156;
                    break;
                }
                case 94: {
                    n14 = 193;
                    break;
                }
                case 95: {
                    n14 = 6;
                    break;
                }
                case 96: {
                    n14 = 200;
                    break;
                }
                case 97: {
                    n14 = 89;
                    break;
                }
                case 98: {
                    n14 = 84;
                    break;
                }
                case 99: {
                    n14 = 76;
                    break;
                }
                case 100: {
                    n14 = 176;
                    break;
                }
                case 101: {
                    n14 = 32;
                    break;
                }
                case 102: {
                    n14 = 246;
                    break;
                }
                case 103: {
                    n14 = 191;
                    break;
                }
                case 104: {
                    n14 = 28;
                    break;
                }
                case 105: {
                    n14 = 223;
                    break;
                }
                case 106: {
                    n14 = 230;
                    break;
                }
                case 107: {
                    n14 = 120;
                    break;
                }
                case 108: {
                    n14 = 27;
                    break;
                }
                case 109: {
                    n14 = 105;
                    break;
                }
                case 110: {
                    n14 = 42;
                    break;
                }
                case 111: {
                    n14 = 167;
                    break;
                }
                case 112: {
                    n14 = 124;
                    break;
                }
                case 113: {
                    n14 = 91;
                    break;
                }
                case 114: {
                    n14 = 122;
                    break;
                }
                case 115: {
                    n14 = 80;
                    break;
                }
                case 116: {
                    n14 = 155;
                    break;
                }
                case 117: {
                    n14 = 237;
                    break;
                }
                case 118: {
                    n14 = 7;
                    break;
                }
                case 119: {
                    n14 = 46;
                    break;
                }
                case 120: {
                    n14 = 221;
                    break;
                }
                case 121: {
                    n14 = 150;
                    break;
                }
                case 122: {
                    n14 = 45;
                    break;
                }
                case 123: {
                    n14 = 33;
                    break;
                }
                case 124: {
                    n14 = 146;
                    break;
                }
                case 125: {
                    n14 = 60;
                    break;
                }
                case 126: {
                    n14 = 9;
                    break;
                }
                case 127: {
                    n14 = 225;
                    break;
                }
                case 128: {
                    n14 = 204;
                    break;
                }
                case 129: {
                    n14 = 134;
                    break;
                }
                case 130: {
                    n14 = 30;
                    break;
                }
                case 131: {
                    n14 = 52;
                    break;
                }
                case 132: {
                    n14 = 178;
                    break;
                }
                case 133: {
                    n14 = 194;
                    break;
                }
                case 134: {
                    n14 = 248;
                    break;
                }
                case 135: {
                    n14 = 202;
                    break;
                }
                case 136: {
                    n14 = 149;
                    break;
                }
                case 137: {
                    n14 = 62;
                    break;
                }
                case 138: {
                    n14 = 220;
                    break;
                }
                case 139: {
                    n14 = 240;
                    break;
                }
                case 140: {
                    n14 = 70;
                    break;
                }
                case 141: {
                    n14 = 171;
                    break;
                }
                case 142: {
                    n14 = 152;
                    break;
                }
                case 143: {
                    n14 = 118;
                    break;
                }
                case 144: {
                    n14 = 241;
                    break;
                }
                case 145: {
                    n14 = 1;
                    break;
                }
                case 146: {
                    n14 = 3;
                    break;
                }
                case 147: {
                    n14 = 175;
                    break;
                }
                case 148: {
                    n14 = 173;
                    break;
                }
                case 149: {
                    n14 = 185;
                    break;
                }
                case 150: {
                    n14 = 148;
                    break;
                }
                case 151: {
                    n14 = 24;
                    break;
                }
                case 152: {
                    n14 = 117;
                    break;
                }
                case 153: {
                    n14 = 81;
                    break;
                }
                case 154: {
                    n14 = 65;
                    break;
                }
                case 155: {
                    n14 = 165;
                    break;
                }
                case 156: {
                    n14 = 159;
                    break;
                }
                case 157: {
                    n14 = 132;
                    break;
                }
                case 158: {
                    n14 = 196;
                    break;
                }
                case 159: {
                    n14 = 184;
                    break;
                }
                case 160: {
                    n14 = 172;
                    break;
                }
                case 161: {
                    n14 = 64;
                    break;
                }
                case 162: {
                    n14 = 239;
                    break;
                }
                case 163: {
                    n14 = 140;
                    break;
                }
                case 164: {
                    n14 = 50;
                    break;
                }
                case 165: {
                    n14 = 145;
                    break;
                }
                case 166: {
                    n14 = 104;
                    break;
                }
                case 167: {
                    n14 = 207;
                    break;
                }
                case 168: {
                    n14 = 198;
                    break;
                }
                case 169: {
                    n14 = 23;
                    break;
                }
                case 170: {
                    n14 = 163;
                    break;
                }
                case 171: {
                    n14 = 160;
                    break;
                }
                case 172: {
                    n14 = 234;
                    break;
                }
                case 173: {
                    n14 = 249;
                    break;
                }
                case 174: {
                    n14 = 74;
                    break;
                }
                case 175: {
                    n14 = 75;
                    break;
                }
                case 176: {
                    n14 = 180;
                    break;
                }
                case 177: {
                    n14 = 170;
                    break;
                }
                case 178: {
                    n14 = 190;
                    break;
                }
                case 179: {
                    n14 = 98;
                    break;
                }
                case 180: {
                    n14 = 211;
                    break;
                }
                case 181: {
                    n14 = 48;
                    break;
                }
                case 182: {
                    n14 = 25;
                    break;
                }
                case 183: {
                    n14 = 19;
                    break;
                }
                case 184: {
                    n14 = 147;
                    break;
                }
                case 185: {
                    n14 = 12;
                    break;
                }
                case 186: {
                    n14 = 130;
                    break;
                }
                case 187: {
                    n14 = 44;
                    break;
                }
                case 188: {
                    n14 = 2;
                    break;
                }
                case 189: {
                    n14 = 43;
                    break;
                }
                case 190: {
                    n14 = 14;
                    break;
                }
                case 191: {
                    n14 = 162;
                    break;
                }
                case 192: {
                    n14 = 236;
                    break;
                }
                case 193: {
                    n14 = 119;
                    break;
                }
                case 194: {
                    n14 = 111;
                    break;
                }
                case 195: {
                    n14 = 108;
                    break;
                }
                case 196: {
                    n14 = 192;
                    break;
                }
                case 197: {
                    n14 = 78;
                    break;
                }
                case 198: {
                    n14 = 16;
                    break;
                }
                case 199: {
                    n14 = 127;
                    break;
                }
                case 200: {
                    n14 = 21;
                    break;
                }
                case 201: {
                    n14 = 216;
                    break;
                }
                case 202: {
                    n14 = 206;
                    break;
                }
                case 203: {
                    n14 = 222;
                    break;
                }
                case 204: {
                    n14 = 153;
                    break;
                }
                case 205: {
                    n14 = 224;
                    break;
                }
                case 206: {
                    n14 = 57;
                    break;
                }
                case 207: {
                    n14 = 11;
                    break;
                }
                case 208: {
                    n14 = 154;
                    break;
                }
                case 209: {
                    n14 = 189;
                    break;
                }
                case 210: {
                    n14 = 121;
                    break;
                }
                case 211: {
                    n14 = 90;
                    break;
                }
                case 212: {
                    n14 = 252;
                    break;
                }
                case 213: {
                    n14 = 135;
                    break;
                }
                case 214: {
                    n14 = 139;
                    break;
                }
                case 215: {
                    n14 = 243;
                    break;
                }
                case 216: {
                    n14 = 226;
                    break;
                }
                case 217: {
                    n14 = 10;
                    break;
                }
                case 218: {
                    n14 = 83;
                    break;
                }
                case 219: {
                    n14 = 73;
                    break;
                }
                case 220: {
                    n14 = 55;
                    break;
                }
                case 221: {
                    n14 = 49;
                    break;
                }
                case 222: {
                    n14 = 195;
                    break;
                }
                case 223: {
                    n14 = 250;
                    break;
                }
                case 224: {
                    n14 = 36;
                    break;
                }
                case 225: {
                    n14 = 235;
                    break;
                }
                case 226: {
                    n14 = 79;
                    break;
                }
                case 227: {
                    n14 = 168;
                    break;
                }
                case 228: {
                    n14 = 228;
                    break;
                }
                case 229: {
                    n14 = 142;
                    break;
                }
                case 230: {
                    n14 = 231;
                    break;
                }
                case 231: {
                    n14 = 92;
                    break;
                }
                case 232: {
                    n14 = 107;
                    break;
                }
                case 233: {
                    n14 = 31;
                    break;
                }
                case 234: {
                    n14 = 115;
                    break;
                }
                case 235: {
                    n14 = 109;
                    break;
                }
                case 236: {
                    n14 = 77;
                    break;
                }
                case 237: {
                    n14 = 157;
                    break;
                }
                case 238: {
                    n14 = 99;
                    break;
                }
                case 239: {
                    n14 = 113;
                    break;
                }
                case 240: {
                    n14 = 158;
                    break;
                }
                case 241: {
                    n14 = 233;
                    break;
                }
                case 242: {
                    n14 = 69;
                    break;
                }
                case 243: {
                    n14 = 141;
                    break;
                }
                case 244: {
                    n14 = 58;
                    break;
                }
                case 245: {
                    n14 = 106;
                    break;
                }
                case 246: {
                    n14 = 54;
                    break;
                }
                case 247: {
                    n14 = 29;
                    break;
                }
                case 248: {
                    n14 = 217;
                    break;
                }
                case 249: {
                    n14 = 244;
                    break;
                }
                case 250: {
                    n14 = 101;
                    break;
                }
                case 251: {
                    n14 = 18;
                    break;
                }
                case 252: {
                    n14 = 93;
                    break;
                }
                case 253: {
                    n14 = 177;
                    break;
                }
                case 254: {
                    n14 = 137;
                    break;
                }
                default: {
                    n14 = 110;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            ug_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x15F5;
        if (d[n11] == null) {
            ug_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

