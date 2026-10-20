/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v._D;
import org.v._U;
import org.v.f2;
import org.v.fq_0;
import org.v.fu_0;
import org.v.k_0;
import org.v.nt_0;
import org.v.x_1;

public final class _1
extends _D
implements f2 {
    private static final long f;

    public _1(I i2, @c String string, fu_0[] fu_0Array, String string2, @c _U[] _UArray, @c nt_0 nt_02, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, _UArray, nt_02, nt_0Array);
    }

    @Override
    public String R() {
        x_1 x_12 = this.y();
        String[] stringArray = RG.C();
        while (true) {
            if (x_12 instanceof k_0) {
                if (stringArray == null) continue;
                return ((k_0)x_12).R() + (char)f + this.H;
            }
            x_12 = x_12.y();
        }
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.I(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8852578523461363656L;
        f = 0x34F763AF9D2AA7ECL ^ l2;
    }
}

