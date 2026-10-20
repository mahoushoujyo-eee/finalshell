/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._4;
import org.v._w_0;

public abstract class NR
extends NV {
    private static boolean v;

    protected NR(I i2) {
        super(i2);
    }

    @Override
    @c
    public NR v() {
        return this;
    }

    @c
    public abstract Object W(_4 var1) throws Throwable;

    @Override
    @c
    public final Object i(_w_0 _w_02) throws Throwable {
        return _w_02.d(this);
    }

    public static void S(boolean bl) {
        v = bl;
    }

    public static boolean k() {
        return v;
    }

    public static boolean Q() {
        boolean bl = NR.k();
        return !bl;
    }

    static {
        if (NR.k()) {
            NR.S(true);
        }
    }
}

