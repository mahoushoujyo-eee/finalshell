/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fg_0;
import com.k0_0;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CU
implements ActionListener {
    final fg_0 Z;

    CU(fg_0 fg_02) {
        this.Z = fg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            k0_0 k0_02;
            block2: {
                block3: {
                    this.Z.f.X += 0.1f;
                    String string = kz_2.M();
                    k0_02 = this.Z.f;
                    if (string == null) break block2;
                    if (!(k0_02.X < 1.0f)) break block3;
                    this.Z.f.repaint();
                    if (string != null) break block4;
                }
                this.Z.f.X = 1.0f;
                this.Z.f.repaint();
                k0_02 = this.Z.f;
            }
            k0_02.v.Y();
        }
    }
}

