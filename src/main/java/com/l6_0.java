/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xw_1;
import com.zK;
import java.awt.Component;
import javax.swing.JPanel;

/*
 * Renamed from com.l6
 */
class l6_0
extends JPanel {
    final xw_1 G;

    private l6_0(xw_1 xw_12) {
        this.G = xw_12;
    }

    public void o(Component component) {
        xw_1.w(this.G).removeAll();
        xw_1.w(this.G).add(component);
        xw_1.w(this.G).validate();
        xw_1.w(this.G).repaint();
    }

    l6_0(xw_1 xw_12, zK zK2) {
        this(xw_12);
    }
}

