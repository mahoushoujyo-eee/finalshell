/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pZ
 */
final class pz_1
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pz_1(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 3: {
                    return pz_1.b(62, 7138728101899696963L);
                }
                case 32: {
                    return pz_1.b(13931, 6394972914404871451L);
                }
                case 59: {
                    return pz_1.b(8498, 5973767337860127300L);
                }
                case 60: {
                    return pz_1.b(20732, 5673008992765750153L);
                }
                case 61: {
                    return pz_1.b(27864, 6314044031095347113L);
                }
                case 91: {
                    return pz_1.b(7855, 2712520835009963485L);
                }
                case 92: {
                    return pz_1.b(2555, 984582197423567496L);
                }
                case 93: {
                    return pz_1.b(2612, 4949117430773739840L);
                }
                case 94: {
                    return pz_1.b(7740, 5688618866003764555L);
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
                var0 = 8001541509811781938L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u00af\u00d8\u00f4n\u00ce\u00b9\u00ea\\\u00dd$[\u008a\u001f)\u00b0\u009a\u00b9C5\u0012\u00e1b\u00a4\u0095\u0084\u0081\u00070\u00bc$\u001b\u00cc\u00e3\u00ef\u00c5m\"B\u00d6r\u00c4\u00b1/\u00a8<\u0087\f\u008en\u00c8\u00e5\u00f02E3H";
                var5_4 = "\u00af\u00d8\u00f4n\u00ce\u00b9\u00ea\\\u00dd$[\u008a\u001f)\u00b0\u009a\u00b9C5\u0012\u00e1b\u00a4\u0095\u0084\u0081\u00070\u00bc$\u001b\u00cc\u00e3\u00ef\u00c5m\"B\u00d6r\u00c4\u00b1/\u00a8<\u0087\f\u008en\u00c8\u00e5\u00f02E3H".length();
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
                    var4_3 = ",$\u00e9[\u0003B\u00a4\u000fEI\u001e\u0018&\u000b\u00ba\u00d2";
                    var5_4 = ",$\u00e9[\u0003B\u00a4\u000fEI\u001e\u0018&\u000b\u00ba\u00d2".length();
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
        pz_1.c = var6_1;
        pz_1.d = new Integer[9];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B75;
        if (d[n11] == null) {
            pz_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

