/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ic_0;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.aq
 */
class aq_0
extends FocusAdapter {
    final ic_0 S;

    aq_0(ic_0 ic_02) {
        this.S = ic_02;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        ic_0.w(this.S);
    }
}

