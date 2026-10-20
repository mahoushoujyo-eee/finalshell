/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.Y;
import com.z.m_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.t
 */
class t_0
implements ActionListener {
    final Y V;

    t_0(Y y2) {
        this.V = y2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.V.l.M(m_0.table);
    }
}

