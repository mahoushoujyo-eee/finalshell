/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pa
 */
final class pa_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pa_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 3: {
                    return pa_2.b(11984, 3619821435634766103L);
                }
                case 32: {
                    return pa_2.b(1316, 6526501022437636838L);
                }
                case 59: {
                    return pa_2.b(12199, 6775597358316277860L);
                }
                case 60: {
                    return pa_2.b(13470, 5289857034583591768L);
                }
                case 61: {
                    return pa_2.b(27826, 4711328600981181302L);
                }
                case 91: {
                    return pa_2.b(24425, 4433717266861727916L);
                }
                case 92: {
                    return pa_2.b(6771, 4350232914995766706L);
                }
                case 93: {
                    return pa_2.b(17495, 7382900220802874265L);
                }
                case 94: {
                    return pa_2.b(17145, 6667553264062053689L);
                }
            }
            n11 = -1;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1332122450125769245L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u0088\u00ae\u00d6\u00ecO\u00e5\u0001\u00a2\u008e\u00eb4\u00d5\u00b8K\u001b\u00a9I~\u00f6C\u00dc\u008e\u00d9\u00cd\u00c3Ay\u00c0x\u00de\u00eaX\u0088!\u00e2\u00f7\u00a1\u008f\u00b0\u001b\u00f2\u00f7\u00e3\u0003n\u0095\u009a\u00c9\u00fc_\u00b0Wl{\u00f7\u008c";
                var5_4 = "\u0088\u00ae\u00d6\u00ecO\u00e5\u0001\u00a2\u008e\u00eb4\u00d5\u00b8K\u001b\u00a9I~\u00f6C\u00dc\u008e\u00d9\u00cd\u00c3Ay\u00c0x\u00de\u00eaX\u0088!\u00e2\u00f7\u00a1\u008f\u00b0\u001b\u00f2\u00f7\u00e3\u0003n\u0095\u009a\u00c9\u00fc_\u00b0Wl{\u00f7\u008c".length();
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
                    var4_3 = ";\u00e3\u00bc\u0082\u00d9\u0099/Vs\u00df9H\f\nql";
                    var5_4 = ";\u00e3\u00bc\u0082\u00d9\u0099/Vs\u00df9H\f\nql".length();
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
        pa_2.c = var6_1;
        pa_2.d = new Integer[9];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7FC6;
        if (d[n11] == null) {
            pa_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

