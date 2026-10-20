/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OG;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.Os
 */
class os_0
extends FocusAdapter {
    final OG I;

    os_0(OG oG) {
        this.I = oG;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.I.repaint();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.I.repaint();
    }
}

