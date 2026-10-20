/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IY;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class i
implements ItemListener {
    final IY o;

    i(IY iY) {
        this.o = iY;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.o.M();
    }
}

