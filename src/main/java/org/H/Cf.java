/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.F.c;
import org.b_0;
import org.h.cs_0;
import org.v.NA;
import org.v.fE;
import org.v.fV;
import org.v.hp_0;
import org.v.nr_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class Cf
implements fE {
    final cs_0 g;

    Cf(cs_0 cs_02) {
        this.g = cs_02;
    }

    @c
    public hp_0 R(fV fV2) throws b_0 {
        return this.g.T(fV2);
    }

    @Override
    @c
    public hp_0 v(NA nA2) throws b_0 {
        return this.g.w(nA2);
    }

    @c
    public hp_0 E(nr_0 nr_02) throws b_0 {
        return this.g.Y(nr_02);
    }

    @Override
    @c
    public Object J(nr_0 nr_02) throws Throwable {
        return this.E(nr_02);
    }

    @Override
    @c
    public Object v(NA nA2) throws Throwable {
        return this.v(nA2);
    }

    @Override
    @c
    public Object o(fV fV2) throws Throwable {
        return this.R(fV2);
    }
}

