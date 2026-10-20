/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;
import org.v.nl_0;

public final class N7
extends nl_0 {
    public final String P;
    public final NV p;

    public N7(I i2, String string, NV nV2) {
        super(i2);
        this.P = string;
        this.p = nV2;
    }

    @Override
    public String toString() {
        return this.P + this.p.toString();
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.a(this);
    }
}

