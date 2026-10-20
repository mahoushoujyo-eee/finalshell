/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.b_0;
import org.v.N3;
import org.v.NB;
import org.v.NQ;
import org.v._4;
import org.v.h_1;
import org.v.nf_0;
import org.v.nh_0;
import org.v.ni_0;
import org.v.nq_0;
import org.v.q_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class _3
implements _4 {
    final h_1 s;

    _3(h_1 h_12) {
        this.s = h_12;
    }

    public q_2 w(NQ nQ2) throws b_0 {
        return h_1.A(this.s, nQ2);
    }

    @Override
    public q_2 e(nf_0 nf_02) throws b_0 {
        return h_1.J(this.s, nf_02);
    }

    public q_2 L(N3 n32) throws b_0 {
        return h_1.U(this.s, n32);
    }

    public q_2 u(ni_0 ni_02) throws b_0 {
        return h_1.O(this.s, ni_02);
    }

    public q_2 r(NB nB2) throws b_0 {
        return h_1.p(this.s, nB2);
    }

    public q_2 R(nq_0 nq_02) {
        return h_1.i(this.s, nq_02);
    }

    public q_2 g(nh_0 nh_02) throws b_0 {
        return h_1.E(this.s, nh_02);
    }

    @Override
    public Object s(nh_0 nh_02) throws Throwable {
        return this.g(nh_02);
    }

    @Override
    public Object e(nq_0 nq_02) throws Throwable {
        return this.R(nq_02);
    }

    @Override
    public Object p(NB nB2) throws Throwable {
        return this.r(nB2);
    }

    @Override
    public Object K(ni_0 ni_02) throws Throwable {
        return this.u(ni_02);
    }

    @Override
    public Object M(N3 n32) throws Throwable {
        return this.L(n32);
    }

    @Override
    public Object e(nf_0 nf_02) throws Throwable {
        return this.e(nf_02);
    }

    @Override
    public Object V(NQ nQ2) throws Throwable {
        return this.w(nQ2);
    }
}

