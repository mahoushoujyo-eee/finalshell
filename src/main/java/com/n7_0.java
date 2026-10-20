/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.n7
 */
class n7_0
implements Runnable {
    final int J;
    final D2 L;

    n7_0(D2 d2, int n10) {
        this.L = d2;
        this.J = n10;
    }

    @Override
    public void run() {
        D2.G(this.L).setMinimum(this.J);
    }
}

