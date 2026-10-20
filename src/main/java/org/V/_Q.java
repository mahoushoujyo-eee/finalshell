/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Set;
import org.h.k_0;
import org.v.NQ;
import org.v.RG;
import org.v.RX;
import org.v.rq_0;

class _Q
extends k_0 {
    final Set h;
    final Set V;

    _Q(Set set, Set set2) {
        this.h = set;
        this.V = set2;
    }

    @Override
    public void b(RX rX) {
        block2: {
            rq_0[] rq_0Array = rX.p;
            int n10 = rq_0Array.length;
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < n10; ++i2) {
                rq_0 rq_02 = rq_0Array[i2];
                this.h.add(rq_02.S);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block2;
            }
            super.b(rX);
        }
    }

    @Override
    public void w(NQ nQ2) {
        boolean bl;
        String[] stringArray;
        block4: {
            stringArray = RG.C();
            for (int i2 = 0; i2 < nQ2.z.length; ++i2) {
                bl = Character.isUpperCase(nQ2.z[i2].charAt(0));
                if (stringArray != null) {
                    if (!bl) continue;
                    return;
                }
                break block4;
            }
            bl = this.h.contains(nQ2.z[0]);
        }
        if (stringArray != null) {
            if (bl) {
                return;
            }
            bl = this.V.add(nQ2.z[0]);
        }
    }
}

