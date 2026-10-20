/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class C1
extends CB {
    private static final long a;

    public C1(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.Y(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7571045044208224088L;
        a = 0x2B8B75BCC683470BL ^ l2;
    }
}

