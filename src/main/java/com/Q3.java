/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import java.io.File;

class Q3
implements Runnable {
    final File x;
    final kf_1 D;

    Q3(kf_1 kf_12, File file) {
        this.D = kf_12;
        this.x = file;
    }

    @Override
    public void run() {
        this.D.a.removeTreeSelectionListener(this.D.u);
        this.D.a.s(this.D.a.d(this.x));
        this.D.a.addTreeSelectionListener(this.D.u);
    }
}

