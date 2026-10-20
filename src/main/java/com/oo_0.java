/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Renamed from com.Oo
 */
class oo_0
extends AbstractAction {
    final pa_1 C;

    oo_0(pa_1 pa_12, String string) {
        this.C = pa_12;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.C.A(false);
    }

    @Override
    public boolean isEnabled() {
        return pa_1.e(this.C) != null;
    }
}

