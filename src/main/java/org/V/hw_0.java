/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NS;
import org.v.NU;
import org.v.fF;
import org.v.m_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.hw
 */
class hw_0
implements m_0 {
    final fF b;

    hw_0(fF fF2) {
        this.b = fF2;
    }

    @Override
    @c
    public Void Y(NU nU2) {
        fF.b(this.b, nU2);
        return null;
    }

    @c
    public Void t(NS nS2) {
        fF.R(this.b, nS2);
        return null;
    }

    @Override
    @c
    public Object Q(NS nS2) throws Throwable {
        return this.t(nS2);
    }

    @Override
    @c
    public Object Y(NU nU2) throws Throwable {
        return this.Y(nU2);
    }
}

