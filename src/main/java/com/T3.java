/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.QE;
import com.QY;
import com.T4;
import com._e_0;
import com.gw_0;
import com.rv_2;
import com.wn_1;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

public class T3
extends T4 {
    private static final long a;

    /*
     * Unable to fully structure code
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block7: {
            block6: {
                block5: {
                    var3_2 = (QY)var1_1;
                    var4_3 = gw_0.d(var3_2.u());
                    var2_4 = _e_0.P();
                    v0 = var3_2;
                    if (var2_4 != null) ** GOTO lbl10
                    if (!v0.k()) {
                        v1 = var3_2.t();
                    } else {
                        v0 = var3_2;
lbl10:
                        // 2 sources

                        v1 = var5_5 = v0.H();
                    }
                    if (var2_4 != null) break block5;
                    if (!var5_5.l()) break block6;
                    this.R(var3_2, var4_3, var5_5);
                }
                if (var2_4 == null) break block7;
            }
            this.e(var3_2, var4_3, var5_5);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void e(QY var1_1, float var2_2, QE var3_3) {
        var5_4 = FN.P(var1_1.getComponents());
        var6_5 = var1_1.getComponentCount();
        var4_6 = _e_0.P();
        v0 = wn_1.Z[var3_3.ordinal()];
        if (var4_6 != null) ** GOTO lbl9
        switch (v0) {
            case 1: {
                v0 = 0;
lbl9:
                // 2 sources

                var7_7 = v0;
                var8_8 = 0;
                for (var9_9 = 0; var9_9 < var6_5; ++var9_9) {
                    this.l(var1_1, var9_9, 0, var8_8);
                    var8_8 = (int)((float)var8_8 + (float)var5_4.height * var2_2);
                    if (var4_6 == null) ** break;
                }
                break;
            }
        }
    }

    protected void l(QY qY, int n10, int n11, int n12) {
        Component component = qY.getComponent(n10);
        Dimension dimension = component.getPreferredSize();
        component.setBounds(n11, n12, dimension.width, dimension.height);
    }

    /*
     * Unable to fully structure code
     */
    protected void R(QY var1_1, float var2_2, QE var3_3) {
        var5_4 = FN.P(var1_1.getComponents());
        var6_5 = new Point(var1_1.v(), var1_1.v());
        var7_6 = Math.max(var5_4.width, var5_4.height);
        var4_7 = _e_0.P();
        v0 = var8_8 = var1_1.u();
        if (var4_7 == null) {
            v0 = v0 != -1 ? var8_8 : 0;
        }
        var9_9 = v0;
        var10_10 = var1_1.v() - var7_6 / 2;
        var11_11 = this.b(var1_1);
        var13_12 = this.X(var1_1);
        v1 = var1_1.C();
        if (var4_7 == null) {
            v1 = v1 != 0 ? 1 : -1;
        }
        var15_13 = v1;
        var16_14 = var1_1.getComponentCount();
        block0 : switch (wn_1.Z[var3_3.ordinal()]) {
            case 2: {
                var17_15 = (double)var2_2 * var11_11;
                for (var19_17 = 0; var19_17 < var16_14; ++var19_17) {
                    var20_20 = var9_9 + var19_17;
                    if (var4_7 != null) break block0;
                    v2 = var20_20;
                    v3 = var16_14;
                    if (var4_7 != null) ** GOTO lbl31
                    if (v2 < v3) {
                        v4 = var20_20;
                    } else {
                        v2 = var20_20;
                        v3 = var16_14;
lbl31:
                        // 2 sources

                        v4 = v2 - v3;
                    }
                    var21_21 = v4;
                    var22_22 = var13_12 + (double)var9_9 * var11_11 + var17_15 * (double)var19_17 * (double)var15_13;
                    var24_24 = (int)Math.round((double)var6_5.x + (double)var10_10 * Math.cos(var22_22));
                    var25_26 = (int)Math.round((double)var6_5.y + (double)var10_10 * Math.sin(var22_22));
                    this.y(var1_1, var21_21, var24_24, var25_26);
                    if (var4_7 == null) continue;
                }
                if (var4_7 == null) break;
            }
            case 3: {
                var17_16 = Math.round((float)var10_10 * var2_2);
                for (var18_27 = 0; var18_27 < var16_14; ++var18_27) {
                    var19_18 = var13_12 + var11_11 * (double)var18_27 * (double)var15_13;
                    if (var4_7 != null) break block0;
                    v5 = var18_27;
                    if (var4_7 == null) {
                        v5 = v5 == var8_8 ? var10_10 : var17_16;
                    }
                    var21_21 = v5;
                    var22_23 = (int)Math.round((double)var6_5.x + (double)var21_21 * Math.cos(var19_18));
                    var23_29 = (int)Math.round((double)var6_5.y + (double)var21_21 * Math.sin(var19_18));
                    this.y(var1_1, var18_27, var22_23, var23_29);
                    if (var4_7 == null) continue;
                }
                if (var4_7 == null) break;
            }
            case 4: {
                var17_16 = Math.round((float)var10_10 * var2_2);
                v6 = var1_1.q();
                if (var4_7 == null) {
                    v6 = v6 != 0 ? -1 : 1;
                }
                var18_27 = v6;
                var19_19 = rv_2.l((float)(var18_27 * (int)T3.a) * (1.0f - var2_2));
                for (var21_21 = 0; var21_21 < var16_14; ++var21_21) {
                    if (var4_7 != null) break block0;
                    var22_22 = var21_21 == var8_8 ? 0.0 : var19_19;
                    var24_25 = var13_12 + (var11_11 * (double)var21_21 + var22_22) * (double)var15_13;
                    v7 = var21_21;
                    if (var4_7 == null) {
                        v7 = v7 == var8_8 ? var10_10 : var17_16;
                    }
                    var26_30 = v7;
                    var27_31 = (int)Math.round((double)var6_5.x + (double)var26_30 * Math.cos(var24_25));
                    var28_32 = (int)Math.round((double)var6_5.y + (double)var26_30 * Math.sin(var24_25));
                    this.y(var1_1, var21_21, var27_31, var28_32);
                    if (var4_7 == null) continue;
                }
                if (var4_7 == null) break;
            }
            case 5: {
                for (var17_16 = 0; var17_16 < var16_14; ++var17_16) {
                    var18_28 = var13_12 + var11_11 * (double)var17_16 * (double)var15_13;
                    var20_20 = (int)Math.round((double)var6_5.x + (double)var10_10 * Math.cos(var18_28));
                    var21_21 = (int)Math.round((double)var6_5.y + (double)var10_10 * Math.sin(var18_28));
                    this.y(var1_1, var17_16, var20_20, var21_21);
                    if (var4_7 == null) ** break;
                }
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public double b(QY qY) {
        double d2;
        double d3 = rv_2.l(Math.min(qY.a(), 360.0));
        int[] nArray = _e_0.P();
        double d4 = d3;
        double d5 = Math.PI * 2;
        if (nArray == null) {
            if (d4 < d5) {
                d2 = d3 / (double)(qY.getComponentCount() - 1);
                return d2;
            }
            d4 = d3;
            d5 = qY.getComponentCount();
        }
        d2 = d4 / d5;
        return d2;
    }

    public double X(QY qY) {
        return rv_2.l(qY.V()) - 1.5707963267948966;
    }

    public double r(QY qY, int n10) {
        int[] nArray = _e_0.P();
        int n11 = qY.C();
        if (nArray == null) {
            n11 = n11 != 0 ? 1 : -1;
        }
        int n12 = n11;
        switch (qY.t()) {
            default: 
        }
        double d2 = this.X(qY);
        double d3 = this.b(qY);
        return d2 + d3 * (double)n10 * (double)n12;
    }

    protected void y(QY qY, int n10, int n11, int n12) {
        Component component = qY.getComponent(n10);
        Dimension dimension = component.getPreferredSize();
        component.setBounds(n11 - dimension.width / 2, n12 - dimension.height / 2, dimension.width, dimension.height);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Dimension preferredLayoutSize(Container var1_1) {
        var3_2 = (QY)var1_1;
        var2_3 = _e_0.P();
        v0 = wn_1.Z[var3_2.t().ordinal()];
        if (var2_3 != null) ** GOTO lbl8
        switch (v0) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                v0 = var3_2.v();
lbl8:
                // 2 sources

                var4_4 = v0;
                return new Dimension(var4_4 * 2, var4_4 * 2);
            }
            case 1: {
                var4_5 = FN.P(var3_2.getComponents());
                var5_6 = var3_2.getComponentCount();
                return new Dimension(var4_5.width, var4_5.height * var5_6);
            }
        }
        return new Dimension(0, 0);
    }

    public Point r(QY qY, int n10, int n11) {
        switch (qY.t()) {
            case roll: 
            case star: 
            case shutter: 
            case fade: {
                Dimension dimension = this.preferredLayoutSize(qY);
                return new Point(n10 - dimension.width / 2, n11 - dimension.height / 2);
            }
        }
        return new Point(n10, n11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5773783133856348037L;
        a = 0xAAFDB0EB5FA637DFL ^ l2;
    }
}

