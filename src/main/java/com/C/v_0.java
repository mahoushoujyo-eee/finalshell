/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.W;
import com.FN;
import com.GA;
import com.GO;
import com.RV;
import com.lj_1;
import com.lz_0;
import com.o__0;
import com.og_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.text.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.C.v
 */
public class v_0
extends lz_0
implements lj_1 {
    protected boolean P = o__0.U;
    protected Color B = o__0.v;
    protected Float L = o__0.l;
    protected og_2 e = o__0.j;
    protected Rectangle M = new Rectangle();
    protected Rectangle f = new Rectangle();
    private static final String a;
    private static final long g;

    public v_0() {
    }

    public v_0(og_2 og_22) {
        this.w(og_22);
    }

    public boolean E() {
        return this.P;
    }

    @Override
    public void l(boolean bl) {
        this.P = bl;
    }

    public Color z() {
        return this.B;
    }

    public void t(Color color) {
        this.B = color;
    }

    public Float S() {
        return this.L;
    }

    public void A(Float f10) {
        this.L = f10;
    }

    public og_2 J() {
        return this.e;
    }

    public void w(og_2 og_22) {
        this.e = og_22;
        this.Z();
    }

    public Boolean A(JLabel jLabel) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Insets Q(JLabel jLabel) {
        Insets insets;
        int[] nArray = W.B();
        v_0 v_02 = this;
        if (nArray == null) {
            if (v_02.e != null) {
                insets = this.e.B(jLabel);
                return insets;
            }
            v_02 = this;
        }
        insets = super.B(jLabel);
        return insets;
    }

    /*
     * Unable to fully structure code
     */
    public void u(Graphics2D var1_1, Rectangle var2_2, JLabel var3_3) {
        block17: {
            block21: {
                block20: {
                    block19: {
                        block18: {
                            block16: {
                                block15: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                var4_4 = W.B();
                                                var5_5 = RV.a(var1_1, this.L, this.L != null);
                                                var6_6 = this.P != false ? GO.FQ : GO.e;
                                                var7_7 = RV.b(var1_1, var3_3.getFont());
                                                var8_8 = FN.d(var1_1, var6_6);
                                                var9_9 = var1_1.getPaint();
                                                var10_10 = var3_3.getText();
                                                v0 = var3_3;
                                                if (var4_4 != null) ** GOTO lbl14
                                                if (v0.isEnabled()) {
                                                    v1 = var3_3.getIcon();
                                                } else {
                                                    v0 = var3_3;
lbl14:
                                                    // 2 sources

                                                    v1 = v0.getDisabledIcon();
                                                }
                                                var11_11 = v1;
                                                v2 = this.e;
                                                if (var4_4 != null) break block12;
                                                if (v2 == null) break block13;
                                                v2 = this.e;
                                            }
                                            v2.u(var1_1, var2_2, var3_3);
                                        }
                                        if (var11_11 == null && var10_10 == null) {
                                            return;
                                        }
                                        var12_12 = var3_3.getFontMetrics(var3_3.getFont());
                                        var13_13 = this.i(var3_3, var12_12, var3_3.getWidth(), var3_3.getHeight());
                                        v3 = var11_11;
                                        if (var4_4 != null) break block14;
                                        if (v3 == null) break block15;
                                        v3 = var11_11;
                                    }
                                    v3.paintIcon(var3_3, var1_1, this.M.x, this.M.y);
                                }
                                v4 = var10_10;
                                if (var4_4 != null) break block16;
                                if (v4 == null) break block17;
                                v4 = var3_3.getClientProperty(v_0.a);
                            }
                            v5 = var14_14 = (View)v4;
                            if (var4_4 != null) break block18;
                            if (v5 == null) break block19;
                            v5 = var14_14;
                        }
                        v5.paint(var1_1, this.f);
                        if (var4_4 == null) break block17;
                    }
                    var15_15 = this.f.x;
                    var16_16 = this.f.y + var12_12.getAscent();
                    if (var4_4 != null) break block20;
                    if (!var3_3.isEnabled()) break block21;
                    this.u(var3_3, var1_1, var13_13, var15_15, var16_16);
                }
                if (var4_4 == null) break block17;
            }
            this.O(var3_3, var1_1, var13_13, var15_15, var16_16);
        }
        var1_1.setPaint(var9_9);
        FN.k(var1_1, var8_8);
        RV.j(var1_1, var7_7);
        RV.E(var1_1, var5_5, this.L != null);
    }

    /*
     * Unable to fully structure code
     */
    protected String i(JLabel var1_1, FontMetrics var2_2, int var3_3, int var4_4) {
        var6_5 = var1_1.getInsets(null);
        var7_6 = var1_1.getText();
        var5_7 = W.B();
        v0 = var1_1;
        if (var5_7 != null) ** GOTO lbl10
        if (v0.isEnabled()) {
            v1 = var1_1.getIcon();
        } else {
            v0 = var1_1;
lbl10:
            // 2 sources

            v1 = v0.getDisabledIcon();
        }
        var8_8 = v1;
        var9_9 = new Rectangle();
        var9_9.x = var6_5.left;
        var9_9.y = var6_5.top;
        var9_9.width = var3_3 - (var6_5.left + var6_5.right);
        var9_9.height = var4_4 - (var6_5.top + var6_5.bottom);
        this.M.height = 0;
        this.M.width = 0;
        this.M.y = 0;
        this.M.x = 0;
        this.f.height = 0;
        this.f.width = 0;
        this.f.y = 0;
        this.f.x = 0;
        return this.d(var1_1, var2_2, var7_6, var8_8, var9_9, this.M, this.f);
    }

    protected String d(JLabel jLabel, FontMetrics fontMetrics, String string, Icon icon, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3) {
        return SwingUtilities.layoutCompoundLabel(jLabel, fontMetrics, string, icon, jLabel.getVerticalAlignment(), jLabel.getHorizontalAlignment(), jLabel.getVerticalTextPosition(), jLabel.getHorizontalTextPosition(), rectangle, rectangle2, rectangle3, jLabel.getIconTextGap());
    }

    protected void u(JLabel jLabel, Graphics2D graphics2D, String string, int n10, int n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    int[] nArray = W.B();
                    n12 = this.P;
                    if (nArray != null) break block2;
                    if (n12 == 0) break block3;
                    graphics2D.setColor(jLabel.getForeground());
                    this.V(graphics2D, string, n10, n11);
                    if (nArray == null) break block4;
                }
                n12 = jLabel.getDisplayedMnemonicIndex();
            }
            int n13 = n12;
            graphics2D.setColor(jLabel.getForeground());
            FN.W(graphics2D, string, n13, n10, n11);
        }
    }

    protected void O(JLabel jLabel, Graphics2D graphics2D, String string, int n10, int n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    int[] nArray = W.B();
                    n12 = jLabel.isEnabled();
                    if (nArray != null) break block2;
                    if (n12 == 0) break block3;
                    n12 = this.P;
                    if (nArray != null) break block2;
                    if (n12 == 0) break block3;
                    graphics2D.setColor(jLabel.getBackground().darker());
                    this.V(graphics2D, string, n10, n11);
                    if (nArray == null) break block4;
                }
                n12 = jLabel.getDisplayedMnemonicIndex();
            }
            int n13 = n12;
            Color color = jLabel.getBackground();
            graphics2D.setColor(color.brighter());
            FN.W(graphics2D, string, n13, n10 + 1, n11 + 1);
            graphics2D.setColor(color.darker());
            FN.W(graphics2D, string, n13, n10, n11);
        }
    }

    protected void V(Graphics2D graphics2D, String string, int n10, int n11) {
        graphics2D.translate(n10, n11);
        GA.v(graphics2D, string, this.B);
        graphics2D.translate(-n10, -n11);
    }

    /*
     * Unable to fully structure code
     */
    public Dimension K(JLabel var1_1) {
        block9: {
            block6: {
                block8: {
                    block7: {
                        var3_2 = var1_1.getText();
                        var2_3 = W.B();
                        v0 = var1_1;
                        if (var2_3 != null) ** GOTO lbl9
                        if (v0.isEnabled()) {
                            v1 = var1_1.getIcon();
                        } else {
                            v0 = var1_1;
lbl9:
                            // 2 sources

                            v1 = v0.getDisabledIcon();
                        }
                        var4_4 = v1;
                        var5_5 = var1_1.getInsets(null);
                        var6_6 = var1_1.getFont();
                        var7_7 = var5_5.left + var5_5.right;
                        var8_8 = var5_5.top + var5_5.bottom;
                        if (var4_4 != null) break block6;
                        v2 = var3_2;
                        if (var2_3 != null) break block7;
                        if (v2 == null) break block8;
                        v2 = var3_2;
                    }
                    if (var2_3 != null) break block9;
                    if (v2 == null || var6_6 != null) break block6;
                }
                return new Dimension(var7_7, var8_8);
            }
            v2 = var3_2;
        }
        if (v2 == null || var4_4 != null && var6_6 == null) {
            return new Dimension(var4_4.getIconWidth() + var7_7, var4_4.getIconHeight() + var8_8);
        }
        var9_9 = var1_1.getFontMetrics(var6_6);
        var10_10 = new Rectangle();
        var11_11 = new Rectangle();
        var12_12 = new Rectangle();
        var10_10.height = 0;
        var10_10.width = 0;
        var10_10.y = 0;
        var10_10.x = 0;
        var11_11.height = 0;
        var11_11.width = 0;
        var11_11.y = 0;
        var11_11.x = 0;
        var12_12.x = var7_7;
        var12_12.y = var8_8;
        var12_12.width = var12_12.height = (int)v_0.g;
        this.d(var1_1, var9_9, var3_2, var4_4, var12_12, var10_10, var11_11);
        var13_13 = Math.min(var10_10.x, var11_11.x);
        var14_14 = Math.max(var10_10.x + var10_10.width, var11_11.x + var11_11.width);
        var15_15 = Math.min(var10_10.y, var11_11.y);
        var16_16 = Math.max(var10_10.y + var10_10.height, var11_11.y + var11_11.height);
        var17_17 = new Dimension(var14_14 - var13_13, var16_16 - var15_15);
        var17_17.width += var7_7;
        var17_17.height += var8_8;
        return var17_17;
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.Q((JLabel)jComponent);
    }

    @Override
    public Dimension d(JComponent jComponent) {
        return this.K((JLabel)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.A((JLabel)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.u(graphics2D, rectangle, (JLabel)jComponent);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\r[?\u000e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 35;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 12;
                            break;
                        }
                        case 2: {
                            n17 = 113;
                            break;
                        }
                        case 3: {
                            n17 = 65;
                            break;
                        }
                        case 4: {
                            n17 = 91;
                            break;
                        }
                        case 5: {
                            n17 = 110;
                            break;
                        }
                        default: {
                            n17 = 97;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 6720792543983592695L;
        g = 0x687B0F82E13C1B08L ^ l2;
    }
}

