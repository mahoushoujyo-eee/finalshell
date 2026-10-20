/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import com.ky_2;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

/*
 * Renamed from com.e9
 */
public class e9_0
extends e1_0 {
    /*
     * Unable to fully structure code
     */
    public void G(AbstractButton var1_1, String var2_2, G9 var3_3, Object[] var4_4) {
        var6_5 = this.q(var3_3, var4_4);
        var5_6 = e1_0.A();
        v0 = var6_5;
        if (var5_6 != null) {
            v0 = v0 != null ? var6_5 : null;
        }
        var1_1.setText(v0);
        if (var6_5 == null) ** GOTO lbl-1000
        v1 = var3_3.C();
        if (var5_6 == null) ** GOTO lbl12
        if (v1 != null) {
            v1 = var3_3.C();
lbl12:
            // 2 sources

            v2 = v1.charValue();
        } else lbl-1000:
        // 2 sources

        {
            v2 = '\u0000';
        }
        var1_1.setMnemonic(v2);
        if (ky_2.F() != null) {
            e1_0.K(new String[3]);
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.G((AbstractButton)jComponent, string, g92, objectArray);
    }
}

