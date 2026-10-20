/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com.j_0;
import java.util.Objects;

/*
 * Renamed from com.ay
 */
public class ay_0 {
    private final int L;
    private final int H;
    private final boolean d;

    public ay_0(XE xE2, boolean bl) {
        this(xE2.q, xE2.r, bl);
    }

    public ay_0(int n10, int n11, boolean bl) {
        this.L = n10;
        this.H = n11;
        this.d = bl;
    }

    public int S() {
        return this.L;
    }

    public int r() {
        return this.H;
    }

    public boolean p() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl = j_0.g();
        Object object2 = this;
        if (bl) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (bl) {
            if (!(object2 instanceof ay_0)) {
                return false;
            }
            object2 = object;
        }
        ay_0 ay_02 = (ay_0)object2;
        int n10 = this.L;
        int n11 = ay_02.L;
        if (bl) {
            if (n10 != n11) return 0 != 0;
            n10 = this.H;
            n11 = ay_02.H;
        }
        if (bl) {
            if (n10 != n11) return 0 != 0;
            n10 = this.d ? 1 : 0;
            if (!bl) return n10 != 0;
            n11 = ay_02.d ? 1 : 0;
        }
        if (n10 != n11) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        return Objects.hash(this.L, this.H, this.d);
    }
}

