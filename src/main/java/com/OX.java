/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;
import com.O_;
import java.awt.Dimension;

class OX
extends O_ {
    final D2 Y;

    OX(D2 d2, String string, int n10, Object[] objectArray) {
        this.Y = d2;
        super(string, n10, objectArray);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width = 0;
        return dimension;
    }
}

