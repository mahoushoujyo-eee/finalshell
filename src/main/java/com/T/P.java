/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.a_0;
import com.t.n_0;
import java.awt.Color;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

class P
implements CaretListener {
    final ChangeListener q;
    final n_0 O;

    P(n_0 n_02, ChangeListener changeListener) {
        this.O = n_02;
        this.q = changeListener;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void caretUpdate(CaretEvent var1_1) {
        block5: {
            var2_2 = n_0.g();
            try {
                v0 = n_0.N(this.O);
                if (var2_2 == 0) {
                    if (v0 != 0) break block5;
                }
                ** GOTO lbl13
            }
            catch (Throwable v1) {
                throw P.a(v1);
            }
            n_0.r(this.O).K(this.q);
            try {
                v0 = Integer.parseInt(n_0.U(this.O).getText());
lbl13:
                // 2 sources

                var3_3 = v0;
                var4_5 = Integer.parseInt(n_0.Z(this.O).getText());
                var5_6 = Integer.parseInt(n_0.l(this.O).getText());
                n_0.y(this.O, new Color(var3_3, var4_5, var5_6));
                n_0.a(this.O, n_0.c(this.O), a_0.rgbField);
            }
            catch (Throwable var3_4) {
                // empty catch block
            }
            n_0.r(this.O).N(this.q);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

