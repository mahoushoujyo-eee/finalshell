/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.NT;
import com.OS;
import com.P9;
import com.RV;
import com.W2;
import com.WC;
import com._Q;
import com.aO;
import com.as_0;
import com.dk_2;
import com.ez_2;
import com.kp_0;
import com.ky_2;
import com.n0_0;
import com.ni_1;
import com.pt_0;
import com.rc_2;
import com.uE;
import com.wj_1;
import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicCheckBoxUI;
import javax.swing.tree.TreeCellRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Fm
 */
public class fm_0
extends BasicCheckBoxUI
implements W2 {
    protected static final float[] V;
    protected Color H = _Q.r;
    protected Color q = _Q.X;
    protected Color p = _Q.B;
    protected Color f;
    protected Color R;
    protected Color C;
    protected Color d;
    protected int W;
    protected int Z;
    protected Insets S;
    protected boolean K;
    protected boolean b;
    protected Stroke x;
    protected int r;
    protected int v;
    protected int G;
    protected boolean m;
    protected WC g;
    protected aO I;
    protected WC P;
    protected Rectangle i;
    protected JCheckBox U;
    protected PropertyChangeListener c;
    protected PropertyChangeListener y;
    protected MouseAdapter Q;
    protected ItemListener T;
    private static final String[] a;
    private static final String[] e;
    private static final long[] h;
    private static final Long[] j;

    public fm_0() {
        boolean bl = uE.Z();
        this.f = _Q.Q;
        this.R = _Q.D;
        this.C = _Q.d;
        this.d = _Q.H;
        this.W = _Q.l;
        this.Z = _Q.a;
        this.S = _Q.I;
        this.K = _Q.v;
        this.b = _Q.L;
        this.x = _Q.t;
        this.r = _Q.S;
        this.v = _Q.Y;
        this.G = 0;
        this.U = null;
        if (ky_2.F() != null) {
            uE.X(!bl);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new fm_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.U = (JCheckBox)jComponent;
        this.I = this.s();
        this.I.a(this.U.isEnabled());
        this.I.c(this.U.isSelected() ? pt_0.checked : pt_0.unchecked);
        FN.Y(this.U);
        LookAndFeel.installProperty(this.U, fm_0.a(20474, -20468), Boolean.FALSE);
        this.U.setIcon(this.H());
        this.C(this.j());
        this.D();
        this.I();
        this.p();
        this.L();
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.g();
        this.v();
        this.E();
        this.U.setIcon(null);
        this.I = null;
        this.U = null;
        super.uninstallUI(jComponent);
    }

    protected aO s() {
        return new as_0();
    }

    protected void I() {
        this.c = new n0_0(this);
        this.U.addPropertyChangeListener(fm_0.a(20479, 8553), this.c);
    }

    protected void g() {
        this.U.removePropertyChangeListener(fm_0.a(20475, -10212), this.c);
    }

    protected void p() {
        this.g = new WC(fm_0.a(20473, 31790), fm_0.a(26169, 5170948246833668470L), (ActionListener)new NT(this));
        this.Q = new ni_1(this);
        this.U.addMouseListener(this.Q);
    }

    protected void v() {
        this.U.removeMouseListener(this.Q);
    }

    protected void L() {
        this.P = new WC(fm_0.a(20478, 9392), fm_0.a(15578, 4753814604053707668L), (ActionListener)new rc_2(this));
        this.T = new dk_2(this);
        this.U.addItemListener(this.T);
        this.y = new wj_1(this);
        this.U.addPropertyChangeListener(fm_0.a(20476, 18121), this.y);
    }

    protected void A() {
        block4: {
            fm_0 fm_02;
            block2: {
                block3: {
                    boolean bl = uE.Z();
                    fm_02 = this;
                    if (bl) break block2;
                    if (!fm_02.u()) break block3;
                    fm_02 = this;
                    if (bl) break block2;
                    if (!fm_02.O()) break block3;
                    fm_02 = this;
                    if (bl) break block2;
                    if (!fm_02.U.isEnabled()) break block3;
                    this.I.U(this.U.isSelected() ? pt_0.checked : pt_0.unchecked);
                    this.P.u();
                    if (!bl) break block4;
                }
                this.P.Y();
                fm_02 = this;
            }
            fm_02.I.c(this.U.isSelected() ? pt_0.checked : pt_0.unchecked);
            this.U.repaint();
        }
    }

    protected void E() {
        this.U.removeItemListener(this.T);
        this.U.removePropertyChangeListener(this.y);
    }

    @Override
    public Shape B() {
        return GA.X(this.U, this.V(), this.n());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean j() {
        boolean bl = uE.Z();
        boolean bl2 = _Q.v;
        if (!bl) {
            if (!bl2) return false;
            bl2 = kp_0.S(this.U.getClass(), fm_0.a(20472, 6788));
        }
        if (bl) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean u() {
        Container container = this.U.getParent();
        boolean bl = uE.Z();
        Container container2 = container;
        if (!bl) {
            if (container2 == null) {
                return true;
            }
            container2 = container;
        }
        Class<?> clazz = container2.getClass();
        boolean bl2 = kp_0.S(clazz, fm_0.a(20477, -25290));
        if (!bl) {
            if (bl2) return false;
            bl2 = kp_0.S(clazz, fm_0.a(20467, 25086));
        }
        if (bl) return bl2;
        if (bl2) return false;
        return true;
    }

    protected void D() {
        boolean bl = uE.o();
        boolean bl2 = FN.l(this.U);
        if (bl) {
            if (bl2) {
                return;
            }
            bl2 = this.U.getComponentOrientation().isLeftToRight();
        }
        boolean bl3 = bl2;
        Insets insets = new Insets(this.S.top, bl3 ? this.S.left : this.S.right, this.S.bottom, bl3 ? this.S.right : this.S.left);
        this.U.setBorder(GA.y(insets));
    }

    public Insets k() {
        return this.S;
    }

    public void G(Insets insets) {
        this.S = insets;
        this.D();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean O() {
        boolean bl = uE.o();
        fm_0 fm_02 = this;
        if (bl) {
            if (!fm_02.K) return false;
            fm_02 = this;
        }
        Container container = fm_02.U;
        if (bl) {
            if (container == null) return true;
            container = this.U.getParent();
        }
        if (bl) {
            if (container == null) return true;
            container = this.U.getParent();
        }
        boolean bl2 = container instanceof OS;
        if (bl) {
            if (bl2) return false;
            bl2 = this.U.getParent() instanceof TreeCellRenderer;
        }
        if (!bl) return bl2;
        if (bl2) return false;
        return true;
    }

    public void C(boolean bl) {
        this.K = bl;
    }

    public boolean h() {
        return this.b;
    }

    public void m(boolean bl) {
        this.b = bl;
    }

    public Color J() {
        return this.H;
    }

    public void Z(Color color) {
        this.H = color;
    }

    public Color e() {
        return this.q;
    }

    public void p(Color color) {
        this.q = color;
    }

    public Color p() {
        return this.p;
    }

    public void O(Color color) {
        this.p = color;
    }

    public Color h() {
        return this.f;
    }

    public void R(Color color) {
        this.f = color;
    }

    public Color a() {
        return this.R;
    }

    public void b(Color color) {
        this.R = color;
    }

    public Color n() {
        return this.C;
    }

    public void B(Color color) {
        this.C = color;
    }

    public Color S() {
        return this.d;
    }

    public void n(Color color) {
        this.d = color;
    }

    public int n() {
        return this.W;
    }

    public void i(int n10) {
        this.W = n10;
    }

    public int V() {
        return this.Z;
    }

    public void f(int n10) {
        this.Z = n10;
    }

    public int H() {
        return this.r;
    }

    public void P(int n10) {
        this.r = n10;
    }

    public int R() {
        return this.v;
    }

    public void t(int n10) {
        this.v = n10;
    }

    protected Icon H() {
        return new ez_2(this);
    }

    protected Color[] r() {
        boolean bl = uE.o();
        int n10 = this.U.isEnabled();
        if (bl) {
            if (n10 != 0) {
                float f10 = this.T();
                float f12 = f10 - 1.0f;
                f12 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (bl) {
                    if (f12 < 0) {
                        return new Color[]{P9.N(this.f, this.C, f10), P9.N(this.R, this.d, f10)};
                    }
                    f12 = 2;
                }
                Color[] colorArray = new Color[f12];
                colorArray[0] = this.C;
                colorArray[1] = this.d;
                return colorArray;
            }
            n10 = 2;
        }
        Color[] colorArray = new Color[n10];
        colorArray[0] = this.f;
        colorArray[1] = this.R;
        return colorArray;
    }

    protected float T() {
        return (float)this.G / 5.0f;
    }

    public Rectangle u() {
        boolean bl = uE.Z();
        Rectangle rectangle = this.i;
        if (!bl) {
            rectangle = rectangle != null ? new Rectangle(this.i) : new Rectangle();
        }
        return rectangle;
    }

    @Override
    public synchronized void paint(Graphics graphics, JComponent jComponent) {
        Map map = FN.B(graphics);
        super.paint(graphics, jComponent);
        FN.O(graphics, map);
    }

    protected void r(Graphics2D graphics2D, int n10, int n11) {
        this.T(graphics2D, n10, n11);
        this.c(graphics2D, n10, n11);
    }

    /*
     * Unable to fully structure code
     */
    protected void T(Graphics2D var1_1, int var2_2, int var3_3) {
        block7: {
            block6: {
                block5: {
                    var5_4 = this.U.isEnabled();
                    var6_5 = new Rectangle(var2_2 + this.Z, var3_3 + this.Z, this.r - this.Z * 2 - 1, this.v - this.Z * 2 - 1);
                    var7_6 = new RoundRectangle2D.Double(var6_5.x, var6_5.y, var6_5.width, var6_5.height, this.W * 2, this.W * 2);
                    var4_7 = uE.Z();
                    v0 = var5_4;
                    if (!var4_7) {
                        if (v0 != 0) {
                            var8_8 = this.U.isFocusOwner() != false ? GO.c : GO.r;
                            RV.Y(var1_1, var7_6, var8_8, this.Z);
                        }
                        v0 = Math.round((float)Math.sqrt(var6_5.width * var6_5.width / 2));
                    }
                    var8_9 = v0;
                    var9_10 = var6_5.x + var6_5.width / 2;
                    var10_11 = var6_5.y + var6_5.height / 2;
                    var1_1.setPaint(new RadialGradientPaint(var9_10, (float)var10_11, var8_9, fm_0.V, this.r()));
                    var1_1.fill(var7_6);
                    var11_12 = RV.M(var1_1, this.x);
                    v1 = var5_4;
                    if (var4_7) break block5;
                    if (v1 == 0) break block6;
                    v2 = this;
                    if (var4_7) ** GOTO lbl28
                    v1 = (int)v2.b;
                }
                if (v1 != 0) {
                    v3 = P9.N(this.H, this.q, this.T());
                } else {
                    v2 = this;
lbl28:
                    // 2 sources

                    v3 = v2.q;
                }
                break block7;
            }
            v3 = this.p;
        }
        var1_1.setPaint(v3);
        var1_1.draw(var7_6);
        RV.p(var1_1, var11_12);
        if (var4_7) {
            ky_2.K(new String[3]);
        }
    }

    protected void c(Graphics2D graphics2D, int n10, int n11) {
        this.I.O(this.U, graphics2D, n10, n11, this.r, this.v);
    }

    @Override
    protected void paintText(Graphics graphics, AbstractButton abstractButton, Rectangle rectangle, String string) {
        block4: {
            int n10;
            FontMetrics fontMetrics;
            block2: {
                block3: {
                    ButtonModel buttonModel = abstractButton.getModel();
                    fontMetrics = FN.L(abstractButton, graphics);
                    n10 = abstractButton.getDisplayedMnemonicIndex();
                    boolean bl = uE.Z();
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

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "X\u00f0f\u0091Dt\u00fa\u0006\u00acp\u00b3O\u00e7\u00de\u0017\u0096\u0019\u00c8\u00e7\u00f6\u00bf/\u00fe\ns}\u0010\u009c$:\u00aa\u00f9\u00e0\r\u000e\u00caBs#\u00ee'z\u0006LO=c\u009e\u000f\u00e6\u00beU\u00a9\u009d\u00e3\u0081\u0011\u0014\u00f0\u00ec\u0002p\u00b5<\u0091\u00a2|^c\b\u0080\u00e5t9\u0007\u009c\u00b0\u00fe\u0099Wu\u0098\u0019\u00cd\u001c\u00a3G\u009b\u00ab\u0082|\u00bf#\u00cb\u001aJe\u00eb\u0086\u0093\u00ff\f!\u00ed\u0090\u0083\u00ff\u00b6\u001f\u00beFp*\r\u00ca\u0015\u00d3\u009b\u0019F|A\u00f1\u001f\u00e8\u00d1p\u001e\u00cb\u00b7\u009cR\u00f4I^V\u00f2\u007fJ\u001a";
                        var12_3 = "X\u00f0f\u0091Dt\u00fa\u0006\u00acp\u00b3O\u00e7\u00de\u0017\u0096\u0019\u00c8\u00e7\u00f6\u00bf/\u00fe\ns}\u0010\u009c$:\u00aa\u00f9\u00e0\r\u000e\u00caBs#\u00ee'z\u0006LO=c\u009e\u000f\u00e6\u00beU\u00a9\u009d\u00e3\u0081\u0011\u0014\u00f0\u00ec\u0002p\u00b5<\u0091\u00a2|^c\b\u0080\u00e5t9\u0007\u009c\u00b0\u00fe\u0099Wu\u0098\u0019\u00cd\u001c\u00a3G\u009b\u00ab\u0082|\u00bf#\u00cb\u001aJe\u00eb\u0086\u0093\u00ff\f!\u00ed\u0090\u0083\u00ff\u00b6\u001f\u00beFp*\r\u00ca\u0015\u00d3\u009b\u0019F|A\u00f1\u001f\u00e8\u00d1p\u001e\u00cb\u00b7\u009cR\u00f4I^V\u00f2\u007fJ\u001a".length();
                        var9_4 = 7;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 93;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
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
                            var10_2 = "!\u00f3b\u00f0F+\f\b\u0001\u00c4\u00040\u0013\u00ab|1\u009d^\u001d\u0092\u00b3\u00a3c>o%\u00befT\u008c\u00aev\u008d\u00c88'\u00bc\u0007\u00b5\u008d\u00c3\u008eyE\u00eb\u00e0\u00cd`{";
                            var12_3 = "!\u00f3b\u00f0F+\f\b\u0001\u00c4\u00040\u0013\u00ab|1\u009d^\u001d\u0092\u00b3\u00a3c>o%\u00befT\u008c\u00aev\u008d\u00c88'\u00bc\u0007\u00b5\u008d\u00c3\u008eyE\u00eb\u00e0\u00cd`{".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 55;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 90;
                                    break;
                                }
                                case 1: {
                                    v15 = 53;
                                    break;
                                }
                                case 2: {
                                    v15 = 120;
                                    break;
                                }
                                case 3: {
                                    v15 = 30;
                                    break;
                                }
                                case 4: {
                                    v15 = 80;
                                    break;
                                }
                                case 5: {
                                    v15 = 56;
                                    break;
                                }
                                default: {
                                    v15 = 11;
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
                fm_0.a = var13;
                fm_0.e = new String[9];
                var0_7 = 6652424685173263207L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u001d\u00aa\u00d83\\e\u00b0\u00db\u001b\u0090\u00cf\t\u00d2\u00b9\u00ea9";
                var5_11 = "\u001d\u00aa\u00d83\\e\u00b0\u00db\u001b\u0090\u00cf\t\u00d2\u00b9\u00ea9".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        fm_0.h = var6_8;
        fm_0.j = new Long[2];
        fm_0.V = new float[]{0.0f, 1.0f};
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4FFB) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 71;
                    break;
                }
                case 1: {
                    n14 = 126;
                    break;
                }
                case 2: {
                    n14 = 64;
                    break;
                }
                case 3: {
                    n14 = 228;
                    break;
                }
                case 4: {
                    n14 = 238;
                    break;
                }
                case 5: {
                    n14 = 53;
                    break;
                }
                case 6: {
                    n14 = 26;
                    break;
                }
                case 7: {
                    n14 = 94;
                    break;
                }
                case 8: {
                    n14 = 196;
                    break;
                }
                case 9: {
                    n14 = 154;
                    break;
                }
                case 10: {
                    n14 = 175;
                    break;
                }
                case 11: {
                    n14 = 150;
                    break;
                }
                case 12: {
                    n14 = 12;
                    break;
                }
                case 13: {
                    n14 = 24;
                    break;
                }
                case 14: {
                    n14 = 206;
                    break;
                }
                case 15: {
                    n14 = 0;
                    break;
                }
                case 16: {
                    n14 = 31;
                    break;
                }
                case 17: {
                    n14 = 22;
                    break;
                }
                case 18: {
                    n14 = 193;
                    break;
                }
                case 19: {
                    n14 = 144;
                    break;
                }
                case 20: {
                    n14 = 70;
                    break;
                }
                case 21: {
                    n14 = 47;
                    break;
                }
                case 22: {
                    n14 = 207;
                    break;
                }
                case 23: {
                    n14 = 133;
                    break;
                }
                case 24: {
                    n14 = 34;
                    break;
                }
                case 25: {
                    n14 = 165;
                    break;
                }
                case 26: {
                    n14 = 239;
                    break;
                }
                case 27: {
                    n14 = 45;
                    break;
                }
                case 28: {
                    n14 = 87;
                    break;
                }
                case 29: {
                    n14 = 52;
                    break;
                }
                case 30: {
                    n14 = 185;
                    break;
                }
                case 31: {
                    n14 = 57;
                    break;
                }
                case 32: {
                    n14 = 101;
                    break;
                }
                case 33: {
                    n14 = 3;
                    break;
                }
                case 34: {
                    n14 = 211;
                    break;
                }
                case 35: {
                    n14 = 85;
                    break;
                }
                case 36: {
                    n14 = 220;
                    break;
                }
                case 37: {
                    n14 = 112;
                    break;
                }
                case 38: {
                    n14 = 21;
                    break;
                }
                case 39: {
                    n14 = 20;
                    break;
                }
                case 40: {
                    n14 = 122;
                    break;
                }
                case 41: {
                    n14 = 74;
                    break;
                }
                case 42: {
                    n14 = 46;
                    break;
                }
                case 43: {
                    n14 = 155;
                    break;
                }
                case 44: {
                    n14 = 108;
                    break;
                }
                case 45: {
                    n14 = 177;
                    break;
                }
                case 46: {
                    n14 = 128;
                    break;
                }
                case 47: {
                    n14 = 209;
                    break;
                }
                case 48: {
                    n14 = 197;
                    break;
                }
                case 49: {
                    n14 = 63;
                    break;
                }
                case 50: {
                    n14 = 81;
                    break;
                }
                case 51: {
                    n14 = 118;
                    break;
                }
                case 52: {
                    n14 = 179;
                    break;
                }
                case 53: {
                    n14 = 69;
                    break;
                }
                case 54: {
                    n14 = 60;
                    break;
                }
                case 55: {
                    n14 = 222;
                    break;
                }
                case 56: {
                    n14 = 166;
                    break;
                }
                case 57: {
                    n14 = 79;
                    break;
                }
                case 58: {
                    n14 = 18;
                    break;
                }
                case 59: {
                    n14 = 58;
                    break;
                }
                case 60: {
                    n14 = 254;
                    break;
                }
                case 61: {
                    n14 = 236;
                    break;
                }
                case 62: {
                    n14 = 174;
                    break;
                }
                case 63: {
                    n14 = 208;
                    break;
                }
                case 64: {
                    n14 = 167;
                    break;
                }
                case 65: {
                    n14 = 93;
                    break;
                }
                case 66: {
                    n14 = 237;
                    break;
                }
                case 67: {
                    n14 = 205;
                    break;
                }
                case 68: {
                    n14 = 48;
                    break;
                }
                case 69: {
                    n14 = 189;
                    break;
                }
                case 70: {
                    n14 = 106;
                    break;
                }
                case 71: {
                    n14 = 242;
                    break;
                }
                case 72: {
                    n14 = 188;
                    break;
                }
                case 73: {
                    n14 = 120;
                    break;
                }
                case 74: {
                    n14 = 194;
                    break;
                }
                case 75: {
                    n14 = 28;
                    break;
                }
                case 76: {
                    n14 = 168;
                    break;
                }
                case 77: {
                    n14 = 99;
                    break;
                }
                case 78: {
                    n14 = 32;
                    break;
                }
                case 79: {
                    n14 = 36;
                    break;
                }
                case 80: {
                    n14 = 137;
                    break;
                }
                case 81: {
                    n14 = 152;
                    break;
                }
                case 82: {
                    n14 = 210;
                    break;
                }
                case 83: {
                    n14 = 142;
                    break;
                }
                case 84: {
                    n14 = 198;
                    break;
                }
                case 85: {
                    n14 = 15;
                    break;
                }
                case 86: {
                    n14 = 146;
                    break;
                }
                case 87: {
                    n14 = 8;
                    break;
                }
                case 88: {
                    n14 = 13;
                    break;
                }
                case 89: {
                    n14 = 30;
                    break;
                }
                case 90: {
                    n14 = 247;
                    break;
                }
                case 91: {
                    n14 = 255;
                    break;
                }
                case 92: {
                    n14 = 221;
                    break;
                }
                case 93: {
                    n14 = 75;
                    break;
                }
                case 94: {
                    n14 = 41;
                    break;
                }
                case 95: {
                    n14 = 226;
                    break;
                }
                case 96: {
                    n14 = 61;
                    break;
                }
                case 97: {
                    n14 = 252;
                    break;
                }
                case 98: {
                    n14 = 39;
                    break;
                }
                case 99: {
                    n14 = 173;
                    break;
                }
                case 100: {
                    n14 = 96;
                    break;
                }
                case 101: {
                    n14 = 212;
                    break;
                }
                case 102: {
                    n14 = 187;
                    break;
                }
                case 103: {
                    n14 = 131;
                    break;
                }
                case 104: {
                    n14 = 16;
                    break;
                }
                case 105: {
                    n14 = 59;
                    break;
                }
                case 106: {
                    n14 = 5;
                    break;
                }
                case 107: {
                    n14 = 78;
                    break;
                }
                case 108: {
                    n14 = 102;
                    break;
                }
                case 109: {
                    n14 = 178;
                    break;
                }
                case 110: {
                    n14 = 186;
                    break;
                }
                case 111: {
                    n14 = 134;
                    break;
                }
                case 112: {
                    n14 = 199;
                    break;
                }
                case 113: {
                    n14 = 233;
                    break;
                }
                case 114: {
                    n14 = 241;
                    break;
                }
                case 115: {
                    n14 = 191;
                    break;
                }
                case 116: {
                    n14 = 17;
                    break;
                }
                case 117: {
                    n14 = 80;
                    break;
                }
                case 118: {
                    n14 = 184;
                    break;
                }
                case 119: {
                    n14 = 218;
                    break;
                }
                case 120: {
                    n14 = 147;
                    break;
                }
                case 121: {
                    n14 = 23;
                    break;
                }
                case 122: {
                    n14 = 244;
                    break;
                }
                case 123: {
                    n14 = 214;
                    break;
                }
                case 124: {
                    n14 = 225;
                    break;
                }
                case 125: {
                    n14 = 195;
                    break;
                }
                case 126: {
                    n14 = 139;
                    break;
                }
                case 127: {
                    n14 = 203;
                    break;
                }
                case 128: {
                    n14 = 246;
                    break;
                }
                case 129: {
                    n14 = 4;
                    break;
                }
                case 130: {
                    n14 = 171;
                    break;
                }
                case 131: {
                    n14 = 116;
                    break;
                }
                case 132: {
                    n14 = 181;
                    break;
                }
                case 133: {
                    n14 = 219;
                    break;
                }
                case 134: {
                    n14 = 73;
                    break;
                }
                case 135: {
                    n14 = 14;
                    break;
                }
                case 136: {
                    n14 = 44;
                    break;
                }
                case 137: {
                    n14 = 121;
                    break;
                }
                case 138: {
                    n14 = 7;
                    break;
                }
                case 139: {
                    n14 = 105;
                    break;
                }
                case 140: {
                    n14 = 135;
                    break;
                }
                case 141: {
                    n14 = 25;
                    break;
                }
                case 142: {
                    n14 = 158;
                    break;
                }
                case 143: {
                    n14 = 125;
                    break;
                }
                case 144: {
                    n14 = 76;
                    break;
                }
                case 145: {
                    n14 = 104;
                    break;
                }
                case 146: {
                    n14 = 140;
                    break;
                }
                case 147: {
                    n14 = 100;
                    break;
                }
                case 148: {
                    n14 = 123;
                    break;
                }
                case 149: {
                    n14 = 6;
                    break;
                }
                case 150: {
                    n14 = 86;
                    break;
                }
                case 151: {
                    n14 = 130;
                    break;
                }
                case 152: {
                    n14 = 216;
                    break;
                }
                case 153: {
                    n14 = 157;
                    break;
                }
                case 154: {
                    n14 = 109;
                    break;
                }
                case 155: {
                    n14 = 107;
                    break;
                }
                case 156: {
                    n14 = 77;
                    break;
                }
                case 157: {
                    n14 = 33;
                    break;
                }
                case 158: {
                    n14 = 38;
                    break;
                }
                case 159: {
                    n14 = 172;
                    break;
                }
                case 160: {
                    n14 = 114;
                    break;
                }
                case 161: {
                    n14 = 202;
                    break;
                }
                case 162: {
                    n14 = 2;
                    break;
                }
                case 163: {
                    n14 = 224;
                    break;
                }
                case 164: {
                    n14 = 169;
                    break;
                }
                case 165: {
                    n14 = 98;
                    break;
                }
                case 166: {
                    n14 = 132;
                    break;
                }
                case 167: {
                    n14 = 213;
                    break;
                }
                case 168: {
                    n14 = 234;
                    break;
                }
                case 169: {
                    n14 = 49;
                    break;
                }
                case 170: {
                    n14 = 9;
                    break;
                }
                case 171: {
                    n14 = 72;
                    break;
                }
                case 172: {
                    n14 = 149;
                    break;
                }
                case 173: {
                    n14 = 90;
                    break;
                }
                case 174: {
                    n14 = 97;
                    break;
                }
                case 175: {
                    n14 = 40;
                    break;
                }
                case 176: {
                    n14 = 55;
                    break;
                }
                case 177: {
                    n14 = 143;
                    break;
                }
                case 178: {
                    n14 = 182;
                    break;
                }
                case 179: {
                    n14 = 27;
                    break;
                }
                case 180: {
                    n14 = 103;
                    break;
                }
                case 181: {
                    n14 = 91;
                    break;
                }
                case 182: {
                    n14 = 227;
                    break;
                }
                case 183: {
                    n14 = 119;
                    break;
                }
                case 184: {
                    n14 = 200;
                    break;
                }
                case 185: {
                    n14 = 92;
                    break;
                }
                case 186: {
                    n14 = 50;
                    break;
                }
                case 187: {
                    n14 = 83;
                    break;
                }
                case 188: {
                    n14 = 115;
                    break;
                }
                case 189: {
                    n14 = 245;
                    break;
                }
                case 190: {
                    n14 = 84;
                    break;
                }
                case 191: {
                    n14 = 161;
                    break;
                }
                case 192: {
                    n14 = 190;
                    break;
                }
                case 193: {
                    n14 = 1;
                    break;
                }
                case 194: {
                    n14 = 124;
                    break;
                }
                case 195: {
                    n14 = 136;
                    break;
                }
                case 196: {
                    n14 = 248;
                    break;
                }
                case 197: {
                    n14 = 240;
                    break;
                }
                case 198: {
                    n14 = 95;
                    break;
                }
                case 199: {
                    n14 = 153;
                    break;
                }
                case 200: {
                    n14 = 66;
                    break;
                }
                case 201: {
                    n14 = 192;
                    break;
                }
                case 202: {
                    n14 = 19;
                    break;
                }
                case 203: {
                    n14 = 230;
                    break;
                }
                case 204: {
                    n14 = 232;
                    break;
                }
                case 205: {
                    n14 = 160;
                    break;
                }
                case 206: {
                    n14 = 148;
                    break;
                }
                case 207: {
                    n14 = 235;
                    break;
                }
                case 208: {
                    n14 = 68;
                    break;
                }
                case 209: {
                    n14 = 201;
                    break;
                }
                case 210: {
                    n14 = 10;
                    break;
                }
                case 211: {
                    n14 = 65;
                    break;
                }
                case 212: {
                    n14 = 229;
                    break;
                }
                case 213: {
                    n14 = 183;
                    break;
                }
                case 214: {
                    n14 = 62;
                    break;
                }
                case 215: {
                    n14 = 156;
                    break;
                }
                case 216: {
                    n14 = 43;
                    break;
                }
                case 217: {
                    n14 = 223;
                    break;
                }
                case 218: {
                    n14 = 42;
                    break;
                }
                case 219: {
                    n14 = 170;
                    break;
                }
                case 220: {
                    n14 = 231;
                    break;
                }
                case 221: {
                    n14 = 217;
                    break;
                }
                case 222: {
                    n14 = 89;
                    break;
                }
                case 223: {
                    n14 = 110;
                    break;
                }
                case 224: {
                    n14 = 180;
                    break;
                }
                case 225: {
                    n14 = 249;
                    break;
                }
                case 226: {
                    n14 = 11;
                    break;
                }
                case 227: {
                    n14 = 127;
                    break;
                }
                case 228: {
                    n14 = 141;
                    break;
                }
                case 229: {
                    n14 = 243;
                    break;
                }
                case 230: {
                    n14 = 56;
                    break;
                }
                case 231: {
                    n14 = 159;
                    break;
                }
                case 232: {
                    n14 = 151;
                    break;
                }
                case 233: {
                    n14 = 250;
                    break;
                }
                case 234: {
                    n14 = 117;
                    break;
                }
                case 235: {
                    n14 = 253;
                    break;
                }
                case 236: {
                    n14 = 215;
                    break;
                }
                case 237: {
                    n14 = 163;
                    break;
                }
                case 238: {
                    n14 = 204;
                    break;
                }
                case 239: {
                    n14 = 88;
                    break;
                }
                case 240: {
                    n14 = 138;
                    break;
                }
                case 241: {
                    n14 = 54;
                    break;
                }
                case 242: {
                    n14 = 162;
                    break;
                }
                case 243: {
                    n14 = 51;
                    break;
                }
                case 244: {
                    n14 = 82;
                    break;
                }
                case 245: {
                    n14 = 67;
                    break;
                }
                case 246: {
                    n14 = 111;
                    break;
                }
                case 247: {
                    n14 = 113;
                    break;
                }
                case 248: {
                    n14 = 35;
                    break;
                }
                case 249: {
                    n14 = 145;
                    break;
                }
                case 250: {
                    n14 = 129;
                    break;
                }
                case 251: {
                    n14 = 176;
                    break;
                }
                case 252: {
                    n14 = 251;
                    break;
                }
                case 253: {
                    n14 = 164;
                    break;
                }
                case 254: {
                    n14 = 37;
                    break;
                }
                default: {
                    n14 = 29;
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
            fm_0.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x474E) & Short.MAX_VALUE;
        if (j[n11] == null) {
            fm_0.j[n11] = h[n11] ^ l2;
        }
        return j[n11];
    }
}

