/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;

/*
 * Renamed from com.wR
 */
class wr_1
implements Runnable {
    final DI A;

    wr_1(DI dI) {
        this.A = dI;
    }

    @Override
    public void run() {
        this.A.S();
    }
}

