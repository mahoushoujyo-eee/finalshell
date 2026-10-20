/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T6;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.ro
 */
public final class ro_2
extends ra_1 {
    public ro_2(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new T6(this.l, colorModel, colorModel2);
    }
}

