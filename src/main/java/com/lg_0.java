/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c;
import com.pa_1;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.Lg
 */
class lg_0
implements Runnable {
    final pa_1 e;

    lg_0(pa_1 pa_12) {
        this.e = pa_12;
    }

    @Override
    public void run() {
        ff_0 ff_02 = this.e.L.o();
        try {
            ff_02.f(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ff_02.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            ff_02.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

