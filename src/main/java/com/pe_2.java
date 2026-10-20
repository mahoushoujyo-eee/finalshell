/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pe
 */
final class pe_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pe_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 3: {
                    return pe_2.b(23429, 5083439511479241339L);
                }
                case 32: {
                    return pe_2.b(31691, 9220630586578102847L);
                }
                case 59: {
                    return pe_2.b(24877, 2336598270319489237L);
                }
                case 60: {
                    return pe_2.b(8231, 626772758956716509L);
                }
                case 61: {
                    return pe_2.b(3760, 2694628761231040333L);
                }
                case 91: {
                    return pe_2.b(22276, 2985766906043057917L);
                }
                case 92: {
                    return pe_2.b(1778, 6469067431472142089L);
                }
                case 93: {
                    return pe_2.b(16367, 3905958842665217555L);
                }
                case 94: {
                    return pe_2.b(4420, 7331434232707842235L);
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
                var0 = 3397524793125450509L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "c\u00cd\u00b8Y\u0005\u0088\u001d\u00a2\u0086\u0097\u00e4\u0085\u008bi,<R\u001f\u00b6\u00f6\u00074\u00f9\u00d5\u00a3\u00a9Y\u0098'c\u00b3\u0002\u00f8\u00de\u00a7\u0083T\u00fcB\u00eb\u001d\u00da9\u00b7\u00e1\u0003uX\u0010IN\u0015\u008dR\u0082m";
                var5_4 = "c\u00cd\u00b8Y\u0005\u0088\u001d\u00a2\u0086\u0097\u00e4\u0085\u008bi,<R\u001f\u00b6\u00f6\u00074\u00f9\u00d5\u00a3\u00a9Y\u0098'c\u00b3\u0002\u00f8\u00de\u00a7\u0083T\u00fcB\u00eb\u001d\u00da9\u00b7\u00e1\u0003uX\u0010IN\u0015\u008dR\u0082m".length();
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
                    var4_3 = "Z\u008e^\u0085\u0081!%\u0096\u00f9\u00f3\u0090/7\u00c5\u00d9\u008c";
                    var5_4 = "Z\u008e^\u0085\u0081!%\u0096\u00f9\u00f3\u0090/7\u00c5\u00d9\u008c".length();
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
        pe_2.c = var6_1;
        pe_2.d = new Integer[9];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11FC;
        if (d[n11] == null) {
            pe_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

