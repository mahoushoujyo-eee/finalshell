/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.bq_0;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class GL
implements DocumentListener {
    final bq_0 p;

    GL(bq_0 bq_02) {
        this.p = bq_02;
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        this.g();
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        this.g();
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        this.g();
    }

    private void g() {
        this.p.s();
    }
}

