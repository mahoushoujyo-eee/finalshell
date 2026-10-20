/*
 * Decompiled with CFR 0.152.
 */
package com.a;

import com.A.d;
import com.a.y_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.A.v
 */
class v_0
implements ActionListener {
    final d E;

    v_0(d d2) {
        this.E = d2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            d d2;
            block4: {
                block5: {
                    boolean bl;
                    int[] nArray;
                    block2: {
                        nArray = y_0.M();
                        bl = this.E.u();
                        if (nArray == null) break block2;
                        if (!bl) break block3;
                        d2 = this.E;
                        if (nArray == null) break block4;
                        bl = d2.j();
                    }
                    if (!bl) break block5;
                    this.E.J();
                    if (nArray != null) break block3;
                }
                d2 = this.E;
            }
            d2.p();
        }
    }
}

