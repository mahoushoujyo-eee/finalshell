/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.tg_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class zG
extends ra_1 {
    public zG(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new tg_0(this.l, colorModel, colorModel2);
    }
}

