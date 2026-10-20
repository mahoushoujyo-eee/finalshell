/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;

public abstract class O
implements Iterator {
    private final Iterator r;

    public O(Iterator iterator) {
        this.r = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.r.hasNext();
    }

    public final Object next() {
        return this.w(this.r.next());
    }

    @Override
    public void remove() {
        this.r.remove();
    }

    protected abstract Object w(Object var1);
}

