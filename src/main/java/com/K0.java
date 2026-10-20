/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lz_1;
import java.lang.ref.SoftReference;
import java.util.Map;

class K0
implements Map.Entry {
    final Map.Entry x;
    final Object W;
    final lz_1 G;

    K0(lz_1 lz_12, Map.Entry entry, Object object) {
        this.G = lz_12;
        this.x = entry;
        this.W = object;
    }

    public Object getKey() {
        return this.x.getKey();
    }

    public Object getValue() {
        return this.W;
    }

    public Object setValue(Object object) {
        this.x.setValue(new SoftReference<Object>(object, lz_1.n(this.G)));
        return this.W;
    }
}

