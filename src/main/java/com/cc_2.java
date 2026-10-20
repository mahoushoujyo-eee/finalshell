/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c4_0;
import com.k3_0;
import com.kc_1;
import com.ko_2;

/*
 * Renamed from com.cc
 */
class cc_2
extends c4_0 {
    final kc_1 G;
    final ko_2 z;

    cc_2(ko_2 ko_22, boolean bl, kc_1 kc_12) {
        this.z = ko_22;
        this.G = kc_12;
        super(bl);
    }

    @Override
    public void f(boolean bl) {
        block4: {
            ko_2 ko_22;
            block6: {
                block5: {
                    int[] nArray = k3_0.L();
                    ko_2 ko_23 = this.z;
                    ko_2.R(ko_23, bl);
                    int[] nArray2 = nArray;
                    if (nArray2 == null) break block4;
                    if (bl) break block5;
                    ko_22 = this.z;
                    if (nArray2 == null) break block6;
                    if (ko_2.Q(ko_22)) {
                        ko_2.r(this.z, false);
                        this.z.V.v().y(ko_23, null);
                        ko_23.revalidate();
                    }
                }
                ko_22 = this.z;
            }
            ko_22.repaint();
        }
    }
}

