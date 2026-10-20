/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.v
 */
class v_0
implements ActionListener {
    final T d;

    v_0(T t2) {
        this.d = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.d.h(actionEvent);
    }
}

