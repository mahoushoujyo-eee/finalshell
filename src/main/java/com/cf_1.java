/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.II;
import com.wb_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.cF
 */
class cf_1
implements ActionListener {
    final II y;

    cf_1(II iI) {
        this.y = iI;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            II iI;
            block2: {
                block3: {
                    String string = wb_0.m();
                    iI = this.y;
                    if (string == null) break block2;
                    if (!(II.Z(iI) < 1.0f)) break block3;
                    II.k(this.y, 0.08f);
                    II.T(this.y, Math.min(II.Z(this.y), 1.0f));
                    this.y.repaint();
                    if (string != null) break block4;
                }
                iI = this.y;
            }
            II.I(iI).Y();
        }
    }
}

