/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NR;
import org.v.NV;
import org.v._w_0;

/*
 * Renamed from org.v.Nu
 */
public final class nu_0
extends NV {
    public final boolean s;
    public final String o;
    public final NR l;

    public nu_0(I i2, String string, NR nR2) {
        super(i2);
        this.s = true;
        this.o = string;
        this.l = nR2;
    }

    public nu_0(I i2, NR nR2, String string) {
        super(i2);
        this.s = false;
        this.o = string;
        this.l = nR2;
    }

    @Override
    public String toString() {
        return this.s ? this.o + this.l : this.l + this.o;
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.E(this);
    }
}

