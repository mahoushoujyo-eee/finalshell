/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.k3_0;
import com.kc_1;
import com.wc_0;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.eC
 */
class ec_1
implements wc_0 {
    final kc_1 I;

    ec_1(kc_1 kc_12) {
        this.I = kc_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void j(KeyEvent var1_1) {
        block7: {
            block9: {
                block8: {
                    block4: {
                        block5: {
                            block6: {
                                block2: {
                                    block3: {
                                        var2_2 = k3_0.L();
                                        v0 = kc_1.O(this.I);
                                        if (var2_2 == null) break block2;
                                        if (v0 == 0) break block3;
                                        v0 = GR.rp.J(var1_1);
                                        if (var2_2 == null) break block4;
                                        if (v0 != 0) break block5;
                                    }
                                    v0 = kc_1.E(this.I);
                                }
                                if (var2_2 == null) break block6;
                                if (v0 == 0) break block7;
                                v0 = GR.rF.J(var1_1);
                            }
                            if (var2_2 == null) break block4;
                            if (v0 == 0) break block7;
                        }
                        v0 = var3_3 = this.I.z();
                    }
                    if (var2_2 == null) break block8;
                    if (var3_3 != -1) break block9;
                    this.I.Y(this.I.p() - 1);
                }
                if (var2_2 != null) break block7;
            }
            v1 = var3_3;
            if (var2_2 == null) ** GOTO lbl32
            if (v1 > 0) {
                v2 = var3_3 - 1;
            } else {
                v1 = this.I.p();
lbl32:
                // 2 sources

                v2 = v1 - 1;
            }
            this.I.Y(v2);
        }
    }
}

