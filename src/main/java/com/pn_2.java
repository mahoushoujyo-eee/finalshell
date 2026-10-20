/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lp_0;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/*
 * Renamed from com.pn
 */
public class pn_2
implements Stroke {
    private Shape[] W;
    private float G;
    private boolean x = true;
    private AffineTransform k = new AffineTransform();
    private static final long a;

    public pn_2() {
        this(new Shape[]{new Ellipse2D.Float(0.0f, 0.0f, 4.0f, 4.0f)}, 8.0f);
    }

    public pn_2(Shape shape, float f10) {
        this(new Shape[]{shape}, f10);
    }

    public pn_2(Shape[] shapeArray, float f10) {
        this.G = f10;
        this.W = new Shape[shapeArray.length];
        int n10 = lp_0.N();
        for (int i2 = 0; i2 < this.W.length; ++i2) {
            Rectangle2D rectangle2D = shapeArray[i2].getBounds2D();
            this.k.setToTranslation(-rectangle2D.getCenterX(), -rectangle2D.getCenterY());
            this.W[i2] = this.k.createTransformedShape(shapeArray[i2]);
            if (n10 == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Shape createStrokedShape(Shape var1_1) {
        var3_2 = new GeneralPath();
        var4_3 = new FlatteningPathIterator(var1_1.getPathIterator(null), 1.0);
        var5_4 = new float[(int)pn_2.a];
        var6_5 = 0.0f;
        var7_6 = 0.0f;
        var8_7 = 0.0f;
        var9_8 = 0.0f;
        var13_9 = 0.0f;
        var14_10 = 0;
        var2_11 = lp_0.N();
        var15_12 = this.W.length;
        block5: while (true) {
            v0 = var14_10;
            block6: while (v0 < var15_12) {
                v1 = var4_3.isDone();
                if (var2_11 == 0) {
                    if (v1 != 0) break block5;
                    v1 = var12_15 = var4_3.currentSegment(var5_4);
                }
                if (var2_11 != 0) continue block5;
                switch (var12_15) {
                    case 0: {
                        var6_5 = var8_7 = var5_4[0];
                        var7_6 = var9_8 = var5_4[1];
                        var3_2.moveTo(var6_5, var7_6);
                        var13_9 = 0.0f;
                        if (var2_11 == 0) break;
                    }
                    case 4: {
                        var5_4[0] = var6_5;
                        var5_4[1] = var7_6;
                    }
                    case 1: {
                        var10_13 = var5_4[0];
                        var11_14 = var5_4[1];
                        var16_16 = var10_13 - var8_7;
                        var17_17 = var11_14 - var9_8;
                        v2 = var18_18 = (float)Math.sqrt(var16_16 * var16_16 + var17_17 * var17_17);
                        v3 = var13_9;
                        if (var2_11 != 0) ** GOTO lbl64
                        if (!(v2 >= v3)) ** GOTO lbl62
                        var19_19 = 1.0f / var18_18;
                        var20_20 = (float)Math.atan2(var17_17, var16_16);
                        while (var14_10 < var15_12) {
                            v2 = var18_18;
                            v3 = var13_9;
                            if (var2_11 != 0) ** GOTO lbl64
                            cfr_temp_0 = v2 - v3;
                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var2_11 != 0) continue block6;
                            if (v0 < 0) break;
                            var21_21 = var8_7 + var13_9 * var16_16 * var19_19;
                            var22_22 = var9_8 + var13_9 * var17_17 * var19_19;
                            this.k.setToTranslation(var21_21, var22_22);
                            this.k.rotate(var20_20);
                            var3_2.append(this.k.createTransformedShape(this.W[var14_10]), false);
                            var13_9 += this.G;
                            ++var14_10;
                            v4 = this.x;
                            if (var2_11 != 0) ** GOTO lbl60
                            if (v4 == 0) ** GOTO lbl61
                            v4 = var14_10 % var15_12;
lbl60:
                            // 2 sources

                            var14_10 = v4;
lbl61:
                            // 2 sources

                            if (var2_11 == 0) continue;
                        }
lbl62:
                        // 4 sources

                        v2 = var13_9;
                        v3 = var18_18;
lbl64:
                        // 3 sources

                        var13_9 = v2 - v3;
                        var8_7 = var10_13;
                        var9_8 = var11_14;
                    }
                }
                var4_3.next();
                if (var2_11 == 0) continue block5;
            }
            break;
        }
        return var3_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1888088032160027147L;
        a = 0xEB5A5E58CD90920DL ^ l2;
    }
}

