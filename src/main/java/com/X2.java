/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EX;
import com.hc_0;
import com.kd_1;

class X2
implements hc_0 {
    final EX y;
    final kd_1 m;

    X2(kd_1 kd_12, EX eX) {
        this.m = kd_12;
        this.y = eX;
    }

    @Override
    public void X() {
        this.y.removeChangeListener(kd_1.i(this.m));
        this.y.setValue(kd_1.c(this.m).F());
        this.y.addChangeListener(kd_1.i(this.m));
    }
}

