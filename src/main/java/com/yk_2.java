/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qm_0;
import java.awt.Rectangle;

/*
 * Renamed from com.yk
 */
class yk_2
implements Runnable {
    final Rectangle N;
    final qm_0 W;

    yk_2(qm_0 qm_02, Rectangle rectangle) {
        this.W = qm_02;
        this.N = rectangle;
    }

    @Override
    public void run() {
        block4: {
            yk_2 yk_22;
            block2: {
                block3: {
                    boolean bl = qm_0.Z();
                    yk_22 = this;
                    if (bl) break block2;
                    if (yk_22.N == null) break block3;
                    this.W.repaint(this.N);
                    if (!bl) break block4;
                }
                yk_22 = this;
            }
            yk_22.W.repaint();
        }
    }
}

