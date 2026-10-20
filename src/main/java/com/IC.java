/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;

class IC
implements Runnable {
    final kd_1 Y;

    IC(kd_1 kd_12) {
        this.Y = kd_12;
    }

    @Override
    public void run() {
        kd_1.n(this.Y, true);
    }
}

