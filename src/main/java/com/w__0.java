/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.QQ;
import com.QS;
import com.ky_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.w_
 */
class w__0
extends MouseAdapter {
    final QS q;

    w__0(QS qS) {
        this.q = qS;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            block4: {
                boolean bl;
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = QQ.N();
                    bl = this.q.a;
                    if (ky_2Array != null) break block2;
                    if (!bl) break block3;
                    bl = FN.B(mouseEvent);
                }
                if (!bl) break block4;
                this.q.a();
                if (ky_2Array == null) break block3;
            }
            this.q.V();
        }
    }
}

