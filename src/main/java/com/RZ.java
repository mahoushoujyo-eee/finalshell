/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ds_0;
import com.rt_0;
import java.awt.Window;

class RZ
extends rt_0 {
    final ds_0 U;

    RZ(ds_0 ds_02, Window window, Window window2) {
        this.U = ds_02;
        super(window, window2);
    }

    @Override
    public boolean P() {
        int[] nArray = ds_0.U();
        boolean bl = this.U.r;
        if (nArray == null) {
            bl = !bl;
        }
        return bl;
    }
}

