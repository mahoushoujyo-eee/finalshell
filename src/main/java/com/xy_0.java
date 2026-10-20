/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.QQ;
import com.ky_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.Xy
 */
class xy_0
extends MouseAdapter {
    final QQ F;

    xy_0(QQ qQ) {
        this.F = qQ;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            block4: {
                boolean bl;
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = QQ.N();
                    bl = this.F.m;
                    if (ky_2Array != null) break block2;
                    if (!bl) break block3;
                    bl = FN.B(mouseEvent);
                }
                if (!bl) break block4;
                this.F.a();
                if (ky_2Array == null) break block3;
            }
            this.F.l();
        }
    }
}

