/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.A;
import com.t.a_0;
import com.t.n_0;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

class g
implements CaretListener {
    final ChangeListener f;
    final n_0 V;

    g(n_0 n_02, ChangeListener changeListener) {
        this.V = n_02;
        this.f = changeListener;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void caretUpdate(CaretEvent var1_1) {
        block5: {
            var2_2 = n_0.W();
            try {
                v0 = n_0.N(this.V);
                if (var2_2 != 0) {
                    if (v0 != 0) break block5;
                }
                ** GOTO lbl13
            }
            catch (Throwable v1) {
                throw g.a(v1);
            }
            n_0.r(this.V).K(this.f);
            try {
                v0 = Integer.parseInt(n_0.t(this.V).getText());
lbl13:
                // 2 sources

                var3_3 = (float)v0 / 360.0f;
                var4_5 = (float)Integer.parseInt(n_0.f(this.V).getText()) / 100.0f;
                var5_6 = (float)Integer.parseInt(n_0.o(this.V).getText()) / 100.0f;
                n_0.y(this.V, new A(var3_3, var4_5, var5_6).E());
                n_0.a(this.V, n_0.c(this.V), a_0.hsbField);
            }
            catch (Throwable var3_4) {
                // empty catch block
            }
            n_0.r(this.V).N(this.f);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

