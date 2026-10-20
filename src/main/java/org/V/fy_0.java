/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.R1;
import org.v.RD;
import org.v.h_1;
import org.v.rz_0;

/*
 * Renamed from org.v.fy
 */
class fy_0
implements rz_0 {
    final h_1 a;

    fy_0(h_1 h_12) {
        this.a = h_12;
    }

    @c
    public Void t(RD rD) throws b_0 {
        h_1.k(this.a, rD);
        return null;
    }

    @c
    public Void K(R1 r1) throws b_0 {
        h_1.f(this.a, r1);
        return null;
    }

    @Override
    @c
    public Object V(R1 r1) throws Throwable {
        return this.K(r1);
    }

    @Override
    @c
    public Object g(RD rD) throws Throwable {
        return this.t(rD);
    }
}

