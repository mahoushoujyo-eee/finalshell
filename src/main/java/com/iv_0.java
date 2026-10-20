/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oi_2;
import com.xy_2;
import java.util.AbstractCollection;
import java.util.Iterator;

/*
 * Renamed from com.Iv
 */
final class iv_0
extends AbstractCollection {
    final xy_2 w;

    private iv_0(xy_2 xy_22) {
        this.w = xy_22;
    }

    @Override
    public Iterator iterator() {
        return this.w.P();
    }

    @Override
    public int size() {
        return this.w.t;
    }

    @Override
    public boolean contains(Object object) {
        return this.w.containsValue(object);
    }

    @Override
    public void clear() {
        this.w.clear();
    }

    iv_0(xy_2 xy_22, oi_2 oi_22) {
        this(xy_22);
    }
}

