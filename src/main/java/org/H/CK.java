/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.h.k_0;
import org.v.NV;
import org.v.RS;
import org.v.f_1;
import org.v.hV;

class CK
implements f_1 {
    final k_0 S;

    CK(k_0 k_02) {
        this.S = k_02;
    }

    @c
    public Void A(NV nV2) throws Throwable {
        nV2.i(k_0.x(this.S));
        return null;
    }

    @c
    public Void n(RS rS) throws Throwable {
        k_0.B(this.S).y(rS);
        return null;
    }

    @c
    public Void a(hV hV2) throws Throwable {
        k_0.B(this.S).i(hV2);
        return null;
    }

    @Override
    @c
    public Object C(RS rS) throws Throwable {
        return this.n(rS);
    }

    @Override
    @c
    public Object G(hV hV2) throws Throwable {
        return this.a(hV2);
    }

    @Override
    @c
    public Object t(NV nV2) throws Throwable {
        return this.A(nV2);
    }
}

