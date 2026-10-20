/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.C;
import com.a.y_0;
import com.c4_0;

class M
extends c4_0 {
    final C Y;

    M(C c2, boolean bl) {
        this.Y = c2;
        super(bl);
    }

    @Override
    public boolean z() {
        return this.Y.N;
    }

    @Override
    public void f(boolean bl) {
        block5: {
            boolean bl2;
            block6: {
                int[] nArray;
                block4: {
                    nArray = y_0.M();
                    bl2 = this.Y.N;
                    if (nArray == null) break block4;
                    if (!bl2) break block5;
                    bl2 = this.Y.isShowing();
                }
                if (nArray == null) break block6;
                if (!bl2) break block5;
                bl2 = bl;
            }
            if (!bl2) {
                this.Y.setVisible(false);
            }
        }
    }
}

