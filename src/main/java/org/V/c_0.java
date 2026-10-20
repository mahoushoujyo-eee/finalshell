/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Map;
import org.b_0;
import org.v.h4;
import org.v.hT;
import org.v.h_1;
import org.v.nt_0;
import org.v.q_2;

/*
 * Renamed from org.v.C
 */
class c_0
implements h4 {
    final Map o;
    final nt_0 s;
    final hT u;

    c_0(hT hT2, Map map, nt_0 nt_02) {
        this.u = hT2;
        this.o = map;
        this.s = nt_02;
    }

    @Override
    public Object y(String string) {
        return this.o.get(string);
    }

    @Override
    public q_2 I() throws b_0 {
        return h_1.v(this.u.T, this.s);
    }
}

