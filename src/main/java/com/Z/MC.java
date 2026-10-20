/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.Y;
import com.z.m_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MC
implements ActionListener {
    final Y t;

    MC(Y y2) {
        this.t = y2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.t.l.M(m_0.tiles);
    }
}

