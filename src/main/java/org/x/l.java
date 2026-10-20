/*
 * Decompiled with CFR 0.152.
 */
package org.x;

import com.ky_2;
import java.util.Comparator;
import org.F.c;
import org.x.O;
import org.x.V;

class l
implements Comparator {
    static final boolean d = !O.class.desiredAssertionStatus();

    l() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int compare(@c Object var1_1, @c Object var2_2) {
        var3_3 = O.f();
        v0 = l.d;
        if (var3_3 != null) {
            if (v0 == 0 && var1_1 == null) {
                throw new AssertionError();
            }
            v0 = l.d;
        }
        if (var3_3 != null) {
            if (v0 == 0) {
                v1 = var2_2;
                if (var3_3 != null) {
                    if (v1 == null) {
                        throw new AssertionError();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var2_2;
            }
            v0 = ((V)v1).F - ((V)var1_1).F;
        }
        if (ky_2.F() != null) {
            O.s("PwyoAb");
        }
        return v0;
    }
}

