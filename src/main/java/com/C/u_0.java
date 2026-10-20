/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.r_0;
import java.awt.Dimension;
import javax.swing.JComponent;

/*
 * Renamed from com.c.U
 */
class u_0
extends JComponent {
    final r_0 R;

    u_0(r_0 r_02) {
        this.R = r_02;
        this.setOpaque(false);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(0, 4 + this.R.X);
    }
}

