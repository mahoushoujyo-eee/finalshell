/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.M;
import org.v.N_;
import org.v.RG;
import org.v._R;
import org.v._w_0;
import org.v.f_1;
import org.v.fk_0;
import org.v.fo_0;
import org.v.t_2;
import org.v.x_0;
import org.v.x_1;

public abstract class NV
extends N_
implements M,
t_2 {
    @c
    private x_1 e;
    static final Object D;
    @c
    Object F = D;
    static final boolean K;
    private static int b;

    protected NV(I i2) {
        super(i2);
    }

    @Override
    @c
    public final Object g(f_1 f_12) throws Throwable {
        return f_12.t(this);
    }

    @Override
    public final void d(x_1 x_12) {
        new _R(this, x_12).U(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public x_1 T() {
        x_1 x_12;
        String[] stringArray = RG.C();
        if (!K) {
            x_12 = this.e;
            if (stringArray == null) return x_12;
            if (x_12 == null) {
                throw new AssertionError();
            }
        }
        x_12 = this.e;
        return x_12;
    }

    @c
    public x_1 u() {
        return this.e;
    }

    @Override
    @c
    public NV n() {
        return this;
    }

    @c
    public abstract Object i(_w_0 var1) throws Throwable;

    @Override
    @c
    public final Object p(x_0 x_02) throws Throwable {
        return x_02.k(this);
    }

    @Override
    @c
    public final Object b(fo_0 fo_02) throws Throwable {
        return fo_02.q(this);
    }

    static x_1 w(NV nV2) {
        return nV2.e;
    }

    static x_1 f(NV nV2, x_1 x_12) {
        nV2.e = x_12;
        return nV2.e;
    }

    static {
        if (NV.b() != 0) {
            NV.g(10);
        }
        K = !RG.class.desiredAssertionStatus();
        D = new fk_0();
    }

    public static void g(int n10) {
        b = n10;
    }

    public static int b() {
        return b;
    }

    public static int V() {
        int n10 = NV.b();
        if (n10 == 0) {
            return 31;
        }
        return 0;
    }
}

