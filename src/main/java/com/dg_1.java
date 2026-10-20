/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aj_0;
import com.nm_2;

/*
 * Renamed from com.dG
 */
final class dg_1
implements aj_0 {
    private long J = 1L;
    private long u = 0L;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    dg_1() {
    }

    @Override
    public void I(long l2) {
        this.J = l2 & dg_1.b(19622, 4138740959448262675L);
        this.u = l2 >> dg_1.a(6255, 4390668233000687446L) & dg_1.b(19622, 4138740959448262675L);
    }

    @Override
    public void C() {
        this.J = 1L;
        this.u = 0L;
    }

    @Override
    public long u() {
        return this.u << dg_1.a(6255, 4390668233000687446L) | this.J;
    }

    @Override
    public void A(byte[] byArray, int n10, int n11) {
        block9: {
            int n12;
            int[] nArray;
            block7: {
                int n13;
                nArray = nm_2.g();
                int n14 = n11;
                int n15 = 1;
                if (nArray == null) {
                    if (n14 == n15) {
                        this.J += (long)(byArray[n10++] & dg_1.a(24795, 3934409388042907616L));
                        this.u += this.J;
                        this.J %= dg_1.b(19328, 8571087273621253943L);
                        this.u %= dg_1.b(19328, 8571087273621253943L);
                        return;
                    }
                    n14 = n11;
                    n15 = dg_1.a(23964, 1647763343925203616L);
                }
                int n16 = n14 / n15;
                int n17 = n11 % dg_1.a(2721, 8982245692592031131L);
                while (n16-- > 0) {
                    block8: {
                        n12 = dg_1.a(2721, 8982245692592031131L);
                        n13 = n11 - n12;
                        if (nArray != null) break block7;
                        n11 = n13;
                        while (n12-- > 0) {
                            this.J += (long)(byArray[n10++] & dg_1.a(5785, 8199892271762282913L));
                            this.u += this.J;
                            if (nArray == null) {
                                if (nArray == null) continue;
                            }
                            break block8;
                        }
                        this.J %= dg_1.b(19328, 8571087273621253943L);
                        this.u %= dg_1.b(19328, 8571087273621253943L);
                    }
                    if (nArray == null) continue;
                }
                n12 = n17;
                n13 = n11 = n11 - n12;
            }
            while (n12-- > 0) {
                this.J += (long)(byArray[n10++] & dg_1.a(5785, 8199892271762282913L));
                this.u += this.J;
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block9;
            }
            this.J %= dg_1.b(19328, 8571087273621253943L);
            this.u %= dg_1.b(19328, 8571087273621253943L);
        }
    }

    public dg_1 s() {
        dg_1 dg_12 = new dg_1();
        dg_12.J = this.J;
        dg_12.u = this.u;
        return dg_12;
    }

    static long h(long l2, long l3, long l4) {
        long l5;
        long l6;
        block10: {
            long l7;
            long l8;
            long l9;
            long l10;
            block9: {
                l10 = dg_1.b(16494, 7471326592952001754L);
                long l11 = l4 % l10;
                l9 = l2 & dg_1.b(3341, 8495052391616293307L);
                l8 = l11 * l9;
                l8 %= l10;
                l8 += (l2 >> dg_1.a(29589, 3383659337675373736L) & dg_1.b(19622, 4138740959448262675L)) + (l3 >> dg_1.a(6255, 4390668233000687446L) & dg_1.b(19622, 4138740959448262675L)) + l10 - l11;
                int[] nArray = nm_2.g();
                long l12 = (l9 += (l3 & dg_1.b(19622, 4138740959448262675L)) + l10 - 1L) - l10;
                l7 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (nArray == null) {
                    if (l7 >= 0) {
                        l9 -= l10;
                    }
                    l7 = l9 == l10 ? 0 : (l9 < l10 ? -1 : 1);
                }
                if (nArray == null) {
                    long l13;
                    if (l7 >= 0) {
                        l9 -= l10;
                    }
                    l7 = (l13 = l8 - (l10 << 1)) == 0L ? 0 : (l13 < 0L ? -1 : 1);
                }
                if (nArray != null) break block9;
                if (l7 >= 0) {
                    l8 -= l10 << 1;
                }
                l6 = l8;
                l5 = l10;
                if (nArray != null) break block10;
                long l14 = l6 - l5;
                l7 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            }
            if (l7 >= 0) {
                l8 -= l10;
            }
            l6 = l9;
            l5 = l8 << dg_1.a(6255, 4390668233000687446L);
        }
        return l6 | l5;
    }

    @Override
    public aj_0 y() {
        return this.s();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var8 = 4961368798664667725L;
                        var14_1 = new long[6];
                        var11_2 = 0;
                        var12_3 = "C\u008e\u00a4\u00db\u000e\u0084%\u000b\u009b\u0095\u00a8\u00c3J\u00c1\u00ab\u0013\u0084\u00f5cg\u00fb_]R=\u009f$%\u00dc&\"f";
                        var13_4 = "C\u008e\u00a4\u00db\u000e\u0084%\u000b\u009b\u0095\u00a8\u00c3J\u00c1\u00ab\u0013\u0084\u00f5cg\u00fb_]R=\u009f$%\u00dc&\"f".length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "\u0098{\u0094\u00fb\u00b3\u000f\u00ce\u00f5\u0090\u000f\u00b3\u00d18\u008fu]";
                            var13_4 = "\u0098{\u0094\u00fb\u00b3\u000f\u00ce\u00f5\u0090\u000f\u00b3\u00d18\u008fu]".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
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
                dg_1.a = var14_1;
                dg_1.b = new Integer[6];
                var0_7 = 8110696377370173836L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u0006|e\u0014\u00bd\"qJ\u0005j\u0086F0\u00ad\u00b7\u00c8";
                var5_11 = "\u0006|e\u0014\u00bd\"qJ\u0005j\u0086F0\u00ad\u00b7\u00c8".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "I\u00e19\u009b\u0087wv`\u0017!\u0080\u0091\u0093\u00e7\u00fa\u00a7";
                    var5_11 = "I\u00e19\u009b\u0087wv`\u0017!\u0080\u0091\u0093\u00e7\u00fa\u00a7".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl68:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl79:
                // 1 sources

                ** continue;
            }
        }
        dg_1.c = var6_8;
        dg_1.d = new Long[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xF39;
        if (b[n11] == null) {
            dg_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x24B7) & Short.MAX_VALUE;
        if (d[n11] == null) {
            dg_1.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

