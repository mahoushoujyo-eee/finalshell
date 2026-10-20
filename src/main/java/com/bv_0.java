/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.Bv
 */
class bv_0
implements Runnable {
    final _y_0 R;

    bv_0(_y_0 _y_02) {
        this.R = _y_02;
    }

    @Override
    public void run() {
        try {
            this.R.kD.d(this.R.U);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

