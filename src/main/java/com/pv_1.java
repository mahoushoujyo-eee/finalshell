/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KV;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.pV
 */
class pv_1
extends FocusAdapter {
    final KV n;

    pv_1(KV kV) {
        this.n = kV;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        KV.q(this.n).repaint();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        KV.C(this.n).repaint();
    }
}

