/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.kQ
 */
class kq_1
implements Runnable {
    final String X;
    final D2 J;

    kq_1(D2 d2, String string) {
        this.J = d2;
        this.X = string;
    }

    @Override
    public void run() {
        D2.k(this.J).setText(this.X);
    }
}

