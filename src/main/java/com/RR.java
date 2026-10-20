/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QD;

class RR
implements Runnable {
    final int J;
    final QD H;

    RR(QD qD, int n10) {
        this.H = qD;
        this.J = n10;
    }

    @Override
    public void run() {
        this.H.z.setValue(this.J);
    }
}

