/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class GD
extends AbstractAction {
    final pa_1 T;

    GD(pa_1 pa_12, String string) {
        this.T = pa_12;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.T.n();
    }
}

