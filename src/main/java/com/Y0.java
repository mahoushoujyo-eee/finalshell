/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k2_0;
import com.k3_0;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class Y0
extends ContainerAdapter {
    final boolean w;
    final k2_0 O;

    Y0(k2_0 k2_02, boolean bl) {
        this.O = k2_02;
        this.w = bl;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
        int[] nArray = k3_0.L();
        Y0 y0 = this;
        if (nArray != null) {
            if (y0.w) {
                this.O.L(containerEvent.getComponent());
            }
            y0 = this;
        }
        y0.O.Y();
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        int[] nArray = k3_0.L();
        Y0 y0 = this;
        if (nArray != null) {
            if (y0.w) {
                this.O.q(containerEvent.getComponent());
            }
            y0 = this;
        }
        y0.O.Y();
    }
}

