/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Renamed from com.Z.c
 */
class c_0
implements ListSelectionListener {
    final T D;

    c_0(T t2) {
        this.D = t2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        this.D.f();
    }
}

