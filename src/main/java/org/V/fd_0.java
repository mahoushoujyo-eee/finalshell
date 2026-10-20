/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.N6;
import org.v.NS;
import org.v.NU;
import org.v.h_1;
import org.v.hu_0;
import org.v.m_0;

/*
 * Renamed from org.v.fd
 */
class fd_0
implements m_0 {
    final N6 w;
    final h_1 s;

    fd_0(h_1 h_12, N6 n62) {
        this.s = h_12;
        this.w = n62;
    }

    public hu_0 w(NS nS2) {
        return this.s.Y((NS)this.w);
    }

    public hu_0 X(NU nU2) {
        return this.s.Z((NU)this.w);
    }

    @Override
    public Object Q(NS nS2) throws Throwable {
        return this.w(nS2);
    }

    @Override
    public Object Y(NU nU2) throws Throwable {
        return this.X(nU2);
    }
}

