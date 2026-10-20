/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.J;
import com.ov_0;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

/*
 * Renamed from com.C.p
 */
class p_0
extends ContainerAdapter {
    final ov_0 t;
    final J N;

    p_0(J j2, ov_0 ov_02) {
        this.N = j2;
        this.t = ov_02;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.t) {
            this.N.Z();
        }
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.t) {
            this.N.Z();
        }
    }
}

