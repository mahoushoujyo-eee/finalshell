/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.DP;
import com.QL;
import com.U.O;
import com.sj_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.ry
 */
class ry_2
extends ComponentAdapter {
    final DP Y;
    final sj_0 n;
    final QL K;

    ry_2(QL qL, DP dP, sj_0 sj_02) {
        this.K = qL;
        this.Y = dP;
        this.n = sj_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        block4: {
            O o2;
            block2: {
                O o3;
                block3: {
                    o3 = this.Y.g();
                    String[] stringArray = BX.B();
                    o2 = o3;
                    if (stringArray != null) break block2;
                    if (o2.getWidth() > 0) break block3;
                    o2 = o3;
                    if (stringArray != null) break block2;
                    if (o2.getHeight() <= 0) break block4;
                }
                this.Y.a(this.n.b());
                o2 = o3;
            }
            o2.removeComponentListener(this);
        }
    }
}

