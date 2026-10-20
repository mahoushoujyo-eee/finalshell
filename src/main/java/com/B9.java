/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.pa_1;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class B9
implements MouseWheelListener {
    final pa_1 R;

    B9(pa_1 pa_12) {
        this.R = pa_12;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        block3: {
            int n10;
            block2: {
                int n11 = _y_0.y();
                n10 = this.R.m(mouseWheelEvent);
                if (n11 != 0) break block2;
                if (n10 == 0) break block3;
                n10 = mouseWheelEvent.getWheelRotation();
            }
            int n12 = n10;
            pa_1.Z(this.R, n12);
        }
    }
}

