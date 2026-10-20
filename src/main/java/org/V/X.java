/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.F.c;
import org.V.N;
import org.V.U;
import org.V.f;
import org.V.p;
import org.l.F;
import org.v.z_0;

public class X
extends U {
    private final Map M;
    private long N;
    static final boolean R = !X.class.desiredAssertionStatus();

    public X() {
        this.M = new HashMap();
    }

    public X(Map map) {
        int[] nArray = f.h();
        int[] nArray2 = nArray;
        this.M = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            N n10 = this.I((String)entry.getKey(), (byte[])entry.getValue());
            if (!R && n10 != null) {
                throw new AssertionError();
            }
            if (nArray2 == null) continue;
        }
    }

    @c
    public N I(String string, byte[] byArray) {
        return this.M.put(string, new p(this, byArray, string));
    }

    @c
    public N S(String string, String string2) {
        return this.I(string, string2.getBytes());
    }

    public N O(N n10) {
        return this.M.put(n10.o(), n10);
    }

    public Collection q() {
        return Collections.unmodifiableCollection(this.M.values());
    }

    public final void j(long l2) {
        this.N = l2;
    }

    @Override
    @c
    public final N J(String string) {
        return (N)this.M.get(string);
    }

    @Override
    @c
    public Iterable E(String string, boolean bl) {
        return F.W(this.M.values(), new z_0(this, string, bl));
    }

    static long f(X x10) {
        return x10.N;
    }
}

