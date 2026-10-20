/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.T.a;
import org.V.N;
import org.V.X;
import org.V.f;

/*
 * Renamed from org.V.z
 */
class z_0
implements a {
    static final boolean m;
    final String C;
    final boolean B;
    final X M;
    private static final long a;

    z_0(X x10, String string, boolean bl) {
        this.M = x10;
        this.C = string;
        this.B = bl;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean k(@c Object var1_1) {
        var3_2 = (N)var1_1;
        var2_3 = f.h();
        if (!z_0.m) {
            v0 = var3_2;
            if (var2_3 == null) {
                if (v0 == null) {
                    throw new AssertionError();
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var3_2;
        }
        var4_4 = v0.o();
        var5_5 = this.C.length();
        v1 = var4_4.startsWith(this.C);
        if (var2_3 == null) {
            if (v1 == 0) return (boolean)0;
            v1 = this.B;
        }
        if (var2_3 != null) return (boolean)v1;
        if (v1 != 0) return (boolean)1;
        v1 = var4_4.indexOf((int)z_0.a, var5_5);
        if (var2_3 != null) return (boolean)v1;
        if (v1 != -1) return (boolean)0;
        return (boolean)1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3631307813545587705L;
        a = 0xF5D4868A887C33D6L ^ l2;
        m = !X.class.desiredAssertionStatus();
    }
}

