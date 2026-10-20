/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.N9;
import org.v.RA;
import org.v.RH;
import org.v.fF;
import org.v.hj_0;
import org.v.rg_0;

class fQ
implements hj_0 {
    final fF p;
    private static final long a;

    fQ(fF fF2) {
        this.p = fF2;
    }

    @c
    public Void Z(N9 n92) {
        this.p.t.print(n92.toString() + (char)a);
        return null;
    }

    @c
    public Void J(RH rH) {
        return (Void)rH.q(fF.r(this.p));
    }

    @c
    public Void p(rg_0 rg_02) {
        return (Void)rg_02.q(fF.r(this.p));
    }

    @c
    public Void m(RA rA) {
        return (Void)rA.q(fF.r(this.p));
    }

    @Override
    @c
    public Object H(N9 n92) throws Throwable {
        return this.Z(n92);
    }

    @Override
    @c
    public Object b(RH rH) throws Throwable {
        return this.J(rH);
    }

    @Override
    @c
    public Object a(rg_0 rg_02) throws Throwable {
        return this.p(rg_02);
    }

    @Override
    @c
    public Object z(RA rA) throws Throwable {
        return this.m(rA);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6691819123633515059L;
        a = 0x25E0643EC5576A13L ^ l2;
    }
}

