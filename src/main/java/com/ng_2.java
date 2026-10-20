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
 * Renamed from com.ng
 */
class ng_2
extends ComponentAdapter {
    final Component y;
    final E P;
    final rt_0 q;
    final ds_0 L;

    ng_2(ds_0 ds_02, Component component, E e2, rt_0 rt_02) {
        this.L = ds_02;
        this.y = component;
        this.P = e2;
        this.q = rt_02;
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        block3: {
            ds_0 ds_02;
            block2: {
                int[] nArray = ds_0.U();
                ds_02 = this.L;
                if (nArray != null) break block2;
                if (!ds_02.r) break block3;
                ds_02 = this.L;
            }
            ds_02.F(this.y, this.P);
            this.q.s();
        }
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        block3: {
            ds_0 ds_02;
            block2: {
                int[] nArray = ds_0.U();
                ds_02 = this.L;
                if (nArray != null) break block2;
                if (!ds_02.r) break block3;
                ds_02 = this.L;
            }
            ds_02.F(this.y, this.P);
            this.q.s();
        }
    }
}

