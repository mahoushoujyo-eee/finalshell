/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.F.c;
import org.h.k_0;
import org.v.fA;
import org.v.fH;
import org.v.fb_0;
import org.v.fg_0;
import org.v.h2;

/*
 * Renamed from org.H.z
 */
class z_0
implements h2 {
    final k_0 B;

    z_0(k_0 k_02) {
        this.B = k_02;
    }

    @c
    public Void x(fg_0 fg_02) throws Throwable {
        k_0.B(this.B).d(fg_02);
        return null;
    }

    @c
    public Void x(fb_0 fb_02) throws Throwable {
        k_0.B(this.B).h(fb_02);
        return null;
    }

    @c
    public Void c(fA fA2) throws Throwable {
        k_0.B(this.B).t(fA2);
        return null;
    }

    @c
    public Void f(fH fH2) throws Throwable {
        k_0.B(this.B).r(fH2);
        return null;
    }

    @Override
    @c
    public Object w(fH fH2) throws Throwable {
        return this.f(fH2);
    }

    @Override
    @c
    public Object r(fA fA2) throws Throwable {
        return this.c(fA2);
    }

    @Override
    @c
    public Object U(fb_0 fb_02) throws Throwable {
        return this.x(fb_02);
    }

    @Override
    @c
    public Object f(fg_0 fg_02) throws Throwable {
        return this.x(fg_02);
    }
}

