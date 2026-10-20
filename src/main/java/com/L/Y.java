/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import com.ky_2;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class Y
implements MouseWheelListener {
    final m J;

    Y(m m10) {
        this.J = m10;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        block5: {
            int n10;
            int n11;
            int n12;
            block7: {
                ky_2[] ky_2Array;
                block6: {
                    block4: {
                        ky_2Array = m.X();
                        n12 = this.J.b;
                        if (ky_2Array != null) break block4;
                        if (n12 == 0) break block5;
                        n12 = m.F(this.J).isEnabled();
                    }
                    if (ky_2Array != null) break block6;
                    if (n12 == 0) break block5;
                    n12 = this.J.Y();
                }
                if (ky_2Array != null) break block7;
                if (n12 == 0) break block5;
                n12 = m.B(this.J).getSelectedIndex();
            }
            if ((n11 = Math.min(Math.max(0, (n10 = n12) + mouseWheelEvent.getWheelRotation()), m.M(this.J).getModel().getSize() - 1)) != n10) {
                m.C(this.J).setSelectedIndex(n11);
            }
        }
    }
}

