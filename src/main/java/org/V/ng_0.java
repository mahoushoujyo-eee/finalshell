/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.fz_0;
import org.v.nt_0;
import org.v.x_0;

/*
 * Renamed from org.v.Ng
 */
public final class ng_0
extends nt_0 {
    public final NV t;
    public final String I;

    public ng_0(I i2, NV nV2, String string) {
        super(i2);
        this.t = nV2;
        this.I = string;
    }

    @Override
    public String toString() {
        return this.I;
    }

    @Override
    @c
    public Object p(x_0 x_02) throws Throwable {
        return x_02.u(this);
    }

    @Override
    @c
    public Object h(fz_0 fz_02) throws Throwable {
        return fz_02.O(this);
    }
}

