/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.cb_1;
import com.u2;
import java.io.File;
import java.util.List;

class EH
extends EY {
    final u2 r;

    EH(u2 u22) {
        this.r = u22;
    }

    @Override
    public boolean A() {
        return this.r.i;
    }

    @Override
    public boolean d(List list) {
        String[] stringArray = cb_1.C();
        boolean bl = list.size();
        if (stringArray != null) {
            if (bl > false) {
                this.r.q((File)list.get(0), true);
                return true;
            }
            bl = false;
        }
        return bl;
    }
}

