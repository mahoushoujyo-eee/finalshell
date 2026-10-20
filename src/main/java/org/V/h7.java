/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.File;
import org.V.f;
import org.v.w_1;

class h7
extends f {
    final File K;
    final w_1 G;
    private static final long b;

    h7(w_1 w_12, File file) {
        this.G = w_12;
        this.K = file;
    }

    @Override
    protected File r(String string) {
        return new File(this.K.getParentFile(), string.substring(string.lastIndexOf((int)b) + 1));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 482416634935006502L;
        b = 0x26DB8369F0A5509L ^ l2;
    }
}

