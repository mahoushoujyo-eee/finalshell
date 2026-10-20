/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oi_2;
import com.xy_2;
import java.util.AbstractSet;
import java.util.Iterator;

/*
 * Renamed from com.iv
 */
final class iv_2
extends AbstractSet {
    final xy_2 s;

    private iv_2(xy_2 xy_22) {
        this.s = xy_22;
    }

    @Override
    public Iterator iterator() {
        return this.s.e();
    }

    @Override
    public int size() {
        return this.s.t;
    }

    @Override
    public boolean contains(Object object) {
        return this.s.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.s.O(object) != null;
    }

    @Override
    public void clear() {
        this.s.clear();
    }

    iv_2(xy_2 xy_22, oi_2 oi_22) {
        this(xy_22);
    }
}

