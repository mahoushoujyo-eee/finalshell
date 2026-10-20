/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dx_2;
import java.util.Objects;

/*
 * Renamed from com.Px
 */
class px_0 {
    private final int l;
    private final int E;

    public px_0(int n10, int n11) {
        this.l = n10;
        this.E = n11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = dx_2.g();
        Object object2 = this;
        if (string == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (string == null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        px_0 px_02 = (px_0)object3;
        boolean bl = this.l;
        int n10 = px_02.l;
        if (string == null) {
            if (bl != n10) return false;
            bl = this.E;
            if (string != null) return bl;
            n10 = px_02.E;
        }
        if (bl != n10) return false;
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.l, this.E);
    }
}

