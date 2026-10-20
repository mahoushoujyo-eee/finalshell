/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.GO;
import com.RV;
import com.gk_0;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Renamed from com.Qw
 */
public final class qw_0 {
    public static void J() {
        if (DE.K) {
            gk_0.Y();
        }
    }

    public static void j(Graphics graphics) {
        if (DE.K) {
            qw_0.R((Graphics2D)graphics);
        }
    }

    public static void h(Graphics2D graphics2D) {
        if (DE.K) {
            qw_0.R(graphics2D);
        }
    }

    private static void R(Graphics2D graphics2D) {
        double d2 = (float)gk_0.O() / 1000000.0f;
        String string = "" + GO.FU.format(d2);
        Rectangle rectangle = graphics2D.getClip().getBounds();
        Font font = graphics2D.getFont();
        graphics2D.setFont(GO.FF);
        Object object = RV.X(graphics2D);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n10 = fontMetrics.stringWidth(string) + 4;
        int n11 = fontMetrics.getHeight();
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fillRect(rectangle.x + rectangle.width - n10, rectangle.y, n10, n11);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.drawString(string, rectangle.x + rectangle.width - n10 + 2, rectangle.y + n11 - fontMetrics.getDescent());
        RV.X(graphics2D, object);
        graphics2D.setFont(font);
    }

    public static void L(Graphics graphics, JComponent jComponent) {
        qw_0.j(graphics, jComponent, Color.RED);
    }

    public static void j(Graphics graphics, JComponent jComponent, Color color) {
        Insets insets = jComponent.getInsets();
        graphics.setColor(color);
        graphics.drawRect(0, 0, jComponent.getWidth() - 1, jComponent.getHeight() - 1);
        graphics.drawRect(insets.left, insets.top, jComponent.getWidth() - insets.left - insets.right - 1, jComponent.getHeight() - insets.top - insets.bottom - 1);
    }
}

