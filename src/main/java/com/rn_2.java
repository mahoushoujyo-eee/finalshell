/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TZ;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.rn
 */
public final class rn_2
extends ra_1 {
    public rn_2(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TZ(this.l, colorModel, colorModel2);
    }
}

