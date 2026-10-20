/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NR;
import org.v.N_;
import org.v._4;
import org.v.u_1;

public final class N3
extends NR {
    public final N_ o;
    public final u_1 P;
    private static final long a;

    public N3(I i2, N_ n_3, u_1 u_12) {
        super(i2);
        this.o = n_3;
        this.P = u_12;
    }

    @Override
    public String toString() {
        return this.o.toString() + (char)a + this.P.h();
    }

    @Override
    @c
    public Object W(_4 _42) throws Throwable {
        return _42.M(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4778177404587537342L;
        a = 0x9A2F46729A3CF390L ^ l2;
    }
}

