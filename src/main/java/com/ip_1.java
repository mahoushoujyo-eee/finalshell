/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PR;
import com.ra_1;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.iP
 */
public final class ip_1
implements Composite {
    private int t;

    public ip_1(int n10) {
        this.t = n10;
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new PR(this.t, colorModel, colorModel2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        String string = ra_1.c();
        boolean bl = object instanceof ip_1;
        if (string == null) {
            if (!bl) {
                return false;
            }
            bl = true;
        }
        return bl;
    }
}

