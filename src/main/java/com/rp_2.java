/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.on_0;
import com.r7_0;
import java.util.Comparator;

/*
 * Renamed from com.rp
 */
public abstract class rp_2
implements r7_0 {
    protected Comparator F = null;
    protected on_0 m = null;

    @Override
    public Comparator H(cb_1 cb_12) {
        return this.F;
    }

    public void L(Comparator comparator) {
        this.F = comparator;
    }

    @Override
    public on_0 h(cb_1 cb_12) {
        return this.m;
    }

    public void P(on_0 on_02) {
        this.m = on_02;
    }

    @Override
    public boolean y(cb_1 cb_12) {
        return false;
    }
}

