/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.tm_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.rW
 */
public final class rw_1
extends ra_1 {
    public rw_1(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new tm_0(this.l, colorModel, colorModel2);
    }
}

