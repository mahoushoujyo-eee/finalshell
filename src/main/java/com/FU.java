/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xb_2;

class FU
implements Runnable {
    final xb_2 m;

    FU(xb_2 xb_22) {
        this.m = xb_22;
    }

    @Override
    public void run() {
        xb_2.X(this.m).O(xb_2.z(this.m));
    }
}

