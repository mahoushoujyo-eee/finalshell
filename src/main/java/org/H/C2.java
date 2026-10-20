/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.H.CG;
import org.h.k_0;
import org.v.NS;
import org.v.NU;
import org.v.m_0;

class C2
implements m_0 {
    final CG H;

    C2(CG cG) {
        this.H = cG;
    }

    @c
    public Void r(NU nU2) throws Throwable {
        k_0.B(this.H.e).x(nU2);
        return null;
    }

    @c
    public Void b(NS nS2) throws Throwable {
        k_0.B(this.H.e).f(nS2);
        return null;
    }

    @Override
    @c
    public Object Q(NS nS2) throws Throwable {
        return this.b(nS2);
    }

    @Override
    @c
    public Object Y(NU nU2) throws Throwable {
        return this.r(nU2);
    }
}

