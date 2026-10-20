/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.H.P;
import org.v._S;
import org.v.f7;
import org.v.h4;
import org.v.hP;
import org.v.hd_0;
import org.v.ht_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hM
extends hP {
    final h4[] k;
    final _S H;
    final P B;
    final hd_0 Z;
    final String b;
    final hd_0[] K;
    final hd_0[] s;
    final ht_0 O;

    hM(ht_0 ht_02, h4[] h4Array, _S _S2, P p2, hd_0 hd_02, String string, hd_0[] hd_0Array, hd_0[] hd_0Array2) {
        this.O = ht_02;
        this.k = h4Array;
        this.H = _S2;
        this.B = p2;
        this.Z = hd_02;
        this.b = string;
        this.K = hd_0Array;
        this.s = hd_0Array2;
        super(ht_02);
    }

    @Override
    public h4[] f() {
        return this.k;
    }

    @Override
    public _S p() {
        return this.H;
    }

    @Override
    public boolean u() {
        return f7.G(this.B.D());
    }

    @Override
    public boolean F() {
        return f7.M(this.B.D());
    }

    @Override
    public hd_0 p() {
        return this.Z;
    }

    @Override
    public String K() {
        return this.b;
    }

    @Override
    public hd_0[] d() {
        return this.K;
    }

    @Override
    public boolean c() {
        return f7.F(this.B.D());
    }

    @Override
    public hd_0[] S() {
        return this.s;
    }
}

