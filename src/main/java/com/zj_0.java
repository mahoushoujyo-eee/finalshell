/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TB;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zj
 */
public final class zj_0
extends ra_1 {
    public zj_0(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new TB(this.l, colorModel, colorModel2);
    }
}

