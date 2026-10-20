/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pv_2;
import java.io.File;
import java.io.IOException;

/*
 * Renamed from com.p8
 */
class p8_0
implements Runnable {
    final CK J;
    final File p;
    final pv_2 l;

    p8_0(pv_2 pv_22, CK cK, File file) {
        this.l = pv_22;
        this.J = cK;
        this.p = file;
    }

    @Override
    public void run() {
        try {
            this.J.I(this.p);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.l.s = false;
        }
    }
}

