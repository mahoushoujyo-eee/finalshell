/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kw_1;
import com.oy_1;
import com.xt_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.nt
 */
class nt_2
implements ActionListener {
    final xt_0 G;

    nt_2(xt_0 xt_02) {
        this.G = xt_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block7: {
            xt_0 xt_02;
            block6: {
                boolean bl;
                block4: {
                    int n10;
                    block5: {
                        bl = oy_1.y();
                        n10 = xt_0.u(this.G);
                        if (!bl) break block4;
                        if (n10 >= this.G.z.J() * 2) break block5;
                        xt_0.t(this.G, kw_1.e(this.G.z));
                        if (bl) break block4;
                    }
                    n10 = xt_0.X(this.G, 0);
                }
                xt_02 = this.G;
                if (!bl) break block6;
                if (!xt_02.isVisible()) break block7;
                xt_02 = this.G;
            }
            xt_02.repaint();
        }
    }
}

