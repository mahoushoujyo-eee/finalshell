/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EW;
import com.XE;
import com._y_0;
import com.iy_1;
import com.pa_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class SU
extends MouseAdapter {
    final iy_1 c;
    final pa_1 e;

    SU(pa_1 pa_12, iy_1 iy_12) {
        this.e = pa_12;
        this.c = iy_12;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            MouseEvent mouseEvent2;
            pa_1 pa_12;
            block4: {
                boolean bl;
                block2: {
                    int n10 = _y_0.M();
                    bl = pa_1.S(this.e).t();
                    if (n10 == 0) break block2;
                    if (!bl) break block3;
                    pa_12 = this.e;
                    mouseEvent2 = mouseEvent;
                    if (n10 == 0) break block4;
                    bl = pa_12.b(mouseEvent2);
                }
                if (!bl) break block3;
                pa_12 = this.e;
                mouseEvent2 = mouseEvent;
            }
            XE xE2 = pa_1.x(pa_12, mouseEvent2.getPoint());
            this.c.u(xE2.q, xE2.r, new EW(mouseEvent));
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            MouseEvent mouseEvent2;
            pa_1 pa_12;
            block4: {
                boolean bl;
                block2: {
                    int n10 = _y_0.M();
                    bl = pa_1.S(this.e).t();
                    if (n10 == 0) break block2;
                    if (!bl) break block3;
                    pa_12 = this.e;
                    mouseEvent2 = mouseEvent;
                    if (n10 == 0) break block4;
                    bl = pa_12.b(mouseEvent2);
                }
                if (!bl) break block3;
                pa_12 = this.e;
                mouseEvent2 = mouseEvent;
            }
            XE xE2 = pa_1.x(pa_12, mouseEvent2.getPoint());
            this.c.z(xE2.q, xE2.r, new EW(mouseEvent));
        }
    }
}

