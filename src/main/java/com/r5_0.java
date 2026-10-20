/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TG;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.r5
 */
public final class r5_0
extends ra_1 {
    public r5_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TG(this.l, colorModel, colorModel2);
    }
}

