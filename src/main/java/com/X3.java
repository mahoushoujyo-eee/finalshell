/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ig_0;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class X3
extends FocusAdapter {
    final ig_0 Z;

    X3(ig_0 ig_02) {
        this.Z = ig_02;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.Z.M();
    }
}

