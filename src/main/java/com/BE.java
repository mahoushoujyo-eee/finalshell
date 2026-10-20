/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D2;
import com.by_0;
import java.awt.Dimension;

class BE
extends by_0 {
    final D2 C;

    BE(D2 d2, int n10, int n11, int n12) {
        this.C = d2;
        super(n10, n11, n12);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        if (D2.b(this.C) > 0) {
            dimension.width = D2.b(this.C);
        }
        return dimension;
    }
}

