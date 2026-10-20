/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.m_0;
import org.h.r_0;

public final class C0
implements r_0 {
    public final short M;
    public final short Z;
    private static final long a;

    public C0(short s2, short s3) {
        this.M = s2;
        this.Z = s3;
    }

    @Override
    public byte s() {
        return (byte)((int)a);
    }

    @Override
    public void E(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.M);
        dataOutputStream.writeShort(this.Z);
    }

    @Override
    @c
    public Object d(m_0 m_02) throws Throwable {
        return m_02.P(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1889590547488403747L;
        a = 0xD203474569FB7146L ^ l2;
    }
}

