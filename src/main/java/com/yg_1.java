/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.yG
 */
public class yg_1
extends gt_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    private int q(int[] nArray) {
        int n10;
        block9: {
            int n11;
            String[] stringArray;
            int n12;
            block8: {
                int n13;
                n12 = 0;
                stringArray = W5.q();
                block0: while (true) {
                    int n14 = n12;
                    int n15 = 4;
                    block1: while (n14 < n15) {
                        n11 = 0;
                        int n16 = 0;
                        n13 = 0;
                        if (stringArray == null) break block8;
                        for (int i2 = v9934561; i2 < yg_1.a(7753, 1033753468321708880L); ++i2) {
                            int n17 = nArray[i2];
                            if (stringArray != null) {
                                n15 = n11;
                                if (stringArray == null) continue block1;
                                if (n17 <= n15) continue;
                                n11 = nArray[i2];
                                n17 = i2;
                            }
                            n16 = n17;
                            if (stringArray != null) continue;
                        }
                        nArray[n16] = 0;
                        ++n12;
                        if (stringArray != null) continue block0;
                    }
                    break;
                }
                n11 = 0;
                n13 = n12 = 0;
            }
            while (n12 < yg_1.a(26692, 4867723795067751768L)) {
                block11: {
                    int n18;
                    block10: {
                        n10 = nArray[n12];
                        if (stringArray == null) break block9;
                        if (stringArray == null) break block10;
                        if (n10 <= n11) break block11;
                        n18 = nArray[n12];
                    }
                    n11 = n18;
                }
                ++n12;
                if (stringArray != null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    private int K(int[] nArray, int[] nArray2, int[] nArray3) {
        int n10;
        block7: {
            int n11 = 0;
            int n12 = yg_1.a(21045, 1336400658486261544L);
            int n13 = 0;
            String[] stringArray = W5.q();
            while (n13 < yg_1.a(26692, 4867723795067751768L)) {
                block8: {
                    block10: {
                        int n14;
                        block9: {
                            int n15 = 0;
                            n10 = 0;
                            if (stringArray == null) break block7;
                            for (int i2 = v9934638; i2 < yg_1.a(26692, 4867723795067751768L); ++i2) {
                                n15 += Math.abs(nArray[n13] - nArray[i2]);
                                n15 += Math.abs(nArray2[n13] - nArray2[i2]);
                                n15 += Math.abs(nArray3[n13] - nArray3[i2]);
                                if (stringArray != null) {
                                    if (stringArray != null) continue;
                                }
                                break block8;
                            }
                            n14 = n15;
                            if (stringArray == null) break block9;
                            if (n14 >= n12) break block10;
                            n12 = n15;
                            n14 = n13;
                        }
                        n11 = n14;
                    }
                    ++n13;
                }
                if (stringArray != null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected int[] K(int var1_1, int var2_2, int[] var3_3, Rectangle var4_4) {
        var6_5 = 0;
        var7_6 = new int[yg_1.a(26692, 4867723795067751768L)];
        var8_7 = new int[yg_1.a(26692, 4867723795067751768L)];
        var9_8 = new int[yg_1.a(26692, 4867723795067751768L)];
        var5_9 = W5.q();
        var10_10 = new int[yg_1.a(26692, 4867723795067751768L)];
        var11_11 = new int[var1_1 * var2_2];
        var12_12 = 0;
        block0: while (true) {
            v0 = var12_12;
            block1: while (v0 < var2_2) {
                var13_13 = 0;
                while (var13_13 < var1_1) {
                    block9: {
                        var14_14 = 0;
                        v0 = -1;
                        if (var5_9 == null) continue block1;
                        var15_15 = v0;
                        block3: while (true) {
                            v1 = var15_15;
                            v2 = 1;
                            block4: while (v1 <= v2) {
                                block10: {
                                    block11: {
                                        var16_16 = var12_12 + var15_15;
                                        if (var5_9 == null) continue block3;
                                        v3 = 0;
                                        v4 = var16_16;
                                        if (var5_9 == null) ** GOTO lbl64
                                        if (v3 > v4) break block10;
                                        v5 = var16_16;
                                        v6 = var2_2;
                                        if (var5_9 == null) break block11;
                                        if (v5 >= v6) break block10;
                                        v5 = var16_16;
                                        v6 = var1_1;
                                    }
                                    var17_17 = v5 * v6;
                                    var18_18 = -1;
                                    while (var18_18 <= 1) {
                                        block12: {
                                            block13: {
                                                block14: {
                                                    var19_19 = var13_13 + var18_18;
                                                    if (var5_9 == null) break block12;
                                                    v1 = 0;
                                                    v2 = var19_19;
                                                    if (var5_9 == null) continue block4;
                                                    if (v1 > v2) break block13;
                                                    v7 = var19_19;
                                                    if (var5_9 == null) break block14;
                                                    if (v7 >= var1_1) break block13;
                                                    v7 = var3_3[var17_17 + var19_19];
                                                }
                                                var7_6[var14_14] = var20_20 = v7;
                                                var8_7[var14_14] = var20_20 >> yg_1.a(3247, 2804014343782574516L) & yg_1.a(17605, 4551622530940494303L);
                                                var9_8[var14_14] = var20_20 >> yg_1.a(9206, 7786147149570442990L) & yg_1.a(13104, 4646420769866257966L);
                                                var10_10[var14_14] = var20_20 & yg_1.a(13104, 4646420769866257966L);
                                                ++var14_14;
                                            }
                                            ++var18_18;
                                        }
                                        if (var5_9 != null) continue;
                                    }
                                }
                                ++var15_15;
                                if (var5_9 != null) continue block3;
                            }
                            break;
                        }
                        do {
                            v3 = var14_14;
                            v4 = yg_1.a(26692, 4867723795067751768L);
lbl64:
                            // 2 sources

                            if (v3 >= v4) break;
                            var7_6[var14_14] = yg_1.a(24692, 3993834145299187051L);
                            var10_10[var14_14] = 0;
                            var9_8[var14_14] = 0;
                            var8_7[var14_14] = 0;
                            ++var14_14;
                            if (var5_9 == null) break block9;
                        } while (var5_9 != null);
                        var11_11[var6_5++] = var7_6[this.K(var8_7, var9_8, var10_10)];
                        ++var13_13;
                    }
                    if (var5_9 != null) continue;
                }
                ++var12_12;
                if (var5_9 != null) continue block0;
            }
            break;
        }
        return var11_11;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u00001\b&~L#&4\u001c:".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 60;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 126;
                                break;
                            }
                            case 1: {
                                v9 = 97;
                                break;
                            }
                            case 2: {
                                v9 = 65;
                                break;
                            }
                            case 3: {
                                v9 = 104;
                                break;
                            }
                            case 4: {
                                v9 = 109;
                                break;
                            }
                            case 5: {
                                v9 = 61;
                                break;
                            }
                            default: {
                                v9 = 122;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                yg_1.a = new String(v10).intern();
                var0_1 = 7449937619813012069L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = ";\u0098X\u0012\u00bb&\u0004\u00b4\u001c'\u00b0\u00e3~\u00a4W\u000e\u00d6\u00d7\u00ca1f|\u00df4'\u00b3\u0003+2\u0092\u001a\u00b2\u00f1\u0087\u00f7\u0010\u00bf\u0099sE7\u0014M~I\u0084\u00bb\u00c1";
                var5_5 = ";\u0098X\u0012\u00bb&\u0004\u00b4\u001c'\u00b0\u00e3~\u00a4W\u000e\u00d6\u00d7\u00ca1f|\u00df4'\u00b3\u0003+2\u0092\u001a\u00b2\u00f1\u0087\u00f7\u0010\u00bf\u0099sE7\u0014M~I\u0084\u00bb\u00c1".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00b6\u0018k\u00e8X\u00d7\u0014\u0083\u00b6\u0097\u00c7i[b\u00a9<";
                    var5_5 = "\u00b6\u0018k\u00e8X\u00d7\u0014\u0083\u00b6\u0097\u00c7i[b\u00a9<".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        yg_1.b = var6_2;
        yg_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x251E;
        if (c[n11] == null) {
            yg_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

