/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.fz_0;
import org.v.nt_0;
import org.v.q_2;
import org.v.x_0;
import org.v.x_1;

public final class NH
extends nt_0 {
    public final q_2 Y;

    public NH(I i2, q_2 q_22) {
        super(i2);
        this.Y = q_22;
    }

    @Override
    public void n(x_1 x_12) {
    }

    @Override
    public x_1 h() {
        throw new AssertionError();
    }

    @Override
    public String toString() {
        return this.Y.toString();
    }

    @Override
    @c
    public Object p(x_0 x_02) throws Throwable {
        return x_02.u(this);
    }

    @Override
    @c
    public Object h(fz_0 fz_02) throws Throwable {
        return fz_02.j(this);
    }
}

