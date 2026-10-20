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

/*
 * Renamed from com.un
 */
class un_0
implements ActionListener {
    final BK g;

    un_0(BK bK) {
        this.g = bK;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            JComponent jComponent;
            block5: {
                float f10;
                block4: {
                    this.g.g.u -= 0.075f;
                    int[] nArray = KD.s();
                    float f11 = this.g.g.u - 0.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (nArray != null) break block4;
                    if (f10 <= 0) {
                        this.g.g.W = false;
                        this.g.g.b.getModel().setRollover(false);
                        this.g.g.u = 0.0f;
                        this.g.g.F = null;
                        this.g.g.x.Y();
                    }
                    gi_0.F(this.g.g);
                    jComponent = this.g.w;
                    if (nArray != null) break block5;
                    f10 = (float)jComponent.isEnabled();
                }
                if (f10 == false) break block6;
                jComponent = this.g.w;
            }
            jComponent.repaint();
        }
    }
}

