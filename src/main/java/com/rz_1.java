/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ne_2;
import com.rt_2;
import com.xo_1;
import javax.swing.JComponent;

/*
 * Renamed from com.rZ
 */
public class rz_1
extends rt_2 {
    private static final long b;

    public rz_1() {
        this.B = (int)b;
        this.G = new ne_2(false);
        ((ne_2)this.G).n(2);
        ((ne_2)this.G).d(0, 4, 0, 0);
        this.m = new xo_1(this);
        ((ne_2)this.G).addActionListener(this.m);
    }

    static JComponent c(rz_1 rz_12) {
        return rz_12.G;
    }

    static JComponent n(rz_1 rz_12) {
        return rz_12.G;
    }

    static JComponent k(rz_1 rz_12) {
        return rz_12.G;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8971727819365104725L;
        b = 0xE253B89ADEBF3C56L ^ l2;
    }
}

