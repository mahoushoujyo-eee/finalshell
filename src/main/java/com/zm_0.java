/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.te_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zm
 */
public final class zm_0
extends ra_1 {
    public zm_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new te_0(this.l, colorModel, colorModel2);
    }
}

