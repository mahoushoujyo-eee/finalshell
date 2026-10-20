/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cj_2;

class WE
implements Runnable {
    final cj_2 N;

    WE(cj_2 cj_22) {
        this.N = cj_22;
    }

    @Override
    public void run() {
        this.N.U();
    }
}

