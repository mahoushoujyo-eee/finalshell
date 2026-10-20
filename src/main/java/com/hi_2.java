/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.a1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hi
 */
public class hi_2
extends W5 {
    private float f = 10.0f;
    private float l = 2.0f;
    private float k = 255.0f;
    private float F = 0.0f;
    private int W = hi_2.a(10209, 3470075007003201056L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void d(float f10) {
        this.f = f10;
    }

    public float Y() {
        return this.f;
    }

    public void k(int n10) {
        this.W = n10;
    }

    public int K() {
        return this.W;
    }

    public void A(float f10) {
        this.l = f10;
    }

    public float P() {
        return this.l;
    }

    public void x(float f10) {
        this.k = f10;
    }

    public float x() {
        return this.k;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage filter(BufferedImage var1_1, BufferedImage var2_2) {
        block70: {
            block69: {
                block68: {
                    block67: {
                        var4_3 = var1_1.getWidth();
                        var5_4 = var1_1.getHeight();
                        var6_5 = 1;
                        var7_6 = 1;
                        var8_7 = 0;
                        var9_8 = 0;
                        var10_9 = (int)Math.ceil(this.f);
                        var3_10 = W5.q();
                        var12_12 = var11_11 = hi_2.a(2970, 9106629594823828057L);
                        var13_13 = var4_3 + var10_9 * 2;
                        var14_14 = var5_4 + var10_9 * 2;
                        v0 = var10_9;
                        v1 = hi_2.a(9492, 6190982583653993681L);
                        if (var3_10 == null) ** GOTO lbl20
                        if (v0 < v1) {
                            v2 = Math.min(hi_2.a(25604, 3402116962983169472L), var4_3 + 2 * var10_9);
                        } else {
                            v0 = hi_2.a(7380, 1665985206938088729L);
                            v1 = var4_3 + 2 * var10_9;
lbl20:
                            // 2 sources

                            v2 = Math.min(v0, v1);
                        }
                        var11_11 = v2;
                        v3 = var10_9;
                        v4 = hi_2.a(7190, 1317456372061550044L);
                        if (var3_10 == null) ** GOTO lbl30
                        if (v3 < v4) {
                            v5 = Math.min(hi_2.a(25604, 3402116962983169472L), var5_4 + 2 * var10_9);
                        } else {
                            v3 = hi_2.a(18018, 6060560817130401701L);
                            v4 = var5_4 + 2 * var10_9;
lbl30:
                            // 2 sources

                            v5 = Math.min(v3, v4);
                        }
                        var12_12 = v5;
                        v6 = var2_2;
                        if (var3_10 != null && v6 == null) {
                            v6 = var2_2 = new BufferedImage(var4_3, var5_4, 2);
                        }
                        while (var6_5 < var12_12) {
                            var6_5 *= 2;
                            ++var8_7;
                            if (var3_10 != null) {
                                if (var3_10 != null) continue;
                            }
                            break block67;
                        }
                        while (var7_6 < var11_11) {
                            v7 = var7_6 * 2;
                            if (var3_10 != null) {
                                var7_6 = v7;
                                ++var9_8;
                                if (var3_10 != null) continue;
                            }
                            break block68;
                        }
                    }
                    v7 = var7_6;
                }
                var15_15 = v7;
                var16_16 = var6_5;
                var11_11 = var15_15;
                var12_12 = var16_16;
                var17_17 = new a1(Math.max(var8_7, var9_8));
                var18_18 = new int[var15_15 * var16_16];
                var19_19 = new float[2][var15_15 * var16_16];
                var20_20 = new float[2][var15_15 * var16_16];
                var21_21 = new float[2][var15_15 * var16_16];
                var22_22 = 3.141592653589793 / (double)this.W;
                var24_23 = 1.0 / Math.cos(var22_22);
                var26_24 = this.f * this.f;
                var28_25 = Math.toRadians(this.F);
                var30_26 = 0.0f;
                var31_27 = 0;
                var32_28 = 0;
                block2: while (true) {
                    v8 = var32_28;
                    block3: while (v8 < var16_16) {
                        v9 = 0;
                        if (var3_10 == null) break block69;
                        var33_29 = v9;
                        while (var33_29 < var15_15) {
                            block77: {
                                block78: {
                                    block81: {
                                        block79: {
                                            block80: {
                                                var34_30 = (float)var33_29 - (float)var15_15 / 2.0f;
                                                var36_32 = (float)var32_28 - (float)var16_16 / 2.0f;
                                                v10 = var38_34 = var34_30 * var34_30 + var36_32 * var36_32;
                                                if (var3_10 != null) {
                                                    cfr_temp_0 = v10 - var26_24;
                                                    v8 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                    if (var3_10 == null) continue block3;
                                                    v10 = var40_37 = v8 < 0 ? 1.0 : 0.0;
                                                }
                                                if (var3_10 == null) break block77;
                                                if (var40_37 == 0.0) break block78;
                                                v11 = Math.sqrt(var38_34);
                                                if (var3_10 == null) break block79;
                                                var38_34 = v11;
                                                if (this.W == 0) break block80;
                                                var42_40 = Math.atan2(var36_32, var34_30) + var28_25;
                                                var42_40 = NM.g(var42_40, var22_22 * 2.0) - var22_22;
                                                var40_37 = Math.cos(var42_40) * var24_23;
                                                if (var3_10 != null) break block81;
                                            }
                                            v11 = 1.0;
                                        }
                                        var40_37 = v11;
                                    }
                                    v12 = var40_37 * var38_34;
                                    if (var3_10 != null) {
                                        v12 = v12 < (double)this.f ? 1.0 : 0.0;
                                    }
                                    var40_37 = v12;
                                }
                                var30_26 += (float)var40_37;
                                var19_19[0][var31_27] = (float)var40_37;
                                var19_19[1][var31_27] = 0.0f;
                                ++var31_27;
                                ++var33_29;
                            }
                            if (var3_10 != null) continue;
                        }
                        ++var32_28;
                        if (var3_10 != null) continue block2;
                    }
                    break;
                }
                var31_27 = 0;
                v9 = var32_28 = 0;
            }
            while (var32_28 < var16_16) {
                block71: {
                    v13 = 0;
                    if (var3_10 == null) break block70;
                    for (var33_29 = v8077450; var33_29 < var15_15; ++var33_29) {
                        v14 = var19_19[0];
                        v15 = var31_27++;
                        v14[v15] = v14[v15] / var30_26;
                        if (var3_10 != null) {
                            if (var3_10 != null) continue;
                        }
                        break block71;
                    }
                    ++var32_28;
                }
                if (var3_10 != null) continue;
            }
            var17_17.f(var19_19[0], var19_19[1], var15_15, var16_16, true);
            v13 = var32_28 = -var10_9;
        }
        while (var32_28 < var5_4) {
            block72: {
                var33_29 = -var10_9;
                while (var33_29 < var4_3) {
                    block76: {
                        block74: {
                            block73: {
                                block83: {
                                    block82: {
                                        var34_31 = var33_29;
                                        var35_45 = var32_28;
                                        var36_33 = var11_11;
                                        var37_46 = var12_12;
                                        var38_36 = 0;
                                        var39_47 = 0;
                                        v16 = var34_31;
                                        if (var3_10 == null) break block72;
                                        if (var3_10 != null) {
                                            if (v16 < 0) {
                                                var36_33 += var34_31;
                                                var38_36 -= var34_31;
                                                var34_31 = 0;
                                            }
                                            v17 = var35_45;
                                        }
                                        if (var3_10 != null) {
                                            if (v17 < 0) {
                                                var37_46 += var35_45;
                                                var39_47 -= var35_45;
                                                var35_45 = 0;
                                            }
                                            v17 = var34_31 + var36_33;
                                        }
                                        v18 = var4_3;
                                        if (var3_10 == null) break block82;
                                        if (v17 > v18) {
                                            var36_33 = var4_3 - var34_31;
                                        }
                                        v17 = var35_45 + var37_46;
                                        if (var3_10 == null) break block83;
                                        v18 = var5_4;
                                    }
                                    if (v17 > v18) {
                                        var37_46 = var5_4 - var35_45;
                                    }
                                    var1_1.getRGB(var34_31, var35_45, var36_33, var37_46, var18_18, var39_47 * var15_15 + var38_36, var15_15);
                                    var31_27 = 0;
                                    v17 = 0;
                                }
                                var40_39 = v17;
                                block9: while (true) {
                                    v19 = var40_39;
                                    block10: while (v19 < var16_16) {
                                        block86: {
                                            block87: {
                                                block88: {
                                                    block84: {
                                                        block85: {
                                                            v20 = var41_48 = var40_39 + var32_28;
                                                            if (var3_10 == null) break block73;
                                                            if (var3_10 == null) break block84;
                                                            if (v20 >= 0) break block85;
                                                            var42_42 = var39_47;
                                                            if (var3_10 != null) break block86;
                                                        }
                                                        v21 = var41_48;
                                                    }
                                                    if (var3_10 == null) break block87;
                                                    if (v21 <= var5_4) break block88;
                                                    var42_42 = var39_47 + var37_46 - 1;
                                                    if (var3_10 != null) break block86;
                                                }
                                                v21 = var40_39;
                                            }
                                            var42_42 = v21;
                                        }
                                        var42_42 *= var15_15;
                                        for (var43_49 = 0; var43_49 < var15_15; ++var43_49) {
                                            block96: {
                                                block95: {
                                                    block94: {
                                                        block91: {
                                                            block92: {
                                                                block93: {
                                                                    block89: {
                                                                        block90: {
                                                                            v19 = var44_52 = var43_49 + var33_29;
                                                                            if (var3_10 == null) continue block10;
                                                                            if (var3_10 == null) break block89;
                                                                            if (v19 >= 0) break block90;
                                                                            var45_54 = var38_36;
                                                                            if (var3_10 != null) break block91;
                                                                        }
                                                                        v22 = var44_52;
                                                                    }
                                                                    if (var3_10 == null) break block92;
                                                                    if (v22 <= var4_3) break block93;
                                                                    var45_54 = var38_36 + var36_33 - 1;
                                                                    if (var3_10 != null) break block91;
                                                                }
                                                                v22 = var43_49;
                                                            }
                                                            var45_54 = v22;
                                                        }
                                                        var21_21[0][var31_27] = var18_18[var45_54 += var42_42] >> hi_2.a(4538, 5806355208998140017L) & hi_2.a(15484, 3131858357976012210L);
                                                        var46_57 = var18_18[var45_54] >> hi_2.a(12488, 708924380188481793L) & hi_2.a(17405, 6625013948377098802L);
                                                        var47_59 = var18_18[var45_54] >> hi_2.a(16489, 4426838045968886187L) & hi_2.a(17405, 6625013948377098802L);
                                                        var48_61 = var18_18[var45_54] & hi_2.a(17405, 6625013948377098802L);
                                                        cfr_temp_1 = var46_57 - this.k;
                                                        v23 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                        if (var3_10 != null) {
                                                            if (v23 > 0) {
                                                                var46_57 *= this.l;
                                                            }
                                                            v23 = (cfr_temp_2 = var47_59 - this.k) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                        }
                                                        if (var3_10 == null) break block94;
                                                        if (v23 > 0) {
                                                            var47_59 *= this.l;
                                                        }
                                                        v24 = var48_61;
                                                        v25 = this.k;
                                                        if (var3_10 == null) break block95;
                                                        cfr_temp_3 = v24 - v25;
                                                        v23 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                    }
                                                    if (v23 <= 0) break block96;
                                                    v24 = var48_61;
                                                    v25 = this.l;
                                                }
                                                var48_61 = v24 * v25;
                                            }
                                            var21_21[1][var31_27] = var46_57;
                                            var20_20[0][var31_27] = var47_59;
                                            var20_20[1][var31_27] = var48_61;
                                            ++var31_27;
                                            ++var45_54;
                                            if (var3_10 != null) continue;
                                        }
                                        ++var40_39;
                                        if (var3_10 != null) continue block9;
                                    }
                                    break;
                                }
                                var17_17.f(var21_21[0], var21_21[1], var7_6, var6_5, true);
                                var17_17.f(var20_20[0], var20_20[1], var7_6, var6_5, true);
                                var31_27 = 0;
                                v20 = var40_39 = 0;
                            }
                            while (var40_39 < var16_16) {
                                block75: {
                                    v26 = 0;
                                    if (var3_10 == null) break block74;
                                    for (var41_48 = v8077782; var41_48 < var15_15; ++var41_48) {
                                        var42_43 = var21_21[0][var31_27];
                                        var43_51 = var21_21[1][var31_27];
                                        var44_53 = var19_19[0][var31_27];
                                        var45_55 = var19_19[1][var31_27];
                                        var21_21[0][var31_27] = var42_43 * var44_53 - var43_51 * var45_55;
                                        var21_21[1][var31_27] = var42_43 * var45_55 + var43_51 * var44_53;
                                        var42_43 = var20_20[0][var31_27];
                                        var43_51 = var20_20[1][var31_27];
                                        var20_20[0][var31_27] = var42_43 * var44_53 - var43_51 * var45_55;
                                        var20_20[1][var31_27] = var42_43 * var45_55 + var43_51 * var44_53;
                                        ++var31_27;
                                        if (var3_10 != null) {
                                            if (var3_10 != null) continue;
                                        }
                                        break block75;
                                    }
                                    ++var40_39;
                                }
                                if (var3_10 != null) continue;
                            }
                            var17_17.f(var21_21[0], var21_21[1], var7_6, var6_5, false);
                            var17_17.f(var20_20[0], var20_20[1], var7_6, var6_5, false);
                            var40_39 = var15_15 >> 1;
                            v26 = var16_16 >> 1;
                        }
                        var41_48 = v26;
                        var42_44 = 0;
                        var43_49 = 0;
                        block14: while (true) {
                            v27 = var43_49;
                            v28 = var15_15;
                            block15: while (v27 < v28) {
                                var44_52 = var43_49 ^ var40_39;
                                var45_56 = var44_52 * var7_6;
                                v29 = 0;
                                if (var3_10 == null) break block76;
                                for (var46_58 = v8077919; var46_58 < var15_15; ++var46_58) {
                                    var47_60 = var45_56 + (var46_58 ^ var41_48);
                                    var48_62 = (int)var21_21[0][var47_60];
                                    var49_63 = (int)var21_21[1][var47_60];
                                    var50_64 = (int)var20_20[0][var47_60];
                                    var51_65 = (int)var20_20[1][var47_60];
                                    v27 = var49_63;
                                    v28 = hi_2.a(17405, 6625013948377098802L);
                                    if (var3_10 == null) continue block15;
                                    if (var3_10 != null) {
                                        if (v27 > v28) {
                                            var49_63 = hi_2.a(17405, 6625013948377098802L);
                                        }
                                        v30 = var50_64;
                                        v31 = hi_2.a(17405, 6625013948377098802L);
                                    }
                                    if (var3_10 != null) {
                                        if (v30 > v31) {
                                            var50_64 = hi_2.a(17405, 6625013948377098802L);
                                        }
                                        v30 = var51_65;
                                        v31 = hi_2.a(17405, 6625013948377098802L);
                                    }
                                    if (var3_10 != null) {
                                        if (v30 > v31) {
                                            var51_65 = hi_2.a(17405, 6625013948377098802L);
                                        }
                                        v30 = var48_62 << hi_2.a(23565, 8490337640173565377L) | var49_63 << hi_2.a(8685, 2087844581152131117L) | var50_64 << hi_2.a(14928, 2858440818944906134L);
                                        v31 = var51_65;
                                    }
                                    var52_66 = v30 | v31;
                                    var18_18[var42_44++] = var52_66;
                                    if (var3_10 != null) continue;
                                }
                                ++var43_49;
                                if (var3_10 != null) continue block14;
                            }
                            break;
                        }
                        var34_31 = var33_29 + var10_9;
                        var35_45 = var32_28 + var10_9;
                        var36_33 = var11_11 - 2 * var10_9;
                        var37_46 = var12_12 - 2 * var10_9;
                        v29 = var34_31 + var36_33;
                    }
                    v32 = var4_3;
                    if (var3_10 != null) {
                        if (v29 > v32) {
                            var36_33 = var4_3 - var34_31;
                        }
                        v29 = var35_45 + var37_46;
                        v32 = var5_4;
                    }
                    if (var3_10 != null) {
                        if (v29 > v32) {
                            var37_46 = var5_4 - var35_45;
                        }
                        var2_2.setRGB(var34_31, var35_45, var36_33, var37_46, var18_18, var10_9 * var15_15 + var10_9, var15_15);
                        v29 = var33_29;
                        v32 = var11_11 - 2 * var10_9;
                    }
                    var33_29 = v29 + v32;
                    if (var3_10 != null) continue;
                }
                v16 = var32_28 = var32_28 + (var12_12 - 2 * var10_9);
            }
            if (var3_10 != null) continue;
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
                v0 = "\u0017=(uJT\u001e;\"}E\tm\t{\u007fs".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 35;
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
                                v9 = 118;
                                break;
                            }
                            case 1: {
                                v9 = 114;
                                break;
                            }
                            case 2: {
                                v9 = 126;
                                break;
                            }
                            case 3: {
                                v9 = 36;
                                break;
                            }
                            case 4: {
                                v9 = 70;
                                break;
                            }
                            case 5: {
                                v9 = 59;
                                break;
                            }
                            default: {
                                v9 = 88;
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
                hi_2.a = new String(v10).intern();
                var0_1 = 3308680173319802439L;
                var6_2 = new long[15];
                var3_3 = 0;
                var4_4 = "\u0006KKZ\u0092\u00af\u00a0\u00e2\u008e\u00ca\u00824\u00de\u00aa\u00dd\u00d9\u0096\u0013$\u0091\u00abIB\u00b6\u00a5\u00a3\u00a7\u00be \u00eb\u0083\u0007\u0092\u007f8\u00f6r\u0092l\u009ep\u0082^\u00e7\u00fe2'\u00e44\u0014k{\u000ey\u00c0b\u00caJZ\u00a5\u00cb\u00d6\u00c6z\u00d4\u00c8\u00e3\u00f7\u00b7\u001c\u00a4\u008a\u0007y\u00c7,7\u00e5[\n\u00e3%\u00b3\u00a2j\u0083z^zZ\u00f8\u00c3\u00ff\u00b6\u00bb\u009e:\u00a5\u00b1\u00f8\u00fe\bv.";
                var5_5 = "\u0006KKZ\u0092\u00af\u00a0\u00e2\u008e\u00ca\u00824\u00de\u00aa\u00dd\u00d9\u0096\u0013$\u0091\u00abIB\u00b6\u00a5\u00a3\u00a7\u00be \u00eb\u0083\u0007\u0092\u007f8\u00f6r\u0092l\u009ep\u0082^\u00e7\u00fe2'\u00e44\u0014k{\u000ey\u00c0b\u00caJZ\u00a5\u00cb\u00d6\u00c6z\u00d4\u00c8\u00e3\u00f7\u00b7\u001c\u00a4\u008a\u0007y\u00c7,7\u00e5[\n\u00e3%\u00b3\u00a2j\u0083z^zZ\u00f8\u00c3\u00ff\u00b6\u00bb\u009e:\u00a5\u00b1\u00f8\u00fe\bv.".length();
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
                    var4_4 = "L\u009b\u00c2\u0004q\u00d7{\u00bb\u00d44t\u0092\u00db\u00a5WV";
                    var5_5 = "L\u009b\u00c2\u0004q\u00d7{\u00bb\u00d44t\u0092\u00db\u00a5WV".length();
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
        hi_2.b = var6_2;
        hi_2.c = new Integer[15];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x29C7;
        if (c[n11] == null) {
            hi_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

