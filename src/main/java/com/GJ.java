/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T5;
import com.X0;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

class GJ
extends FocusAdapter {
    final int W;
    final Component N;
    final JTextField v;
    final T5 S;
    final X0 Y;

    GJ(X0 x02, int n10, Component component, JTextField jTextField, T5 t5) {
        this.Y = x02;
        this.W = n10;
        this.N = component;
        this.v = jTextField;
        this.S = t5;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        X0.k(this.W, this.N, this.v.getText(), this.S);
    }
}

