/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.E;
import com.YM;
import com.nx_2;
import com.wc_0;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.nu
 */
class nu_2
implements wc_0 {
    final YM a;

    nu_2(YM yM) {
        this.a = yM;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        block3: {
            E e2;
            block2: {
                int n10 = nx_2.R();
                e2 = YM.M(this.a);
                if (n10 != 0) break block2;
                if (e2 == null) break block3;
                YM.A(this.a, false);
                e2 = YM.M(this.a);
            }
            e2.dispose();
        }
    }
}

