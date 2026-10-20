/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.oj_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class H7
extends MouseAdapter {
    final oj_0 P;

    H7(oj_0 oj_02) {
        this.P = oj_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            H7 h72;
            block2: {
                boolean bl = oj_0.V();
                h72 = this;
                if (bl) break block2;
                if (!h72.P.i) break block3;
                h72 = this;
            }
            h72.k(mouseEvent);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            H7 h72;
            block4: {
                boolean bl;
                block2: {
                    boolean bl2 = oj_0.g();
                    bl = this.P.i;
                    if (!bl2) break block2;
                    if (bl) break block3;
                    h72 = this;
                    if (!bl2) break block4;
                    bl = FN.N(h72.P).contains(mouseEvent.getPoint());
                }
                if (!bl) break block3;
                h72 = this;
            }
            h72.k(mouseEvent);
        }
    }

    private void k(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = oj_0.V();
                bl = this.P.isEnabled();
                if (bl2) break block4;
                if (!bl) break block5;
                bl = SwingUtilities.isLeftMouseButton(mouseEvent);
            }
            if (bl) {
                this.P.A();
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.P.f(true);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.P.f(false);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.P.f(false);
    }
}

