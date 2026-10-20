/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.RA;
import org.v.RH;
import org.v._e_0;
import org.v.hV;
import org.v.rg_0;

class I
implements _e_0 {
    final cs_0 q;

    I(cs_0 cs_02) {
        this.q = cs_02;
    }

    public hV m(RA rA) throws b_0 {
        return this.q.t(rA);
    }

    public hV p(rg_0 rg_02) throws b_0 {
        return this.q.c(rg_02);
    }

    public hV g(RH rH) throws b_0 {
        return this.q.H(rH);
    }

    @Override
    public Object b(RH rH) throws Throwable {
        return this.g(rH);
    }

    @Override
    public Object a(rg_0 rg_02) throws Throwable {
        return this.p(rg_02);
    }

    @Override
    public Object z(RA rA) throws Throwable {
        return this.m(rA);
    }
}

