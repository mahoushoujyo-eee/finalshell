/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class CU
extends CB {
    private static final long a;

    public CU(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.u(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8217449593850751126L;
        a = 0xD1D86DAD2126E8F5L ^ l2;
    }
}

