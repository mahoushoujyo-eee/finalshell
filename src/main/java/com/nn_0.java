/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.az_0;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
 * Renamed from com.Nn
 */
class nn_0
extends FocusAdapter {
    final az_0 S;

    nn_0(az_0 az_02) {
        this.S = az_02;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.S.N(focusEvent);
    }
}

