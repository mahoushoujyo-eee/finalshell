/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.az_0;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class KX
extends FocusAdapter {
    final az_0 J;

    KX(az_0 az_02) {
        this.J = az_02;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.J.N(focusEvent);
    }
}

