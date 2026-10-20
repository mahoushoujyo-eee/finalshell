/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.I.P;
import com.I.x;
import com.QX;
import com.SZ;
import com.WV;
import com._C;
import com.cz_0;
import com.ne_1;
import com.oj_0;
import com.w6_0;
import com.xd_1;
import java.io.IOException;

/*
 * Renamed from com.ie
 */
class ie_2
implements Runnable {
    final P I;
    final x j;
    final oj_0 r;
    final xd_1 P;

    ie_2(xd_1 xd_12, P p2, x x10, oj_0 oj_02) {
        this.P = xd_12;
        this.I = p2;
        this.j = x10;
        this.r = oj_02;
    }

    @Override
    public void run() {
        try {
            String string = cz_0.W(this.I.w(this.j));
            QX qX = new QX();
            _C _C2 = new _C(string);
            _C2.setEditable(false);
            qX.add(new SZ(_C2, false));
            qX.c(this.r, true, true);
            w6_0.v(_C2, GR.lD, new WV(this, qX));
        }
        catch (IOException iOException) {
            ne_1.g(this, iOException);
        }
    }
}

