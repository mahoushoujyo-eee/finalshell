/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E0;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Renamed from com.iS
 */
public class is_1
extends OutputStream {
    E0 A;
    byte[] m = new byte[1];

    is_1(E0 e0) {
        this.A = e0;
    }

    @Override
    public void write(int n10) throws IOException {
        this.m[0] = (byte)n10;
        this.A.a(this.m);
    }

    @Override
    public void write(byte[] byArray, int n10, int n11) throws IOException {
        super.write(byArray, n10, n11);
    }

    @Override
    public void flush() throws IOException {
        this.A.K();
    }
}

