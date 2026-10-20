/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.po_0;
import com.wy_1;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

/*
 * Renamed from com.yS
 */
public class ys_1
extends gt_1 {
    private Random e;
    private long K = f;
    private int C = ys_1.a(17332, 1538895026123534988L);
    private float T = -0.59f;
    private float F = 0.2f;
    private float k = 0.1f;
    private float U = 0.0f;
    private int L = 0;
    private po_0 c = new wy_1();
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;
    private static final long f;

    public ys_1() {
        this.e = new Random();
    }

    public void O() {
        this.K = new Date().getTime();
        this.e.setSeed(this.K);
        this.T = this.e.nextFloat();
        this.F = this.e.nextFloat();
        this.k = this.e.nextFloat();
        this.U = this.e.nextFloat();
        this.L = this.e.nextInt() % ys_1.a(19264, 3875235779454368377L) - ys_1.a(12597, 990897168677535759L);
    }

    public void g(int n10) {
        this.C = n10;
    }

    public int N() {
        return this.C;
    }

    public void e(float f10) {
        this.T = f10;
    }

    public float X() {
        return this.T;
    }

    public void h(float f10) {
        this.F = f10;
    }

    public float G() {
        return this.F;
    }

    public void U(float f10) {
        this.k = f10;
    }

    public float e() {
        return this.k;
    }

    public void s(float f10) {
        this.U = f10;
    }

    public float L() {
        return this.U;
    }

    public void t(int n10) {
        this.L = n10;
    }

    public int v() {
        return this.L;
    }

    public void W(po_0 po_02) {
        this.c = po_02;
    }

    public po_0 u() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected int[] K(int var1_1, int var2_2, int[] var3_3, Rectangle var4_4) {
        block27: {
            block20: {
                block19: {
                    var6_5 = new int[var1_1 * var2_2];
                    var7_6 = false;
                    var8_7 = 0;
                    var9_8 = 0.1f;
                    var10_9 = 0.3f;
                    var5_10 = W5.q();
                    for (var11_11 = 0; var11_11 < ys_1.a(29699, 1674709265105208632L); ++var11_11) {
                        var12_12 = 3.1415927f * var9_8;
                        var13_13 = 3.1415927f * var10_9;
                        var14_14 = (float)Math.sin(2.0f * var12_12);
                        var15_15 = (float)Math.sin(2.0f * var13_13);
                        v0 = var16_16 = (float)((double)(this.T * var14_14) + (double)(this.F * var14_14) * Math.cos(2.0f * var13_13) + (double)this.k * Math.sin(4.0f * var12_12) + (double)this.U * Math.sin(6.0f * var12_12) * Math.cos(4.0f * var13_13) + (double)((float)this.L * var9_8));
                        v1 = 0.0f;
                        if (var5_10 == null) ** GOTO lbl23
                        cfr_temp_0 = v0 - v1;
                        v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var5_10 == null) break block19;
                        if (v2 >= 0) {
                            v3 = var16_16 - (float)((int)var16_16);
                        } else {
                            v0 = var16_16 - (float)((int)var16_16);
                            v1 = 1.0f;
lbl23:
                            // 2 sources

                            v3 = v0 + v1;
                        }
                        var16_16 = v3;
                        v4 = var17_19 = (float)((double)(this.T * var15_15) + (double)(this.F * var15_15) * Math.cos(2.0f * var12_12) + (double)this.k * Math.sin(4.0f * var13_13) + (double)this.U * Math.sin(6.0f * var13_13) * Math.cos(4.0f * var12_12) + (double)((float)this.L * var10_9));
                        v5 = 0.0f;
                        if (var5_10 == null) ** GOTO lbl33
                        if (v4 >= v5) {
                            v6 = var17_19 - (float)((int)var17_19);
                        } else {
                            v4 = var17_19 - (float)((int)var17_19);
                            v5 = 1.0f;
lbl33:
                            // 2 sources

                            v6 = v4 + v5;
                        }
                        var17_19 = v6;
                        var9_8 = var16_16;
                        var10_9 = var17_19;
                        if (var5_10 != null) continue;
                    }
                    v2 = var11_11 = 0;
                }
                while (var11_11 < this.C) {
                    block22: {
                        block23: {
                            block26: {
                                block25: {
                                    block24: {
                                        var12_12 = 3.1415927f * var9_8;
                                        var13_13 = 3.1415927f * var10_9;
                                        v7 = var14_14 = (float)((double)this.T * Math.sin(2.0f * var12_12) + (double)this.F * Math.sin(2.0f * var12_12) * Math.cos(2.0f * var13_13) + (double)this.k * Math.sin(4.0f * var12_12) + (double)this.U * Math.sin(6.0f * var12_12) * Math.cos(4.0f * var13_13) + (double)((float)this.L * var9_8));
                                        v8 = 0.0f;
                                        if (var5_10 == null) ** GOTO lbl54
                                        cfr_temp_1 = v7 - v8;
                                        v9 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                        if (var5_10 == null) break block20;
                                        if (v9 >= 0) {
                                            v10 = var14_14 - (float)((int)var14_14);
                                        } else {
                                            v7 = var14_14 - (float)((int)var14_14);
                                            v8 = 1.0f;
lbl54:
                                            // 2 sources

                                            v10 = v7 + v8;
                                        }
                                        var14_14 = v10;
                                        v11 = var15_15 = (float)((double)this.T * Math.sin(2.0f * var13_13) + (double)this.F * Math.sin(2.0f * var13_13) * Math.cos(2.0f * var12_12) + (double)this.k * Math.sin(4.0f * var13_13) + (double)this.U * Math.sin(6.0f * var13_13) * Math.cos(4.0f * var12_12) + (double)((float)this.L * var10_9));
                                        v12 = 0.0f;
                                        if (var5_10 == null) ** GOTO lbl64
                                        if (v11 >= v12) {
                                            v13 = var15_15 - (float)((int)var15_15);
                                        } else {
                                            v11 = var15_15 - (float)((int)var15_15);
                                            v12 = 1.0f;
lbl64:
                                            // 2 sources

                                            v13 = v11 + v12;
                                        }
                                        var15_15 = v13;
                                        var9_8 = var14_14;
                                        var10_9 = var15_15;
                                        var16_18 = (int)((float)var1_1 * var9_8);
                                        var17_21 = (int)((float)var2_2 * var10_9);
                                        if (var5_10 == null) break block22;
                                        if (var16_18 < 0) break block23;
                                        v14 = var16_18;
                                        if (var5_10 == null) break block24;
                                        if (v14 >= var1_1) break block23;
                                        v14 = var17_21;
                                    }
                                    if (var5_10 == null) break block25;
                                    if (v14 < 0) break block23;
                                    v14 = var17_21;
                                }
                                if (var5_10 == null) break block26;
                                if (v14 >= var2_2) break block23;
                                v15 = var1_1 * var17_21 + var16_18;
                                v16 = var6_5[v15];
                                v14 = v16;
                                var6_5[v15] = v16 + 1;
                            }
                            var18_22 = v14;
                            if (var5_10 == null) break block22;
                            if (var18_22 > var8_7) {
                                var8_7 = var18_22;
                            }
                        }
                        ++var11_11;
                    }
                    if (var5_10 != null) continue;
                }
                if (this.c == null) break block27;
                v9 = 0;
            }
            var11_11 = v9;
            var10_9 = 0.0f;
            while (var10_9 < (float)var2_2) {
                block21: {
                    for (var9_8 = 0.0f; var9_8 < (float)var1_1; var9_8 += 1.0f) {
                        var6_5[var11_11] = this.c.D((float)var6_5[var11_11] / (float)var8_7);
                        ++var11_11;
                        if (var5_10 != null) {
                            if (var5_10 != null) continue;
                        }
                        break block21;
                    }
                    var10_9 += 1.0f;
                }
                if (var5_10 != null) continue;
            }
        }
        return var6_5;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    v0 = "1/\u00037sZEJ\t\u0013\"i\\I\u0006j*6oDTKdU".toCharArray();
                    v1 = v0.length;
                    var10 = 0;
                    v2 = 121;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl54
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var10;
                        while (true) {
                            switch (var10 % 7) {
                                case 0: {
                                    v9 = 28;
                                    break;
                                }
                                case 1: {
                                    v9 = 51;
                                    break;
                                }
                                case 2: {
                                    v9 = 2;
                                    break;
                                }
                                case 3: {
                                    v9 = 58;
                                    break;
                                }
                                case 4: {
                                    v9 = 127;
                                    break;
                                }
                                case 5: {
                                    v9 = 81;
                                    break;
                                }
                                default: {
                                    v9 = 89;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var10;
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
                    } while (v4 > var10);
                    ** while (true)
                    ys_1.a = new String(v10).intern();
                    var2_1 = 7049120754019460150L;
                    var8_2 = new long[4];
                    var5_3 = 0;
                    var6_4 = "\u00b2\u0099\u00fd\u00b2\u00c9\u00de\u00e43\u00dc\u0095c\u00e4z\u008f!\u001a";
                    var7_5 = "\u00b2\u0099\u00fd\u00b2\u00c9\u00de\u00e43\u00dc\u0095c\u00e4z\u008f!\u001a".length();
                    var4_6 = 0;
                    while (true) {
                        var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                        v11 = var8_2;
                        v12 = var5_3++;
                        v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        var6_4 = "\u00b0;D\u00ee(\u009c\u00f7\u0012\u00e7\u000e\u007f|\u008dk\u001e[";
                        var7_5 = "\u00b0;D\u00ee(\u009c\u00f7\u0012\u00e7\u000e\u007f|\u008dk\u001e[".length();
                        var4_6 = 0;
                        while (true) {
                            var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                            v11 = var8_2;
                            v12 = var5_3++;
                            v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl88:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var2_1;
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
            ys_1.b = var8_2;
            ys_1.d = new Integer[4];
            break block22;
lbl104:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 6032348651970375071L;
        ** while (true)
        ys_1.f = 6032348651970375592L ^ var0_8;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x313A;
        if (d[n11] == null) {
            ys_1.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

