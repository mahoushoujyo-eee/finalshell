/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ip_0;
import com.is_0;

/*
 * Renamed from com.Do
 */
public class do_0
implements ip_0 {
    private is_0 c;
    private byte[] y;
    private int m;

    @Override
    public void Z(byte[] byArray, int n10) throws Exception {
        this.c = new is_0();
        this.y = byArray;
        this.m = n10;
    }

    @Override
    public byte[] m(byte[] byArray, int n10) {
        byte[] byArray2 = new byte[n10];
        this.c.p(byArray, this.y, this.m, byArray2);
        return byArray2;
    }
}

