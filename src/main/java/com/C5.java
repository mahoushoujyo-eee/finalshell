/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

class C5
implements Runnable {
    final boolean I;
    final D2 h;

    C5(D2 d2, boolean bl) {
        this.h = d2;
        this.I = bl;
    }

    @Override
    public void run() {
        D2.G(this.h).setIndeterminate(this.I);
    }
}

