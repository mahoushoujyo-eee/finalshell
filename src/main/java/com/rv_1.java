/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DA;
import com.SW;
import com.wc_0;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.rV
 */
class rv_1
implements wc_0 {
    final SW M;
    final DA G;

    rv_1(DA dA, SW sW) {
        this.G = dA;
        this.M = sW;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        this.G.c();
    }
}

