/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NJ;
import com.cn_0;

class zK
implements NJ {
    final cn_0 S;

    zK(cn_0 cn_02) {
        this.S = cn_02;
    }

    @Override
    public void e() {
        block3: {
            cn_0 cn_02;
            block2: {
                String[] stringArray = cn_0.Q();
                cn_02 = this.S;
                if (stringArray == null) break block2;
                if (cn_0.l(cn_02).n() != 1) break block3;
                cn_02 = this.S;
            }
            cn_0.T(cn_02);
        }
    }

    @Override
    public void R() {
        cn_0.b(this.S);
    }
}

