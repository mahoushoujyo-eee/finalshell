/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.SZ;
import com.og_2;
import com.xm_0;
import java.awt.Dimension;

/*
 * Renamed from com.Kw
 */
class kw_0
extends KD {
    final xm_0 K;

    kw_0(xm_0 xm_02, og_2 og_22) {
        this.K = xm_02;
        super(og_22);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension dimension;
        block3: {
            kw_0 kw_02;
            block4: {
                xm_0 xm_02;
                block2: {
                    String string = SZ.L();
                    xm_02 = this.K;
                    if (string != null) break block2;
                    if (xm_02.E == null) break block3;
                    kw_02 = this;
                    if (string != null) break block4;
                    xm_02 = kw_02.K;
                }
                if (!xm_02.e) break block3;
                kw_02 = this;
            }
            dimension = super.getPreferredSize();
            return dimension;
        }
        dimension = new Dimension(0, 0);
        return dimension;
    }
}

