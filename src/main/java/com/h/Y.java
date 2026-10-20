/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.h.K;
import com.h.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class Y
implements ActionListener {
    final JComponent S;
    final c y;

    Y(c c2, JComponent jComponent) {
        this.y = c2;
        this.S = jComponent;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            c c2;
            block5: {
                block6: {
                    int n10;
                    boolean bl;
                    block2: {
                        block3: {
                            bl = K.Z();
                            n10 = c.i(this.y);
                            if (!bl) break block2;
                            if (n10 == 0) break block3;
                            n10 = c.D(this.y);
                            if (!bl) break block2;
                            if (n10 >= 5) break block3;
                            c.w(this.y);
                            this.S.repaint();
                            if (bl) break block4;
                        }
                        c2 = this.y;
                        if (!bl) break block5;
                        n10 = c.i(c2) ? 1 : 0;
                    }
                    if (n10 != 0) break block6;
                    c2 = this.y;
                    if (!bl) break block5;
                    if (c.D(c2) <= 0) break block6;
                    c.E(this.y);
                    this.S.repaint();
                    if (bl) break block4;
                }
                c2 = this.y;
            }
            c.T(c2).Y();
        }
    }
}

