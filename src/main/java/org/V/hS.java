/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.M;
import org.v.NJ;
import org.v.NV;
import org.v.fo_0;
import org.v.h_1;
import org.v.q_2;

class hS
implements fo_0 {
    final q_2 d;
    final M t;
    final h_1 w;

    hS(h_1 h_12, q_2 q_22, M m10) {
        this.w = h_12;
        this.d = q_22;
        this.t = m10;
    }

    @c
    public Void U(NJ nJ2) throws b_0 {
        h_1.e(this.w, nJ2, this.d);
        return null;
    }

    @c
    public Void W(NV nV2) throws b_0 {
        h_1.h(this.w, this.t, h_1.X(this.w, nV2), this.d, this.w.w(nV2));
        return null;
    }

    @Override
    @c
    public Object q(NV nV2) throws Throwable {
        return this.W(nV2);
    }

    @Override
    @c
    public Object u(NJ nJ2) throws Throwable {
        return this.U(nJ2);
    }
}

