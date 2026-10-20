/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.c;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class N
implements PopupMenuListener {
    final c q;

    N(c c2) {
        this.q = c2;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
        this.q.Z.S.setIcon(this.q.Z.G);
        c.O(this.q).repaint();
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        this.q.Z.S.setIcon(this.q.Z.r);
        c.C(this.q).repaint();
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        this.q.Z.S.setIcon(this.q.Z.r);
    }
}

