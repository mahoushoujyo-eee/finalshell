/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pY
 */
final class py_1
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    py_1(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 32: {
                    return py_1.b(24167, 149725523880917170L);
                }
                case 59: {
                    return py_1.b(16999, 4364697251133924542L);
                }
                case 60: {
                    return py_1.b(20963, 5107410575469983545L);
                }
                case 61: {
                    return py_1.b(32093, 1282153989084093314L);
                }
                case 62: {
                    return py_1.b(9188, 4610583158368847161L);
                }
                case 64: {
                    return py_1.b(14169, 5479489850987073922L);
                }
                case 91: {
                    return py_1.b(1372, 8094833791896773506L);
                }
                case 92: {
                    return py_1.b(10038, 4864462999229350370L);
                }
                case 93: {
                    return py_1.b(20498, 1235397027494246094L);
                }
                case 94: {
                    return py_1.b(17041, 8529037775487902793L);
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
                var0 = 3470964666879434981L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\n\u00ee\u0011\u0005\u001c\u00be\u00a5\u0000\u00c6~W\u00ffi\u0019\u00d6\u00ce\u0087\t2\u00a3\u00f7\u00f2\u00fb\u00a2\u00102\u00e5Yt\u0092\u0003\u0081{j\u00ab\u0080(\u00b1\u00c4\u009d \u00a7\u00a8\u00e9~\u009f\u00c4Pj\u00b0\u00b37\u009b6\u00b1\u0083\u0016\u00c7\u00a6a\u00cd\u00b1\u00d7\u0004";
                var5_4 = "\n\u00ee\u0011\u0005\u001c\u00be\u00a5\u0000\u00c6~W\u00ffi\u0019\u00d6\u00ce\u0087\t2\u00a3\u00f7\u00f2\u00fb\u00a2\u00102\u00e5Yt\u0092\u0003\u0081{j\u00ab\u0080(\u00b1\u00c4\u009d \u00a7\u00a8\u00e9~\u009f\u00c4Pj\u00b0\u00b37\u009b6\u00b1\u0083\u0016\u00c7\u00a6a\u00cd\u00b1\u00d7\u0004".length();
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
                    var4_3 = "}\u008f\u0083\u0093e\u00fc\u00d8\u0093p\\EJY_!\u00ff";
                    var5_4 = "}\u008f\u0083\u0093e\u00fc\u00d8\u0093p\\EJY_!\u00ff".length();
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
        py_1.c = var6_1;
        py_1.d = new Integer[10];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x66DD;
        if (d[n11] == null) {
            py_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

