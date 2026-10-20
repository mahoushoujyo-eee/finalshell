/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wo_1;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JList;

/*
 * Renamed from com.el
 */
class el_2
extends FocusAdapter {
    final JList m;
    final wo_1 U;

    el_2(wo_1 wo_12, JList jList) {
        this.U = wo_12;
        this.m = jList;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.U.C(this.m);
    }
}

