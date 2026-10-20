/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cN
 */
public class cn_1 {
    private static boolean s;
    private static final long[] a;
    private static final Integer[] b;

    public static int m(byte[] byArray, int n10) {
        return byArray[n10 + 3] & cn_1.a(14010, 6129404193505802247L) | (byArray[n10 + 2] & cn_1.a(21229, 3135500441548823638L)) << cn_1.a(744, 6198088599195503703L) | (byArray[n10 + 1] & cn_1.a(21229, 3135500441548823638L)) << cn_1.a(12348, 155474514678546048L) | (byArray[n10] & cn_1.a(21229, 3135500441548823638L)) << cn_1.a(17344, 9191871587012709754L);
    }

    public static void P(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> cn_1.a(15189, 8112643646941525483L));
        byArray[n11 + 1] = (byte)(n10 >> cn_1.a(23035, 635972991705388867L));
        byArray[n11 + 2] = (byte)(n10 >> cn_1.a(28088, 5657180925693731585L));
        byArray[n11 + 3] = (byte)n10;
    }

    public static void y(boolean bl) {
        s = bl;
    }

    public static boolean Y() {
        return s;
    }

    public static boolean B() {
        boolean bl = cn_1.Y();
        return !bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8331460174836817438L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u00c5d\u00ba^'a}\u0017\u0003ezp\u0014!\u00c9M\u00e1X\u00aet\u00ee\u00efB\u00b7\u00e1\u00dea\u00b0\u00e9\u0090S|S\u00feW#\u0083\u00c5\u00a6\u00e6Ayn\u00aeF| \u008e";
                var5_4 = "\u00c5d\u00ba^'a}\u0017\u0003ezp\u0014!\u00c9M\u00e1X\u00aet\u00ee\u00efB\u00b7\u00e1\u00dea\u00b0\u00e9\u0090S|S\u00feW#\u0083\u00c5\u00a6\u00e6Ayn\u00aeF| \u008e".length();
                var2_5 = 0;
                cn_1.y(true);
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "Y\u00a8\u00f1C\u00ec\u0004\u0012A\tYr\u0002\u00181+\u00ed";
                    var5_4 = "Y\u00a8\u00f1C\u00ec\u0004\u0012A\tYr\u0002\u00181+\u00ed".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        cn_1.a = var6_1;
        cn_1.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4EB9;
        if (b[n11] == null) {
            cn_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

