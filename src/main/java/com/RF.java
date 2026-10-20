/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qj_0;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;

class RF
extends FocusAdapter {
    final Component i;
    final int P;
    final int h;
    final BufferedImage H;
    final qj_0 f;

    RF(qj_0 qj_02, Component component, int n10, int n11, BufferedImage bufferedImage) {
        this.f = qj_02;
        this.i = component;
        this.P = n10;
        this.h = n11;
        this.H = bufferedImage;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.f.removeFocusListener(this);
        this.f.I(this.i, this.P, this.h, this.H);
    }
}

