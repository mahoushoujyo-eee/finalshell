/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import com.ew_2;
import com.i2_0;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

/*
 * Renamed from com.ef
 */
public class ef_2
extends e1_0 {
    protected boolean m = ew_2.q;

    public ef_2() {
    }

    public ef_2(boolean bl) {
        this.m = bl;
    }

    public boolean w() {
        return this.m;
    }

    public void s(boolean bl) {
        this.m = bl;
    }

    /*
     * Unable to fully structure code
     */
    public void V(JTabbedPane var1_1, String var2_2, G9 var3_3, Object[] var4_4) {
        var5_6 = e1_0.A();
        for (var6_5 = 0; var6_5 < var1_1.getTabCount(); ++var6_5) {
            var7_7 = this.m != false ? var1_1.getComponentAt(var6_5).getName() : "" + var6_5;
            var8_8 = i2_0.Y(var1_1, var2_2, var7_7);
            v0 = var9_9 = this.q(var8_8, var4_4);
            if (var5_6 != null) {
                v0 = v0 != null ? var9_9 : null;
            }
            var1_1.setTitleAt(var6_5, v0);
            if (var9_9 == null) ** GOTO lbl-1000
            v1 = var3_3.C();
            if (var5_6 == null) ** GOTO lbl14
            if (v1 != null) {
                v1 = var3_3.C();
lbl14:
                // 2 sources

                v2 = v1.charValue();
            } else lbl-1000:
            // 2 sources

            {
                v2 = 0;
            }
            var1_1.setMnemonicAt(var6_5, v2);
            if (var5_6 != null) continue;
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.V((JTabbedPane)jComponent, string, g92, objectArray);
    }
}

