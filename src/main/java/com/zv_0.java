/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TS;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zv
 */
public final class zv_0
extends ra_1 {
    public zv_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TS(this.l, colorModel, colorModel2);
    }
}

