/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.k4_0;
import com.kz_2;
import java.util.List;

class EQ
extends EY {
    final k4_0 t;

    EQ(k4_0 k4_02) {
        this.t = k4_02;
    }

    @Override
    public boolean A() {
        return k4_0.e(this.t);
    }

    @Override
    public boolean d(List list) {
        String string = kz_2.M();
        this.t.l(list);
        String string2 = string;
        boolean bl = this.t.Z().size();
        if (string2 != null) {
            bl = bl > false;
        }
        return bl;
    }
}

