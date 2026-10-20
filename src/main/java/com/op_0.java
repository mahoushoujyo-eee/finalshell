/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.O_;
import com.RV;
import com.W2;
import com.au_0;
import com.oj_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;

/*
 * Renamed from com.Op
 */
public class op_0
extends O_
implements W2,
au_0 {
    private Color y = GO.FR;
    private Color d = GO.Q;
    private Color b = GO.Ft;
    private Color H = GO.Ff;
    private Color t = GO.FX;
    private final Stroke a = new BasicStroke(2.5f, 1, 1, 1.0f);
    private boolean J = false;
    private static final long[] c;
    private static final Integer[] e;

    public op_0() {
        this.L();
    }

    public op_0(Icon icon) {
        super(icon);
        this.L();
    }

    public op_0(Icon icon, int n10) {
        super(icon, n10);
        this.L();
    }

    public op_0(String string) {
        super(string);
        this.L();
    }

    public op_0(String string, int n10) {
        super(string, n10, new Object[0]);
        this.L();
    }

    public op_0(String string, Icon icon, int n10) {
        super(string, icon, n10, new Object[0]);
        this.L();
    }

    protected void L() {
        this.setOpaque(false);
        this.D(true);
        this.setForeground(Color.DARK_GRAY);
        this.q(Color.LIGHT_GRAY);
        this.x(op_0.b(32128, 5579374550264534920L));
        this.setHorizontalAlignment(0);
        FN.u(this);
        FN.O((Component)this, op_0.b(24821, 2808339090634590972L));
    }

    public Color E() {
        return this.y;
    }

    public void v(Color color) {
        this.y = color;
        this.repaint();
    }

    public Color i() {
        return this.d;
    }

    public void d(Color color) {
        this.d = color;
        this.repaint();
    }

    public Color e() {
        return this.b;
    }

    public void L(Color color) {
        this.b = color;
        this.repaint();
    }

    public Color K() {
        return this.H;
    }

    public void s(Color color) {
        this.H = color;
        this.repaint();
    }

    public Color O() {
        return this.t;
    }

    public void i(Color color) {
        this.t = color;
        this.repaint();
    }

    public boolean H() {
        return this.J;
    }

    public void G(boolean bl) {
        this.J = bl;
        this.repaint();
    }

    @Override
    public Shape B() {
        int n10 = this.getWidth();
        int n11 = this.getHeight();
        int n12 = Math.min(n10, n11);
        return new RoundRectangle2D.Double(n10 / 2 - n12 / 2 + 1, n11 / 2 - n12 / 2 + 1, n12 - 3, n12 - 3, this.getWidth() - 4, this.getHeight() - 4);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block9: {
            block10: {
                block5: {
                    block6: {
                        block8: {
                            block7: {
                                var3_2 = (Graphics2D)var1_1;
                                var2_3 = oj_0.V();
                                var4_4 = RV.X(var3_2);
                                var5_5 = this.getWidth();
                                var6_6 = this.getHeight();
                                var7_7 = Math.min(var5_5, var6_6);
                                v0 = this.getBackground();
                                if (var2_3) break block5;
                                if (v0 == null) break block6;
                                if (!this.J) break block7;
                                var3_2.setPaint(this.b);
                                if (!var2_3) break block8;
                            }
                            var3_2.setPaint(new GradientPaint(0.0f, 0.0f, this.y, 0.0f, this.getHeight(), this.d));
                        }
                        var3_2.fillRoundRect(var5_5 / 2 - var7_7 / 2 + 1, var6_6 / 2 - var7_7 / 2 + 1, var7_7 - 2, var7_7 - 2, this.getWidth() - 4, this.getHeight() - 4);
                    }
                    v1 = this;
                    if (var2_3) break block9;
                    v0 = v1.K();
                }
                if (v0 == null) break block10;
                var3_2.setStroke(this.a);
                v2 = this;
                if (var2_3) ** GOTO lbl30
                if (v2.isEnabled()) {
                    v3 = this.H;
                } else {
                    v2 = this;
lbl30:
                    // 2 sources

                    v3 = v2.t;
                }
                var3_2.setPaint(v3);
                var3_2.drawRoundRect(var5_5 / 2 - var7_7 / 2 + 1, var6_6 / 2 - var7_7 / 2 + 1, var7_7 - 3, var7_7 - 3, this.getWidth() - 4, this.getHeight() - 4);
            }
            RV.X(var3_2, var4_4);
            v1 = this;
        }
        super.paintComponent(var1_1);
    }

    @Override
    public Dimension getPreferredSize() {
        int n10;
        Dimension dimension = super.getPreferredSize();
        dimension.width = n10 = Math.max(dimension.width, dimension.height);
        dimension.height = n10;
        return dimension;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 990727641345555910L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00f1\u00bf\u00b5\u00ad\u00d2\u00d0\u00aaF,\u00b1\u00b8\u00f1y\u0091\u00b7.";
        int n11 = "\u00f1\u00bf\u00b5\u00ad\u00d2\u00d0\u00aaF,\u00b1\u00b8\u00f1y\u0091\u00b7.".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        e = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2A08;
        if (e[n11] == null) {
            op_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

