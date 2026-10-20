/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.NL;
import org.v.nm_0;
import org.v.ns_0;
import org.v.v_0;

class CD
implements v_0 {
    final cs_0 e;

    CD(cs_0 cs_02) {
        this.e = cs_02;
    }

    public NL W(nm_0 nm_02) throws b_0 {
        return this.e.J(nm_02);
    }

    public NL s(ns_0 ns_02) throws b_0 {
        return this.e.c(ns_02);
    }

    @Override
    public Object a(ns_0 ns_02) throws Throwable {
        return this.s(ns_02);
    }

    @Override
    public Object e(nm_0 nm_02) throws Throwable {
        return this.W(nm_02);
    }
}

