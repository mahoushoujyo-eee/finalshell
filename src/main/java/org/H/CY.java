/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class CY
extends CB {
    private static final long a;

    public CY(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.N(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8818764331193260635L;
        a = 0xE7BC0BC676A8DA18L ^ l2;
    }
}

