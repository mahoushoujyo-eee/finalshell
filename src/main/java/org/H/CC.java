/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.b_0;
import org.h.cs_0;
import org.v.N9;
import org.v.RA;
import org.v.RH;
import org.v.fu_0;
import org.v.hj_0;
import org.v.rg_0;

class CC
implements hj_0 {
    final cs_0 O;

    CC(cs_0 cs_02) {
        this.O = cs_02;
    }

    @c
    public fu_0 Y(RA rA) throws b_0 {
        return this.O.t(rA);
    }

    @c
    public fu_0 m(rg_0 rg_02) throws b_0 {
        return this.O.c(rg_02);
    }

    @c
    public fu_0 M(RH rH) throws b_0 {
        return this.O.H(rH);
    }

    @c
    public fu_0 x(N9 n92) throws b_0 {
        return this.O.M(n92);
    }

    @Override
    @c
    public Object H(N9 n92) throws Throwable {
        return this.x(n92);
    }

    @Override
    @c
    public Object b(RH rH) throws Throwable {
        return this.M(rH);
    }

    @Override
    @c
    public Object a(rg_0 rg_02) throws Throwable {
        return this.m(rg_02);
    }

    @Override
    @c
    public Object z(RA rA) throws Throwable {
        return this.Y(rA);
    }
}

