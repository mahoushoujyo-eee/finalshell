/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._b_0;
import com.oi_2;
import com.xy_2;

final class _A
extends _b_0 {
    final xy_2 s;

    private _A(xy_2 xy_22) {
        this.s = xy_22;
        super(xy_22);
    }

    public Object next() {
        return this.L().getKey();
    }

    _A(xy_2 xy_22, oi_2 oi_22) {
        this(xy_22);
    }
}

