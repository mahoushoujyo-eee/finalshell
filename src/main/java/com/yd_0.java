/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RV;
import com.eb_0;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;

/*
 * Renamed from com.Yd
 */
public class yd_0
extends BasicPopupMenuSeparatorUI {
    protected Color H = eb_0.M;
    protected Stroke o = eb_0.L;
    protected int I = eb_0.m;
    protected int u = eb_0.i;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new yd_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        LookAndFeel.installProperty(jComponent, a, Boolean.FALSE);
    }

    public Color Y() {
        return this.H;
    }

    public void D(Color color) {
        this.H = color;
    }

    public Stroke j() {
        return this.o;
    }

    public void o(Stroke stroke) {
        this.o = stroke;
    }

    public int A() {
        return this.I;
    }

    public void F(int n10) {
        this.I = n10;
    }

    public int I() {
        return this.u;
    }

    public void v(int n10) {
        this.u = n10;
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        Object object = RV.X(graphics2D);
        Stroke stroke = RV.M(graphics2D, this.o);
        graphics.setColor(this.H);
        graphics.drawLine(this.u, jComponent.getHeight() / 2, jComponent.getWidth() - this.u - 1, jComponent.getHeight() / 2);
        RV.p(graphics2D, stroke);
        RV.X(graphics2D, object);
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        return new Dimension(0, this.I * 2 + 1);
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
                char[] cArray3 = "J\t\u001d\u0014oi".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 72;
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
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 52;
                            break;
                        }
                        case 3: {
                            n17 = 45;
                            break;
                        }
                        case 4: {
                            n17 = 82;
                            break;
                        }
                        case 5: {
                            n17 = 68;
                            break;
                        }
                        default: {
                            n17 = 21;
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

