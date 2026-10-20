/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.tt_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.rM
 */
public final class rm_1
extends ra_1 {
    public rm_1(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new tt_0(this.l, colorModel, colorModel2);
    }
}

