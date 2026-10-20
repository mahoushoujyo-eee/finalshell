/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zH;
import java.awt.Color;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.di
 */
public class di_2
implements CompositeContext {
    private int Z;
    private float r;
    private ColorModel p;
    private ColorModel N;
    private static final long[] a;
    private static final Integer[] b;

    public di_2(int n10, float f10, ColorModel colorModel, ColorModel colorModel2) {
        this.Z = n10;
        this.r = f10;
        this.p = colorModel;
        this.N = colorModel2;
    }

    @Override
    public void dispose() {
    }

    static int N(int n10, int n11) {
        int n12 = n10 * n11 + di_2.a(31172, 2028901699679707892L);
        return (n12 >> di_2.a(6724, 227922682202980732L)) + n12 >> di_2.a(14759, 7758752785333953169L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int F(int n10) {
        String[] stringArray = zH.U();
        int n11 = n10;
        if (stringArray == null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (stringArray != null) return n11;
        n11 = n11 > di_2.a(12984, 7134358132718119297L) ? di_2.a(12984, 7134358132718119297L) : n10;
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void compose(Raster var1_1, Raster var2_2, WritableRaster var3_3) {
        var7_4 = this.r;
        var9_5 = null;
        var4_6 = zH.U();
        var10_7 = null;
        var11_8 = null;
        v0 = this.Z;
        if (var4_6 != null) ** GOTO lbl11
        switch (v0) {
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                v0 = 3;
lbl11:
                // 2 sources

                var9_5 = new float[v0];
                var10_7 = new float[3];
                var11_8 = new float[3];
            }
        }
        var12_9 = null;
        var13_10 = null;
        var14_11 = var3_3.getMinX();
        var15_12 = var3_3.getWidth();
        var16_13 = var3_3.getMinY();
        var17_14 = var16_13 + var3_3.getHeight();
        var18_15 = var16_13;
        block29: while (true) {
            v1 = var18_15;
            block30: while (v1 < var17_14) {
                var12_9 = var1_1.getPixels(var14_11, var18_15, var15_12, 1, var12_9);
                var13_10 = var2_2.getPixels(var14_11, var18_15, var15_12, 1, var13_10);
                var20_20 = var15_12 * 4;
                for (var19_19 = 0; var19_19 < var20_20; var19_19 += 4) {
                    block88: {
                        block87: {
                            var21_21 = var12_9[var19_19];
                            var22_22 = var13_10[var19_19];
                            var23_23 = var12_9[var19_19 + 1];
                            var24_24 = var13_10[var19_19 + 1];
                            var25_25 = var12_9[var19_19 + 2];
                            var26_26 = var13_10[var19_19 + 2];
                            var27_27 = var12_9[var19_19 + 3];
                            var28_28 = var13_10[var19_19 + 3];
                            v1 = this.Z;
                            if (var4_6 != null) continue block30;
                            if (var4_6 != null) break block87;
                            switch (v1) {
                                default: {
                                    v2 = var29_29 = var22_22 + var21_21;
                                    v3 = di_2.a(29437, 997071911514270156L);
                                    if (var4_6 == null) {
                                        if (v2 > v3) {
                                            var29_29 = di_2.a(12984, 7134358132718119297L);
                                        }
                                        v2 = var24_24;
                                        v3 = var23_23;
                                    }
                                    v4 = var30_30 = v2 + v3;
                                    v5 = di_2.a(12984, 7134358132718119297L);
                                    if (var4_6 == null) {
                                        if (v4 > v5) {
                                            var30_30 = di_2.a(12984, 7134358132718119297L);
                                        }
                                        v4 = var26_26;
                                        v5 = var25_25;
                                    }
                                    v6 = var31_31 = v4 + v5;
                                    if (var4_6 != null) ** GOTO lbl59
                                    if (v6 <= di_2.a(12984, 7134358132718119297L)) break block88;
                                    v6 = var31_31 = di_2.a(12984, 7134358132718119297L);
lbl59:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 2: {
                                    v7 = var29_29 = var22_22 - var21_21;
                                    if (var4_6 == null) {
                                        if (v7 < 0) {
                                            var29_29 = 0;
                                        }
                                        v7 = var24_24 - var23_23;
                                    }
                                    v8 = var30_30 = v7;
                                    if (var4_6 == null) {
                                        if (v8 < 0) {
                                            var30_30 = 0;
                                        }
                                        v8 = var26_26 - var25_25;
                                    }
                                    v9 = var31_31 = v8;
                                    if (var4_6 != null) ** GOTO lbl75
                                    if (v9 >= 0) break block88;
                                    v9 = var31_31 = 0;
lbl75:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 3: {
                                    v10 = var29_29 = var22_22 - var21_21;
                                    if (var4_6 == null) {
                                        if (v10 < 0) {
                                            var29_29 = -var29_29;
                                        }
                                        v10 = var24_24 - var23_23;
                                    }
                                    v11 = var30_30 = v10;
                                    if (var4_6 == null) {
                                        if (v11 < 0) {
                                            var30_30 = -var30_30;
                                        }
                                        v11 = var26_26 - var25_25;
                                    }
                                    v12 = var31_31 = v11;
                                    if (var4_6 != null) ** GOTO lbl91
                                    if (v12 >= 0) break block88;
                                    v12 = var31_31 = -var31_31;
lbl91:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 4: {
                                    var8_18 = var22_22 * var21_21 + di_2.a(4396, 3356426276852861465L);
                                    var29_29 = (var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L);
                                    var8_18 = var24_24 * var23_23 + di_2.a(4396, 3356426276852861465L);
                                    var30_30 = (var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L);
                                    var8_18 = var26_26 * var25_25 + di_2.a(4396, 3356426276852861465L);
                                    var31_31 = (var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L);
                                    if (var4_6 == null) break block88;
                                }
                                case 8: {
                                    var8_18 = (di_2.a(12984, 7134358132718119297L) - var22_22) * (di_2.a(12984, 7134358132718119297L) - var21_21) + di_2.a(4396, 3356426276852861465L);
                                    var29_29 = di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    var8_18 = (di_2.a(12984, 7134358132718119297L) - var24_24) * (di_2.a(12984, 7134358132718119297L) - var23_23) + di_2.a(4396, 3356426276852861465L);
                                    var30_30 = di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    var8_18 = (di_2.a(12984, 7134358132718119297L) - var26_26) * (di_2.a(12984, 7134358132718119297L) - var25_25) + di_2.a(4396, 3356426276852861465L);
                                    var31_31 = di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    if (var4_6 == null) break block88;
                                }
                                case 16: {
                                    v13 = var22_22;
                                    v14 = di_2.a(4396, 3356426276852861465L);
                                    if (var4_6 != null) ** GOTO lbl118
                                    if (v13 >= v14) ** GOTO lbl116
                                    var8_18 = var22_22 * var21_21 + di_2.a(4396, 3356426276852861465L);
                                    var29_29 = 2 * ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    if (var4_6 == null) ** GOTO lbl120
lbl116:
                                    // 2 sources

                                    v13 = (di_2.a(12984, 7134358132718119297L) - var22_22) * (di_2.a(12984, 7134358132718119297L) - var21_21);
                                    v14 = di_2.a(4396, 3356426276852861465L);
lbl118:
                                    // 2 sources

                                    var8_18 = v13 + v14;
                                    var29_29 = 2 * (di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L)));
lbl120:
                                    // 2 sources

                                    v15 = var24_24;
                                    v16 = di_2.a(4396, 3356426276852861465L);
                                    if (var4_6 != null) ** GOTO lbl130
                                    if (v15 >= v16) ** GOTO lbl127
                                    var8_18 = var24_24 * var23_23 + di_2.a(4396, 3356426276852861465L);
                                    var30_30 = 2 * ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    if (var4_6 == null) ** GOTO lbl131
lbl127:
                                    // 2 sources

                                    var8_18 = (di_2.a(12984, 7134358132718119297L) - var24_24) * (di_2.a(12984, 7134358132718119297L) - var23_23) + di_2.a(4396, 3356426276852861465L);
                                    v15 = 2;
                                    v16 = di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
lbl130:
                                    // 2 sources

                                    var30_30 = v15 * v16;
lbl131:
                                    // 2 sources

                                    v17 = var26_26;
                                    v18 = di_2.a(4396, 3356426276852861465L);
                                    if (var4_6 != null) ** GOTO lbl141
                                    if (v17 >= v18) ** GOTO lbl138
                                    var8_18 = var26_26 * var25_25 + di_2.a(4396, 3356426276852861465L);
                                    var31_31 = 2 * ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
                                    if (var4_6 == null) break block88;
lbl138:
                                    // 2 sources

                                    var8_18 = (di_2.a(12984, 7134358132718119297L) - var26_26) * (di_2.a(12984, 7134358132718119297L) - var25_25) + di_2.a(4396, 3356426276852861465L);
                                    v17 = 2;
                                    v18 = di_2.a(12984, 7134358132718119297L) - ((var8_18 >> di_2.a(14759, 7758752785333953169L)) + var8_18 >> di_2.a(14759, 7758752785333953169L));
lbl141:
                                    // 2 sources

                                    var31_31 = v17 * v18;
                                    if (var4_6 == null) break block88;
                                }
                                case 5: {
                                    v19 = var22_22;
                                    if (var4_6 == null) {
                                        v19 = v19 < var21_21 ? var22_22 : var21_21;
                                    }
                                    var29_29 = v19;
                                    v20 = var24_24;
                                    if (var4_6 == null) {
                                        v20 = v20 < var23_23 ? var24_24 : var23_23;
                                    }
                                    var30_30 = v20;
                                    v21 = var26_26;
                                    if (var4_6 == null) {
                                        v21 = var31_31 = v21 < var25_25 ? var26_26 : var25_25;
                                    }
                                    if (var4_6 == null) break block88;
                                }
                                case 9: {
                                    v22 = var22_22;
                                    if (var4_6 == null) {
                                        v22 = v22 > var21_21 ? var22_22 : var21_21;
                                    }
                                    var29_29 = v22;
                                    v23 = var24_24;
                                    if (var4_6 == null) {
                                        v23 = v23 > var23_23 ? var24_24 : var23_23;
                                    }
                                    var30_30 = v23;
                                    v24 = var26_26;
                                    if (var4_6 == null) {
                                        v24 = var31_31 = v24 > var25_25 ? var26_26 : var25_25;
                                    }
                                    if (var4_6 == null) break block88;
                                }
                                case 22: {
                                    var29_29 = (var22_22 + var21_21) / 2;
                                    var30_30 = (var24_24 + var23_23) / 2;
                                    var31_31 = (var26_26 + var25_25) / 2;
                                    if (var4_6 == null) break block88;
                                }
                                case 12: 
                                case 13: 
                                case 14: 
                                case 15: {
                                    Color.RGBtoHSB(var21_21, var23_23, var25_25, var9_5);
                                    Color.RGBtoHSB(var22_22, var24_24, var26_26, var10_7);
                                    v25 = this.Z;
                                    if (var4_6 == null) {
                                        switch (v25) {
                                            case 12: {
                                                var11_8[0] = var9_5[0];
                                                var11_8[1] = var10_7[1];
                                                var11_8[2] = var10_7[2];
                                                if (var4_6 == null) break;
                                            }
                                            case 13: {
                                                var11_8[0] = var10_7[0];
                                                var11_8[1] = var9_5[1];
                                                var11_8[2] = var10_7[2];
                                                if (var4_6 == null) break;
                                            }
                                            case 14: {
                                                var11_8[0] = var10_7[0];
                                                var11_8[1] = var10_7[1];
                                                var11_8[2] = var9_5[2];
                                                if (var4_6 == null) break;
                                            }
                                            case 15: {
                                                var11_8[0] = var9_5[0];
                                                var11_8[1] = var9_5[1];
                                                var11_8[2] = var10_7[2];
                                            }
                                        }
                                        v25 = Color.HSBtoRGB(var11_8[0], var11_8[1], var11_8[2]);
                                    }
                                    var32_32 = v25;
                                    var29_29 = (var32_32 & di_2.a(22376, 4277891706952240210L)) >> di_2.a(15578, 2293525694340671464L);
                                    var30_30 = (var32_32 & di_2.a(7115, 5540741876664041719L)) >> di_2.a(14759, 7758752785333953169L);
                                    var31_31 = var32_32 & di_2.a(12984, 7134358132718119297L);
                                    if (var4_6 == null) break block88;
                                }
                                case 6: {
                                    v26 = var22_22;
                                    if (var4_6 != null) ** GOTO lbl214
                                    if (v26 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl213
                                    var29_29 = di_2.F(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var21_21 << di_2.a(14759, 7758752785333953169L)) / (var22_22 + 1));
                                    if (var4_6 == null) ** GOTO lbl215
lbl213:
                                    // 2 sources

                                    v26 = var21_21;
lbl214:
                                    // 2 sources

                                    var29_29 = v26;
lbl215:
                                    // 2 sources

                                    v27 = var24_24;
                                    if (var4_6 != null) ** GOTO lbl221
                                    if (v27 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl220
                                    var30_30 = di_2.F(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var23_23 << di_2.a(14759, 7758752785333953169L)) / (var24_24 + 1));
                                    if (var4_6 == null) ** GOTO lbl222
lbl220:
                                    // 2 sources

                                    v27 = var23_23;
lbl221:
                                    // 2 sources

                                    var30_30 = v27;
lbl222:
                                    // 2 sources

                                    v28 = var26_26;
                                    if (var4_6 != null) ** GOTO lbl228
                                    if (v28 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl227
                                    var31_31 = di_2.F(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var25_25 << di_2.a(14759, 7758752785333953169L)) / (var26_26 + 1));
                                    if (var4_6 == null) break block88;
lbl227:
                                    // 2 sources

                                    v28 = var31_31 = var25_25;
lbl228:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 7: {
                                    v29 = var21_21;
                                    if (var4_6 != null) ** GOTO lbl236
                                    if (v29 == 0) ** GOTO lbl235
                                    var29_29 = Math.max(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var22_22 << di_2.a(14759, 7758752785333953169L)) / var21_21, 0);
                                    if (var4_6 == null) ** GOTO lbl237
lbl235:
                                    // 2 sources

                                    v29 = var21_21;
lbl236:
                                    // 2 sources

                                    var29_29 = v29;
lbl237:
                                    // 2 sources

                                    v30 = var23_23;
                                    if (var4_6 != null) ** GOTO lbl243
                                    if (v30 == 0) ** GOTO lbl242
                                    var30_30 = Math.max(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var24_24 << di_2.a(14759, 7758752785333953169L)) / var23_23, 0);
                                    if (var4_6 == null) ** GOTO lbl244
lbl242:
                                    // 2 sources

                                    v30 = var23_23;
lbl243:
                                    // 2 sources

                                    var30_30 = v30;
lbl244:
                                    // 2 sources

                                    v31 = var25_25;
                                    if (var4_6 != null) ** GOTO lbl250
                                    if (v31 == 0) ** GOTO lbl249
                                    var31_31 = Math.max(di_2.a(12984, 7134358132718119297L) - (di_2.a(12984, 7134358132718119297L) - var26_26 << di_2.a(14759, 7758752785333953169L)) / var25_25, 0);
                                    if (var4_6 == null) break block88;
lbl249:
                                    // 2 sources

                                    v31 = var31_31 = var25_25;
lbl250:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 10: {
                                    var29_29 = di_2.F((var21_21 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(23090, 8017619252607500550L) - var22_22));
                                    var30_30 = di_2.F((var23_23 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(13378, 1490625129416535921L) - var24_24));
                                    var31_31 = di_2.F((var25_25 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(13378, 1490625129416535921L) - var26_26));
                                    if (var4_6 == null) break block88;
                                }
                                case 11: {
                                    v32 = var21_21;
                                    if (var4_6 != null) ** GOTO lbl263
                                    if (v32 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl262
                                    var29_29 = Math.min((var22_22 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(12984, 7134358132718119297L) - var21_21), di_2.a(12984, 7134358132718119297L));
                                    if (var4_6 == null) ** GOTO lbl264
lbl262:
                                    // 2 sources

                                    v32 = var21_21;
lbl263:
                                    // 2 sources

                                    var29_29 = v32;
lbl264:
                                    // 2 sources

                                    v33 = var23_23;
                                    if (var4_6 != null) ** GOTO lbl270
                                    if (v33 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl269
                                    var30_30 = Math.min((var24_24 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(12984, 7134358132718119297L) - var23_23), di_2.a(12984, 7134358132718119297L));
                                    if (var4_6 == null) ** GOTO lbl271
lbl269:
                                    // 2 sources

                                    v33 = var23_23;
lbl270:
                                    // 2 sources

                                    var30_30 = v33;
lbl271:
                                    // 2 sources

                                    v34 = var25_25;
                                    if (var4_6 != null) ** GOTO lbl277
                                    if (v34 == di_2.a(12984, 7134358132718119297L)) ** GOTO lbl276
                                    var31_31 = Math.min((var26_26 << di_2.a(14759, 7758752785333953169L)) / (di_2.a(12984, 7134358132718119297L) - var25_25), di_2.a(12984, 7134358132718119297L));
                                    if (var4_6 == null) break block88;
lbl276:
                                    // 2 sources

                                    v34 = var31_31 = var25_25;
lbl277:
                                    // 2 sources

                                    if (var4_6 == null) break block88;
                                }
                                case 17: {
                                    var33_33 = di_2.N(var21_21, var22_22);
                                    var29_29 = var33_33 + di_2.N(var22_22, di_2.a(12984, 7134358132718119297L) - di_2.N(di_2.a(12984, 7134358132718119297L) - var22_22, di_2.a(12984, 7134358132718119297L) - var21_21) - var33_33);
                                    var33_33 = di_2.N(var23_23, var24_24);
                                    var30_30 = var33_33 + di_2.N(var24_24, di_2.a(12984, 7134358132718119297L) - di_2.N(di_2.a(12984, 7134358132718119297L) - var24_24, di_2.a(12984, 7134358132718119297L) - var23_23) - var33_33);
                                    var33_33 = di_2.N(var25_25, var26_26);
                                    var31_31 = var33_33 + di_2.N(var26_26, di_2.a(12984, 7134358132718119297L) - di_2.N(di_2.a(12984, 7134358132718119297L) - var26_26, di_2.a(12984, 7134358132718119297L) - var25_25) - var33_33);
                                    if (var4_6 == null) break block88;
                                }
                                case 18: {
                                    v35 = var21_21;
                                    v36 = di_2.a(10393, 751541795149951906L);
                                    if (var4_6 != null) ** GOTO lbl295
                                    if (v35 <= v36) ** GOTO lbl293
                                    var29_29 = di_2.a(12984, 7134358132718119297L) - 2 * di_2.N(di_2.a(12984, 7134358132718119297L) - var21_21, di_2.a(12984, 7134358132718119297L) - var22_22);
                                    if (var4_6 == null) ** GOTO lbl296
lbl293:
                                    // 2 sources

                                    v35 = 2;
                                    v36 = di_2.N(var21_21, var22_22);
lbl295:
                                    // 2 sources

                                    var29_29 = v35 * v36;
lbl296:
                                    // 2 sources

                                    v37 = var23_23;
                                    v38 = di_2.a(3883, 5284251878967120924L);
                                    if (var4_6 != null) ** GOTO lbl304
                                    if (v37 <= v38) ** GOTO lbl302
                                    var30_30 = di_2.a(12984, 7134358132718119297L) - 2 * di_2.N(di_2.a(12984, 7134358132718119297L) - var23_23, di_2.a(12984, 7134358132718119297L) - var24_24);
                                    if (var4_6 == null) ** GOTO lbl305
lbl302:
                                    // 2 sources

                                    v37 = 2;
                                    v38 = di_2.N(var23_23, var24_24);
lbl304:
                                    // 2 sources

                                    var30_30 = v37 * v38;
lbl305:
                                    // 2 sources

                                    v39 = var25_25;
                                    v40 = di_2.a(3883, 5284251878967120924L);
                                    if (var4_6 != null) ** GOTO lbl313
                                    if (v39 <= v40) ** GOTO lbl311
                                    var31_31 = di_2.a(12984, 7134358132718119297L) - 2 * di_2.N(di_2.a(12984, 7134358132718119297L) - var25_25, di_2.a(12984, 7134358132718119297L) - var26_26);
                                    if (var4_6 == null) break block88;
lbl311:
                                    // 2 sources

                                    v39 = 2;
                                    v40 = di_2.N(var25_25, var26_26);
lbl313:
                                    // 2 sources

                                    var31_31 = v39 * v40;
                                    if (var4_6 == null) break block88;
                                }
                                case 19: {
                                    v41 = var21_21;
                                    v42 = di_2.a(3883, 5284251878967120924L);
                                    if (var4_6 != null) ** GOTO lbl324
                                    if (v41 > v42) {
                                        v43 = Math.max(var21_21, var22_22);
                                    } else {
                                        v41 = var21_21;
                                        v42 = var22_22;
lbl324:
                                        // 2 sources

                                        v43 = Math.min(v41, v42);
                                    }
                                    var29_29 = v43;
                                    v44 = var23_23;
                                    v45 = di_2.a(3883, 5284251878967120924L);
                                    if (var4_6 != null) ** GOTO lbl334
                                    if (v44 > v45) {
                                        v46 = Math.max(var23_23, var24_24);
                                    } else {
                                        v44 = var23_23;
                                        v45 = var24_24;
lbl334:
                                        // 2 sources

                                        v46 = Math.min(v44, v45);
                                    }
                                    var30_30 = v46;
                                    v47 = var25_25;
                                    v48 = di_2.a(3883, 5284251878967120924L);
                                    if (var4_6 != null) ** GOTO lbl344
                                    if (v47 > v48) {
                                        v49 = Math.max(var25_25, var26_26);
                                    } else {
                                        v47 = var25_25;
                                        v48 = var26_26;
lbl344:
                                        // 2 sources

                                        v49 = var31_31 = Math.min(v47, v48);
                                    }
                                    if (var4_6 == null) break block88;
                                }
                                case 20: {
                                    var29_29 = var22_22 + di_2.N(var21_21, di_2.a(12984, 7134358132718119297L) - var22_22 - var22_22);
                                    var30_30 = var24_24 + di_2.N(var23_23, di_2.a(12984, 7134358132718119297L) - var24_24 - var24_24);
                                    var31_31 = var26_26 + di_2.N(var25_25, di_2.a(12984, 7134358132718119297L) - var26_26 - var26_26);
                                    if (var4_6 == null) break block88;
                                }
                                case 21: {
                                    v50 = di_2.a(12984, 7134358132718119297L) - Math.abs(di_2.a(12984, 7134358132718119297L) - var21_21 - var22_22);
                                }
                            }
                        }
                        var29_29 = v50;
                        var30_30 = di_2.a(12984, 7134358132718119297L) - Math.abs(di_2.a(12984, 7134358132718119297L) - var23_23 - var24_24);
                        var31_31 = di_2.a(12984, 7134358132718119297L) - Math.abs(di_2.a(12984, 7134358132718119297L) - var25_25 - var26_26);
                    }
                    var5_16 = var7_4 * (float)var27_27 / 255.0f;
                    var6_17 = 1.0f - var5_16;
                    var13_10[var19_19] = (int)(var5_16 * (float)var29_29 + var6_17 * (float)var22_22);
                    var13_10[var19_19 + 1] = (int)(var5_16 * (float)var30_30 + var6_17 * (float)var24_24);
                    var13_10[var19_19 + 2] = (int)(var5_16 * (float)var31_31 + var6_17 * (float)var26_26);
                    var13_10[var19_19 + 3] = (int)((float)var27_27 * var7_4 + (float)var28_28 * var6_17);
                    if (var4_6 == null) continue;
                }
                var3_3.setPixels(var14_11, var18_15, var15_12, 1, var13_10);
                ++var18_15;
                if (var4_6 == null) continue block29;
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
                var0 = 5308245096215264302L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "\u00bco\u00d6\u00b6\u00c9\u0006\u00deZ\u00d3\u0093\b\u00ea\u0081\u00cdU\u001d\u001a\t\u008d\u00f4\u00ca\u00f6\u009b\u00d6\u00aab\u001dG8\u00ba\u0012_Z\u00e1y[D\u009e|(\u00ca\u00c1jb\u0006\u0004\u00b6\u00b7\u000f\u001a\u00db0\u0099y\u009e\u00b7\u0001\u00e3LtY\u0018(M|4;\u00be\u00a0h=Z\u0001\u00aa\u00d0\u0092u\u008b\u0095P\u00a7\u00d4\u00c4t\u00f0\u001b\u00f0|";
                var5_4 = "\u00bco\u00d6\u00b6\u00c9\u0006\u00deZ\u00d3\u0093\b\u00ea\u0081\u00cdU\u001d\u001a\t\u008d\u00f4\u00ca\u00f6\u009b\u00d6\u00aab\u001dG8\u00ba\u0012_Z\u00e1y[D\u009e|(\u00ca\u00c1jb\u0006\u0004\u00b6\u00b7\u000f\u001a\u00db0\u0099y\u009e\u00b7\u0001\u00e3LtY\u0018(M|4;\u00be\u00a0h=Z\u0001\u00aa\u00d0\u0092u\u008b\u0095P\u00a7\u00d4\u00c4t\u00f0\u001b\u00f0|".length();
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
                    var4_3 = "\u00e1EK\f\u0089[\u000f\u00f3\u00c1I\u00ee\u008c\u001a/C\u00d9";
                    var5_4 = "\u00e1EK\f\u0089[\u000f\u00f3\u00c1I\u00ee\u008c\u001a/C\u00d9".length();
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
        di_2.a = var6_1;
        di_2.b = new Integer[13];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1B30;
        if (b[n11] == null) {
            di_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

