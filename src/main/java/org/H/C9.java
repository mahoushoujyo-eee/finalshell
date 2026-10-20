/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class C9
extends CB {
    private static final long a;

    public C9(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.q(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3455325230573472745L;
        a = 0x7735F01977C6CB9AL ^ l2;
    }
}

