/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.Pk
 */
class pk_0
implements Runnable {
    final boolean e;
    final D2 t;

    pk_0(D2 d2, boolean bl) {
        this.t = d2;
        this.e = bl;
    }

    @Override
    public void run() {
        D2.G(this.t).setStringPainted(this.e);
        D2.t(this.t);
    }
}

