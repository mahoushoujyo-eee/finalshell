/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import org.l.F;

/*
 * Renamed from org.l.e
 */
class e_0
implements Iterable {
    final Iterable z;
    final Class e;

    e_0(Iterable iterable, Class clazz) {
        this.z = iterable;
        this.e = clazz;
    }

    public Iterator iterator() {
        return F.P(this.z.iterator(), this.e);
    }
}

