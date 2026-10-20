/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hd
 */
public class hd_2
extends W5 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    private void t(int[] nArray) {
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n10 = nArray[i2];
            int n11 = n10 >> hd_2.a(8140, 813035958678453247L) & hd_2.a(3217, 8095873878671976611L);
            int n12 = n10 >> hd_2.a(5638, 557475173309182520L) & hd_2.a(1928, 4667281847533200305L);
            int n13 = n10 & hd_2.a(1928, 4667281847533200305L);
            nArray[i2] = (n11 + n12 + n13) / 3;
            if (stringArray != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage filter(BufferedImage var1_1, BufferedImage var2_2) {
        block18: {
            block17: {
                var4_3 = var1_1.getWidth();
                var3_4 = W5.q();
                var5_5 = var1_1.getHeight();
                v0 = var2_2;
                if (var3_4 == null) break block17;
                if (v0 != null) break block18;
                v0 = this.createCompatibleDestImage(var1_1, null);
            }
            var2_2 = v0;
        }
        var6_6 = null;
        var7_7 = null;
        var8_8 = null;
        var9_9 = new int[var4_3];
        var6_6 = this.l(var1_1, 0, 0, var4_3, 1, var6_6);
        var7_7 = this.l(var1_1, 0, 0, var4_3, 1, var7_7);
        this.t(var6_6);
        this.t(var7_7);
        var10_10 = 0;
        block0: while (true) {
            v1 = var10_10;
            block1: while (v1 < var5_5) {
                block19: {
                    v2 = var10_10;
                    if (var3_4 == null) break block19;
                    v3 = var5_5 - 1;
                    if (var3_4 == null) ** GOTO lbl68
                    if (v2 < v3) {
                        var8_8 = this.l(var1_1, 0, var10_10 + 1, var4_3, 1, var8_8);
                        this.t(var8_8);
                    }
                    v4 = hd_2.a(23328, 1567409644925894426L);
                    var9_9[var4_3 - 1] = v4;
                    var9_9[0] = v4;
                    v2 = var11_12 = 1;
                }
                while (var11_12 < var4_3 - 1) {
                    var12_15 = var7_7[var11_12 - 1];
                    var13_16 = var6_6[var11_12];
                    var14_17 = var8_8[var11_12];
                    var15_18 = var7_7[var11_12 + 1];
                    var16_19 = var7_7[var11_12];
                    var17_20 = Math.max(Math.max(var12_15, var13_16), Math.max(var14_17, var15_18));
                    var18_21 = Math.min(Math.min(var12_15, var13_16), Math.min(var14_17, var15_18));
                    var19_22 = (int)(0.5f * (float)Math.max(var17_20 - var16_19, var16_19 - var18_21));
                    v1 = var6_6[var11_12 - 1] + var6_6[var11_12] + var6_6[var11_12 + 1] + var7_7[var11_12 - 1] - hd_2.a(4866, 7223194307816322879L) * var7_7[var11_12] + var7_7[var11_12 + 1] + var8_8[var11_12 - 1] + var8_8[var11_12] + var8_8[var11_12 + 1];
                    if (var3_4 == null) continue block1;
                    if (var3_4 == null) ** GOTO lbl51
                    if (v1 > 0) {
                        v5 = var19_22;
                    } else {
                        v6 = hd_2.a(8485, 7888476860802745630L);
lbl51:
                        // 2 sources

                        v5 = v6 + var19_22;
                    }
                    var9_9[var11_12] = var20_23 = v5;
                    ++var11_12;
                    if (var3_4 != null) continue;
                }
                this.E(var2_2, 0, var10_10, var4_3, 1, var9_9);
                var11_11 = var6_6;
                var6_6 = var7_7;
                var7_7 = var8_8;
                var8_8 = var11_11;
                ++var10_10;
                if (var3_4 != null) continue block0;
            }
            break;
        }
        var6_6 = this.l(var2_2, 0, 0, var4_3, 1, var6_6);
        var7_7 = this.l(var2_2, 0, 0, var4_3, 1, var7_7);
        var10_10 = 0;
        block3: while (true) {
            v7 = var10_10;
            v3 = var5_5;
            block4: while (v7 < v3) {
                v8 = var10_10;
                if (var3_4 != null) {
                    if (v8 < var5_5 - 1) {
                        var8_8 = this.l(var2_2, 0, var10_10 + 1, var4_3, 1, var8_8);
                    }
                    v9 = hd_2.a(18295, 1158868333767467848L);
                    var9_9[var4_3 - 1] = v9;
                    var9_9[0] = v9;
                    v8 = var11_13 = 1;
                }
                while (var11_13 < var4_3 - 1) {
                    block24: {
                        block21: {
                            block22: {
                                block23: {
                                    block20: {
                                        v7 = var12_15 = var7_7[var11_13];
                                        v3 = hd_2.a(28710, 2225998683964904478L);
                                        if (var3_4 == null) continue block4;
                                        if (var3_4 == null) break block20;
                                        if (v7 > v3) break block21;
                                        v10 = var6_6[var11_13 - 1];
                                        v11 = hd_2.a(28710, 2225998683964904478L);
                                    }
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var6_6[var11_13];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var6_6[var11_13 + 1];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var7_7[var11_13 - 1];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var7_7[var11_13 + 1];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var8_8[var11_13 - 1];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var8_8[var11_13];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 > v11) break block23;
                                    v10 = var8_8[var11_13 + 1];
                                    v11 = hd_2.a(28710, 2225998683964904478L);
                                    if (var3_4 == null) break block22;
                                    if (v10 <= v11) break block21;
                                }
                                v10 = var12_15;
                                if (var3_4 == null) break block24;
                                v11 = hd_2.a(28710, 2225998683964904478L);
                            }
                            v10 = v10 >= v11 ? var12_15 - hd_2.a(28710, 2225998683964904478L) : var12_15;
                            break block24;
                        }
                        v10 = 0;
                    }
                    var12_15 = v10;
                    var9_9[var11_13] = hd_2.a(18295, 1158868333767467848L) | var12_15 << hd_2.a(7697, 2670627301543934509L) | var12_15 << hd_2.a(4866, 7223194307816322879L) | var12_15;
                    ++var11_13;
                    if (var3_4 != null) continue;
                }
                this.E(var2_2, 0, var10_10, var4_3, 1, var9_9);
                var11_14 = var6_6;
                var6_6 = var7_7;
                var7_7 = var8_8;
                var8_8 = var11_14;
                ++var10_10;
                if (var3_4 != null) continue block3;
            }
            break;
        }
        return var2_2;
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
                v0 = "n(\u0004=M`bJ<\u000f9]*\u0000\u0005b".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 15;
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
                                v9 = 36;
                                break;
                            }
                            case 1: {
                                v9 = 67;
                                break;
                            }
                            case 2: {
                                v9 = 108;
                                break;
                            }
                            case 3: {
                                v9 = 87;
                                break;
                            }
                            case 4: {
                                v9 = 49;
                                break;
                            }
                            case 5: {
                                v9 = 64;
                                break;
                            }
                            default: {
                                v9 = 33;
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
                hd_2.a = new String(v10).intern();
                var0_1 = 404225145815324443L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "is\u00f4 a\u00ceh\u0001\u0011 \u00a3>\u0012\u0093\u0012\u0085\u00dcR\u00ca%\u00bd\u00adC\u0085t\u0084\u00ab\u00d3MB4U*\u00dd\u00b9\u009b\u008d\u00ab%+*\u0092\u00b1\u00b8\u00112\u00f4SK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099\u00a0,";
                var5_5 = "is\u00f4 a\u00ceh\u0001\u0011 \u00a3>\u0012\u0093\u0012\u0085\u00dcR\u00ca%\u00bd\u00adC\u0085t\u0084\u00ab\u00d3MB4U*\u00dd\u00b9\u009b\u008d\u00ab%+*\u0092\u00b1\u00b8\u00112\u00f4SK\u0095)\u0000rf-&\u001b\u009d\u0098a\f\u0099\u00a0,".length();
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
                    var4_4 = "\u00caI3B\u00fd\u0001?G\u00a5m]4s?\u00ac\u00f4";
                    var5_5 = "\u00caI3B\u00fd\u0001?G\u00a5m]4s?\u00ac\u00f4".length();
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
        hd_2.b = var6_2;
        hd_2.c = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x643A;
        if (c[n11] == null) {
            hd_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

