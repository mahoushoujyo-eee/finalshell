/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.l.F;
import org.l.R;

public class C
extends AbstractCollection {
    private final Iterator s;
    private final List N = new ArrayList();

    public C(Iterator iterator) {
        this.s = iterator;
    }

    @Override
    public Iterator iterator() {
        return new R(this);
    }

    @Override
    public int size() {
        int n10 = 0;
        Iterator iterator = this.iterator();
        boolean bl = F.G();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            ++n10;
            if (!bl) continue;
        }
        return n10;
    }

    static List K(C c2) {
        return c2.N;
    }

    static Iterator R(C c2) {
        return c2.s;
    }
}

