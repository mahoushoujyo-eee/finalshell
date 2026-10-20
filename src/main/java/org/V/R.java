/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.N_;
import org.v._Z;
import org.v.a_1;
import org.v.fF;
import org.v.n_2;

class R
implements n_2 {
    final fF y;

    R(fF fF2) {
        this.y = fF2;
    }

    @c
    public Void I(a_1 a_12) {
        this.y.m(a_12.F);
        return null;
    }

    @c
    public Void b(_Z _Z2) {
        fF.c(this.y, (N_)_Z2.b, true);
        return null;
    }

    @Override
    @c
    public Object R(_Z _Z2) throws Throwable {
        return this.b(_Z2);
    }

    @Override
    @c
    public Object r(a_1 a_12) throws Throwable {
        return this.I(a_12);
    }
}

