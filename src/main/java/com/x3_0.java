/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.rt_2;
import com.xa_1;
import javax.swing.JTextField;

/*
 * Renamed from com.x3
 */
class x3_0
extends xa_1 {
    final JTextField B;
    final rt_2 O;

    x3_0(rt_2 rt_22, JTextField jTextField) {
        this.O = rt_22;
        this.B = jTextField;
        super(rt_22);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void y(Object var1_1) {
        var2_2 = WC.V();
        v0 = var1_1;
        if (var2_2 != null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var1_1;
lbl6:
            // 2 sources

            v1 = v0.toString();
        } else {
            v1 = "";
        }
        this.B.setText(v1);
    }

    @Override
    public Object G() {
        return this.B.getText();
    }
}

