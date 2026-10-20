/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.util.Map;

class NI
implements Map.Entry {
    final Object V;
    Object u;
    NI N;
    final int m;

    NI(int n10, Object object, Object object2, NI nI2) {
        this.u = object2;
        this.N = nI2;
        this.V = object;
        this.m = n10;
    }

    public final Object getKey() {
        return this.V;
    }

    public final Object getValue() {
        return this.u;
    }

    public final Object setValue(Object object) {
        Object object2 = this.u;
        this.u = object;
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        int n10 = ph_0.w();
        Object object2 = object;
        if (n10 != 0) {
            if (!(object2 instanceof Map.Entry)) {
                return false;
            }
            object2 = object;
        }
        Map.Entry entry = (Map.Entry)object2;
        Object object3 = this.getKey();
        Object k2 = entry.getKey();
        Object object4 = object3;
        if (n10 != 0) {
            if (object4 != k2) {
                Object object5 = object3;
                if (n10 != 0) {
                    if (object5 == null) return false;
                    object5 = object3;
                }
                boolean bl = object5.equals(k2);
                if (n10 == 0) return bl;
                if (!bl) return false;
            }
            object4 = this.getValue();
        }
        Object object6 = object4;
        Object v2 = entry.getValue();
        Object object7 = object6;
        if (n10 != 0) {
            if (object7 == v2) return true;
            object7 = object6;
        }
        if (n10 != 0) {
            if (object7 == null) return false;
            object7 = object6;
        }
        boolean bl = object7.equals(v2);
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int hashCode() {
        var1_1 = ph_0.w();
        v0 = this.V;
        if (var1_1 == 0) ** GOTO lbl8
        if (v0 == null) {
            v1 = 0;
        } else {
            v0 = this.V;
lbl8:
            // 2 sources

            v1 = v0.hashCode();
        }
        v2 = this.u;
        if (var1_1 == 0) ** GOTO lbl15
        if (v2 == null) {
            v3 = 0;
        } else {
            v2 = this.u;
lbl15:
            // 2 sources

            v3 = v2.hashCode();
        }
        return v1 ^ v3;
    }

    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

