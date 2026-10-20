/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W4;
import com.dy_1;
import com.er_2;
import java.util.Vector;

/*
 * Renamed from com.Eu
 */
class eu_0
implements er_2 {
    final Vector w;
    final dy_1 k;

    eu_0(dy_1 dy_12, Vector vector) {
        this.k = dy_12;
        this.w = vector;
    }

    @Override
    public int n(W4 w4) {
        this.w.addElement(w4);
        return 0;
    }
}

