/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.P9;
import com.t.a_0;
import com.t.n_0;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

class h
implements CaretListener {
    final ChangeListener N;
    final n_0 m;

    h(n_0 n_02, ChangeListener changeListener) {
        this.m = n_02;
        this.N = changeListener;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void caretUpdate(CaretEvent var1_1) {
        block5: {
            var2_2 = n_0.g();
            try {
                v0 = this.m;
                if (var2_2 == 0) {
                    if (n_0.N(v0)) break block5;
                }
                ** GOTO lbl15
            }
            catch (Throwable v1) {
                throw h.a(v1);
            }
            n_0.r(this.m).K(this.N);
            try {
                n_0.y(this.m, P9.C(n_0.E(this.m).getText()));
                v0 = this.m;
lbl15:
                // 2 sources

                n_0.a(v0, n_0.c(this.m), a_0.hexField);
            }
            catch (Throwable var3_3) {
                // empty catch block
            }
            n_0.r(this.m).N(this.N);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

