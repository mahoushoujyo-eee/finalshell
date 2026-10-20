/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NJ;
import com.it_2;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

class TW
implements ContainerListener {
    final NJ S;
    final it_2 R;

    TW(it_2 it_22, NJ nJ2) {
        this.R = it_22;
        this.S = nJ2;
    }

    @Override
    public void componentAdded(ContainerEvent containerEvent) {
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        if (containerEvent.getSource() == this.R.E) {
            this.S.e();
        }
    }
}

