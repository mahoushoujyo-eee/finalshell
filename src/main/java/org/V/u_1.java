/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v._S;
import org.v.hd_0;
import org.v.p_1;

/*
 * Renamed from org.v.u
 */
public abstract class u_1
implements p_1 {
    final hd_0 u;

    public u_1(hd_0 hd_02) {
        this.u = hd_02;
    }

    @Override
    public abstract _S p();

    @Override
    public hd_0 o() {
        return this.u;
    }

    public abstract boolean b();

    public abstract hd_0 P() throws b_0;

    public abstract String h();

    public String F() throws b_0 {
        return hd_0.R(this.P()).z();
    }

    @c
    public abstract Object J() throws b_0;

    public String toString() {
        return this.o().toString() + "." + this.h();
    }
}

