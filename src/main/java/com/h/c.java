/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.FN;
import com.GA;
import com.GO;
import com.OS;
import com.P9;
import com.W2;
import com.WC;
import com.h.B;
import com.h.J;
import com.h.K;
import com.h.Y;
import com.h.a;
import com.h.g;
import com.h.v;
import com.ky_2;
import com.m.G;
import com.xg_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
extends BasicRadioButtonUI
implements PropertyChangeListener,
W2 {
    public static List S;
    public static ImageIcon p;
    private Color H = com.h.v.S;
    private Color Z = com.h.v.M;
    private Color e = com.h.v.e;
    private Color o = com.h.v.k;
    private Color O = com.h.v.p;
    private Color F = com.h.v.U;
    private Color q = com.h.v.d;
    private int B = com.h.v.t;
    private Insets f = com.h.v.A;
    private boolean z = com.h.v.s;
    private boolean Q = com.h.v.n;
    public Stroke m = new BasicStroke(1.5f);
    private int P = com.h.c.a(16740, 371257481157915169L);
    private int R = com.h.c.a(1660, 5206708749279982904L);
    private int t = 0;
    private boolean d;
    private WC y;
    private int i;
    private boolean v;
    private WC r;
    private Rectangle D;
    private JRadioButton u;
    private MouseAdapter V;
    private ItemListener T;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] g;
    private static final long[] h;
    private static final Long[] j;

    public static ComponentUI createUI(JComponent jComponent) {
        return new c();
    }

    @Override
    public void installUI(JComponent jComponent) {
        boolean bl = K.Z();
        super.installUI(jComponent);
        boolean bl2 = bl;
        this.u = (JRadioButton)jComponent;
        FN.Y(this.u);
        LookAndFeel.installProperty(this.u, com.h.c.a(-15603, -20310), Boolean.FALSE);
        int n10 = this.u.isSelected();
        if (bl2) {
            n10 = n10 != 0 ? S.size() - 1 : 0;
        }
        this.i = n10;
        this.c();
        this.a(this.u);
        this.y = new WC(com.h.c.a(-15601, -27218), com.h.c.b(27577, 7805315119986895795L), (ActionListener)new Y(this, jComponent));
        this.V = new J(this, jComponent);
        this.u.addMouseListener(this.V);
        this.r = new WC(com.h.c.a(-15605, -26748), com.h.c.b(22970, 7293637536917150129L), (ActionListener)new a(this));
        this.T = new g(this);
        this.u.addItemListener(this.T);
        this.u.addPropertyChangeListener(com.h.c.a(-15607, 27154), this);
        if (ky_2.F() != null) {
            K.G(!bl2);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.u.removePropertyChangeListener(com.h.c.a(-15606, 23449), this);
        this.u.removeMouseListener(this.V);
        this.u.removeItemListener(this.T);
        this.u.setIcon(null);
        this.u = null;
        super.uninstallUI(jComponent);
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.K();
    }

    protected void K() {
        boolean bl = K.V();
        this.r.Y();
        boolean bl2 = bl;
        int n10 = this.u.isSelected();
        if (!bl2) {
            n10 = n10 != 0 ? S.size() - 1 : 0;
        }
        this.i = n10;
        this.u.repaint();
    }

    @Override
    public Shape B() {
        return GA.X(this.u, this.V(), this.A());
    }

    private void c() {
        boolean bl = K.V();
        boolean bl2 = FN.l(this.u);
        if (!bl) {
            if (bl2) {
                return;
            }
            bl2 = this.u.getComponentOrientation().isLeftToRight();
        }
        boolean bl3 = bl2;
        Insets insets = new Insets(this.f.top, bl3 ? this.f.left : this.f.right, this.f.bottom, bl3 ? this.f.right : this.f.left);
        this.u.setBorder(GA.y(insets));
    }

    public Insets E() {
        return this.f;
    }

    public void t(Insets insets) {
        this.f = insets;
        this.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean w() {
        boolean bl = K.V();
        c c2 = this;
        if (!bl) {
            if (!c2.z) return false;
            c2 = this;
        }
        Container container = c2.u;
        if (!bl) {
            if (container == null) return true;
            container = this.u.getParent();
        }
        if (!bl) {
            if (container == null) return true;
            container = this.u.getParent();
        }
        boolean bl2 = container instanceof OS;
        if (!bl) {
            if (bl2) return false;
            bl2 = this.u.getParent() instanceof G;
        }
        if (bl) return bl2;
        if (bl2) return false;
        return true;
    }

    public void r(boolean bl) {
        this.z = bl;
    }

    public boolean e() {
        return this.Q;
    }

    public void t(boolean bl) {
        this.Q = bl;
    }

    public Color H() {
        return this.H;
    }

    public void i(Color color) {
        this.H = color;
    }

    public Color D() {
        return this.Z;
    }

    public void k(Color color) {
        this.Z = color;
    }

    public Color k() {
        return this.e;
    }

    public void O(Color color) {
        this.e = color;
    }

    public Color B() {
        return this.o;
    }

    public void J(Color color) {
        this.o = color;
    }

    public Color L() {
        return this.O;
    }

    public void G(Color color) {
        this.O = color;
    }

    public Color i() {
        return this.F;
    }

    public void a(Color color) {
        this.F = color;
    }

    public Color c() {
        return this.q;
    }

    public void T(Color color) {
        this.q = color;
    }

    public int A() {
        return com.h.c.a(26262, 6162692780123461072L);
    }

    public int V() {
        return this.B;
    }

    public void u(int n10) {
        this.B = n10;
    }

    public int d() {
        return this.P;
    }

    public void c(int n10) {
        this.P = n10;
    }

    public int q() {
        return this.R;
    }

    public void G(int n10) {
        this.R = n10;
    }

    private void a(JRadioButton jRadioButton) {
        jRadioButton.setIcon(new B(this, jRadioButton));
    }

    private Color[] N(JRadioButton jRadioButton) {
        boolean bl = K.Z();
        int n10 = jRadioButton.isEnabled();
        if (bl) {
            if (n10 != 0) {
                float f10 = this.T();
                float f12 = f10 - 1.0f;
                f12 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (bl) {
                    if (f12 < 0) {
                        return new Color[]{P9.N(this.o, this.F, f10), P9.N(this.O, this.q, f10)};
                    }
                    f12 = 2;
                }
                Color[] colorArray = new Color[f12];
                colorArray[0] = this.F;
                colorArray[1] = this.q;
                return colorArray;
            }
            n10 = 2;
        }
        Color[] colorArray = new Color[n10];
        colorArray[0] = this.o;
        colorArray[1] = this.O;
        return colorArray;
    }

    private float T() {
        return (float)this.t / 5.0f;
    }

    public Rectangle T() {
        boolean bl = K.V();
        Rectangle rectangle = this.D;
        if (!bl) {
            rectangle = rectangle != null ? new Rectangle(this.D) : new Rectangle();
        }
        return rectangle;
    }

    @Override
    public synchronized void paint(Graphics graphics, JComponent jComponent) {
        Map map = FN.B(graphics);
        super.paint(graphics, jComponent);
        FN.O(graphics, map);
    }

    @Override
    protected void paintText(Graphics graphics, JComponent jComponent, Rectangle rectangle, String string) {
        block4: {
            int n10;
            FontMetrics fontMetrics;
            block2: {
                AbstractButton abstractButton;
                block3: {
                    abstractButton = (AbstractButton)jComponent;
                    boolean bl = K.V();
                    ButtonModel buttonModel = abstractButton.getModel();
                    fontMetrics = FN.L(jComponent, graphics);
                    n10 = abstractButton.getDisplayedMnemonicIndex();
                    if (bl) break block2;
                    if (!buttonModel.isEnabled()) break block3;
                    graphics.setColor(abstractButton.getForeground());
                    FN.W(graphics, string, n10, rectangle.x + this.getTextShiftOffset(), rectangle.y + fontMetrics.getAscent() + this.getTextShiftOffset());
                    if (!bl) break block4;
                }
                graphics.setColor(abstractButton.getBackground().brighter());
                FN.W(graphics, string, n10, rectangle.x, rectangle.y + fontMetrics.getAscent());
                graphics.setColor(abstractButton.getBackground().darker());
            }
            FN.W(graphics, string, n10, rectangle.x - 1, rectangle.y + fontMetrics.getAscent() - 1);
        }
    }

    static boolean i(c c2) {
        return c2.d;
    }

    static int D(c c2) {
        return c2.t;
    }

    static int w(c c2) {
        return c2.t++;
    }

    static int E(c c2) {
        return c2.t--;
    }

    static WC T(c c2) {
        return c2.y;
    }

    static boolean m(c c2, boolean bl) {
        c2.d = bl;
        return c2.d;
    }

    static int z(c c2, int n10) {
        c2.t = n10;
        return c2.t;
    }

    static boolean P(c c2) {
        return c2.v;
    }

    static int C(c c2) {
        return c2.i;
    }

    static int N(c c2) {
        return c2.i++;
    }

    static JRadioButton T(c c2) {
        return c2.u;
    }

    static int B(c c2) {
        return c2.i--;
    }

    static WC t(c c2) {
        return c2.r;
    }

    static boolean l(c c2) {
        return c2.z;
    }

    static boolean K(c c2, boolean bl) {
        c2.v = bl;
        return c2.v;
    }

    static Rectangle f(c c2, Rectangle rectangle) {
        c2.D = rectangle;
        return c2.D;
    }

    static int L(c c2) {
        return c2.P;
    }

    static int c(c c2) {
        return c2.R;
    }

    static int e(c c2) {
        return c2.B;
    }

    static Color[] W(c c2, JRadioButton jRadioButton) {
        return c2.N(jRadioButton);
    }

    static boolean f(c c2) {
        return c2.Q;
    }

    static Color O(c c2) {
        return c2.H;
    }

    static Color L(c c2) {
        return c2.Z;
    }

    static float T(c c2) {
        return c2.T();
    }

    static Color C(c c2) {
        return c2.e;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        block25: {
                            block24: {
                                var21 = new String[8];
                                var19_1 = 0;
                                var18_2 = "9\u00f4\r\u00a02\u00b3\u0003\u001a\u0089\u00e6\u00ef\u0018\u00d0T\u0005\u0003P\u0096+\u001f\u00dbL\u00a2\u0095\u0084\u00ef~\u00ad\u000f \b\u0099v\u00d9\u001d-:{\u0083B'Wm\u001a[b\u00a6\u00f2{\u00fc^\u001c\u000f\u00c4\u00b5\u0082\u00f3#\u0098\u00b0\u00f2WcF\u0006=\u0016E\u0092\u00f2C\u0005\u008b\u00f9\u00d4\u0087|\u001cw`0\u00c8+Nz@\u00bf\u00fe\u00d6\u0012d\u00edU\u00a1zb\u00a5L\u00eeP\u00f8\u0090_\u00ec\u00e8.";
                                var20_3 = "9\u00f4\r\u00a02\u00b3\u0003\u001a\u0089\u00e6\u00ef\u0018\u00d0T\u0005\u0003P\u0096+\u001f\u00dbL\u00a2\u0095\u0084\u00ef~\u00ad\u000f \b\u0099v\u00d9\u001d-:{\u0083B'Wm\u001a[b\u00a6\u00f2{\u00fc^\u001c\u000f\u00c4\u00b5\u0082\u00f3#\u0098\u00b0\u00f2WcF\u0006=\u0016E\u0092\u00f2C\u0005\u008b\u00f9\u00d4\u0087|\u001cw`0\u00c8+Nz@\u00bf\u00fe\u00d6\u0012d\u00edU\u00a1zb\u00a5L\u00eeP\u00f8\u0090_\u00ec\u00e8.".length();
                                var17_4 = 7;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 65;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block24;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00ed&\u00a5\u001e\u0005\u00d19\u0003\u0003\u001a";
                                    var20_3 = "\u00ed&\u00a5\u001e\u0005\u00d19\u0003\u0003\u001a".length();
                                    var17_4 = 4;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 23;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block24;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block25;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 75;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 121;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 1;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 25;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 43;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 97;
                                            break;
                                        }
                                        default: {
                                            v15 = 55;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        com.h.c.a = var21;
                        com.h.c.b = new String[8];
                        var8_7 = 3858285151240435193L;
                        var14_8 = new long[3];
                        var11_9 = 0;
                        var12_10 = "\u00d6>\u00b5\u0006@\u0019\u00c0\u00d1=7\u001d\u00b8eF\u0007\u00c8\u0095s*\u0007\u008a\u00c6 /";
                        var13_11 = "\u00d6>\u00b5\u0006@\u0019\u00c0\u00d1=7\u001d\u00b8eF\u0007\u00c8\u0095s*\u0007\u008a\u00c6 /".length();
                        var10_12 = 0;
                        while (true) {
                            break block26;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block27;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                com.h.c.c = var14_8;
                com.h.c.g = new Integer[3];
                var0_14 = 2573656238174866871L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "F\u008fB\u00046\u0007T.O\u00e5z\t4\u00acf,";
                var5_18 = "F\u008fB\u00046\u0007T.O\u00e5z\t4\u00acf,".length();
                var2_19 = 0;
                while (true) {
                    break block28;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block29;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        com.h.c.h = var6_15;
        com.h.c.j = new Long[2];
        com.h.c.S = new ArrayList<E>();
        com.h.c.p = null;
        com.h.c.S.add(GO.FZ);
        for (var23_21 = 1; var23_21 <= 3; ++var23_21) {
            com.h.c.S.add(new ImageIcon(c.class.getResource(com.h.c.a(-15602, 3255) + var23_21 + com.h.c.a(-15608, -22256))));
        }
        com.h.c.p = xg_0.H(com.h.c.a(-15604, -4361), (ImageIcon)com.h.c.S.get(com.h.c.S.size() - 1));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC30E) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 62;
                    break;
                }
                case 1: {
                    n14 = 74;
                    break;
                }
                case 2: {
                    n14 = 30;
                    break;
                }
                case 3: {
                    n14 = 3;
                    break;
                }
                case 4: {
                    n14 = 174;
                    break;
                }
                case 5: {
                    n14 = 65;
                    break;
                }
                case 6: {
                    n14 = 39;
                    break;
                }
                case 7: {
                    n14 = 11;
                    break;
                }
                case 8: {
                    n14 = 51;
                    break;
                }
                case 9: {
                    n14 = 197;
                    break;
                }
                case 10: {
                    n14 = 235;
                    break;
                }
                case 11: {
                    n14 = 38;
                    break;
                }
                case 12: {
                    n14 = 242;
                    break;
                }
                case 13: {
                    n14 = 52;
                    break;
                }
                case 14: {
                    n14 = 60;
                    break;
                }
                case 15: {
                    n14 = 75;
                    break;
                }
                case 16: {
                    n14 = 58;
                    break;
                }
                case 17: {
                    n14 = 17;
                    break;
                }
                case 18: {
                    n14 = 117;
                    break;
                }
                case 19: {
                    n14 = 9;
                    break;
                }
                case 20: {
                    n14 = 100;
                    break;
                }
                case 21: {
                    n14 = 208;
                    break;
                }
                case 22: {
                    n14 = 138;
                    break;
                }
                case 23: {
                    n14 = 193;
                    break;
                }
                case 24: {
                    n14 = 25;
                    break;
                }
                case 25: {
                    n14 = 119;
                    break;
                }
                case 26: {
                    n14 = 170;
                    break;
                }
                case 27: {
                    n14 = 44;
                    break;
                }
                case 28: {
                    n14 = 248;
                    break;
                }
                case 29: {
                    n14 = 124;
                    break;
                }
                case 30: {
                    n14 = 205;
                    break;
                }
                case 31: {
                    n14 = 181;
                    break;
                }
                case 32: {
                    n14 = 122;
                    break;
                }
                case 33: {
                    n14 = 241;
                    break;
                }
                case 34: {
                    n14 = 249;
                    break;
                }
                case 35: {
                    n14 = 150;
                    break;
                }
                case 36: {
                    n14 = 41;
                    break;
                }
                case 37: {
                    n14 = 201;
                    break;
                }
                case 38: {
                    n14 = 126;
                    break;
                }
                case 39: {
                    n14 = 135;
                    break;
                }
                case 40: {
                    n14 = 190;
                    break;
                }
                case 41: {
                    n14 = 226;
                    break;
                }
                case 42: {
                    n14 = 225;
                    break;
                }
                case 43: {
                    n14 = 118;
                    break;
                }
                case 44: {
                    n14 = 43;
                    break;
                }
                case 45: {
                    n14 = 42;
                    break;
                }
                case 46: {
                    n14 = 133;
                    break;
                }
                case 47: {
                    n14 = 111;
                    break;
                }
                case 48: {
                    n14 = 251;
                    break;
                }
                case 49: {
                    n14 = 19;
                    break;
                }
                case 50: {
                    n14 = 14;
                    break;
                }
                case 51: {
                    n14 = 93;
                    break;
                }
                case 52: {
                    n14 = 71;
                    break;
                }
                case 53: {
                    n14 = 12;
                    break;
                }
                case 54: {
                    n14 = 168;
                    break;
                }
                case 55: {
                    n14 = 82;
                    break;
                }
                case 56: {
                    n14 = 108;
                    break;
                }
                case 57: {
                    n14 = 145;
                    break;
                }
                case 58: {
                    n14 = 26;
                    break;
                }
                case 59: {
                    n14 = 187;
                    break;
                }
                case 60: {
                    n14 = 105;
                    break;
                }
                case 61: {
                    n14 = 132;
                    break;
                }
                case 62: {
                    n14 = 185;
                    break;
                }
                case 63: {
                    n14 = 59;
                    break;
                }
                case 64: {
                    n14 = 151;
                    break;
                }
                case 65: {
                    n14 = 32;
                    break;
                }
                case 66: {
                    n14 = 129;
                    break;
                }
                case 67: {
                    n14 = 87;
                    break;
                }
                case 68: {
                    n14 = 210;
                    break;
                }
                case 69: {
                    n14 = 164;
                    break;
                }
                case 70: {
                    n14 = 123;
                    break;
                }
                case 71: {
                    n14 = 91;
                    break;
                }
                case 72: {
                    n14 = 33;
                    break;
                }
                case 73: {
                    n14 = 152;
                    break;
                }
                case 74: {
                    n14 = 234;
                    break;
                }
                case 75: {
                    n14 = 72;
                    break;
                }
                case 76: {
                    n14 = 209;
                    break;
                }
                case 77: {
                    n14 = 57;
                    break;
                }
                case 78: {
                    n14 = 139;
                    break;
                }
                case 79: {
                    n14 = 85;
                    break;
                }
                case 80: {
                    n14 = 194;
                    break;
                }
                case 81: {
                    n14 = 224;
                    break;
                }
                case 82: {
                    n14 = 239;
                    break;
                }
                case 83: {
                    n14 = 177;
                    break;
                }
                case 84: {
                    n14 = 6;
                    break;
                }
                case 85: {
                    n14 = 141;
                    break;
                }
                case 86: {
                    n14 = 128;
                    break;
                }
                case 87: {
                    n14 = 167;
                    break;
                }
                case 88: {
                    n14 = 227;
                    break;
                }
                case 89: {
                    n14 = 159;
                    break;
                }
                case 90: {
                    n14 = 67;
                    break;
                }
                case 91: {
                    n14 = 36;
                    break;
                }
                case 92: {
                    n14 = 214;
                    break;
                }
                case 93: {
                    n14 = 212;
                    break;
                }
                case 94: {
                    n14 = 156;
                    break;
                }
                case 95: {
                    n14 = 253;
                    break;
                }
                case 96: {
                    n14 = 204;
                    break;
                }
                case 97: {
                    n14 = 202;
                    break;
                }
                case 98: {
                    n14 = 146;
                    break;
                }
                case 99: {
                    n14 = 157;
                    break;
                }
                case 100: {
                    n14 = 13;
                    break;
                }
                case 101: {
                    n14 = 21;
                    break;
                }
                case 102: {
                    n14 = 7;
                    break;
                }
                case 103: {
                    n14 = 10;
                    break;
                }
                case 104: {
                    n14 = 35;
                    break;
                }
                case 105: {
                    n14 = 213;
                    break;
                }
                case 106: {
                    n14 = 166;
                    break;
                }
                case 107: {
                    n14 = 161;
                    break;
                }
                case 108: {
                    n14 = 230;
                    break;
                }
                case 109: {
                    n14 = 125;
                    break;
                }
                case 110: {
                    n14 = 79;
                    break;
                }
                case 111: {
                    n14 = 220;
                    break;
                }
                case 112: {
                    n14 = 98;
                    break;
                }
                case 113: {
                    n14 = 250;
                    break;
                }
                case 114: {
                    n14 = 142;
                    break;
                }
                case 115: {
                    n14 = 64;
                    break;
                }
                case 116: {
                    n14 = 22;
                    break;
                }
                case 117: {
                    n14 = 175;
                    break;
                }
                case 118: {
                    n14 = 1;
                    break;
                }
                case 119: {
                    n14 = 158;
                    break;
                }
                case 120: {
                    n14 = 180;
                    break;
                }
                case 121: {
                    n14 = 102;
                    break;
                }
                case 122: {
                    n14 = 55;
                    break;
                }
                case 123: {
                    n14 = 107;
                    break;
                }
                case 124: {
                    n14 = 8;
                    break;
                }
                case 125: {
                    n14 = 90;
                    break;
                }
                case 126: {
                    n14 = 231;
                    break;
                }
                case 127: {
                    n14 = 243;
                    break;
                }
                case 128: {
                    n14 = 84;
                    break;
                }
                case 129: {
                    n14 = 173;
                    break;
                }
                case 130: {
                    n14 = 48;
                    break;
                }
                case 131: {
                    n14 = 218;
                    break;
                }
                case 132: {
                    n14 = 171;
                    break;
                }
                case 133: {
                    n14 = 76;
                    break;
                }
                case 134: {
                    n14 = 255;
                    break;
                }
                case 135: {
                    n14 = 219;
                    break;
                }
                case 136: {
                    n14 = 97;
                    break;
                }
                case 137: {
                    n14 = 228;
                    break;
                }
                case 138: {
                    n14 = 88;
                    break;
                }
                case 139: {
                    n14 = 254;
                    break;
                }
                case 140: {
                    n14 = 130;
                    break;
                }
                case 141: {
                    n14 = 50;
                    break;
                }
                case 142: {
                    n14 = 148;
                    break;
                }
                case 143: {
                    n14 = 77;
                    break;
                }
                case 144: {
                    n14 = 143;
                    break;
                }
                case 145: {
                    n14 = 233;
                    break;
                }
                case 146: {
                    n14 = 223;
                    break;
                }
                case 147: {
                    n14 = 73;
                    break;
                }
                case 148: {
                    n14 = 121;
                    break;
                }
                case 149: {
                    n14 = 45;
                    break;
                }
                case 150: {
                    n14 = 192;
                    break;
                }
                case 151: {
                    n14 = 69;
                    break;
                }
                case 152: {
                    n14 = 155;
                    break;
                }
                case 153: {
                    n14 = 163;
                    break;
                }
                case 154: {
                    n14 = 131;
                    break;
                }
                case 155: {
                    n14 = 162;
                    break;
                }
                case 156: {
                    n14 = 189;
                    break;
                }
                case 157: {
                    n14 = 236;
                    break;
                }
                case 158: {
                    n14 = 23;
                    break;
                }
                case 159: {
                    n14 = 144;
                    break;
                }
                case 160: {
                    n14 = 199;
                    break;
                }
                case 161: {
                    n14 = 18;
                    break;
                }
                case 162: {
                    n14 = 134;
                    break;
                }
                case 163: {
                    n14 = 66;
                    break;
                }
                case 164: {
                    n14 = 120;
                    break;
                }
                case 165: {
                    n14 = 244;
                    break;
                }
                case 166: {
                    n14 = 2;
                    break;
                }
                case 167: {
                    n14 = 28;
                    break;
                }
                case 168: {
                    n14 = 217;
                    break;
                }
                case 169: {
                    n14 = 80;
                    break;
                }
                case 170: {
                    n14 = 15;
                    break;
                }
                case 171: {
                    n14 = 114;
                    break;
                }
                case 172: {
                    n14 = 237;
                    break;
                }
                case 173: {
                    n14 = 115;
                    break;
                }
                case 174: {
                    n14 = 81;
                    break;
                }
                case 175: {
                    n14 = 37;
                    break;
                }
                case 176: {
                    n14 = 200;
                    break;
                }
                case 177: {
                    n14 = 113;
                    break;
                }
                case 178: {
                    n14 = 147;
                    break;
                }
                case 179: {
                    n14 = 211;
                    break;
                }
                case 180: {
                    n14 = 240;
                    break;
                }
                case 181: {
                    n14 = 40;
                    break;
                }
                case 182: {
                    n14 = 56;
                    break;
                }
                case 183: {
                    n14 = 215;
                    break;
                }
                case 184: {
                    n14 = 178;
                    break;
                }
                case 185: {
                    n14 = 94;
                    break;
                }
                case 186: {
                    n14 = 136;
                    break;
                }
                case 187: {
                    n14 = 195;
                    break;
                }
                case 188: {
                    n14 = 140;
                    break;
                }
                case 189: {
                    n14 = 165;
                    break;
                }
                case 190: {
                    n14 = 104;
                    break;
                }
                case 191: {
                    n14 = 169;
                    break;
                }
                case 192: {
                    n14 = 31;
                    break;
                }
                case 193: {
                    n14 = 110;
                    break;
                }
                case 194: {
                    n14 = 54;
                    break;
                }
                case 195: {
                    n14 = 172;
                    break;
                }
                case 196: {
                    n14 = 206;
                    break;
                }
                case 197: {
                    n14 = 78;
                    break;
                }
                case 198: {
                    n14 = 232;
                    break;
                }
                case 199: {
                    n14 = 252;
                    break;
                }
                case 200: {
                    n14 = 247;
                    break;
                }
                case 201: {
                    n14 = 203;
                    break;
                }
                case 202: {
                    n14 = 221;
                    break;
                }
                case 203: {
                    n14 = 184;
                    break;
                }
                case 204: {
                    n14 = 153;
                    break;
                }
                case 205: {
                    n14 = 83;
                    break;
                }
                case 206: {
                    n14 = 29;
                    break;
                }
                case 207: {
                    n14 = 196;
                    break;
                }
                case 208: {
                    n14 = 61;
                    break;
                }
                case 209: {
                    n14 = 99;
                    break;
                }
                case 210: {
                    n14 = 216;
                    break;
                }
                case 211: {
                    n14 = 68;
                    break;
                }
                case 212: {
                    n14 = 53;
                    break;
                }
                case 213: {
                    n14 = 149;
                    break;
                }
                case 214: {
                    n14 = 179;
                    break;
                }
                case 215: {
                    n14 = 116;
                    break;
                }
                case 216: {
                    n14 = 222;
                    break;
                }
                case 217: {
                    n14 = 127;
                    break;
                }
                case 218: {
                    n14 = 245;
                    break;
                }
                case 219: {
                    n14 = 188;
                    break;
                }
                case 220: {
                    n14 = 160;
                    break;
                }
                case 221: {
                    n14 = 101;
                    break;
                }
                case 222: {
                    n14 = 95;
                    break;
                }
                case 223: {
                    n14 = 16;
                    break;
                }
                case 224: {
                    n14 = 137;
                    break;
                }
                case 225: {
                    n14 = 106;
                    break;
                }
                case 226: {
                    n14 = 49;
                    break;
                }
                case 227: {
                    n14 = 47;
                    break;
                }
                case 228: {
                    n14 = 24;
                    break;
                }
                case 229: {
                    n14 = 27;
                    break;
                }
                case 230: {
                    n14 = 46;
                    break;
                }
                case 231: {
                    n14 = 70;
                    break;
                }
                case 232: {
                    n14 = 154;
                    break;
                }
                case 233: {
                    n14 = 92;
                    break;
                }
                case 234: {
                    n14 = 63;
                    break;
                }
                case 235: {
                    n14 = 238;
                    break;
                }
                case 236: {
                    n14 = 86;
                    break;
                }
                case 237: {
                    n14 = 103;
                    break;
                }
                case 238: {
                    n14 = 198;
                    break;
                }
                case 239: {
                    n14 = 0;
                    break;
                }
                case 240: {
                    n14 = 182;
                    break;
                }
                case 241: {
                    n14 = 5;
                    break;
                }
                case 242: {
                    n14 = 89;
                    break;
                }
                case 243: {
                    n14 = 109;
                    break;
                }
                case 244: {
                    n14 = 229;
                    break;
                }
                case 245: {
                    n14 = 176;
                    break;
                }
                case 246: {
                    n14 = 207;
                    break;
                }
                case 247: {
                    n14 = 20;
                    break;
                }
                case 248: {
                    n14 = 191;
                    break;
                }
                case 249: {
                    n14 = 96;
                    break;
                }
                case 250: {
                    n14 = 246;
                    break;
                }
                case 251: {
                    n14 = 112;
                    break;
                }
                case 252: {
                    n14 = 34;
                    break;
                }
                case 253: {
                    n14 = 4;
                    break;
                }
                case 254: {
                    n14 = 186;
                    break;
                }
                default: {
                    n14 = 183;
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
            com.h.c.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7344;
        if (g[n11] == null) {
            com.h.c.g[n11] = (int)(c[n11] ^ l2);
        }
        return g[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0xB) & Short.MAX_VALUE;
        if (j[n11] == null) {
            com.h.c.j[n11] = h[n11] ^ l2;
        }
        return j[n11];
    }
}

