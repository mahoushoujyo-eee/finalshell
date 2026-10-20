/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pr
 */
final class pr_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pr_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 32: {
                    return pr_2.b(19585, 3979752955014015984L);
                }
                case 59: {
                    return pr_2.b(2890, 319373105984187448L);
                }
                case 60: {
                    return pr_2.b(23881, 1429729133533854271L);
                }
                case 61: {
                    return pr_2.b(20643, 634825667695212508L);
                }
                case 62: {
                    return pr_2.b(13863, 6638119491227259223L);
                }
                case 91: {
                    return pr_2.b(19453, 8418836532459793545L);
                }
                case 92: {
                    return pr_2.b(19031, 4264301273325825316L);
                }
                case 93: {
                    return pr_2.b(8837, 7325482692077946352L);
                }
                case 94: {
                    return pr_2.b(12345, 970999309534762830L);
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
                var0 = 6695793044248409802L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u0095\u00b8{\u0014z\r!\u007f\u00ad|\u00c58*\u00ba\u00cc\u0012\u00a2\u00ea<\u001e\u0006a3\u00d2\u0092\u00d5p\u00c3\u00e8\u00ad\u00da\u00aa\u00fe<\u00d0=p!\u00db\u0017\u00d7\u00a5\u00ef\u00c0\u0096\u00f5\u001a\u0010t\u00a5\t\u00c5Z\u009e\u00dd\u00da";
                var5_4 = "\u0095\u00b8{\u0014z\r!\u007f\u00ad|\u00c58*\u00ba\u00cc\u0012\u00a2\u00ea<\u001e\u0006a3\u00d2\u0092\u00d5p\u00c3\u00e8\u00ad\u00da\u00aa\u00fe<\u00d0=p!\u00db\u0017\u00d7\u00a5\u00ef\u00c0\u0096\u00f5\u001a\u0010t\u00a5\t\u00c5Z\u009e\u00dd\u00da".length();
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
                    var4_3 = "\u00e3\u00e8\u00c6\u00b7\u0088\u00c7\u00a7se#\u0090+\u0092\u00b0\u00c1\u00fc";
                    var5_4 = "\u00e3\u00e8\u00c6\u00b7\u0088\u00c7\u00a7se#\u0090+\u0092\u00b0\u00c1\u00fc".length();
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
        pr_2.c = var6_1;
        pr_2.d = new Integer[9];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2777;
        if (d[n11] == null) {
            pr_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

