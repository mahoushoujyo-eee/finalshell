/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qm_0;
import java.awt.Rectangle;

/*
 * Renamed from com.Rj
 */
class rj_0
implements Runnable {
    final Rectangle G;
    final qm_0 V;

    rj_0(qm_0 qm_02, Rectangle rectangle) {
        this.V = qm_02;
        this.G = rectangle;
    }

    @Override
    public void run() {
        this.V.repaint(this.G);
    }
}

