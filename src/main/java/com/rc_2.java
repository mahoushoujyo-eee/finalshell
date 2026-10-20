/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aO;
import com.fm_0;
import com.uE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.rc
 */
class rc_2
implements ActionListener {
    final fm_0 M;

    rc_2(fm_0 fm_02) {
        this.M = fm_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            aO aO2;
            block2: {
                block3: {
                    boolean bl = uE.o();
                    aO2 = this.M.I;
                    if (!bl) break block2;
                    if (!aO2.B()) break block3;
                    this.M.I.l();
                    this.M.P.Y();
                    if (bl) break block4;
                }
                aO2 = this.M.I;
            }
            aO2.G();
            this.M.U.repaint();
        }
    }
}

