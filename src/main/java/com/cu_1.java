/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.lp_0;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

/*
 * Renamed from com.cU
 */
public class cu_1
implements Stroke {
    private float l = 2.0f;
    private float W = 2.0f;
    private static final long a;

    public cu_1(float f10, float f11) {
        this.l = f10;
        this.W = f11;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Shape createStrokedShape(Shape var1_1) {
        var3_2 = new GeneralPath();
        var1_1 = new BasicStroke(10.0f).createStrokedShape(var1_1);
        var4_3 = new FlatteningPathIterator(var1_1.getPathIterator(null), 1.0);
        var2_4 = lp_0.N();
        var5_5 = new float[(int)cu_1.a];
        var6_6 = 0.0f;
        var7_7 = 0.0f;
        var8_8 = 0.0f;
        var9_9 = 0.0f;
        var13_10 = 0.0f;
        while (!var4_3.isDone()) {
            block11: {
                var12_13 = var4_3.currentSegment(var5_5);
                if (var2_4 != 0) break block11;
                switch (var12_13) {
                    case 0: {
                        var6_6 = var8_8 = this.C(var5_5[0]);
                        var7_7 = var9_9 = this.C(var5_5[1]);
                        var3_2.moveTo(var6_6, var7_7);
                        var13_10 = 0.0f;
                        if (var2_4 == 0) break;
                    }
                    case 4: {
                        var5_5[0] = var6_6;
                        var5_5[1] = var7_7;
                    }
                    case 1: {
                        var10_11 = this.C(var5_5[0]);
                        var11_12 = this.C(var5_5[1]);
                        var14_14 = var10_11 - var8_8;
                        var15_15 = var11_12 - var9_9;
                        v0 = var16_16 = (float)Math.sqrt(var14_14 * var14_14 + var15_15 * var15_15);
                        v1 = var13_10;
                        if (var2_4 != 0) ** GOTO lbl44
                        if (v0 >= v1) {
                            var17_17 = 1.0f / var16_16;
                            while (var16_16 >= var13_10) {
                                var18_18 = var8_8 + var13_10 * var14_14 * var17_17;
                                var19_19 = var9_9 + var13_10 * var15_15 * var17_17;
                                var3_2.lineTo(this.C(var18_18), this.C(var19_19));
                                var13_10 += this.l;
                                if (var2_4 == 0) {
                                    if (var2_4 == 0) continue;
                                }
                                break;
                            }
                        } else {
                            v0 = var13_10;
                            v1 = var16_16;
lbl44:
                            // 2 sources

                            var13_10 = v0 - v1;
                            var8_8 = var10_11;
                        }
                        var9_9 = var11_12;
                    }
                }
                var4_3.next();
            }
            if (var2_4 == 0) continue;
        }
        if (ky_2.F() != null) {
            lp_0.O(++var2_4);
        }
        return var3_2;
    }

    private float C(float f10) {
        return f10 + (float)Math.random() * this.W * 2.0f - 1.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5434447816205473342L;
        a = 0x58D8A639F3531638L ^ l2;
    }
}

