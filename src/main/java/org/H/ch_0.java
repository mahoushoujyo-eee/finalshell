/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.H.CB;
import org.h.g_0;

/*
 * Renamed from org.H.Ch
 */
public final class ch_0
extends CB {
    private static final long a;

    public ch_0(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.v(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2488076443709486600L;
        a = 0x3E19F6B3D952364CL ^ l2;
    }
}

