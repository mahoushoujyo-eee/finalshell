/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TX;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class z_
extends ra_1 {
    public z_(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TX(this.l, colorModel, colorModel2);
    }
}

