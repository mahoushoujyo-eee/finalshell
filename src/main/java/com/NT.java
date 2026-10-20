/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fm_0;
import com.uE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NT
implements ActionListener {
    final fm_0 g;

    NT(fm_0 fm_02) {
        this.g = fm_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            fm_0 fm_02;
            block5: {
                block6: {
                    int n10;
                    boolean bl;
                    block2: {
                        block3: {
                            bl = uE.o();
                            n10 = this.g.m;
                            if (!bl) break block2;
                            if (n10 == 0) break block3;
                            n10 = this.g.G++;
                            if (!bl) break block2;
                            if (n10 >= 5) break block3;
                            this.g.U.repaint();
                            if (bl) break block4;
                        }
                        fm_02 = this.g;
                        if (!bl) break block5;
                        n10 = fm_02.m ? 1 : 0;
                    }
                    if (n10 != 0) break block6;
                    fm_02 = this.g;
                    if (!bl) break block5;
                    if (fm_02.G <= 0) break block6;
                    --this.g.G;
                    this.g.U.repaint();
                    if (bl) break block4;
                }
                fm_02 = this.g;
            }
            fm_02.g.Y();
        }
    }
}

