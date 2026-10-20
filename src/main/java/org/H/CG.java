/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.H.C2;
import org.h.k_0;
import org.v.N6;
import org.v.NT;
import org.v.RF;
import org.v._O;
import org.v._j_0;
import org.v._p_0;
import org.v._z_0;
import org.v.hL;

class CG
implements hL {
    final k_0 e;

    CG(k_0 k_02) {
        this.e = k_02;
    }

    @c
    public Void D(N6 n62) throws Throwable {
        n62.F(new C2(this));
        return null;
    }

    @c
    public Void k(_z_0 _z_02) throws Throwable {
        k_0.B(this.e).J(_z_02);
        return null;
    }

    @c
    public Void d(_O _O2) throws Throwable {
        k_0.B(this.e).y(_O2);
        return null;
    }

    @c
    public Void e(_j_0 _j_02) throws Throwable {
        k_0.B(this.e).D(_j_02);
        return null;
    }

    @c
    public Void D(_p_0 _p_02) throws Throwable {
        k_0.B(this.e).E(_p_02);
        return null;
    }

    @c
    public Void i(NT nT2) throws Throwable {
        k_0.B(this.e).Q(nT2);
        return null;
    }

    @c
    public Void o(RF rF) throws Throwable {
        k_0.B(this.e).m(rF);
        return null;
    }

    @Override
    @c
    public Object t(_z_0 _z_02) throws Throwable {
        return this.k(_z_02);
    }

    @Override
    @c
    public Object C(N6 n62) throws Throwable {
        return this.D(n62);
    }

    @Override
    @c
    public Object L(_p_0 _p_02) throws Throwable {
        return this.D(_p_02);
    }

    @Override
    @c
    public Object K(RF rF) throws Throwable {
        return this.o(rF);
    }

    @Override
    @c
    public Object F(NT nT2) throws Throwable {
        return this.i(nT2);
    }

    @Override
    @c
    public Object F(_j_0 _j_02) throws Throwable {
        return this.e(_j_02);
    }

    @Override
    @c
    public Object I(_O _O2) throws Throwable {
        return this.d(_O2);
    }
}

