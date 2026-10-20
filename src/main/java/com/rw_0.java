/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EX;
import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Rw
 */
class rw_0
implements ActionListener {
    final EX U;
    final kd_1 x;
    private static final long a;

    rw_0(kd_1 kd_12, EX eX) {
        this.x = kd_12;
        this.U = eX;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.U.setValue((int)a);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8229549093471946858L;
        a = 0x267A07996A08884AL ^ l2;
    }
}

