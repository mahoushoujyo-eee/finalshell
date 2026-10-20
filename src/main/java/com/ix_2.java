/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.rn_0;
import com.up_0;
import java.awt.Component;
import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

/*
 * Renamed from com.ix
 */
public abstract class ix_2
implements up_0 {
    protected Point r;
    protected WeakReference W;

    public BufferedImage H(JComponent jComponent, DragSourceDragEvent dragSourceDragEvent) {
        block4: {
            block3: {
                WeakReference weakReference;
                block2: {
                    int n10 = rn_0.Y();
                    weakReference = this.W;
                    if (n10 == 0) break block2;
                    if (weakReference == null) break block3;
                    weakReference = this.W.get();
                }
                if (weakReference == jComponent) break block4;
            }
            Point point = jComponent.getLocationOnScreen();
            Point point2 = dragSourceDragEvent.getLocation();
            this.r = new Point(point.x - point2.x, point.y - point2.y);
            this.W = new WeakReference<JComponent>(jComponent);
        }
        return FN.p((Component)jComponent, this.J());
    }

    public float J() {
        return 0.8f;
    }

    public Point f(JComponent jComponent, DragSourceDragEvent dragSourceDragEvent) {
        return this.r;
    }

    public void v(JComponent jComponent, DragSourceDropEvent dragSourceDropEvent) {
        this.r = null;
        this.W = null;
    }

    @Override
    public void v(Object object, DragSourceDropEvent dragSourceDropEvent) {
        this.v((JComponent)object, dragSourceDropEvent);
    }

    @Override
    public Point e(Object object, DragSourceDragEvent dragSourceDragEvent) {
        return this.f((JComponent)object, dragSourceDragEvent);
    }

    @Override
    public BufferedImage u(Object object, DragSourceDragEvent dragSourceDragEvent) {
        return this.H((JComponent)object, dragSourceDragEvent);
    }
}

