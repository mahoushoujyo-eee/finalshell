/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pX
 */
final class px_1
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    px_1(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 3: {
                    return px_1.b(8307, 3189281565131678484L);
                }
                case 32: {
                    return px_1.b(17552, 936681257791866864L);
                }
                case 59: {
                    return px_1.b(16594, 2836195937549534134L);
                }
                case 60: {
                    return px_1.b(16791, 8602162182752551669L);
                }
                case 61: {
                    return px_1.b(31419, 3088093356107921880L);
                }
                case 91: {
                    return px_1.b(29935, 4899663059372832650L);
                }
                case 92: {
                    return px_1.b(26504, 8360447719875568873L);
                }
                case 93: {
                    return px_1.b(25758, 3578324073185175544L);
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
                var0 = 1604056807351349569L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u0014=.\u00bf\u00c0\u00d7\u0016^\u00d5\u00b24Fs\u00d9R\u00f66\u00ce\u00cc\u0007B\u00b2\u00b2Vy%\u008cD$\u00bc\u0006{+\u00b6\u00bc3:\u00fa\u00b3e\u00f9\u008c\u00d4\u008e-\u00b7\b&";
                var5_4 = "\u0014=.\u00bf\u00c0\u00d7\u0016^\u00d5\u00b24Fs\u00d9R\u00f66\u00ce\u00cc\u0007B\u00b2\u00b2Vy%\u008cD$\u00bc\u0006{+\u00b6\u00bc3:\u00fa\u00b3e\u00f9\u008c\u00d4\u008e-\u00b7\b&".length();
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
                    var4_3 = "\u00d2\u001f\u0015\u00a2\u00cf\u00ca6\u0016\u00bd2\u0003}3\u00d1\u0015Y";
                    var5_4 = "\u00d2\u001f\u0015\u00a2\u00cf\u00ca6\u0016\u00bd2\u0003}3\u00d1\u0015Y".length();
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
        px_1.c = var6_1;
        px_1.d = new Integer[8];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x366;
        if (d[n11] == null) {
            px_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

