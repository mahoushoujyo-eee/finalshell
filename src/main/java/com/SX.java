/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SZ;
import com.k4_0;
import java.awt.Component;
import java.awt.Dimension;

class SX
extends SZ {
    final k4_0 L;

    SX(k4_0 k4_02, Component component, boolean bl) {
        this.L = k4_02;
        super(component, bl);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.height = k4_0.g((k4_0)this.L).getPreferredSize().height;
        return dimension;
    }
}

