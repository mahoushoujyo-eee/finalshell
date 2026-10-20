/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c4_0;
import com.yp_0;

/*
 * Renamed from com.cP
 */
class cp_1
extends c4_0 {
    final yp_0 g;

    cp_1(yp_0 yp_02) {
        this.g = yp_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        int n10 = yp_0.T();
        boolean bl = this.g.J;
        if (n10 != 0) {
            if (bl) return false;
            bl = this.g.s;
        }
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        this.g.G = bl;
        this.g.l();
    }
}

