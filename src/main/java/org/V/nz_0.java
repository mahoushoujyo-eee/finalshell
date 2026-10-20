/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;

/*
 * Renamed from org.v.Nz
 */
public final class nz_0
extends NV {
    @c
    final Object A;
    private static final long a;

    public nz_0(I i2) {
        super(i2);
        this.A = null;
    }

    public nz_0(I i2, byte by) {
        super(i2);
        this.A = by;
    }

    public nz_0(I i2, short s2) {
        super(i2);
        this.A = s2;
    }

    public nz_0(I i2, int n10) {
        super(i2);
        this.A = n10;
    }

    public nz_0(I i2, long l2) {
        super(i2);
        this.A = l2;
    }

    public nz_0(I i2, float f10) {
        super(i2);
        this.A = Float.valueOf(f10);
    }

    public nz_0(I i2, double d2) {
        super(i2);
        this.A = d2;
    }

    public nz_0(I i2, char c2) {
        super(i2);
        this.A = Character.valueOf(c2);
    }

    public nz_0(I i2, boolean bl) {
        super(i2);
        this.A = bl;
    }

    public nz_0(I i2, String string) {
        super(i2);
        this.A = string;
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.q(this);
    }

    @Override
    public String toString() {
        return "[" + this.A + (char)a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8268888861291027342L;
        a = 0xD5EB9145E06F9BD3L ^ l2;
    }
}

