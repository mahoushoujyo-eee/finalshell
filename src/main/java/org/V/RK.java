/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.b_0;
import org.v.f_1;
import org.v.hV;
import org.v.hj_0;
import org.v.nt_0;
import org.v.x_1;

public abstract class RK
implements hV {
    public final nt_0 A;

    public RK(nt_0 nt_02) {
        this.A = nt_02;
    }

    @Override
    public void d(x_1 x_12) {
        this.A.n(x_12);
    }

    @Override
    public I Q() {
        return this.A.Q();
    }

    @Override
    @c
    public final Object g(f_1 f_12) throws Throwable {
        return f_12.G(this);
    }

    @Override
    @c
    public final Object i(hj_0 hj_02) throws Throwable {
        return this.q(hj_02);
    }

    @Override
    public void M(String string) throws b_0 {
        throw new b_0(string, this.Q());
    }
}

