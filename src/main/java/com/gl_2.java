/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gt_1;
import com.po_0;
import com.re_2;
import com.x4_0;

/*
 * Renamed from com.gl
 */
public abstract class gl_2
extends gt_1 {
    protected int b = (int)d;
    protected x4_0 F = new re_2();
    protected int W = 1;
    protected po_0 a;
    private static final long d;

    public void Q(int n10) {
        this.W = n10;
    }

    public int l() {
        return this.W;
    }

    public void H(po_0 po_02) {
        this.a = po_02;
    }

    public po_0 v() {
        return this.a;
    }

    public void R(int n10) {
        this.b = n10;
    }

    public int G() {
        return this.b;
    }

    public void t(x4_0 x4_02) {
        this.F = x4_02;
    }

    public x4_0 i() {
        return this.F;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2046934518452718646L;
        d = 0x2EA192A8DDC0C36L ^ l2;
    }
}

