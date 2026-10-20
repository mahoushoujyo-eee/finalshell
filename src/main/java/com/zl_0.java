/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.RV;
import com.TA;
import com.W2;
import com.bj_0;
import com.ea_2;
import com.pb_2;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.zl
 */
public class zl_0
extends BasicMenuBarUI
implements W2,
L0 {
    private Color Q = ea_2.k;
    private Color K = ea_2.E;
    private boolean m = ea_2.V;
    private int X = ea_2.g;
    private int j = ea_2.b;
    private bj_0 h = ea_2.x;
    private Color S = ea_2.d;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new zl_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.menuBar);
        LookAndFeel.installProperty(this.menuBar, a, Boolean.FALSE);
        this.menuBar.setLayout(new TA(0));
        this.h();
    }

    @Override
    public Shape B() {
        return GA.X(this.menuBar, this.g(), this.K());
    }

    @Override
    public void h() {
        Insets insets;
        block8: {
            block6: {
                int[] nArray;
                block7: {
                    boolean bl;
                    block5: {
                        nArray = pb_2.g();
                        bl = FN.l(this.menuBar);
                        if (nArray != null) {
                            if (bl) {
                                return;
                            }
                            bl = this.m;
                        }
                        if (nArray == null) break block5;
                        if (bl) break block6;
                        bl = this.h.equals((Object)bj_0.attached);
                    }
                    if (!bl) break block7;
                    insets = new Insets(0, 0, 1 + this.j, 0);
                    if (nArray != null) break block8;
                }
                insets = new Insets(1 + this.j, 1 + this.j, 1 + this.j, 1 + this.j);
                if (nArray != null) break block8;
            }
            insets = new Insets(0, 0, 0, 0);
        }
        this.menuBar.setBorder(GA.y(insets));
    }

    public Color T() {
        return this.Q;
    }

    public void s(Color color) {
        this.Q = color;
    }

    public Color k() {
        return this.K;
    }

    public void j(Color color) {
        this.K = color;
    }

    public boolean O() {
        return this.m;
    }

    public void j(boolean bl) {
        this.m = bl;
        this.h();
    }

    public bj_0 w() {
        return this.h;
    }

    public void v(bj_0 bj_02) {
        this.h = bj_02;
        this.h();
    }

    public Color O() {
        return this.S;
    }

    public void w(Color color) {
        this.S = color;
    }

    public int K() {
        return this.X;
    }

    public void N(int n10) {
        this.X = n10;
    }

    public int g() {
        return this.j;
    }

    public void g(int n10) {
        this.j = n10;
        this.h();
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        block2: {
            Graphics2D graphics2D;
            block3: {
                int[] nArray = pb_2.g();
                if (this.m) break block2;
                graphics2D = (Graphics2D)graphics;
                if (this.h != bj_0.attached) break block3;
                Line2D.Double double_ = new Line2D.Double(0.0, jComponent.getHeight() - 1 - this.j, jComponent.getWidth() - 1, jComponent.getHeight() - 1 - this.j);
                RV.Y(graphics2D, double_, GO.r, this.j);
                graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, this.Q, 0.0f, jComponent.getHeight(), this.K));
                graphics2D.fillRect(0, 0, jComponent.getWidth(), jComponent.getHeight() - this.j);
                graphics2D.setPaint(this.S);
                graphics2D.draw(double_);
                if (nArray != null) break block2;
            }
            GA.R(graphics2D, jComponent, GO.r, this.j, this.X, true, true, this.S);
        }
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
                char[] cArray3 = "\u0006Y\u0004\b\u001cp".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
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
                            n17 = 76;
                            break;
                        }
                        case 1: {
                            n17 = 12;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 92;
                            break;
                        }
                        case 4: {
                            n17 = 76;
                            break;
                        }
                        case 5: {
                            n17 = 48;
                            break;
                        }
                        default: {
                            n17 = 51;
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
    }
}

