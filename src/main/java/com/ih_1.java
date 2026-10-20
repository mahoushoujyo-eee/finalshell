/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ih_0;
import java.io.File;

/*
 * Renamed from com.iH
 */
class ih_1
implements Runnable {
    final File L;
    final ih_0 V;
    private static final long a;

    ih_1(ih_0 ih_02, File file) {
        this.V = ih_02;
        this.L = file;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
            this.L.delete();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6208050666475947065L;
        a = 0x56276D3082ED0F81L ^ l2;
    }
}

