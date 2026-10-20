/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ic_0;
import com.kz_2;
import com.ld_0;
import java.util.List;

/*
 * Renamed from com.No
 */
class no_0
implements Runnable {
    final List M;
    final ic_0 h;
    private static final long a;

    no_0(ic_0 ic_02, List list) {
        this.h = ic_02;
        this.M = list;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void run() {
        block8: {
            block7: {
                ic_0.g(this.h).setModel(new ld_0(this));
                v0 = kz_2.M();
                ic_0.g(this.h).setVisibleRowCount(Math.min(this.M.size(), (int)no_0.a));
                ic_0.g(this.h).updateUI();
                var1_1 = v0;
                v1 = this;
                if (var1_1 != null) {
                    if (v1.M.size() > 0) {
                        ic_0.g(this.h).setSelectedIndex(0);
                    }
                    v1 = this;
                }
                var2_2 = v1.h.L.Z.getLocationOnScreen();
                this.h.L.d.setSize(this.h.L.Z.getWidth(), ic_0.a((ic_0)this.h).getPreferredSize().height);
                v2 = this.h.L.d;
                v3 = this.h.L.Z.getComponentOrientation().isLeftToRight();
                if (var1_1 == null) ** GOTO lbl20
                if (v3 != 0) {
                    v4 = var2_2.x;
                } else {
                    v3 = var2_2.x + this.h.L.Z.getWidth();
lbl20:
                    // 2 sources

                    v4 = v3 - this.h.L.d.getWidth();
                }
                v2.setLocation(v4, var2_2.y + this.h.L.Z.getHeight());
                v5 = this.h.L.d;
                if (var1_1 == null) break block7;
                if (v5.isShowing()) break block8;
                v5 = this.h.L.d;
            }
            v5.setVisible(true);
            this.h.L.transferFocus();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8932703871800293049L;
        a = 0xFC98F1330A69B6BFL ^ l2;
    }
}

