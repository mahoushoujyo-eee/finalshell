/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Collection;
import org.h.cr_0;
import org.v.hH;
import org.v.h_1;

/*
 * Renamed from org.v.j
 */
class j_1
implements hH {
    final Collection A;
    final h_1 X;

    j_1(h_1 h_12, Collection collection) {
        this.X = h_12;
        this.A = collection;
    }

    @Override
    public void n(cr_0 cr_02) {
        this.A.add(cr_02);
    }
}

