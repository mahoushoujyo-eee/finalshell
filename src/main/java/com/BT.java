/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NF;
import com.ux_0;

class BT
implements Runnable {
    final Throwable S;
    final NF J;

    BT(NF nF2, Throwable throwable) {
        this.J = nF2;
        this.S = throwable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Object object = this.J.C.c.K;
        synchronized (object) {
            this.J.C.o.Y(ux_0.failed);
            this.J.C.o.o(this.S);
            this.J.C.c.nodeChanged(this.J.C.o);
        }
        this.J.C.c.r(this.J.C.o, this.S);
    }
}

