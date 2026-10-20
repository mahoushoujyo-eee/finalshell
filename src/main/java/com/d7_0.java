/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import com.ne_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/*
 * Renamed from com.d7
 */
class d7_0
implements ActionListener {
    final kd_1 R;

    d7_0(kd_1 kd_12) {
        this.R = kd_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block5: {
            var2_2 = kd_1.u();
            try {
                v0 = this.R;
                if (var2_2 == null) {
                    if (kd_1.b(v0) == null) break block5;
                }
                ** GOTO lbl12
            }
            catch (IOException v1) {
                throw d7_0.a(v1);
            }
            try {
                v0 = this.R;
lbl12:
                // 2 sources

                kd_1.U(v0, new File(kd_1.b(this.R)));
            }
            catch (IOException var3_3) {
                ne_1.g(this, var3_3);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

