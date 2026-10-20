/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.A;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.e
 */
class e_0
implements ActionListener {
    final A y;

    e_0(A a10) {
        this.y = a10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        A.n(this.y).cancelSelection();
    }
}

