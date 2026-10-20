/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.b_0;
import org.v.NA;
import org.v.NH;
import org.v.NK;
import org.v.fz_0;
import org.v.h_1;
import org.v.ng_0;
import org.v.nr_0;
import org.v.q_2;

/*
 * Renamed from org.v.fi
 */
class fi_0
implements fz_0 {
    final h_1 s;

    fi_0(h_1 h_12) {
        this.s = h_12;
    }

    public q_2 o(nr_0 nr_02) throws b_0 {
        return h_1.U(this.s, nr_02);
    }

    public q_2 U(NK nK2) {
        return h_1.q(this.s, nK2);
    }

    public q_2 s(NA nA2) throws b_0 {
        return h_1.A(this.s, nA2);
    }

    public q_2 H(ng_0 ng_02) throws b_0 {
        return h_1.u(this.s, ng_02);
    }

    public q_2 x(NH nH2) {
        return h_1.A(this.s, nH2);
    }

    @Override
    public Object j(NH nH2) throws Throwable {
        return this.x(nH2);
    }

    @Override
    public Object O(ng_0 ng_02) throws Throwable {
        return this.H(ng_02);
    }

    @Override
    public Object u(NA nA2) throws Throwable {
        return this.s(nA2);
    }

    @Override
    public Object l(NK nK2) throws Throwable {
        return this.U(nK2);
    }

    @Override
    public Object n(nr_0 nr_02) throws Throwable {
        return this.o(nr_02);
    }
}

