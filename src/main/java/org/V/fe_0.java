/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.NA;
import org.v.NH;
import org.v.NK;
import org.v.fx_0;
import org.v.fz_0;
import org.v.h_1;
import org.v.ng_0;
import org.v.nr_0;

/*
 * Renamed from org.v.fe
 */
class fe_0
implements fz_0 {
    final fx_0 t;

    fe_0(fx_0 fx_02) {
        this.t = fx_02;
    }

    public Boolean z(nr_0 nr_02) {
        return h_1.b(this.t.U, nr_02);
    }

    public Boolean g(NK nK2) {
        return h_1.b(this.t.U, nK2);
    }

    public Boolean i(NA nA2) {
        return h_1.b(this.t.U, nA2);
    }

    public Boolean d(ng_0 ng_02) {
        return h_1.b(this.t.U, ng_02);
    }

    public Boolean c(NH nH2) {
        return h_1.b(this.t.U, nH2);
    }

    @Override
    public Object j(NH nH2) throws Throwable {
        return this.c(nH2);
    }

    @Override
    public Object O(ng_0 ng_02) throws Throwable {
        return this.d(ng_02);
    }

    @Override
    public Object u(NA nA2) throws Throwable {
        return this.i(nA2);
    }

    @Override
    public Object l(NK nK2) throws Throwable {
        return this.g(nK2);
    }

    @Override
    public Object n(nr_0 nr_02) throws Throwable {
        return this.z(nr_02);
    }
}

