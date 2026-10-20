/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import com.pu_2;
import java.util.Date;

class v_
implements pu_2 {
    final lk_2 U;

    v_(lk_2 lk_22) {
        this.U = lk_22;
    }

    @Override
    public void i(Date date) {
        this.U.C();
        this.U.f(true);
        this.U.requestFocusInWindow();
    }
}

