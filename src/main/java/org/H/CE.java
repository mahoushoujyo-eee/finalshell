/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.b_0;
import org.h.cs_0;
import org.v.NT;
import org.v.RF;
import org.v._8;
import org.v.e_2;

class CE
implements e_2 {
    final cs_0 j;

    CE(cs_0 cs_02) {
        this.j = cs_02;
    }

    public _8 S(NT nT2) throws b_0 {
        return this.j.z(nT2);
    }

    public _8 C(RF rF) throws b_0 {
        return this.j.W(rF);
    }

    @Override
    public Object q(RF rF) throws Throwable {
        return this.C(rF);
    }

    @Override
    public Object W(NT nT2) throws Throwable {
        return this.S(nT2);
    }
}

