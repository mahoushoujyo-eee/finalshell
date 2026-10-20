/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.h.K;
import com.h.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a
implements ActionListener {
    final c f;

    a(c c2) {
        this.f = c2;
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
                            bl = K.V();
                            n10 = c.P(this.f);
                            if (bl) break block2;
                            if (n10 == 0) break block3;
                            n10 = c.C(this.f);
                            if (bl) break block2;
                            if (n10 >= c.S.size() - 1) break block3;
                            c.N(this.f);
                            c.T(this.f).repaint();
                            if (!bl) break block4;
                        }
                        c2 = this.f;
                        if (bl) break block5;
                        n10 = c.P(c2) ? 1 : 0;
                    }
                    if (n10 != 0) break block6;
                    c2 = this.f;
                    if (bl) break block5;
                    if (c.C(c2) <= 0) break block6;
                    c.B(this.f);
                    c.T(this.f).repaint();
                    if (!bl) break block4;
                }
                c2 = this.f;
            }
            c.t(c2).Y();
        }
    }
}

