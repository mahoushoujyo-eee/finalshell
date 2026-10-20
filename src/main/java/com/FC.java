/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PK;
import com.QU;

class FC
implements Runnable {
    final QU t;

    FC(QU qU) {
        this.t = qU;
    }

    @Override
    public void run() {
        PK.a(this.t.p);
    }
}

