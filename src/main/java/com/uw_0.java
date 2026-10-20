/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.up_0;
import java.awt.Insets;
import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import java.util.List;

/*
 * Renamed from com.uw
 */
public abstract class uw_0
implements up_0 {
    private static final long a;

    public abstract int w();

    public Insets O() {
        return new Insets(0, 0, 0, 0);
    }

    public BufferedImage v(List list, DragSourceDragEvent dragSourceDragEvent) {
        return null;
    }

    public Point r(List list, DragSourceDragEvent dragSourceDragEvent) {
        return new Point((int)a, 5);
    }

    public void M(List list, DragSourceDropEvent dragSourceDropEvent) {
    }

    @Override
    public void v(Object object, DragSourceDropEvent dragSourceDropEvent) {
        this.M((List)object, dragSourceDropEvent);
    }

    @Override
    public Point e(Object object, DragSourceDragEvent dragSourceDragEvent) {
        return this.r((List)object, dragSourceDragEvent);
    }

    @Override
    public BufferedImage u(Object object, DragSourceDragEvent dragSourceDragEvent) {
        return this.v((List)object, dragSourceDragEvent);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1612977480307702895L;
        a = 0xECDAE4C7F071FC76L ^ l2;
    }
}

