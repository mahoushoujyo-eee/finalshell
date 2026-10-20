/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.dm_0;
import com.na_2;

class D1
implements dm_0 {
    final na_2 U;

    D1(na_2 na_22) {
        this.U = na_22;
    }

    @Override
    public void G(String string, G9 g92) {
        block3: {
            na_2 na_22;
            block2: {
                boolean bl = na_2.e();
                na_22 = this.U;
                if (!bl) break block2;
                if (!na_22.x()) break block3;
                na_22 = this.U;
            }
            na_22.h();
        }
    }
}

