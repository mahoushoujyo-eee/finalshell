/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.W0;
import com.aL;
import com.ky_2;
import com.lg_2;
import com.nx_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Renamed from com.Br
 */
public class br_0
extends JComponent {
    public static final ImageIcon z;
    public static final ImageIcon o;
    private List x = new ArrayList(1);
    private Color S = new Color(br_0.a(29025, 8036109411744817150L), br_0.a(1289, 17795450042706839L), br_0.a(1289, 17795450042706839L));
    private Color j = Color.WHITE;
    private Color m = Color.BLACK;
    private Color n = Color.WHITE;
    private lg_2 G = lg_2.colorSwitch;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public br_0() {
        FN.Y(this);
        this.setPreferredSize(new Dimension(br_0.a(24055, 5635250661245891431L), br_0.a(26371, 4954311524471212447L)));
        this.X();
    }

    public Color l() {
        return this.m;
    }

    public Color N() {
        return this.m;
    }

    public void V(Color color) {
        this.m = color;
        this.repaint();
    }

    public Color Y() {
        return this.n;
    }

    public void Z(Color color) {
        this.n = color;
        this.repaint();
    }

    private void X() {
        W0 w0 = new W0(this);
        this.addMouseListener(w0);
        this.addMouseMotionListener(w0);
    }

    private void X(lg_2 lg_22) {
        block3: {
            block2: {
                int n10 = nx_2.R();
                if (n10 != 0) break block2;
                if (lg_22 == this.G) break block3;
                this.F(lg_22);
            }
            this.G = lg_22;
        }
    }

    public void F(lg_2 lg_22) {
        block4: {
            block3: {
                int n10;
                block2: {
                    n10 = nx_2.R();
                    if (n10 != 0) break block2;
                    if (lg_22 != null) break block3;
                    this.setToolTipText(null);
                }
                if (n10 == 0) break block4;
            }
            this.setToolTipText("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12930 out of bounds for length 13");
        }
    }

    public void D() {
        Color color = this.n;
        this.n = this.m;
        this.m = color;
        this.repaint();
        this.g();
    }

    public void Q() {
        this.m = Color.BLACK;
        this.n = Color.WHITE;
        this.repaint();
        this.g();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d(MouseEvent mouseEvent) {
        int n10;
        int n11;
        int n12;
        block6: {
            block7: {
                n12 = nx_2.c();
                n11 = mouseEvent.getX();
                n10 = br_0.a(12044, 1382129844077478289L);
                if (n12 == 0) break block6;
                if (n11 > n10) break block7;
                n11 = mouseEvent.getY();
                n10 = br_0.a(26571, 2975496112236923217L);
                if (n12 == 0) break block6;
                if (n11 <= n10) return 0 != 0;
            }
            n11 = mouseEvent.getX();
            n10 = this.getWidth() - 1 - br_0.a(695, 8457130778011823148L);
        }
        if (n12 != 0) {
            if (n11 < n10) return 0 != 0;
            n11 = mouseEvent.getX();
            n10 = this.getWidth() - 5;
        }
        if (n12 != 0) {
            if (n11 > n10) return 0 != 0;
            n11 = mouseEvent.getY();
            n10 = this.getHeight() - 1 - br_0.a(695, 8457130778011823148L);
        }
        if (n12 != 0) {
            if (n11 < n10) return 0 != 0;
            n11 = mouseEvent.getY();
            if (n12 == 0) return n11 != 0;
            n10 = this.getHeight() - 5;
        }
        if (n11 > n10) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean r(MouseEvent mouseEvent) {
        int n10 = nx_2.c();
        int n11 = mouseEvent.getX();
        int n12 = 4;
        if (n10 != 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getX();
            n12 = br_0.a(18123, 355485021686245459L);
        }
        if (n10 != 0) {
            if (n11 > n12) return 0 != 0;
            n11 = mouseEvent.getY();
            n12 = 4;
        }
        if (n10 != 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getY();
            if (n10 == 0) return n11 != 0;
            n12 = br_0.a(695, 8457130778011823148L);
        }
        if (n11 > n12) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean v(MouseEvent mouseEvent) {
        int n10 = nx_2.R();
        int n11 = mouseEvent.getX();
        int n12 = 1;
        if (n10 == 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getX();
            n12 = 1 + z.getIconWidth();
        }
        if (n10 == 0) {
            if (n11 > n12) return 0 != 0;
            n11 = mouseEvent.getY();
            n12 = this.getHeight() - z.getIconHeight() - 1;
        }
        if (n10 == 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getY();
            if (n10 != 0) return n11 != 0;
            n12 = this.getHeight() - 1;
        }
        if (n11 > n12) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean C(MouseEvent mouseEvent) {
        int n10 = nx_2.c();
        int n11 = mouseEvent.getX();
        int n12 = this.getWidth() - o.getIconWidth() - 1;
        if (n10 != 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getX();
            n12 = this.getWidth() - 1;
        }
        if (n10 != 0) {
            if (n11 > n12) return 0 != 0;
            n11 = mouseEvent.getY();
            n12 = 1;
        }
        if (n10 != 0) {
            if (n11 < n12) return 0 != 0;
            n11 = mouseEvent.getY();
            if (n10 == 0) return n11 != 0;
            n12 = 1 + o.getIconHeight();
        }
        if (n11 > n12) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void paint(Graphics graphics) {
        int n10 = nx_2.R();
        super.paint(graphics);
        int n11 = n10;
        boolean bl = this.isEnabled();
        if (n11 == 0) {
            if (!bl) {
                graphics.setXORMode(Color.GRAY);
            }
            graphics.setColor(this.S);
            graphics.drawRect(this.getWidth() - 3 - br_0.a(695, 8457130778011823148L), this.getHeight() - 3 - br_0.a(695, 8457130778011823148L), br_0.a(695, 8457130778011823148L), br_0.a(695, 8457130778011823148L));
            graphics.setColor(this.j);
            graphics.drawRect(this.getWidth() - 2 - br_0.a(695, 8457130778011823148L), this.getHeight() - 2 - br_0.a(695, 8457130778011823148L), br_0.a(454, 6546196809023778645L), br_0.a(3531, 3076479321648915290L));
            graphics.setColor(this.n);
            graphics.fillRect(this.getWidth() - 1 - br_0.a(695, 8457130778011823148L), this.getHeight() - 1 - br_0.a(695, 8457130778011823148L), br_0.a(8028, 1287854027348275653L), br_0.a(4380, 1829129849519439758L));
            graphics.setColor(this.S);
            graphics.drawRect(2, 2, br_0.a(695, 8457130778011823148L), br_0.a(695, 8457130778011823148L));
            graphics.setColor(this.j);
            graphics.drawRect(3, 3, br_0.a(3531, 3076479321648915290L), br_0.a(3531, 3076479321648915290L));
            graphics.setColor(this.m);
            graphics.fillRect(4, 4, br_0.a(4380, 1829129849519439758L), br_0.a(4380, 1829129849519439758L));
            bl = this.isEnabled();
        }
        if (n11 == 0) {
            if (!bl) {
                graphics.setPaintMode();
            }
            graphics.drawImage(o.getImage(), this.getWidth() - o.getIconWidth() - 1, 1, o.getImageObserver());
            bl = graphics.drawImage(z.getImage(), 1, this.getHeight() - z.getIconHeight() - 1, z.getImageObserver());
        }
        if (ky_2.F() != null) {
            nx_2.b(++n11);
        }
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.repaint();
    }

    public void v(ActionListener actionListener) {
        this.x.add(actionListener);
    }

    public void Y(ActionListener actionListener) {
        this.x.remove(actionListener);
    }

    private void g() {
        ActionEvent actionEvent = new ActionEvent(this, 0, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 12928 out of bounds for length 13");
        int n10 = nx_2.R();
        for (ActionListener actionListener : aL.J((Collection)this.x)) {
            actionListener.actionPerformed(actionEvent);
            if (n10 == 0) continue;
        }
    }

    static boolean P(br_0 br_02, MouseEvent mouseEvent) {
        return br_02.C(mouseEvent);
    }

    static boolean d(br_0 br_02, MouseEvent mouseEvent) {
        return br_02.v(mouseEvent);
    }

    static boolean k(br_0 br_02, MouseEvent mouseEvent) {
        return br_02.r(mouseEvent);
    }

    static Color E(br_0 br_02) {
        return br_02.m;
    }

    static Color a(br_0 br_02, Color color) {
        br_02.m = color;
        return br_02.m;
    }

    static void Z(br_0 br_02) {
        br_02.g();
    }

    static boolean D(br_0 br_02, MouseEvent mouseEvent) {
        return br_02.d(mouseEvent);
    }

    static Color h(br_0 br_02) {
        return br_02.n;
    }

    static Color e(br_0 br_02, Color color) {
        br_02.n = color;
        return br_02.n;
    }

    static void X(br_0 br_02, lg_2 lg_22) {
        br_02.X(lg_22);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "\u008drG\u00c4\u00e5\u00e9\u001e\u00c6\u00adb\u00f8\u0014#\u0010\u00d0*\u0080C\u007f7|\u00ec\u00fb\u00c1?4\u0015n\u0090\u00d4";
                        var12_3 = "\u008drG\u00c4\u00e5\u00e9\u001e\u00c6\u00adb\u00f8\u0014#\u0010\u00d0*\u0080C\u007f7|\u00ec\u00fb\u00c1?4\u0015n\u0090\u00d4".length();
                        var9_4 = 13;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 70;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\b\u00ef\u009b\f\u00b1\u00bb\u009f\u00ae\u00de\b\u0096\u00c1\u00c8\u008a\u00c9\u001d\u00b9\u0096Q\u00e1\u00ed\u008e`z\u00f6h\u00ec\u00bfM\u00b9(H\r2\u00d6\u0011\u00f4\u00a4\u007f\u00e9\u00fb\u0019\u0080@\u00e5j\u007f\u0089\u00e8x[\u00f1\u00b8";
                            var12_3 = "\b\u00ef\u009b\f\u00b1\u00bb\u009f\u00ae\u00de\b\u0096\u00c1\u00c8\u008a\u00c9\u001d\u00b9\u0096Q\u00e1\u00ed\u008e`z\u00f6h\u00ec\u00bfM\u00b9(H\r2\u00d6\u0011\u00f4\u00a4\u007f\u00e9\u00fb\u0019\u0080@\u00e5j\u007f\u0089\u00e8x[\u00f1\u00b8".length();
                            var9_4 = 35;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 23;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 51;
                                    break;
                                }
                                case 1: {
                                    v15 = 12;
                                    break;
                                }
                                case 2: {
                                    v15 = 89;
                                    break;
                                }
                                case 3: {
                                    v15 = 104;
                                    break;
                                }
                                case 4: {
                                    v15 = 59;
                                    break;
                                }
                                case 5: {
                                    v15 = 80;
                                    break;
                                }
                                default: {
                                    v15 = 20;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                br_0.a = var13;
                br_0.b = new String[4];
                var0_7 = 2650374490423856329L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "\u0017\u00f6\u00a1g\u0087\b\u0085\u0086\u00c7\u001e/\u00b9\u0005\u0012`\u00f9!\u00a7\u00f7.\u00ef\u00ec$\u0086\u00043\u00c7 \u0099\u00de\u00fd\u0015L^\u001a\u00fb\u0091\u0011g\u009e\u009eQ+\u00b5HA\u0093\u00f7dd\u001e\r\u009d\u00c3\u0085z\u00eai:\u0012\u00b2\u00cc\u00cdFG\u00c5\r\u00ff\u00b7\u00d3\u00f3^H\u00b6\u00f3\u0004\u0000\u00d0\u00e3\u0086";
                var5_11 = "\u0017\u00f6\u00a1g\u0087\b\u0085\u0086\u00c7\u001e/\u00b9\u0005\u0012`\u00f9!\u00a7\u00f7.\u00ef\u00ec$\u0086\u00043\u00c7 \u0099\u00de\u00fd\u0015L^\u001a\u00fb\u0091\u0011g\u009e\u009eQ+\u00b5HA\u0093\u00f7dd\u001e\r\u009d\u00c3\u0085z\u00eai:\u0012\u00b2\u00cc\u00cdFG\u00c5\r\u00ff\u00b7\u00d3\u00f3^H\u00b6\u00f3\u0004\u0000\u00d0\u00e3\u0086".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00ec\u00ab\u000fw\u001c\u00a0?\u0082>q\u0090y\"\u00cfo\u0089";
                    var5_11 = "\u00ec\u00ab\u000fw\u001c\u00a0?\u0082>q\u0090y\"\u00cfo\u0089".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        br_0.c = var6_8;
        br_0.d = new Integer[12];
        br_0.z = new ImageIcon(br_0.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12931 out of bounds for length 13"));
        br_0.o = new ImageIcon(br_0.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12929 out of bounds for length 13"));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x5F19) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 209;
                    break;
                }
                case 1: {
                    n14 = 179;
                    break;
                }
                case 2: {
                    n14 = 182;
                    break;
                }
                case 3: {
                    n14 = 11;
                    break;
                }
                case 4: {
                    n14 = 50;
                    break;
                }
                case 5: {
                    n14 = 59;
                    break;
                }
                case 6: {
                    n14 = 171;
                    break;
                }
                case 7: {
                    n14 = 175;
                    break;
                }
                case 8: {
                    n14 = 118;
                    break;
                }
                case 9: {
                    n14 = 83;
                    break;
                }
                case 10: {
                    n14 = 51;
                    break;
                }
                case 11: {
                    n14 = 20;
                    break;
                }
                case 12: {
                    n14 = 73;
                    break;
                }
                case 13: {
                    n14 = 29;
                    break;
                }
                case 14: {
                    n14 = 99;
                    break;
                }
                case 15: {
                    n14 = 28;
                    break;
                }
                case 16: {
                    n14 = 1;
                    break;
                }
                case 17: {
                    n14 = 132;
                    break;
                }
                case 18: {
                    n14 = 211;
                    break;
                }
                case 19: {
                    n14 = 72;
                    break;
                }
                case 20: {
                    n14 = 33;
                    break;
                }
                case 21: {
                    n14 = 100;
                    break;
                }
                case 22: {
                    n14 = 62;
                    break;
                }
                case 23: {
                    n14 = 112;
                    break;
                }
                case 24: {
                    n14 = 116;
                    break;
                }
                case 25: {
                    n14 = 157;
                    break;
                }
                case 26: {
                    n14 = 190;
                    break;
                }
                case 27: {
                    n14 = 162;
                    break;
                }
                case 28: {
                    n14 = 38;
                    break;
                }
                case 29: {
                    n14 = 32;
                    break;
                }
                case 30: {
                    n14 = 208;
                    break;
                }
                case 31: {
                    n14 = 114;
                    break;
                }
                case 32: {
                    n14 = 82;
                    break;
                }
                case 33: {
                    n14 = 158;
                    break;
                }
                case 34: {
                    n14 = 201;
                    break;
                }
                case 35: {
                    n14 = 113;
                    break;
                }
                case 36: {
                    n14 = 137;
                    break;
                }
                case 37: {
                    n14 = 150;
                    break;
                }
                case 38: {
                    n14 = 95;
                    break;
                }
                case 39: {
                    n14 = 181;
                    break;
                }
                case 40: {
                    n14 = 9;
                    break;
                }
                case 41: {
                    n14 = 71;
                    break;
                }
                case 42: {
                    n14 = 224;
                    break;
                }
                case 43: {
                    n14 = 205;
                    break;
                }
                case 44: {
                    n14 = 117;
                    break;
                }
                case 45: {
                    n14 = 212;
                    break;
                }
                case 46: {
                    n14 = 155;
                    break;
                }
                case 47: {
                    n14 = 3;
                    break;
                }
                case 48: {
                    n14 = 126;
                    break;
                }
                case 49: {
                    n14 = 153;
                    break;
                }
                case 50: {
                    n14 = 188;
                    break;
                }
                case 51: {
                    n14 = 133;
                    break;
                }
                case 52: {
                    n14 = 39;
                    break;
                }
                case 53: {
                    n14 = 119;
                    break;
                }
                case 54: {
                    n14 = 249;
                    break;
                }
                case 55: {
                    n14 = 195;
                    break;
                }
                case 56: {
                    n14 = 31;
                    break;
                }
                case 57: {
                    n14 = 206;
                    break;
                }
                case 58: {
                    n14 = 198;
                    break;
                }
                case 59: {
                    n14 = 202;
                    break;
                }
                case 60: {
                    n14 = 154;
                    break;
                }
                case 61: {
                    n14 = 43;
                    break;
                }
                case 62: {
                    n14 = 196;
                    break;
                }
                case 63: {
                    n14 = 138;
                    break;
                }
                case 64: {
                    n14 = 120;
                    break;
                }
                case 65: {
                    n14 = 30;
                    break;
                }
                case 66: {
                    n14 = 42;
                    break;
                }
                case 67: {
                    n14 = 241;
                    break;
                }
                case 68: {
                    n14 = 167;
                    break;
                }
                case 69: {
                    n14 = 87;
                    break;
                }
                case 70: {
                    n14 = 203;
                    break;
                }
                case 71: {
                    n14 = 67;
                    break;
                }
                case 72: {
                    n14 = 92;
                    break;
                }
                case 73: {
                    n14 = 187;
                    break;
                }
                case 74: {
                    n14 = 185;
                    break;
                }
                case 75: {
                    n14 = 0;
                    break;
                }
                case 76: {
                    n14 = 76;
                    break;
                }
                case 77: {
                    n14 = 77;
                    break;
                }
                case 78: {
                    n14 = 228;
                    break;
                }
                case 79: {
                    n14 = 221;
                    break;
                }
                case 80: {
                    n14 = 115;
                    break;
                }
                case 81: {
                    n14 = 97;
                    break;
                }
                case 82: {
                    n14 = 227;
                    break;
                }
                case 83: {
                    n14 = 56;
                    break;
                }
                case 84: {
                    n14 = 142;
                    break;
                }
                case 85: {
                    n14 = 204;
                    break;
                }
                case 86: {
                    n14 = 19;
                    break;
                }
                case 87: {
                    n14 = 66;
                    break;
                }
                case 88: {
                    n14 = 199;
                    break;
                }
                case 89: {
                    n14 = 251;
                    break;
                }
                case 90: {
                    n14 = 108;
                    break;
                }
                case 91: {
                    n14 = 109;
                    break;
                }
                case 92: {
                    n14 = 229;
                    break;
                }
                case 93: {
                    n14 = 129;
                    break;
                }
                case 94: {
                    n14 = 16;
                    break;
                }
                case 95: {
                    n14 = 222;
                    break;
                }
                case 96: {
                    n14 = 60;
                    break;
                }
                case 97: {
                    n14 = 178;
                    break;
                }
                case 98: {
                    n14 = 64;
                    break;
                }
                case 99: {
                    n14 = 12;
                    break;
                }
                case 100: {
                    n14 = 103;
                    break;
                }
                case 101: {
                    n14 = 52;
                    break;
                }
                case 102: {
                    n14 = 8;
                    break;
                }
                case 103: {
                    n14 = 36;
                    break;
                }
                case 104: {
                    n14 = 22;
                    break;
                }
                case 105: {
                    n14 = 10;
                    break;
                }
                case 106: {
                    n14 = 54;
                    break;
                }
                case 107: {
                    n14 = 180;
                    break;
                }
                case 108: {
                    n14 = 125;
                    break;
                }
                case 109: {
                    n14 = 217;
                    break;
                }
                case 110: {
                    n14 = 45;
                    break;
                }
                case 111: {
                    n14 = 136;
                    break;
                }
                case 112: {
                    n14 = 105;
                    break;
                }
                case 113: {
                    n14 = 135;
                    break;
                }
                case 114: {
                    n14 = 75;
                    break;
                }
                case 115: {
                    n14 = 220;
                    break;
                }
                case 116: {
                    n14 = 183;
                    break;
                }
                case 117: {
                    n14 = 2;
                    break;
                }
                case 118: {
                    n14 = 253;
                    break;
                }
                case 119: {
                    n14 = 159;
                    break;
                }
                case 120: {
                    n14 = 89;
                    break;
                }
                case 121: {
                    n14 = 61;
                    break;
                }
                case 122: {
                    n14 = 250;
                    break;
                }
                case 123: {
                    n14 = 146;
                    break;
                }
                case 124: {
                    n14 = 57;
                    break;
                }
                case 125: {
                    n14 = 18;
                    break;
                }
                case 126: {
                    n14 = 173;
                    break;
                }
                case 127: {
                    n14 = 13;
                    break;
                }
                case 128: {
                    n14 = 79;
                    break;
                }
                case 129: {
                    n14 = 102;
                    break;
                }
                case 130: {
                    n14 = 247;
                    break;
                }
                case 131: {
                    n14 = 63;
                    break;
                }
                case 132: {
                    n14 = 235;
                    break;
                }
                case 133: {
                    n14 = 238;
                    break;
                }
                case 134: {
                    n14 = 225;
                    break;
                }
                case 135: {
                    n14 = 121;
                    break;
                }
                case 136: {
                    n14 = 68;
                    break;
                }
                case 137: {
                    n14 = 98;
                    break;
                }
                case 138: {
                    n14 = 151;
                    break;
                }
                case 139: {
                    n14 = 194;
                    break;
                }
                case 140: {
                    n14 = 70;
                    break;
                }
                case 141: {
                    n14 = 164;
                    break;
                }
                case 142: {
                    n14 = 161;
                    break;
                }
                case 143: {
                    n14 = 163;
                    break;
                }
                case 144: {
                    n14 = 78;
                    break;
                }
                case 145: {
                    n14 = 176;
                    break;
                }
                case 146: {
                    n14 = 122;
                    break;
                }
                case 147: {
                    n14 = 226;
                    break;
                }
                case 148: {
                    n14 = 245;
                    break;
                }
                case 149: {
                    n14 = 23;
                    break;
                }
                case 150: {
                    n14 = 232;
                    break;
                }
                case 151: {
                    n14 = 255;
                    break;
                }
                case 152: {
                    n14 = 123;
                    break;
                }
                case 153: {
                    n14 = 252;
                    break;
                }
                case 154: {
                    n14 = 192;
                    break;
                }
                case 155: {
                    n14 = 44;
                    break;
                }
                case 156: {
                    n14 = 65;
                    break;
                }
                case 157: {
                    n14 = 223;
                    break;
                }
                case 158: {
                    n14 = 239;
                    break;
                }
                case 159: {
                    n14 = 246;
                    break;
                }
                case 160: {
                    n14 = 27;
                    break;
                }
                case 161: {
                    n14 = 48;
                    break;
                }
                case 162: {
                    n14 = 148;
                    break;
                }
                case 163: {
                    n14 = 186;
                    break;
                }
                case 164: {
                    n14 = 128;
                    break;
                }
                case 165: {
                    n14 = 168;
                    break;
                }
                case 166: {
                    n14 = 189;
                    break;
                }
                case 167: {
                    n14 = 84;
                    break;
                }
                case 168: {
                    n14 = 193;
                    break;
                }
                case 169: {
                    n14 = 143;
                    break;
                }
                case 170: {
                    n14 = 4;
                    break;
                }
                case 171: {
                    n14 = 127;
                    break;
                }
                case 172: {
                    n14 = 244;
                    break;
                }
                case 173: {
                    n14 = 106;
                    break;
                }
                case 174: {
                    n14 = 242;
                    break;
                }
                case 175: {
                    n14 = 236;
                    break;
                }
                case 176: {
                    n14 = 215;
                    break;
                }
                case 177: {
                    n14 = 207;
                    break;
                }
                case 178: {
                    n14 = 219;
                    break;
                }
                case 179: {
                    n14 = 191;
                    break;
                }
                case 180: {
                    n14 = 47;
                    break;
                }
                case 181: {
                    n14 = 81;
                    break;
                }
                case 182: {
                    n14 = 93;
                    break;
                }
                case 183: {
                    n14 = 94;
                    break;
                }
                case 184: {
                    n14 = 53;
                    break;
                }
                case 185: {
                    n14 = 149;
                    break;
                }
                case 186: {
                    n14 = 26;
                    break;
                }
                case 187: {
                    n14 = 111;
                    break;
                }
                case 188: {
                    n14 = 130;
                    break;
                }
                case 189: {
                    n14 = 230;
                    break;
                }
                case 190: {
                    n14 = 140;
                    break;
                }
                case 191: {
                    n14 = 210;
                    break;
                }
                case 192: {
                    n14 = 152;
                    break;
                }
                case 193: {
                    n14 = 96;
                    break;
                }
                case 194: {
                    n14 = 184;
                    break;
                }
                case 195: {
                    n14 = 231;
                    break;
                }
                case 196: {
                    n14 = 41;
                    break;
                }
                case 197: {
                    n14 = 35;
                    break;
                }
                case 198: {
                    n14 = 40;
                    break;
                }
                case 199: {
                    n14 = 177;
                    break;
                }
                case 200: {
                    n14 = 213;
                    break;
                }
                case 201: {
                    n14 = 166;
                    break;
                }
                case 202: {
                    n14 = 14;
                    break;
                }
                case 203: {
                    n14 = 69;
                    break;
                }
                case 204: {
                    n14 = 234;
                    break;
                }
                case 205: {
                    n14 = 24;
                    break;
                }
                case 206: {
                    n14 = 7;
                    break;
                }
                case 207: {
                    n14 = 200;
                    break;
                }
                case 208: {
                    n14 = 110;
                    break;
                }
                case 209: {
                    n14 = 145;
                    break;
                }
                case 210: {
                    n14 = 197;
                    break;
                }
                case 211: {
                    n14 = 34;
                    break;
                }
                case 212: {
                    n14 = 49;
                    break;
                }
                case 213: {
                    n14 = 169;
                    break;
                }
                case 214: {
                    n14 = 25;
                    break;
                }
                case 215: {
                    n14 = 101;
                    break;
                }
                case 216: {
                    n14 = 237;
                    break;
                }
                case 217: {
                    n14 = 21;
                    break;
                }
                case 218: {
                    n14 = 15;
                    break;
                }
                case 219: {
                    n14 = 139;
                    break;
                }
                case 220: {
                    n14 = 5;
                    break;
                }
                case 221: {
                    n14 = 248;
                    break;
                }
                case 222: {
                    n14 = 144;
                    break;
                }
                case 223: {
                    n14 = 88;
                    break;
                }
                case 224: {
                    n14 = 17;
                    break;
                }
                case 225: {
                    n14 = 74;
                    break;
                }
                case 226: {
                    n14 = 90;
                    break;
                }
                case 227: {
                    n14 = 165;
                    break;
                }
                case 228: {
                    n14 = 124;
                    break;
                }
                case 229: {
                    n14 = 37;
                    break;
                }
                case 230: {
                    n14 = 243;
                    break;
                }
                case 231: {
                    n14 = 6;
                    break;
                }
                case 232: {
                    n14 = 218;
                    break;
                }
                case 233: {
                    n14 = 174;
                    break;
                }
                case 234: {
                    n14 = 104;
                    break;
                }
                case 235: {
                    n14 = 160;
                    break;
                }
                case 236: {
                    n14 = 214;
                    break;
                }
                case 237: {
                    n14 = 170;
                    break;
                }
                case 238: {
                    n14 = 134;
                    break;
                }
                case 239: {
                    n14 = 156;
                    break;
                }
                case 240: {
                    n14 = 233;
                    break;
                }
                case 241: {
                    n14 = 91;
                    break;
                }
                case 242: {
                    n14 = 240;
                    break;
                }
                case 243: {
                    n14 = 86;
                    break;
                }
                case 244: {
                    n14 = 46;
                    break;
                }
                case 245: {
                    n14 = 147;
                    break;
                }
                case 246: {
                    n14 = 216;
                    break;
                }
                case 247: {
                    n14 = 85;
                    break;
                }
                case 248: {
                    n14 = 107;
                    break;
                }
                case 249: {
                    n14 = 131;
                    break;
                }
                case 250: {
                    n14 = 172;
                    break;
                }
                case 251: {
                    n14 = 254;
                    break;
                }
                case 252: {
                    n14 = 55;
                    break;
                }
                case 253: {
                    n14 = 58;
                    break;
                }
                case 254: {
                    n14 = 141;
                    break;
                }
                default: {
                    n14 = 80;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            br_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E9A;
        if (d[n11] == null) {
            br_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

