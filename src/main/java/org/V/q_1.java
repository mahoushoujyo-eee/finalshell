/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NS;
import org.v.NU;
import org.v.RG;
import org.v.h_1;
import org.v.m_0;

/*
 * Renamed from org.v.Q
 */
class q_1
implements m_0 {
    final h_1 A;

    q_1(h_1 h_12) {
        this.A = h_12;
    }

    @c
    public Boolean Q(NU nU2) {
        return true;
    }

    @c
    public Boolean k(NS nS2) {
        String[] stringArray = RG.C();
        boolean bl = nS2.N();
        if (stringArray != null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    @c
    public Object Q(NS nS2) throws Throwable {
        return this.k(nS2);
    }

    @Override
    @c
    public Object Y(NU nU2) throws Throwable {
        return this.Q(nU2);
    }
}

