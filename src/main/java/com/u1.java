/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PQ;
import com.ax_0;
import com.xs_0;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class u1
extends MouseAdapter {
    final xs_0 t;

    u1(xs_0 xs_02) {
        this.t = xs_02;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.q(mouseEvent);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.q(mouseEvent);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.Q();
    }

    private void q(MouseEvent mouseEvent) {
        block6: {
            block3: {
                u1 u12;
                Point point;
                boolean bl;
                block5: {
                    int n10;
                    block4: {
                        int n11;
                        block2: {
                            Point point2 = mouseEvent.getPoint();
                            bl = PQ.G();
                            point = new Point(xs_0.M(this.t).columnAtPoint(point2), xs_0.F(this.t).rowAtPoint(point2));
                            n10 = point.x;
                            n11 = -1;
                            if (!bl) break block2;
                            if (n10 == n11) break block3;
                            n10 = point.y;
                            if (!bl) break block4;
                            n11 = -1;
                        }
                        if (n10 == n11) break block3;
                        u12 = this;
                        if (!bl) break block5;
                        n10 = ax_0.Z(u12.t.V, new Object[]{point}) ? 1 : 0;
                    }
                    if (n10 != 0) break block6;
                    u12 = this;
                }
                u12.R(this.t.V, point);
                if (bl) break block6;
            }
            this.Q();
        }
    }

    private void Q() {
        block3: {
            u1 u12;
            block2: {
                boolean bl = PQ.G();
                u12 = this;
                if (!bl) break block2;
                if (u12.t.V == null) break block3;
                u12 = this;
            }
            u12.R(this.t.V, null);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void R(Point var1_1, Point var2_2) {
        block8: {
            this.t.V = var2_2;
            var3_3 = PQ.G();
            var4_4 = this.t.Q();
            if (var4_4 == null) break block8;
            v0 = var1_1;
            if (!var3_3) ** GOTO lbl9
            if (v0 != null) {
                v0 = var1_1;
lbl9:
                // 2 sources

                v1 = v0.y;
            } else {
                v1 = -1;
            }
            var5_5 = v1;
            v2 = var1_1;
            if (!var3_3) ** GOTO lbl17
            if (v2 != null) {
                v2 = var1_1;
lbl17:
                // 2 sources

                v3 = v2.x;
            } else {
                v3 = -1;
            }
            var6_6 = v3;
            v4 = var2_2;
            if (!var3_3) ** GOTO lbl25
            if (v4 != null) {
                v4 = var2_2;
lbl25:
                // 2 sources

                v5 = v4.y;
            } else {
                v5 = -1;
            }
            var7_7 = v5;
            v6 = var2_2;
            if (!var3_3) ** GOTO lbl33
            if (v6 != null) {
                v6 = var2_2;
lbl33:
                // 2 sources

                v7 = v6.x;
            } else {
                v7 = -1;
            }
            var8_8 = v7;
            var4_4.M(xs_0.w(this.t), var5_5, var6_6, var7_7, var8_8);
        }
    }
}

