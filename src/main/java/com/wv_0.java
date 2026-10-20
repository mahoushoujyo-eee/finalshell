/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cn_0;
import com.wh_1;
import com.xw_1;
import javax.swing.JLabel;

/*
 * Renamed from com.Wv
 */
class wv_0
extends JLabel {
    final xw_1 t;

    wv_0(xw_1 xw_12) {
        this.t = xw_12;
    }

    @Override
    public String getText() {
        block5: {
            int n10;
            wh_1 wh_12;
            block4: {
                String[] stringArray = cn_0.Q();
                wh_12 = cn_0.l(this.t.u);
                if (stringArray == null) break block4;
                if (wh_12 == null) break block5;
                wh_12 = cn_0.l(this.t.u);
            }
            if ((n10 = wh_12.F(this.t)) != -1) {
                return cn_0.l(this.t.u).r(n10);
            }
        }
        return null;
    }
}

