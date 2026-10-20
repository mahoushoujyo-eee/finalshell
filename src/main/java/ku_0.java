/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ku
 */
public class ku_0 {
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    public static long x(byte[] var0, int var1_1) {
        var3_2 = ku_0.a(24699, 9071835110859364606L);
        var2_3 = D6.k();
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = 0;
        if (var2_3 == null) ** GOTO lbl13
        block0: while (true) {
            var4_4 = var0[var6_6 + var1_1] & var3_2;
            v0 = (var5_5 <<= ku_0.a(8937, 8301484208621918830L)) | var4_4;
            do {
                var5_5 = v0;
                ++var6_6;
lbl13:
                // 2 sources

                if (var6_6 < ku_0.a(12213, 1262545738076985137L)) continue block0;
                v0 = var5_5;
            } while (var2_3 != null);
            break;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public static void G(long var0, byte[] var2_1, int var3_2) {
        var5_3 = 0;
        var4_4 = D6.k();
        if (var4_4 == null) ** GOTO lbl8
        block0: while (true) {
            var2_1[var5_3 + var3_2] = (byte)(var0 >>> ku_0.a(29379, 8940087272706951749L) - var5_3 * ku_0.a(12213, 1262545738076985137L));
            do {
                ++var5_3;
lbl8:
                // 2 sources

                if (var5_3 < ku_0.a(12213, 1262545738076985137L)) continue block0;
            } while (var4_4 != null);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 691717990771643557L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "S\tF\u001b\u0002\u0000\u009e\u00d8\u00f7\n\u00a5e\u0097\u00dcN\u00c3";
                var5_4 = "S\tF\u001b\u0002\u0000\u009e\u00d8\u00f7\n\u00a5e\u0097\u00dcN\u00c3".length();
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
                    var4_3 = "A\u00dc\u00ff9\u00d2s\u00c3\u009cy\u001d\u00ec\u00b1\u00ff\u0000\u008c\u00a4";
                    var5_4 = "A\u00dc\u00ff9\u00d2s\u00c3\u009cy\u001d\u00ec\u00b1\u00ff\u0000\u008c\u00a4".length();
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
        ku_0.a = var6_1;
        ku_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3886;
        if (b[n11] == null) {
            ku_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

