/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.Y;
import com.z.m_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Z
implements ActionListener {
    final Y R;

    Z(Y y2) {
        this.R = y2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.R.l.M(m_0.icons);
    }
}

