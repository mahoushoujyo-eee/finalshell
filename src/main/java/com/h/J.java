/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.h.K;
import com.h.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

class J
extends MouseAdapter {
    final JComponent w;
    final c M;

    J(c c2, JComponent jComponent) {
        this.M = c2;
        this.w = jComponent;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block4: {
            block2: {
                int n10;
                block3: {
                    boolean bl = K.Z();
                    c.m(this.M, true);
                    boolean bl2 = bl;
                    n10 = this.M.w();
                    if (!bl2) break block2;
                    if (n10 == 0) break block3;
                    c.T(this.M).u();
                    if (bl2) break block4;
                }
                n10 = c.z(this.M, 5);
            }
            this.w.repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block4: {
            block2: {
                int n10;
                block3: {
                    boolean bl = K.V();
                    c.m(this.M, false);
                    boolean bl2 = bl;
                    n10 = this.M.w();
                    if (bl2) break block2;
                    if (n10 == 0) break block3;
                    c.T(this.M).u();
                    if (!bl2) break block4;
                }
                n10 = c.z(this.M, 0);
            }
            this.w.repaint();
        }
    }
}

