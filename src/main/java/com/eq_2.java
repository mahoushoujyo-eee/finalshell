/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F_;
import com.QQ;
import com.es_1;
import com.lq_2;

/*
 * Renamed from com.eq
 */
class eq_2
extends es_1 {
    final QQ h;
    final F_ l;

    eq_2(QQ qQ, F_ f_2) {
        this.h = qQ;
        this.l = f_2;
    }

    @Override
    public void T() {
        lq_2.U.remove(this.h);
        this.l.o(this.h.W());
        this.h.j(this);
    }
}

