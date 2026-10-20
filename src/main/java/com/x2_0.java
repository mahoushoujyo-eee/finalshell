/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import com.rs_1;
import com.xa_1;
import java.util.Date;

/*
 * Renamed from com.x2
 */
class x2_0
extends xa_1 {
    final rs_1 w;

    x2_0(rs_1 rs_12) {
        this.w = rs_12;
        super(rs_12);
    }

    @Override
    public void y(Object object) {
        ((lk_2)rs_1.U(this.w)).R((Date)object);
    }

    @Override
    public Object G() {
        ((lk_2)rs_1.S(this.w)).V(false);
        return ((lk_2)rs_1.a(this.w)).E();
    }
}

