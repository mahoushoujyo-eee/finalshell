/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.yi_0;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Renamed from com.Yf
 */
public abstract class yf_0
extends yi_0 {
    public Rectangle d(CI cI, Object object, int n10, int n11, boolean bl) {
        Rectangle rectangle = cI.getCellBounds(n10, n10);
        return rectangle.intersection(cI.getVisibleRect());
    }

    protected Object j(CI cI, int n10, int n11) {
        return cI.D(n10);
    }

    protected boolean p(CI cI, int n10, int n11) {
        return cI.isSelectedIndex(n10);
    }

    @Override
    protected boolean M(JComponent jComponent, int n10, int n11) {
        return this.p((CI)jComponent, n10, n11);
    }

    @Override
    protected Object c(JComponent jComponent, int n10, int n11) {
        return this.j((CI)jComponent, n10, n11);
    }

    @Override
    public Rectangle E(JComponent jComponent, Object object, int n10, int n11, boolean bl) {
        return this.d((CI)jComponent, object, n10, n11, bl);
    }
}

