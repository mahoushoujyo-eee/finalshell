/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qj_0;
import java.awt.Component;

/*
 * Renamed from com.Cu
 */
class cu_0
implements Runnable {
    final Component v;
    final qj_0 g;

    cu_0(qj_0 qj_02, Component component) {
        this.g = qj_02;
        this.v = component;
    }

    @Override
    public void run() {
        this.g.W(this.v);
    }
}

