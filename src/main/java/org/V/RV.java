/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.fr_0;
import org.v.fs_0;
import org.v.fu_0;
import org.v.hs_0;

public final class RV
extends fr_0
implements fs_0 {
    public final fu_0[] C;
    public final String[] t;

    protected RV(I i2, fu_0[] fu_0Array, String[] stringArray) {
        super(i2);
        this.C = fu_0Array;
        this.t = stringArray;
    }

    @Override
    @c
    public Object w(hs_0 hs_02) throws Throwable {
        return hs_02.v(this);
    }
}

