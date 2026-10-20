/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wc_0;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.kL
 */
class kl_1
implements Runnable {
    final wc_0 k;
    final KeyEvent D;

    kl_1(wc_0 wc_02, KeyEvent keyEvent) {
        this.k = wc_02;
        this.D = keyEvent;
    }

    @Override
    public void run() {
        this.k.j(this.D);
    }
}

