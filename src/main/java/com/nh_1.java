/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LM;
import com.ky_2;
import com.ne_2;
import com.rq_2;
import com.sm_0;

/*
 * Renamed from com.nH
 */
public class nh_1
extends ne_2 {
    private boolean G;

    public nh_1() {
        int[] nArray = rq_2.G();
        super(false);
        this.G = false;
        int[] nArray2 = nArray;
        this.n(0);
        this.J(0);
        this.setForeground(sm_0.o);
        this.F(new LM());
        if (ky_2.F() != null) {
            rq_2.O(new int[4]);
        }
    }

    public boolean U() {
        return this.G;
    }

    public void s(boolean bl) {
        this.G = bl;
        this.repaint();
    }
}

