/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.pa_1;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.Wg
 */
class wg_0
implements ChangeListener {
    final pa_1 o;

    wg_0(pa_1 pa_12) {
        this.o = pa_12;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        pa_1 pa_12;
        block4: {
            block5: {
                this.o.cS = true;
                this.o.P = pa_1.y(this.o).getValue();
                int n10 = _y_0.y();
                pa_12 = this.o;
                if (n10 != 0) break block4;
                if (pa_1.e(pa_12) == null) break block5;
                pa_12 = this.o;
                if (n10 != 0) break block4;
                if (pa_12.q.isVisible()) {
                    this.o.N();
                    this.o.q.getParent().doLayout();
                }
            }
            pa_12 = this.o;
        }
        pa_12.repaint();
    }
}

