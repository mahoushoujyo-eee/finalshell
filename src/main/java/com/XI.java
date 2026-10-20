/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YP;
import com.et_0;
import java.util.concurrent.TimeUnit;

public final class XI {
    public static final XI x;
    private final boolean J;
    private final long c;
    private final YP H;

    public XI(boolean bl, long l2, YP yP) {
        this.J = bl;
        this.c = l2;
        this.H = yP;
    }

    public boolean d() {
        return this.J;
    }

    public long h() {
        return this.c;
    }

    public YP H() {
        return this.H;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5895333650169459010L;
        long l3 = 0xA5DCCF8D52C1F14AL ^ l2;
        long l4 = 8923010751736803847L;
        long l5 = 0x7BD4E700A8437263L ^ l4;
        x = new XI(true, TimeUnit.MILLISECONDS.toNanos(l5), new YP(new et_0((int)l3), null));
    }
}

