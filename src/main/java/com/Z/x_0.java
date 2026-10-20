/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.x
 */
class x_0
implements ActionListener {
    final T l;

    x_0(T t2) {
        this.l = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.l.v(actionEvent);
    }
}

