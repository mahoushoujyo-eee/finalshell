/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.RV;
import com.W2;
import com.WO;
import com.c;
import com.e_0;
import com.hd_0;
import com.ij_2;
import com.kq_0;
import com.og_2;
import com.pv_1;
import com.so_0;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KV
extends BasicTabbedPaneUI
implements W2,
L0 {
    private ij_2 R = e_0.V;
    private Color j = e_0.g;
    private Color F = e_0.l;
    private Color k = e_0.s;
    private Color b = e_0.Y;
    private int r = e_0.b;
    private int M = e_0.Z;
    private boolean V = e_0.C;
    private Insets c = e_0.j;
    private Insets T = e_0.r;
    private og_2 C = e_0.h;
    private int K = e_0.R;
    private int n = e_0.U;
    private so_0 t = e_0.u;
    private Color I = e_0.f;
    private Color g = e_0.m;
    private boolean e = e_0.P;
    private boolean q = e_0.k;
    private Color B = e_0.e;
    private boolean f = e_0.O;
    private final Map l = new HashMap();
    private final Map w = new HashMap();
    private FocusAdapter a;
    private static final String d;

    public static ComponentUI createUI(JComponent jComponent) {
        return new KV();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.tabPane);
        this.tabPane.setBackground(this.B);
        WO.t(this.tabPane, this.C);
        this.h();
        this.a = new pv_1(this);
        this.tabPane.addFocusListener(this.a);
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        String string = hd_0.X();
        WO.C(this.tabPane, this.C);
        String string2 = string;
        KV kV = this;
        if (string2 != null) {
            if (kV.a != null) {
                jComponent.removeFocusListener(this.a);
            }
            kV = this;
        }
        super.uninstallUI(jComponent);
    }

    @Override
    public Shape B() {
        return GA.X(this.tabPane, this.N(), this.e());
    }

    @Override
    public void h() {
        block8: {
            KV kV;
            Insets insets;
            block10: {
                block11: {
                    KV kV2;
                    String string;
                    block9: {
                        JTabbedPane jTabbedPane;
                        block7: {
                            string = hd_0.X();
                            jTabbedPane = this.tabPane;
                            if (string == null) break block7;
                            if (jTabbedPane == null) break block8;
                            kV2 = this;
                            if (string == null) break block9;
                            jTabbedPane = kV2.tabPane;
                        }
                        if (FN.l(jTabbedPane)) {
                            return;
                        }
                        kV2 = this;
                    }
                    insets = kV2.H(this.tabPane);
                    kV = this;
                    if (string == null) break block10;
                    if (!kV.R.equals((Object)ij_2.standalone)) break block11;
                    this.tabPane.setBorder(GA.y(FN.Z(insets, new Insets(this.M, this.M, this.M, this.M))));
                    if (string != null) break block8;
                }
                kV = this;
            }
            kV.tabPane.setBorder(GA.y(insets));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Insets H(JComponent jComponent) {
        Insets insets;
        String string = hd_0.X();
        og_2 og_22 = this.C;
        if (string != null) {
            if (og_22 == null) {
                insets = new Insets(0, 0, 0, 0);
                return insets;
            }
            og_22 = this.C;
        }
        insets = og_22.B(jComponent);
        return insets;
    }

    public int N() {
        return this.M;
    }

    public void M(int n10) {
        this.M = n10;
        this.h();
    }

    public boolean S() {
        return this.V;
    }

    public void J(boolean bl) {
        this.V = bl;
    }

    public int e() {
        return this.r;
    }

    public void l(int n10) {
        this.r = n10;
    }

    public Insets h() {
        return this.c;
    }

    public void Z(Insets insets) {
        this.c = insets;
    }

    public Insets r() {
        return this.T;
    }

    public void S(Insets insets) {
        this.T = insets;
    }

    public Color O() {
        return this.j;
    }

    public void R(Color color) {
        this.j = color;
    }

    public Color n() {
        return this.F;
    }

    public void t(Color color) {
        this.F = color;
    }

    public Color T() {
        return this.k;
    }

    public void T(Color color) {
        this.k = color;
    }

    public Color z() {
        return this.b;
    }

    public void u(Color color) {
        this.b = color;
    }

    public void x(int n10, Color color) {
        this.l.put(n10, color);
    }

    public Color m(int n10) {
        return (Color)this.l.get(n10);
    }

    public void v(int n10, og_2 og_22) {
        this.w.put(n10, og_22);
    }

    public og_2 k(int n10) {
        return (og_2)this.w.get(n10);
    }

    public ij_2 t() {
        return this.R;
    }

    public void e(ij_2 ij_22) {
        this.R = ij_22;
        this.h();
    }

    public og_2 Q() {
        return this.C;
    }

    public void G(og_2 og_22) {
        WO.C(this.tabPane, this.C);
        this.C = og_22;
        WO.t(this.tabPane, this.C);
        this.h();
    }

    public int s() {
        return this.K;
    }

    public void g(int n10) {
        this.K = n10;
    }

    public int c() {
        return this.n;
    }

    public void j(int n10) {
        this.n = n10;
    }

    public so_0 d() {
        return this.t;
    }

    public void x(so_0 so_02) {
        this.t = so_02;
    }

    public Color r() {
        return this.I;
    }

    public void P(Color color) {
        this.I = color;
    }

    public Color k() {
        return this.g;
    }

    public void k(Color color) {
        this.g = color;
    }

    public boolean U() {
        return this.e;
    }

    public void I(boolean bl) {
        this.e = bl;
    }

    public boolean h() {
        return this.q;
    }

    public void m(boolean bl) {
        this.q = bl;
    }

    public Color D() {
        return this.B;
    }

    public void H(Color color) {
        this.B = color;
    }

    public boolean f() {
        return this.f;
    }

    public void R(boolean bl) {
        this.f = bl;
    }

    @Override
    protected int getTabRunIndent(int n10, int n11) {
        return this.K;
    }

    @Override
    protected int getTabRunOverlay(int n10) {
        return this.n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean shouldPadTabRun(int n10, int n11) {
        String string = hd_0.X();
        int n12 = this.t.equals((Object)so_0.never);
        if (string != null) {
            if (n12 != 0) return 0 != 0;
            n12 = this.t.equals((Object)so_0.always);
        }
        if (string == null) return n12 != 0;
        if (n12 != 0) return 1 != 0;
        n12 = this.t.equals((Object)so_0.multiline);
        if (string != null) {
            if (n12 == 0) return 0 != 0;
            n12 = this.runCount;
        }
        if (string == null) return n12 != 0;
        if (n12 <= 1) return 0 != 0;
        return 1 != 0;
    }

    @Override
    protected boolean shouldRotateTabRuns(int n10) {
        return true;
    }

    @Override
    protected Insets getContentBorderInsets(int n10) {
        Insets insets = new Insets(0, 0, 0, 0);
        return insets;
    }

    @Override
    protected Insets getTabAreaInsets(int n10) {
        Insets insets = new Insets(0, 0, 0, 0);
        KV.rotateInsets(this.R.equals((Object)ij_2.standalone) ? new Insets(n10 == 4 ? 1 : 0, 1, 0, 2) : new Insets(-1, -1, 0, 0), insets, n10);
        return insets;
    }

    @Override
    protected Insets getTabInsets(int n10, int n11) {
        return new Insets(3, 3, 3, 3);
    }

    @Override
    protected Insets getSelectedTabPadInsets(int n10) {
        Insets insets = new Insets(0, 0, 0, 0);
        return insets;
    }

    @Override
    protected int getTabLabelShiftX(int n10, int n11, boolean bl) {
        return 0;
    }

    @Override
    protected int getTabLabelShiftY(int n10, int n11, boolean bl) {
        return 0;
    }

    @Override
    protected void paintTabBorder(Graphics graphics, int n10, int n11, int n12, int n13, int n14, int n15, boolean bl) {
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void paintTabBackground(Graphics var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8) {
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

    @Override
    protected void paintText(Graphics graphics, int n10, Font font, FontMetrics fontMetrics, int n11, String string, Rectangle rectangle, boolean bl) {
        block9: {
            int n12;
            block10: {
                block11: {
                    String string2;
                    block13: {
                        Color color;
                        block14: {
                            block17: {
                                Integer n13;
                                Map map;
                                block16: {
                                    boolean bl2;
                                    block15: {
                                        int n14;
                                        JTabbedPane jTabbedPane;
                                        block12: {
                                            block8: {
                                                View view;
                                                block7: {
                                                    View view2;
                                                    String string3 = hd_0.X();
                                                    graphics.setFont(font);
                                                    string2 = string3;
                                                    view = view2 = this.getTextViewForTab(n11);
                                                    if (string2 == null) break block7;
                                                    if (view == null) break block8;
                                                    view = view2;
                                                }
                                                view.paint(graphics, rectangle);
                                                if (string2 != null) break block9;
                                            }
                                            n12 = this.tabPane.getDisplayedMnemonicIndexAt(n11);
                                            if (string2 == null) break block10;
                                            if (!this.tabPane.isEnabled()) break block11;
                                            jTabbedPane = this.tabPane;
                                            n14 = n11;
                                            if (string2 == null) break block12;
                                            if (!jTabbedPane.isEnabledAt(n14)) break block11;
                                            jTabbedPane = this.tabPane;
                                            n14 = n11;
                                        }
                                        color = jTabbedPane.getForegroundAt(n14);
                                        if (string2 == null) break block13;
                                        if (!bl) break block14;
                                        bl2 = color instanceof UIResource;
                                        if (string2 == null) break block15;
                                        if (!bl2) break block14;
                                        map = this.l;
                                        n13 = n11;
                                        if (string2 == null) break block16;
                                        bl2 = map.containsKey(n13);
                                    }
                                    if (!bl2) break block17;
                                    map = this.l;
                                    n13 = n11;
                                }
                                color = (Color)map.get(n13);
                                if (string2 != null) break block14;
                            }
                            Color color2 = UIManager.getColor(d);
                            if (string2 == null) break block13;
                            if (color2 != null) {
                                color = color2;
                            }
                        }
                        graphics.setColor(color);
                        FN.W(graphics, string, n12, rectangle.x, rectangle.y + fontMetrics.getAscent());
                    }
                    if (string2 != null) break block9;
                }
                graphics.setColor(this.tabPane.getBackgroundAt(n11).brighter());
                FN.W(graphics, string, n12, rectangle.x, rectangle.y + fontMetrics.getAscent());
                graphics.setColor(this.tabPane.getBackgroundAt(n11).darker());
            }
            FN.W(graphics, string, n12, rectangle.x - 1, rectangle.y + fontMetrics.getAscent() - 1);
        }
    }

    /*
     * Unable to fully structure code
     */
    private GeneralPath P(kq_0 var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, boolean var7_7) {
        block20: {
            block23: {
                block21: {
                    block22: {
                        block18: {
                            block19: {
                                block15: {
                                    block17: {
                                        block16: {
                                            var9_8 = this.tabPane.getInsets();
                                            var8_9 = hd_0.X();
                                            v0 = this.R.equals((Object)ij_2.attached);
                                            if (var8_9 == null) break block15;
                                            if (v0 == 0) break block16;
                                            v0 = var7_7;
                                            if (var8_9 == null) break block15;
                                            if (v0 == 0) break block16;
                                            v1 = var2_2;
                                            v2 = 1;
                                            if (var8_9 == null) break block17;
                                            if (v1 != v2) break block16;
                                            v1 = var3_3--;
                                            v2 = var9_8.left;
                                            if (var8_9 == null) break block17;
                                            if (v1 == v2) {
                                                // empty if block
                                            }
                                        }
                                        var4_4 -= 2;
                                        var6_6 += 2;
                                        v1 = ++var5_5;
                                        v2 = cy_1.v;
                                    }
                                    var5_5 = v1 - v2;
                                    v0 = (int)this.R.equals((Object)ij_2.standalone);
                                }
                                if (var8_9 != null) {
                                    v0 = v0 != 0 ? this.r : 0;
                                }
                                var10_10 = v0;
                                var10_10 = cy_1.f;
                                var11_11 = new GeneralPath(0);
                                v3 = var7_7;
                                if (var8_9 != null) {
                                    if (v3 == 0) {
                                        v3 = (int)this.e;
                                        if (var8_9 != null) {
                                            if (v3 != 0) {
                                                return var11_11;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v3 = var2_2;
                                    }
                                }
                                v4 = 1;
                                if (var8_9 == null) break block18;
                                if (v3 != v4) break block19;
                                var11_11.moveTo(var3_3, var4_4 + var6_6 + this.K(var1_1));
                                var11_11.lineTo(var3_3, var4_4 + var10_10);
                                var11_11.quadTo(var3_3, var4_4, var3_3 + var10_10, var4_4);
                                var11_11.lineTo(var3_3 + var5_5 - var10_10, var4_4);
                                var11_11.quadTo(var3_3 + var5_5, var4_4, var3_3 + var5_5, var4_4 + var10_10);
                                var11_11.lineTo(var3_3 + var5_5, var4_4 + var6_6 + this.K(var1_1));
                                if (var8_9 != null) break block20;
                            }
                            v3 = var2_2;
                            v4 = 3;
                        }
                        if (var8_9 == null) break block21;
                        if (v3 != v4) break block22;
                        var11_11.moveTo(var3_3, var4_4 - this.K(var1_1));
                        var11_11.lineTo(var3_3, var4_4 + var6_6 - var10_10);
                        var11_11.quadTo(var3_3, var4_4 + var6_6, var3_3 + var10_10, var4_4 + var6_6);
                        var11_11.lineTo(var3_3 + var5_5 - var10_10, var4_4 + var6_6);
                        var11_11.quadTo(var3_3 + var5_5, var4_4 + var6_6, var3_3 + var5_5, var4_4 + var6_6 - var10_10);
                        var11_11.lineTo(var3_3 + var5_5, var4_4 - this.K(var1_1));
                        if (var8_9 != null) break block20;
                    }
                    v3 = var2_2;
                    v4 = 2;
                }
                if (v3 != v4) break block23;
                var11_11.moveTo(var3_3 + var5_5 + this.K(var1_1), var4_4);
                var11_11.lineTo(var3_3 + var10_10, var4_4);
                var11_11.quadTo(var3_3, var4_4, var3_3, var4_4 + var10_10);
                var11_11.lineTo(var3_3, var4_4 + var6_6 - var10_10);
                var11_11.quadTo(var3_3, var4_4 + var6_6, var3_3 + var10_10, var4_4 + var6_6);
                var11_11.lineTo(var3_3 + var5_5 + this.K(var1_1), var4_4 + var6_6);
                if (var8_9 != null) break block20;
            }
            var11_11.moveTo(var3_3 - this.K(var1_1), var4_4);
            var11_11.lineTo(var3_3 + var5_5 - var10_10, var4_4);
            var11_11.quadTo(var3_3 + var5_5, var4_4, var3_3 + var5_5, var4_4 + var10_10);
            var11_11.lineTo(var3_3 + var5_5, var4_4 + var6_6 - var10_10);
            var11_11.quadTo(var3_3 + var5_5, var4_4 + var6_6, var3_3 + var5_5 - var10_10, var4_4 + var6_6);
            var11_11.lineTo(var3_3 - this.K(var1_1), var4_4 + var6_6);
        }
        return var11_11;
    }

    private int K(kq_0 kq_02) {
        String string = hd_0.X();
        int n10 = kq_02.equals((Object)kq_0.shade);
        if (string != null) {
            if (n10 != 0) {
                int n11 = this.r;
                if (string != null) {
                    n11 = n11 > 0 ? this.r : 1;
                }
                return -n11;
            }
            n10 = kq_02.equals((Object)kq_0.border);
        }
        if (string != null) {
            if (n10 != 0) {
                return -1;
            }
            n10 = kq_02.equals((Object)kq_0.backgroundPainter) ? 1 : 0;
        }
        if (string != null) {
            if (n10 != 0) {
                return 2;
            }
            n10 = 0;
        }
        return n10;
    }

    private Point X(int n10, int n11, int n12, int n13, int n14) {
        String string = hd_0.X();
        int n15 = n10;
        int n16 = 1;
        if (string != null) {
            if (n15 == n16) {
                return new Point(n11, n12);
            }
            n15 = n10;
            n16 = 3;
        }
        if (string != null) {
            if (n15 == n16) {
                return new Point(n11, n12 + n14);
            }
            n15 = n10;
            n16 = 2;
        }
        if (n15 == n16) {
            return new Point(n11, n12);
        }
        return new Point(n11 + n13, n12);
    }

    private Point K(int n10, int n11, int n12, int n13, int n14) {
        String string = hd_0.X();
        int n15 = n10;
        int n16 = 1;
        if (string != null) {
            if (n15 == n16) {
                return new Point(n11, n12 + n14 - 4);
            }
            n15 = n10;
            n16 = 3;
        }
        if (string != null) {
            if (n15 == n16) {
                return new Point(n11, n12 + 4);
            }
            n15 = n10;
            n16 = 2;
        }
        if (n15 == n16) {
            return new Point(n11 + n13 - 4, n12);
        }
        return new Point(n11 + 4, n12);
    }

    @Override
    protected void paintContentBorder(Graphics graphics, int n10, int n11) {
        block28: {
            Object object;
            Graphics2D graphics2D;
            block24: {
                Insets insets;
                int n12;
                block29: {
                    Rectangle rectangle;
                    String string;
                    block27: {
                        GeneralPath generalPath;
                        int n13;
                        Shape shape;
                        block25: {
                            block26: {
                                block19: {
                                    block20: {
                                        block23: {
                                            Shape shape2;
                                            int n14;
                                            block21: {
                                                block22: {
                                                    block18: {
                                                        block17: {
                                                            block16: {
                                                                graphics2D = (Graphics2D)graphics;
                                                                object = RV.X(graphics2D);
                                                                string = hd_0.X();
                                                                n12 = this.M(n10);
                                                                insets = this.tabPane.getInsets();
                                                                if (string == null) break block16;
                                                                if (n10 != 1 && n10 != 3) break block17;
                                                                ++insets.right;
                                                            }
                                                            if (string != null) break block18;
                                                        }
                                                        ++insets.bottom;
                                                    }
                                                    rectangle = n11 != -1 ? this.getTabBounds(this.tabPane, n11) : null;
                                                    shape = this.j(n10, n12, insets, rectangle);
                                                    n13 = this.R.equals((Object)ij_2.standalone);
                                                    if (string == null) break block19;
                                                    if (n13 == 0) break block20;
                                                    generalPath = new GeneralPath(0);
                                                    generalPath.append(new Rectangle2D.Double(0.0, 0.0, this.tabPane.getWidth(), this.tabPane.getHeight()), false);
                                                    generalPath.append(shape, false);
                                                    n14 = this.w.containsKey(n11);
                                                    if (string == null) break block21;
                                                    if (n14 == 0) break block22;
                                                    shape2 = RV.n(graphics2D, shape);
                                                    ((og_2)this.w.get(n11)).u(graphics2D, shape.getBounds(), this.tabPane);
                                                    RV.w(graphics2D, shape2);
                                                    if (string != null) break block23;
                                                }
                                                n14 = n11;
                                            }
                                            shape2 = n14 != -1 ? this.tabPane.getBackgroundAt(n11) : null;
                                            Object object2 = shape2;
                                            if (string != null) {
                                                object2 = object2 != null ? shape2 : this.tabPane.getBackground();
                                            }
                                            graphics2D.setPaint((Paint)object2);
                                            graphics2D.fill(shape);
                                        }
                                        graphics2D.setPaint(this.g);
                                        GA.l(graphics2D, null, GO.F3, shape, null, this.tabPane.isFocusOwner());
                                        if (string != null) break block24;
                                    }
                                    n13 = this.w.containsKey(n11) ? 1 : 0;
                                }
                                if (string == null) break block25;
                                if (n13 == 0) break block26;
                                ((og_2)this.w.get(n11)).u(graphics2D, shape.getBounds(), this.tabPane);
                                if (string != null) break block27;
                            }
                            n13 = n11;
                        }
                        Serializable serializable = generalPath = n13 != -1 ? this.tabPane.getBackgroundAt(n11) : null;
                        if (string != null) {
                            serializable = serializable != null ? generalPath : this.tabPane.getBackground();
                        }
                        graphics2D.setPaint((Paint)((Object)serializable));
                        graphics2D.fill(shape);
                    }
                    graphics2D.setPaint(this.g);
                    if (string == null) break block28;
                    if (n10 != 1) break block24;
                    if (rectangle == null) break block29;
                    int n15 = insets.left;
                    int n16 = rectangle.x;
                    if (string != null) {
                        if (n15 < n16) {
                            graphics2D.drawLine(insets.left, insets.top + n12, rectangle.x, insets.top + n12);
                        }
                        n15 = rectangle.x + rectangle.width;
                        n16 = this.tabPane.getWidth() - insets.right;
                    }
                    if (n15 >= n16) break block24;
                    graphics2D.drawLine(rectangle.x + rectangle.width, insets.top + n12, this.tabPane.getWidth() - insets.right, insets.top + n12);
                    if (string != null) break block24;
                }
                graphics2D.drawLine(insets.left, insets.top + n12, this.tabPane.getWidth() - insets.right, insets.top + n12);
            }
            RV.X(graphics2D, object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int M(int n10) {
        int n11;
        int n12;
        int n13;
        block4: {
            block5: {
                int n14;
                int n15;
                block2: {
                    block3: {
                        String string = hd_0.X();
                        n15 = n10;
                        n14 = 1;
                        if (string == null) break block2;
                        if (n15 == n14) break block3;
                        n13 = n10;
                        n12 = 3;
                        if (string == null) break block4;
                        if (n13 != n12) break block5;
                    }
                    n15 = this.calculateTabAreaHeight(n10, this.runCount, this.maxTabHeight);
                    n14 = 1;
                }
                n11 = n15 - n14;
                return n11;
            }
            n13 = this.calculateTabAreaWidth(n10, this.runCount, this.maxTabWidth);
            n12 = 1;
        }
        n11 = n13 - n12;
        return n11;
    }

    /*
     * Exception decompiling
     */
    private Shape j(int var1_1, int var2_2, Insets var3_3, Rectangle var4_4) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Shape N() {
        RoundRectangle2D.Double double_ = null;
        int n10 = this.tabPane.getTabPlacement();
        int n11 = this.M(n10);
        String string = hd_0.X();
        Insets insets = this.tabPane.getInsets();
        int n12 = n10;
        int n13 = 1;
        if (string != null) {
            if (n12 == n13) {
                return new RoundRectangle2D.Double(insets.left, insets.top + n11, this.tabPane.getWidth() - insets.left - insets.right, this.tabPane.getHeight() - insets.top - n11 - insets.bottom, this.r * 2, this.r * 2);
            }
            n12 = n10;
            n13 = 3;
        }
        if (string != null) {
            if (n12 == n13) {
                return new RoundRectangle2D.Double(insets.left, insets.top, this.tabPane.getWidth() - insets.left - insets.right, this.tabPane.getHeight() - insets.top - n11 - insets.bottom, this.r * 2, this.r * 2);
            }
            n12 = n10;
            n13 = 2;
        }
        if (string != null) {
            if (n12 == n13) {
                return new RoundRectangle2D.Double(insets.left + n11, insets.top, this.tabPane.getWidth() - insets.left - n11 - insets.right, this.tabPane.getHeight() - insets.top - insets.bottom, this.r * 2, this.r * 2);
            }
            n12 = n10;
            n13 = 4;
        }
        if (n12 != n13) return double_;
        return new RoundRectangle2D.Double(insets.left, insets.top, this.tabPane.getWidth() - insets.left - n11 - insets.right, this.tabPane.getHeight() - insets.top - insets.bottom, this.r * 2, this.r * 2);
    }

    @Override
    protected void paintFocusIndicator(Graphics graphics, int n10, Rectangle[] rectangleArray, int n11, Rectangle rectangle, Rectangle rectangle2, boolean bl) {
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        block3: {
            og_2 og_22;
            block2: {
                String string = hd_0.X();
                og_22 = this.C;
                if (string == null) break block2;
                if (og_22 == null) break block3;
                og_22 = this.C;
            }
            og_22.u((Graphics2D)graphics, FN.N(jComponent), jComponent);
        }
        Map map = FN.B(graphics);
        super.paint(graphics, jComponent);
        FN.O(graphics, map);
    }

    static JTabbedPane q(KV kV) {
        return kV.tabPane;
    }

    static JTabbedPane C(KV kV) {
        return kV.tabPane;
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
                char[] cArray3 = "HWmjf)O}Xj&p(syU{mg\u000bpnShzl8qx".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 100;
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
                            n17 = 120;
                            break;
                        }
                        case 1: {
                            n17 = 82;
                            break;
                        }
                        case 2: {
                            n17 = 107;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 103;
                            break;
                        }
                        case 5: {
                            n17 = 41;
                            break;
                        }
                        default: {
                            n17 = 123;
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
        d = new String(cArray).intern();
    }
}

