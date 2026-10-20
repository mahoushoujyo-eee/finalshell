/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RV;
import com.fm_0;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.Icon;

/*
 * Renamed from com.ez
 */
public class ez_2
implements Icon {
    final fm_0 X;

    protected ez_2(fm_0 fm_02) {
        this.X = fm_02;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        this.X.i = new Rectangle(n10, n11, this.X.r, this.X.v);
        Graphics2D graphics2D = (Graphics2D)graphics;
        Object object = RV.X(graphics2D);
        this.X.r(graphics2D, n10, n11);
        RV.X(graphics2D, object);
    }

    @Override
    public int getIconWidth() {
        return this.X.H();
    }

    @Override
    public int getIconHeight() {
        return this.X.R();
    }
}

