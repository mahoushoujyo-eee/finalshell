/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class QA
implements PopupMenuListener {
    final kz_2 r;

    QA(kz_2 kz_22) {
        this.r = kz_22;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        this.r.W.setSelected(false);
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        this.r.W.setSelected(false);
    }
}

