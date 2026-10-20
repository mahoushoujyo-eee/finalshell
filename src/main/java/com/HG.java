/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ds_0;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class HG
extends MouseAdapter {
    protected Component A;
    protected boolean B = false;
    protected Component V = null;
    protected Point k = null;
    protected Rectangle C = null;

    public static void Y(Component component) {
        HG.X(component, null);
    }

    public static void X(Component component, Component component2) {
        HG hG2 = new HG(component2);
        component.addMouseListener(hG2);
        component.addMouseMotionListener(hG2);
    }

    public HG() {
        this(null);
    }

    public HG(Component component) {
        this.A = component;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            Rectangle rectangle;
            block7: {
                Rectangle rectangle2;
                HG hG2;
                int[] nArray;
                block6: {
                    block4: {
                        nArray = ds_0.U();
                        if (nArray != null) break block4;
                        if (!SwingUtilities.isLeftMouseButton(mouseEvent)) break block5;
                        this.V = this.T(mouseEvent);
                    }
                    hG2 = this;
                    if (nArray != null) break block6;
                    if (hG2.V == null) break block5;
                    hG2 = this;
                }
                rectangle = rectangle2 = hG2.V(mouseEvent);
                if (nArray != null) break block7;
                if (rectangle == null) break block5;
                rectangle = rectangle2;
            }
            if (rectangle.contains(mouseEvent.getPoint())) {
                this.B = true;
                this.k = MouseInfo.getPointerInfo().getLocation();
                this.C = this.V.getBounds();
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (this.B) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            this.V.setLocation(this.C.x + (point.x - this.k.x), this.C.y + (point.y - this.k.y));
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.B = false;
        this.V = null;
        this.k = null;
        this.C = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Component T(MouseEvent mouseEvent) {
        Component component;
        int[] nArray = ds_0.U();
        HG hG2 = this;
        if (nArray == null) {
            if (hG2.A == null) {
                component = FN.L(mouseEvent.getComponent());
                return component;
            }
            hG2 = this;
        }
        component = hG2.A;
        return component;
    }

    protected Rectangle V(MouseEvent mouseEvent) {
        return FN.N(mouseEvent.getComponent());
    }
}

