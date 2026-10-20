/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.X;
import com.KR;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class A
extends ContainerAdapter {
    final KR f;
    final X e;

    A(X x10, KR kR) {
        this.e = x10;
        this.f = kR;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.f) {
            this.e.Z();
        }
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.f) {
            this.e.Z();
        }
    }
}

