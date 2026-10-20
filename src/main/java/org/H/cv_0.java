/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.H.CB;
import org.h.g_0;

/*
 * Renamed from org.H.Cv
 */
public final class cv_0
extends CB {
    private static final long a;

    public cv_0(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.k(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5192882919647977860L;
        a = 0x187B0EBD99CFA1C2L ^ l2;
    }
}

