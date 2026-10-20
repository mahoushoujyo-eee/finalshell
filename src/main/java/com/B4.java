/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QR;
import com._m_0;
import com.ky_2;
import com.sg_0;
import com.xq_2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class B4
implements xq_2 {
    final List Q;
    final Map r;
    final QR N;

    B4(QR qR, List list, Map map) {
        this.N = qR;
        this.Q = list;
        this.r = map;
    }

    @Override
    public List f() {
        return this.Q;
    }

    public List K(sg_0 sg_02) {
        List list = (List)this.r.get(sg_02.h().B());
        ky_2[] ky_2Array = _m_0.b();
        List list2 = list;
        if (ky_2Array == null) {
            list2 = list2 != null ? list : Collections.EMPTY_LIST;
        }
        return list2;
    }

    @Override
    public List i(Object object) {
        return this.K((sg_0)object);
    }
}

