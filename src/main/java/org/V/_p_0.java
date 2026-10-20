/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.List;
import org.F.c;
import org.I;
import org.v._B;
import org.v._j_0;
import org.v.fq_0;
import org.v.fu_0;
import org.v.hL;
import org.v.k_1;
import org.v.nt_0;

/*
 * Renamed from org.v._p
 */
public final class _p_0
extends _j_0
implements k_1 {
    private final List t = new ArrayList();

    public _p_0(I i2, @c String string, fu_0[] fu_0Array, String string2, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, null, null, nt_0Array);
    }

    @Override
    public nt_0[] M() {
        return this.g;
    }

    @Override
    public List N() {
        return this.t;
    }

    @Override
    public void W(_B _B2) {
        this.t.add(_B2);
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.f(this);
    }

    @Override
    @c
    public Object i(hL hL2) throws Throwable {
        return hL2.L(this);
    }
}

