/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.F.c;
import org.H.T;
import org.h.k_0;
import org.v.nm_0;
import org.v.ns_0;
import org.v.v_0;

/*
 * Renamed from org.H.o
 */
class o_0
implements v_0 {
    final T m;

    o_0(T t2) {
        this.m = t2;
    }

    @c
    public Void t(nm_0 nm_02) throws Throwable {
        k_0.B(this.m.T).i(nm_02);
        return null;
    }

    @c
    public Void o(ns_0 ns_02) throws Throwable {
        k_0.B(this.m.T).z(ns_02);
        return null;
    }

    @Override
    @c
    public Object a(ns_0 ns_02) throws Throwable {
        return this.o(ns_02);
    }

    @Override
    @c
    public Object e(nm_0 nm_02) throws Throwable {
        return this.t(nm_02);
    }
}

