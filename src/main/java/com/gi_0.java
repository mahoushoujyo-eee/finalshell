/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BK;
import com.FN;
import com.GA;
import com.GO;
import com.KD;
import com.L0;
import com.P9;
import com.SG;
import com.W2;
import com.WC;
import com.WO;
import com.c;
import com.ce_2;
import com.fr_0;
import com.k2_0;
import com.ky_2;
import com.og_2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Gi
 */
public class gi_0
extends BasicButtonUI
implements W2,
SwingConstants,
L0 {
    protected static final Stroke U;
    protected Color e = SG.Y;
    protected Color O = SG.k;
    protected Color S = SG.K;
    protected Color q = SG.h;
    protected Color H = SG.S;
    protected boolean j = SG.P;
    protected Color s = SG.N;
    protected boolean c = SG.j;
    protected int i = SG.t;
    protected boolean f = SG.q;
    protected boolean B = SG.F;
    protected boolean l = SG.e;
    protected int C = SG.d;
    protected Insets J = SG.Z;
    protected Color A = SG.p;
    protected int h = SG.Q;
    protected Color n = SG.f;
    protected Color y = SG.J;
    protected int a = SG.H;
    protected boolean P = SG.C;
    protected float R = SG.U;
    protected boolean V = SG.G;
    protected boolean K = SG.i;
    protected boolean o = SG.w;
    protected boolean k;
    protected og_2 L;
    protected boolean X;
    protected boolean w;
    protected boolean I;
    protected boolean N;
    protected boolean G;
    protected boolean m;
    protected boolean g;
    protected boolean z;
    protected boolean D;
    protected Color E;
    protected boolean W;
    protected float u;
    protected Point F;
    protected WC x;
    protected AbstractButton b;
    protected boolean d;
    protected boolean Z;
    protected boolean T;
    protected boolean t;
    protected MouseAdapter Q;
    protected AncestorListener p;
    protected PropertyChangeListener M;
    private static Rectangle v;
    private static Rectangle r;
    private static Rectangle Y;
    private static final String[] ab;
    private static final String[] bb;

    public gi_0() {
        int[] nArray = KD.s();
        this.k = SG.g;
        this.L = SG.B;
        this.X = SG.m;
        this.w = true;
        this.I = true;
        this.N = true;
        this.G = true;
        this.m = false;
        this.g = false;
        this.z = false;
        this.D = false;
        this.E = new Color(this.s.getRed(), this.s.getGreen(), this.s.getBlue(), 0);
        this.W = false;
        this.u = 0.0f;
        this.F = null;
        this.x = null;
        this.b = null;
        if (nArray != null) {
            ky_2.K(new String[4]);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new gi_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.b = (AbstractButton)jComponent;
        this.d = this.b.isFocusPainted();
        this.Z = this.b.isContentAreaFilled();
        this.T = this.b.isBorderPainted();
        this.t = this.b.isFocusable();
        FN.Y(this.b);
        this.b.setFocusPainted(false);
        this.b.setContentAreaFilled(false);
        this.b.setBorderPainted(false);
        this.b.setFocusable(true);
        int[] nArray = KD.s();
        LookAndFeel.installProperty(this.b, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 18700 out of bounds for length 4", Boolean.FALSE);
        WO.t(this.b, this.L);
        this.h();
        this.Q = new BK(this, jComponent);
        jComponent.addMouseListener(this.Q);
        jComponent.addMouseMotionListener(this.Q);
        this.p = new fr_0(this, jComponent);
        jComponent.addAncestorListener(this.p);
        this.M = new ce_2(this);
        jComponent.addPropertyChangeListener("\u0000ERR:ArrayIndexOutOfBoundsException:Index 18703 out of bounds for length 4", this.M);
        int[] nArray2 = nArray;
        if (ky_2.F() != null) {
            KD.u(new int[4]);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.b, this.L);
        jComponent.removeMouseListener(this.Q);
        jComponent.removeMouseMotionListener(this.Q);
        jComponent.removeAncestorListener(this.p);
        jComponent.removePropertyChangeListener("\u0000ERR:ArrayIndexOutOfBoundsException:Index 18702 out of bounds for length 4", this.M);
        this.b.setBorderPainted(this.T);
        this.b.setContentAreaFilled(this.Z);
        this.b.setFocusPainted(this.d);
        this.b.setFocusable(this.t);
        super.uninstallUI(jComponent);
    }

    @Override
    public Shape B() {
        gi_0 gi_02;
        block4: {
            block5: {
                gi_0 gi_03;
                block2: {
                    block3: {
                        int[] nArray = KD.s();
                        gi_03 = this;
                        if (nArray != null) break block2;
                        if (gi_03.L != null) break block3;
                        gi_02 = this;
                        if (nArray != null) break block4;
                        if (!gi_02.k) break block5;
                    }
                    gi_03 = this;
                }
                return FN.N(gi_03.b);
            }
            gi_02 = this;
        }
        return gi_02.u(this.b, true);
    }

    public Color Y() {
        return this.e;
    }

    public void d(Color color) {
        this.e = color;
    }

    public Color z() {
        return this.O;
    }

    public void Q(Color color) {
        this.O = color;
    }

    public Color k() {
        return this.S;
    }

    public void J(Color color) {
        this.S = color;
    }

    public Color i() {
        return this.q;
    }

    public void w(Color color) {
        this.q = color;
    }

    public Color H() {
        return this.H;
    }

    public void j(Color color) {
        this.H = color;
    }

    public boolean H() {
        return this.c;
    }

    public void f(boolean bl) {
        this.c = bl;
    }

    public boolean G() {
        return this.j;
    }

    public void y(boolean bl) {
        this.j = bl;
    }

    public Color l() {
        return this.s;
    }

    public void u(Color color) {
        this.s = color;
        this.v();
    }

    private void v() {
        this.E = new Color(this.s.getRed(), this.s.getGreen(), this.s.getBlue(), Math.round(this.u * (float)this.s.getAlpha()));
    }

    @Override
    public void h() {
        block3: {
            AbstractButton abstractButton;
            block2: {
                int[] nArray = KD.s();
                abstractButton = this.b;
                if (nArray != null) break block2;
                if (abstractButton == null) break block3;
                abstractButton = this.b;
            }
            abstractButton.setBorder(GA.y(this.g()));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Insets g() {
        block21: {
            block22: {
                block19: {
                    block20: {
                        var2_1 = this.b.getComponentOrientation().isLeftToRight();
                        var1_2 = KD.s();
                        var3_3 = new Insets(this.J.top, (var2_1 != 0 ? this.J.left : this.J.right) + this.a, this.J.bottom, (var2_1 != 0 ? this.J.right : this.J.left) + this.a);
                        v0 = this;
                        if (var1_2 != null) break block19;
                        if (v0.L == null) break block20;
                        var4_4 = this.L.B(this.b);
                        var3_3.top += var4_4.top;
                        v1 = var3_3;
                        v2 = v1;
                        v3 = v1.bottom;
                        v4 = var4_4;
                        if (var1_2 != null) ** GOTO lbl22
                        v2.bottom = v3 + v4.bottom;
                        v5 = var3_3;
                        v2 = v5;
                        v3 = v5.left;
                        if (var2_1 != 0) {
                            v6 = var4_4.left;
                        } else {
                            v4 = var4_4;
lbl22:
                            // 2 sources

                            v6 = v4.right;
                        }
                        v2.left = v3 + v6;
                        v7 = var3_3.right;
                        v8 = var2_1;
                        if (var1_2 == null) {
                            v8 = v8 != 0 ? var4_4.right : var4_4.left;
                        }
                        var3_3.right = v7 + v8;
                        if (var1_2 == null) break block21;
                    }
                    v0 = this;
                }
                v9 = v0.k;
                if (var1_2 != null) break block22;
                if (v9 != 0) break block21;
                v9 = var2_1;
            }
            if (var1_2 == null) {
                v9 = (int)(v9 != 0 ? this.I : this.G);
            }
            var4_5 = v9;
            v10 = var2_1;
            if (var1_2 == null) {
                v10 = (int)(v10 != 0 ? this.g : this.D);
            }
            var5_6 = v10;
            v11 = var2_1;
            if (var1_2 == null) {
                v11 = (int)(v11 != 0 ? this.G : this.I);
            }
            var6_7 = v11;
            v12 = var2_1;
            if (var1_2 == null) {
                v12 = (int)(v12 != 0 ? this.D : this.g);
            }
            var7_8 = v12;
            v13 = var3_3.top;
            v14 = this.w;
            if (var1_2 != null) ** GOTO lbl60
            if (v14 != 0) {
                v14 = this.C + 1;
            } else {
                v14 = this.m;
lbl60:
                // 2 sources

                if (var1_2 == null) {
                    v14 = v14 != 0 ? 1 : 0;
                }
            }
            var3_3.top = v13 + (v14 + this.h);
            v15 = var3_3.left;
            v16 = var4_5;
            if (var1_2 != null) ** GOTO lbl70
            if (v16 != 0) {
                v16 = this.C + 1;
            } else {
                v16 = var5_6;
lbl70:
                // 2 sources

                if (var1_2 == null) {
                    v16 = v16 != 0 ? 1 : 0;
                }
            }
            var3_3.left = v15 + (v16 + this.h);
            v17 = var3_3.bottom;
            v18 = this.N;
            if (var1_2 != null) ** GOTO lbl80
            if (v18 != 0) {
                v18 = this.C + 1;
            } else {
                v18 = this.z;
lbl80:
                // 2 sources

                if (var1_2 == null) {
                    v18 = v18 != 0 ? 1 : 0;
                }
            }
            var3_3.bottom = v17 + (v18 + this.h);
            v19 = var3_3.right;
            v20 = var6_7;
            if (var1_2 != null) ** GOTO lbl90
            if (v20 != 0) {
                v20 = this.C + 1;
            } else {
                v20 = var7_8;
lbl90:
                // 2 sources

                if (var1_2 == null) {
                    v20 = v20 != 0 ? 1 : 0;
                }
            }
            var3_3.right = v19 + (v20 + this.h);
        }
        return var3_3;
    }

    public boolean R() {
        return this.f;
    }

    public void w(boolean bl) {
        this.f = bl;
    }

    public boolean U() {
        return this.B;
    }

    public void d(boolean bl) {
        this.B = bl;
    }

    public boolean k() {
        return this.l;
    }

    public void A(boolean bl) {
        this.l = bl;
    }

    public int d() {
        return this.C;
    }

    public void z(int n10) {
        this.C = n10;
        this.h();
    }

    public Insets A() {
        return this.J;
    }

    public void Q(Insets insets) {
        this.J = insets;
        this.h();
    }

    public Color V() {
        return this.A;
    }

    public void F(Color color) {
        this.A = color;
    }

    public int Z() {
        return this.h;
    }

    public void r(int n10) {
        this.h = n10;
        this.h();
    }

    public Color t() {
        return this.n;
    }

    public void O(Color color) {
        this.n = color;
    }

    public Color E() {
        return this.y;
    }

    public void s(Color color) {
        this.y = color;
    }

    public int N() {
        return this.a;
    }

    public void l(int n10) {
        this.a = n10;
        this.h();
    }

    public int C() {
        return this.i;
    }

    public void D(int n10) {
        this.i = n10;
    }

    public boolean l() {
        return this.P;
    }

    public void u(boolean bl) {
        this.P = bl;
    }

    public float Z() {
        return this.R;
    }

    public void j(float f10) {
        this.R = f10;
    }

    public boolean o() {
        return this.k;
    }

    public void l(boolean bl) {
        this.k = bl;
        this.h();
    }

    public og_2 R() {
        return this.L;
    }

    public void S(og_2 og_22) {
        WO.C(this.b, this.L);
        this.L = og_22;
        WO.t(this.b, this.L);
        this.h();
    }

    public boolean K() {
        return this.X;
    }

    public void B(boolean bl) {
        this.X = bl;
    }

    public boolean x() {
        return this.K;
    }

    public void q(boolean bl) {
        this.K = bl;
    }

    public boolean m() {
        return this.o;
    }

    public void k(boolean bl) {
        this.o = bl;
    }

    public boolean A() {
        return this.V;
    }

    public void M(boolean bl) {
        this.V = bl;
    }

    public boolean n() {
        return this.N;
    }

    public void r(boolean bl) {
        this.N = bl;
        this.h();
    }

    public boolean i() {
        return this.I;
    }

    public void m(boolean bl) {
        this.I = bl;
        this.h();
    }

    public boolean C() {
        return this.G;
    }

    public void E(boolean bl) {
        this.G = bl;
        this.h();
    }

    public boolean Y() {
        return this.w;
    }

    public void J(boolean bl) {
        this.w = bl;
        this.h();
    }

    public void Z(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.w = bl;
        this.I = bl2;
        this.N = bl3;
        this.G = bl4;
        this.h();
    }

    public boolean F() {
        return this.m;
    }

    public void L(boolean bl) {
        this.m = bl;
        this.h();
    }

    public boolean B() {
        return this.g;
    }

    public void Q(boolean bl) {
        this.g = bl;
        this.h();
    }

    public boolean W() {
        return this.z;
    }

    public void W(boolean bl) {
        this.z = bl;
        this.h();
    }

    public boolean I() {
        return this.D;
    }

    public void K(boolean bl) {
        this.D = bl;
        this.h();
    }

    public void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.m = bl;
        this.g = bl2;
        this.z = bl3;
        this.D = bl4;
        this.h();
    }

    public boolean X() {
        return this.W;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void B(Graphics graphics, JComponent jComponent) {
        block22: {
            boolean bl;
            AbstractButton abstractButton;
            block21: {
                int[] nArray;
                block18: {
                    block17: {
                        String string;
                        block20: {
                            View view;
                            block19: {
                                View view2;
                                String string2;
                                block16: {
                                    block15: {
                                        boolean bl2;
                                        block14: {
                                            Graphics graphics2;
                                            try {
                                                graphics2 = (Graphics)lk_0.E((Object)jComponent, (Object)graphics);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            graphics = graphics2;
                                            abstractButton = (AbstractButton)jComponent;
                                            ButtonModel buttonModel = abstractButton.getModel();
                                            FontMetrics fontMetrics = jComponent.getFontMetrics(jComponent.getFont());
                                            int[] nArray2 = KD.s();
                                            string = this.X(abstractButton, fontMetrics, abstractButton.getWidth(), abstractButton.getHeight());
                                            this.clearTextShiftOffset();
                                            nArray = nArray2;
                                            bl2 = buttonModel.isArmed();
                                            if (nArray != null) break block14;
                                            if (!bl2) break block15;
                                            bl2 = buttonModel.isPressed();
                                        }
                                        if (bl2) {
                                            this.paintButtonPressed(graphics, abstractButton);
                                        }
                                    }
                                    if (abstractButton.getIcon() != null) {
                                        this.paintIcon(graphics, jComponent, Y);
                                    }
                                    string2 = string;
                                    if (nArray != null) break block16;
                                    if (string2 == null) break block17;
                                    string2 = string;
                                }
                                bl = string2.isEmpty();
                                if (nArray != null) break block18;
                                if (bl) break block17;
                                view = view2 = (View)jComponent.getClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 18701 out of bounds for length 4");
                                if (nArray != null) break block19;
                                if (view == null) break block20;
                                view = view2;
                            }
                            view.paint(graphics, r);
                            if (nArray == null) break block17;
                        }
                        this.paintText(graphics, abstractButton, r, string);
                    }
                    bl = abstractButton.isFocusPainted();
                }
                if (nArray != null) break block21;
                if (!bl) break block22;
                bl = abstractButton.hasFocus();
            }
            if (bl) {
                this.paintFocus(graphics, abstractButton, v, r, Y);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private String X(AbstractButton abstractButton, FontMetrics fontMetrics, int n10, int n11) {
        int n12;
        Insets insets = abstractButton.getInsets();
        gi_0.v.x = insets.left;
        int[] nArray = KD.s();
        gi_0.v.y = insets.top;
        gi_0.v.width = n10 - (insets.right + gi_0.v.x);
        gi_0.v.height = n11 - (insets.bottom + gi_0.v.y);
        gi_0.r.height = 0;
        gi_0.r.width = 0;
        gi_0.r.y = 0;
        gi_0.r.x = 0;
        gi_0.Y.height = 0;
        gi_0.Y.width = 0;
        gi_0.Y.y = 0;
        gi_0.Y.x = 0;
        String string = abstractButton.getText();
        Icon icon = abstractButton.getIcon();
        int n13 = abstractButton.getVerticalAlignment();
        int n14 = abstractButton.getHorizontalAlignment();
        int n15 = abstractButton.getVerticalTextPosition();
        int n16 = abstractButton.getHorizontalTextPosition();
        AbstractButton abstractButton2 = abstractButton;
        if (nArray == null) {
            if (abstractButton2.getText() == null) {
                n12 = 0;
                return SwingUtilities.layoutCompoundLabel(abstractButton, fontMetrics, string, icon, n13, n14, n15, n16, v, Y, r, n12);
            }
            abstractButton2 = abstractButton;
        }
        n12 = abstractButton2.getIconTextGap();
        return SwingUtilities.layoutCompoundLabel(abstractButton, fontMetrics, string, icon, n13, n14, n15, n16, v, Y, r, n12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean e() {
        int[] nArray = KD.s();
        boolean bl = this.b instanceof JButton;
        if (nArray == null) {
            if (!bl) return false;
            bl = ((JButton)this.b).isDefaultButton();
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    protected Color z(boolean bl) {
        return bl ? this.S : this.e;
    }

    protected Color v(boolean bl) {
        return bl ? this.q : this.O;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean g(AbstractButton abstractButton) {
        int n10;
        Container container = abstractButton.getParent();
        int[] nArray = KD.s();
        Container container2 = container;
        if (nArray == null) {
            if (container2 == null) return 0 != 0;
            container2 = container;
        }
        int n11 = container2 instanceof k2_0;
        if (nArray != null) return n11 != 0;
        if (n11 == 0) return 0 != 0;
        n11 = n10 = container.getComponentZOrder(abstractButton);
        if (nArray != null) return n11 != 0;
        if (n11 <= 0) return 0 != 0;
        k2_0 k2_02 = (k2_0)container;
        Component component = k2_02.getComponent(n10 - 1);
        n11 = component instanceof KD;
        if (nArray != null) return n11 != 0;
        if (n11 == 0) return 0 != 0;
        return component.isEnabled();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean Q(AbstractButton abstractButton) {
        int n10;
        Container container = abstractButton.getParent();
        int[] nArray = KD.s();
        Container container2 = container;
        if (nArray == null) {
            if (container2 == null) return 0 != 0;
            container2 = container;
        }
        int n11 = container2 instanceof k2_0;
        if (nArray != null) return n11 != 0;
        if (n11 == 0) return 0 != 0;
        n11 = n10 = container.getComponentZOrder(abstractButton);
        if (nArray != null) return n11 != 0;
        if (n11 >= container.getComponentCount() - 1) return 0 != 0;
        k2_0 k2_02 = (k2_0)container;
        Component component = k2_02.getComponent(n10 + 1);
        n11 = component instanceof KD;
        if (nArray != null) return n11 != 0;
        if (n11 == 0) return 0 != 0;
        return component.isEnabled();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean O(AbstractButton abstractButton) {
        Container container = abstractButton.getParent();
        int[] nArray = KD.s();
        Container container2 = container;
        if (nArray == null) {
            if (container2 == null) return false;
            container2 = container;
        }
        boolean bl = container2 instanceof k2_0;
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color K(JComponent jComponent) {
        Color color;
        int[] nArray = KD.s();
        gi_0 gi_02 = this;
        if (nArray == null) {
            if (gi_02.j(jComponent)) {
                color = GO.c;
                return color;
            }
            gi_02 = this;
        }
        color = gi_02.A;
        return color;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean j(JComponent jComponent) {
        int[] nArray = KD.s();
        boolean bl = jComponent.isEnabled();
        if (nArray == null) {
            if (!bl) return false;
            bl = this.V;
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = jComponent.isFocusOwner();
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean m(JComponent jComponent, ButtonModel buttonModel) {
        int n10;
        int[] nArray;
        block10: {
            block11: {
                block8: {
                    block9: {
                        nArray = KD.s();
                        n10 = this.K;
                        if (nArray != null) break block8;
                        if (n10 == 0) break block9;
                        n10 = this.W;
                        if (nArray != null) break block8;
                        if (n10 != 0) {
                            n10 = jComponent.isEnabled();
                            if (nArray != null) return n10 != 0;
                            if (n10 != 0) return 1 != 0;
                        }
                    }
                    n10 = this.o;
                }
                if (nArray != null) break block10;
                if (n10 == 0) break block11;
                float f10 = this.u - 0.0f;
                n10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                if (nArray != null) break block10;
                if (n10 > 0) {
                    n10 = jComponent.isEnabled() ? 1 : 0;
                    if (nArray != null) return n10 != 0;
                    if (n10 != 0) return 1 != 0;
                }
            }
            n10 = this.K;
        }
        if (nArray != null) return n10 != 0;
        if (n10 == 0) return 1 != 0;
        n10 = buttonModel.isSelected();
        if (nArray != null) return n10 != 0;
        if (n10 != 0) return 1 != 0;
        n10 = buttonModel.isPressed() ? 1 : 0;
        if (nArray != null) return n10 != 0;
        if (n10 == 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintText(Graphics var1_1, JComponent var2_2, Rectangle var3_3, String var4_4) {
        block8: {
            block5: {
                block6: {
                    block7: {
                        var6_5 = (AbstractButton)var2_2;
                        var7_6 = var6_5.getModel();
                        var8_7 = FN.L(var2_2, var1_1);
                        var5_8 = KD.s();
                        var9_9 = var6_5.getDisplayedMnemonicIndex();
                        if (var5_8 != null) break block5;
                        if (!var7_6.isEnabled()) break block6;
                        v0 = var7_6.isPressed();
                        if (var5_8 != null) break block7;
                        if (v0) ** GOTO lbl-1000
                        v0 = var7_6.isSelected();
                    }
                    if (v0) lbl-1000:
                    // 2 sources

                    {
                        v1 = this.H;
                    } else {
                        v1 = var6_5.getForeground();
                    }
                    var1_1.setColor(v1);
                    FN.W(var1_1, var4_4, var9_9, var3_3.x + this.getTextShiftOffset(), var3_3.y + var8_7.getAscent() + this.getTextShiftOffset());
                    if (var5_8 == null) break block8;
                }
                var1_1.setColor(var6_5.getBackground().brighter());
                FN.W(var1_1, var4_4, var9_9, var3_3.x, var3_3.y + var8_7.getAscent());
                var1_1.setColor(var6_5.getBackground().darker());
            }
            FN.W(var1_1, var4_4, var9_9, var3_3.x - 1, var3_3.y + var8_7.getAscent() - 1);
        }
    }

    private Color L() {
        return P9.N(GO.N, GO.Ff, this.u);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void paintIcon(Graphics var1_1, JComponent var2_2, Rectangle var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Shape u(AbstractButton var1_1, boolean var2_2) {
        var4_3 = var1_1.getComponentOrientation().isLeftToRight();
        var3_4 = KD.s();
        v0 = var4_3;
        if (var3_4 == null) {
            v0 = (int)(v0 != 0 ? this.I : this.G);
        }
        var5_5 = v0;
        v1 = var4_3;
        if (var3_4 == null) {
            v1 = (int)(v1 != 0 ? this.G : this.I);
        }
        var6_6 = v1;
        v2 = var5_5;
        if (var3_4 != null) ** GOTO lbl17
        if (v2 != 0) {
            v3 = this.C;
        } else {
            v2 = -this.C - this.i;
lbl17:
            // 2 sources

            v3 = v2 - 1;
        }
        var7_7 = v3;
        v4 = this.w;
        if (var3_4 != null) ** GOTO lbl25
        if (v4 != 0) {
            v5 = this.C;
        } else {
            v4 = -this.C - this.i;
lbl25:
            // 2 sources

            v5 = v4 - 1;
        }
        var8_8 = v5;
        v6 = var6_6;
        if (var3_4 != null) ** GOTO lbl33
        if (v6 != 0) {
            v7 = var1_1.getWidth() - this.C - 1;
        } else {
            v6 = var1_1.getWidth() + this.C;
lbl33:
            // 2 sources

            v7 = v6 + this.i;
        }
        var9_9 = v7;
        v8 = this.N;
        if (var3_4 != null) ** GOTO lbl41
        if (v8 != 0) {
            v9 = var1_1.getHeight() - this.C - 1;
        } else {
            v8 = var1_1.getHeight() + this.C;
lbl41:
            // 2 sources

            v9 = v8 + this.i;
        }
        var10_10 = v9;
        var11_11 = var9_9 - var7_7;
        var12_12 = var10_10 - var8_8;
        if (this.i > 0) {
            return new RoundRectangle2D.Double(var7_7, var8_8, var11_11, var12_12, this.i * 2 + (var2_2 != false ? 0 : 1), this.i * 2 + (var2_2 != false ? 0 : 1));
        }
        return new Rectangle2D.Double(var7_7, var8_8, var11_11, var12_12);
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        Dimension dimension = super.getPreferredSize(jComponent);
        if (this.L != null) {
            dimension = FN.h(dimension, this.L.d(jComponent));
        }
        return dimension;
    }

    static void F(gi_0 gi_02) {
        gi_02.v();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "f\f\u00ae\u001b\u00e7q\u00af{\u00bd\u0083W\"\u00b1\u00da\u0013l\u00ec\u00c1\u0095\u0010\u0014\u0093Y\u0010\u00b10$U\u00d1\u00e2\u00d6\u00bc\u0088\u00cc\u008f\u00bc\u00c6\u0019\u0094+\u00ba";
                var4_3 = "f\f\u00ae\u001b\u00e7q\u00af{\u00bd\u0083W\"\u00b1\u00da\u0013l\u00ec\u00c1\u0095\u0010\u0014\u0093Y\u0010\u00b10$U\u00d1\u00e2\u00d6\u00bc\u0088\u00cc\u008f\u00bc\u00c6\u0019\u0094+\u00ba".length();
                var1_4 = 20;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 94;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "f\u00e2\u00cb\u00ad\u0006\u00b9e\u00db\u00c4\u00d1\u00af";
                    var4_3 = "f\u00e2\u00cb\u00ad\u0006\u00b9e\u00db\u00c4\u00d1\u00af".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 61;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 46;
                            break;
                        }
                        case 1: {
                            v15 = 76;
                            break;
                        }
                        case 2: {
                            v15 = 80;
                            break;
                        }
                        case 3: {
                            v15 = 116;
                            break;
                        }
                        case 4: {
                            v15 = 2;
                            break;
                        }
                        case 5: {
                            v15 = 25;
                            break;
                        }
                        default: {
                            v15 = 97;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        gi_0.ab = var5;
        gi_0.bb = new String[4];
        gi_0.U = new BasicStroke(3.0f);
        gi_0.v = new Rectangle();
        gi_0.r = new Rectangle();
        gi_0.Y = new Rectangle();
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4C90) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 72;
                    break;
                }
                case 1: {
                    n14 = 244;
                    break;
                }
                case 2: {
                    n14 = 81;
                    break;
                }
                case 3: {
                    n14 = 192;
                    break;
                }
                case 4: {
                    n14 = 249;
                    break;
                }
                case 5: {
                    n14 = 34;
                    break;
                }
                case 6: {
                    n14 = 95;
                    break;
                }
                case 7: {
                    n14 = 78;
                    break;
                }
                case 8: {
                    n14 = 164;
                    break;
                }
                case 9: {
                    n14 = 227;
                    break;
                }
                case 10: {
                    n14 = 165;
                    break;
                }
                case 11: {
                    n14 = 52;
                    break;
                }
                case 12: {
                    n14 = 8;
                    break;
                }
                case 13: {
                    n14 = 126;
                    break;
                }
                case 14: {
                    n14 = 170;
                    break;
                }
                case 15: {
                    n14 = 183;
                    break;
                }
                case 16: {
                    n14 = 68;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 46;
                    break;
                }
                case 19: {
                    n14 = 3;
                    break;
                }
                case 20: {
                    n14 = 226;
                    break;
                }
                case 21: {
                    n14 = 50;
                    break;
                }
                case 22: {
                    n14 = 174;
                    break;
                }
                case 23: {
                    n14 = 88;
                    break;
                }
                case 24: {
                    n14 = 80;
                    break;
                }
                case 25: {
                    n14 = 253;
                    break;
                }
                case 26: {
                    n14 = 6;
                    break;
                }
                case 27: {
                    n14 = 76;
                    break;
                }
                case 28: {
                    n14 = 85;
                    break;
                }
                case 29: {
                    n14 = 7;
                    break;
                }
                case 30: {
                    n14 = 219;
                    break;
                }
                case 31: {
                    n14 = 140;
                    break;
                }
                case 32: {
                    n14 = 1;
                    break;
                }
                case 33: {
                    n14 = 60;
                    break;
                }
                case 34: {
                    n14 = 44;
                    break;
                }
                case 35: {
                    n14 = 39;
                    break;
                }
                case 36: {
                    n14 = 168;
                    break;
                }
                case 37: {
                    n14 = 231;
                    break;
                }
                case 38: {
                    n14 = 254;
                    break;
                }
                case 39: {
                    n14 = 237;
                    break;
                }
                case 40: {
                    n14 = 151;
                    break;
                }
                case 41: {
                    n14 = 155;
                    break;
                }
                case 42: {
                    n14 = 91;
                    break;
                }
                case 43: {
                    n14 = 145;
                    break;
                }
                case 44: {
                    n14 = 48;
                    break;
                }
                case 45: {
                    n14 = 224;
                    break;
                }
                case 46: {
                    n14 = 218;
                    break;
                }
                case 47: {
                    n14 = 112;
                    break;
                }
                case 48: {
                    n14 = 101;
                    break;
                }
                case 49: {
                    n14 = 217;
                    break;
                }
                case 50: {
                    n14 = 220;
                    break;
                }
                case 51: {
                    n14 = 247;
                    break;
                }
                case 52: {
                    n14 = 40;
                    break;
                }
                case 53: {
                    n14 = 139;
                    break;
                }
                case 54: {
                    n14 = 188;
                    break;
                }
                case 55: {
                    n14 = 19;
                    break;
                }
                case 56: {
                    n14 = 206;
                    break;
                }
                case 57: {
                    n14 = 14;
                    break;
                }
                case 58: {
                    n14 = 135;
                    break;
                }
                case 59: {
                    n14 = 21;
                    break;
                }
                case 60: {
                    n14 = 15;
                    break;
                }
                case 61: {
                    n14 = 156;
                    break;
                }
                case 62: {
                    n14 = 181;
                    break;
                }
                case 63: {
                    n14 = 43;
                    break;
                }
                case 64: {
                    n14 = 162;
                    break;
                }
                case 65: {
                    n14 = 223;
                    break;
                }
                case 66: {
                    n14 = 67;
                    break;
                }
                case 67: {
                    n14 = 111;
                    break;
                }
                case 68: {
                    n14 = 215;
                    break;
                }
                case 69: {
                    n14 = 23;
                    break;
                }
                case 70: {
                    n14 = 97;
                    break;
                }
                case 71: {
                    n14 = 147;
                    break;
                }
                case 72: {
                    n14 = 89;
                    break;
                }
                case 73: {
                    n14 = 230;
                    break;
                }
                case 74: {
                    n14 = 45;
                    break;
                }
                case 75: {
                    n14 = 36;
                    break;
                }
                case 76: {
                    n14 = 212;
                    break;
                }
                case 77: {
                    n14 = 77;
                    break;
                }
                case 78: {
                    n14 = 32;
                    break;
                }
                case 79: {
                    n14 = 187;
                    break;
                }
                case 80: {
                    n14 = 69;
                    break;
                }
                case 81: {
                    n14 = 41;
                    break;
                }
                case 82: {
                    n14 = 130;
                    break;
                }
                case 83: {
                    n14 = 166;
                    break;
                }
                case 84: {
                    n14 = 125;
                    break;
                }
                case 85: {
                    n14 = 195;
                    break;
                }
                case 86: {
                    n14 = 70;
                    break;
                }
                case 87: {
                    n14 = 53;
                    break;
                }
                case 88: {
                    n14 = 238;
                    break;
                }
                case 89: {
                    n14 = 138;
                    break;
                }
                case 90: {
                    n14 = 248;
                    break;
                }
                case 91: {
                    n14 = 177;
                    break;
                }
                case 92: {
                    n14 = 119;
                    break;
                }
                case 93: {
                    n14 = 106;
                    break;
                }
                case 94: {
                    n14 = 216;
                    break;
                }
                case 95: {
                    n14 = 16;
                    break;
                }
                case 96: {
                    n14 = 82;
                    break;
                }
                case 97: {
                    n14 = 158;
                    break;
                }
                case 98: {
                    n14 = 178;
                    break;
                }
                case 99: {
                    n14 = 136;
                    break;
                }
                case 100: {
                    n14 = 214;
                    break;
                }
                case 101: {
                    n14 = 56;
                    break;
                }
                case 102: {
                    n14 = 10;
                    break;
                }
                case 103: {
                    n14 = 235;
                    break;
                }
                case 104: {
                    n14 = 87;
                    break;
                }
                case 105: {
                    n14 = 64;
                    break;
                }
                case 106: {
                    n14 = 94;
                    break;
                }
                case 107: {
                    n14 = 137;
                    break;
                }
                case 108: {
                    n14 = 107;
                    break;
                }
                case 109: {
                    n14 = 27;
                    break;
                }
                case 110: {
                    n14 = 245;
                    break;
                }
                case 111: {
                    n14 = 198;
                    break;
                }
                case 112: {
                    n14 = 176;
                    break;
                }
                case 113: {
                    n14 = 169;
                    break;
                }
                case 114: {
                    n14 = 205;
                    break;
                }
                case 115: {
                    n14 = 157;
                    break;
                }
                case 116: {
                    n14 = 246;
                    break;
                }
                case 117: {
                    n14 = 110;
                    break;
                }
                case 118: {
                    n14 = 209;
                    break;
                }
                case 119: {
                    n14 = 194;
                    break;
                }
                case 120: {
                    n14 = 73;
                    break;
                }
                case 121: {
                    n14 = 42;
                    break;
                }
                case 122: {
                    n14 = 58;
                    break;
                }
                case 123: {
                    n14 = 123;
                    break;
                }
                case 124: {
                    n14 = 108;
                    break;
                }
                case 125: {
                    n14 = 153;
                    break;
                }
                case 126: {
                    n14 = 93;
                    break;
                }
                case 127: {
                    n14 = 84;
                    break;
                }
                case 128: {
                    n14 = 213;
                    break;
                }
                case 129: {
                    n14 = 12;
                    break;
                }
                case 130: {
                    n14 = 128;
                    break;
                }
                case 131: {
                    n14 = 98;
                    break;
                }
                case 132: {
                    n14 = 66;
                    break;
                }
                case 133: {
                    n14 = 175;
                    break;
                }
                case 134: {
                    n14 = 134;
                    break;
                }
                case 135: {
                    n14 = 38;
                    break;
                }
                case 136: {
                    n14 = 241;
                    break;
                }
                case 137: {
                    n14 = 148;
                    break;
                }
                case 138: {
                    n14 = 199;
                    break;
                }
                case 139: {
                    n14 = 35;
                    break;
                }
                case 140: {
                    n14 = 208;
                    break;
                }
                case 141: {
                    n14 = 252;
                    break;
                }
                case 142: {
                    n14 = 225;
                    break;
                }
                case 143: {
                    n14 = 186;
                    break;
                }
                case 144: {
                    n14 = 159;
                    break;
                }
                case 145: {
                    n14 = 141;
                    break;
                }
                case 146: {
                    n14 = 29;
                    break;
                }
                case 147: {
                    n14 = 0;
                    break;
                }
                case 148: {
                    n14 = 182;
                    break;
                }
                case 149: {
                    n14 = 83;
                    break;
                }
                case 150: {
                    n14 = 240;
                    break;
                }
                case 151: {
                    n14 = 13;
                    break;
                }
                case 152: {
                    n14 = 204;
                    break;
                }
                case 153: {
                    n14 = 200;
                    break;
                }
                case 154: {
                    n14 = 150;
                    break;
                }
                case 155: {
                    n14 = 124;
                    break;
                }
                case 156: {
                    n14 = 71;
                    break;
                }
                case 157: {
                    n14 = 57;
                    break;
                }
                case 158: {
                    n14 = 242;
                    break;
                }
                case 159: {
                    n14 = 55;
                    break;
                }
                case 160: {
                    n14 = 116;
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
                    n14 = 143;
                    break;
                }
                case 164: {
                    n14 = 118;
                    break;
                }
                case 165: {
                    n14 = 127;
                    break;
                }
                case 166: {
                    n14 = 47;
                    break;
                }
                case 167: {
                    n14 = 203;
                    break;
                }
                case 168: {
                    n14 = 105;
                    break;
                }
                case 169: {
                    n14 = 190;
                    break;
                }
                case 170: {
                    n14 = 28;
                    break;
                }
                case 171: {
                    n14 = 37;
                    break;
                }
                case 172: {
                    n14 = 228;
                    break;
                }
                case 173: {
                    n14 = 173;
                    break;
                }
                case 174: {
                    n14 = 86;
                    break;
                }
                case 175: {
                    n14 = 51;
                    break;
                }
                case 176: {
                    n14 = 96;
                    break;
                }
                case 177: {
                    n14 = 92;
                    break;
                }
                case 178: {
                    n14 = 243;
                    break;
                }
                case 179: {
                    n14 = 211;
                    break;
                }
                case 180: {
                    n14 = 90;
                    break;
                }
                case 181: {
                    n14 = 54;
                    break;
                }
                case 182: {
                    n14 = 114;
                    break;
                }
                case 183: {
                    n14 = 115;
                    break;
                }
                case 184: {
                    n14 = 132;
                    break;
                }
                case 185: {
                    n14 = 131;
                    break;
                }
                case 186: {
                    n14 = 65;
                    break;
                }
                case 187: {
                    n14 = 171;
                    break;
                }
                case 188: {
                    n14 = 26;
                    break;
                }
                case 189: {
                    n14 = 197;
                    break;
                }
                case 190: {
                    n14 = 250;
                    break;
                }
                case 191: {
                    n14 = 33;
                    break;
                }
                case 192: {
                    n14 = 63;
                    break;
                }
                case 193: {
                    n14 = 146;
                    break;
                }
                case 194: {
                    n14 = 207;
                    break;
                }
                case 195: {
                    n14 = 179;
                    break;
                }
                case 196: {
                    n14 = 100;
                    break;
                }
                case 197: {
                    n14 = 185;
                    break;
                }
                case 198: {
                    n14 = 232;
                    break;
                }
                case 199: {
                    n14 = 210;
                    break;
                }
                case 200: {
                    n14 = 17;
                    break;
                }
                case 201: {
                    n14 = 25;
                    break;
                }
                case 202: {
                    n14 = 144;
                    break;
                }
                case 203: {
                    n14 = 31;
                    break;
                }
                case 204: {
                    n14 = 163;
                    break;
                }
                case 205: {
                    n14 = 201;
                    break;
                }
                case 206: {
                    n14 = 233;
                    break;
                }
                case 207: {
                    n14 = 102;
                    break;
                }
                case 208: {
                    n14 = 22;
                    break;
                }
                case 209: {
                    n14 = 229;
                    break;
                }
                case 210: {
                    n14 = 11;
                    break;
                }
                case 211: {
                    n14 = 234;
                    break;
                }
                case 212: {
                    n14 = 59;
                    break;
                }
                case 213: {
                    n14 = 189;
                    break;
                }
                case 214: {
                    n14 = 222;
                    break;
                }
                case 215: {
                    n14 = 255;
                    break;
                }
                case 216: {
                    n14 = 154;
                    break;
                }
                case 217: {
                    n14 = 20;
                    break;
                }
                case 218: {
                    n14 = 221;
                    break;
                }
                case 219: {
                    n14 = 152;
                    break;
                }
                case 220: {
                    n14 = 251;
                    break;
                }
                case 221: {
                    n14 = 161;
                    break;
                }
                case 222: {
                    n14 = 109;
                    break;
                }
                case 223: {
                    n14 = 167;
                    break;
                }
                case 224: {
                    n14 = 184;
                    break;
                }
                case 225: {
                    n14 = 121;
                    break;
                }
                case 226: {
                    n14 = 30;
                    break;
                }
                case 227: {
                    n14 = 24;
                    break;
                }
                case 228: {
                    n14 = 193;
                    break;
                }
                case 229: {
                    n14 = 104;
                    break;
                }
                case 230: {
                    n14 = 75;
                    break;
                }
                case 231: {
                    n14 = 79;
                    break;
                }
                case 232: {
                    n14 = 133;
                    break;
                }
                case 233: {
                    n14 = 5;
                    break;
                }
                case 234: {
                    n14 = 117;
                    break;
                }
                case 235: {
                    n14 = 113;
                    break;
                }
                case 236: {
                    n14 = 149;
                    break;
                }
                case 237: {
                    n14 = 122;
                    break;
                }
                case 238: {
                    n14 = 172;
                    break;
                }
                case 239: {
                    n14 = 61;
                    break;
                }
                case 240: {
                    n14 = 18;
                    break;
                }
                case 241: {
                    n14 = 196;
                    break;
                }
                case 242: {
                    n14 = 9;
                    break;
                }
                case 243: {
                    n14 = 49;
                    break;
                }
                case 244: {
                    n14 = 99;
                    break;
                }
                case 245: {
                    n14 = 120;
                    break;
                }
                case 246: {
                    n14 = 129;
                    break;
                }
                case 247: {
                    n14 = 160;
                    break;
                }
                case 248: {
                    n14 = 74;
                    break;
                }
                case 249: {
                    n14 = 191;
                    break;
                }
                case 250: {
                    n14 = 236;
                    break;
                }
                case 251: {
                    n14 = 239;
                    break;
                }
                case 252: {
                    n14 = 142;
                    break;
                }
                case 253: {
                    n14 = 62;
                    break;
                }
                case 254: {
                    n14 = 180;
                    break;
                }
                default: {
                    n14 = 4;
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
            gi_0.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }
}

