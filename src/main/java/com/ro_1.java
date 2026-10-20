/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.xn_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.rO
 */
public final class ro_1
extends ra_1 {
    public ro_1(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new xn_0(this.l, colorModel, colorModel2);
    }
}

