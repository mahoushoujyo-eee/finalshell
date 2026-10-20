/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.a_0;
import com.qx_0;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

/*
 * Renamed from com.C.x
 */
class x_0
extends ContainerAdapter {
    final qx_0 O;
    final a_0 b;

    x_0(a_0 a_02, qx_0 qx_02) {
        this.b = a_02;
        this.O = qx_02;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.O) {
            this.b.Z();
        }
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.O) {
            this.b.Z();
        }
    }
}

