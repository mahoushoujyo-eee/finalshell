/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.List;
import org.b_0;
import org.v.RN;
import org.v.h_1;
import org.v.hk_1;
import org.v.rx_0;

/*
 * Renamed from org.v.v
 */
class v_1
implements hk_1 {
    final rx_0 l;
    final List F;
    final hk_1 D;
    final RN L;
    final h_1 j;

    v_1(h_1 h_12, rx_0 rx_02, List list, hk_1 hk_12, RN rN) {
        this.j = h_12;
        this.l = rx_02;
        this.F = list;
        this.D = hk_12;
        this.L = rN;
    }

    @Override
    public boolean B() throws b_0 {
        return h_1.y(this.j, this.l, this.F, this.D, this.L);
    }
}

