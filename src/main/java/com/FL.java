/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import com.wc_0;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

class FL
implements wc_0 {
    final JComponent J;

    FL(JComponent jComponent) {
        this.J = jComponent;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ac_0.p(this.J);
    }
}

