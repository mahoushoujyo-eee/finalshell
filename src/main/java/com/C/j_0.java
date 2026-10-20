/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.r_0;
import java.awt.Dimension;
import javax.swing.JComponent;

/*
 * Renamed from com.c.J
 */
class j_0
extends JComponent {
    final r_0 U;

    j_0(r_0 r_02) {
        this.U = r_02;
        this.setOpaque(false);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(4 + this.U.X, 0);
    }
}

