/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OT;
import com._y_0;
import com.pa_1;
import com.wf_1;

/*
 * Renamed from com.ny
 */
class ny_2
implements Runnable {
    final pa_1 d;

    ny_2(pa_1 pa_12) {
        this.d = pa_12;
    }

    @Override
    public void run() {
        block3: {
            pa_1 pa_12;
            block2: {
                int n10 = _y_0.y();
                pa_12 = this.d;
                if (n10 != 0) break block2;
                if (pa_1.A(pa_12) == null) break block3;
                pa_12 = this.d;
            }
            OT oT = pa_12.n();
            pa_1.A(this.d).J(oT, wf_1.User);
        }
    }
}

