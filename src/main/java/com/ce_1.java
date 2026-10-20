/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.cE
 */
class ce_1
extends FocusAdapter {
    final nx_2 n;

    ce_1(nx_2 nx_22) {
        this.n = nx_22;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.n.b();
    }
}

