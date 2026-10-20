/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.Bo
 */
class bo_0
implements Runnable {
    final int B;
    final D2 F;

    bo_0(D2 d2, int n10) {
        this.F = d2;
        this.B = n10;
    }

    @Override
    public void run() {
        D2.G(this.F).setMaximum(this.B);
    }
}

