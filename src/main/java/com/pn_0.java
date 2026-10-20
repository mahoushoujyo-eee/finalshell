/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k4_0;
import com.kk_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.Pn
 */
class pn_0
extends FocusAdapter {
    final k4_0 N;
    final kk_2 H;

    pn_0(kk_2 kk_22, k4_0 k4_02) {
        this.H = kk_22;
        this.N = k4_02;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        kk_2.L(this.H);
    }
}

