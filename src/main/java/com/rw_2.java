/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;

/*
 * Renamed from com.rw
 */
class rw_2
implements Runnable {
    final String e;
    final D2 w;

    rw_2(D2 d2, String string) {
        this.w = d2;
        this.e = string;
    }

    @Override
    public void run() {
        D2.G(this.w).setString(this.e);
    }
}

