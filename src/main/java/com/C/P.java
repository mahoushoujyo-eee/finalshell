/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.c.y_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class P
implements ActionListener {
    final y_0 Z;

    P(y_0 y_02) {
        this.Z = y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            y_0 y_02;
            block2: {
                block3: {
                    int[] nArray = W.B();
                    y_02 = this.Z;
                    if (nArray != null) break block2;
                    if (!(y_02.D > 0.0f)) break block3;
                    this.Z.D -= 0.1f;
                    this.Z.p();
                    if (nArray == null) break block4;
                }
                this.Z.D = 0.0f;
                y_02 = this.Z;
            }
            y_02.Q.Y();
        }
    }
}

