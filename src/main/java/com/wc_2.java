/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IH;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.wc
 */
class wc_2
extends FocusAdapter {
    final IH l;

    wc_2(IH iH) {
        this.l = iH;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.l.M();
    }
}

