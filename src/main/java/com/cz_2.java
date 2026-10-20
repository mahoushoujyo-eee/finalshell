/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SZ;
import com.Y9;
import com.c4_0;

/*
 * Renamed from com.cz
 */
class cz_2
extends c4_0 {
    final Y9 F;

    cz_2(Y9 y9) {
        this.F = y9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        String string = SZ.L();
        boolean bl = Y9.D(this.F);
        if (string == null) {
            if (!bl) return false;
            bl = Y9.O(this.F);
        }
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        Y9.b(this.F, bl);
        Y9.i(this.F).repaint();
    }
}

