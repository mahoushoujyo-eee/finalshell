/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import com.tb_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FB
implements ActionListener {
    final tb_0 e;

    FB(tb_0 tb_02) {
        this.e = tb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            tb_0 tb_02;
            block2: {
                block3: {
                    int n10 = T4.O();
                    tb_02 = this.e;
                    if (n10 != 0) break block2;
                    if (tb_02.d <= 0) break block3;
                    this.e.d -= this.e.I;
                    this.e.Y.revalidate();
                    if (n10 == 0) break block4;
                }
                this.e.d = 0;
                tb_02 = this.e;
            }
            tb_02.U.Y();
        }
    }
}

