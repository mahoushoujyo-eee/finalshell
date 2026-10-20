/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.po_0;

/*
 * Renamed from com.wY
 */
public class wy_1
implements po_0 {
    private int w;
    private int M;
    private static final long a;

    public wy_1() {
        this((int)a, -1);
    }

    public wy_1(int n10, int n11) {
        this.w = n10;
        this.M = n11;
    }

    public void l(int n10) {
        this.w = n10;
    }

    public int h() {
        return this.w;
    }

    public void V(int n10) {
        this.M = n10;
    }

    public int a() {
        return this.M;
    }

    @Override
    public int D(float f10) {
        return NM.n(NM.X(f10, 0.0f, 1.0f), this.w, this.M);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3868612872042850842L;
        a = 0xE17151CF49E2A1AL ^ l2;
    }
}

