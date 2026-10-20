/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.NL;
import org.v.NV;
import org.v.h_1;
import org.v.nt_0;
import org.v.ny_0;
import org.v.q_2;
import org.v.x_0;

class h0
implements x_0 {
    final h_1 v;

    h0(h_1 h_12) {
        this.v = h_12;
    }

    public q_2 g(ny_0 ny_02) throws b_0 {
        return h_1.i(this.v, ny_02);
    }

    @c
    public q_2 R(nt_0 nt_02) throws b_0 {
        return h_1.v(this.v, nt_02);
    }

    @c
    public q_2 b(NV nV2) throws b_0 {
        return h_1.O(this.v, nV2);
    }

    @c
    public q_2 N(NL nL2) throws b_0 {
        return h_1.P(this.v, nL2);
    }

    @Override
    @c
    public Object V(NL nL2) throws Throwable {
        return this.N(nL2);
    }

    @Override
    @c
    public Object u(nt_0 nt_02) throws Throwable {
        return this.R(nt_02);
    }

    @Override
    @c
    public Object k(NV nV2) throws Throwable {
        return this.b(nV2);
    }

    @Override
    public Object V(ny_0 ny_02) throws Throwable {
        return this.g(ny_02);
    }
}

