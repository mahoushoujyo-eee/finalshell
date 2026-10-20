/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.ListIterator;
import org.l.j;

public class Y
extends j {
    public Y(ListIterator listIterator) {
        super(listIterator);
    }

    @Override
    public boolean hasNext() {
        return super.hasPrevious();
    }

    @Override
    public boolean hasPrevious() {
        return super.hasNext();
    }

    @Override
    public Object next() {
        return super.previous();
    }

    @Override
    public Object previous() {
        return super.next();
    }

    @Override
    public int nextIndex() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int previousIndex() {
        throw new UnsupportedOperationException();
    }
}

