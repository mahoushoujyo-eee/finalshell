/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QQ;
import com.ky_2;
import com.nc_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.lK
 */
class lk_1
implements ActionListener {
    final nc_1 T;
    final QQ M;

    lk_1(QQ qQ, nc_1 nc_12) {
        this.M = qQ;
        this.T = nc_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            QQ qQ;
            block2: {
                ky_2[] ky_2Array = QQ.N();
                this.M.Y(this.T);
                ky_2[] ky_2Array2 = ky_2Array;
                qQ = this.M;
                if (ky_2Array2 != null) break block2;
                if (!qQ.Q) break block3;
                qQ = this.M;
            }
            qQ.a();
        }
    }
}

