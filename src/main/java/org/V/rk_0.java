/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.N_;
import org.v.RG;
import org.v.h_1;
import org.v.x_0;

/*
 * Renamed from org.v.Rk
 */
class rk_0
extends N_ {
    final String[] C;
    final h_1 f;

    rk_0(h_1 h_12, I i2, String[] stringArray) {
        this.f = h_12;
        this.C = stringArray;
        super(i2);
    }

    @Override
    @c
    public Object p(x_0 x_02) {
        return null;
    }

    @Override
    public String toString() {
        return RG.N(this.C, ".");
    }
}

