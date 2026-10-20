/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.c4_0;

/*
 * Renamed from com.c0
 */
class c0_0
extends c4_0 {
    final BX E;

    c0_0(BX bX, boolean bl) {
        this.E = bX;
        super(bl);
    }

    @Override
    public void f(boolean bl) {
        String[] stringArray = BX.B();
        if (stringArray == null) {
            if (bl) {
                this.E.O();
            }
            this.E.Z();
        }
    }
}

