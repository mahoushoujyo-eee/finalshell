/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.RQ;
import org.v.fY;
import org.v.rx_0;

public class R3
extends RQ {
    public final NV S;

    public R3(I i2, NV nV2) {
        super(i2);
        this.S = nV2;
    }

    @Override
    public void e(rx_0 rx_02) {
        this.S.d(rx_02);
    }

    @Override
    @c
    public Object R(fY fY2) throws Throwable {
        return fY2.S(this);
    }

    public String toString() {
        return this.S.toString();
    }
}

