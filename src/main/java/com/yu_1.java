/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com._y_0;
import com.a7;
import com.c;
import com.pa_1;
import com.ru_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.yU
 */
class yu_1
extends MouseAdapter {
    final pa_1 w;

    yu_1(pa_1 pa_12) {
        this.w = pa_12;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block57: {
            int n10;
            int n11;
            block60: {
                int n12;
                block61: {
                    int n13;
                    block58: {
                        block59: {
                            block55: {
                                block56: {
                                    block54: {
                                        block50: {
                                            block51: {
                                                block53: {
                                                    block52: {
                                                        int n14;
                                                        Object object;
                                                        Object object2;
                                                        block43: {
                                                            block45: {
                                                                block44: {
                                                                    block47: {
                                                                        XE xE2;
                                                                        int n15;
                                                                        int n16;
                                                                        block48: {
                                                                            int n17;
                                                                            block49: {
                                                                                block46: {
                                                                                    int n18;
                                                                                    block41: {
                                                                                        block42: {
                                                                                            block39: {
                                                                                                pa_1 pa_12;
                                                                                                block40: {
                                                                                                    int n19;
                                                                                                    int n20;
                                                                                                    block38: {
                                                                                                        n13 = _y_0.y();
                                                                                                        n20 = mouseEvent.getButton();
                                                                                                        n19 = 1;
                                                                                                        if (n13 != 0) break block38;
                                                                                                        if (n20 == n19) {
                                                                                                            this.w.x();
                                                                                                        }
                                                                                                        pa_12 = this.w;
                                                                                                        if (n13 != 0) break block39;
                                                                                                        pa_12.M = System.currentTimeMillis();
                                                                                                        n20 = mouseEvent.getButton();
                                                                                                        n19 = 1;
                                                                                                    }
                                                                                                    if (n20 != n19) break block40;
                                                                                                    this.w.A = true;
                                                                                                    n18 = mouseEvent.getClickCount();
                                                                                                    if (n13 != 0) break block41;
                                                                                                    if (n18 != 1) break block42;
                                                                                                    pa_1.f(this.w, pa_1.x(this.w, mouseEvent.getPoint()));
                                                                                                    this.w.V();
                                                                                                    this.w.repaint();
                                                                                                    if (n13 == 0) break block42;
                                                                                                }
                                                                                                pa_12 = this.w;
                                                                                            }
                                                                                            pa_12.A = false;
                                                                                        }
                                                                                        n18 = -1;
                                                                                    }
                                                                                    n12 = n18;
                                                                                    this.w.requestFocusInWindow();
                                                                                    n11 = mouseEvent.getButton();
                                                                                    n10 = 1;
                                                                                    if (n13 != 0) break block43;
                                                                                    if (n11 != n10) break block44;
                                                                                    n11 = this.w.m(mouseEvent) ? 1 : 0;
                                                                                    if (n13 != 0) break block45;
                                                                                    if (n11 == 0) break block44;
                                                                                    n16 = n17 = mouseEvent.getClickCount();
                                                                                    n15 = 1;
                                                                                    if (n13 != 0) break block46;
                                                                                    if (n16 == n15) break block47;
                                                                                    n16 = n17;
                                                                                    n15 = 2;
                                                                                }
                                                                                if (n13 != 0) break block48;
                                                                                if (n16 != n15) break block49;
                                                                                xE2 = pa_1.x(this.w, mouseEvent.getPoint());
                                                                                XE xE3 = a7.t(xE2, pa_1.T(this.w));
                                                                                XE xE4 = a7.l(xE2, pa_1.T(this.w));
                                                                                pa_1.t(this.w, new ru_1(xE3));
                                                                                pa_1.e(this.w).m(xE4);
                                                                                if (pa_1.S(this.w).V()) {
                                                                                    // empty if block
                                                                                }
                                                                                if (n13 == 0) break block47;
                                                                            }
                                                                            n16 = n17;
                                                                            n15 = 3;
                                                                        }
                                                                        if (n16 == n15) {
                                                                            boolean bl;
                                                                            block37: {
                                                                                int n21;
                                                                                int n22;
                                                                                block36: {
                                                                                    int n23;
                                                                                    xE2 = pa_1.x(this.w, mouseEvent.getPoint());
                                                                                    for (n22 = xE2.r; n22 > -this.w.k().b(); --n22) {
                                                                                        n23 = pa_1.T(this.w).D(n22 - 1).G() ? 1 : 0;
                                                                                        if (n13 == 0 && n13 == 0) {
                                                                                            if (n23 == 0) break;
                                                                                            if (n13 == 0) continue;
                                                                                        }
                                                                                        break block36;
                                                                                    }
                                                                                    n23 = n21 = xE2.r;
                                                                                }
                                                                                while (n21 < pa_1.T(this.w).O()) {
                                                                                    bl = pa_1.T(this.w).D(n21).G();
                                                                                    if (n13 == 0 && n13 == 0) {
                                                                                        if (!bl) break;
                                                                                        ++n21;
                                                                                        if (n13 == 0) continue;
                                                                                    }
                                                                                    break block37;
                                                                                }
                                                                                pa_1.t(this.w, new ru_1(new XE(0, n22)));
                                                                                pa_1.e(this.w).m(new XE(this.w.N.R(), n21));
                                                                                bl = pa_1.S(this.w).V();
                                                                            }
                                                                            if (n13 == 0 && bl) {
                                                                                bl = this.w.A(false);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (n13 == 0) break block50;
                                                                }
                                                                n11 = mouseEvent.getButton();
                                                            }
                                                            n10 = 2;
                                                        }
                                                        if (n13 != 0) break block51;
                                                        if (n11 != n10) break block52;
                                                        n11 = pa_1.S(this.w).x() ? 1 : 0;
                                                        if (n13 != 0) break block53;
                                                        if (n11 == 0) break block52;
                                                        n11 = this.w.m(mouseEvent) ? 1 : 0;
                                                        if (n13 != 0) break block53;
                                                        if (n11 == 0) break block52;
                                                        try {
                                                            object2 = yt_1.i();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            object = object2.h();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            n14 = (Integer)object.T();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        n12 = n14;
                                                        if (n13 == 0) break block50;
                                                    }
                                                    n11 = mouseEvent.getButton();
                                                }
                                                n10 = 3;
                                            }
                                            if (n13 != 0) break block54;
                                            if (n11 == n10) {
                                                int n24;
                                                Object object;
                                                Object object3;
                                                try {
                                                    object3 = yt_1.i();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    object = object3.h();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    n24 = (Integer)object.H();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                n12 = n24;
                                            }
                                        }
                                        n11 = n12;
                                        n10 = US.S;
                                    }
                                    if (n13 != 0) break block55;
                                    if (n11 != n10) break block56;
                                    this.w.A(false);
                                    if (n13 == 0) break block57;
                                }
                                n11 = n12;
                                n10 = US.v;
                            }
                            if (n13 != 0) break block58;
                            if (n11 != n10) break block59;
                            this.w.r();
                            if (n13 == 0) break block57;
                        }
                        n11 = n12;
                        n10 = US.g;
                    }
                    if (n13 != 0) break block60;
                    if (n11 != n10) break block61;
                    this.w.y();
                    if (n13 == 0) break block57;
                }
                n11 = n12;
                n10 = US.b;
            }
            if (n11 == n10) {
                this.w.z(mouseEvent.getX(), mouseEvent.getY());
            }
        }
        this.w.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block5: {
            int n10;
            block4: {
                this.w.A = false;
                int n11 = _y_0.y();
                n10 = this.w.requestFocusInWindow();
                if (n11 != 0) break block4;
                this.w.repaint();
                if (pa_1.e(this.w) == null) break block5;
                n10 = mouseEvent.getButton();
            }
            if (n10 == 1) {
                this.w.K = new XE(mouseEvent.getPoint().x, mouseEvent.getPoint().y);
                this.w.N();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

