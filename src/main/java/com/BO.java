/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ir_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class BO
implements ChangeListener {
    final ir_0 i;

    BO(ir_0 ir_02) {
        this.i = ir_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.i.M();
    }
}

