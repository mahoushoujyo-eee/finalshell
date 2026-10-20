/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ca_2;
import com.cs_1;
import com.pa_1;
import java.awt.event.MouseEvent;
import java.util.List;

/*
 * Renamed from com.Gj
 */
class gj_0
implements cs_1 {
    final ca_2 A;
    final MouseEvent h;
    final pa_1 e;

    gj_0(pa_1 pa_12, ca_2 ca_22, MouseEvent mouseEvent) {
        this.e = pa_12;
        this.A = ca_22;
        this.h = mouseEvent;
    }

    @Override
    public List n() {
        return this.A.x(this.h);
    }

    @Override
    public cs_1 c() {
        return this.e;
    }

    @Override
    public void Y(cs_1 cs_12) {
    }
}

