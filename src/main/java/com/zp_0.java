/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TY;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zp
 */
public final class zp_0
extends ra_1 {
    public zp_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TY(this.l, colorModel, colorModel2);
    }
}

