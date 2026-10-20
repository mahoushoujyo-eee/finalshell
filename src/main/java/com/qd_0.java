/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T5;
import com.cn_0;
import com.wh_1;
import com.xw_1;
import java.awt.Component;

/*
 * Renamed from com.Qd
 */
class qd_0
implements T5 {
    final xw_1 q;

    qd_0(xw_1 xw_12) {
        this.q = xw_12;
    }

    @Override
    public void S(Component component) {
        xw_1.w(this.q).o(component);
    }

    @Override
    public void Z(int n10, String string) {
        block3: {
            wh_1 wh_12;
            block2: {
                String[] stringArray = cn_0.Q();
                wh_12 = cn_0.l(this.q.u);
                if (stringArray == null) break block2;
                if (wh_12 == null) break block3;
                wh_12 = cn_0.l(this.q.u);
            }
            wh_12.R(n10, string);
        }
    }
}

