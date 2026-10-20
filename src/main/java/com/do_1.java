/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.da_1;
import com.k3_0;
import com.ks_2;

/*
 * Renamed from com.dO
 */
class do_1
extends da_1 {
    final ks_2 F;

    do_1(ks_2 ks_22) {
        this.F = ks_22;
    }

    @Override
    public void q(k3_0 k3_02) {
        this.F.H(this.F.y.indexOf(k3_02), true);
    }

    @Override
    public void A(k3_0 k3_02) {
        block4: {
            ks_2 ks_22;
            block5: {
                ks_2 ks_23;
                block2: {
                    block3: {
                        int[] nArray = k3_0.L();
                        ks_23 = this.F;
                        if (nArray == null) break block2;
                        if (ks_23.r) break block3;
                        ks_22 = this.F;
                        if (nArray == null) break block4;
                        if (ks_22.I() != 0) break block5;
                    }
                    ks_23 = this.F;
                }
                ks_23.H(this.F.y.indexOf(k3_02), false);
            }
            ks_22 = this.F;
        }
        ks_22.j = k3_02;
    }
}

