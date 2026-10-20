/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QB;
import com.WC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _U
implements ActionListener {
    final QB o;

    _U(QB qB) {
        this.o = qB;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = this.o.c;
        synchronized (object) {
            block7: {
                block5: {
                    QB qB;
                    block6: {
                        int[] nArray = WC.V();
                        qB = this.o;
                        if (nArray != null) break block5;
                        if (!(qB.y > 0.0f)) break block6;
                        this.o.y = Math.max(this.o.y - this.o.A, 0.0f);
                        this.o.t(this.o.y);
                        if (nArray == null) break block7;
                    }
                    this.o.D();
                    this.o.S.Y();
                    this.o.S = null;
                    qB = this.o;
                }
                qB.U = false;
            }
            this.o.f();
        }
    }
}

