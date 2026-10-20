/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.v._S;
import org.v.h4;
import org.v.h_1;
import org.v.hd_0;
import org.v.hv_0;

class hY
extends hv_0 {
    final hd_0[] i;
    final h_1 h;

    hY(h_1 h_12, hd_0 hd_02, hd_0[] hd_0Array) {
        this.h = h_12;
        this.i = hd_0Array;
        hd_0 hd_03 = hd_02;
        Objects.requireNonNull(hd_03);
        super(hd_03);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public hd_0[] d() {
        return this.i;
    }

    @Override
    public _S p() {
        return _S.PUBLIC;
    }

    @Override
    public hd_0[] S() {
        return new hd_0[0];
    }

    @Override
    public h4[] f() {
        return new h4[0];
    }
}

