/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.h.k_0;
import org.v.RA;
import org.v.RH;
import org.v._e_0;
import org.v.rg_0;

class S
implements _e_0 {
    final k_0 i;

    S(k_0 k_02) {
        this.i = k_02;
    }

    @c
    public Void P(RA rA) throws Throwable {
        k_0.B(this.i).C(rA);
        return null;
    }

    @c
    public Void R(rg_0 rg_02) throws Throwable {
        k_0.B(this.i).J(rg_02);
        return null;
    }

    @c
    public Void u(RH rH) throws Throwable {
        k_0.B(this.i).R(rH);
        return null;
    }

    @Override
    @c
    public Object b(RH rH) throws Throwable {
        return this.u(rH);
    }

    @Override
    @c
    public Object a(rg_0 rg_02) throws Throwable {
        return this.R(rg_02);
    }

    @Override
    @c
    public Object z(RA rA) throws Throwable {
        return this.P(rA);
    }
}

