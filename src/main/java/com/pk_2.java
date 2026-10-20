/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D3;
import com.F9;
import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.LS;
import com.RV;
import com.TA;
import com.W2;
import com.WO;
import com.kg_0;
import com.ky_2;
import com.nj_1;
import com.og_2;
import com.xk_0;
import com.xt_1;
import com.y0_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Shape;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.LookAndFeel;
import javax.swing.RootPaneContainer;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolBarUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.pk
 */
public class pk_2
extends BasicToolBarUI
implements W2,
L0 {
    private Color o = nj_1.m;
    private Color n = nj_1.o;
    private Color y = nj_1.I;
    private Color B = nj_1.r;
    private boolean t = nj_1.i;
    private int v = nj_1.f;
    private int d = nj_1.k;
    private Insets k = nj_1.s;
    private int u;
    private LS q;
    private og_2 c;
    private final Color J;
    private final Color[] W;
    private final float[] K;
    private AncestorListener G;
    private PropertyChangeListener x;
    private PropertyChangeListener a;
    private static final String[] b;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;

    public pk_2() {
        String string = xt_1.l();
        this.u = nj_1.R;
        this.q = nj_1.x;
        this.c = nj_1.t;
        this.J = new Color(pk_2.a(31377, 5196034962051609868L), pk_2.a(99, 69284681394180095L), pk_2.a(99, 69284681394180095L));
        this.W = new Color[]{GO.l, this.J, this.J, GO.l};
        this.K = new float[]{0.0f, 0.33f, 0.66f, 1.0f};
        if (string == null) {
            ky_2.K(new String[3]);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new pk_2();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.toolBar);
        LookAndFeel.installProperty(this.toolBar, pk_2.a(13921, 10260), Boolean.FALSE);
        WO.t(this.toolBar, this.c);
        this.h();
        this.T(this.toolBar, true);
        this.G = new F9(this);
        this.toolBar.addAncestorListener(this.G);
        this.x = new kg_0(this);
        this.toolBar.addPropertyChangeListener(pk_2.a(13920, -8928), this.x);
        this.toolBar.addPropertyChangeListener(pk_2.a(13922, -23677), this.x);
        this.a = new y0_0(this);
        this.toolBar.addPropertyChangeListener(pk_2.a(13925, 21319), this.a);
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.toolBar, this.c);
        jComponent.removeAncestorListener(this.G);
        jComponent.removePropertyChangeListener(pk_2.a(13927, -2027), this.x);
        jComponent.removePropertyChangeListener(pk_2.a(13924, -12426), this.x);
        jComponent.removePropertyChangeListener(pk_2.a(13926, -6321), this.a);
        super.uninstallUI(jComponent);
        this.toolBar = null;
    }

    @Override
    public Shape B() {
        pk_2 pk_22;
        block4: {
            block5: {
                pk_2 pk_23;
                block2: {
                    block3: {
                        String string = xt_1.l();
                        pk_23 = this;
                        if (string == null) break block2;
                        if (pk_23.c != null) break block3;
                        pk_22 = this;
                        if (string == null) break block4;
                        if (!pk_22.t) break block5;
                    }
                    pk_23 = this;
                }
                return FN.N(pk_23.toolBar);
            }
            pk_22 = this;
        }
        return GA.X(pk_22.toolBar, this.L(), this.z());
    }

    public boolean j() {
        return this.t;
    }

    public void M(boolean bl) {
        this.t = bl;
        this.h();
        if (this.c != null && !bl) {
            this.toolBar.setOpaque(false);
        }
    }

    public og_2 x() {
        return this.c;
    }

    public void l(og_2 og_22) {
        WO.C(this.toolBar, this.c);
        this.c = og_22;
        WO.t(this.toolBar, this.c);
        this.h();
    }

    public int z() {
        String string = xt_1.l();
        int n10 = this.t;
        if (string != null) {
            if (n10 != 0) {
                return 0;
            }
            n10 = this.v;
        }
        return n10;
    }

    public void L(int n10) {
        this.v = n10;
    }

    public Color q() {
        return this.o;
    }

    public void k(Color color) {
        this.o = color;
    }

    public Color z() {
        return this.n;
    }

    public void L(Color color) {
        this.n = color;
    }

    public Color S() {
        return this.y;
    }

    public void e(Color color) {
        this.y = color;
    }

    public Color k() {
        return this.B;
    }

    public void x(Color color) {
        this.B = color;
    }

    public int L() {
        String string = xt_1.l();
        int n10 = this.t;
        if (string != null) {
            if (n10 != 0) {
                return 0;
            }
            n10 = this.d;
        }
        return n10;
    }

    public void x(int n10) {
        this.d = n10;
        this.h();
    }

    public Insets D() {
        return this.k;
    }

    public void O(Insets insets) {
        this.k = insets;
        this.h();
    }

    public LS c() {
        return this.q;
    }

    public void W(LS lS) {
        this.q = lS;
        this.h();
    }

    public int S() {
        return this.u;
    }

    public void y(int n10) {
        this.u = n10;
        this.T(this.toolBar, false);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void h() {
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

    private void T(JComponent jComponent, boolean bl) {
        String string;
        boolean bl2;
        block7: {
            boolean bl3;
            block6: {
                bl2 = jComponent.getLayout() instanceof TA;
                string = xt_1.l();
                bl3 = bl;
                if (string == null) break block6;
                if (bl3) break block7;
                bl3 = bl2;
            }
            if (!bl3) {
                return;
            }
        }
        TA tA = new TA(this.u, this.toolBar.getOrientation());
        if (string != null) {
            if (bl2) {
                TA tA2 = (TA)jComponent.getLayout();
                tA.w(tA2.C());
            }
            jComponent.setLayout(tA);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        block38: {
            block36: {
                block37: {
                    block60: {
                        block56: {
                            block57: {
                                block59: {
                                    block35: {
                                        block58: {
                                            block55: {
                                                block45: {
                                                    block54: {
                                                        block52: {
                                                            block53: {
                                                                block51: {
                                                                    block50: {
                                                                        block46: {
                                                                            block47: {
                                                                                block49: {
                                                                                    block48: {
                                                                                        block41: {
                                                                                            block42: {
                                                                                                block44: {
                                                                                                    block43: {
                                                                                                        block39: {
                                                                                                            block40: {
                                                                                                                var3_3 = xt_1.l();
                                                                                                                v0 = this;
                                                                                                                if (var3_3 == null) break block39;
                                                                                                                if (v0.c == null) break block40;
                                                                                                                this.c.u((Graphics2D)var1_1, FN.N(var2_2), var2_2);
                                                                                                                if (var3_3 != null) break block38;
                                                                                                            }
                                                                                                            v0 = this;
                                                                                                        }
                                                                                                        if (v0.t) break block38;
                                                                                                        var4_4 = (Graphics2D)var1_1;
                                                                                                        var5_5 = RV.X(var4_4);
                                                                                                        v1 = this.toolBar.getOrientation();
                                                                                                        if (var3_3 != null) {
                                                                                                            v1 = v1 == 0 ? 1 : 0;
                                                                                                        }
                                                                                                        var6_6 = v1;
                                                                                                        var7_7 = var2_2.getComponentOrientation().isLeftToRight();
                                                                                                        v2 = this.isFloating();
                                                                                                        if (var3_3 == null) break block41;
                                                                                                        if (v2 == 0) break block42;
                                                                                                        if (var6_6 == 0) break block43;
                                                                                                        var4_4.setPaint(new GradientPaint(0.0f, var2_2.getHeight() / 2, this.o, 0.0f, var2_2.getHeight(), this.n));
                                                                                                        if (var3_3 != null) break block44;
                                                                                                    }
                                                                                                    var4_4.setPaint(new GradientPaint(var2_2.getWidth() / 2, 0.0f, this.o, var2_2.getWidth(), 0.0f, this.n));
                                                                                                }
                                                                                                var4_4.fillRect(0, 0, var2_2.getWidth(), var2_2.getHeight());
                                                                                                if (var3_3 != null) break block45;
                                                                                            }
                                                                                            v2 = (int)this.q.equals((Object)LS.standalone);
                                                                                        }
                                                                                        if (var3_3 == null) break block46;
                                                                                        if (v2 == 0) break block47;
                                                                                        var8_8 = new RoundRectangle2D.Double(this.d, this.d, var2_2.getWidth() - this.d * 2 - 1, var2_2.getHeight() - this.d * 2 - 1, this.v, this.v);
                                                                                        v3 = var2_2.isEnabled();
                                                                                        if (var3_3 != null) {
                                                                                            if (v3 != 0) {
                                                                                                RV.Y(var4_4, var8_8, GO.r, this.d);
                                                                                            }
                                                                                            v3 = var6_6;
                                                                                        }
                                                                                        if (v3 == 0) break block48;
                                                                                        var4_4.setPaint(new GradientPaint(0.0f, var2_2.getHeight() / 2, this.o, 0.0f, var2_2.getHeight(), this.n));
                                                                                        if (var3_3 != null) break block49;
                                                                                    }
                                                                                    var4_4.setPaint(new GradientPaint(var2_2.getWidth() / 2, 0.0f, this.o, var2_2.getWidth(), 0.0f, this.n));
                                                                                }
                                                                                var4_4.fill(var8_8);
                                                                                var4_4.setPaint(var2_2.isEnabled() != false ? this.y : this.B);
                                                                                var4_4.draw(var8_8);
                                                                                if (var3_3 != null) break block45;
                                                                            }
                                                                            v2 = var6_6;
                                                                        }
                                                                        if (v2 == 0) break block50;
                                                                        var4_4.setPaint(new GradientPaint(0.0f, var2_2.getHeight() / 2, this.o, 0.0f, var2_2.getHeight(), this.n));
                                                                        if (var3_3 != null) break block51;
                                                                    }
                                                                    var4_4.setPaint(new GradientPaint(var2_2.getWidth() / 2, 0.0f, this.o, var2_2.getWidth(), 0.0f, this.n));
                                                                }
                                                                var4_4.fillRect(0, 0, var2_2.getWidth(), var2_2.getHeight());
                                                                var4_4.setPaint(var2_2.isEnabled() != false ? this.y : this.B);
                                                                v4 = var6_6;
                                                                if (var3_3 == null) break block52;
                                                                if (v4 == 0) break block53;
                                                                var4_4.drawLine(0, var2_2.getHeight() - 1, var2_2.getWidth() - 1, var2_2.getHeight() - 1);
                                                                if (var3_3 != null) break block45;
                                                            }
                                                            v4 = var7_7;
                                                        }
                                                        if (v4 == 0) break block54;
                                                        var4_4.drawLine(var2_2.getWidth() - 1, 0, var2_2.getWidth() - 1, var2_2.getHeight() - 1);
                                                        if (var3_3 != null) break block45;
                                                    }
                                                    var4_4.drawLine(0, 0, 0, var2_2.getHeight() - 1);
                                                }
                                                v5 = this.toolBar.isFloatable();
                                                if (var3_3 == null) break block55;
                                                if (v5 == 0) break block36;
                                                v5 = this.toolBar.getOrientation();
                                            }
                                            if (var3_3 == null) break block56;
                                            if (v5 != 0) break block57;
                                            var8_9 = this.d + 1;
                                            v6 = var9_11 = var2_2.getHeight() - this.d - 2;
                                            if (var3_3 == null) break block58;
                                            if (v6 <= var8_9) break block59;
                                            var4_4.setPaint(new LinearGradientPaint(0.0f, var8_9, 0.0f, var9_11, this.K, this.W));
                                            v6 = (int)this.q.equals((Object)LS.standalone);
                                        }
                                        if (var3_3 == null) ** GOTO lbl98
                                        if (v6 != 0) {
                                            v7 = this.d + 1 + this.k.left;
                                            v8 = this.isFloating();
                                            if (var3_3 != null) {
                                                v8 = v8 != 0 ? -1 : 1;
                                            }
                                            v9 = v7 + v8;
                                        } else {
                                            v6 = this.k.left + 2;
lbl98:
                                            // 2 sources

                                            v9 = v6 - 1;
                                        }
                                        var10_12 = v9;
                                        v10 = var7_7;
                                        if (var3_3 != null) {
                                            if (v10 == 0) {
                                                var10_12 = var2_2.getWidth() - var10_12 - 2;
                                            }
                                            v10 = var2_2.getHeight() / 2 - 3;
                                        }
                                        for (var11_13 = (int)(v9076375); var11_13 >= var8_9; var11_13 -= 4) {
                                            var4_4.fillRect(var10_12, var11_13, 2, 2);
                                            if (var3_3 != null) {
                                                if (var3_3 != null) continue;
                                            }
                                            break block35;
                                        }
                                        var11_13 = var2_2.getHeight() / 2 + 1;
                                    }
                                    while (var11_13 + 2 <= var9_11) {
                                        var4_4.fillRect(var10_12, var11_13, 2, 2);
                                        var11_13 += 4;
                                        if (var3_3 != null) {
                                            if (var3_3 != null) continue;
                                        }
                                        break block36;
                                    }
                                }
                                if (var3_3 != null) break block36;
                            }
                            v5 = this.d + 1;
                        }
                        var8_10 = v5;
                        v11 = var9_11 = var2_2.getWidth() - this.d - 2;
                        if (var3_3 == null) break block60;
                        if (v11 <= var8_10) break block36;
                        var4_4.setPaint(new LinearGradientPaint(var8_10, 0.0f, var9_11, 0.0f, this.K, this.W));
                        v11 = (int)this.q.equals((Object)LS.standalone);
                    }
                    if (var3_3 == null) ** GOTO lbl139
                    if (v11 != 0) {
                        v12 = this.d + 1 + this.k.top;
                        v13 = this.isFloating();
                        if (var3_3 != null) {
                            v13 = v13 != 0 ? -1 : 1;
                        }
                        v14 = v12 + v13;
                    } else {
                        v11 = this.k.top + 2;
lbl139:
                        // 2 sources

                        v14 = v11 - 1;
                    }
                    var10_12 = v14;
                    for (var11_13 = var2_2.getWidth() / 2 - 3; var11_13 >= var8_10; var11_13 -= 4) {
                        var4_4.fillRect(var11_13, var10_12, 2, 2);
                        if (var3_3 != null) {
                            if (var3_3 != null) continue;
                        }
                        break block37;
                    }
                    var11_13 = var2_2.getWidth() / 2 + 1;
                }
                while (var11_13 + 2 <= var9_11) {
                    var4_4.fillRect(var11_13, var10_12, 2, 2);
                    var11_13 += 4;
                    if (var3_3 != null) {
                        if (var3_3 != null) continue;
                    }
                    break block38;
                }
            }
            RV.X(var4_4, var5_5);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Dimension getPreferredSize(JComponent var1_1) {
        var2_2 = xt_1.l();
        v0 = var1_1.getLayout();
        if (var2_2 == null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var1_1.getLayout();
lbl6:
            // 2 sources

            v1 = v0.preferredLayoutSize(var1_1);
        } else {
            v1 = var3_3 = null;
        }
        if (this.c != null) {
            var3_3 = FN.h(var3_3, this.c.d(var1_1));
        }
        return var3_3;
    }

    @Override
    protected RootPaneContainer createFloatingWindow(JToolBar jToolBar) {
        D3 d3;
        block4: {
            block5: {
                boolean bl;
                String string;
                Window window;
                block2: {
                    block3: {
                        window = FN.L(jToolBar);
                        string = xt_1.l();
                        bl = window instanceof Frame;
                        if (string == null) break block2;
                        if (!bl) break block3;
                        d3 = new D3(this, (Frame)window, jToolBar.getName(), false);
                        if (string != null) break block4;
                    }
                    bl = window instanceof Dialog;
                }
                if (!bl) break block5;
                d3 = new D3(this, (Dialog)window, jToolBar.getName(), false);
                if (string != null) break block4;
            }
            d3 = new D3(this, (Frame)null, jToolBar.getName(), false);
        }
        d3.getRootPane().setName(pk_2.a(13923, -25429));
        d3.setTitle(jToolBar.getName());
        d3.setResizable(false);
        WindowListener windowListener = this.createFrameListener();
        d3.addWindowListener(windowListener);
        return d3;
    }

    @Override
    protected BasicToolBarUI.DragWindow createDragWindow(JToolBar jToolBar) {
        BasicToolBarUI.DragWindow dragWindow = super.createDragWindow(jToolBar);
        xk_0.f(dragWindow, 0.5f);
        return dragWindow;
    }

    @Override
    protected void installRolloverBorders(JComponent jComponent) {
    }

    @Override
    protected void installNonRolloverBorders(JComponent jComponent) {
    }

    @Override
    protected void installNormalBorders(JComponent jComponent) {
    }

    @Override
    protected void setBorderToRollover(Component component) {
    }

    @Override
    protected void setBorderToNonRollover(Component component) {
    }

    @Override
    protected void setBorderToNormal(Component component) {
    }

    static JToolBar b(pk_2 pk_22) {
        return pk_22.toolBar;
    }

    static void I(pk_2 pk_22, JComponent jComponent, boolean bl) {
        pk_22.T(jComponent, bl);
    }

    static JToolBar K(pk_2 pk_22) {
        return pk_22.toolBar;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[8];
                        var11_1 = 0;
                        var10_2 = "\u00df\u00dcx\u00b9\u00c5\u0082KE\u00e3U-\u0014\u0080O\u001a`\f\u0014W\u00d4\u00f9\u001e\u00cc\u00ec\u00c8\u0086?\u00bc\u0001\u00c8U;\u0014+ o\u008d\u00a2\u00a9\u0082cC\u00e8\u009b2\"]b\u00c7\u00aa\u00a7 \u00d6\t\u0091\u00b9\u009f\u00cc\u00e5\u00bd\u0015\rG\u0016\u00f5\u00a4g\u0001\u00cc\u00a8\u00d0\u00ed\u00ceRC*\u0096P\u00dd\u0087'i\u00d7\u0005\u0007\u00a4\u000b\u00db\u009d\u00f8\u0091\u00d5\u0087I\u00e5\u00a3A%";
                        var12_3 = "\u00df\u00dcx\u00b9\u00c5\u0082KE\u00e3U-\u0014\u0080O\u001a`\f\u0014W\u00d4\u00f9\u001e\u00cc\u00ec\u00c8\u0086?\u00bc\u0001\u00c8U;\u0014+ o\u008d\u00a2\u00a9\u0082cC\u00e8\u009b2\"]b\u00c7\u00aa\u00a7 \u00d6\t\u0091\u00b9\u009f\u00cc\u00e5\u00bd\u0015\rG\u0016\u00f5\u00a4g\u0001\u00cc\u00a8\u00d0\u00ed\u00ceRC*\u0096P\u00dd\u0087'i\u00d7\u0005\u0007\u00a4\u000b\u00db\u009d\u00f8\u0091\u00d5\u0087I\u00e5\u00a3A%".length();
                        var9_4 = 11;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 95;
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
                            var10_2 = "u\u0005\u000b\u00fa\u0097C\t2\u0004\u00c5U\u0080\u00a0\u0097\u00809";
                            var12_3 = "u\u0005\u000b\u00fa\u0097C\t2\u0004\u00c5U\u0080\u00a0\u0097\u00809".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 61;
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
                                    v15 = 44;
                                    break;
                                }
                                case 1: {
                                    v15 = 87;
                                    break;
                                }
                                case 2: {
                                    v15 = 89;
                                    break;
                                }
                                case 3: {
                                    v15 = 37;
                                    break;
                                }
                                case 4: {
                                    v15 = 127;
                                    break;
                                }
                                case 5: {
                                    v15 = 24;
                                    break;
                                }
                                default: {
                                    v15 = 106;
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
                pk_2.b = var13;
                pk_2.e = new String[8];
                var0_7 = 1114445160718269919L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = ";\u009c\u0016\u00e6\u00bf\u00dbHM\u00ae5\u00fcC\u00e0\u00a3\u00b2\u00be";
                var5_11 = ";\u009c\u0016\u00e6\u00bf\u00dbHM\u00ae5\u00fcC\u00e0\u00a3\u00b2\u00be".length();
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
        pk_2.f = var6_8;
        pk_2.g = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3667) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 14;
                    break;
                }
                case 1: {
                    n14 = 203;
                    break;
                }
                case 2: {
                    n14 = 186;
                    break;
                }
                case 3: {
                    n14 = 74;
                    break;
                }
                case 4: {
                    n14 = 139;
                    break;
                }
                case 5: {
                    n14 = 40;
                    break;
                }
                case 6: {
                    n14 = 4;
                    break;
                }
                case 7: {
                    n14 = 121;
                    break;
                }
                case 8: {
                    n14 = 169;
                    break;
                }
                case 9: {
                    n14 = 100;
                    break;
                }
                case 10: {
                    n14 = 34;
                    break;
                }
                case 11: {
                    n14 = 85;
                    break;
                }
                case 12: {
                    n14 = 17;
                    break;
                }
                case 13: {
                    n14 = 208;
                    break;
                }
                case 14: {
                    n14 = 114;
                    break;
                }
                case 15: {
                    n14 = 116;
                    break;
                }
                case 16: {
                    n14 = 237;
                    break;
                }
                case 17: {
                    n14 = 240;
                    break;
                }
                case 18: {
                    n14 = 245;
                    break;
                }
                case 19: {
                    n14 = 84;
                    break;
                }
                case 20: {
                    n14 = 162;
                    break;
                }
                case 21: {
                    n14 = 247;
                    break;
                }
                case 22: {
                    n14 = 196;
                    break;
                }
                case 23: {
                    n14 = 135;
                    break;
                }
                case 24: {
                    n14 = 154;
                    break;
                }
                case 25: {
                    n14 = 152;
                    break;
                }
                case 26: {
                    n14 = 65;
                    break;
                }
                case 27: {
                    n14 = 241;
                    break;
                }
                case 28: {
                    n14 = 67;
                    break;
                }
                case 29: {
                    n14 = 125;
                    break;
                }
                case 30: {
                    n14 = 177;
                    break;
                }
                case 31: {
                    n14 = 49;
                    break;
                }
                case 32: {
                    n14 = 216;
                    break;
                }
                case 33: {
                    n14 = 126;
                    break;
                }
                case 34: {
                    n14 = 55;
                    break;
                }
                case 35: {
                    n14 = 219;
                    break;
                }
                case 36: {
                    n14 = 8;
                    break;
                }
                case 37: {
                    n14 = 50;
                    break;
                }
                case 38: {
                    n14 = 38;
                    break;
                }
                case 39: {
                    n14 = 32;
                    break;
                }
                case 40: {
                    n14 = 187;
                    break;
                }
                case 41: {
                    n14 = 119;
                    break;
                }
                case 42: {
                    n14 = 155;
                    break;
                }
                case 43: {
                    n14 = 20;
                    break;
                }
                case 44: {
                    n14 = 115;
                    break;
                }
                case 45: {
                    n14 = 10;
                    break;
                }
                case 46: {
                    n14 = 64;
                    break;
                }
                case 47: {
                    n14 = 122;
                    break;
                }
                case 48: {
                    n14 = 70;
                    break;
                }
                case 49: {
                    n14 = 147;
                    break;
                }
                case 50: {
                    n14 = 235;
                    break;
                }
                case 51: {
                    n14 = 51;
                    break;
                }
                case 52: {
                    n14 = 238;
                    break;
                }
                case 53: {
                    n14 = 250;
                    break;
                }
                case 54: {
                    n14 = 231;
                    break;
                }
                case 55: {
                    n14 = 26;
                    break;
                }
                case 56: {
                    n14 = 1;
                    break;
                }
                case 57: {
                    n14 = 209;
                    break;
                }
                case 58: {
                    n14 = 255;
                    break;
                }
                case 59: {
                    n14 = 88;
                    break;
                }
                case 60: {
                    n14 = 109;
                    break;
                }
                case 61: {
                    n14 = 103;
                    break;
                }
                case 62: {
                    n14 = 158;
                    break;
                }
                case 63: {
                    n14 = 56;
                    break;
                }
                case 64: {
                    n14 = 214;
                    break;
                }
                case 65: {
                    n14 = 15;
                    break;
                }
                case 66: {
                    n14 = 161;
                    break;
                }
                case 67: {
                    n14 = 244;
                    break;
                }
                case 68: {
                    n14 = 181;
                    break;
                }
                case 69: {
                    n14 = 24;
                    break;
                }
                case 70: {
                    n14 = 45;
                    break;
                }
                case 71: {
                    n14 = 75;
                    break;
                }
                case 72: {
                    n14 = 207;
                    break;
                }
                case 73: {
                    n14 = 92;
                    break;
                }
                case 74: {
                    n14 = 96;
                    break;
                }
                case 75: {
                    n14 = 13;
                    break;
                }
                case 76: {
                    n14 = 143;
                    break;
                }
                case 77: {
                    n14 = 168;
                    break;
                }
                case 78: {
                    n14 = 249;
                    break;
                }
                case 79: {
                    n14 = 66;
                    break;
                }
                case 80: {
                    n14 = 254;
                    break;
                }
                case 81: {
                    n14 = 43;
                    break;
                }
                case 82: {
                    n14 = 248;
                    break;
                }
                case 83: {
                    n14 = 18;
                    break;
                }
                case 84: {
                    n14 = 44;
                    break;
                }
                case 85: {
                    n14 = 229;
                    break;
                }
                case 86: {
                    n14 = 2;
                    break;
                }
                case 87: {
                    n14 = 99;
                    break;
                }
                case 88: {
                    n14 = 12;
                    break;
                }
                case 89: {
                    n14 = 221;
                    break;
                }
                case 90: {
                    n14 = 193;
                    break;
                }
                case 91: {
                    n14 = 165;
                    break;
                }
                case 92: {
                    n14 = 167;
                    break;
                }
                case 93: {
                    n14 = 227;
                    break;
                }
                case 94: {
                    n14 = 107;
                    break;
                }
                case 95: {
                    n14 = 105;
                    break;
                }
                case 96: {
                    n14 = 215;
                    break;
                }
                case 97: {
                    n14 = 35;
                    break;
                }
                case 98: {
                    n14 = 163;
                    break;
                }
                case 99: {
                    n14 = 42;
                    break;
                }
                case 100: {
                    n14 = 9;
                    break;
                }
                case 101: {
                    n14 = 176;
                    break;
                }
                case 102: {
                    n14 = 226;
                    break;
                }
                case 103: {
                    n14 = 149;
                    break;
                }
                case 104: {
                    n14 = 157;
                    break;
                }
                case 105: {
                    n14 = 252;
                    break;
                }
                case 106: {
                    n14 = 80;
                    break;
                }
                case 107: {
                    n14 = 192;
                    break;
                }
                case 108: {
                    n14 = 53;
                    break;
                }
                case 109: {
                    n14 = 210;
                    break;
                }
                case 110: {
                    n14 = 220;
                    break;
                }
                case 111: {
                    n14 = 60;
                    break;
                }
                case 112: {
                    n14 = 174;
                    break;
                }
                case 113: {
                    n14 = 86;
                    break;
                }
                case 114: {
                    n14 = 110;
                    break;
                }
                case 115: {
                    n14 = 91;
                    break;
                }
                case 116: {
                    n14 = 178;
                    break;
                }
                case 117: {
                    n14 = 27;
                    break;
                }
                case 118: {
                    n14 = 170;
                    break;
                }
                case 119: {
                    n14 = 185;
                    break;
                }
                case 120: {
                    n14 = 224;
                    break;
                }
                case 121: {
                    n14 = 90;
                    break;
                }
                case 122: {
                    n14 = 230;
                    break;
                }
                case 123: {
                    n14 = 22;
                    break;
                }
                case 124: {
                    n14 = 47;
                    break;
                }
                case 125: {
                    n14 = 146;
                    break;
                }
                case 126: {
                    n14 = 30;
                    break;
                }
                case 127: {
                    n14 = 68;
                    break;
                }
                case 128: {
                    n14 = 233;
                    break;
                }
                case 129: {
                    n14 = 58;
                    break;
                }
                case 130: {
                    n14 = 11;
                    break;
                }
                case 131: {
                    n14 = 120;
                    break;
                }
                case 132: {
                    n14 = 164;
                    break;
                }
                case 133: {
                    n14 = 23;
                    break;
                }
                case 134: {
                    n14 = 217;
                    break;
                }
                case 135: {
                    n14 = 253;
                    break;
                }
                case 136: {
                    n14 = 194;
                    break;
                }
                case 137: {
                    n14 = 6;
                    break;
                }
                case 138: {
                    n14 = 101;
                    break;
                }
                case 139: {
                    n14 = 236;
                    break;
                }
                case 140: {
                    n14 = 151;
                    break;
                }
                case 141: {
                    n14 = 251;
                    break;
                }
                case 142: {
                    n14 = 202;
                    break;
                }
                case 143: {
                    n14 = 25;
                    break;
                }
                case 144: {
                    n14 = 134;
                    break;
                }
                case 145: {
                    n14 = 5;
                    break;
                }
                case 146: {
                    n14 = 118;
                    break;
                }
                case 147: {
                    n14 = 98;
                    break;
                }
                case 148: {
                    n14 = 0;
                    break;
                }
                case 149: {
                    n14 = 140;
                    break;
                }
                case 150: {
                    n14 = 212;
                    break;
                }
                case 151: {
                    n14 = 76;
                    break;
                }
                case 152: {
                    n14 = 117;
                    break;
                }
                case 153: {
                    n14 = 184;
                    break;
                }
                case 154: {
                    n14 = 197;
                    break;
                }
                case 155: {
                    n14 = 62;
                    break;
                }
                case 156: {
                    n14 = 171;
                    break;
                }
                case 157: {
                    n14 = 61;
                    break;
                }
                case 158: {
                    n14 = 59;
                    break;
                }
                case 159: {
                    n14 = 37;
                    break;
                }
                case 160: {
                    n14 = 127;
                    break;
                }
                case 161: {
                    n14 = 159;
                    break;
                }
                case 162: {
                    n14 = 63;
                    break;
                }
                case 163: {
                    n14 = 189;
                    break;
                }
                case 164: {
                    n14 = 205;
                    break;
                }
                case 165: {
                    n14 = 7;
                    break;
                }
                case 166: {
                    n14 = 106;
                    break;
                }
                case 167: {
                    n14 = 179;
                    break;
                }
                case 168: {
                    n14 = 188;
                    break;
                }
                case 169: {
                    n14 = 3;
                    break;
                }
                case 170: {
                    n14 = 54;
                    break;
                }
                case 171: {
                    n14 = 173;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 31;
                    break;
                }
                case 174: {
                    n14 = 218;
                    break;
                }
                case 175: {
                    n14 = 145;
                    break;
                }
                case 176: {
                    n14 = 132;
                    break;
                }
                case 177: {
                    n14 = 190;
                    break;
                }
                case 178: {
                    n14 = 153;
                    break;
                }
                case 179: {
                    n14 = 222;
                    break;
                }
                case 180: {
                    n14 = 46;
                    break;
                }
                case 181: {
                    n14 = 71;
                    break;
                }
                case 182: {
                    n14 = 48;
                    break;
                }
                case 183: {
                    n14 = 180;
                    break;
                }
                case 184: {
                    n14 = 137;
                    break;
                }
                case 185: {
                    n14 = 228;
                    break;
                }
                case 186: {
                    n14 = 41;
                    break;
                }
                case 187: {
                    n14 = 232;
                    break;
                }
                case 188: {
                    n14 = 94;
                    break;
                }
                case 189: {
                    n14 = 136;
                    break;
                }
                case 190: {
                    n14 = 175;
                    break;
                }
                case 191: {
                    n14 = 108;
                    break;
                }
                case 192: {
                    n14 = 199;
                    break;
                }
                case 193: {
                    n14 = 39;
                    break;
                }
                case 194: {
                    n14 = 72;
                    break;
                }
                case 195: {
                    n14 = 129;
                    break;
                }
                case 196: {
                    n14 = 156;
                    break;
                }
                case 197: {
                    n14 = 57;
                    break;
                }
                case 198: {
                    n14 = 112;
                    break;
                }
                case 199: {
                    n14 = 97;
                    break;
                }
                case 200: {
                    n14 = 150;
                    break;
                }
                case 201: {
                    n14 = 213;
                    break;
                }
                case 202: {
                    n14 = 19;
                    break;
                }
                case 203: {
                    n14 = 83;
                    break;
                }
                case 204: {
                    n14 = 113;
                    break;
                }
                case 205: {
                    n14 = 172;
                    break;
                }
                case 206: {
                    n14 = 201;
                    break;
                }
                case 207: {
                    n14 = 144;
                    break;
                }
                case 208: {
                    n14 = 36;
                    break;
                }
                case 209: {
                    n14 = 200;
                    break;
                }
                case 210: {
                    n14 = 198;
                    break;
                }
                case 211: {
                    n14 = 111;
                    break;
                }
                case 212: {
                    n14 = 141;
                    break;
                }
                case 213: {
                    n14 = 133;
                    break;
                }
                case 214: {
                    n14 = 16;
                    break;
                }
                case 215: {
                    n14 = 79;
                    break;
                }
                case 216: {
                    n14 = 93;
                    break;
                }
                case 217: {
                    n14 = 28;
                    break;
                }
                case 218: {
                    n14 = 239;
                    break;
                }
                case 219: {
                    n14 = 246;
                    break;
                }
                case 220: {
                    n14 = 130;
                    break;
                }
                case 221: {
                    n14 = 73;
                    break;
                }
                case 222: {
                    n14 = 78;
                    break;
                }
                case 223: {
                    n14 = 148;
                    break;
                }
                case 224: {
                    n14 = 87;
                    break;
                }
                case 225: {
                    n14 = 102;
                    break;
                }
                case 226: {
                    n14 = 242;
                    break;
                }
                case 227: {
                    n14 = 123;
                    break;
                }
                case 228: {
                    n14 = 138;
                    break;
                }
                case 229: {
                    n14 = 225;
                    break;
                }
                case 230: {
                    n14 = 29;
                    break;
                }
                case 231: {
                    n14 = 128;
                    break;
                }
                case 232: {
                    n14 = 124;
                    break;
                }
                case 233: {
                    n14 = 52;
                    break;
                }
                case 234: {
                    n14 = 95;
                    break;
                }
                case 235: {
                    n14 = 21;
                    break;
                }
                case 236: {
                    n14 = 104;
                    break;
                }
                case 237: {
                    n14 = 89;
                    break;
                }
                case 238: {
                    n14 = 243;
                    break;
                }
                case 239: {
                    n14 = 77;
                    break;
                }
                case 240: {
                    n14 = 33;
                    break;
                }
                case 241: {
                    n14 = 81;
                    break;
                }
                case 242: {
                    n14 = 211;
                    break;
                }
                case 243: {
                    n14 = 191;
                    break;
                }
                case 244: {
                    n14 = 131;
                    break;
                }
                case 245: {
                    n14 = 223;
                    break;
                }
                case 246: {
                    n14 = 182;
                    break;
                }
                case 247: {
                    n14 = 142;
                    break;
                }
                case 248: {
                    n14 = 183;
                    break;
                }
                case 249: {
                    n14 = 195;
                    break;
                }
                case 250: {
                    n14 = 206;
                    break;
                }
                case 251: {
                    n14 = 166;
                    break;
                }
                case 252: {
                    n14 = 160;
                    break;
                }
                case 253: {
                    n14 = 234;
                    break;
                }
                case 254: {
                    n14 = 69;
                    break;
                }
                default: {
                    n14 = 204;
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
            pk_2.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F9D;
        if (g[n11] == null) {
            pk_2.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

