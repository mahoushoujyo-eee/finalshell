/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qj_0;
import java.awt.Component;

/*
 * Renamed from com.Si
 */
class si_0
implements Runnable {
    final Component z;
    final qj_0 s;

    si_0(qj_0 qj_02, Component component) {
        this.s = qj_02;
        this.z = component;
    }

    @Override
    public void run() {
        this.s.W(this.z);
    }
}

