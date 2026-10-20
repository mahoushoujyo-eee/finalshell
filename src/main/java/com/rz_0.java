/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.L0;
import com.RV;
import com.W2;
import com.aw_0;
import com.ky_2;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

/*
 * Renamed from com.Rz
 */
public class rz_0
extends BasicToolTipUI
implements W2,
L0 {
    private JComponent I = null;
    private static int r;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new rz_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.I = jComponent;
        FN.Y(this.I);
        LookAndFeel.installProperty(this.I, a, Boolean.FALSE);
        this.I.setBackground(aw_0.F);
        int n10 = rz_0.d();
        this.I.setForeground(aw_0.o);
        this.h();
        int n11 = n10;
        if (ky_2.F() != null) {
            rz_0.R(++n11);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.I = null;
        super.uninstallUI(jComponent);
    }

    @Override
    public Shape B() {
        return new RoundRectangle2D.Double(0.0, 0.0, this.I.getWidth(), this.I.getHeight(), aw_0.A * 2, aw_0.A * 2);
    }

    @Override
    public void h() {
        int n10 = rz_0.O();
        JComponent jComponent = this.I;
        if (n10 == 0) {
            if (FN.l(jComponent)) {
                return;
            }
            jComponent = this.I;
        }
        jComponent.setBorder(GA.y(aw_0.i));
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        int n10 = rz_0.O();
        Graphics2D graphics2D = (Graphics2D)graphics;
        Object object = RV.X(graphics2D);
        Composite composite = RV.p(graphics2D, Float.valueOf(aw_0.Q));
        graphics2D.setPaint(jComponent.getBackground());
        graphics2D.fillRoundRect(0, 0, jComponent.getWidth(), jComponent.getHeight(), aw_0.A * 2, aw_0.A * 2);
        RV.c(graphics2D, composite);
        RV.X(graphics2D, object);
        Map map = FN.Y(graphics2D);
        int n11 = n10;
        super.paint(graphics, jComponent);
        FN.k(graphics2D, map);
        if (n11 != 0) {
            ky_2.K(new String[1]);
        }
    }

    public static void R(int n10) {
        r = n10;
    }

    public static int O() {
        return r;
    }

    public static int d() {
        int n10 = rz_0.O();
        if (n10 == 0) {
            return 34;
        }
        return 0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (rz_0.O() != 0) {
                    rz_0.R(15);
                }
                char[] cArray3 = "0YI\u0016MB".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 37;
                            break;
                        }
                        case 1: {
                            n17 = 83;
                            break;
                        }
                        case 2: {
                            n17 = 82;
                            break;
                        }
                        case 3: {
                            n17 = 29;
                            break;
                        }
                        case 4: {
                            n17 = 66;
                            break;
                        }
                        case 5: {
                            n17 = 93;
                            break;
                        }
                        default: {
                            n17 = 27;
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

