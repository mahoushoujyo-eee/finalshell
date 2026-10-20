/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T_;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.rs
 */
public final class rs_2
extends ra_1 {
    public rs_2(float f10) {
        super(f10);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new T_(this.l, colorModel, colorModel2);
    }
}

