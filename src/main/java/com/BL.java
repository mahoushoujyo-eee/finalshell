/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.wq_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

class BL
extends MouseAdapter {
    final JComponent j;
    final wq_1 l;

    BL(wq_1 wq_12, JComponent jComponent) {
        this.l = wq_12;
        this.j = jComponent;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            BL bL;
            block5: {
                boolean bl;
                block4: {
                    int n10;
                    block2: {
                        n10 = EY.G();
                        bl = this.l.l();
                        if (n10 == 0) break block2;
                        if (!bl) break block3;
                        bl = SwingUtilities.isLeftMouseButton(mouseEvent);
                    }
                    if (n10 == 0) break block4;
                    if (!bl) break block3;
                    bL = this;
                    if (n10 == 0) break block5;
                    bl = bL.j.isEnabled();
                }
                if (!bl) break block3;
                bL = this;
            }
            bL.l.exportAsDrag(this.j, mouseEvent, this.l.getSourceActions(this.j));
        }
    }
}

