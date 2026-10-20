/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

/*
 * Renamed from com.Lp
 */
public class lp_0
implements Stroke {
    private float E = 10.0f;
    private float I = 10.0f;
    private Stroke H;
    private static int A;
    private static final long a;

    public lp_0(float f10, float f11) {
        this(new BasicStroke(1.0f), f10, f11);
    }

    public lp_0(Stroke stroke, float f10, float f11) {
        this.H = stroke;
        this.E = f10;
        this.I = f11;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Shape createStrokedShape(Shape var1_1) {
        var3_2 = new GeneralPath();
        var4_3 = new FlatteningPathIterator(var1_1.getPathIterator(null), 1.0);
        var2_4 = lp_0.N();
        var5_5 = new float[(int)lp_0.a];
        var6_6 = 0.0f;
        var7_7 = 0.0f;
        var8_8 = 0.0f;
        var9_9 = 0.0f;
        var13_10 = 0.0f;
        var14_11 = 0;
        while (!var4_3.isDone()) {
            block11: {
                var12_14 = var4_3.currentSegment(var5_5);
                if (var2_4 != 0) break block11;
                switch (var12_14) {
                    case 0: {
                        var6_6 = var8_8 = var5_5[0];
                        var7_7 = var9_9 = var5_5[1];
                        var3_2.moveTo(var6_6, var7_7);
                        var13_10 = this.I / 2.0f;
                        if (var2_4 == 0) ** GOTO lbl54
                    }
                    case 4: {
                        var5_5[0] = var6_6;
                        var5_5[1] = var7_7;
                    }
                    case 1: {
                        var10_12 = var5_5[0];
                        var11_13 = var5_5[1];
                        var15_15 = var10_12 - var8_8;
                        var16_16 = var11_13 - var9_9;
                        var17_17 = (float)Math.sqrt(var15_15 * var15_15 + var16_16 * var16_16);
                        v0 = var17_17 == var13_10 ? 0 : (var17_17 > var13_10 ? 1 : -1);
                        if (var2_4 != 0) ** GOTO lbl52
                        if (v0 < 0) ** GOTO lbl47
                        var18_18 = 1.0f / var17_17;
                        while (var17_17 >= var13_10) {
                            var19_19 = var8_8 + var13_10 * var15_15 * var18_18;
                            var20_20 = var9_9 + var13_10 * var16_16 * var18_18;
                            if (var2_4 != 0) ** GOTO lbl42
                            v0 = (float)(var14_11 & true);
                            if (var2_4 != 0) ** GOTO lbl52
                            if (v0 != false) ** GOTO lbl43
                            var3_2.lineTo(var19_19 + this.E * var16_16 * var18_18, var20_20 - this.E * var15_15 * var18_18);
lbl42:
                            // 2 sources

                            if (var2_4 == 0) ** GOTO lbl44
lbl43:
                            // 2 sources

                            var3_2.lineTo(var19_19 - this.E * var16_16 * var18_18, var20_20 + this.E * var15_15 * var18_18);
lbl44:
                            // 2 sources

                            var13_10 += this.I;
                            ++var14_11;
                            if (var2_4 == 0) continue;
                        }
lbl47:
                        // 3 sources

                        var13_10 -= var17_17;
                        var8_8 = var10_12;
                        var9_9 = var11_13;
                        if (var2_4 != 0) break;
                        v0 = var12_14;
lbl52:
                        // 3 sources

                        if (v0 == 4) {
                            var3_2.closePath();
                        }
                    }
lbl54:
                    // 5 sources

                    default: {
                        var4_3.next();
                    }
                }
            }
            if (var2_4 == 0) continue;
        }
        return this.H.createStrokedShape(var3_2);
    }

    public static void O(int n10) {
        A = n10;
    }

    public static int z() {
        return A;
    }

    public static int N() {
        int n10 = lp_0.z();
        if (n10 == 0) {
            return 100;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (lp_0.N() != 0) {
            lp_0.O(10);
        }
        long l2 = 2633997535962250468L;
        a = 0x8AAF770FAE48BCE2L ^ l2;
    }
}

