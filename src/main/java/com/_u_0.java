/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com._u
 */
class _u_0
implements ActionListener {
    final lk_2 b;

    _u_0(lk_2 lk_22) {
        this.b = lk_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.b.Y(true);
    }
}

