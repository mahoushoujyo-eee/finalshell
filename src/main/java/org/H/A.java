/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.b_0;
import org.h.cs_0;
import org.v.R1;
import org.v.RB;
import org.v.RD;
import org.v.rz_0;

class A
implements rz_0 {
    final cs_0 Q;

    A(cs_0 cs_02) {
        this.Q = cs_02;
    }

    @c
    public RB t(RD rD) throws b_0 {
        return this.Q.O(rD);
    }

    @c
    public RB q(R1 r1) throws b_0 {
        return this.Q.h(r1);
    }

    @Override
    @c
    public Object V(R1 r1) throws Throwable {
        return this.q(r1);
    }

    @Override
    @c
    public Object g(RD rD) throws Throwable {
        return this.t(rD);
    }
}

