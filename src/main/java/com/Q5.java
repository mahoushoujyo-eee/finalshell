/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BK;
import com.KD;
import com.gi_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class Q5
implements ActionListener {
    final BK B;

    Q5(BK bK) {
        this.B = bK;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            JComponent jComponent;
            block5: {
                float f10;
                block4: {
                    this.B.g.u += 0.075f;
                    int[] nArray = KD.s();
                    float f11 = this.B.g.u - 1.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (nArray != null) break block4;
                    if (f10 >= 0) {
                        this.B.g.u = 1.0f;
                        this.B.g.x.Y();
                    }
                    gi_0.F(this.B.g);
                    jComponent = this.B.w;
                    if (nArray != null) break block5;
                    f10 = (float)jComponent.isEnabled();
                }
                if (f10 == false) break block6;
                jComponent = this.B.w;
            }
            jComponent.repaint();
        }
    }
}

