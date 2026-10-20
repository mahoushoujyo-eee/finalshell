/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hx_1;
import com.iw_2;
import com.po_0;
import com.wy_1;
import java.awt.image.BufferedImage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.hr
 */
public class hr_2
extends W5 {
    private float j = 1.0f;
    private int s = hr_2.a(28185, 5819506735466313009L);
    private float g = 0.0f;
    private float A = 0.1f;
    private boolean t = false;
    private po_0 U = new wy_1(-1, hr_2.a(15341, 8213060126446231745L));
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void V(float f10) {
        this.j = f10;
    }

    public float x() {
        return this.j;
    }

    public void E(float f10) {
        this.A = f10;
    }

    public float I() {
        return this.A;
    }

    public void E(int n10) {
        this.s = n10;
    }

    public int P() {
        return this.s;
    }

    public void h(float f10) {
        this.g = f10;
    }

    public float t() {
        return this.g;
    }

    public void o(boolean bl) {
        this.t = bl;
    }

    public boolean I() {
        return this.t;
    }

    public void B(po_0 po_02) {
        this.U = po_02;
    }

    public po_0 O() {
        return this.U;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage filter(BufferedImage var1_1, BufferedImage var2_2) {
        block40: {
            block50: {
                block49: {
                    block39: {
                        var4_3 = var1_1.getWidth();
                        var5_4 = var1_1.getHeight();
                        var6_5 = new int[var4_3];
                        var3_6 = W5.q();
                        var7_7 = (int)((float)this.s / 1.414f);
                        var8_8 = new int[this.s + 1];
                        var9_9 = new int[var7_7 + 1];
                        if (this.U != null) {
                            block38: {
                                for (var10_10 = 0; var10_10 <= this.s; ++var10_10) {
                                    var11_12 = this.U.D((float)var10_10 / (float)this.s);
                                    var12_13 = var11_12 >> hr_2.a(5759, 8440283834928762206L) & hr_2.a(6320, 5988257916955427739L);
                                    var13_15 = var11_12 >> hr_2.a(2674, 6111706536463831389L) & hr_2.a(32393, 7212213558597805475L);
                                    var14_16 = var11_12 & hr_2.a(32393, 7212213558597805475L);
                                    var8_8[var10_10] = var11_12 = var11_12 & hr_2.a(31493, 4889264004329496620L) | (int)(this.A * (float)var12_13) << hr_2.a(12483, 3638172604557569006L) | (int)(this.A * (float)var13_15) << hr_2.a(28672, 4145203539559377710L) | (int)(this.A * (float)var14_16);
                                    if (var3_6 != null) {
                                        if (var3_6 != null) continue;
                                    }
                                    break block38;
                                }
                                var10_10 = 0;
                            }
                            while (var10_10 <= var7_7) {
                                var11_12 = this.U.D((float)var10_10 / (float)var7_7);
                                var12_13 = var11_12 >> hr_2.a(12483, 3638172604557569006L) & hr_2.a(32393, 7212213558597805475L);
                                var13_15 = var11_12 >> hr_2.a(28672, 4145203539559377710L) & hr_2.a(32393, 7212213558597805475L);
                                var14_16 = var11_12 & hr_2.a(32393, 7212213558597805475L);
                                var9_9[var10_10] = var11_12 = var11_12 & hr_2.a(31493, 4889264004329496620L) | (int)(this.A * (float)var12_13) << hr_2.a(12483, 3638172604557569006L) | (int)(this.A * (float)var13_15) << hr_2.a(28672, 4145203539559377710L) | (int)(this.A * (float)var14_16);
                                ++var10_10;
                                if (var3_6 != null) continue;
                            }
                        }
                        var10_11 = new BufferedImage(var4_3, var5_4, 2);
                        var11_12 = (int)(this.j * 3.0f * 255.0f);
                        var12_13 = 0;
                        block2: while (true) {
                            v0 = var12_13;
                            v1 = var5_4;
                            block3: while (v0 < v1) {
                                this.l(var1_1, 0, var12_13, var4_3, 1, var6_5);
                                v2 = (float)false;
                                if (var3_6 == null) break block39;
                                for (var13_15 = v8172989; var13_15 < var4_3; ++var13_15) {
                                    var14_16 = var6_5[var13_15];
                                    var15_17 = var14_16 & hr_2.a(31493, 4889264004329496620L);
                                    var16_18 = var14_16 >> hr_2.a(12483, 3638172604557569006L) & hr_2.a(32393, 7212213558597805475L);
                                    var17_19 = var14_16 >> hr_2.a(28672, 4145203539559377710L) & hr_2.a(32393, 7212213558597805475L);
                                    var18_20 = var14_16 & hr_2.a(32393, 7212213558597805475L);
                                    v0 = var19_21 = var16_18 + var17_19 + var18_20;
                                    v1 = var11_12;
                                    if (var3_6 == null) continue block3;
                                    if (var3_6 != null) {
                                        if (v0 < v1) {
                                            var6_5[var13_15] = hr_2.a(31493, 4889264004329496620L);
                                            if (var3_6 != null) continue;
                                        }
                                        v3 = var19_21;
                                        v4 = 3;
                                    }
                                    var19_21 = v3 / v4;
                                    var6_5[var13_15] = var15_17 | var19_21 << hr_2.a(12483, 3638172604557569006L) | var19_21 << hr_2.a(28672, 4145203539559377710L) | var19_21;
                                    if (var3_6 != null) continue;
                                }
                                this.E(var10_11, 0, var12_13, var4_3, 1, var6_5);
                                ++var12_13;
                                if (var3_6 != null) continue block2;
                            }
                            break;
                        }
                        v2 = (cfr_temp_0 = this.g - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                    }
                    if (v2 != false) {
                        var10_11 = new hx_1(this.g).filter(var10_11, null);
                    }
                    v5 = var2_2;
                    if (var3_6 == null) break block49;
                    if (v5 != null) break block50;
                    v5 = this.createCompatibleDestImage(var1_1, null);
                }
                var2_2 = v5;
            }
            v6 = this;
            if (var3_6 == null) ** GOTO lbl77
            if (v6.t) {
                var12_14 = new int[var4_3 * var5_4];
            } else {
                v6 = this;
lbl77:
                // 2 sources

                var12_14 = v6.l(var1_1, 0, 0, var4_3, var5_4, null);
            }
            var13_15 = (float)false;
            block5: while (true) {
                v7 = var13_15;
                block6: while (v7 < var5_4) {
                    var14_16 = (int)(var13_15 * var4_3);
                    this.l(var10_11, 0, (int)var13_15, var4_3, 1, var6_5);
                    var15_17 = Math.max((int)(var13_15 - this.s), 0) - var13_15;
                    var16_18 = Math.min((int)(var13_15 + this.s), var5_4 - 1) - var13_15;
                    var17_19 = Math.max((int)(var13_15 - var7_7), 0) - var13_15;
                    var18_20 = Math.min((int)(var13_15 + var7_7), var5_4 - 1) - var13_15;
                    if (var3_6 == null) break block40;
                    var19_21 = 0;
                    while (var19_21 < var4_3) {
                        block48: {
                            block52: {
                                block47: {
                                    block46: {
                                        block45: {
                                            block44: {
                                                block43: {
                                                    block42: {
                                                        block41: {
                                                            block51: {
                                                                cfr_temp_1 = (float)(var6_5[var19_21] & hr_2.a(32393, 7212213558597805475L)) - this.j * 255.0f;
                                                                v7 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                if (var3_6 == null) continue block6;
                                                                if (var3_6 == null) break block51;
                                                                if (v7 <= 0) break block52;
                                                                v8 = Math.max(var19_21 - this.s, 0) - var19_21;
                                                            }
                                                            var20_22 = v8;
                                                            var21_23 = Math.min(var19_21 + this.s, var4_3 - 1) - var19_21;
                                                            var22_24 = Math.max(var19_21 - var7_7, 0) - var19_21;
                                                            var23_25 = Math.min(var19_21 + var7_7, var4_3 - 1) - var19_21;
                                                            var24_26 = 0;
                                                            var25_27 = 0;
                                                            while (var24_26 <= var21_23) {
                                                                var12_14[var14_16 + var24_26] = iw_2.P(var12_14[var14_16 + var24_26], var8_8[var25_27], 4);
                                                                ++var24_26;
                                                                ++var25_27;
                                                                if (var3_6 != null) {
                                                                    if (var3_6 != null) continue;
                                                                }
                                                                break block41;
                                                            }
                                                            var24_26 = -1;
                                                        }
                                                        var25_27 = 1;
                                                        while (var24_26 >= var20_22) {
                                                            var12_14[var14_16 + var24_26] = iw_2.P(var12_14[var14_16 + var24_26], var8_8[var25_27], 4);
                                                            --var24_26;
                                                            ++var25_27;
                                                            if (var3_6 != null) {
                                                                if (var3_6 != null) continue;
                                                            }
                                                            break block42;
                                                        }
                                                        var24_26 = 1;
                                                        var25_27 = var14_16 + var4_3;
                                                    }
                                                    var26_28 = 0;
                                                    while (var24_26 <= var16_18) {
                                                        var12_14[var25_27] = iw_2.P(var12_14[var25_27], var8_8[var26_28], 4);
                                                        ++var24_26;
                                                        var25_27 += var4_3;
                                                        ++var26_28;
                                                        if (var3_6 != null) {
                                                            if (var3_6 != null) continue;
                                                        }
                                                        break block43;
                                                    }
                                                    var24_26 = -1;
                                                    var25_27 = var14_16 - var4_3;
                                                }
                                                var26_28 = 0;
                                                while (var24_26 >= var15_17) {
                                                    var12_14[var25_27] = iw_2.P(var12_14[var25_27], var8_8[var26_28], 4);
                                                    --var24_26;
                                                    var25_27 -= var4_3;
                                                    ++var26_28;
                                                    if (var3_6 != null) {
                                                        if (var3_6 != null) continue;
                                                    }
                                                    break block44;
                                                }
                                                var24_26 = Math.max(var22_24, var17_19);
                                                var25_27 = Math.min(var23_25, var18_20);
                                                var26_28 = Math.min(var23_25, var18_20);
                                            }
                                            var27_29 = 1;
                                            var28_30 = var14_16 + var4_3 + 1;
                                            var29_31 = 0;
                                            while (var27_29 <= var26_28) {
                                                var12_14[var28_30] = iw_2.P(var12_14[var28_30], var9_9[var29_31], 4);
                                                ++var27_29;
                                                var28_30 += var4_3 + 1;
                                                ++var29_31;
                                                if (var3_6 != null) {
                                                    if (var3_6 != null) continue;
                                                }
                                                break block45;
                                            }
                                            var26_28 = Math.min(-var22_24, -var17_19);
                                            var27_29 = 1;
                                            var28_30 = var14_16 - var4_3 - 1;
                                        }
                                        var29_31 = 0;
                                        while (var27_29 <= var26_28) {
                                            var12_14[var28_30] = iw_2.P(var12_14[var28_30], var9_9[var29_31], 4);
                                            ++var27_29;
                                            var28_30 -= var4_3 + 1;
                                            ++var29_31;
                                            if (var3_6 != null) {
                                                if (var3_6 != null) continue;
                                            }
                                            break block46;
                                        }
                                        var26_28 = Math.min(var23_25, -var17_19);
                                        var27_29 = 1;
                                        var28_30 = var14_16 - var4_3 + 1;
                                    }
                                    var29_31 = 0;
                                    while (var27_29 <= var26_28) {
                                        var12_14[var28_30] = iw_2.P(var12_14[var28_30], var9_9[var29_31], 4);
                                        ++var27_29;
                                        var28_30 += -var4_3 + 1;
                                        ++var29_31;
                                        if (var3_6 != null) {
                                            if (var3_6 != null) continue;
                                        }
                                        break block47;
                                    }
                                    var26_28 = Math.min(-var22_24, var18_20);
                                    var27_29 = 1;
                                    var28_30 = var14_16 + var4_3 - 1;
                                }
                                var29_31 = 0;
                                while (var27_29 <= var26_28) {
                                    var12_14[var28_30] = iw_2.P(var12_14[var28_30], var9_9[var29_31], 4);
                                    ++var27_29;
                                    var28_30 += var4_3 - 1;
                                    ++var29_31;
                                    if (var3_6 != null) {
                                        if (var3_6 != null) continue;
                                    }
                                    break block48;
                                }
                            }
                            ++var14_16;
                            ++var19_21;
                        }
                        if (var3_6 != null) continue;
                    }
                    ++var13_15;
                    if (var3_6 != null) continue block5;
                }
                break;
            }
            this.E(var2_2, 0, 0, var4_3, var5_4, var12_14);
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
                v0 = "*9}`!}^@\u0018wl,}\u0003Aq".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 81;
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
                                v9 = 62;
                                break;
                            }
                            case 1: {
                                v9 = 14;
                                break;
                            }
                            case 2: {
                                v9 = 74;
                                break;
                            }
                            case 3: {
                                v9 = 84;
                                break;
                            }
                            case 4: {
                                v9 = 19;
                                break;
                            }
                            case 5: {
                                v9 = 88;
                                break;
                            }
                            default: {
                                v9 = 124;
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
                hr_2.a = new String(v10).intern();
                var0_1 = 8894348698004285666L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "\u0083\u00a8\u000b\u0092\u00dd)\b\u00ceP\u0099T`\u00cav\u009d\u00d6\u00f8\u00fd\u00ee\u0098\u0016\u008ck\u0086q\u00e2:\u00a69z\u008d\u00be\u0006\u009c\u0007\u0013\u00036\u00c3\u001c\u008b\u00c3\u0003\u00cbY\u00c0H#\u0014x\u008bq\u0088\\\u00f9\u00b7";
                var5_5 = "\u0083\u00a8\u000b\u0092\u00dd)\b\u00ceP\u0099T`\u00cav\u009d\u00d6\u00f8\u00fd\u00ee\u0098\u0016\u008ck\u0086q\u00e2:\u00a69z\u008d\u00be\u0006\u009c\u0007\u0013\u00036\u00c3\u001c\u008b\u00c3\u0003\u00cbY\u00c0H#\u0014x\u008bq\u0088\\\u00f9\u00b7".length();
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
                    var4_4 = "|\u00e3\u00b7\u00be\f \u0003\u00c4\u0088\u00b1\u0089\u008c\u00d5fe\u00ac";
                    var5_5 = "|\u00e3\u00b7\u00be\f \u0003\u00c4\u0088\u00b1\u0089\u008c\u00d5fe\u00ac".length();
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
        hr_2.b = var6_2;
        hr_2.c = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1B29;
        if (c[n11] == null) {
            hr_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

