/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.FY;
import com.ds_0;
import com.rt_0;
import java.awt.Component;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fa
 */
class fa_0
extends FY {
    final Component o;
    final E T;
    final rt_0 l;
    final ds_0 x;

    fa_0(ds_0 ds_02, Component component, E e2, rt_0 rt_02) {
        this.x = ds_02;
        this.o = component;
        this.T = e2;
        this.l = rt_02;
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        block3: {
            ds_0 ds_02;
            block2: {
                int[] nArray = ds_0.U();
                ds_02 = this.x;
                if (nArray != null) break block2;
                if (!ds_02.r) break block3;
                ds_02 = this.x;
            }
            ds_02.F(this.o, this.T);
            this.l.s();
        }
    }
}

