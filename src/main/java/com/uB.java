/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OG;
import com.ky_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class uB
extends MouseAdapter {
    final OG Y;

    uB(OG oG) {
        this.Y = oG;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            block5: {
                boolean bl;
                ky_2[] ky_2Array;
                block4: {
                    block2: {
                        ky_2Array = OG.P();
                        bl = OG.f(this.Y);
                        if (ky_2Array == null) break block2;
                        if (!bl) break block3;
                        bl = this.Y.isEnabled();
                    }
                    if (ky_2Array == null) break block4;
                    if (!bl) break block3;
                    bl = SwingUtilities.isLeftMouseButton(mouseEvent);
                }
                if (ky_2Array == null) break block5;
                if (!bl) break block3;
                OG.s(this.Y, true);
                bl = this.Y.requestFocusInWindow();
            }
            this.Y.I();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            block4: {
                boolean bl;
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = OG.P();
                    bl = OG.r(this.Y);
                    if (ky_2Array == null) break block2;
                    if (!bl) break block3;
                    bl = SwingUtilities.isLeftMouseButton(mouseEvent);
                }
                if (ky_2Array == null) break block4;
                if (!bl) break block3;
                bl = OG.s(this.Y, false);
            }
            this.Y.repaint();
        }
    }
}

