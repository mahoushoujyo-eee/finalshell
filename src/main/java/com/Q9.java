/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Q9
extends AbstractAction {
    final pa_1 k;

    Q9(pa_1 pa_12, String string) {
        this.k = pa_12;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.k.v();
    }
}

