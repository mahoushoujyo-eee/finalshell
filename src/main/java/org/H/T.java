/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.h.cu_0;
import org.h.k_0;
import org.h.o_0;
import org.v.NL;
import org.v.NV;
import org.v.nt_0;
import org.v.ny_0;
import org.v.x_0;

class T
implements x_0 {
    final k_0 T;

    T(k_0 k_02) {
        this.T = k_02;
    }

    @c
    public Void J(NV nV2) throws Throwable {
        nV2.i(k_0.x(this.T));
        return null;
    }

    @c
    public Void W(ny_0 ny_02) throws Throwable {
        k_0.B(this.T).V(ny_02);
        return null;
    }

    @c
    public Void W(nt_0 nt_02) throws Throwable {
        nt_02.h(new cu_0(this));
        return null;
    }

    @c
    public Void k(NL nL2) throws Throwable {
        nL2.s(new o_0(this));
        return null;
    }

    @Override
    @c
    public Object V(NL nL2) throws Throwable {
        return this.k(nL2);
    }

    @Override
    @c
    public Object u(nt_0 nt_02) throws Throwable {
        return this.W(nt_02);
    }

    @Override
    @c
    public Object k(NV nV2) throws Throwable {
        return this.J(nV2);
    }

    @Override
    @c
    public Object V(ny_0 ny_02) throws Throwable {
        return this.W(ny_02);
    }
}

