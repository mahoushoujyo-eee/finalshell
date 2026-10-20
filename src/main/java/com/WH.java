/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QQ;
import com.QS;
import com.ky_2;
import com.nc_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WH
implements ActionListener {
    final nc_1 K;
    final QS J;

    WH(QS qS, nc_1 nc_12) {
        this.J = qS;
        this.K = nc_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            QS qS;
            block2: {
                ky_2[] ky_2Array = QQ.N();
                this.J.Z(this.K);
                ky_2[] ky_2Array2 = ky_2Array;
                qS = this.J;
                if (ky_2Array2 != null) break block2;
                if (!qS.O) break block3;
                qS = this.J;
            }
            qS.a();
        }
    }
}

