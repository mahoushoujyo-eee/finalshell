/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nb
 */
public final class nb_0 {
    private static final long[] a;
    private static final Integer[] b;

    public static byte[] s(short s2, byte[] byArray, int n10) {
        byArray[n10] = (byte)(s2 >> nb_0.a(26928, 1019529774267985221L));
        byArray[n10 + 1] = (byte)(s2 >> 0);
        return byArray;
    }

    public static short Q(byte[] byArray, int n10) {
        return (short)(byArray[n10] << nb_0.a(31252, 6333113910465592931L) | byArray[n10 + 1] & nb_0.a(29592, 7631339883849021420L));
    }

    public static byte[] H(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> nb_0.a(26928, 1019529774267985221L));
        byArray[n11 + 1] = (byte)(n10 >> 0);
        return byArray;
    }

    public static int K(byte[] byArray, int n10) {
        int n11 = 0;
        n11 |= byArray[n10 + 0] & nb_0.a(32737, 2895650046495751063L);
        n11 <<= nb_0.a(26928, 1019529774267985221L);
        return n11 |= byArray[n10 + 1] & nb_0.a(32737, 2895650046495751063L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 509592882957690568L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0018;\u0001\u00e4\u00eb\u00a0X\u00a3\u00db\u00d2\u00102\u00ef\u00fa]\u00a0";
                var5_4 = "\u0018;\u0001\u00e4\u00eb\u00a0X\u00a3\u00db\u00d2\u00102\u00ef\u00fa]\u00a0".length();
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
                    var4_3 = "\u00a3\u001fP\u008fa\u00ef\u00cb\u0085i\u000f\u00ba8\u00e9\u00d5\u00d1\u00db";
                    var5_4 = "\u00a3\u001fP\u008fa\u00ef\u00cb\u0085i\u000f\u00ba8\u00e9\u00d5\u00d1\u00db".length();
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
        nb_0.a = var6_1;
        nb_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x477;
        if (b[n11] == null) {
            nb_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

