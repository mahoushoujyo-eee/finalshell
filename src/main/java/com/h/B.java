/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.GO;
import com.P9;
import com.RV;
import com.h.K;
import com.h.c;
import com.ky_2;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

class B
implements Icon {
    final JRadioButton Z;
    final c t;

    B(c c2, JRadioButton jRadioButton) {
        this.t = c2;
        this.Z = jRadioButton;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void paintIcon(Component var1_1, Graphics var2_2, int var3_3, int var4_4) {
        block13: {
            block14: {
                block12: {
                    block11: {
                        block10: {
                            block7: {
                                block8: {
                                    block9: {
                                        c.f(this.t, new Rectangle(var3_3, var4_4, c.L(this.t), c.c(this.t)));
                                        var6_5 = (Graphics2D)var2_2;
                                        var7_6 = RV.X(var6_5);
                                        var8_7 = c.L(this.t) - c.e(this.t) * 2 - 2;
                                        var5_8 = K.Z();
                                        var9_9 = new Rectangle(var3_3 + c.e(this.t), var4_4 + c.e(this.t), c.L(this.t) - c.e(this.t) * 2 - 1, c.c(this.t) - c.e(this.t) * 2 - 1);
                                        var10_10 = new RoundRectangle2D.Double(var9_9.x, var9_9.y, var9_9.width, var9_9.height, var8_7, var8_7);
                                        v0 = var1_1.isEnabled();
                                        if (!var5_8) break block7;
                                        if (v0 == 0) break block8;
                                        v1 = var1_1.isEnabled();
                                        if (!var5_8) break block9;
                                        if (!v1) ** GOTO lbl-1000
                                        v1 = var1_1.isFocusOwner();
                                    }
                                    if (v1) {
                                        v2 = GO.c;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        v2 = GO.r;
                                    }
                                    RV.Y(var6_5, var10_10, v2, c.e(this.t));
                                }
                                v0 = Math.round((float)Math.sqrt(var9_9.width * var9_9.width / 2));
                            }
                            var11_11 = v0;
                            var6_5.setPaint(new RadialGradientPaint(var9_9.x + var9_9.width / 2, (float)(var9_9.y + var9_9.height / 2), var11_11, new float[]{0.0f, 1.0f}, c.W(this.t, this.Z)));
                            var6_5.fill(var10_10);
                            var12_12 = RV.M(var6_5, this.t.m);
                            v3 = var1_1.isEnabled();
                            if (!var5_8) break block10;
                            if (!v3) break block11;
                            v4 = this.t;
                            if (!var5_8) ** GOTO lbl40
                            v3 = c.f(v4);
                        }
                        if (v3) {
                            v5 = P9.N(c.O(this.t), c.L(this.t), c.T(this.t));
                        } else {
                            v4 = this.t;
lbl40:
                            // 2 sources

                            v5 = c.L(v4);
                        }
                        break block12;
                    }
                    v5 = c.C(this.t);
                }
                var6_5.setPaint(v5);
                var6_5.draw(var10_10);
                RV.p(var6_5, var12_12);
                if (!var5_8) break block13;
                if (c.C(this.t) <= 0) break block14;
                v6 /* !! */  = this.Z;
                if (!var5_8) ** GOTO lbl54
                if (v6 /* !! */ .isEnabled()) {
                    v6 /* !! */  = c.S.get(c.C(this.t));
lbl54:
                    // 2 sources

                    v7 = (ImageIcon)v6 /* !! */ ;
                } else {
                    v7 = c.p;
                }
                var13_13 = v7;
                var6_5.drawImage(var13_13.getImage(), var3_3 + c.L(this.t) / 2 - var13_13.getIconWidth() / 2, var4_4 + c.c(this.t) / 2 - var13_13.getIconHeight() / 2, this.Z);
            }
            RV.X(var6_5, var7_6);
        }
        if (!var5_8) {
            ky_2.K(new String[1]);
        }
    }

    @Override
    public int getIconWidth() {
        return c.L(this.t);
    }

    @Override
    public int getIconHeight() {
        return c.c(this.t);
    }
}

