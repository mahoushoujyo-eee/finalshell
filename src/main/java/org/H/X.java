/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.M;
import org.v.NJ;
import org.v.NV;
import org.v.fo_0;

class X
implements fo_0 {
    final cs_0 r;

    X(cs_0 cs_02) {
        this.r = cs_02;
    }

    public M N(NJ nJ2) throws b_0 {
        return this.r.O(nJ2);
    }

    public M n(NV nV2) throws b_0 {
        return this.r.E(nV2);
    }

    @Override
    public Object q(NV nV2) throws Throwable {
        return this.n(nV2);
    }

    @Override
    public Object u(NJ nJ2) throws Throwable {
        return this.N(nJ2);
    }
}

