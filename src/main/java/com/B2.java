/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YP;
import com.bs_0;
import com.dc_1;

class B2
extends bs_0 {
    final dc_1 f;

    B2(dc_1 dc_12, dc_1 dc_13, int n10, int n11, YP yP) {
        this.f = dc_12;
        super(dc_13, n10, n11, yP);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void t() {
        dc_1 dc_12 = this.f;
        synchronized (dc_12) {
            dc_1.G(this.f).remove(this);
        }
    }
}

