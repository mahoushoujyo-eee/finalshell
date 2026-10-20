/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ic_0;

class CO
implements Runnable {
    final ic_0 R;

    CO(ic_0 ic_02) {
        this.R = ic_02;
    }

    @Override
    public void run() {
        this.R.L.d.setVisible(false);
    }
}

