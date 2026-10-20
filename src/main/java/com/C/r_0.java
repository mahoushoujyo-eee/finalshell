/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.FN;
import com.GA;
import com.GO;
import com.ON;
import com.RV;
import com.c.H;
import com.c.d_0;
import com.c.j_0;
import com.c.m_2;
import com.c.n_0;
import com.c.u_0;
import com.ky_2;
import com.p6_0;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * Renamed from com.c.R
 */
public class r_0
extends BasicInternalFrameUI {
    protected Color t = H.e;
    protected int X = 1;
    protected p6_0 m;
    protected boolean Q = false;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new r_0((JInternalFrame)jComponent);
    }

    public r_0(JInternalFrame jInternalFrame) {
        super(jInternalFrame);
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.frame);
        LookAndFeel.installProperty(this.frame, a, Boolean.FALSE);
        this.frame.setBackground(this.t);
        this.frame.setBorder(GA.C(0, 0, 0, 0));
        this.m = new m_2(this);
        ON.b(this.frame, this.m);
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        ON.i(this.m);
        super.uninstallUI(jComponent);
    }

    @Override
    protected JComponent createNorthPane(JInternalFrame jInternalFrame) {
        this.titlePane = new d_0(jInternalFrame);
        return this.titlePane;
    }

    @Override
    protected JComponent createWestPane(JInternalFrame jInternalFrame) {
        return new j_0(this);
    }

    @Override
    protected JComponent createEastPane(JInternalFrame jInternalFrame) {
        return new n_0(this);
    }

    @Override
    protected JComponent createSouthPane(JInternalFrame jInternalFrame) {
        return new u_0(this);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        block3: {
            var4_3 = (Graphics2D)var1_1;
            var3_4 = d_0.W();
            var5_5 = RV.X(var4_3);
            v0 = var2_2.isEnabled();
            if (var3_4 != null) break block3;
            if (!v0) ** GOTO lbl-1000
            v0 = this.Q;
        }
        if (v0) {
            v1 = GO.c;
        } else lbl-1000:
        // 2 sources

        {
            v1 = GO.r;
        }
        GA.r(var4_3, var2_2, v1, GO.FG, GO.FT, true, false);
        var6_6 = var2_2.getInsets();
        var7_7 = var6_6.left + 3 + this.X;
        var8_8 = var6_6.top + this.titlePane.getHeight() - 1;
        var9_9 = var2_2.getWidth() - 1 - var6_6.left - 3 - this.X - var6_6.right - 3 - this.X;
        var10_10 = var2_2.getHeight() - 1 - var6_6.top - this.titlePane.getHeight() + 1 - var6_6.bottom - 3 - this.X;
        var11_11 = (GO.FT - 1) * 2;
        var4_3.setPaint(Color.GRAY);
        var4_3.draw(new RoundRectangle2D.Double(var7_7, var8_8, var9_9, var10_10, var11_11, var11_11));
        RV.X(var4_3, var5_5);
        if (var3_4 != null) {
            ky_2.K(new String[2]);
        }
    }

    static JInternalFrame D(r_0 r_02) {
        return r_02.frame;
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
                char[] cArray3 = "\u001a?|5\u0000>".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 114;
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
                            n17 = 7;
                            break;
                        }
                        case 1: {
                            n17 = 61;
                            break;
                        }
                        case 2: {
                            n17 = 111;
                            break;
                        }
                        case 3: {
                            n17 = 54;
                            break;
                        }
                        case 4: {
                            n17 = 7;
                            break;
                        }
                        case 5: {
                            n17 = 41;
                            break;
                        }
                        default: {
                            n17 = 4;
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

