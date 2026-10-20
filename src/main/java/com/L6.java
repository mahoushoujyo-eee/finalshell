/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NI;
import com.oi_2;
import com.ph_0;
import com.xy_2;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class L6
extends AbstractSet {
    final xy_2 E;

    private L6(xy_2 xy_22) {
        this.E = xy_22;
    }

    @Override
    public Iterator iterator() {
        return this.E.O();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(Object object) {
        NI nI2;
        int n10 = ph_0.u();
        Object object2 = object;
        if (n10 == 0) {
            if (!(object2 instanceof Map.Entry)) {
                return false;
            }
            object2 = object;
        }
        Map.Entry entry = (Map.Entry)object2;
        NI nI3 = nI2 = this.E.j(entry.getKey());
        if (n10 == 0) {
            if (nI3 == null) return false;
            nI3 = nI2;
        }
        boolean bl = nI3.equals(entry);
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.E.H(object) != null;
    }

    @Override
    public int size() {
        return this.E.t;
    }

    @Override
    public void clear() {
        this.E.clear();
    }

    L6(xy_2 xy_22, oi_2 oi_22) {
        this(xy_22);
    }
}

