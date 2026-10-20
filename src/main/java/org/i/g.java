/*
 * Decompiled with CFR 0.152.
 */
package org.i;

import org.i.M;
import org.i.i_0;

class g
implements i_0 {
    final String r;
    final String y;
    final M c;

    g(M m10, String string, String string2) {
        this.c = m10;
        this.r = string;
        this.y = string2;
    }

    @Override
    public String toString() {
        return M.Q(this.c).B(this.r) + this.y;
    }
}

