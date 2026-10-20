/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.v._S;
import org.v.h4;
import org.v.h_1;
import org.v.hd_0;
import org.v.u_1;

/*
 * Renamed from org.v.P
 */
public class p_0
extends u_1 {
    private final String g;
    private final hd_0 X;

    public p_0(hd_0 hd_02, String string, hd_0 hd_03) {
        hd_0 hd_04 = hd_02;
        Objects.requireNonNull(hd_04);
        super(hd_04);
        this.g = string;
        this.X = hd_03;
    }

    @Override
    public Object J() {
        return h_1.K;
    }

    @Override
    public String h() {
        return this.g;
    }

    @Override
    public hd_0 P() {
        return this.X;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public _S p() {
        return _S.DEFAULT;
    }

    @Override
    public h4[] f() {
        return new h4[0];
    }
}

