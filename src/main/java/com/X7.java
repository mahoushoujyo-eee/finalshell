/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.QX;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class X7
extends ComponentAdapter {
    final Component i;
    final E q;
    final QX Y;

    X7(QX qX, Component component, E e2) {
        this.Y = qX;
        this.i = component;
        this.q = e2;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.Y.A(this.i, (Rectangle)this.q.J());
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        this.Y.A(this.i, (Rectangle)this.q.J());
    }
}

