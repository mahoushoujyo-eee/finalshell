/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.Q;
import com.t.n_0;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.t.E
 */
class e_0
implements PaintContext {
    private Map M;
    final AffineTransform k;
    final Q F;
    private static final long a;

    e_0(Q q2, AffineTransform affineTransform) {
        this.F = q2;
        this.k = affineTransform;
        this.M = new HashMap();
    }

    @Override
    public void dispose() {
        this.M.clear();
    }

    @Override
    public ColorModel getColorModel() {
        return Q.m(this.F);
    }

    @Override
    public Raster getRaster(int n10, int n11, int n12, int n13) {
        WritableRaster writableRaster;
        block5: {
            Rectangle rectangle = new Rectangle(n10, n11, n12, n13);
            int n14 = n_0.W();
            e_0 e_02 = this;
            if (n14 != 0) {
                if (e_02.M.containsKey(rectangle)) {
                    return (Raster)this.M.get(rectangle);
                }
                e_02 = this;
            }
            writableRaster = Q.m(e_02.F).createCompatibleWritableRaster(n12, n13);
            n10 = (int)((long)n10 - Math.round(this.k.getTranslateX()));
            n11 = (int)((long)n11 - Math.round(this.k.getTranslateY()));
            int[] nArray = new int[n12 * n13 * 4];
            int n15 = 0;
            while (n15 < n13) {
                block6: {
                    if (n14 == 0) break block5;
                    for (int i2 = 0; i2 < n12; ++i2) {
                        int n16 = (n15 * n12 + i2) * 4;
                        nArray[n16] = Q.N(this.F, n10 + i2, n11 + n15);
                        nArray[n16 + 1] = Q.n(this.F, n10 + i2, n11 + n15);
                        nArray[n16 + 2] = Q.F(this.F, n10 + i2, n11 + n15);
                        nArray[n16 + 3] = (int)a;
                        if (n14 != 0) {
                            if (n14 != 0) continue;
                        }
                        break block6;
                    }
                    ++n15;
                }
                if (n14 != 0) continue;
            }
            writableRaster.setPixels(0, 0, n12, n13, nArray);
            this.M.put(rectangle, writableRaster);
        }
        return writableRaster;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6778374795622601653L;
        a = 0x4C4371B3978BD34AL ^ l2;
    }
}

