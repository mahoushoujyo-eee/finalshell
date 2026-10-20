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
 * Renamed from com.We
 */
class we_0
implements wc_0 {
    final kc_1 S;

    we_0(kc_1 kc_12) {
        this.S = kc_12;
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
                                        v0 = kc_1.O(this.S);
                                        if (var2_2 == null) break block2;
                                        if (v0 == 0) break block3;
                                        v0 = GR.rI.J(var1_1);
                                        if (var2_2 == null) break block4;
                                        if (v0 != 0) break block5;
                                    }
                                    v0 = kc_1.E(this.S);
                                }
                                if (var2_2 == null) break block6;
                                if (v0 == 0) break block7;
                                v0 = GR.lx.J(var1_1);
                            }
                            if (var2_2 == null) break block4;
                            if (v0 == 0) break block7;
                        }
                        v0 = var3_3 = this.S.z();
                    }
                    if (var2_2 == null) break block8;
                    if (var3_3 != -1) break block9;
                    this.S.Y(0);
                }
                if (var2_2 != null) break block7;
            }
            v1 = var3_3;
            v2 = this.S.p() - 1;
            if (var2_2 == null) ** GOTO lbl32
            if (v1 < v2) {
                v1 = var3_3;
                v2 = 1;
lbl32:
                // 2 sources

                v3 = v1 + v2;
            } else {
                v3 = 0;
            }
            this.S.Y(v3);
        }
    }
}

