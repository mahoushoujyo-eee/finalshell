/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.NV;
import org.v.RS;
import org.v.f_1;
import org.v.hV;
import org.v.t_2;

class C8
implements f_1 {
    final cs_0 B;

    C8(cs_0 cs_02) {
        this.B = cs_02;
    }

    public t_2 f(NV nV2) throws b_0 {
        return this.B.E(nV2);
    }

    public t_2 k(RS rS) throws b_0 {
        return this.B.T(rS);
    }

    public t_2 y(hV hV2) throws b_0 {
        return this.B.R(hV2);
    }

    @Override
    public Object C(RS rS) throws Throwable {
        return this.k(rS);
    }

    @Override
    public Object G(hV hV2) throws Throwable {
        return this.y(hV2);
    }

    @Override
    public Object t(NV nV2) throws Throwable {
        return this.f(nV2);
    }
}

