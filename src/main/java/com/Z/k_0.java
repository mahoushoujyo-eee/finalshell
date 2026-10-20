/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.k
 */
class k_0
implements ActionListener {
    final T w;

    k_0(T t2) {
        this.w = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.w.I.doClick(0);
    }
}

