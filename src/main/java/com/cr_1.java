/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.Y_;
import com.c4_0;
import com.yp_0;

/*
 * Renamed from com.cR
 */
class cr_1
extends c4_0 {
    final Y_ Z;

    cr_1(Y_ y_) {
        this.Z = y_;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        int n10 = yp_0.f();
        boolean bl = this.Z.N;
        if (n10 == 0) {
            if (bl) return false;
            bl = this.Z.E;
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        this.Z.i = bl;
        this.Z.l();
    }
}

