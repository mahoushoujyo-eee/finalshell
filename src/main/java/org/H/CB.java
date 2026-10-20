/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.g_0;
import org.h.m_0;
import org.h.r_0;

public abstract class CB
implements r_0 {
    private final byte J;
    public final short h;

    public CB(byte by, short s2) {
        this.J = by;
        this.h = s2;
    }

    @Override
    public byte s() {
        return this.J;
    }

    @Override
    public void E(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.h);
    }

    @Override
    @c
    public Object d(m_0 m_02) throws Throwable {
        return this.b(m_02);
    }

    @c
    protected abstract Object b(g_0 var1) throws Throwable;
}

