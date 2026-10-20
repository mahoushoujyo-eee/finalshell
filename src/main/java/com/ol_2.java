/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CC;
import com.co_0;
import com.ii_2;
import com.ui_0;
import com.uv_0;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.ol
 */
public class ol_2
extends MouseAdapter {
    final CC p;

    protected ol_2(CC cC) {
        this.p = cC;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            CC cC;
            int n10;
            block7: {
                block8: {
                    int n11;
                    String string;
                    block6: {
                        block4: {
                            n10 = this.p.getUI().locationToIndex(this.p, mouseEvent.getPoint());
                            string = co_0.U();
                            n11 = n10;
                            if (string == null) break block4;
                            if (n11 == -1) break block5;
                            n11 = this.p.isEnabled() ? 1 : 0;
                        }
                        if (string == null) break block6;
                        if (n11 == 0) break block5;
                        cC = this.p;
                        if (string == null) break block7;
                        n11 = cC.h ? 1 : 0;
                    }
                    if (n11 == 0) break block8;
                    ii_2 ii_22 = this.p.A();
                    ui_0 ui_02 = ii_22.m((uv_0)this.p.A().A(n10));
                    Rectangle rectangle = this.p.B().getCellBounds(this.p, n10, n10);
                    Rectangle rectangle2 = ui_02.M().u();
                    rectangle2.x += rectangle.x;
                    rectangle2.y += rectangle.y;
                    if (rectangle2.contains(mouseEvent.getPoint())) {
                        this.p.x(n10);
                    }
                    if (string != null) break block5;
                }
                cC = this.p;
            }
            cC.x(n10);
        }
    }
}

