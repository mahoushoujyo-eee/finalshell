/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S5;
import com.ST;
import com.cb_1;
import com.us_0;
import java.util.List;

/*
 * Renamed from com.Sb
 */
class sb_0
extends ST {
    final cb_1 d;
    final S5 r;
    final List K;
    final boolean z;
    final boolean Q;
    final us_0 q;

    sb_0(us_0 us_02, cb_1 cb_12, S5 s5, List list, boolean bl, boolean bl2) {
        this.q = us_02;
        this.d = cb_12;
        this.r = s5;
        this.K = list;
        this.z = bl;
        this.Q = bl2;
    }

    @Override
    public void y(cb_1 cb_12, List list) {
        block6: {
            S5 s5;
            block9: {
                String[] stringArray;
                block7: {
                    block8: {
                        block5: {
                            stringArray = cb_1.C();
                            if (stringArray == null) break block5;
                            if (!cb_12.H().equals(this.d.H())) break block6;
                            this.q.C(this);
                        }
                        sb_0 sb_02 = this;
                        if (stringArray != null) {
                            if (sb_02.r != null) {
                                this.r.T(this.d);
                            }
                            sb_02 = this;
                        }
                        cb_1 cb_13 = sb_02.q.A((String)this.K.get(0));
                        this.K.remove(0);
                        if (stringArray == null) break block7;
                        if (cb_13 == null) break block8;
                        this.q.k(cb_13, this.K, this.z, this.Q, this.r);
                        if (stringArray != null) break block6;
                    }
                    this.q.r(this.d, this.z, this.Q);
                }
                s5 = this.r;
                if (stringArray == null) break block9;
                if (s5 == null) break block6;
                s5 = this.r;
            }
            s5.K(this.d);
        }
    }

    @Override
    public void X(cb_1 cb_12, Throwable throwable) {
        block3: {
            S5 s5;
            block4: {
                String[] stringArray;
                block2: {
                    stringArray = cb_1.C();
                    if (stringArray == null) break block2;
                    if (!cb_12.H().equals(this.d.H())) break block3;
                    this.q.C(this);
                    this.q.r(this.d, this.z, this.Q);
                }
                s5 = this.r;
                if (stringArray == null) break block4;
                if (s5 == null) break block3;
                s5 = this.r;
            }
            s5.K(this.d);
        }
    }
}

