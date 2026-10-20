/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import java.io.File;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

class L
implements CellEditorListener {
    final T Q;

    L(T t2) {
        this.Q = t2;
    }

    @Override
    public void editingStopped(ChangeEvent changeEvent) {
        File file = this.Q.hD.S();
        this.Q.T();
        this.Q.hD.D(file);
    }

    @Override
    public void editingCanceled(ChangeEvent changeEvent) {
    }
}

