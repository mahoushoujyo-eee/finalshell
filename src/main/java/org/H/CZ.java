/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.h.k_0;
import org.v.R3;
import org.v.fY;
import org.v.rf_0;

class CZ
implements fY {
    final k_0 K;

    CZ(k_0 k_02) {
        this.K = k_02;
    }

    @c
    public Void s(rf_0 rf_02) throws Throwable {
        k_0.B(this.K).M(rf_02);
        return null;
    }

    @c
    public Void Q(R3 r3) throws Throwable {
        k_0.B(this.K).j(r3);
        return null;
    }

    @Override
    @c
    public Object S(R3 r3) throws Throwable {
        return this.Q(r3);
    }

    @Override
    @c
    public Object K(rf_0 rf_02) throws Throwable {
        return this.s(rf_02);
    }
}

