/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import org.F.c;
import org.T.a;
import org.l.F;

/*
 * Renamed from org.l.d
 */
class d_0
implements a {
    final Class L;

    d_0(Class clazz) {
        this.L = clazz;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean k(@c Object object) {
        boolean bl = F.G();
        if (object == null) return false;
        boolean bl2 = this.L.isAssignableFrom(object.getClass());
        if (bl) return bl2;
        if (!bl2) return false;
        return true;
    }
}

