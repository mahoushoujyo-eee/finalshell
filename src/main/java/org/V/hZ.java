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
 */
class hZ
extends hP {
    final String y;
    final hd_0[] c;
    final h_1 U;

    hZ(h_1 h_12, hd_0 hd_02, String string, hd_0[] hd_0Array) {
        this.U = h_12;
        this.y = string;
        this.c = hd_0Array;
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
        return false;
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
        return this.y;
    }

    @Override
    public hd_0[] d() {
        return this.c;
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

