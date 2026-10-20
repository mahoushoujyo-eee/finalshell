/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.d_2;
import org.v.fz_0;
import org.v.nt_0;
import org.v.x_0;

public final class NK
extends nt_0 {
    public final d_2 p;

    public NK(I i2, d_2 d_22) {
        super(i2);
        this.p = d_22;
    }

    @Override
    public String toString() {
        return this.p.toString();
    }

    @Override
    @c
    public Object h(fz_0 fz_02) throws Throwable {
        return fz_02.l(this);
    }

    @Override
    @c
    public Object p(x_0 x_02) throws Throwable {
        return x_02.u(this);
    }
}

