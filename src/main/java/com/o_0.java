/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qq_0;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

/*
 * Renamed from com.o
 */
class o_0
implements HierarchyListener {
    final qq_0 J;

    o_0(qq_0 qq_02) {
        this.J = qq_02;
    }

    @Override
    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        if (hierarchyEvent.getID() == 1) {
            this.J.q(false);
        }
    }
}

