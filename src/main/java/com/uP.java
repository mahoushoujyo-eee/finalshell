/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.i2_0;
import com.wc_0;
import com.xd_1;
import java.awt.event.KeyEvent;
import java.util.List;

class uP
implements wc_0 {
    uP() {
    }

    @Override
    public void j(KeyEvent keyEvent) {
        block3: {
            int n10;
            int n11;
            int n12;
            List list;
            block2: {
                String string = i2_0.X();
                list = i2_0.Q();
                n12 = list.indexOf(string);
                String[] stringArray = xd_1.U();
                n11 = n12;
                n10 = -1;
                if (stringArray != null) break block2;
                if (n11 == n10) break block3;
                n11 = n12;
                n10 = list.size() - 1;
            }
            i2_0.d(n11 < n10 ? (String)list.get(n12 + 1) : (String)list.get(0));
        }
    }
}

