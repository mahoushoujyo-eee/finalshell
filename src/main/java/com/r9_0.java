/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.r9
 */
class r9_0
implements ActionListener {
    final k3_0 s;

    r9_0(k3_0 k3_02) {
        this.s = k3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            k3_0 k3_02;
            block2: {
                block3: {
                    int[] nArray = k3_0.L();
                    k3_02 = this.s;
                    if (nArray == null) break block2;
                    if (!(k3_02.k < 1.0f)) break block3;
                    this.s.k = Math.min(1.0f, this.s.k + this.s.H);
                    this.s.revalidate();
                    if (nArray != null) break block4;
                }
                this.s.k = 1.0f;
                this.s.K();
                k3_02 = this.s;
            }
            k3_02.p.Y();
        }
    }
}

