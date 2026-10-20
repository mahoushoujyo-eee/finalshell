/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.b_0;
import org.h.cs_0;
import org.v.R3;
import org.v.RQ;
import org.v.fY;
import org.v.rf_0;

/*
 * Renamed from org.H.Cg
 */
class cg_0
implements fY {
    final cs_0 v;

    cg_0(cs_0 cs_02) {
        this.v = cs_02;
    }

    public RQ m(rf_0 rf_02) throws b_0 {
        return this.v.d(rf_02);
    }

    public RQ y(R3 r3) throws b_0 {
        return this.v.G(r3);
    }

    @Override
    public Object S(R3 r3) throws Throwable {
        return this.y(r3);
    }

    @Override
    public Object K(rf_0 rf_02) throws Throwable {
        return this.m(rf_02);
    }
}

