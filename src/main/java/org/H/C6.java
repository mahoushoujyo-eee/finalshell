/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class C6
extends CB {
    private static final long a;

    public C6(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.w(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1896888319613320222L;
        a = 0x22E071E16523BC57L ^ l2;
    }
}

