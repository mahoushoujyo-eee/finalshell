/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C.M;
import com.HG;
import com.ds_0;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.Hm
 */
class hm_0
extends HG {
    final ds_0 l;

    hm_0(ds_0 ds_02) {
        this.l = ds_02;
    }

    @Override
    protected Rectangle V(MouseEvent mouseEvent) {
        block3: {
            int n10;
            block2: {
                int[] nArray = ds_0.U();
                n10 = this.l.v;
                if (nArray != null) break block2;
                if (n10 == 0) break block3;
                n10 = this.l.G();
            }
            int n11 = n10;
            return new Rectangle(n11, n11, this.l.o.getWidth() - n11 * 2, this.l.o.getHeight() - n11 * 2);
        }
        return null;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        hm_0 hm_02;
        block4: {
            block5: {
                int[] nArray = ds_0.U();
                hm_02 = this;
                if (nArray != null) break block4;
                if (!hm_02.B) break block5;
                hm_02 = this;
                if (nArray != null) break block4;
                if (hm_02.l.r) {
                    this.l.r = false;
                    this.l.G = null;
                    this.l.e(M.simple);
                    this.l.r();
                }
            }
            hm_02 = this;
        }
        super.mouseDragged(mouseEvent);
    }
}

