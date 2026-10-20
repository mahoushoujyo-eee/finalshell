/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hx_1;
import com.iw_2;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

/*
 * Renamed from com.g9
 */
public class g9_0
extends W5 {
    private int U = g9_0.a(24448, 2388445989474267479L);
    private int G = g9_0.a(15327, 4336918093062542595L);
    private int M = g9_0.a(13037, 876893889398185014L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        int n11;
        block3: {
            BufferedImage bufferedImage3;
            block2: {
                n11 = bufferedImage.getWidth();
                String[] stringArray = W5.q();
                n10 = bufferedImage.getHeight();
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block2;
                if (bufferedImage3 != null) break block3;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        int[] nArray = new int[n11 * n10];
        int[] nArray2 = new int[n11 * n10];
        this.l(bufferedImage, 0, 0, n11, n10, nArray);
        Kernel kernel = hx_1.n(this.U);
        this.G(kernel, nArray, nArray2, n11, n10, true);
        this.G(kernel, nArray2, nArray, n10, n11, true);
        this.E(bufferedImage2, 0, 0, n11, n10, nArray);
        return bufferedImage2;
    }

    /*
     * Unable to fully structure code
     */
    private void G(Kernel var1_1, int[] var2_2, int[] var3_3, int var4_4, int var5_5, boolean var6_6) {
        var8_7 = false;
        var9_8 = var1_1.getKernelData(null);
        var10_9 = var1_1.getWidth();
        var11_10 = var10_9 / 2;
        var12_11 = 0;
        var7_12 = W5.q();
        block0: while (true) {
            v0 = var12_11;
            block1: while (v0 < var5_5) {
                var13_13 = var12_11 * var4_4;
                var14_14 = var12_11;
                for (var15_15 = 0; var15_15 < var4_4; ++var15_15) {
                    block29: {
                        var16_16 = 0.0f;
                        var17_17 = 0.0f;
                        var18_18 = 0.0f;
                        var19_19 = 0.0f;
                        var20_20 = var11_10;
                        var21_21 = var2_2[var13_13 + var15_15];
                        var22_22 = var21_21 >> g9_0.a(32496, 4715036468167790634L) & g9_0.a(18815, 3460302960543066023L);
                        var23_23 = var21_21 >> g9_0.a(7624, 8204524946981565207L) & g9_0.a(9097, 1909565566546709844L);
                        var24_24 = var21_21 >> g9_0.a(23209, 817311701487350896L) & g9_0.a(9097, 1909565566546709844L);
                        var25_25 = var21_21 & g9_0.a(9097, 1909565566546709844L);
                        var26_26 = 0.0f;
                        var27_27 = 0.0f;
                        var28_28 = 0.0f;
                        var29_29 = 0.0f;
                        v0 = -var11_10;
                        if (var7_12 == null) continue block1;
                        var30_30 = v0;
                        while (var30_30 <= var11_10) {
                            block30: {
                                block31: {
                                    block40: {
                                        block41: {
                                            block38: {
                                                block39: {
                                                    block36: {
                                                        block37: {
                                                            block34: {
                                                                block35: {
                                                                    block32: {
                                                                        block33: {
                                                                            var31_32 = var9_8[var20_20 + var30_30];
                                                                            if (var7_12 == null) break block30;
                                                                            cfr_temp_0 = var31_32 - 0.0f;
                                                                            v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                            if (var7_12 == null) break block29;
                                                                            if (v1 == false) break block31;
                                                                            var32_33 = var15_15 + var30_30;
                                                                            v2 = 0;
                                                                            if (var7_12 == null) break block32;
                                                                            if (v2 > var32_33) break block33;
                                                                            v3 = var32_33;
                                                                            if (var7_12 == null) break block34;
                                                                            if (v3 < var4_4) break block35;
                                                                        }
                                                                        v2 = var15_15;
                                                                    }
                                                                    var32_33 = v2;
                                                                }
                                                                v3 = var2_2[var13_13 + var32_33];
                                                            }
                                                            var33_34 = v3;
                                                            var34_35 = var33_34 >> g9_0.a(11553, 5805021254738871284L) & g9_0.a(9097, 1909565566546709844L);
                                                            var35_36 = var33_34 >> g9_0.a(5282, 8287148059014707836L) & g9_0.a(9097, 1909565566546709844L);
                                                            var36_37 = var33_34 >> g9_0.a(15946, 1653621194678440092L) & g9_0.a(9097, 1909565566546709844L);
                                                            var37_38 = var33_34 & g9_0.a(9097, 1909565566546709844L);
                                                            v4 = var38_39 = var22_22 - var34_35;
                                                            v5 = -this.M;
                                                            if (var7_12 == null) break block36;
                                                            if (v4 < v5) break block37;
                                                            v4 = var38_39;
                                                            v5 = this.M;
                                                            if (var7_12 == null) break block36;
                                                            if (v4 <= v5) {
                                                                var19_19 += var31_32 * (float)var34_35;
                                                                var26_26 += var31_32;
                                                            }
                                                        }
                                                        v4 = var38_39 = var23_23 - var35_36;
                                                        v5 = -this.M;
                                                    }
                                                    if (var7_12 == null) break block38;
                                                    if (v4 < v5) break block39;
                                                    v4 = var38_39;
                                                    v5 = this.M;
                                                    if (var7_12 == null) break block38;
                                                    if (v4 <= v5) {
                                                        var16_16 += var31_32 * (float)var35_36;
                                                        var27_27 += var31_32;
                                                    }
                                                }
                                                v4 = var38_39 = var24_24 - var36_37;
                                                v5 = -this.M;
                                            }
                                            if (var7_12 == null) break block40;
                                            if (v4 < v5) break block41;
                                            v4 = var38_39;
                                            v5 = this.M;
                                            if (var7_12 == null) break block40;
                                            if (v4 <= v5) {
                                                var17_17 += var31_32 * (float)var36_37;
                                                var28_28 += var31_32;
                                            }
                                        }
                                        var38_39 = var25_25 - var37_38;
                                        if (var7_12 == null) break block30;
                                        v4 = var38_39;
                                        v5 = -this.M;
                                    }
                                    if (v4 >= v5 && var38_39 <= this.M) {
                                        var18_18 += var31_32 * (float)var37_38;
                                        var29_29 += var31_32;
                                    }
                                }
                                ++var30_30;
                            }
                            if (var7_12 != null) continue;
                        }
                        v6 = var26_26;
                        v7 = 0.0f;
                        if (var7_12 == null) ** GOTO lbl114
                        cfr_temp_1 = v6 - v7;
                        v1 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    if (v1 == false) {
                        v8 = var22_22;
                    } else {
                        v6 = var19_19;
                        v7 = var26_26;
lbl114:
                        // 2 sources

                        v8 = v6 / v7;
                    }
                    var19_19 = v8;
                    v9 = var27_27;
                    v10 = 0.0f;
                    if (var7_12 == null) ** GOTO lbl124
                    if (v9 == v10) {
                        v11 = var23_23;
                    } else {
                        v9 = var16_16;
                        v10 = var27_27;
lbl124:
                        // 2 sources

                        v11 = v9 / v10;
                    }
                    var16_16 = v11;
                    v12 = var28_28;
                    v13 = 0.0f;
                    if (var7_12 == null) ** GOTO lbl134
                    if (v12 == v13) {
                        v14 = var24_24;
                    } else {
                        v12 = var17_17;
                        v13 = var28_28;
lbl134:
                        // 2 sources

                        v14 = v12 / v13;
                    }
                    var17_17 = v14;
                    v15 = var29_29;
                    v16 = 0.0f;
                    if (var7_12 == null) ** GOTO lbl144
                    if (v15 == v16) {
                        v17 = var25_25;
                    } else {
                        v15 = var18_18;
                        v16 = var29_29;
lbl144:
                        // 2 sources

                        v17 = v15 / v16;
                    }
                    var18_18 = v17;
                    v18 = var6_6;
                    if (var7_12 != null) {
                        v18 = v18 != 0 ? iw_2.e((int)((double)var19_19 + 0.5)) : g9_0.a(9097, 1909565566546709844L);
                    }
                    var30_30 = v18;
                    var31_31 = iw_2.e((int)((double)var16_16 + 0.5));
                    var32_33 = iw_2.e((int)((double)var17_17 + 0.5));
                    var33_34 = iw_2.e((int)((double)var18_18 + 0.5));
                    var3_3[var14_14] = var30_30 << g9_0.a(11553, 5805021254738871284L) | var31_31 << g9_0.a(5282, 8287148059014707836L) | var32_33 << g9_0.a(15946, 1653621194678440092L) | var33_34;
                    var14_14 += var5_5;
                    if (var7_12 != null) continue;
                }
                ++var12_11;
                if (var7_12 != null) continue block0;
            }
            break;
        }
    }

    public void G(int n10) {
        this.U = n10;
    }

    public int D() {
        return this.U;
    }

    public void W(int n10) {
        this.G = n10;
    }

    public int k() {
        return this.G;
    }

    public void k(int n10) {
        this.U = this.G = n10;
    }

    public int j() {
        return this.U;
    }

    public void p(int n10) {
        this.M = n10;
    }

    public int g() {
        return this.M;
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
                v0 = "o3\u0005z2,,L-\u0004(_\u00134_q^&".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 111;
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
                                v9 = 66;
                                break;
                            }
                            case 1: {
                                v9 = 48;
                                break;
                            }
                            case 2: {
                                v9 = 31;
                                break;
                            }
                            case 3: {
                                v9 = 103;
                                break;
                            }
                            case 4: {
                                v9 = 114;
                                break;
                            }
                            case 5: {
                                v9 = 16;
                                break;
                            }
                            default: {
                                v9 = 46;
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
                g9_0.a = new String(v10).intern();
                var0_1 = 464107852149898995L;
                var6_2 = new long[11];
                var3_3 = 0;
                var4_4 = "\u00ad\u00b7\u008d\u00b4\u00b7w\u008d\u00f4\u0096\u0006\u00bb\u00beR~\u0084\u009f*\u00c5\u00e6O\u0005\u0088\u00b3Xj\u009b36\u00e4(+\u00f5t\u000e\u00ac\u00a9_\u0097\"\u00cfz\u00a5\u00a8uL\u00fan\u00c1\u0016\u00ce\u008e\u00a9u1J\u008b\u00bc\u009dx\tz\u00bb\u00d9\u00ab\u001a\u0080y\u00ed\u00ff\f\u00cf\u00a1";
                var5_5 = "\u00ad\u00b7\u008d\u00b4\u00b7w\u008d\u00f4\u0096\u0006\u00bb\u00beR~\u0084\u009f*\u00c5\u00e6O\u0005\u0088\u00b3Xj\u009b36\u00e4(+\u00f5t\u000e\u00ac\u00a9_\u0097\"\u00cfz\u00a5\u00a8uL\u00fan\u00c1\u0016\u00ce\u008e\u00a9u1J\u008b\u00bc\u009dx\tz\u00bb\u00d9\u00ab\u001a\u0080y\u00ed\u00ff\f\u00cf\u00a1".length();
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
                    var4_4 = "\u0083\u0000':\u00ed\u0000\u00aeg\u00a7\u001f\u00d5#\u00da\u0090\u00bd\u001f";
                    var5_5 = "\u0083\u0000':\u00ed\u0000\u00aeg\u00a7\u001f\u00d5#\u00da\u0090\u00bd\u001f".length();
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
        g9_0.b = var6_2;
        g9_0.c = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2EDF;
        if (c[n11] == null) {
            g9_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

