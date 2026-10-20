/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gj_2;
import com.yp_2;

/*
 * Renamed from com.gp
 */
class gp_2
extends gj_2 {
    final yp_2 K;

    gp_2(yp_2 yp_22) {
        this.K = yp_22;
    }

    @Override
    protected float q(float f10) {
        f10 += yp_2.f(this.K) * (float)Math.sin((double)(f10 * 2.0f) * Math.PI);
        return 1.0f - (float)Math.exp(-f10 * yp_2.o(this.K));
    }
}

