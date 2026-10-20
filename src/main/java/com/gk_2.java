/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gk
 */
public class gk_2
extends gy_2 {
    private int K;
    private float C;
    private float G;
    private float j;
    private float s;
    private float a;
    private static final String b;

    public gk_2() {
        this(0);
    }

    public gk_2(int n10) {
        this.K = n10;
        this.Y(1);
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.C = bufferedImage.getWidth();
        this.G = bufferedImage.getHeight();
        this.j = this.C / 2.0f;
        this.s = this.G / 2.0f;
        this.a = Math.max(this.s, this.j);
        return super.filter(bufferedImage, bufferedImage2);
    }

    public void X(int n10) {
        this.K = n10;
    }

    public int T() {
        return this.K;
    }

    private float i(float f10) {
        return f10 * f10;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void h(int var1_1, int var2_2, float[] var3_3) {
        var10_4 = 0.0f;
        var4_5 = W5.q();
        switch (this.K) {
            case 0: {
                var5_6 = 0.0f;
                cfr_temp_0 = (float)var1_1 - this.j;
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var4_5 == null) ** GOTO lbl28
                if (v0 < 0) ** GOTO lbl27
                cfr_temp_1 = (float)var2_2 - this.s;
                v1 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                if (var4_5 == null) ** GOTO lbl18
                if (v1 <= 0) ** GOTO lbl17
                var5_6 = 3.1415927f - (float)Math.atan(((float)var1_1 - this.j) / ((float)var2_2 - this.s));
                var10_4 = (float)Math.sqrt(this.i((float)var1_1 - this.j) + this.i((float)var2_2 - this.s));
                if (var4_5 != null) ** GOTO lbl50
lbl17:
                // 2 sources

                v1 = (cfr_temp_2 = (float)var2_2 - this.s) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
lbl18:
                // 2 sources

                if (var4_5 == null) ** GOTO lbl25
                if (v1 >= 0) ** GOTO lbl23
                var5_6 = (float)Math.atan(((float)var1_1 - this.j) / (this.s - (float)var2_2));
                var10_4 = (float)Math.sqrt(this.i((float)var1_1 - this.j) + this.i(this.s - (float)var2_2));
                if (var4_5 != null) ** GOTO lbl50
lbl23:
                // 2 sources

                var5_6 = 1.5707964f;
                v1 = var1_1;
lbl25:
                // 2 sources

                var10_4 = (float)v1 - this.j;
                if (var4_5 != null) ** GOTO lbl50
lbl27:
                // 2 sources

                v0 = (cfr_temp_3 = (float)var1_1 - this.j) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
lbl28:
                // 2 sources

                if (var4_5 == null) ** GOTO lbl54
                if (v0 >= 0) ** GOTO lbl50
                cfr_temp_4 = (float)var2_2 - this.s;
                v2 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                if (var4_5 == null) ** GOTO lbl42
                if (v2 >= 0) ** GOTO lbl37
                var5_6 = 6.2831855f - (float)Math.atan((this.j - (float)var1_1) / (this.s - (float)var2_2));
                var10_4 = (float)Math.sqrt(this.i(this.j - (float)var1_1) + this.i(this.s - (float)var2_2));
                if (var4_5 != null) ** GOTO lbl50
lbl37:
                // 2 sources

                v3 = var2_2;
                v4 = this.s;
                if (var4_5 == null) ** GOTO lbl49
                cfr_temp_5 = v3 - v4;
                v2 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
lbl42:
                // 2 sources

                if (v2 <= 0) ** GOTO lbl46
                var5_6 = 3.1415927f + (float)Math.atan((this.j - (float)var1_1) / ((float)var2_2 - this.s));
                var10_4 = (float)Math.sqrt(this.i(this.j - (float)var1_1) + this.i((float)var2_2 - this.s));
                if (var4_5 != null) ** GOTO lbl50
lbl46:
                // 2 sources

                var5_6 = 4.712389f;
                v3 = this.j;
                v4 = var1_1;
lbl49:
                // 2 sources

                var10_4 = v3 - v4;
lbl50:
                // 7 sources

                v5 = var1_1;
                if (var4_5 == null) ** GOTO lbl58
                cfr_temp_6 = v5 - this.j;
                v0 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
lbl54:
                // 2 sources

                if (v0 == false) ** GOTO lbl57
                var7_7 = Math.abs(((float)var2_2 - this.s) / ((float)var1_1 - this.j));
                if (var4_5 != null) ** GOTO lbl59
lbl57:
                // 2 sources

                v5 = 0.0f;
lbl58:
                // 2 sources

                var7_7 = v5;
lbl59:
                // 2 sources

                v6 = var7_7;
                if (var4_5 == null) ** GOTO lbl73
                if (!(v6 <= this.G / this.C)) ** GOTO lbl72
                v7 = var1_1;
                if (var4_5 == null) ** GOTO lbl69
                if (v7 != this.j) ** GOTO lbl68
                var8_8 = 0.0f;
                var9_9 = this.s;
                if (var4_5 != null) ** GOTO lbl75
lbl68:
                // 2 sources

                v7 = this.j;
lbl69:
                // 2 sources

                var8_8 = v7;
                var9_9 = var7_7 * var8_8;
                if (var4_5 != null) ** GOTO lbl75
lbl72:
                // 2 sources

                v6 = this.s;
lbl73:
                // 2 sources

                var9_9 = v6;
                var8_8 = var9_9 / var7_7;
lbl75:
                // 3 sources

                var3_3[0] = this.C - 1.0f - (this.C - 1.0f) / 6.2831855f * var5_6;
                var3_3[1] = this.G * var10_4 / this.a;
                if (var4_5 != null) break;
            }
            case 1: {
                var5_6 = (float)var1_1 / this.C * 6.2831855f;
                cfr_temp_7 = var5_6 - 4.712389f;
                v8 = cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                if (var4_5 == null) ** GOTO lbl87
                if (v8 < 0) ** GOTO lbl86
                var11_10 = 6.2831855f - var5_6;
                if (var4_5 != null) ** GOTO lbl100
lbl86:
                // 2 sources

                v8 = (cfr_temp_8 = var5_6 - 3.1415927f) == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1);
lbl87:
                // 2 sources

                if (var4_5 == null) ** GOTO lbl95
                if (v8 < 0) ** GOTO lbl91
                var11_10 = var5_6 - 3.1415927f;
                if (var4_5 != null) ** GOTO lbl100
lbl91:
                // 2 sources

                v9 = var5_6;
                if (var4_5 == null) ** GOTO lbl99
                cfr_temp_9 = v9 - 1.5707964f;
                v8 = cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1);
lbl95:
                // 2 sources

                if (v8 < 0) ** GOTO lbl98
                var11_10 = 3.1415927f - var5_6;
                if (var4_5 != null) ** GOTO lbl100
lbl98:
                // 2 sources

                v9 = var5_6;
lbl99:
                // 2 sources

                var11_10 = v9;
lbl100:
                // 4 sources

                v10 = var6_11 = (float)Math.tan(var11_10);
                if (var4_5 == null) ** GOTO lbl106
                if (v10 == 0.0f) ** GOTO lbl105
                var7_7 = 1.0f / var6_11;
                if (var4_5 != null) ** GOTO lbl107
lbl105:
                // 2 sources

                v10 = 0.0f;
lbl106:
                // 2 sources

                var7_7 = v10;
lbl107:
                // 2 sources

                v11 = var7_7;
                if (var4_5 == null) ** GOTO lbl121
                if (!(v11 <= this.G / this.C)) ** GOTO lbl120
                v12 = var11_10;
                if (var4_5 == null) ** GOTO lbl117
                if (v12 != 0.0f) ** GOTO lbl116
                var8_8 = 0.0f;
                var9_9 = this.s;
                if (var4_5 != null) ** GOTO lbl123
lbl116:
                // 2 sources

                v12 = this.j;
lbl117:
                // 2 sources

                var8_8 = v12;
                var9_9 = var7_7 * var8_8;
                if (var4_5 != null) ** GOTO lbl123
lbl120:
                // 2 sources

                v11 = this.s;
lbl121:
                // 2 sources

                var9_9 = v11;
                var8_8 = var9_9 / var7_7;
lbl123:
                // 3 sources

                var10_4 = this.a * ((float)var2_2 / this.G);
                var12_12 = -var10_4 * (float)Math.sin(var11_10);
                var13_13 = var10_4 * (float)Math.cos(var11_10);
                cfr_temp_10 = var5_6 - 4.712389f;
                v13 = cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                if (var4_5 != null) {
                    if (v13 >= 0) {
                        var3_3[0] = this.j - var12_12;
                        var3_3[1] = this.s - var13_13;
                        if (var4_5 != null) break;
                    }
                    v13 = (cfr_temp_11 = (double)var5_6 - 3.141592653589793) == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1);
                }
                if (var4_5 != null) {
                    if (v13 >= 0) {
                        var3_3[0] = this.j - var12_12;
                        var3_3[1] = this.s + var13_13;
                        if (var4_5 != null) break;
                    }
                    v13 = (cfr_temp_12 = (double)var5_6 - 1.5707963267948966) == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                }
                if (v13 >= 0) {
                    var3_3[0] = this.j + var12_12;
                    var3_3[1] = this.s + var13_13;
                    if (var4_5 != null) break;
                }
                var3_3[0] = this.j + var12_12;
                var3_3[1] = this.s - var13_13;
                if (var4_5 != null) break;
            }
            case 2: {
                var14_14 = (float)var1_1 - this.j;
                var15_15 = (float)var2_2 - this.s;
                var16_16 = var14_14 * var14_14 + var15_15 * var15_15;
                var3_3[0] = this.j + this.j * this.j * var14_14 / var16_16;
                var3_3[1] = this.s + this.s * this.s * var15_15 / var16_16;
            }
        }
    }

    public String toString() {
        return b;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u000e bRN:5e\u0019~J@:a\t&~TE!/+=tU\u000ffo".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 76;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 6;
                            break;
                        }
                        case 1: {
                            n17 = 5;
                            break;
                        }
                        case 2: {
                            n17 = 93;
                            break;
                        }
                        case 3: {
                            n17 = 106;
                            break;
                        }
                        case 4: {
                            n17 = 109;
                            break;
                        }
                        case 5: {
                            n17 = 4;
                            break;
                        }
                        default: {
                            n17 = 13;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        b = new String(cArray).intern();
    }
}

