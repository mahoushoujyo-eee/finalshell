/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.ds_0;
import com.rt_0;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.Wy
 */
class wy_0
extends ComponentAdapter {
    final Component B;
    final E G;
    final rt_0 t;
    final ds_0 m;

    wy_0(ds_0 ds_02, Component component, E e2, rt_0 rt_02) {
        this.m = ds_02;
        this.B = component;
        this.G = e2;
        this.t = rt_02;
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        block3: {
            ds_0 ds_02;
            block2: {
                int[] nArray = ds_0.U();
                ds_02 = this.m;
                if (nArray != null) break block2;
                if (!ds_02.r) break block3;
                ds_02 = this.m;
            }
            ds_02.F(this.B, this.G);
            this.t.s();
        }
    }
}

