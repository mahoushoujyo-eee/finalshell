/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.g_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

class aE
extends MouseAdapter {
    final JComponent k;
    final g_0 l;

    aE(g_0 g_02, JComponent jComponent) {
        this.l = g_02;
        this.k = jComponent;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block3: {
            aE aE2;
            block5: {
                boolean bl;
                block4: {
                    int n10;
                    block2: {
                        n10 = EY.G();
                        bl = this.l.I();
                        if (n10 == 0) break block2;
                        if (!bl) break block3;
                        bl = SwingUtilities.isLeftMouseButton(mouseEvent);
                    }
                    if (n10 == 0) break block4;
                    if (!bl) break block3;
                    aE2 = this;
                    if (n10 == 0) break block5;
                    bl = aE2.k.isEnabled();
                }
                if (!bl) break block3;
                aE2 = this;
            }
            aE2.l.exportAsDrag(this.k, mouseEvent, this.l.getSourceActions(this.k));
        }
    }
}

