/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import org.T.a;
import org.l.F;

/*
 * Renamed from org.l.o
 */
class o_0
implements Iterable {
    final Iterable Z;
    final a r;

    o_0(Iterable iterable, a a10) {
        this.Z = iterable;
        this.r = a10;
    }

    public Iterator iterator() {
        return F.e(this.Z.iterator(), this.r);
    }
}

