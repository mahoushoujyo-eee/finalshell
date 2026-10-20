/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.FY;
import com.QX;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Ff
 */
class ff_0
extends FY {
    final Component G;
    final E g;
    final QX E;

    ff_0(QX qX, Component component, E e2) {
        this.E = qX;
        this.G = component;
        this.g = e2;
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.E.A(this.G, (Rectangle)this.g.J());
    }
}

