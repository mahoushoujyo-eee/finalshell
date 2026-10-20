/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.ListIterator;
import org.F.c;

public abstract class j
implements ListIterator {
    protected final ListIterator r;

    public j(ListIterator listIterator) {
        this.r = listIterator;
    }

    @Override
    public boolean hasNext() {
        return this.r.hasNext();
    }

    @Override
    public Object next() {
        return this.r.next();
    }

    @Override
    public boolean hasPrevious() {
        return this.r.hasPrevious();
    }

    public Object previous() {
        return this.r.previous();
    }

    @Override
    public int nextIndex() {
        return this.r.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.r.previousIndex();
    }

    @Override
    public void remove() {
        this.r.remove();
    }

    public void set(@c Object object) {
        this.r.set(object);
    }

    public void add(@c Object object) {
        this.r.add(object);
    }
}

