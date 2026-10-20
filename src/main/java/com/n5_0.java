/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k0_0;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.n5
 */
class n5_0
implements ActionListener {
    final k0_0 n;

    n5_0(k0_0 k0_02) {
        this.n = k0_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            k0_0 k0_02;
            block2: {
                block3: {
                    this.n.X -= 0.1f;
                    String string = kz_2.M();
                    k0_02 = this.n;
                    if (string == null) break block2;
                    if (!(k0_02.X > 0.0f)) break block3;
                    this.n.repaint();
                    if (string != null) break block4;
                }
                this.n.g();
                k0_02 = this.n;
            }
            k0_02.v.Y();
        }
    }
}

