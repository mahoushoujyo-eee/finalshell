/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import org.H.CB;
import org.h.g_0;

public final class CS
extends CB {
    private static final long a;

    public CS(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.W(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6531548116721748282L;
        a = 0x6D9B8AEF12924970L ^ l2;
    }
}

