/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hg
 */
public class hg_2
extends W5 {
    private int O = 0;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void p(int n10) {
        this.O = n10;
    }

    public int R() {
        return this.O;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage filter(BufferedImage var1_1, BufferedImage var2_2) {
        block17: {
            block18: {
                block22: {
                    block23: {
                        block21: {
                            block20: {
                                var4_3 = var1_1.getWidth();
                                var3_4 = W5.q();
                                var5_5 = var1_1.getHeight();
                                v0 = var2_2;
                                if (var3_4 == null) break block20;
                                if (v0 != null) break block21;
                                v0 = this.createCompatibleDestImage(var1_1, null);
                            }
                            var2_2 = v0;
                        }
                        var6_6 = null;
                        v1 = this.O;
                        if (var3_4 == null) break block22;
                        if (v1 != 0) break block23;
                        var7_7 = 0;
                        while (var7_7 < var5_5 - 1) {
                            var6_6 = this.l(var1_1, 0, var7_7, var4_3, 1, var6_6);
                            if (var3_4 != null) {
                                v2 = var1_1;
                                if (var3_4 == null) break block17;
                                if (v2 != var2_2) {
                                    this.E(var2_2, 0, var7_7, var4_3, 1, var6_6);
                                }
                                this.E(var2_2, 0, var7_7 + 1, var4_3, 1, var6_6);
                                var7_7 += 2;
                            }
                            if (var3_4 != null) continue;
                            break block18;
                        }
                        break block18;
                    }
                    v1 = this.O;
                }
                v3 = 1;
                if (var3_4 == null) ** GOTO lbl49
                if (v1 == v3) {
                    var7_8 = 1;
                    while (var7_8 < var5_5) {
                        var6_6 = this.l(var1_1, 0, var7_8, var4_3, 1, var6_6);
                        if (var3_4 != null) {
                            v2 = var1_1;
                            if (var3_4 == null) break block17;
                            if (v2 != var2_2) {
                                this.E(var2_2, 0, var7_8, var4_3, 1, var6_6);
                            }
                            this.E(var2_2, 0, var7_8 - 1, var4_3, 1, var6_6);
                            var7_8 += 2;
                        }
                        if (var3_4 != null) continue;
                        break;
                    }
                } else {
                    v1 = this.O;
                    v3 = 2;
lbl49:
                    // 2 sources

                    if (v1 == v3) {
                        var7_9 = null;
                        var8_10 = 0;
                        while (var8_10 < var5_5 - 1) {
                            block19: {
                                var6_6 = this.l(var1_1, 0, var8_10, var4_3, 1, var6_6);
                                var7_9 = this.l(var1_1, 0, var8_10 + 1, var4_3, 1, var7_9);
                                for (var9_11 = 0; var9_11 < var4_3; ++var9_11) {
                                    var10_12 = var6_6[var9_11];
                                    var11_13 = var7_9[var9_11];
                                    var12_14 = var10_12 >> hg_2.a(22020, 6660909736900286392L) & hg_2.a(24997, 7304224409362096159L);
                                    var13_15 = var10_12 >> hg_2.a(9962, 2064359976056235863L) & hg_2.a(16636, 5308548976213934404L);
                                    var14_16 = var10_12 >> hg_2.a(13648, 6918645394162169070L) & hg_2.a(16636, 5308548976213934404L);
                                    var15_17 = var10_12 & hg_2.a(16636, 5308548976213934404L);
                                    var16_18 = var11_13 >> hg_2.a(9253, 3531568273899857310L) & hg_2.a(16636, 5308548976213934404L);
                                    var17_19 = var11_13 >> hg_2.a(25099, 5257327558478455730L) & hg_2.a(16636, 5308548976213934404L);
                                    var18_20 = var11_13 >> hg_2.a(31220, 1515940004305631307L) & hg_2.a(16636, 5308548976213934404L);
                                    var19_21 = var11_13 & hg_2.a(16636, 5308548976213934404L);
                                    var12_14 = (var12_14 + var16_18) / 2;
                                    var13_15 = (var13_15 + var17_19) / 2;
                                    var14_16 = (var14_16 + var18_20) / 2;
                                    var15_17 = (var15_17 + var19_21) / 2;
                                    var6_6[var9_11] = var12_14 << hg_2.a(9253, 3531568273899857310L) | var13_15 << hg_2.a(25099, 5257327558478455730L) | var14_16 << hg_2.a(31220, 1515940004305631307L) | var15_17;
                                    if (var3_4 != null) {
                                        if (var3_4 != null) continue;
                                    }
                                    break block19;
                                }
                                this.E(var2_2, 0, var8_10, var4_3, 1, var6_6);
                                this.E(var2_2, 0, var8_10 + 1, var4_3, 1, var6_6);
                                var8_10 += 2;
                            }
                            if (var3_4 != null) continue;
                        }
                    }
                }
            }
            v2 = var2_2;
        }
        return v2;
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
                v0 = "8\"\u0017)qj]\u000bf:\"j k\u0002*\u0010)".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 67;
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
                                v9 = 45;
                                break;
                            }
                            case 1: {
                                v9 = 8;
                                break;
                            }
                            case 2: {
                                v9 = 48;
                                break;
                            }
                            case 3: {
                                v9 = 15;
                                break;
                            }
                            case 4: {
                                v9 = 93;
                                break;
                            }
                            case 5: {
                                v9 = 6;
                                break;
                            }
                            default: {
                                v9 = 90;
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
                hg_2.a = new String(v10).intern();
                var0_1 = 6320435293349515449L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00ed\u000e\u009f\u0087\u001a3pY]\u00e7\u00a1\u0088\u00d4'\u00b5?v\u00e1p\u00fcz\u000eQ\u0002k\u00e4F\u0007\u00d3\ns\u001b\u00e0\u000b\u0097\u0015\u00d0\u001d$_pis\u0092t\u0080h\u00fa";
                var5_5 = "\u00ed\u000e\u009f\u0087\u001a3pY]\u00e7\u00a1\u0088\u00d4'\u00b5?v\u00e1p\u00fcz\u000eQ\u0002k\u00e4F\u0007\u00d3\ns\u001b\u00e0\u000b\u0097\u0015\u00d0\u001d$_pis\u0092t\u0080h\u00fa".length();
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
                    var4_4 = "o\u00a5\u00f5\\\u00d9\u0011G\u0019\u00b5\u00a5 \u00b2p\u00ad7\u00fe";
                    var5_5 = "o\u00a5\u00f5\\\u00d9\u0011G\u0019\u00b5\u00a5 \u00b2p\u00ad7\u00fe".length();
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
        hg_2.b = var6_2;
        hg_2.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1BA;
        if (c[n11] == null) {
            hg_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

