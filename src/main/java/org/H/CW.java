/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.N6;
import org.v.NS;
import org.v.NU;
import org.v.m_0;

class CW
implements m_0 {
    final cs_0 N;

    CW(cs_0 cs_02) {
        this.N = cs_02;
    }

    public N6 t(NU nU2) throws b_0 {
        return this.N.J(nU2);
    }

    public N6 w(NS nS2) throws b_0 {
        return this.N.O(nS2);
    }

    @Override
    public Object Q(NS nS2) throws Throwable {
        return this.w(nS2);
    }

    @Override
    public Object Y(NU nU2) throws Throwable {
        return this.t(nU2);
    }
}

