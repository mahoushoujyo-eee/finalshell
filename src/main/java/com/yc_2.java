/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DA;
import com.SW;
import com.wc_0;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.yc
 */
class yc_2
implements wc_0 {
    final SW C;
    final DA P;

    yc_2(DA dA, SW sW) {
        this.P = dA;
        this.C = sW;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        this.P.Y();
    }
}

