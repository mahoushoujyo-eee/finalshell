/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.Gr
 */
class gr_0
implements ActionListener {
    final _y_0 V;

    gr_0(_y_0 _y_02) {
        this.V = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.V.kD.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

