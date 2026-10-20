/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wo_1;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.SwingUtilities;

class DD
extends MouseAdapter {
    final JList Q;
    final wo_1 X;

    DD(wo_1 wo_12, JList jList) {
        this.X = wo_12;
        this.Q = jList;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block5: {
            Rectangle rectangle;
            int n10;
            int n11;
            Point point;
            block8: {
                MouseEvent mouseEvent2;
                int n12;
                block7: {
                    int n13;
                    block6: {
                        block4: {
                            n12 = wo_1.f();
                            n13 = this.X.x();
                            if (n12 != 0) break block4;
                            if (n13 <= 0) break block5;
                            n13 = mouseEvent.getClickCount();
                        }
                        if (n12 != 0) break block6;
                        if (n13 != this.X.x()) break block5;
                        mouseEvent2 = mouseEvent;
                        if (n12 != 0) break block7;
                        n13 = SwingUtilities.isLeftMouseButton(mouseEvent2) ? '\u0001' : '\u0000';
                    }
                    if (n13 == 0) break block5;
                    mouseEvent2 = mouseEvent;
                }
                point = mouseEvent2.getPoint();
                n10 = n11 = this.Q.getUI().locationToIndex(this.Q, point);
                if (n12 != 0) break block8;
                if (n10 < 0) break block5;
                n10 = n11;
            }
            if (n10 < this.Q.getModel().getSize() && (rectangle = this.Q.getCellBounds(n11, n11)).contains(point)) {
                this.X.N(this.Q, n11);
            }
        }
    }
}

