/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.rq_0;
import com.rv_2;
import com.yc_0;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.nN
 */
class nn_1
extends MouseAdapter {
    final yc_0 t;

    nn_1(yc_0 yc_02) {
        this.t = yc_02;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.F(mouseEvent);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.F(mouseEvent);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.k();
    }

    private void F(MouseEvent mouseEvent) {
        block7: {
            nn_1 nn_12;
            block2: {
                block3: {
                    nn_1 nn_13;
                    String[] stringArray;
                    int n10;
                    block6: {
                        int n11;
                        block5: {
                            Rectangle rectangle;
                            block4: {
                                n10 = yc_0.q(this.t).locationToIndex(mouseEvent.getPoint());
                                stringArray = CI.c();
                                Rectangle rectangle2 = yc_0.V(this.t).getCellBounds(n10, n10);
                                nn_12 = this;
                                if (stringArray != null) break block2;
                                if (!yc_0.k(nn_12.t).isEnabled()) break block3;
                                rectangle = rectangle2;
                                if (stringArray != null) break block4;
                                if (rectangle == null) break block3;
                                rectangle = rectangle2;
                            }
                            n11 = rectangle.contains(mouseEvent.getPoint());
                            if (stringArray != null) break block5;
                            if (n11 == 0) break block3;
                            nn_13 = this;
                            if (stringArray != null) break block6;
                            n11 = nn_13.t.h;
                        }
                        if (n11 == n10) break block7;
                        nn_13 = this;
                    }
                    nn_13.r(this.t.h, n10);
                    if (stringArray == null) break block7;
                }
                nn_12 = this;
            }
            nn_12.k();
        }
    }

    private void k() {
        block3: {
            nn_1 nn_12;
            block2: {
                String[] stringArray = CI.c();
                nn_12 = this;
                if (stringArray != null) break block2;
                if (nn_12.t.h == -1) break block3;
                nn_12 = this;
            }
            nn_12.r(this.t.h, -1);
        }
    }

    private void r(int n10, int n11) {
        block10: {
            rq_0 rq_02;
            block9: {
                Object object;
                yc_0 yc_02;
                String[] stringArray;
                block7: {
                    block8: {
                        this.t.h = n11;
                        stringArray = CI.c();
                        yc_02 = this.t;
                        if (stringArray != null) break block7;
                        if (!yc_02.O) break block8;
                        yc_02 = this.t;
                        if (stringArray != null) break block7;
                        if (!yc_02.H) break block8;
                        object = yc_0.C(this.t).getCellBounds(n10, n10);
                        yc_02 = this.t;
                        if (stringArray != null) break block7;
                        Rectangle rectangle = yc_0.Q(yc_02).getCellBounds(n11, n11);
                        Rectangle rectangle2 = rv_2.B((Rectangle)object, rectangle);
                        if (rectangle2 != null) {
                            yc_0.T(this.t).repaint(rectangle2);
                        }
                    }
                    yc_02 = this.t;
                }
                object = yc_02.A();
                rq_02 = object;
                if (stringArray != null) break block9;
                if (rq_02 == null) break block10;
                rq_02 = object;
            }
            rq_02.M(yc_0.l(this.t), n10, 0, n11, 0);
        }
    }
}

