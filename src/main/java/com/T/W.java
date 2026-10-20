/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.L;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

class W
extends JComponent {
    final L H;

    W(L l2) {
        this.H = l2;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        Shape shape = graphics2D.getClip();
        Area area = new Area(new Rectangle2D.Double(2.0, 2.0, this.getWidth() - 4, this.getHeight() - 4));
        area.intersect(new Area(shape));
        graphics2D.setClip(area);
        graphics2D.drawImage((Image)L.d(this.H), 2, 2, null);
        graphics2D.drawImage(L.m.getImage(), L.H((L)this.H).x - L.m.getIconWidth() / 2, L.H((L)this.H).y - L.m.getIconHeight() / 2, L.m.getImageObserver());
        graphics2D.setClip(shape);
    }
}

