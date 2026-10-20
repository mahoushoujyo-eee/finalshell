/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Shape;
import java.awt.Stroke;

/*
 * Renamed from com.Fb
 */
public class fb_0
implements Stroke {
    private Stroke l;
    private Stroke U;

    public fb_0(Stroke stroke, Stroke stroke2) {
        this.l = stroke;
        this.U = stroke2;
    }

    @Override
    public Shape createStrokedShape(Shape shape) {
        return this.U.createStrokedShape(this.l.createStrokedShape(shape));
    }
}

