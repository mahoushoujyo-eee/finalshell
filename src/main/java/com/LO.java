/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LA;
import com.lq_1;
import java.awt.BasicStroke;

public class LO
extends LA {
    private float[] x = lq_1.D;
    private float X = lq_1.M;

    public LO() {
        this.p();
    }

    public LO(float[] fArray) {
        this.k(fArray);
    }

    public LO(float[] fArray, float f10) {
        this.k(fArray);
        this.e(f10);
    }

    public float[] n() {
        return this.x;
    }

    public void k(float[] fArray) {
        this.x = fArray;
        this.p();
        this.l();
    }

    public float S() {
        return this.X;
    }

    public void e(float f10) {
        this.X = f10;
        this.p();
        this.l();
    }

    @Override
    protected void p() {
        this.h = new BasicStroke(this.a(), 1, 1, 0.0f, this.n(), this.S());
    }
}

