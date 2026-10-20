/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.lp_0;
import java.awt.Font;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.GeneralPath;

/*
 * Renamed from com.ps
 */
public class ps_2
implements Stroke {
    private String W;
    private Font l;
    private boolean F = false;
    private boolean q = false;
    private AffineTransform o = new AffineTransform();
    private static final long[] a;
    private static final Integer[] b;

    public ps_2(String string, Font font) {
        this(string, font, true, false);
    }

    public ps_2(String string, Font font, boolean bl, boolean bl2) {
        this.W = string;
        this.l = font;
        this.F = bl;
        this.q = bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Shape createStrokedShape(Shape var1_1) {
        block15: {
            var3_2 = new FontRenderContext(null, true, true);
            var4_3 = this.l.createGlyphVector(var3_2, this.W);
            var5_4 = new GeneralPath();
            var6_5 = new FlatteningPathIterator(var1_1.getPathIterator(null), 1.0);
            var7_6 = new float[ps_2.a(26202, 3798645033542414022L)];
            var8_7 = 0.0f;
            var9_8 = 0.0f;
            var10_9 = 0.0f;
            var11_10 = 0.0f;
            var2_11 = lp_0.z();
            var15_12 = 0.0f;
            var16_13 = 0;
            v0 = var17_14 = var4_3.getNumGlyphs();
            if (var2_11 == 0) break block15;
            if (v0 == 0) {
                return var5_4;
            }
            v1 = this;
            if (var2_11 == 0) ** GOTO lbl23
            v0 = (int)v1.F;
        }
        if (v0 != 0) {
            v1 = this;
lbl23:
            // 2 sources

            v2 = v1.H(var1_1) / (float)var4_3.getLogicalBounds().getWidth();
        } else {
            v2 = 1.0f;
        }
        var18_15 = v2;
        var19_16 = 0.0f;
        block5: while (true) {
            v3 = var16_13;
            block6: while (v3 < var17_14) {
                v4 = var6_5.isDone();
                if (var2_11 != 0) {
                    if (v4 != 0) break block5;
                    v4 = var14_19 = var6_5.currentSegment(var7_6);
                }
                if (var2_11 == 0) continue block5;
                switch (var14_19) {
                    case 0: {
                        var8_7 = var10_9 = var7_6[0];
                        var9_8 = var11_10 = var7_6[1];
                        var5_4.moveTo(var8_7, var9_8);
                        var15_12 = var19_16 = var4_3.getGlyphMetrics(var16_13).getAdvance() * 0.5f;
                        if (var2_11 != 0) break;
                        ky_2.K(new String[2]);
                    }
                    case 4: {
                        var7_6[0] = var8_7;
                        var7_6[1] = var9_8;
                    }
                    case 1: {
                        var12_17 = var7_6[0];
                        var13_18 = var7_6[1];
                        var20_20 = var12_17 - var10_9;
                        var21_21 = var13_18 - var11_10;
                        v5 = var22_22 = (float)Math.sqrt(var20_20 * var20_20 + var21_21 * var21_21);
                        v6 = var15_12;
                        if (var2_11 == 0) ** GOTO lbl88
                        if (!(v5 >= v6)) ** GOTO lbl86
                        var23_23 = 1.0f / var22_22;
                        var24_24 = (float)Math.atan2(var21_21, var20_20);
                        while (var16_13 < var17_14) {
                            v5 = var22_22;
                            v6 = var15_12;
                            if (var2_11 == 0) ** GOTO lbl88
                            cfr_temp_0 = v5 - v6;
                            v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var2_11 == 0) continue block6;
                            if (v3 < 0) break;
                            var25_25 = var4_3.getGlyphOutline(var16_13);
                            var26_26 = var4_3.getGlyphPosition(var16_13);
                            var27_27 = (float)var26_26.getX();
                            var28_28 = (float)var26_26.getY();
                            var29_29 = var10_9 + var15_12 * var20_20 * var23_23;
                            var30_30 = var11_10 + var15_12 * var21_21 * var23_23;
                            var31_31 = var19_16;
                            var19_16 = var16_13 < var17_14 - 1 ? var4_3.getGlyphMetrics(var16_13 + 1).getAdvance() * 0.5f : 0.0f;
                            this.o.setToTranslation(var29_29, var30_30);
                            this.o.rotate(var24_24);
                            this.o.translate(-var27_27 - var31_31, -var28_28);
                            var5_4.append(this.o.createTransformedShape(var25_25), false);
                            var15_12 += (var31_31 + var19_16) * var18_15;
                            ++var16_13;
                            v7 = this.q;
                            if (var2_11 == 0) ** GOTO lbl84
                            if (v7 == 0) ** GOTO lbl85
                            v7 = var16_13 % var17_14;
lbl84:
                            // 2 sources

                            var16_13 = v7;
lbl85:
                            // 2 sources

                            if (var2_11 != 0) continue;
                        }
lbl86:
                        // 4 sources

                        v5 = var15_12;
                        v6 = var22_22;
lbl88:
                        // 3 sources

                        var15_12 = v5 - v6;
                        var10_9 = var12_17;
                        var11_10 = var13_18;
                    }
                }
                var6_5.next();
                if (var2_11 != 0) continue block5;
            }
            break;
        }
        return var5_4;
    }

    public float H(Shape shape) {
        FlatteningPathIterator flatteningPathIterator = new FlatteningPathIterator(shape.getPathIterator(null), 1.0);
        float[] fArray = new float[ps_2.a(5603, 1565897720011529598L)];
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int n10 = lp_0.z();
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (!flatteningPathIterator.isDone()) {
            int n11 = flatteningPathIterator.currentSegment(fArray);
            if (n10 != 0) {
                switch (n11) {
                    case 0: {
                        f10 = f12 = fArray[0];
                        f11 = f13 = fArray[1];
                        if (n10 != 0) break;
                    }
                    case 4: {
                        fArray[0] = f10;
                        fArray[1] = f11;
                    }
                    case 1: {
                        float f15 = fArray[0];
                        float f16 = fArray[1];
                        float f17 = f15 - f12;
                        float f18 = f16 - f13;
                        f14 += (float)Math.sqrt(f17 * f17 + f18 * f18);
                        f12 = f15;
                        f13 = f16;
                    }
                }
                flatteningPathIterator.next();
            }
            if (n10 != 0) continue;
        }
        return f14;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8935990644132187010L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0092\u00fd,\u00abw\u00aeeB\u00ecF\u008e9PW\u0016\u00fa";
        int n11 = "\u0092\u00fd,\u00abw\u00aeeB\u00ecF\u008e9PW\u0016\u00fa".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x89C;
        if (b[n11] == null) {
            ps_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

