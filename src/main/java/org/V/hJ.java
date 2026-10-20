/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NJ;
import org.v.NV;
import org.v._4;
import org.v._w_0;
import org.v.fc_0;
import org.v.fo_0;
import org.v.h_1;
import org.v.hl_0;

class hJ
implements fo_0 {
    final _4 O = new fc_0(this);
    final _w_0 M = new hl_0(this);

    hJ() {
    }

    @c
    public Boolean d(NV nV2) {
        return (Boolean)nV2.i(this.M);
    }

    @c
    public Boolean f(NJ nJ2) {
        return h_1.v(nJ2.n);
    }

    @Override
    @c
    public Object q(NV nV2) throws Throwable {
        return this.d(nV2);
    }

    @Override
    @c
    public Object u(NJ nJ2) throws Throwable {
        return this.f(nJ2);
    }
}

