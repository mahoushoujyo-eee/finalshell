/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X1;
import javax.swing.JProgressBar;

class I2
implements Runnable {
    final JProgressBar q;
    final X1 R;

    I2(X1 x12, JProgressBar jProgressBar) {
        this.R = x12;
        this.q = jProgressBar;
    }

    @Override
    public void run() {
        this.q.repaint();
    }
}

