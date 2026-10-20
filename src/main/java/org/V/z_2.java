/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.h.c_0;
import org.v._S;
import org.v.f7;
import org.v.h4;
import org.v.hd_0;
import org.v.ht_0;
import org.v.u_1;

/*
 * Renamed from org.v.z
 */
class z_2
extends u_1 {
    final Object E;
    final String h;
    final hd_0 c;
    final c_0 l;
    final _S v;
    final h4[] z;
    final ht_0 r;

    z_2(ht_0 ht_02, Object object, String string, hd_0 hd_02, c_0 c_02, _S _S2, h4[] h4Array) {
        this.r = ht_02;
        this.E = object;
        this.h = string;
        this.c = hd_02;
        this.l = c_02;
        this.v = _S2;
        this.z = h4Array;
        super(ht_02);
    }

    @Override
    public Object J() {
        return this.E;
    }

    @Override
    public String h() {
        return this.h;
    }

    @Override
    public hd_0 P() {
        return this.c;
    }

    @Override
    public boolean b() {
        return f7.G(this.l.w());
    }

    @Override
    public _S p() {
        return this.v;
    }

    @Override
    public h4[] f() {
        return this.z;
    }
}

