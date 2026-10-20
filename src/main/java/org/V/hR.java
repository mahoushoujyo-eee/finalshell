/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.b_0;
import org.v._S;
import org.v.h4;
import org.v.hP;
import org.v.h_1;
import org.v.hd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hR
extends hP {
    final hP N;
    final hd_0[] U;
    final h_1 m;

    hR(h_1 h_12, hd_0 hd_02, hP hP2, hd_0[] hd_0Array) {
        this.m = h_12;
        this.N = hP2;
        this.U = hd_0Array;
        hd_0 hd_03 = hd_02;
        Objects.requireNonNull(hd_03);
        super(hd_03);
    }

    @Override
    public h4[] f() {
        return this.N.f();
    }

    @Override
    public _S p() {
        return this.N.p();
    }

    @Override
    public boolean F() {
        return true;
    }

    @Override
    public boolean u() {
        return this.N.u();
    }

    @Override
    public hd_0 p() throws b_0 {
        return this.N.p();
    }

    @Override
    public String K() {
        return this.N.K();
    }

    @Override
    public hd_0[] d() throws b_0 {
        return this.N.p();
    }

    @Override
    public boolean c() {
        return this.N.c();
    }

    @Override
    public hd_0[] S() {
        return this.U;
    }
}

