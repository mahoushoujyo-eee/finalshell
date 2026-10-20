/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

/*
 * Renamed from kJ
 */
public class kj_1 {
    private static final long[] a;
    private static final Integer[] b;

    public static byte[] S(String string) {
        byte[] byArray = new byte[4];
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        try {
            byArray[0] = (byte)(Integer.parseInt(stringTokenizer.nextToken()) & kj_1.a(20937, 6539434023919883758L));
            byArray[1] = (byte)(Integer.parseInt(stringTokenizer.nextToken()) & kj_1.a(1576, 3146209006710637070L));
            byArray[2] = (byte)(Integer.parseInt(stringTokenizer.nextToken()) & kj_1.a(1576, 3146209006710637070L));
            byArray[3] = (byte)(Integer.parseInt(stringTokenizer.nextToken()) & kj_1.a(1576, 3146209006710637070L));
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return byArray;
    }

    /*
     * Unable to fully structure code
     */
    public static void main(String[] var0) {
        var2_1 = kj_1.S(var0[0]);
        var1_2 = wi_0.d();
        var3_3 = 0;
        if (var1_2 == 0) ** GOTO lbl9
        block0: while (true) {
            System.out.println(var2_1[var3_3]);
            do {
                ++var3_3;
lbl9:
                // 2 sources

                if (var3_3 < var2_1.length) continue block0;
                System.out.println(kj_1.U(var2_1));
            } while (var1_2 != 0);
            break;
        }
    }

    public static String W(String string, String string2, String string3) {
        try {
            return new String(string.getBytes(string2), string3);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string;
        }
    }

    public static String k(byte[] byArray, String string) {
        try {
            return new String(byArray, string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray);
        }
    }

    public static String Q(byte[] byArray, int n10, int n11, String string) {
        try {
            return new String(byArray, n10, n11, string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray, n10, n11);
        }
    }

    public static String U(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(byArray[0] & kj_1.a(1576, 3146209006710637070L));
        int n10 = wi_0.p();
        stringBuffer.append((char)kj_1.a(20700, 925339894766310649L));
        stringBuffer.append(byArray[1] & kj_1.a(1576, 3146209006710637070L));
        stringBuffer.append((char)kj_1.a(22683, 7727710058535886015L));
        stringBuffer.append(byArray[2] & kj_1.a(1576, 3146209006710637070L));
        int n11 = n10;
        stringBuffer.append((char)kj_1.a(22683, 7727710058535886015L));
        stringBuffer.append(byArray[3] & kj_1.a(1576, 3146209006710637070L));
        String string = stringBuffer.toString();
        if (n11 == 0) {
            ky_2.K(new String[5]);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4744847809801099659L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00f86\u00d4\u00c0\u00d4w\r\\V\u00c0\u0018\u00ad~B\u0085\u001a";
                var5_4 = "\u00f86\u00d4\u00c0\u00d4w\r\\V\u00c0\u0018\u00ad~B\u0085\u001a".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00ca%E/s\u00a5\f\u009a?A\u00f8\u0096\u0082c[z";
                    var5_4 = "\u00ca%E/s\u00a5\f\u009a?A\u00f8\u0096\u0082c[z".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        kj_1.a = var6_1;
        kj_1.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4425;
        if (b[n11] == null) {
            kj_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

