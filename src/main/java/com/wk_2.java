/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EF;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.wk
 */
class wk_2
implements ActionListener {
    final EF q;

    wk_2(EF eF) {
        this.q = eF;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            EF eF;
            block5: {
                float f10;
                block4: {
                    String string = kz_2.M();
                    float f11 = this.q.I.q - 0.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (string == null) break block4;
                    if (f10 > 0) {
                        this.q.I.q -= 0.1f;
                    }
                    this.q.I.q = Math.max(this.q.I.q, 0.0f);
                    this.q.I.repaint();
                    eF = this.q;
                    if (string == null) break block5;
                    float f12 = eF.I.q - 0.0f;
                    f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                }
                if (f10 > 0) break block6;
                eF = this.q;
            }
            EF.l(eF).Y();
        }
    }
}

