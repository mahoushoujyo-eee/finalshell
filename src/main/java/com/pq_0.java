/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O_;
import com.k4_0;
import com.kk_2;
import com.kz_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Pq
 */
class pq_0
extends MouseAdapter {
    private boolean f;
    final k4_0 h;
    final O_ b;
    final String W;
    final String E;
    final kk_2 z;

    pq_0(kk_2 kk_22, k4_0 k4_02, O_ o_, String string, String string2) {
        this.z = kk_22;
        this.h = k4_02;
        this.b = o_;
        this.W = string;
        this.E = string2;
        this.f = k4_0.K(this.z.E);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mousePressed(MouseEvent var1_1) {
        block7: {
            block8: {
                block9: {
                    block10: {
                        v0 = kz_2.M();
                        this.z.requestFocusInWindow();
                        var2_2 = v0;
                        if (var2_2 == null) break block7;
                        if (!SwingUtilities.isRightMouseButton(var1_1)) break block8;
                        v1 = this.z.E;
                        if (var2_2 == null) break block9;
                        if (!v1.I) break block10;
                        v2 = this.f;
                        if (var2_2 != null) {
                            v2 = v2 == false;
                        }
                        this.f = v2;
                        v3 = this;
                        if (var2_2 == null) ** GOTO lbl20
                        if (v3.f) {
                            v4 = this.W;
                        } else {
                            v3 = this;
lbl20:
                            // 2 sources

                            v4 = v3.E;
                        }
                        this.b.setText(v4);
                        if (var2_2 != null) break block8;
                    }
                    v1 = this.z.E;
                }
                v5 = this.z.E.o();
                if (var2_2 != null) {
                    v5 = v5 == false;
                }
                v1.N(v5);
            }
            kk_2.L(this.z);
        }
    }
}

