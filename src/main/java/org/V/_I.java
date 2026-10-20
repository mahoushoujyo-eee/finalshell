/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.List;
import org.F.c;
import org.I;
import org.v._B;
import org.v._E;
import org.v.fq_0;
import org.v.fu_0;
import org.v.k_1;
import org.v.nt_0;

public final class _I
extends _E
implements k_1 {
    private final List f = new ArrayList();

    public _I(I i2, @c String string, fu_0[] fu_0Array, String string2, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, null, null, nt_0Array);
    }

    @Override
    public nt_0[] M() {
        return this.g;
    }

    @Override
    public List N() {
        return this.f;
    }

    @Override
    public void W(_B _B2) {
        this.f.add(_B2);
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.Y(this);
    }
}

