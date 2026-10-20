/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.NA;
import org.v.NH;
import org.v.NK;
import org.v.fz_0;
import org.v.ng_0;
import org.v.nr_0;
import org.v.nt_0;

class H
implements fz_0 {
    final cs_0 Q;

    H(cs_0 cs_02) {
        this.Q = cs_02;
    }

    public nt_0 q(nr_0 nr_02) throws b_0 {
        return this.Q.Y(nr_02);
    }

    public nt_0 r(NK nK2) throws b_0 {
        return this.Q.d(nK2);
    }

    public nt_0 e(NA nA2) throws b_0 {
        return this.Q.w(nA2);
    }

    public nt_0 u(ng_0 ng_02) throws b_0 {
        return this.Q.q(ng_02);
    }

    public nt_0 k(NH nH2) throws b_0 {
        return this.Q.f(nH2);
    }

    @Override
    public Object j(NH nH2) throws Throwable {
        return this.k(nH2);
    }

    @Override
    public Object O(ng_0 ng_02) throws Throwable {
        return this.u(ng_02);
    }

    @Override
    public Object u(NA nA2) throws Throwable {
        return this.e(nA2);
    }

    @Override
    public Object l(NK nK2) throws Throwable {
        return this.r(nK2);
    }

    @Override
    public Object n(nr_0 nr_02) throws Throwable {
        return this.q(nr_02);
    }
}

