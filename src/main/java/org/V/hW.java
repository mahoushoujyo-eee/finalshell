/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.b_0;
import org.v.N3;
import org.v.NB;
import org.v.NQ;
import org.v._4;
import org.v.fO;
import org.v.h_1;
import org.v.nf_0;
import org.v.nh_0;
import org.v.ni_0;
import org.v.nq_0;
import org.v.q_2;

class hW
implements _4 {
    final fO W;

    hW(fO fO2) {
        this.W = fO2;
    }

    public q_2 Y(NQ nQ2) throws b_0 {
        return h_1.n(this.W.C, nQ2);
    }

    public q_2 h(nf_0 nf_02) throws b_0 {
        return h_1.A(this.W.C, nf_02);
    }

    public q_2 r(N3 n32) throws b_0 {
        return h_1.g(this.W.C, n32);
    }

    public q_2 e(ni_0 ni_02) throws b_0 {
        return h_1.j(this.W.C, ni_02);
    }

    public q_2 Z(NB nB2) throws b_0 {
        return h_1.i(this.W.C, nB2);
    }

    public q_2 W(nq_0 nq_02) {
        return h_1.G(this.W.C, nq_02);
    }

    public q_2 c(nh_0 nh_02) throws b_0 {
        return h_1.X(this.W.C, nh_02);
    }

    @Override
    public Object s(nh_0 nh_02) throws Throwable {
        return this.c(nh_02);
    }

    @Override
    public Object e(nq_0 nq_02) throws Throwable {
        return this.W(nq_02);
    }

    @Override
    public Object p(NB nB2) throws Throwable {
        return this.Z(nB2);
    }

    @Override
    public Object K(ni_0 ni_02) throws Throwable {
        return this.e(ni_02);
    }

    @Override
    public Object M(N3 n32) throws Throwable {
        return this.r(n32);
    }

    @Override
    public Object e(nf_0 nf_02) throws Throwable {
        return this.h(nf_02);
    }

    @Override
    public Object V(NQ nQ2) throws Throwable {
        return this.Y(nQ2);
    }
}

