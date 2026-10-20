/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hl_0;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*
 * Renamed from com.Li
 */
class li_0
implements FocusListener {
    final hl_0 O;

    li_0(hl_0 hl_02) {
        this.O = hl_02;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        hl_0.s(this.O).repaint();
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        hl_0.s(this.O).repaint();
    }
}

