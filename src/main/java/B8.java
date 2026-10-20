/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class B8 {
    private static final long[] a;
    private static final Integer[] b;

    public static byte[] P(short s2, byte[] byArray, int n10) {
        byArray[n10] = (byte)(s2 >> B8.a(7495, 5319857971058431858L));
        byArray[n10 + 1] = (byte)(s2 >> 0);
        return byArray;
    }

    public static short M(byte[] byArray, int n10) {
        return (short)(byArray[n10] << B8.a(21130, 3470022079268329660L) | byArray[n10 + 1] & B8.a(15145, 8276353907680309534L));
    }

    public static byte[] R(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> B8.a(21130, 3470022079268329660L));
        byArray[n11 + 1] = (byte)(n10 >> 0);
        return byArray;
    }

    public static int M(byte[] byArray, int n10) {
        int n11 = 0;
        n11 |= byArray[n10 + 0] & B8.a(19168, 3187307240157184212L);
        n11 <<= B8.a(21130, 3470022079268329660L);
        return n11 |= byArray[n10 + 1] & B8.a(15145, 8276353907680309534L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6627242241893603053L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00adn\u00a6\u00a4\u00eb\u0011\u0096\u00c6X\u00da\u00b7\u00c8X\u00ff\u00c1\u0097";
                var5_4 = "\u00adn\u00a6\u00a4\u00eb\u0011\u0096\u00c6X\u00da\u00b7\u00c8X\u00ff\u00c1\u0097".length();
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
                    var4_3 = "\u00c8\u00b7t\u00e4\u00e1\u0005\u000eYt-\u00cd\u00a3\u00ba;g\f";
                    var5_4 = "\u00c8\u00b7t\u00e4\u00e1\u0005\u000eYt-\u00cd\u00a3\u00ba;g\f".length();
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
        B8.a = var6_1;
        B8.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4A34;
        if (b[n11] == null) {
            B8.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

