/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.I;
import com.ki_2;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class C
extends ContainerAdapter {
    final ki_2 K;
    final I z;

    C(I i2, ki_2 ki_22) {
        this.z = i2;
        this.K = ki_22;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.K) {
            this.z.Z();
        }
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        if (containerEvent.getChild() != this.K) {
            this.z.Z();
        }
    }
}

