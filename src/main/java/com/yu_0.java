/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IR;
import com.OT;
import com._y_0;
import com.pa_1;
import com.wf_1;

/*
 * Renamed from com.Yu
 */
class yu_0
implements Runnable {
    final pa_1 P;

    yu_0(pa_1 pa_12) {
        this.P = pa_12;
    }

    @Override
    public void run() {
        block3: {
            OT oT;
            block5: {
                boolean bl;
                block6: {
                    OT oT2;
                    int n10;
                    block4: {
                        pa_1 pa_12;
                        block2: {
                            n10 = _y_0.y();
                            pa_12 = this.P;
                            if (n10 != 0) break block2;
                            if (pa_1.A(pa_12) == null) break block3;
                            pa_12 = this.P;
                        }
                        oT2 = oT = pa_12.n();
                        if (n10 != 0) break block4;
                        if (oT2 == null) break block3;
                        oT = IR.V(oT);
                        oT2 = this.P.N;
                    }
                    bl = oT2.equals(oT);
                    if (n10 != 0) break block5;
                    if (!bl) break block6;
                    bl = pa_1.H(this.P);
                    if (n10 != 0) break block5;
                    if (bl) break block3;
                }
                bl = pa_1.u(this.P, true);
            }
            pa_1.H(this.P).R();
            pa_1.A(this.P).J(oT, wf_1.User);
        }
    }
}

