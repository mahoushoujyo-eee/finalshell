/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pv_2;

/*
 * Renamed from com.xU
 */
class xu_1
implements Runnable {
    final CK q;
    final pv_2 i;

    xu_1(pv_2 pv_22, CK cK) {
        this.i = pv_22;
        this.q = cK;
    }

    @Override
    public void run() {
        this.q.K();
    }
}

