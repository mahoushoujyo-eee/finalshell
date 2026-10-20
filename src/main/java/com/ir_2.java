/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.ir
 */
class ir_2
implements ActionListener {
    final kz_2 b;

    ir_2(kz_2 kz_22) {
        this.b = kz_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.b.transferFocus();
        FN.M(this.b.S);
        this.b.S.r(this.b.W);
    }
}

