/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NK;

public class NA
extends NK {
    private static final long c;

    @Override
    public int u() {
        return (int)c;
    }

    @Override
    public boolean Y() {
        return super.Y();
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        super.X(byArray, n10, n11, byArray2, n12);
    }

    @Override
    public void z(int n10, byte[] byArray, byte[] byArray2) throws Exception {
        super.z(n10, byArray, byArray2);
    }

    @Override
    public int w() {
        return super.w();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7434961174042023711L;
        c = 0x33A738F3B198970FL ^ l2;
    }
}

