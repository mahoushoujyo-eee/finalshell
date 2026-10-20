/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QB;
import com.WC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.dv
 */
class dv_2
implements ActionListener {
    final QB X;

    dv_2(QB qB) {
        this.X = qB;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = this.X.c;
        synchronized (object) {
            block7: {
                QB qB;
                block5: {
                    block6: {
                        int[] nArray = WC.V();
                        qB = this.X;
                        if (nArray != null) break block5;
                        if (!(qB.y < 1.0f)) break block6;
                        this.X.y = Math.min(this.X.y + this.X.A, 1.0f);
                        this.X.t(this.X.y);
                        if (nArray == null) break block7;
                    }
                    this.X.l.Y();
                    this.X.l = null;
                    this.X.r = false;
                    qB = this.X;
                }
                qB.T();
            }
            this.X.i();
        }
    }
}

