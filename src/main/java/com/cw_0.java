/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.if_1;
import com.o2_0;
import com.us_0;
import com.yz_0;
import com.zn_0;
import java.util.List;

/*
 * Renamed from com.Cw
 */
class cw_0
implements Runnable {
    final zn_0 Z;
    final List A;
    final cb_1 r;
    final int G;
    final us_0 H;
    final yz_0 i;

    cw_0(yz_0 yz_02, zn_0 zn_02, List list, cb_1 cb_12, int n10, us_0 us_02) {
        this.i = yz_02;
        this.Z = zn_02;
        this.A = list;
        this.r = cb_12;
        this.G = n10;
        this.H = us_02;
    }

    @Override
    public void run() {
        this.Z.u(this.A, this.r, this.G);
        this.H.R(this.A);
        o2_0.P(this.H, new if_1(this));
    }
}

