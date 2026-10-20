/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.F.c;
import org.H.T;
import org.h.k_0;
import org.v.NA;
import org.v.NH;
import org.v.NK;
import org.v.fz_0;
import org.v.ng_0;
import org.v.nr_0;

/*
 * Renamed from org.H.Cu
 */
class cu_0
implements fz_0 {
    final T g;

    cu_0(T t2) {
        this.g = t2;
    }

    @c
    public Void q(nr_0 nr_02) throws Throwable {
        k_0.B(this.g.T).S(nr_02);
        return null;
    }

    @c
    public Void f(NK nK2) throws Throwable {
        k_0.B(this.g.T).l(nK2);
        return null;
    }

    @c
    public Void g(NA nA2) throws Throwable {
        k_0.B(this.g.T).O(nA2);
        return null;
    }

    @c
    public Void v(ng_0 ng_02) throws Throwable {
        k_0.B(this.g.T).i(ng_02);
        return null;
    }

    @c
    public Void K(NH nH2) throws Throwable {
        k_0.B(this.g.T).i(nH2);
        return null;
    }

    @Override
    @c
    public Object j(NH nH2) throws Throwable {
        return this.K(nH2);
    }

    @Override
    @c
    public Object O(ng_0 ng_02) throws Throwable {
        return this.v(ng_02);
    }

    @Override
    @c
    public Object u(NA nA2) throws Throwable {
        return this.g(nA2);
    }

    @Override
    @c
    public Object l(NK nK2) throws Throwable {
        return this.f(nK2);
    }

    @Override
    @c
    public Object n(nr_0 nr_02) throws Throwable {
        return this.q(nr_02);
    }
}

