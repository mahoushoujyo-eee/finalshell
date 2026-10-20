/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import com.tq_0;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class zL
extends ra_1 {
    public zL(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new tq_0(this.l, colorModel, colorModel2);
    }
}

