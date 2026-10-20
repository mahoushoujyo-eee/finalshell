/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NL;
import org.v.NV;
import org.v.fF;
import org.v.nt_0;
import org.v.ny_0;
import org.v.x_0;

class fB
implements x_0 {
    final fF H;
    private static final long a;

    fB(fF fF2) {
        this.H = fF2;
    }

    @c
    public Void f(nt_0 nt_02) {
        this.H.A(nt_02);
        return null;
    }

    @c
    public Void H(ny_0 ny_02) {
        this.H.t.print(ny_02.toString());
        return null;
    }

    @c
    public Void d(NV nV2) {
        this.H.E(nV2);
        return null;
    }

    @c
    public Void C(NL nL2) {
        this.H.O(nL2);
        this.H.t.println((char)a);
        return null;
    }

    @Override
    @c
    public Object V(NL nL2) throws Throwable {
        return this.C(nL2);
    }

    @Override
    @c
    public Object u(nt_0 nt_02) throws Throwable {
        return this.f(nt_02);
    }

    @Override
    @c
    public Object k(NV nV2) throws Throwable {
        return this.d(nV2);
    }

    @Override
    @c
    public Object V(ny_0 ny_02) throws Throwable {
        return this.H(ny_02);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7466647458157560702L;
        a = 0x6F0124B19E8E0345L ^ l2;
    }
}

