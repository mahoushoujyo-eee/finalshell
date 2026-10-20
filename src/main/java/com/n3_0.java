/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EX;
import com.kd_1;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.n3
 */
class n3_0
implements ChangeListener {
    final EX p;
    final kd_1 r;

    n3_0(kd_1 kd_12, EX eX) {
        this.r = kd_12;
        this.p = eX;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        kd_1.c(this.r).h(kd_1.d(this.r));
        kd_1.c(this.r).b(this.p.getValue());
        kd_1.c(this.r).u(kd_1.d(this.r));
    }
}

