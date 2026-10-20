/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.qq_0;
import java.awt.Dimension;

class KU
extends KD {
    final KD h;
    final qq_0 J;

    KU(qq_0 qq_02, KD kD) {
        this.J = qq_02;
        this.h = kD;
    }

    @Override
    public Dimension getPreferredSize() {
        return this.h.getSize();
    }
}

