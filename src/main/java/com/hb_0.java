/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com._y_0;
import com.pa_1;
import com.ru_1;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/*
 * Renamed from com.Hb
 */
class hb_0
extends MouseMotionAdapter {
    final pa_1 a;
    private static final long b;

    hb_0(pa_1 pa_12) {
        this.a = pa_12;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        super.mouseMoved(mouseEvent);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        MouseEvent mouseEvent2;
        pa_1 pa_12;
        int n10;
        block16: {
            long l2;
            block15: {
                n10 = _y_0.y();
                long l3 = System.currentTimeMillis() - this.a.M - b;
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (n10 == 0) {
                    if (l2 < 0) {
                        return;
                    }
                    l2 = (long)this.a.A;
                }
                if (n10 != 0) break block15;
                if (l2 == false) {
                    return;
                }
                pa_12 = this.a;
                mouseEvent2 = mouseEvent;
                if (n10 != 0) break block16;
                l2 = (long)pa_12.m(mouseEvent2);
            }
            if (l2 == false) {
                return;
            }
            pa_12 = this.a;
            mouseEvent2 = mouseEvent;
        }
        XE xE2 = pa_1.x(pa_12, mouseEvent2.getPoint());
        ru_1 ru_12 = pa_1.e(this.a);
        if (n10 == 0) {
            if (ru_12 == null) {
                pa_1 pa_13 = this.a;
                if (n10 == 0) {
                    if (pa_1.A(pa_13) == null) {
                        pa_1.f(this.a, xE2);
                    }
                    pa_13 = this.a;
                }
                pa_1.t(pa_13, new ru_1(new XE(pa_1.A(this.a))));
            }
            this.a.repaint();
            ru_12 = pa_1.e(this.a);
        }
        ru_12.m(xE2);
        if (pa_1.S(this.a).V()) {
            // empty if block
        }
        int n11 = mouseEvent.getPoint().y;
        if (n10 == 0) {
            if (n11 < 0) {
                pa_1.Z(this.a, (int)((double)mouseEvent.getPoint().y * pa_1.z));
            }
            n11 = mouseEvent.getPoint().y;
        }
        if (n11 > this.a.J()) {
            pa_1.Z(this.a, (int)((double)(mouseEvent.getPoint().y - this.a.J()) * pa_1.z));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3575949113380697443L;
        b = 0x31A052C5BDEDF551L ^ l2;
    }
}

