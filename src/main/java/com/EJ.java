/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.w6_0;
import com.wc_0;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

class EJ
implements wc_0 {
    final JComponent O;

    EJ(JComponent jComponent) {
        this.O = jComponent;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        w6_0.g((Component)this.O);
    }
}

