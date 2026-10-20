/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.kz_2;
import com.pb_2;
import com.qe_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.rJ
 */
class rj_1
implements ActionListener {
    final pb_2 D;
    final qe_0 s;
    final kz_2 B;

    rj_1(kz_2 kz_22, pb_2 pb_22, qe_0 qe_02) {
        this.B = kz_22;
        this.D = pb_22;
        this.s = qe_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.B.transferFocus();
        FN.M(this.D);
        this.D.r(this.s);
    }
}

