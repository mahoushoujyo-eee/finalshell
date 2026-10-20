/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.H.CB;
import org.h.g_0;

/*
 * Renamed from org.H.Ck
 */
public final class ck_0
extends CB {
    private static final long a;

    public ck_0(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.Z(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5861573777414777302L;
        a = 0x428720926B8D698CL ^ l2;
    }
}

