/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.RW;
import org.v._S;
import org.v._U;
import org.v._Y;
import org.v._n_0;
import org.v.fq_0;
import org.v.fu_0;
import org.v.hL;
import org.v.k_0;
import org.v.nt_0;

public class _O
extends _n_0
implements RW {
    private static final long g;

    public _O(I i2, @c String string, fu_0[] fu_0Array, String string2, @c _U[] _UArray, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, _UArray, nt_0Array);
    }

    @Override
    public _S Q() {
        return RG.N(this.D());
    }

    @Override
    public String R() {
        _Y _Y2 = (_Y)this.y();
        return _Y2.R() + (char)g + this.j();
    }

    @Override
    public void C(k_0 k_02) {
        this.r(k_02);
    }

    @Override
    public k_0 H() {
        return (k_0)this.y();
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.p(this);
    }

    @Override
    @c
    public Object i(hL hL2) throws Throwable {
        return hL2.I(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1573063443516784526L;
        g = 0x926B5D990FF87FAAL ^ l2;
    }
}

