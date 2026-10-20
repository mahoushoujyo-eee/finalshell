/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I0;
import com.xo_0;

/*
 * Renamed from com.Nd
 */
abstract class nd_0 {
    public final long D;
    public final boolean M;
    public final xo_0 E;

    private nd_0(xo_0 xo_02, boolean bl) {
        this.E = xo_02;
        this.M = bl;
        this.D = System.nanoTime();
    }

    nd_0(xo_0 xo_02, boolean bl, I0 i0) {
        this(xo_02, bl);
    }
}

