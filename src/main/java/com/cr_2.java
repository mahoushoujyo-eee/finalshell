/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import com.qe_0;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/*
 * Renamed from com.cr
 */
class cr_2
implements PopupMenuListener {
    final qe_0 R;
    final kz_2 m;

    cr_2(kz_2 kz_22, qe_0 qe_02) {
        this.m = kz_22;
        this.R = qe_02;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        this.R.setSelected(false);
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        this.R.setSelected(false);
    }
}

