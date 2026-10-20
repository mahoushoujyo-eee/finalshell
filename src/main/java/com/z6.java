/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TQ;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class z6
extends ra_1 {
    public z6(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TQ(this.l, colorModel, colorModel2);
    }
}

