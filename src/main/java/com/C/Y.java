/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.O;
import com.C.W;
import com.c4_0;

class Y
extends c4_0 {
    final O N;

    Y(O o2) {
        this.N = o2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        int[] nArray = W.B();
        boolean bl = this.N.F;
        if (nArray == null) {
            if (bl) return false;
            bl = this.N.K;
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        this.N.u = bl;
        this.N.l();
    }
}

