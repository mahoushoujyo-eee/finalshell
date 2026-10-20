/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

class T9
implements Runnable {
    final String y;
    final D2 f;

    T9(D2 d2, String string) {
        this.f = d2;
        this.y = string;
    }

    @Override
    public void run() {
        D2.k(this.f).u(this.y, new Object[0]);
    }
}

