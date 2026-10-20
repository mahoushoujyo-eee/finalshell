/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oy_1;
import com.xt_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Ww
 */
class ww_0
implements ActionListener {
    final xt_0 u;
    private static final long a;

    ww_0(xt_0 xt_02) {
        this.u = xt_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            block2: {
                int n10;
                block3: {
                    boolean bl = oy_1.y();
                    n10 = xt_0.M(this.u);
                    if (!bl) break block2;
                    if (n10 <= 0) break block3;
                    xt_0.n(this.u, (int)a);
                    if (bl) break block4;
                }
                n10 = xt_0.i(this.u, 0);
            }
            xt_0.K(this.u).Y();
            xt_0.a(this.u);
            this.u.setVisible(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1488391915559922698L;
        a = 0xA614D541B5832C02L ^ l2;
    }
}

