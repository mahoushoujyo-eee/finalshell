/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QH;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*
 * Renamed from com.ot
 */
class ot_2
implements FocusListener {
    final QH u;

    ot_2(QH qH) {
        this.u = qH;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        QH.P(this.u).repaint();
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        QH.P(this.u).repaint();
    }
}

