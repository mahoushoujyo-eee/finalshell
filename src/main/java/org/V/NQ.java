/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NA;
import org.v.NR;
import org.v.NV;
import org.v.N_;
import org.v.RG;
import org.v._4;
import org.v.hV;
import org.v.nt_0;
import org.v.x_1;

public final class NQ
extends NR {
    public final String[] z;
    public final int W;
    @c
    private nt_0 E;
    @c
    N_ k;

    public NQ(I i2, String[] stringArray) {
        this(i2, stringArray, stringArray.length);
    }

    public NQ(I i2, String[] stringArray, int n10) {
        super(i2);
        this.z = stringArray;
        this.W = n10;
    }

    @Override
    public nt_0 f() {
        String[] stringArray = RG.C();
        NQ nQ2 = this;
        if (stringArray != null) {
            if (nQ2.E != null) {
                return this.E;
            }
            nQ2 = this;
        }
        String[] stringArray2 = new String[nQ2.W];
        System.arraycopy(this.z, 0, stringArray2, 0, this.W);
        NA nA2 = new NA(this.Q(), new hV[0], stringArray2, null);
        x_1 x_12 = this.u();
        if (x_12 != null) {
            ((nt_0)nA2).n(x_12);
        }
        this.E = nA2;
        return this.E;
    }

    @Override
    public String toString() {
        return RG.b(this.z, ".", 0, this.W);
    }

    @Override
    @c
    public NR v() {
        String[] stringArray = RG.C();
        NQ nQ2 = this;
        if (stringArray != null) {
            if (nQ2.k != null) {
                return this.k.v();
            }
            nQ2 = this;
        }
        return nQ2;
    }

    @Override
    @c
    public NV n() {
        String[] stringArray = RG.C();
        NQ nQ2 = this;
        if (stringArray != null) {
            if (nQ2.k != null) {
                return this.k.n();
            }
            nQ2 = this;
        }
        return nQ2;
    }

    @Override
    @c
    public Object W(_4 _42) throws Throwable {
        return _42.V(this);
    }
}

