/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EF;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H6
implements ActionListener {
    final EF V;

    H6(EF eF) {
        this.V = eF;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            EF eF;
            block5: {
                float f10;
                block4: {
                    String string = kz_2.M();
                    float f11 = this.V.I.q - 1.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (string == null) break block4;
                    if (f10 < 0) {
                        this.V.I.q += 0.1f;
                    }
                    this.V.I.q = Math.min(this.V.I.q, 1.0f);
                    this.V.I.repaint();
                    eF = this.V;
                    if (string == null) break block5;
                    float f12 = eF.I.q - 1.0f;
                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                if (f10 < 0) break block6;
                eF = this.V;
            }
            EF.l(eF).Y();
        }
    }
}

