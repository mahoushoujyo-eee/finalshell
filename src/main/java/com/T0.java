/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LX;
import com.T4;
import com.k3_0;
import com.ks_2;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

public class T0
extends T4 {
    private final ks_2 K;

    public T0(ks_2 ks_22) {
        this.K = ks_22;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return this.W(container, true);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.W(container, false);
    }

    /*
     * Unable to fully structure code
     */
    private Dimension W(Container var1_1, boolean var2_2) {
        block18: {
            block19: {
                block17: {
                    block12: {
                        var4_3 = this.K.N();
                        var3_4 = T4.b();
                        v0 = this.K;
                        if (var3_4 == 0) ** GOTO lbl7
                        if (v0.y() == LX.separated) {
                            v0 = this.K;
lbl7:
                            // 2 sources

                            v1 = v0.O();
                        } else {
                            v1 = 0;
                        }
                        var5_5 = v1;
                        var6_6 = new Dimension();
                        v2 = this.K.Z();
                        if (var3_4 != 0) {
                            v2 = v2 == 0 ? 1 : 0;
                        }
                        var7_7 = v2;
                        for (k3_0 var9_9 : var4_3) {
                            block16: {
                                block14: {
                                    block15: {
                                        block13: {
                                            v3 = (int)var2_2;
                                            if (var3_4 == 0) break block12;
                                            if (var3_4 == 0) break block13;
                                            if (v3 != 0) ** GOTO lbl-1000
                                            v4 = this.K.H();
                                        }
                                        if (!v4) lbl-1000:
                                        // 2 sources

                                        {
                                            v5 = var9_9.getPreferredSize();
                                        } else {
                                            v5 = var10_10 = var9_9.u();
                                        }
                                        if (var3_4 == 0) break block14;
                                        if (var7_7 == 0) break block15;
                                        var6_6.width += var10_10.width;
                                        var6_6.height = Math.max(var6_6.height, var10_10.height);
                                        if (var3_4 != 0) break block16;
                                    }
                                    var6_6.width = Math.max(var6_6.width, var10_10.width);
                                }
                                var6_6.height += var10_10.height;
                            }
                            if (var3_4 != 0) continue;
                        }
                        v3 = var4_3.size();
                    }
                    if (var3_4 == 0) break block17;
                    if (v3 <= 0) break block18;
                    v3 = var7_7;
                }
                if (v3 == 0) break block19;
                var6_6.width += var5_5 * (var4_3.size() - 1);
                if (var3_4 != 0) break block18;
            }
            var6_6.height += var5_5 * (var4_3.size() - 1);
        }
        var8_8 = var1_1.getInsets();
        var6_6.width += var8_8.left + var8_8.right;
        var6_6.height += var8_8.top + var8_8.bottom;
        return var6_6;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block28: {
            block29: {
                var3_2 = this.K.N();
                var2_3 = T4.b();
                v0 = this.K;
                if (var2_3 == 0) ** GOTO lbl7
                if (v0.y() == LX.separated) {
                    v0 = this.K;
lbl7:
                    // 2 sources

                    v1 = v0.O();
                } else {
                    v1 = 0;
                }
                var4_4 = v1;
                var5_5 = var1_1.getInsets();
                var6_6 = var1_1.getSize();
                var7_7 = var6_6.width - var5_5.left - var5_5.right;
                var8_8 = var6_6.height - var5_5.top - var5_5.bottom;
                v2 = this.K.Z();
                if (var2_3 != 0) {
                    v2 = v2 == 0 ? 1 : 0;
                }
                var9_9 = v2;
                var10_10 = var5_5.left;
                var11_11 = var5_5.top;
                if (!this.K.H()) break block29;
                var12_12 = 0.0f;
                v3 = var9_9;
                if (var2_3 == 0) ** GOTO lbl29
                if (v3 != 0) {
                    v4 = var6_6.width - var5_5.left - var5_5.right;
                } else {
                    v3 = var6_6.height - var5_5.top;
lbl29:
                    // 2 sources

                    v4 = v3 - var5_5.bottom;
                }
                var13_14 = v4 + var4_4;
                var14_16 = 0;
                var15_18 = -1;
                var16_19 = new ArrayList<Integer>();
                for (k3_0 var18_22 : var3_2) {
                    block31: {
                        block30: {
                            var19_24 = var18_22.u();
                            if (var2_3 == 0) ** GOTO lbl-1000
                            v5 = var9_9;
                            if (var2_3 != 0) {
                                v5 = v5 != 0 ? var19_24.width : var19_24.height;
                            }
                            var16_19.add(v5);
                            var20_26 = var18_22.q();
                            var12_12 += var20_26;
                            v6 = var9_9;
                            if (var2_3 != 0) {
                                v6 = v6 != 0 ? var19_24.width : var19_24.height;
                            }
                            var13_14 -= v6 + var4_4;
                            cfr_temp_0 = var20_26 - 0.0f;
                            v7 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var2_3 == 0) break block30;
                            if (v7 <= 0) break block31;
                            v7 = var3_2.indexOf(var18_22);
                        }
                        var15_18 = (int)v7;
                        ++var14_16;
                    }
                    if (var2_3 != 0) continue;
                }
                if (var14_16 == 1) {
                    v8 = 1.0f;
                } else lbl-1000:
                // 2 sources

                {
                    v8 = var12_12;
                }
                var12_12 = v8;
                var13_14 = Math.max(var13_14, 0);
                var17_21 = 0.0f;
                for (var18_23 = 0; var18_23 < var3_2.size(); ++var18_23) {
                    block33: {
                        block32: {
                            var19_25 = ((k3_0)var3_2.get(var18_23)).q();
                            var20_27 = (Integer)var16_19.get(var18_23);
                            if (var2_3 == 0) break block28;
                            cfr_temp_1 = var19_25 - 0.0f;
                            v9 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                            if (var2_3 == 0) break block32;
                            if (v9 <= 0) break block33;
                            var17_21 += (float)var13_14 * var19_25 / var12_12 % 1.0f;
                            v9 = var20_27;
                        }
                        v10 = Math.round((float)Math.floor((float)var13_14 * var19_25 / var12_12));
                        v11 = var18_23;
                        if (var2_3 != 0) {
                            v11 = v11 == var15_18 ? Math.round(var17_21) : 0;
                        }
                        var20_27 = (int)(v9 + (v10 + v11));
                    }
                    v12 = (k3_0)var3_2.get(var18_23);
                    v13 = var9_9;
                    if (var2_3 != 0) {
                        v13 = v13 != 0 ? var20_27 : var7_7;
                    }
                    v14 = var9_9;
                    if (var2_3 != 0) {
                        v14 = v14 != 0 ? var8_8 : var20_27;
                    }
                    v12.setBounds(var10_10, var11_11, v13, v14);
                    v15 = var9_9;
                    if (var2_3 != 0) {
                        if (v15 != 0) {
                            var10_10 += var20_27 + var4_4;
                            if (var2_3 != 0) continue;
                        }
                        v15 = var11_11 + (var20_27 + var4_4);
                    }
                    var11_11 = v15;
                    if (var2_3 != 0) continue;
                }
                if (var2_3 != 0) break block28;
            }
            for (k3_0 var13_15 : var3_2) {
                block34: {
                    block35: {
                        var14_17 = var13_15.getPreferredSize();
                        v16 = var9_9;
                        if (var2_3 != 0) {
                            v16 = v16 != 0 ? var14_17.width : var7_7;
                        }
                        v17 = var9_9;
                        if (var2_3 != 0) {
                            v17 = v17 != 0 ? var8_8 : var14_17.height;
                        }
                        var13_15.setBounds(var10_10, var11_11, v16, v17);
                        v18 = var9_9;
                        if (var2_3 == 0) break block34;
                        if (v18 == 0) break block35;
                        var10_10 += var14_17.width + var4_4;
                        if (var2_3 != 0) break block34;
                    }
                    v18 = var11_11 = var11_11 + (var14_17.height + var4_4);
                }
                if (var2_3 != 0) continue;
            }
        }
    }
}

