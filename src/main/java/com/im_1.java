/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ii_1;

/*
 * Renamed from com.iM
 */
class im_1
implements Runnable {
    final int h;
    final ii_1 u;

    im_1(ii_1 ii_12, int n10) {
        this.u = ii_12;
        this.h = n10;
    }

    @Override
    public void run() {
        this.u.A.setValue(this.h);
    }
}

