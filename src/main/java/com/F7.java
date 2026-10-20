/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.i2_0;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

class F7
extends FY {
    final WeakReference m;

    F7(WeakReference weakReference) {
        this.m = weakReference;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        i2_0.s((JComponent)this.m.get());
    }
}

