/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NJ;
import com.it_2;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class WD
implements ChangeListener {
    final NJ Z;
    final it_2 T;

    WD(it_2 it_22, NJ nJ2) {
        this.T = it_22;
        this.Z = nJ2;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.Z.R();
    }
}

