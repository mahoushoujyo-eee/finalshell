/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.NL;
import org.v.NV;
import org.v._6;
import org.v.fe_0;
import org.v.h_1;
import org.v.nt_0;
import org.v.ny_0;
import org.v.x_0;

/*
 * Renamed from org.v.fx
 */
class fx_0
implements x_0 {
    final h_1 U;

    fx_0(h_1 h_12) {
        this.U = h_12;
    }

    public Boolean f(ny_0 ny_02) {
        return h_1.b(this.U, ny_02);
    }

    @c
    public Boolean h(nt_0 nt_02) {
        return (Boolean)nt_02.h(new fe_0(this));
    }

    @c
    public Boolean O(NV nV2) throws b_0 {
        return (Boolean)nV2.i(new _6(this));
    }

    @c
    public Boolean a(NL nL2) {
        return false;
    }

    @Override
    @c
    public Object V(NL nL2) throws Throwable {
        return this.a(nL2);
    }

    @Override
    @c
    public Object u(nt_0 nt_02) throws Throwable {
        return this.h(nt_02);
    }

    @Override
    @c
    public Object k(NV nV2) throws Throwable {
        return this.O(nV2);
    }

    @Override
    public Object V(ny_0 ny_02) throws Throwable {
        return this.f(ny_02);
    }
}

