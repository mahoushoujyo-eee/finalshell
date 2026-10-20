/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c;
import com.pa_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.Lt
 */
class lt_0
implements ActionListener {
    final pa_1 u;

    lt_0(pa_1 pa_12) {
        this.u = pa_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ox_2 ox_22;
        try {
            ox_22 = (ox_2)U.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ox_2 ox_23 = ox_22;
        try {
            ox_23.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

