/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PQ;
import com.WF;
import com.yi_0;
import java.awt.Rectangle;
import javax.swing.JComponent;

public abstract class Y8
extends yi_0 {
    public Rectangle s(PQ pQ, Object object, int n10, int n11, boolean bl) {
        Rectangle rectangle = pQ.getCellRect(n10, n11, false);
        return rectangle.intersection(pQ.getVisibleRect());
    }

    public WF K(PQ pQ, Object object, int n10, int n11, boolean bl) {
        return WF.down;
    }

    protected Object n(PQ pQ, int n10, int n11) {
        return pQ.getValueAt(n10, n11);
    }

    protected boolean H(PQ pQ, int n10, int n11) {
        return pQ.isCellSelected(n10, n11);
    }

    @Override
    protected boolean M(JComponent jComponent, int n10, int n11) {
        return this.H((PQ)jComponent, n10, n11);
    }

    @Override
    protected Object c(JComponent jComponent, int n10, int n11) {
        return this.n((PQ)jComponent, n10, n11);
    }

    @Override
    public WF h(JComponent jComponent, Object object, int n10, int n11, boolean bl) {
        return this.K((PQ)jComponent, object, n10, n11, bl);
    }

    @Override
    public Rectangle E(JComponent jComponent, Object object, int n10, int n11, boolean bl) {
        return this.s((PQ)jComponent, object, n10, n11, bl);
    }
}

