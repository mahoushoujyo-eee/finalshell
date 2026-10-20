/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import org.F.c;
import org.h.cr_0;
import org.h.k_0;
import org.v.M;
import org.v.NJ;
import org.v.NV;
import org.v.fo_0;

class CT
implements fo_0 {
    final k_0 r;

    CT(k_0 k_02) {
        this.r = k_02;
    }

    @c
    public Void R(NJ nJ2) throws Throwable {
        M[] mArray = nJ2.n;
        ky_2[] ky_2Array = cr_0.q();
        for (M m10 : mArray) {
            this.r.c(m10);
            if (ky_2Array == null) continue;
        }
        return null;
    }

    @c
    public Void B(NV nV2) throws Throwable {
        this.r.d(nV2);
        return null;
    }

    @Override
    @c
    public Object q(NV nV2) throws Throwable {
        return this.B(nV2);
    }

    @Override
    @c
    public Object u(NJ nJ2) throws Throwable {
        return this.R(nJ2);
    }
}

