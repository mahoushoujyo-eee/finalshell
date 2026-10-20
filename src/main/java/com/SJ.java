/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class SJ
implements ActionListener {
    final _y_0 n;

    SJ(_y_0 _y_02) {
        this.n = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        Object object3;
        boolean bl;
        Object object4;
        int n10 = _y_0.M();
        try {
            object4 = this.n.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bl = (Boolean)object4.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (n10 != 0) {
            bl = !bl;
        }
        boolean bl2 = bl;
        try {
            object3 = this.n.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3.A(bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = this.n.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.A(bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.n.kD.h(this.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.n.T();
    }
}

