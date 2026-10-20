/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vu
 */
public class vu_0 {
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    public static long e(byte[] var0, int var1_1) {
        var3_2 = vu_0.a(1589, 2385274455274334514L);
        var2_3 = cl_2.C();
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = 0;
        if (var2_3 != null) ** GOTO lbl13
        block0: while (true) {
            var4_4 = var0[var6_6 + var1_1] & var3_2;
            v0 = (var5_5 <<= vu_0.a(3297, 4719950997848957925L)) | var4_4;
            do {
                var5_5 = v0;
                ++var6_6;
lbl13:
                // 2 sources

                if (var6_6 < vu_0.a(3297, 4719950997848957925L)) continue block0;
                v0 = var5_5;
            } while (var2_3 == null);
            break;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public static void b(long var0, byte[] var2_1, int var3_2) {
        var5_3 = 0;
        var4_4 = cl_2.C();
        if (var4_4 != null) ** GOTO lbl8
        block0: while (true) {
            var2_1[var5_3 + var3_2] = (byte)(var0 >>> vu_0.a(10131, 5688717031499860117L) - var5_3 * vu_0.a(3816, 4659752291215090157L));
            do {
                ++var5_3;
lbl8:
                // 2 sources

                if (var5_3 < vu_0.a(3297, 4719950997848957925L)) continue block0;
            } while (var4_4 == null);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3166450340239150854L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u009e\u00d3qq\u00eb\u00ee\u00ae\u00e3\u0005J\u00c8\u0085\b\u00d7,\u00eb";
                var5_4 = "\u009e\u00d3qq\u00eb\u00ee\u00ae\u00e3\u0005J\u00c8\u0085\b\u00d7,\u00eb".length();
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
                    var4_3 = "\u0092\u00e0Ngf\u00ae&\u00cb\u0091\u00e9,L\u00d2\u009d\u0007\u00ab";
                    var5_4 = "\u0092\u00e0Ngf\u00ae&\u00cb\u0091\u00e9,L\u00d2\u009d\u0007\u00ab".length();
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
        vu_0.a = var6_1;
        vu_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2F05;
        if (b[n11] == null) {
            vu_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

