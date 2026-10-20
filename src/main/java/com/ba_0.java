/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IE;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.Ba
 */
class ba_0
implements ChangeListener {
    final IE O;

    ba_0(IE iE) {
        this.O = iE;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.O.M();
    }
}

