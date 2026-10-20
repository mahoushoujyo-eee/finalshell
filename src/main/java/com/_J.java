/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _J
implements ActionListener {
    final k3_0 Q;

    _J(k3_0 k3_02) {
        this.Q = k3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            k3_0 k3_02;
            block2: {
                block3: {
                    int[] nArray = k3_0.L();
                    k3_02 = this.Q;
                    if (nArray == null) break block2;
                    if (!(k3_02.k > 0.0f)) break block3;
                    this.Q.k = Math.max(0.0f, this.Q.k - this.Q.H);
                    this.Q.revalidate();
                    if (nArray != null) break block4;
                }
                this.Q.k = 0.0f;
                this.Q.u();
                k3_02 = this.Q;
            }
            k3_02.p.Y();
        }
    }
}

