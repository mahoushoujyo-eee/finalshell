/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Set;
import org.h.k_0;
import org.v.NQ;
import org.v.RG;

/*
 * Renamed from org.v._x
 */
class _x_0
extends k_0 {
    final Set e;

    _x_0(Set set) {
        this.e = set;
    }

    @Override
    public void w(NQ nQ2) {
        block4: {
            boolean bl;
            String[] stringArray = nQ2.z;
            int n10 = stringArray.length;
            String[] stringArray2 = RG.C();
            int n11 = 0;
            while (n11 < n10) {
                String string = stringArray[n11];
                if (stringArray2 != null) {
                    bl = Character.isUpperCase(string.charAt(0));
                    if (stringArray2 == null) break block4;
                    if (bl) {
                        return;
                    }
                    ++n11;
                }
                if (stringArray2 != null) continue;
            }
            bl = this.e.add(nQ2.z[0]);
        }
    }
}

