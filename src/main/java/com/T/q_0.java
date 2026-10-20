/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.A;
import com.t.c_0;
import com.t.n_0;
import java.awt.Color;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.t.q
 */
class q_0
implements PaintContext {
    private Map s;
    final AffineTransform C;
    final c_0 i;
    private static final long a;

    q_0(c_0 c_02, AffineTransform affineTransform) {
        this.i = c_02;
        this.C = affineTransform;
        this.s = new HashMap();
    }

    @Override
    public void dispose() {
        this.s.clear();
    }

    @Override
    public ColorModel getColorModel() {
        return c_0.t(this.i);
    }

    @Override
    public Raster getRaster(int n10, int n11, int n12, int n13) {
        WritableRaster writableRaster;
        block5: {
            Rectangle rectangle = new Rectangle(n10, n11, n12, n13);
            int n14 = n_0.W();
            q_0 q_02 = this;
            if (n14 != 0) {
                if (q_02.s.containsKey(rectangle)) {
                    return (Raster)this.s.get(rectangle);
                }
                q_02 = this;
            }
            writableRaster = c_0.t(q_02.i).createCompatibleWritableRaster(n12, n13);
            n11 = (int)((long)n11 - Math.round(this.C.getTranslateY()));
            int[] nArray = new int[n12 * n13 * 4];
            int n15 = 0;
            while (n15 < n13) {
                block6: {
                    if (n14 == 0) break block5;
                    for (int i2 = 0; i2 < n12; ++i2) {
                        Color color = new A(1.0f - (float)(n11 + n15) / (float)(c_0.O(this.i) * 2 + c_0.L(this.i)), 1.0f, 1.0f).E();
                        int n16 = (n15 * n12 + i2) * 4;
                        nArray[n16] = c_0.l(this.i, color.getRed());
                        nArray[n16 + 1] = c_0.l(this.i, color.getGreen());
                        nArray[n16 + 2] = c_0.l(this.i, color.getBlue());
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
            this.s.put(rectangle, writableRaster);
        }
        return writableRaster;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 976348985882135495L;
        a = 0xC48CC217D0514B38L ^ l2;
    }
}

