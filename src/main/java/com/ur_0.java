/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.ic_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

/*
 * Renamed from com.ur
 */
class ur_0
extends KeyAdapter {
    final ic_0 k;

    ur_0(ic_0 ic_02) {
        this.k = ic_02;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (GR.lZ.J(keyEvent)) {
            ic_0.i(this.k, (File)ic_0.g(this.k).getSelectedValue());
        }
    }
}

