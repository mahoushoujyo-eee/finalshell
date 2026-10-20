/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.KR;
import com.kd_2;
import com.ke_1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.dM
 */
class dm_1
extends KeyAdapter {
    final KR p;
    final kd_2 h;

    dm_1(kd_2 kd_22, KR kR) {
        this.h = kd_22;
        this.p = kR;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        String string = ke_1.v();
        boolean bl = GR.lD.J(keyEvent);
        if (string == null && bl) {
            bl = this.p.requestFocusInWindow();
        }
    }
}

