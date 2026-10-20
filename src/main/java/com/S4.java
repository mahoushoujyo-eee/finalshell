/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.kf_2;
import com.tk_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class S4
extends MouseAdapter {
    final kf_2 d;

    S4(kf_2 kf_22) {
        this.d = kf_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block6: {
                boolean bl2;
                block4: {
                    bl = tk_0.B();
                    bl2 = FN.B(mouseEvent);
                    if (bl) break block4;
                    if (!bl2) break block5;
                    bl2 = this.d.isEnabled();
                }
                if (bl) break block6;
                if (!bl2) break block5;
                bl2 = this.d.requestFocusInWindow();
            }
            boolean bl3 = this.d.D();
            if (!bl) {
                bl3 = !bl3;
            }
            this.d.c(bl3);
        }
    }
}

