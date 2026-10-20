/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wo_1;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JList;

/*
 * Renamed from com.nV
 */
class nv_1
extends ComponentAdapter {
    final JList T;
    final wo_1 l;

    nv_1(wo_1 wo_12, JList jList) {
        this.l = wo_12;
        this.T = jList;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.R();
    }

    private void R() {
        block5: {
            Rectangle rectangle;
            Rectangle rectangle2;
            block6: {
                wo_1 wo_12;
                int n10;
                block4: {
                    n10 = wo_1.f();
                    wo_12 = this.l;
                    if (n10 != 0) break block4;
                    if (!wo_12.D()) break block5;
                    wo_12 = this.l;
                }
                rectangle = rectangle2 = wo_12.n(this.T, this.l.f, this.l.b);
                if (n10 != 0) break block6;
                if (rectangle == null) break block5;
                rectangle = rectangle2;
            }
            if (!rectangle.equals(this.l.d.getBounds())) {
                this.l.d.setBounds(rectangle2);
                this.T.revalidate();
                this.T.repaint();
            }
        }
    }
}

