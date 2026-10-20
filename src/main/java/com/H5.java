/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.a0;
import com.ph_2;
import com.yn_2;

class H5
implements a0 {
    public static final H5 E = new H5();

    H5() {
    }

    public Integer T(ph_2 ph_22, Object object, Object object2) {
        return ph_22.T(object2);
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        Object object = yn_22.M();
        kE.t = ph_22.T(object);
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        return this.T(ph_22, object, object2);
    }
}

