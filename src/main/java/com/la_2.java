/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import com.tb_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.la
 */
class la_2
implements ActionListener {
    final tb_0 h;

    la_2(tb_0 tb_02) {
        this.h = tb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            tb_0 tb_02;
            block2: {
                block3: {
                    int n10 = T4.O();
                    tb_02 = this.h;
                    if (n10 != 0) break block2;
                    if (tb_02.d >= this.h.f) break block3;
                    this.h.d += this.h.I;
                    this.h.Y.revalidate();
                    if (n10 == 0) break block4;
                }
                this.h.d = this.h.f;
                tb_02 = this.h;
            }
            tb_02.U.Y();
        }
    }
}

