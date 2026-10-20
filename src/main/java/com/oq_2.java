/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/*
 * Renamed from com.oq
 */
class oq_2
extends AbstractAction {
    final pa_1 B;

    oq_2(pa_1 pa_12, String string) {
        this.B = pa_12;
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.B.y();
    }

    @Override
    public boolean isEnabled() {
        return pa_1.e(this.B) != null;
    }
}

