/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.ky_2;
import com.lk_2;
import com.rq_2;
import com.rt_2;
import com.x2_0;
import com.xn_1;
import javax.swing.JComponent;

/*
 * Renamed from com.rS
 */
public class rs_1
extends rt_2 {
    public rs_1() {
        int[] nArray = rq_2.G();
        this.G = new lk_2(false);
        ((lk_2)this.G).N(true);
        ((lk_2)this.G).Z(new xn_1(this));
        KD kD = ((lk_2)this.G).Y();
        kD.s(0);
        int[] nArray2 = nArray;
        kD.O(0);
        kD.E(false, true, false, false);
        this.m = new x2_0(this);
        if (nArray2 == null) {
            ky_2.K(new String[3]);
        }
    }

    static JComponent U(rs_1 rs_12) {
        return rs_12.G;
    }

    static JComponent S(rs_1 rs_12) {
        return rs_12.G;
    }

    static JComponent a(rs_1 rs_12) {
        return rs_12.G;
    }
}

