/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pc_0;

public interface aB {
    public boolean M(byte[] var1) throws pc_0;

    public byte[] u();

    public byte[] v(byte[] var1);

    default public byte[] l(byte[] byArray, String string) {
        return this.v(byArray);
    }

    @Deprecated
    public boolean j();

    public String B();

    public String b();

    public boolean f();

    public void v();
}

