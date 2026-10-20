/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ST;
import com.cb_1;
import com.us_0;
import com.yz_0;
import com.zn_0;
import java.util.List;

/*
 * Renamed from com.Sl
 */
class sl_0
extends ST {
    final cb_1 O;
    final List s;
    final us_0 e;
    final zn_0 W;
    final yz_0 x;

    sl_0(yz_0 yz_02, cb_1 cb_12, List list, us_0 us_02, zn_0 zn_02) {
        this.x = yz_02;
        this.O = cb_12;
        this.s = list;
        this.e = us_02;
        this.W = zn_02;
    }

    @Override
    public void y(cb_1 cb_12, List list) {
        block3: {
            block2: {
                String[] stringArray = cb_1.C();
                if (stringArray == null) break block2;
                if (cb_12 != this.O) break block3;
                this.x.b(this.s, this.O, this.e, this.W, this.O.getChildCount());
            }
            this.e.C(this);
        }
    }

    @Override
    public void X(cb_1 cb_12, Throwable throwable) {
        if (cb_12 == this.O) {
            this.e.C(this);
        }
    }
}

