/*
 * Decompiled with CFR 0.152.
 */
package com.U;

import com.GO;
import com.KD;
import com.RV;
import com.U.O;
import com.U.y;
import com.ky_2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.beans.PropertyChangeEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

class f
extends BasicSplitPaneDivider {
    protected final Border m;
    protected final Color e;
    protected final Color[] k;
    final y K;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    f(y y2, BasicSplitPaneUI basicSplitPaneUI) {
        this.K = y2;
        super(basicSplitPaneUI);
        this.m = BorderFactory.createEmptyBorder(0, 0, 0, 0);
        this.e = new Color(f.a(20066, 7593633442637922697L), f.a(305, 7863712319510154969L), f.a(305, 7863712319510154969L));
        this.k = new Color[]{GO.l, this.e, this.e, GO.l};
    }

    @Override
    public Border getBorder() {
        return this.m;
    }

    @Override
    protected JButton createLeftOneTouchButton() {
        boolean bl = O.r();
        boolean bl2 = this.orientation;
        if (bl) {
            bl2 = bl2;
        }
        boolean bl3 = bl2;
        ImageIcon imageIcon = this.K.N(true, bl3);
        KD kD = KD.F(imageIcon, 0, 0, 0, false, true, false);
        kD.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        kD.setCursor(Cursor.getDefaultCursor());
        kD.setPreferredSize(this.K.E(bl3));
        kD.setFocusable(false);
        return kD;
    }

    @Override
    protected JButton createRightOneTouchButton() {
        boolean bl = O.r();
        boolean bl2 = this.orientation;
        if (bl) {
            bl2 = bl2;
        }
        boolean bl3 = bl2;
        ImageIcon imageIcon = this.K.N(false, bl3);
        KD kD = KD.F(imageIcon, 0, 0, 0, false, true, false);
        kD.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        kD.setCursor(Cursor.getDefaultCursor());
        kD.setPreferredSize(this.K.E(bl3));
        kD.setFocusable(false);
        if (ky_2.F() != null) {
            O.o(!bl);
        }
        return kD;
    }

    @Override
    public void paint(Graphics graphics) {
        block11: {
            f f10;
            Object object;
            Graphics2D graphics2D;
            block15: {
                block14: {
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    boolean bl;
                    int n15;
                    block12: {
                        block13: {
                            block10: {
                                n15 = f.a(20309, 64345082587463868L);
                                bl = O.r();
                                graphics2D = (Graphics2D)graphics;
                                object = RV.X(graphics2D);
                                n14 = this.orientation;
                                n13 = 1;
                                if (!bl) break block12;
                                if (n14 != n13) break block13;
                                n12 = this.getHeight() / 2 - n15;
                                n11 = this.getHeight() / 2 + n15;
                                graphics2D.setPaint(new LinearGradientPaint(0.0f, n12, 0.0f, n11, new float[]{0.0f, 0.25f, 0.75f, 1.0f}, this.k));
                                for (n10 = n12; n10 < n11; n10 += 6) {
                                    graphics2D.fillRect(this.getWidth() / 2 - 1, n10 - 1, 2, 2);
                                    if (bl) {
                                        if (bl) continue;
                                        ky_2.K(new String[2]);
                                        break;
                                    }
                                    break block10;
                                }
                                if (this.K.B) {
                                    graphics2D.setPaint(this.K.m);
                                    graphics2D.drawLine(0, 0, 0, this.getHeight() - 1);
                                    graphics2D.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
                                }
                            }
                            if (bl) break block14;
                        }
                        n14 = this.getWidth() / 2;
                        n13 = n15;
                    }
                    n12 = n14 - n13;
                    n11 = this.getWidth() / 2 + n15;
                    graphics2D.setPaint(new LinearGradientPaint(n12, 0.0f, n11, 0.0f, new float[]{0.0f, 0.25f, 0.75f, 1.0f}, this.k));
                    for (n10 = n12; n10 < n11; n10 += 6) {
                        graphics2D.fillRect(n10 - 1, this.getHeight() / 2 - 1, 2, 2);
                        if (bl) {
                            if (bl) continue;
                        }
                        break block11;
                    }
                    f10 = this;
                    if (!bl) break block15;
                    if (f10.K.B) {
                        graphics2D.setPaint(this.K.m);
                        graphics2D.drawLine(0, 0, this.getWidth() - 1, 0);
                        graphics2D.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
                    }
                }
                f10 = this;
            }
            super.paint(graphics);
            RV.X(graphics2D, object);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block7: {
            JButton jButton;
            boolean bl;
            block9: {
                int n10;
                boolean bl2;
                block8: {
                    PropertyChangeEvent propertyChangeEvent2;
                    block6: {
                        boolean bl3 = O.r();
                        super.propertyChange(propertyChangeEvent);
                        bl2 = bl3;
                        propertyChangeEvent2 = propertyChangeEvent;
                        if (!bl2) break block6;
                        if (propertyChangeEvent2.getSource() != this.splitPane) break block7;
                        propertyChangeEvent2 = propertyChangeEvent;
                    }
                    n10 = propertyChangeEvent2.getPropertyName().equals(a);
                    if (!bl2) break block8;
                    if (n10 == 0) break block7;
                    n10 = this.orientation;
                }
                if (bl2) {
                    n10 = n10 == 1 ? 1 : 0;
                }
                bl = n10;
                jButton = this.leftButton;
                if (bl2) {
                    if (jButton != null) {
                        this.leftButton.setIcon(this.K.N(true, bl));
                        this.leftButton.setPreferredSize(this.K.E(bl));
                    }
                    jButton = this.rightButton;
                }
                if (!bl2) break block9;
                if (jButton == null) break block7;
                this.rightButton.setIcon(this.K.N(false, bl));
                jButton = this.rightButton;
            }
            jButton.setPreferredSize(this.K.E(bl));
        }
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
                char[] cArray3 = "z\u0016FJ\u001d.\u0014a\r@A".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 103;
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
                            n17 = 114;
                            break;
                        }
                        case 1: {
                            n17 = 3;
                            break;
                        }
                        case 2: {
                            n17 = 72;
                            break;
                        }
                        case 3: {
                            n17 = 72;
                            break;
                        }
                        case 4: {
                            n17 = 20;
                            break;
                        }
                        case 5: {
                            n17 = 61;
                            break;
                        }
                        default: {
                            n17 = 18;
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
        long l2 = 2626633179351483356L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u0096\u00f75\u00ba4+Ct5\u00b8\u00ca\u000b\u0016\u00c4\r\u009b\u00d0\u0014\u001b\u0090\u00d4u\u00c2\u00cb";
        int n19 = "\u0096\u00f75\u00ba4+Ct5\u00b8\u00ca\u000b\u0016\u00c4\r\u009b\u00d0\u0014\u001b\u0090\u00d4u\u00c2\u00cb".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xFE9;
        if (c[n11] == null) {
            f.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

