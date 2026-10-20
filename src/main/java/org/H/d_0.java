/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.F.c;
import org.h.k_0;
import org.v.R1;
import org.v.RD;
import org.v.rz_0;

/*
 * Renamed from org.H.d
 */
class d_0
implements rz_0 {
    final k_0 B;

    d_0(k_0 k_02) {
        this.B = k_02;
    }

    @c
    public Void l(RD rD) throws Throwable {
        k_0.B(this.B).F(rD);
        return null;
    }

    @c
    public Void H(R1 r1) throws Throwable {
        k_0.B(this.B).c(r1);
        return null;
    }

    @Override
    @c
    public Object V(R1 r1) throws Throwable {
        return this.H(r1);
    }

    @Override
    @c
    public Object g(RD rD) throws Throwable {
        return this.l(rD);
    }
}

