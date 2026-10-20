/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QQ;
import com.QS;
import com.es_1;
import com.ky_2;

/*
 * Renamed from com.eY
 */
class ey_1
extends es_1 {
    final QS q;

    ey_1(QS qS) {
        this.q = qS;
    }

    @Override
    public void Y() {
        this.q.d = false;
    }

    @Override
    public void h() {
        QS.I(this.q);
    }

    @Override
    public void T() {
        block4: {
            QS qS;
            block2: {
                block3: {
                    ky_2[] ky_2Array = QQ.N();
                    QS.K(this.q);
                    ky_2[] ky_2Array2 = ky_2Array;
                    qS = this.q;
                    if (ky_2Array2 != null) break block2;
                    if (!qS.d) break block3;
                    this.q.u();
                    if (ky_2Array2 == null) break block4;
                }
                qS = this.q;
            }
            qS.z();
        }
    }
}

