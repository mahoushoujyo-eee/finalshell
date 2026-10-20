/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zM;

class BG
implements Runnable {
    final zM T;

    BG(zM zM2) {
        this.T = zM2;
    }

    @Override
    public void run() {
        this.T.k.repaint();
    }
}

