/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.F.c;
import org.h.cs_0;
import org.v.fA;
import org.v.fH;
import org.v.fK;
import org.v.fb_0;
import org.v.fg_0;
import org.v.h2;

/*
 * Renamed from org.H.b
 */
class b_0
implements h2 {
    final cs_0 v;

    b_0(cs_0 cs_02) {
        this.v = cs_02;
    }

    @c
    public fK e(fg_0 fg_02) throws org.b_0 {
        return this.v.H(fg_02);
    }

    @c
    public fK S(fb_0 fb_02) throws org.b_0 {
        return this.v.L(fb_02);
    }

    @c
    public fK h(fA fA2) throws org.b_0 {
        return this.v.s(fA2);
    }

    @c
    public fK y(fH fH2) throws org.b_0 {
        return this.v.c(fH2);
    }

    @Override
    @c
    public Object w(fH fH2) throws Throwable {
        return this.y(fH2);
    }

    @Override
    @c
    public Object r(fA fA2) throws Throwable {
        return this.h(fA2);
    }

    @Override
    @c
    public Object U(fb_0 fb_02) throws Throwable {
        return this.S(fb_02);
    }

    @Override
    @c
    public Object f(fg_0 fg_02) throws Throwable {
        return this.e(fg_02);
    }
}

