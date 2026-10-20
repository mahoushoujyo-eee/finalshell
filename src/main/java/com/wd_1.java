/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qg_0;
import java.net.Socket;

/*
 * Renamed from com.wD
 */
class wd_1
implements Runnable {
    final Socket h;
    final qg_0 T;

    wd_1(qg_0 qg_02, Socket socket) {
        this.T = qg_02;
        this.h = socket;
    }

    @Override
    public void run() {
        try {
            this.T.I(this.h);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

