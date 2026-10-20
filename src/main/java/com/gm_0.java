/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D3;
import com.xt_1;
import javax.swing.JRootPane;

/*
 * Renamed from com.Gm
 */
class gm_0
extends JRootPane {
    private boolean X;
    final D3 j;

    gm_0(D3 d3) {
        this.j = d3;
        this.X = false;
    }

    @Override
    public void validate() {
        block3: {
            block2: {
                String string = xt_1.l();
                super.validate();
                String string2 = string;
                gm_0 gm_02 = this;
                if (string2 == null) break block2;
                if (gm_02.X) break block3;
                this.X = true;
                this.j.pack();
                gm_02 = this;
            }
            gm_02.X = false;
        }
    }
}

