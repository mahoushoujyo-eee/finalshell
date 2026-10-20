/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.tx_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zt
 */
public final class zt_0
extends ra_1 {
    public zt_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new tx_0(this.l, colorModel, colorModel2);
    }
}

