/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.GR;
import com.on_0;

/*
 * Renamed from com.Xw
 */
class xw_0
implements on_0 {
    xw_0() {
    }

    public boolean J(DN dN) {
        String[] stringArray = GR.I();
        boolean bl = dN.o();
        if (stringArray != null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public boolean n(Object object) {
        return this.J((DN)object);
    }
}

