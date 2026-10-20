/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.ra_1;
import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class B0
implements CompositeContext {
    private int U;
    private float C;
    private ColorModel f;
    private ColorModel Z;
    private ColorSpace B;
    private ColorSpace h;
    private static final long[] a;
    private static final Integer[] b;

    public B0(int n10, float f10, ColorModel colorModel, ColorModel colorModel2) {
        this.U = n10;
        this.C = f10;
        this.f = colorModel;
        this.Z = colorModel2;
        this.B = colorModel.getColorSpace();
        this.h = colorModel2.getColorSpace();
        ColorModel colorModel3 = ColorModel.getRGBdefault();
    }

    @Override
    public void dispose() {
    }

    static int w(int n10, int n11) {
        int n12 = n10 * n11 + B0.a(4594, 9184578496501369578L);
        return (n12 >> B0.a(3469, 6500804454187882132L)) + n12 >> B0.a(3469, 6500804454187882132L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int w(int n10) {
        String string = ra_1.c();
        int n11 = n10;
        if (string == null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (string != null) return n11;
        n11 = n11 > B0.a(1920, 4693531603399236758L) ? B0.a(1920, 4693531603399236758L) : n10;
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void compose(Raster var1_1, Raster var2_2, WritableRaster var3_3) {
        var5_4 = 0.0f;
        var6_5 = 0.0f;
        var7_6 = this.C;
        var9_7 = null;
        var10_8 = null;
        var11_9 = null;
        var4_10 = ra_1.c();
        v0 = this.U;
        if (var4_10 != null) ** GOTO lbl13
        switch (v0) {
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                v0 = 3;
lbl13:
                // 2 sources

                var9_7 = new float[v0];
                var10_8 = new float[3];
                var11_9 = new float[3];
            }
        }
        var12_11 = null;
        var13_12 = null;
        var14_13 = var3_3.getMinX();
        var15_14 = var3_3.getWidth();
        var16_15 = var3_3.getMinY();
        var17_16 = var16_15 + var3_3.getHeight();
        var18_17 = var16_15;
        block29: while (true) {
            v1 = var18_17;
            block30: while (v1 < var17_16) {
                var12_11 = var1_1.getPixels(var14_13, var18_17, var15_14, 1, var12_11);
                var13_12 = var2_2.getPixels(var14_13, var18_17, var15_14, 1, var13_12);
                var19_19 = 0;
                var20_20 = var15_14 * 4;
                while (var19_19 < var20_20) {
                    block88: {
                        block89: {
                            block87: {
                                var21_21 = var12_11[var19_19];
                                var22_22 = var13_12[var19_19];
                                var23_23 = var12_11[var19_19 + 1];
                                var24_24 = var13_12[var19_19 + 1];
                                var25_25 = var12_11[var19_19 + 2];
                                var26_26 = var13_12[var19_19 + 2];
                                var27_27 = var12_11[var19_19 + 3];
                                var28_28 = var13_12[var19_19 + 3];
                                v1 = this.U;
                                if (var4_10 != null) continue block30;
                                if (var4_10 != null) break block87;
                                switch (v1) {
                                    default: {
                                        v2 = var29_29 = var22_22 + var21_21;
                                        v3 = B0.a(883, 5993752115107846248L);
                                        if (var4_10 == null) {
                                            if (v2 > v3) {
                                                var29_29 = B0.a(1920, 4693531603399236758L);
                                            }
                                            v2 = var24_24;
                                            v3 = var23_23;
                                        }
                                        v4 = var30_30 = v2 + v3;
                                        v5 = B0.a(1920, 4693531603399236758L);
                                        if (var4_10 == null) {
                                            if (v4 > v5) {
                                                var30_30 = B0.a(1920, 4693531603399236758L);
                                            }
                                            v4 = var26_26;
                                            v5 = var25_25;
                                        }
                                        var31_31 = v4 + v5;
                                        if (var4_10 != null) break block88;
                                        if (var31_31 <= B0.a(1920, 4693531603399236758L)) break block89;
                                        var31_31 = B0.a(1920, 4693531603399236758L);
                                        if (var4_10 == null) break block89;
                                        ky_2.K(new String[5]);
                                    }
                                    case 2: {
                                        v6 = var29_29 = var22_22 - var21_21;
                                        if (var4_10 == null) {
                                            if (v6 < 0) {
                                                var29_29 = 0;
                                            }
                                            v6 = var24_24 - var23_23;
                                        }
                                        v7 = var30_30 = v6;
                                        if (var4_10 == null) {
                                            if (v7 < 0) {
                                                var30_30 = 0;
                                            }
                                            v7 = var31_31 = var26_26 - var25_25;
                                        }
                                        if (var4_10 != null) break block88;
                                        if (var31_31 >= 0) break block89;
                                        var31_31 = 0;
                                        if (var4_10 == null) break block89;
                                    }
                                    case 3: {
                                        v8 = var29_29 = var22_22 - var21_21;
                                        if (var4_10 == null) {
                                            if (v8 < 0) {
                                                var29_29 = -var29_29;
                                            }
                                            v8 = var24_24 - var23_23;
                                        }
                                        v9 = var30_30 = v8;
                                        if (var4_10 == null) {
                                            if (v9 < 0) {
                                                var30_30 = -var30_30;
                                            }
                                            v9 = var31_31 = var26_26 - var25_25;
                                        }
                                        if (var4_10 != null) break block88;
                                        if (var31_31 >= 0) break block89;
                                        var31_31 = -var31_31;
                                        if (var4_10 == null) break block89;
                                    }
                                    case 4: {
                                        var8_18 = var22_22 * var21_21 + B0.a(28687, 8852175052652194581L);
                                        var29_29 = (var8_18 >> B0.a(12818, 5673437579610843394L)) + var8_18 >> B0.a(3469, 6500804454187882132L);
                                        var8_18 = var24_24 * var23_23 + B0.a(4594, 9184578496501369578L);
                                        var30_30 = (var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L);
                                        var8_18 = var26_26 * var25_25 + B0.a(4594, 9184578496501369578L);
                                        var31_31 = (var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L);
                                        if (var4_10 == null) break block89;
                                    }
                                    case 8: {
                                        var8_18 = (B0.a(1920, 4693531603399236758L) - var22_22) * (B0.a(1920, 4693531603399236758L) - var21_21) + B0.a(4594, 9184578496501369578L);
                                        var29_29 = B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        var8_18 = (B0.a(1920, 4693531603399236758L) - var24_24) * (B0.a(1920, 4693531603399236758L) - var23_23) + B0.a(4594, 9184578496501369578L);
                                        var30_30 = B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        var8_18 = (B0.a(1920, 4693531603399236758L) - var26_26) * (B0.a(1920, 4693531603399236758L) - var25_25) + B0.a(4594, 9184578496501369578L);
                                        var31_31 = B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        if (var4_10 == null) break block89;
                                    }
                                    case 16: {
                                        v10 = var22_22;
                                        v11 = B0.a(4594, 9184578496501369578L);
                                        if (var4_10 != null) ** GOTO lbl120
                                        if (v10 >= v11) ** GOTO lbl118
                                        var8_18 = var22_22 * var21_21 + B0.a(4594, 9184578496501369578L);
                                        var29_29 = 2 * ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        if (var4_10 == null) ** GOTO lbl122
lbl118:
                                        // 2 sources

                                        v10 = (B0.a(1920, 4693531603399236758L) - var22_22) * (B0.a(1920, 4693531603399236758L) - var21_21);
                                        v11 = B0.a(4594, 9184578496501369578L);
lbl120:
                                        // 2 sources

                                        var8_18 = v10 + v11;
                                        var29_29 = 2 * (B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L)));
lbl122:
                                        // 2 sources

                                        v12 = var24_24;
                                        v13 = B0.a(4594, 9184578496501369578L);
                                        if (var4_10 != null) ** GOTO lbl132
                                        if (v12 >= v13) ** GOTO lbl129
                                        var8_18 = var24_24 * var23_23 + B0.a(4594, 9184578496501369578L);
                                        var30_30 = 2 * ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        if (var4_10 == null) ** GOTO lbl133
lbl129:
                                        // 2 sources

                                        var8_18 = (B0.a(1920, 4693531603399236758L) - var24_24) * (B0.a(1920, 4693531603399236758L) - var23_23) + B0.a(4594, 9184578496501369578L);
                                        v12 = 2;
                                        v13 = B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
lbl132:
                                        // 2 sources

                                        var30_30 = v12 * v13;
lbl133:
                                        // 2 sources

                                        v14 = var26_26;
                                        v15 = B0.a(4594, 9184578496501369578L);
                                        if (var4_10 != null) ** GOTO lbl143
                                        if (v14 >= v15) ** GOTO lbl140
                                        var8_18 = var26_26 * var25_25 + B0.a(4594, 9184578496501369578L);
                                        var31_31 = 2 * ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
                                        if (var4_10 == null) break block89;
lbl140:
                                        // 2 sources

                                        var8_18 = (B0.a(1920, 4693531603399236758L) - var26_26) * (B0.a(1920, 4693531603399236758L) - var25_25) + B0.a(4594, 9184578496501369578L);
                                        v14 = 2;
                                        v15 = B0.a(1920, 4693531603399236758L) - ((var8_18 >> B0.a(3469, 6500804454187882132L)) + var8_18 >> B0.a(3469, 6500804454187882132L));
lbl143:
                                        // 2 sources

                                        var31_31 = v14 * v15;
                                        if (var4_10 == null) break block89;
                                    }
                                    case 5: {
                                        v16 = var22_22;
                                        if (var4_10 == null) {
                                            v16 = v16 < var21_21 ? var22_22 : var21_21;
                                        }
                                        var29_29 = v16;
                                        v17 = var24_24;
                                        if (var4_10 == null) {
                                            v17 = v17 < var23_23 ? var24_24 : var23_23;
                                        }
                                        var30_30 = v17;
                                        v18 = var26_26;
                                        if (var4_10 == null) {
                                            v18 = var31_31 = v18 < var25_25 ? var26_26 : var25_25;
                                        }
                                        if (var4_10 == null) break block89;
                                    }
                                    case 9: {
                                        v19 = var22_22;
                                        if (var4_10 == null) {
                                            v19 = v19 > var21_21 ? var22_22 : var21_21;
                                        }
                                        var29_29 = v19;
                                        v20 = var24_24;
                                        if (var4_10 == null) {
                                            v20 = v20 > var23_23 ? var24_24 : var23_23;
                                        }
                                        var30_30 = v20;
                                        v21 = var26_26;
                                        if (var4_10 == null) {
                                            v21 = var31_31 = v21 > var25_25 ? var26_26 : var25_25;
                                        }
                                        if (var4_10 == null) break block89;
                                    }
                                    case 22: {
                                        var29_29 = (var22_22 + var21_21) / 2;
                                        var30_30 = (var24_24 + var23_23) / 2;
                                        var31_31 = (var26_26 + var25_25) / 2;
                                        if (var4_10 == null) break block89;
                                    }
                                    case 12: 
                                    case 13: 
                                    case 14: 
                                    case 15: {
                                        Color.RGBtoHSB(var21_21, var23_23, var25_25, var9_7);
                                        Color.RGBtoHSB(var22_22, var24_24, var26_26, var10_8);
                                        v22 = this.U;
                                        if (var4_10 == null) {
                                            switch (v22) {
                                                case 12: {
                                                    var11_9[0] = var9_7[0];
                                                    var11_9[1] = var10_8[1];
                                                    var11_9[2] = var10_8[2];
                                                    if (var4_10 == null) break;
                                                }
                                                case 13: {
                                                    var11_9[0] = var10_8[0];
                                                    var11_9[1] = var9_7[1];
                                                    var11_9[2] = var10_8[2];
                                                    if (var4_10 == null) break;
                                                }
                                                case 14: {
                                                    var11_9[0] = var10_8[0];
                                                    var11_9[1] = var10_8[1];
                                                    var11_9[2] = var9_7[2];
                                                    if (var4_10 == null) break;
                                                }
                                                case 15: {
                                                    var11_9[0] = var9_7[0];
                                                    var11_9[1] = var9_7[1];
                                                    var11_9[2] = var10_8[2];
                                                }
                                            }
                                            v22 = Color.HSBtoRGB(var11_9[0], var11_9[1], var11_9[2]);
                                        }
                                        var33_32 = v22;
                                        var29_29 = (var33_32 & B0.a(26831, 8739112672724890590L)) >> B0.a(20157, 580916132055979434L);
                                        var30_30 = (var33_32 & B0.a(32097, 6522089274815227517L)) >> B0.a(3469, 6500804454187882132L);
                                        var31_31 = var33_32 & B0.a(1920, 4693531603399236758L);
                                        if (var4_10 == null) break block89;
                                    }
                                    case 6: {
                                        v23 = var22_22;
                                        if (var4_10 != null) ** GOTO lbl216
                                        if (v23 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl215
                                        var29_29 = B0.w(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var21_21 << B0.a(3469, 6500804454187882132L)) / (var22_22 + 1));
                                        if (var4_10 == null) ** GOTO lbl217
lbl215:
                                        // 2 sources

                                        v23 = var21_21;
lbl216:
                                        // 2 sources

                                        var29_29 = v23;
lbl217:
                                        // 2 sources

                                        v24 = var24_24;
                                        if (var4_10 != null) ** GOTO lbl223
                                        if (v24 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl222
                                        var30_30 = B0.w(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var23_23 << B0.a(3469, 6500804454187882132L)) / (var24_24 + 1));
                                        if (var4_10 == null) ** GOTO lbl224
lbl222:
                                        // 2 sources

                                        v24 = var23_23;
lbl223:
                                        // 2 sources

                                        var30_30 = v24;
lbl224:
                                        // 2 sources

                                        v25 = var26_26;
                                        if (var4_10 != null) ** GOTO lbl230
                                        if (v25 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl229
                                        var31_31 = B0.w(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var25_25 << B0.a(3469, 6500804454187882132L)) / (var26_26 + 1));
                                        if (var4_10 == null) break block89;
lbl229:
                                        // 2 sources

                                        v25 = var31_31 = var25_25;
lbl230:
                                        // 2 sources

                                        if (var4_10 == null) break block89;
                                    }
                                    case 7: {
                                        v26 = var21_21;
                                        if (var4_10 != null) ** GOTO lbl238
                                        if (v26 == 0) ** GOTO lbl237
                                        var29_29 = Math.max(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var22_22 << B0.a(3469, 6500804454187882132L)) / var21_21, 0);
                                        if (var4_10 == null) ** GOTO lbl239
lbl237:
                                        // 2 sources

                                        v26 = var21_21;
lbl238:
                                        // 2 sources

                                        var29_29 = v26;
lbl239:
                                        // 2 sources

                                        v27 = var23_23;
                                        if (var4_10 != null) ** GOTO lbl245
                                        if (v27 == 0) ** GOTO lbl244
                                        var30_30 = Math.max(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var24_24 << B0.a(3469, 6500804454187882132L)) / var23_23, 0);
                                        if (var4_10 == null) ** GOTO lbl246
lbl244:
                                        // 2 sources

                                        v27 = var23_23;
lbl245:
                                        // 2 sources

                                        var30_30 = v27;
lbl246:
                                        // 2 sources

                                        v28 = var25_25;
                                        if (var4_10 != null) ** GOTO lbl252
                                        if (v28 == 0) ** GOTO lbl251
                                        var31_31 = Math.max(B0.a(1920, 4693531603399236758L) - (B0.a(1920, 4693531603399236758L) - var26_26 << B0.a(3469, 6500804454187882132L)) / var25_25, 0);
                                        if (var4_10 == null) break block89;
lbl251:
                                        // 2 sources

                                        v28 = var31_31 = var25_25;
lbl252:
                                        // 2 sources

                                        if (var4_10 == null) break block89;
                                    }
                                    case 10: {
                                        var29_29 = B0.w((var21_21 << B0.a(3469, 6500804454187882132L)) / (B0.a(29608, 3831650615169951933L) - var22_22));
                                        var30_30 = B0.w((var23_23 << B0.a(3469, 6500804454187882132L)) / (B0.a(3979, 3586955812319417496L) - var24_24));
                                        var31_31 = B0.w((var25_25 << B0.a(3469, 6500804454187882132L)) / (B0.a(3979, 3586955812319417496L) - var26_26));
                                        if (var4_10 == null) break block89;
                                    }
                                    case 11: {
                                        v29 = var21_21;
                                        if (var4_10 != null) ** GOTO lbl265
                                        if (v29 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl264
                                        var29_29 = Math.min((var22_22 << B0.a(3469, 6500804454187882132L)) / (B0.a(1920, 4693531603399236758L) - var21_21), B0.a(1920, 4693531603399236758L));
                                        if (var4_10 == null) ** GOTO lbl266
lbl264:
                                        // 2 sources

                                        v29 = var21_21;
lbl265:
                                        // 2 sources

                                        var29_29 = v29;
lbl266:
                                        // 2 sources

                                        v30 = var23_23;
                                        if (var4_10 != null) ** GOTO lbl272
                                        if (v30 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl271
                                        var30_30 = Math.min((var24_24 << B0.a(3469, 6500804454187882132L)) / (B0.a(1920, 4693531603399236758L) - var23_23), B0.a(1920, 4693531603399236758L));
                                        if (var4_10 == null) ** GOTO lbl273
lbl271:
                                        // 2 sources

                                        v30 = var23_23;
lbl272:
                                        // 2 sources

                                        var30_30 = v30;
lbl273:
                                        // 2 sources

                                        v31 = var25_25;
                                        if (var4_10 != null) ** GOTO lbl279
                                        if (v31 == B0.a(1920, 4693531603399236758L)) ** GOTO lbl278
                                        var31_31 = Math.min((var26_26 << B0.a(3469, 6500804454187882132L)) / (B0.a(1920, 4693531603399236758L) - var25_25), B0.a(1920, 4693531603399236758L));
                                        if (var4_10 == null) break block89;
lbl278:
                                        // 2 sources

                                        v31 = var31_31 = var25_25;
lbl279:
                                        // 2 sources

                                        if (var4_10 == null) break block89;
                                    }
                                    case 17: {
                                        var34_33 = B0.w(var21_21, var22_22);
                                        var29_29 = var34_33 + B0.w(var22_22, B0.a(1920, 4693531603399236758L) - B0.w(B0.a(1920, 4693531603399236758L) - var22_22, B0.a(1920, 4693531603399236758L) - var21_21) - var34_33);
                                        var34_33 = B0.w(var23_23, var24_24);
                                        var30_30 = var34_33 + B0.w(var24_24, B0.a(1920, 4693531603399236758L) - B0.w(B0.a(1920, 4693531603399236758L) - var24_24, B0.a(1920, 4693531603399236758L) - var23_23) - var34_33);
                                        var34_33 = B0.w(var25_25, var26_26);
                                        var31_31 = var34_33 + B0.w(var26_26, B0.a(1920, 4693531603399236758L) - B0.w(B0.a(1920, 4693531603399236758L) - var26_26, B0.a(1920, 4693531603399236758L) - var25_25) - var34_33);
                                        if (var4_10 == null) break block89;
                                    }
                                    case 18: {
                                        v32 = var21_21;
                                        v33 = B0.a(8372, 5217043393041431456L);
                                        if (var4_10 != null) ** GOTO lbl297
                                        if (v32 <= v33) ** GOTO lbl295
                                        var29_29 = B0.a(1920, 4693531603399236758L) - 2 * B0.w(B0.a(1920, 4693531603399236758L) - var21_21, B0.a(1920, 4693531603399236758L) - var22_22);
                                        if (var4_10 == null) ** GOTO lbl298
lbl295:
                                        // 2 sources

                                        v32 = 2;
                                        v33 = B0.w(var21_21, var22_22);
lbl297:
                                        // 2 sources

                                        var29_29 = v32 * v33;
lbl298:
                                        // 2 sources

                                        v34 = var23_23;
                                        v35 = B0.a(23102, 8787479600625680684L);
                                        if (var4_10 != null) ** GOTO lbl306
                                        if (v34 <= v35) ** GOTO lbl304
                                        var30_30 = B0.a(1920, 4693531603399236758L) - 2 * B0.w(B0.a(1920, 4693531603399236758L) - var23_23, B0.a(1920, 4693531603399236758L) - var24_24);
                                        if (var4_10 == null) ** GOTO lbl307
lbl304:
                                        // 2 sources

                                        v34 = 2;
                                        v35 = B0.w(var23_23, var24_24);
lbl306:
                                        // 2 sources

                                        var30_30 = v34 * v35;
lbl307:
                                        // 2 sources

                                        v36 = var25_25;
                                        v37 = B0.a(23102, 8787479600625680684L);
                                        if (var4_10 != null) ** GOTO lbl315
                                        if (v36 <= v37) ** GOTO lbl313
                                        var31_31 = B0.a(1920, 4693531603399236758L) - 2 * B0.w(B0.a(1920, 4693531603399236758L) - var25_25, B0.a(1920, 4693531603399236758L) - var26_26);
                                        if (var4_10 == null) break block89;
lbl313:
                                        // 2 sources

                                        v36 = 2;
                                        v37 = B0.w(var25_25, var26_26);
lbl315:
                                        // 2 sources

                                        var31_31 = v36 * v37;
                                        if (var4_10 == null) break block89;
                                    }
                                    case 19: {
                                        v38 = var21_21;
                                        v39 = B0.a(23102, 8787479600625680684L);
                                        if (var4_10 != null) ** GOTO lbl326
                                        if (v38 > v39) {
                                            v40 = Math.max(var21_21, var22_22);
                                        } else {
                                            v38 = var21_21;
                                            v39 = var22_22;
lbl326:
                                            // 2 sources

                                            v40 = Math.min(v38, v39);
                                        }
                                        var29_29 = v40;
                                        v41 = var23_23;
                                        v42 = B0.a(23102, 8787479600625680684L);
                                        if (var4_10 != null) ** GOTO lbl336
                                        if (v41 > v42) {
                                            v43 = Math.max(var23_23, var24_24);
                                        } else {
                                            v41 = var23_23;
                                            v42 = var24_24;
lbl336:
                                            // 2 sources

                                            v43 = Math.min(v41, v42);
                                        }
                                        var30_30 = v43;
                                        v44 = var25_25;
                                        v45 = B0.a(23102, 8787479600625680684L);
                                        if (var4_10 != null) ** GOTO lbl346
                                        if (v44 > v45) {
                                            v46 = Math.max(var25_25, var26_26);
                                        } else {
                                            v44 = var25_25;
                                            v45 = var26_26;
lbl346:
                                            // 2 sources

                                            v46 = var31_31 = Math.min(v44, v45);
                                        }
                                        if (var4_10 == null) break block89;
                                    }
                                    case 20: {
                                        var29_29 = var22_22 + B0.w(var21_21, B0.a(1920, 4693531603399236758L) - var22_22 - var22_22);
                                        var30_30 = var24_24 + B0.w(var23_23, B0.a(1920, 4693531603399236758L) - var24_24 - var24_24);
                                        var31_31 = var26_26 + B0.w(var25_25, B0.a(1920, 4693531603399236758L) - var26_26 - var26_26);
                                        if (var4_10 == null) break block89;
                                    }
                                    case 21: {
                                        v47 = B0.a(1920, 4693531603399236758L) - Math.abs(B0.a(1920, 4693531603399236758L) - var21_21 - var22_22);
                                    }
                                }
                            }
                            var29_29 = v47;
                            var30_30 = B0.a(1920, 4693531603399236758L) - Math.abs(B0.a(1920, 4693531603399236758L) - var23_23 - var24_24);
                            var31_31 = B0.a(1920, 4693531603399236758L) - Math.abs(B0.a(1920, 4693531603399236758L) - var25_25 - var26_26);
                        }
                        var5_4 = var7_6 * (float)var27_27 / 255.0f;
                        var6_5 = 1.0f - var5_4;
                        var13_12[var19_19] = (int)(var5_4 * (float)var29_29 + var6_5 * (float)var22_22);
                        var13_12[var19_19 + 1] = (int)(var5_4 * (float)var30_30 + var6_5 * (float)var24_24);
                        var13_12[var19_19 + 2] = (int)(var5_4 * (float)var31_31 + var6_5 * (float)var26_26);
                        var13_12[var19_19 + 3] = (int)((float)var27_27 * var7_6 + (float)var28_28 * var6_5);
                        var19_19 += 4;
                    }
                    if (var4_10 == null) continue;
                }
                var3_3.setPixels(var14_13, var18_17, var15_14, 1, var13_12);
                ++var18_17;
                if (var4_10 == null) continue block29;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 767567692299049190L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "\u00b9Vc!\u00bc\u0083q\u00ec|\u00b4\\*U\u0093\u00ab8\u00b3\u00b2P\u008fZ\u00c4\u0019\u00b5t\u008b\u00ef\u00d4R\u00dfM~\u001bD\u00df\u0002\u00f4\u0085c9n\u00ed\u00a1\u00e4$\u0011\u00b1[\u00ac\u00b3:\u00db\u00e2#D\u008f\u00eev\u00fb\u00ba7\u00f0\u008d\\\u0088N\u00f7\u00ac\u00df*\u00d2\u008c\u00b4\u00e55\u00b7\u008e\u00a8Nzl\u0017\u00d9\u009c\u00e6e\u00b3s";
                var5_4 = "\u00b9Vc!\u00bc\u0083q\u00ec|\u00b4\\*U\u0093\u00ab8\u00b3\u00b2P\u008fZ\u00c4\u0019\u00b5t\u008b\u00ef\u00d4R\u00dfM~\u001bD\u00df\u0002\u00f4\u0085c9n\u00ed\u00a1\u00e4$\u0011\u00b1[\u00ac\u00b3:\u00db\u00e2#D\u008f\u00eev\u00fb\u00ba7\u00f0\u008d\\\u0088N\u00f7\u00ac\u00df*\u00d2\u008c\u00b4\u00e55\u00b7\u008e\u00a8Nzl\u0017\u00d9\u009c\u00e6e\u00b3s".length();
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
                    var4_3 = "m*\u008fr\u00042\u00c0q\u00ad\u00b1\u00c9{\n2\u00c1\u009b";
                    var5_4 = "m*\u008fr\u00042\u00c0q\u00ad\u00b1\u00c9{\n2\u00c1\u009b".length();
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
        B0.a = var6_1;
        B0.b = new Integer[13];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5B10;
        if (b[n11] == null) {
            B0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

