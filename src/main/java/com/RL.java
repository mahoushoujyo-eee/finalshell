/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xv_2;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class RL
implements DocumentListener {
    final Runnable z;
    final xv_2 U;

    RL(xv_2 xv_22, Runnable runnable) {
        this.U = xv_22;
        this.z = runnable;
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        this.z.run();
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        this.z.run();
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        this.z.run();
    }
}

