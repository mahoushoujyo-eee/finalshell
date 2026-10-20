/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.ds_0;
import com.rt_0;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class DL
implements PropertyChangeListener {
    final Component m;
    final E a;
    final rt_0 Q;
    final ds_0 D;

    DL(ds_0 ds_02, Component component, E e2, rt_0 rt_02) {
        this.D = ds_02;
        this.m = component;
        this.a = e2;
        this.Q = rt_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.D.F(this.m, this.a);
        this.Q.s();
    }
}

