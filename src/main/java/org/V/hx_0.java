/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.v._S;
import org.v.h4;
import org.v.hP;
import org.v.h_1;
import org.v.hd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.hx
 */
class hx_0
extends hP {
    final String T;
    final hd_0[] P;
    final h_1 c;

    hx_0(h_1 h_12, hd_0 hd_02, String string, hd_0[] hd_0Array) {
        this.c = h_12;
        this.T = string;
        this.P = hd_0Array;
        hd_0 hd_03 = hd_02;
        Objects.requireNonNull(hd_03);
        super(hd_03);
    }

    @Override
    public h4[] f() {
        return new h4[0];
    }

    @Override
    public _S p() {
        return _S.PUBLIC;
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public hd_0 p() {
        return hd_0.G;
    }

    @Override
    public String K() {
        return this.T;
    }

    @Override
    public hd_0[] d() {
        return this.P;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public hd_0[] S() {
        return new hd_0[0];
    }
}

