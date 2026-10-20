/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.kq
 */
class kq_2
implements Runnable {
    final int V;
    final D2 u;

    kq_2(D2 d2, int n10) {
        this.u = d2;
        this.V = n10;
    }

    @Override
    public void run() {
        D2.G(this.u).setValue(this.V);
    }
}

