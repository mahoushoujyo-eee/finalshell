/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Collection;
import org.T.s;
import org.h.cr_0;
import org.v.RG;
import org.v.hH;
import org.v.hO;

class fN
implements hH {
    final Collection F;
    final hO q;

    fN(hO hO2, Collection collection) {
        this.q = hO2;
        this.F = collection;
    }

    @Override
    public void n(cr_0 cr_02) {
        String[] stringArray = RG.C();
        boolean bl = hO.p();
        if (stringArray != null) {
            if (bl) {
                s.K(cr_02.q());
            }
            bl = this.F.add(cr_02);
        }
    }
}

