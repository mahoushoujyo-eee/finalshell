/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Map;
import org.h.cr_0;
import org.v._g_0;
import org.v.hH;

/*
 * Renamed from org.v._b
 */
class _b_0
implements hH {
    final Map y;
    final _g_0 C;

    _b_0(_g_0 _g_02, Map map) {
        this.C = _g_02;
        this.y = map;
    }

    @Override
    public void n(cr_0 cr_02) {
        this.y.put(cr_02.t(), cr_02.q());
    }
}

