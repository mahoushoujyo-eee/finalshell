/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.SZ;
import com.Z.T;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/*
 * Renamed from com.Z.b
 */
class b_0
extends SZ {
    final T Q;
    private static final long a;

    b_0(T t2, Component component) {
        this.Q = t2;
        super(component);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        JScrollBar jScrollBar = this.getVerticalScrollBar();
        String string = T.v();
        if (string == null) {
            if (jScrollBar != null && jScrollBar.isShowing()) {
                dimension.width += jScrollBar.getPreferredSize().width;
            }
            dimension.height = Math.min(dimension.height, (int)a);
        }
        return dimension;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4507661520906158512L;
        a = 0x7D351BC5494F01D4L ^ l2;
    }
}

