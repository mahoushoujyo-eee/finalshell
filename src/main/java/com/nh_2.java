/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.c;
import com.dm_2;

/*
 * Renamed from com.nh
 */
class nh_2
implements Runnable {
    final DI t;

    nh_2(DI dI) {
        this.t = dI;
    }

    @Override
    public void run() {
        boolean bl = dm_2.F();
        while (this.t.t()) {
            try {
                this.t.U();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (bl) break;
            }
            try {
                Thread.sleep(dd_1.S);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (bl) continue;
            }
        }
    }
}

