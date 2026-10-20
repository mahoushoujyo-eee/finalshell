/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.QX;
import java.awt.Component;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fi
 */
class fi_0
extends FY {
    final Component Z;
    final int H;
    final int j;
    final int E;
    final int m;
    final QX d;

    fi_0(QX qX, Component component, int n10, int n11, int n12, int n13) {
        this.d = qX;
        this.Z = component;
        this.H = n10;
        this.j = n11;
        this.E = n12;
        this.m = n13;
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.d.k(this.Z, this.H, this.j, this.E, this.m);
    }
}

