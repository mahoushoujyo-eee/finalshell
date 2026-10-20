/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.wo_1;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

class X5
extends KeyAdapter {
    final FocusAdapter H;
    final JList I;
    final wo_1 Z;

    X5(wo_1 wo_12, FocusAdapter focusAdapter, JList jList) {
        this.Z = wo_12;
        this.H = focusAdapter;
        this.I = jList;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block6: {
            boolean bl;
            int n10;
            block4: {
                block5: {
                    n10 = wo_1.H();
                    bl = GR.lZ.J(keyEvent);
                    if (n10 == 0) break block4;
                    if (!bl) break block5;
                    this.Z.d.removeFocusListener(this.H);
                    this.Z.C(this.I);
                    this.I.requestFocusInWindow();
                    if (n10 != 0) break block6;
                }
                bl = GR.lD.J(keyEvent);
            }
            if (n10 != 0 && bl) {
                this.Z.d.removeFocusListener(this.H);
                this.Z.w(this.I);
                bl = this.I.requestFocusInWindow();
            }
        }
    }
}

