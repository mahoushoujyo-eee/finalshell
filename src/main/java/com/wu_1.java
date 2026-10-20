/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.SC;
import com.W5;
import com.yj_2;

/*
 * Renamed from com.wU
 */
class wu_1
implements SC {
    private SC k;
    final SC v;
    final yj_2 c;

    wu_1(yj_2 yj_22, SC sC) {
        this.c = yj_22;
        this.v = sC;
        this.k = this.v;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public float h(float var1_1, float var2_2) {
        var4_3 = this.k.h(var1_1, var2_2);
        var3_4 = W5.q();
        if (var3_4 == null) ** GOTO lbl7
        switch (yj_2.K(this.c)) {
            case 1: {
                var4_3 *= NM.k(0.45f, 0.55f, var4_3);
lbl7:
                // 2 sources

                if (var3_4 != null) break;
            }
            case 2: {
                v0 = var4_3;
                if (var3_4 != null) {
                    v0 = var4_3 = v0 < 0.5f ? 0.5f : var4_3;
                }
                if (var3_4 != null) break;
            }
            case 3: {
                var4_3 = NM.l(var4_3);
                if (var3_4 != null) break;
            }
            case 4: {
                var4_3 = NM.q(var4_3);
                if (var3_4 != null) break;
            }
            case 5: {
                var4_3 = NM.w(var4_3, 0.75f);
            }
        }
        return var4_3;
    }
}

