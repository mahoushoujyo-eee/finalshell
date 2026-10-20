/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YM;
import com.nx_2;
import com.w6_0;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PH
extends WindowAdapter {
    final YM G;

    PH(YM yM) {
        this.G = yM;
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        int n10 = nx_2.c();
        YM yM = this.G;
        if (n10 != 0) {
            if (YM.q(yM) != null) {
                YM yM2 = this.G;
                if (n10 != 0) {
                    if (YM.Z(yM2)) {
                        this.G.O.T(YM.O(this.G));
                    }
                    YM.q(this.G).flush();
                    yM2 = this.G;
                }
                YM.I(yM2, null);
            }
            w6_0.A(YM.l(this.G));
            YM.E(this.G, null);
            yM = this.G;
        }
        YM.W(yM, null);
    }
}

