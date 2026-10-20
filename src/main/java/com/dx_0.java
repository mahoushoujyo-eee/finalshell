/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k4_0;
import java.awt.Rectangle;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/*
 * Renamed from com.Dx
 */
class dx_0
implements MouseWheelListener {
    final k4_0 a;
    private static final long b;

    dx_0(k4_0 k4_02) {
        this.a = k4_02;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        Rectangle rectangle = k4_0.g(this.a).getVisibleRect();
        k4_0.g(this.a).scrollRectToVisible(new Rectangle(rectangle.x + mouseWheelEvent.getWheelRotation() * (int)b, rectangle.y, rectangle.width, rectangle.height));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5978135476124666634L;
        b = 0x5A42C2FCC1924B13L ^ l2;
    }
}

