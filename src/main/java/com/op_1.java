/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.or_1;
import com.zn_0;
import java.util.List;

/*
 * Renamed from com.oP
 */
class op_1
extends or_1 {
    final cb_1 m;
    final boolean R;
    final zn_0 B;

    op_1(zn_0 zn_02, cb_1 cb_12, boolean bl) {
        this.B = zn_02;
        this.m = cb_12;
        this.R = bl;
    }

    @Override
    public void r(cb_1 cb_12, List list) {
        block3: {
            op_1 op_12;
            block2: {
                String[] stringArray = cb_1.C();
                op_12 = this;
                if (stringArray == null) break block2;
                if (!op_12.m.H().equals(cb_12.H())) break block3;
                this.B.B(this);
                op_12 = this;
            }
            op_12.B.v(this.m, this.R);
        }
    }

    @Override
    public void N(cb_1 cb_12, Throwable throwable) {
        block3: {
            op_1 op_12;
            block2: {
                String[] stringArray = cb_1.C();
                op_12 = this;
                if (stringArray == null) break block2;
                if (!op_12.m.H().equals(cb_12.H())) break block3;
                op_12 = this;
            }
            op_12.B.B(this);
        }
    }
}

