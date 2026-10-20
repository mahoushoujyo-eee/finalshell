/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nr_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Wf
 */
class wf_0
implements ActionListener {
    final nr_2 t;

    wf_0(nr_2 nr_22) {
        this.t = nr_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.t.E.I(this.t.F.isSelected());
        this.t.v();
    }
}

