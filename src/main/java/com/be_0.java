/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.c;

/*
 * Renamed from com.Be
 */
class be_0
implements Runnable {
    final DI u;

    be_0(DI dI) {
        this.u = dI;
    }

    @Override
    public void run() {
        this.u.r(new yl_2(this.u, yl_2.I));
    }
}

