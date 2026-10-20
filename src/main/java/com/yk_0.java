/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Renamed from com.Yk
 */
class yk_0
extends AbstractAction {
    final pa_1 h;

    yk_0(pa_1 pa_12, String string) {
        this.h = pa_12;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.h.r();
    }

    @Override
    public boolean isEnabled() {
        return pa_1.r(this.h) != null;
    }
}

