/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.k3_0;
import com.ks_2;

/*
 * Renamed from com.Kr
 */
class kr_0
implements E {
    final k3_0 h;
    final ks_2 x;

    kr_0(ks_2 ks_22, k3_0 k3_02) {
        this.x = ks_22;
        this.h = k3_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Boolean h() {
        boolean bl;
        block10: {
            k3_0 k3_02;
            block11: {
                int n10;
                int[] nArray = k3_0.L();
                int n11 = this.h.Y();
                if (nArray != null) {
                    if (n11 == 0) {
                        return true;
                    }
                    n11 = this.x.e;
                }
                if (nArray != null) {
                    if (n11 == 0) {
                        return true;
                    }
                    n11 = this.x.I();
                }
                int n13 = n10 = n11;
                n13 = 1;
                if (nArray != null) {
                    if (n12 > n13) {
                        return true;
                    }
                    int n13 = n10;
                    n13 = 1;
                }
                if (n12 != n13) break block10;
                k3_02 = this.x.j;
                if (nArray == null) break block11;
                if (k3_02 == null) break block10;
                k3_02 = this.x.j;
            }
            if (k3_02 != this.h) {
                bl = true;
                return bl;
            }
        }
        bl = false;
        return bl;
    }

    @Override
    public Object J() {
        return this.h();
    }
}

