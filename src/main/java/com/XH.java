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

class XH
extends MouseMotionAdapter {
    final pa_1 i;
    private static final long a;

    XH(pa_1 pa_12) {
        this.i = pa_12;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        pa_1.f(this.i, mouseEvent.getPoint(), mouseEvent.isControlDown());
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        MouseEvent mouseEvent2;
        pa_1 pa_12;
        int n10;
        block18: {
            long l2;
            block17: {
                n10 = _y_0.y();
                long l3 = System.currentTimeMillis() - this.i.M - a;
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (n10 == 0) {
                    if (l2 < 0) {
                        return;
                    }
                    l2 = (long)this.i.A;
                }
                if (n10 == 0) {
                    if (l2 == false) {
                        return;
                    }
                    l2 = (long)this.i.m(mouseEvent);
                }
                if (n10 != 0) break block17;
                if (l2 == false) {
                    return;
                }
                pa_12 = this.i;
                mouseEvent2 = mouseEvent;
                if (n10 != 0) break block18;
                l2 = (long)pa_12.m(mouseEvent2);
            }
            if (l2 == false) {
                return;
            }
            pa_12 = this.i;
            mouseEvent2 = mouseEvent;
        }
        XE xE2 = pa_1.x(pa_12, mouseEvent2.getPoint());
        ru_1 ru_12 = pa_1.e(this.i);
        if (n10 == 0) {
            if (ru_12 == null) {
                pa_1 pa_13 = this.i;
                if (n10 == 0) {
                    if (pa_1.A(pa_13) == null) {
                        pa_1.f(this.i, xE2);
                    }
                    pa_13 = this.i;
                }
                pa_1.t(pa_13, new ru_1(new XE(pa_1.A(this.i))));
            }
            this.i.repaint();
            ru_12 = pa_1.e(this.i);
        }
        ru_12.m(xE2);
        if (pa_1.S(this.i).V()) {
            // empty if block
        }
        int n11 = mouseEvent.getPoint().y;
        if (n10 == 0) {
            if (n11 < 0) {
                pa_1.Z(this.i, (int)((double)mouseEvent.getPoint().y * pa_1.z));
            }
            n11 = mouseEvent.getPoint().y;
        }
        if (n11 > this.i.J()) {
            pa_1.Z(this.i, (int)((double)(mouseEvent.getPoint().y - this.i.J()) * pa_1.z));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1307081537624475081L;
        a = 0x1223AFBBB69405FBL ^ l2;
    }
}

