/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.pD
 */
public interface pd_1 {
    @Deprecated
    public void J(byte[] var1);

    @Deprecated
    public void D(String var1);

    default public void L(byte[] byArray, boolean bl) {
        this.J(byArray);
    }

    default public void s(String string, boolean bl) {
        this.D(string);
    }
}

