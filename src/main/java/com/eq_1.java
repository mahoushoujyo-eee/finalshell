/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QQ;
import com.es_1;
import com.ky_2;

/*
 * Renamed from com.eQ
 */
class eq_1
extends es_1 {
    final QQ H;

    eq_1(QQ qQ) {
        this.H = qQ;
    }

    @Override
    public void Y() {
        this.H.q = false;
    }

    @Override
    public void h() {
        QQ.g(this.H);
    }

    @Override
    public void T() {
        block4: {
            QQ qQ;
            block2: {
                block3: {
                    ky_2[] ky_2Array = QQ.N();
                    qQ = this.H;
                    if (ky_2Array != null) break block2;
                    if (!qQ.q) break block3;
                    this.H.M();
                    if (ky_2Array == null) break block4;
                }
                qQ = this.H;
            }
            qQ.N();
        }
    }
}

