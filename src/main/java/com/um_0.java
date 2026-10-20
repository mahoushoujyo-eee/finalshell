/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NF;
import com.cb_1;
import com.zn_0;

/*
 * Renamed from com.um
 */
class um_0
implements Runnable {
    final cb_1 o;
    final zn_0 c;

    um_0(zn_0 zn_02, cb_1 cb_12) {
        this.c = zn_02;
        this.o = cb_12;
    }

    @Override
    public void run() {
        this.c.c.w(this.o, new NF(this));
    }
}

