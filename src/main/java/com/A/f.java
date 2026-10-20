/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.E;
import com.a.y_0;
import com.c4_0;

class f
extends c4_0 {
    final E J;

    f(E e2, boolean bl) {
        this.J = e2;
        super(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        int[] nArray = y_0.M();
        boolean bl = this.J.isShowing();
        if (nArray != null) {
            if (!bl) return false;
            bl = this.J.U;
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        block5: {
            boolean bl2;
            block6: {
                int[] nArray;
                block4: {
                    nArray = y_0.M();
                    bl2 = this.J.U;
                    if (nArray == null) break block4;
                    if (!bl2) break block5;
                    bl2 = this.J.isShowing();
                }
                if (nArray == null) break block6;
                if (!bl2) break block5;
                bl2 = bl;
            }
            if (!bl2) {
                this.J.dispose();
            }
        }
    }
}

