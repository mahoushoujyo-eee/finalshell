/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NR;
import org.v.NV;
import org.v.N_;
import org.v._4;

/*
 * Renamed from org.v.Ni
 */
public final class ni_0
extends NR {
    public final N_ S;
    public final String J;
    @c
    NV B;
    private static final long a;

    public ni_0(I i2, N_ n_3, String string) {
        super(i2);
        this.S = n_3;
        this.J = string;
    }

    @Override
    public String toString() {
        return this.S.toString() + (char)a + this.J;
    }

    @Override
    @c
    public Object W(_4 _42) throws Throwable {
        return _42.K(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 421127293331197320L;
        a = 0x1E94EFF8C43A4DA6L ^ l2;
    }
}

