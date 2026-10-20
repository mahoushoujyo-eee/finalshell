/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IR;
import com.YP;
import com.dx_2;
import com.j_0;
import com.lf_0;
import com.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.lc
 */
class lc_2
implements lf_0 {
    final dx_2 W;
    final IR e;

    lc_2(IR iR, dx_2 dx_22) {
        this.e = iR;
        this.W = dx_22;
    }

    @Override
    public void N(int n10, int n11, @NotNull YP yP, @NotNull j_0 j_02, int n12) {
        int n13;
        int n14 = 0;
        int n15 = j_02.length();
        boolean bl = j_0.P();
        int n16 = j_02 instanceof q_0;
        if (!bl) {
            if (n16 != 0) {
                q_0 q_02 = (q_0)j_02;
                j_02 = q_02.V();
                n14 = q_02.p();
            }
            n16 = n13 = n14;
        }
        while (n13 < n14 + n15) {
            this.W.A(n10, n11 - n12, j_02, n13);
            ++n13;
            if (!bl) continue;
        }
    }

    @Override
    public void r(int n10, int n11, int n12, @NotNull YP yP, @NotNull j_0 j_02, int n13) {
    }

    @Override
    public void K(int n10, int n11, int n12, int n13) {
    }
}

