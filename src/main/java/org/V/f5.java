/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.List;
import org.F.c;
import org.v.fA;
import org.v.fH;
import org.v.fb_0;
import org.v.fg_0;
import org.v.h2;
import org.v.h_1;

class f5
implements h2 {
    final List i;
    final h_1 Q;

    f5(h_1 h_12, List list) {
        this.Q = h_12;
        this.i = list;
    }

    @c
    public Void N(fg_0 fg_02) {
        this.i.add(fg_02);
        return null;
    }

    @c
    public Void B(fb_0 fb_02) {
        return null;
    }

    @c
    public Void a(fA fA2) {
        return null;
    }

    @c
    public Void H(fH fH2) {
        return null;
    }

    @Override
    @c
    public Object w(fH fH2) throws Throwable {
        return this.H(fH2);
    }

    @Override
    @c
    public Object r(fA fA2) throws Throwable {
        return this.a(fA2);
    }

    @Override
    @c
    public Object U(fb_0 fb_02) throws Throwable {
        return this.B(fb_02);
    }

    @Override
    @c
    public Object f(fg_0 fg_02) throws Throwable {
        return this.N(fg_02);
    }
}

