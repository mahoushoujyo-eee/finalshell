/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.SZ;
import com.og_2;
import com.xm_0;
import java.awt.Dimension;

class KJ
extends KD {
    final xm_0 J;

    KJ(xm_0 xm_02, og_2 og_22) {
        this.J = xm_02;
        super(og_22);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Dimension getPreferredSize() {
        Dimension dimension;
        block3: {
            KJ kJ;
            block4: {
                xm_0 xm_02;
                block2: {
                    String string = SZ.L();
                    xm_02 = this.J;
                    if (string != null) break block2;
                    if (xm_02.E == null) break block3;
                    kJ = this;
                    if (string != null) break block4;
                    xm_02 = kJ.J;
                }
                if (!xm_02.e) break block3;
                kJ = this;
            }
            dimension = super.getPreferredSize();
            return dimension;
        }
        dimension = new Dimension(0, 0);
        return dimension;
    }
}

