/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import org.H.CB;
import org.h.g_0;

/*
 * Renamed from org.H.Cd
 */
public final class cd_0
extends CB {
    private static final long a;

    public cd_0(short s2) {
        super((byte)a, s2);
    }

    @Override
    protected Object b(g_0 g_02) throws Throwable {
        return g_02.E(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3895693432455012178L;
        a = 0xDFA3A3705B4D9F10L ^ l2;
    }
}

