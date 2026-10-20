/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PM;
import com.RT;
import com.kd_1;
import com.wx_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Lq
 */
class lq_0
implements ActionListener {
    final kd_1 q;

    lq_0(kd_1 kd_12) {
        this.q = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block2: {
            Object object;
            block3: {
                int[] nArray = kd_1.u();
                if (kd_1.c(this.q).R()) break block2;
                String string = wx_0.a();
                object = string;
                if (nArray != null) break block3;
                if (object == null) break block2;
                object = PM.N(string);
            }
            RT rT = (RT)object;
            kd_1.c(this.q).O(rT);
        }
    }
}

