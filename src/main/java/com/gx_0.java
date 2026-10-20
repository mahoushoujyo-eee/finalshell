/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ia_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.Gx
 */
class gx_0
implements ChangeListener {
    final ia_0 M;

    gx_0(ia_0 ia_02) {
        this.M = ia_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.M.M();
    }
}

