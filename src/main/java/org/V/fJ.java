/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.v.B;
import org.v.f9;
import org.v.fL;

class fJ
extends f9
implements fL {
    fJ(B b2) {
        B b3 = b2;
        Objects.requireNonNull(b3);
        super(b3);
    }

    @Override
    public void K() {
        int n10 = this.E % 4;
        if (n10 != 0) {
            B b2 = this.J();
            b2.j(this);
            b2.c(4 - n10);
            b2.Y();
        }
    }
}

