/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.dD
 */
class dd_1
implements ActionListener {
    final kf_1 k;

    dd_1(kf_1 kf_12) {
        this.k = kf_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            kf_1 kf_12;
            block2: {
                block3: {
                    String string = kz_2.M();
                    kf_12 = this.k;
                    if (string == null) break block2;
                    if (kf_12.D == null) break block3;
                    this.k.a.s(this.k.D);
                    if (string != null) break block4;
                }
                kf_12 = this.k;
            }
            kf_12.a.T();
        }
    }
}

