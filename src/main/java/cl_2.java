/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cl
 */
public final class cl_2 {
    private static String K;
    private static final long[] a;
    private static final Integer[] b;

    public static byte[] M(short s2, byte[] byArray, int n10) {
        byArray[n10] = (byte)(s2 >> cl_2.a(2129, 368463105497322389L));
        byArray[n10 + 1] = (byte)(s2 >> 0);
        return byArray;
    }

    public static short N(byte[] byArray, int n10) {
        return (short)(byArray[n10] << cl_2.a(4796, 5086392563023726970L) | byArray[n10 + 1] & cl_2.a(6757, 3199289524427342242L));
    }

    public static byte[] T(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> cl_2.a(4796, 5086392563023726970L));
        byArray[n11 + 1] = (byte)(n10 >> 0);
        return byArray;
    }

    public static int i(byte[] byArray, int n10) {
        int n11 = 0;
        n11 |= byArray[n10 + 0] & cl_2.a(3663, 7935834255880902026L);
        n11 <<= cl_2.a(4796, 5086392563023726970L);
        return n11 |= byArray[n10 + 1] & cl_2.a(3663, 7935834255880902026L);
    }

    public static void F(String string) {
        K = string;
    }

    public static String C() {
        return K;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8015461099186292630L;
                var6_1 = new long[4];
                var3_2 = 0;
                cl_2.F("hbR5r");
                var4_3 = "4\u00c6\u0017\u0083]\u00deR\u00e3\u00f7\u00f1\u0091\u00c6\u00e3\u00f7T\u000b";
                var5_4 = "4\u00c6\u0017\u0083]\u00deR\u00e3\u00f7\u00f1\u0091\u00c6\u00e3\u00f7T\u000b".length();
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
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00c9\u0016\u00e6b\u00d2\u00e8\u00c6\u00cb\u00e7\u00ba\u00fe\u00df\u00b4\u00c1\u00ce\u00e4";
                    var5_4 = "\u00c9\u0016\u00e6b\u00d2\u00e8\u00c6\u00cb\u00e7\u00ba\u00fe\u00df\u00b4\u00c1\u00ce\u00e4".length();
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
        cl_2.a = var6_1;
        cl_2.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5BC5;
        if (b[n11] == null) {
            cl_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

