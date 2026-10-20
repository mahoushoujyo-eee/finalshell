/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.m.V;
import com.xs_2;
import javax.swing.JComponent;

/*
 * Renamed from com.rY
 */
public class ry_1
extends V {
    private static final long b;

    public ry_1() {
        this.B = (int)b;
        this.E = false;
        this.m = new xs_2(this);
    }

    static JComponent x(ry_1 ry_12) {
        return ry_12.G;
    }

    static JComponent P(ry_1 ry_12) {
        return ry_12.G;
    }

    static JComponent T(ry_1 ry_12) {
        return ry_12.G;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4379833480484830137L;
        b = 0x8EF52A4C5BA93BBAL ^ l2;
    }
}

