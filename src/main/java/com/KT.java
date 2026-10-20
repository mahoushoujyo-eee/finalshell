/*
 * Decompiled with CFR 0.152.
 */
package com;

import javax.swing.JTextField;

class KT
implements Runnable {
    final JTextField[] H;

    KT(JTextField[] jTextFieldArray) {
        this.H = jTextFieldArray;
    }

    @Override
    public void run() {
        this.H[0].requestFocus();
    }
}

