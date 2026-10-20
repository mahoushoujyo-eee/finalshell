/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.cy_1;
import com.cz_0;
import com.m.G;
import com.od_0;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;

/*
 * Renamed from com.Oi
 */
public class oi_0
extends od_0 {
    /*
     * Unable to fully structure code
     */
    @Override
    public G x(JTree var1_1, Object var2_2, boolean var3_3, boolean var4_4, boolean var5_5, int var6_6, boolean var7_7) {
        block9: {
            block14: {
                block13: {
                    block11: {
                        block12: {
                            block10: {
                                block8: {
                                    block6: {
                                        block7: {
                                            super.x(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                                            var9_8 = (cy_1)var2_2;
                                            var8_9 = cb_1.C();
                                            var10_10 = var9_8.D();
                                            v0 = var9_8;
                                            if (var8_9 == null) break block6;
                                            if (v0.d()) break block7;
                                            v1 = var10_10;
                                            if (var8_9 == null) ** GOTO lbl13
                                            if (v1 != null) {
                                                v1 = var10_10;
lbl13:
                                                // 2 sources

                                                v2 = cz_0.U(v1, false);
                                            } else {
                                                v2 = null;
                                            }
                                            var11_11 = v2;
                                            this.setIcon((Icon)(var9_8.u() != false ? oi_0.p((ImageIcon)var11_11) : var11_11));
                                        }
                                        v0 = var9_8;
                                    }
                                    if (v0.u() == null) break block8;
                                    this.setText(var9_8.u());
                                    if (var8_9 != null) break block9;
                                }
                                v3 = var10_10;
                                if (var8_9 == null) break block10;
                                if (v3 == null) break block9;
                                v3 = var10_10;
                            }
                            v4 = var11_11 = cz_0.X(v3);
                            if (var8_9 == null) break block11;
                            if (v4 == null) break block12;
                            v5 = var11_11.trim().equals("");
                            if (var8_9 == null) break block13;
                            if (v5) break block12;
                            this.setText((String)var11_11);
                            if (var8_9 != null) break block9;
                        }
                        var11_11 = var10_10.getName();
                        v4 = var11_11.trim();
                    }
                    v5 = v4.equals("");
                }
                if (v5) break block14;
                v6 = var11_11;
                if (var8_9 != null) {
                    v6 = v6 != null ? var11_11 : "";
                }
                this.setText((String)v6);
                if (var8_9 != null) break block9;
            }
            this.setText(cz_0.t(var10_10, null).Q());
        }
        return this;
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        return this.x(jTree, object, bl, bl2, bl3, n10, bl4);
    }
}

