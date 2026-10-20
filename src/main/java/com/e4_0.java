/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.G9;
import com.e1_0;
import com.ef_1;
import com.ky_2;
import com.w6_0;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/*
 * Renamed from com.e4
 */
public class e4_0
extends ef_1 {
    /*
     * Unable to fully structure code
     */
    public void J(AbstractButton var1_1, String var2_2, G9 var3_3, Object[] var4_4) {
        block13: {
            block14: {
                block12: {
                    block11: {
                        block10: {
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
                            v3 = var1_1;
                            if (var5_6 == null) break block10;
                            if (!e4_0.T(v3)) break block11;
                            v3 = var1_1;
                        }
                        w6_0.n(e4_0.G(v3));
                    }
                    v4 = var3_3.Y();
                    if (var5_6 == null) break block12;
                    if (v4 == null) break block13;
                    v4 = var3_3.Y();
                }
                v5 = var7_7 = KeyStroke.getKeyStroke(v4);
                if (var5_6 == null) break block14;
                if (v5 == null) break block13;
                v5 = var7_7;
            }
            var8_8 = FN.h(v5);
            var9_9 = w6_0.R(var1_1, var8_8);
            e4_0.t(var1_1, var9_9);
        }
        if (var5_6 == null) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.J((AbstractButton)jComponent, string, g92, objectArray);
    }
}

