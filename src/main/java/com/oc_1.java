/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.L0;
import com.OP;
import com.RV;
import com.WO;
import com.WT;
import com.XN;
import com.a9;
import com.c;
import com.ks_1;
import com.ky_2;
import com.og_2;
import com.pb_2;
import com.w5_0;
import com.xg_0;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuUI;
import javax.swing.text.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.oC
 */
public class oc_1
extends BasicMenuUI
implements L0 {
    public static final ImageIcon r;
    public static final ImageIcon U;
    protected int n = OP.b;
    protected int b = OP.T;
    protected Insets W = OP.c;
    protected int J = OP.L;
    protected Color v = OP.l;
    protected Color V = OP.I;
    protected Color y = OP.x;
    protected int D = OP.E;
    protected boolean Y = OP.o;
    protected int a = OP.J;
    protected og_2 o = OP.P;
    protected PropertyChangeListener c;
    protected MouseAdapter w;
    protected XN u;
    protected boolean i = false;
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;

    public static ComponentUI createUI(JComponent jComponent) {
        return new oc_1();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.menuItem);
        LookAndFeel.installProperty(this.menuItem, oc_1.a(-11705, 10519), Boolean.FALSE);
        this.menuItem.setBackground(this.y);
        this.menuItem.setIconTextGap(OP.v);
        WO.t(this.menuItem, this.o);
        this.h();
        this.c = new w5_0(this);
        this.menuItem.addPropertyChangeListener(oc_1.a(-11706, -5928), this.c);
        this.w = new ks_1(this);
        this.menuItem.addMouseListener(this.w);
        this.u = XN.y(this.menuItem);
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.menuItem, this.o);
        this.menuItem.removePropertyChangeListener(oc_1.a(-11699, 14042), this.c);
        this.c = null;
        this.menuItem.removeMouseListener(this.w);
        this.w = null;
        XN.s(this.u, this.menuItem);
        this.u = null;
        super.uninstallUI(jComponent);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void h() {
        block11: {
            block14: {
                block12: {
                    block13: {
                        block10: {
                            var1_1 = pb_2.g();
                            v0 = this.menuItem;
                            if (var1_1 == null) break block10;
                            if (v0 == null) break block11;
                            v0 = this.menuItem;
                        }
                        v1 = FN.l(v0);
                        if (var1_1 != null) {
                            if (v1 != 0) {
                                return;
                            }
                            v1 = this.menuItem.getComponentOrientation().isLeftToRight();
                        }
                        var2_2 = v1;
                        var3_3 = new Insets(this.W.top, var2_2 != 0 ? this.W.left : this.W.right, this.W.bottom, var2_2 != 0 ? this.W.right : this.W.left);
                        if (var1_1 == null) break block12;
                        if (this.o == null) break block13;
                        var4_4 = this.o.B(this.menuItem);
                        var3_3.top += var4_4.top;
                        v2 = var3_3;
                        v3 = v2;
                        v4 = v2.bottom;
                        v5 = var4_4;
                        if (var1_1 == null) ** GOTO lbl31
                        v3.bottom = v4 + v5.bottom;
                        v6 = var3_3;
                        v3 = v6;
                        v4 = v6.left;
                        if (var2_2 != 0) {
                            v7 = var4_4.left;
                        } else {
                            v5 = var4_4;
lbl31:
                            // 2 sources

                            v7 = v5.right;
                        }
                        v3.left = v4 + v7;
                        v8 = var3_3.right;
                        v9 = var2_2;
                        if (var1_1 != null) {
                            v9 = v9 != 0 ? var4_4.right : var4_4.left;
                        }
                        var3_3.right = v8 + v9;
                        if (var1_1 != null) break block14;
                    }
                    var3_3.top += cy_1.c + 2;
                }
                v10 = var3_3.left;
                v11 = var2_2;
                if (var1_1 != null) {
                    v11 = v11 != 0 ? 4 : oc_1.a(9093, 3479927969145857597L);
                }
                var3_3.left = v10 + (v11 + this.J);
                var3_3.bottom += cy_1.c;
                v12 = var3_3.right;
                v13 = var2_2;
                if (var1_1 != null) {
                    v13 = v13 != 0 ? oc_1.a(23805, 3731844113962654022L) : 4;
                }
                var3_3.right = v12 + (v13 + this.J);
            }
            this.menuItem.setBorder(GA.y(var3_3));
        }
    }

    public int F() {
        return this.n;
    }

    public void C(int n10) {
        this.n = n10;
    }

    public int t() {
        return this.b;
    }

    public void P(int n10) {
        this.b = n10;
    }

    public Insets o() {
        return this.W;
    }

    public void S(Insets insets) {
        this.W = insets;
        this.h();
    }

    public int q() {
        return this.J;
    }

    public void f(int n10) {
        this.J = n10;
        this.h();
    }

    public Color P() {
        return this.v;
    }

    public void E(Color color) {
        this.v = color;
    }

    public Color w() {
        return this.V;
    }

    public void l(Color color) {
        this.V = color;
    }

    public Color Q() {
        return this.y;
    }

    public void W(Color color) {
        this.y = color;
    }

    public int L() {
        return this.D;
    }

    public void v(int n10) {
        this.D = n10;
    }

    public boolean T() {
        return this.Y;
    }

    public void K(boolean bl) {
        this.Y = bl;
    }

    public int f() {
        return this.a;
    }

    public void a(int n10) {
        this.a = n10;
    }

    public og_2 P() {
        return this.o;
    }

    public void z(og_2 og_22) {
        WO.C(this.menuItem, this.o);
        this.o = og_22;
        WO.t(this.menuItem, this.o);
        this.h();
    }

    public Paint J() {
        return this.V;
    }

    public Paint Y() {
        return this.y;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var4_3 = (Graphics2D)var1_1;
                        var5_4 = RV.X(var4_3);
                        var6_5 = (JMenu)var2_2;
                        var7_6 = var6_5.getComponentOrientation().isLeftToRight();
                        var8_7 = var6_5.getWidth();
                        var9_8 = var6_5.getHeight();
                        var10_9 = var6_5.getInsets();
                        var11_10 = var10_9.top;
                        var12_11 = var9_8 - var10_9.top - var10_9.bottom;
                        var13_12 = var6_5.getModel();
                        var3_13 = pb_2.g();
                        v0 = var6_5.isEnabled();
                        if (var3_13 == null) break block15;
                        if (!v0) ** GOTO lbl-1000
                        v0 = var13_12.isArmed();
                    }
                    if (var3_13 == null) break block16;
                    if (v0) ** GOTO lbl-1000
                    v0 = var13_12.isSelected();
                    if (var3_13 != null) {
                        ** if (!v0) goto lbl-1000
                    }
                    break block16;
lbl-1000:
                    // 2 sources

                    {
                        v0 = true;
                        ** GOTO lbl26
                    }
lbl-1000:
                    // 2 sources

                    {
                        v0 = false;
                    }
                }
                var14_14 = v0;
                this.M(var4_3, var6_5, var14_14, (boolean)var7_6);
                v1 = var15_15 = WT.r(var6_5, this.Y);
                if (var3_13 != null) {
                    v1 = v1 > 0 ? var6_5.getIconTextGap() : 0;
                }
                var16_16 = v1;
                v2 = var7_6;
                if (var3_13 == null) ** GOTO lbl39
                if (v2 != 0) {
                    v3 = var10_9.left;
                } else {
                    v2 = var8_7 - var10_9.right;
lbl39:
                    // 2 sources

                    v3 = v2 - var15_15;
                }
                var17_17 = v3;
                this.v(var4_3, var6_5, var17_17, var11_10, var15_15, var12_11, var14_14, (boolean)var7_6);
                v4 = var7_6;
                if (var3_13 == null) ** GOTO lbl48
                if (v4 != 0) {
                    v5 = var15_15 + var16_16;
                } else {
                    v4 = var16_16;
lbl48:
                    // 2 sources

                    v5 = -v4;
                }
                var17_17 += v5;
                v6 = var18_18 = var6_5.getText();
                if (var3_13 == null) break block17;
                if (v6 == null) break block18;
                v6 = var18_18;
            }
            if (v6.length() <= 0) break block18;
            var19_19 = FN.Y(var4_3);
            var20_20 = RV.b(var1_1, var6_5.getFont());
            var21_21 = var6_5.getFontMetrics(var6_5.getFont());
            v7 = var22_22 = (View)var6_5.getClientProperty(oc_1.a(-11710, 26908));
            if (var3_13 == null) ** GOTO lbl63
            if (v7 != null) {
                v7 = var22_22;
lbl63:
                // 2 sources

                v8 = (int)v7.getPreferredSpan(0);
            } else {
                v8 = var21_21.stringWidth(var18_18);
            }
            var23_23 = v8;
            v9 = var7_6;
            if (var3_13 != null) {
                v9 = v9 != 0 ? 0 : var23_23;
            }
            this.C(var4_3, var6_5, var21_21, var17_17 -= v9, var11_10, var23_23, var12_11, var14_14, (boolean)var7_6);
            RV.j(var1_1, (Font)var20_20);
            FN.k(var4_3, (Map)var19_19);
        }
        var19_19 = this.d(var6_5);
        if (var3_13 != null) {
            if (var19_19 != null) {
                var20_20 = RV.a(var4_3, Float.valueOf(0.4f), var14_14);
                v10 = var7_6;
                if (var3_13 != null) {
                    v10 = v10 != 0 ? var8_7 - var10_9.right - var19_19.getIconWidth() : var10_9.left;
                }
                var19_19.paintIcon(var6_5, var4_3, v10, var11_10 + var12_11 / 2 - var19_19.getIconHeight() / 2);
                RV.E(var4_3, (Composite)var20_20, var14_14);
            }
            RV.X(var4_3, var5_4);
        }
        if (ky_2.F() != null) {
            pb_2.C(new int[4]);
        }
    }

    /*
     * Exception decompiling
     */
    protected void M(Graphics2D var1_1, JMenu var2_2, boolean var3_3, boolean var4_4) {
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
     * Exception decompiling
     */
    protected void v(Graphics2D var1_1, JMenu var2_2, int var3_3, int var4_4, int var5_5, int var6_6, boolean var7_7, boolean var8_8) {
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
     */
    protected void C(Graphics2D var1_1, JMenu var2_2, FontMetrics var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8, boolean var9_9) {
        block8: {
            block7: {
                block6: {
                    var10_10 = pb_2.g();
                    v0 = var2_2;
                    if (var10_10 == null) ** GOTO lbl6
                    if (v0.isEnabled()) {
                        v0 = var2_2;
lbl6:
                        // 2 sources

                        v1 = v0.getForeground();
                    } else {
                        v1 = this.v;
                    }
                    var1_1.setPaint(v1);
                    v2 = var11_11 = (View)var2_2.getClientProperty(oc_1.a(-11708, -8083));
                    if (var10_10 == null) break block6;
                    if (v2 == null) break block7;
                    v2 = var11_11;
                }
                v2.paint(var1_1, new Rectangle(var4_4, var5_5, var6_6, var7_7));
                if (var10_10 != null) break block8;
            }
            v3 = a9.R();
            if (var10_10 != null) {
                v3 = v3 != 0 ? -1 : var2_2.getDisplayedMnemonicIndex();
            }
            var12_12 = v3;
            FN.W(var1_1, var2_2.getText(), var12_12, var4_4, var5_5 + var7_7 / 2 + GA.d(var3_3));
        }
    }

    protected Icon d(JMenu jMenu) {
        block6: {
            boolean bl;
            int[] nArray;
            block5: {
                nArray = pb_2.g();
                bl = jMenu.getParent() instanceof JPopupMenu;
                if (nArray == null) break block5;
                if (!bl) break block6;
                bl = jMenu.getComponentOrientation().isLeftToRight();
            }
            boolean bl2 = bl;
            boolean bl3 = jMenu.isEnabled();
            if (nArray != null) {
                if (bl3) {
                    return bl2 ? r : U;
                }
                bl3 = bl2;
            }
            return bl3 ? xg_0.H(oc_1.a(-11707, -21878), r) : xg_0.H(oc_1.a(-11709, 15456), U);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public Dimension getPreferredSize(JComponent var1_1) {
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

    static JMenuItem l(oc_1 oc_12) {
        return oc_12.menuItem;
    }

    static JMenuItem w(oc_1 oc_12) {
        return oc_12.menuItem;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "\u00b1\tA\u0007\u0013\u00f1b\u00b5\u00b4\u0000\u00dcFO}\u00a2(0\u0090\u00d1\u0004\u00d2\u0003\u00afl\u0006S.tP\u0000\u009b\u00146ZY#2\u00df8\u0082\u0011A0Q\u00f4\u0099\u0097Z\u0081\u00f5\u0013?\u0014\u00dc\u00c5MC\u00eeO8\u00e5\u0093\u0012\u00a3$/b}\u0018\u0019\u0013\u0010\u00d0\u0013U\u00aa|\u00ae\u00c8\u00f2\u00fcR\u000b\u00e4\u00b0\u00e4A\u00a6!\u00fbS`\u00c5\u0012m\u0011\u00da\u0004`\u0091\f\u00b9y\u0081{zgk\u00bb_\u0085\u0010";
                        var12_3 = "\u00b1\tA\u0007\u0013\u00f1b\u00b5\u00b4\u0000\u00dcFO}\u00a2(0\u0090\u00d1\u0004\u00d2\u0003\u00afl\u0006S.tP\u0000\u009b\u00146ZY#2\u00df8\u0082\u0011A0Q\u00f4\u0099\u0097Z\u0081\u00f5\u0013?\u0014\u00dc\u00c5MC\u00eeO8\u00e5\u0093\u0012\u00a3$/b}\u0018\u0019\u0013\u0010\u00d0\u0013U\u00aa|\u00ae\u00c8\u00f2\u00fcR\u000b\u00e4\u00b0\u00e4A\u00a6!\u00fbS`\u00c5\u0012m\u0011\u00da\u0004`\u0091\f\u00b9y\u0081{zgk\u00bb_\u0085\u0010".length();
                        var9_4 = 19;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 16;
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
                            var10_2 = "aru\u00ee\u0014J\u009az\u0097\u00fa\u00e5\u008di\u000b\u0090\u00df\u00c7\u00a5\u00e7\u00119\u00fd50\u008b";
                            var12_3 = "aru\u00ee\u0014J\u009az\u0097\u00fa\u00e5\u008di\u000b\u0090\u00df\u00c7\u00a5\u00e7\u00119\u00fd50\u008b".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 29;
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
                                    v15 = 13;
                                    break;
                                }
                                case 1: {
                                    v15 = 125;
                                    break;
                                }
                                case 2: {
                                    v15 = 78;
                                    break;
                                }
                                case 3: {
                                    v15 = 39;
                                    break;
                                }
                                case 4: {
                                    v15 = 109;
                                    break;
                                }
                                case 5: {
                                    v15 = 93;
                                    break;
                                }
                                default: {
                                    v15 = 38;
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
                oc_1.d = var13;
                oc_1.e = new String[9];
                var0_7 = 6953005946931731015L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u00f2\u000fR\u00aa\u0082\u00812\u0098\u00b8\u00b8\u000e\u00cd\u0018\u00e9\u00fc}";
                var5_11 = "\u00f2\u000fR\u00aa\u0082\u00812\u0098\u00b8\u00b8\u000e\u00cd\u0018\u00e9\u00fc}".length();
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
                    var4_10 = "0\u009f\u00b4\u00f8\u00e5\u00eb\u0003\u0006f\u001c\u00d0\u00aa\u00a0\u0089\u00f3\u0089";
                    var5_11 = "0\u009f\u00b4\u00f8\u00e5\u00eb\u0003\u0006f\u001c\u00d0\u00aa\u00a0\u0089\u00f3\u0089".length();
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
        oc_1.f = var6_8;
        oc_1.g = new Integer[4];
        oc_1.r = new ImageIcon(oc_1.class.getResource(oc_1.a(-11711, 21810)));
        oc_1.U = new ImageIcon(oc_1.class.getResource(oc_1.a(-11712, -15809)));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD245) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 157;
                    break;
                }
                case 1: {
                    n14 = 223;
                    break;
                }
                case 2: {
                    n14 = 94;
                    break;
                }
                case 3: {
                    n14 = 145;
                    break;
                }
                case 4: {
                    n14 = 140;
                    break;
                }
                case 5: {
                    n14 = 45;
                    break;
                }
                case 6: {
                    n14 = 239;
                    break;
                }
                case 7: {
                    n14 = 142;
                    break;
                }
                case 8: {
                    n14 = 75;
                    break;
                }
                case 9: {
                    n14 = 78;
                    break;
                }
                case 10: {
                    n14 = 147;
                    break;
                }
                case 11: {
                    n14 = 149;
                    break;
                }
                case 12: {
                    n14 = 95;
                    break;
                }
                case 13: {
                    n14 = 77;
                    break;
                }
                case 14: {
                    n14 = 216;
                    break;
                }
                case 15: {
                    n14 = 67;
                    break;
                }
                case 16: {
                    n14 = 230;
                    break;
                }
                case 17: {
                    n14 = 130;
                    break;
                }
                case 18: {
                    n14 = 10;
                    break;
                }
                case 19: {
                    n14 = 55;
                    break;
                }
                case 20: {
                    n14 = 252;
                    break;
                }
                case 21: {
                    n14 = 244;
                    break;
                }
                case 22: {
                    n14 = 226;
                    break;
                }
                case 23: {
                    n14 = 19;
                    break;
                }
                case 24: {
                    n14 = 232;
                    break;
                }
                case 25: {
                    n14 = 89;
                    break;
                }
                case 26: {
                    n14 = 28;
                    break;
                }
                case 27: {
                    n14 = 32;
                    break;
                }
                case 28: {
                    n14 = 108;
                    break;
                }
                case 29: {
                    n14 = 39;
                    break;
                }
                case 30: {
                    n14 = 181;
                    break;
                }
                case 31: {
                    n14 = 38;
                    break;
                }
                case 32: {
                    n14 = 6;
                    break;
                }
                case 33: {
                    n14 = 119;
                    break;
                }
                case 34: {
                    n14 = 153;
                    break;
                }
                case 35: {
                    n14 = 61;
                    break;
                }
                case 36: {
                    n14 = 245;
                    break;
                }
                case 37: {
                    n14 = 190;
                    break;
                }
                case 38: {
                    n14 = 14;
                    break;
                }
                case 39: {
                    n14 = 52;
                    break;
                }
                case 40: {
                    n14 = 43;
                    break;
                }
                case 41: {
                    n14 = 184;
                    break;
                }
                case 42: {
                    n14 = 195;
                    break;
                }
                case 43: {
                    n14 = 144;
                    break;
                }
                case 44: {
                    n14 = 254;
                    break;
                }
                case 45: {
                    n14 = 76;
                    break;
                }
                case 46: {
                    n14 = 146;
                    break;
                }
                case 47: {
                    n14 = 222;
                    break;
                }
                case 48: {
                    n14 = 79;
                    break;
                }
                case 49: {
                    n14 = 73;
                    break;
                }
                case 50: {
                    n14 = 74;
                    break;
                }
                case 51: {
                    n14 = 236;
                    break;
                }
                case 52: {
                    n14 = 250;
                    break;
                }
                case 53: {
                    n14 = 85;
                    break;
                }
                case 54: {
                    n14 = 53;
                    break;
                }
                case 55: {
                    n14 = 251;
                    break;
                }
                case 56: {
                    n14 = 58;
                    break;
                }
                case 57: {
                    n14 = 141;
                    break;
                }
                case 58: {
                    n14 = 255;
                    break;
                }
                case 59: {
                    n14 = 20;
                    break;
                }
                case 60: {
                    n14 = 106;
                    break;
                }
                case 61: {
                    n14 = 231;
                    break;
                }
                case 62: {
                    n14 = 22;
                    break;
                }
                case 63: {
                    n14 = 34;
                    break;
                }
                case 64: {
                    n14 = 105;
                    break;
                }
                case 65: {
                    n14 = 225;
                    break;
                }
                case 66: {
                    n14 = 9;
                    break;
                }
                case 67: {
                    n14 = 31;
                    break;
                }
                case 68: {
                    n14 = 113;
                    break;
                }
                case 69: {
                    n14 = 114;
                    break;
                }
                case 70: {
                    n14 = 127;
                    break;
                }
                case 71: {
                    n14 = 36;
                    break;
                }
                case 72: {
                    n14 = 30;
                    break;
                }
                case 73: {
                    n14 = 240;
                    break;
                }
                case 74: {
                    n14 = 217;
                    break;
                }
                case 75: {
                    n14 = 17;
                    break;
                }
                case 76: {
                    n14 = 201;
                    break;
                }
                case 77: {
                    n14 = 99;
                    break;
                }
                case 78: {
                    n14 = 246;
                    break;
                }
                case 79: {
                    n14 = 72;
                    break;
                }
                case 80: {
                    n14 = 180;
                    break;
                }
                case 81: {
                    n14 = 137;
                    break;
                }
                case 82: {
                    n14 = 202;
                    break;
                }
                case 83: {
                    n14 = 117;
                    break;
                }
                case 84: {
                    n14 = 80;
                    break;
                }
                case 85: {
                    n14 = 170;
                    break;
                }
                case 86: {
                    n14 = 220;
                    break;
                }
                case 87: {
                    n14 = 24;
                    break;
                }
                case 88: {
                    n14 = 197;
                    break;
                }
                case 89: {
                    n14 = 164;
                    break;
                }
                case 90: {
                    n14 = 161;
                    break;
                }
                case 91: {
                    n14 = 25;
                    break;
                }
                case 92: {
                    n14 = 187;
                    break;
                }
                case 93: {
                    n14 = 162;
                    break;
                }
                case 94: {
                    n14 = 49;
                    break;
                }
                case 95: {
                    n14 = 64;
                    break;
                }
                case 96: {
                    n14 = 129;
                    break;
                }
                case 97: {
                    n14 = 102;
                    break;
                }
                case 98: {
                    n14 = 191;
                    break;
                }
                case 99: {
                    n14 = 143;
                    break;
                }
                case 100: {
                    n14 = 221;
                    break;
                }
                case 101: {
                    n14 = 247;
                    break;
                }
                case 102: {
                    n14 = 174;
                    break;
                }
                case 103: {
                    n14 = 139;
                    break;
                }
                case 104: {
                    n14 = 218;
                    break;
                }
                case 105: {
                    n14 = 234;
                    break;
                }
                case 106: {
                    n14 = 13;
                    break;
                }
                case 107: {
                    n14 = 109;
                    break;
                }
                case 108: {
                    n14 = 65;
                    break;
                }
                case 109: {
                    n14 = 46;
                    break;
                }
                case 110: {
                    n14 = 104;
                    break;
                }
                case 111: {
                    n14 = 167;
                    break;
                }
                case 112: {
                    n14 = 35;
                    break;
                }
                case 113: {
                    n14 = 3;
                    break;
                }
                case 114: {
                    n14 = 2;
                    break;
                }
                case 115: {
                    n14 = 51;
                    break;
                }
                case 116: {
                    n14 = 241;
                    break;
                }
                case 117: {
                    n14 = 121;
                    break;
                }
                case 118: {
                    n14 = 62;
                    break;
                }
                case 119: {
                    n14 = 126;
                    break;
                }
                case 120: {
                    n14 = 33;
                    break;
                }
                case 121: {
                    n14 = 183;
                    break;
                }
                case 122: {
                    n14 = 131;
                    break;
                }
                case 123: {
                    n14 = 185;
                    break;
                }
                case 124: {
                    n14 = 206;
                    break;
                }
                case 125: {
                    n14 = 7;
                    break;
                }
                case 126: {
                    n14 = 227;
                    break;
                }
                case 127: {
                    n14 = 21;
                    break;
                }
                case 128: {
                    n14 = 212;
                    break;
                }
                case 129: {
                    n14 = 168;
                    break;
                }
                case 130: {
                    n14 = 60;
                    break;
                }
                case 131: {
                    n14 = 110;
                    break;
                }
                case 132: {
                    n14 = 208;
                    break;
                }
                case 133: {
                    n14 = 136;
                    break;
                }
                case 134: {
                    n14 = 203;
                    break;
                }
                case 135: {
                    n14 = 56;
                    break;
                }
                case 136: {
                    n14 = 133;
                    break;
                }
                case 137: {
                    n14 = 172;
                    break;
                }
                case 138: {
                    n14 = 210;
                    break;
                }
                case 139: {
                    n14 = 205;
                    break;
                }
                case 140: {
                    n14 = 82;
                    break;
                }
                case 141: {
                    n14 = 176;
                    break;
                }
                case 142: {
                    n14 = 156;
                    break;
                }
                case 143: {
                    n14 = 196;
                    break;
                }
                case 144: {
                    n14 = 132;
                    break;
                }
                case 145: {
                    n14 = 27;
                    break;
                }
                case 146: {
                    n14 = 194;
                    break;
                }
                case 147: {
                    n14 = 12;
                    break;
                }
                case 148: {
                    n14 = 71;
                    break;
                }
                case 149: {
                    n14 = 159;
                    break;
                }
                case 150: {
                    n14 = 107;
                    break;
                }
                case 151: {
                    n14 = 188;
                    break;
                }
                case 152: {
                    n14 = 249;
                    break;
                }
                case 153: {
                    n14 = 8;
                    break;
                }
                case 154: {
                    n14 = 134;
                    break;
                }
                case 155: {
                    n14 = 233;
                    break;
                }
                case 156: {
                    n14 = 128;
                    break;
                }
                case 157: {
                    n14 = 237;
                    break;
                }
                case 158: {
                    n14 = 50;
                    break;
                }
                case 159: {
                    n14 = 91;
                    break;
                }
                case 160: {
                    n14 = 111;
                    break;
                }
                case 161: {
                    n14 = 5;
                    break;
                }
                case 162: {
                    n14 = 122;
                    break;
                }
                case 163: {
                    n14 = 224;
                    break;
                }
                case 164: {
                    n14 = 66;
                    break;
                }
                case 165: {
                    n14 = 186;
                    break;
                }
                case 166: {
                    n14 = 47;
                    break;
                }
                case 167: {
                    n14 = 90;
                    break;
                }
                case 168: {
                    n14 = 54;
                    break;
                }
                case 169: {
                    n14 = 1;
                    break;
                }
                case 170: {
                    n14 = 98;
                    break;
                }
                case 171: {
                    n14 = 70;
                    break;
                }
                case 172: {
                    n14 = 169;
                    break;
                }
                case 173: {
                    n14 = 228;
                    break;
                }
                case 174: {
                    n14 = 209;
                    break;
                }
                case 175: {
                    n14 = 235;
                    break;
                }
                case 176: {
                    n14 = 152;
                    break;
                }
                case 177: {
                    n14 = 175;
                    break;
                }
                case 178: {
                    n14 = 63;
                    break;
                }
                case 179: {
                    n14 = 29;
                    break;
                }
                case 180: {
                    n14 = 87;
                    break;
                }
                case 181: {
                    n14 = 120;
                    break;
                }
                case 182: {
                    n14 = 103;
                    break;
                }
                case 183: {
                    n14 = 193;
                    break;
                }
                case 184: {
                    n14 = 112;
                    break;
                }
                case 185: {
                    n14 = 88;
                    break;
                }
                case 186: {
                    n14 = 81;
                    break;
                }
                case 187: {
                    n14 = 96;
                    break;
                }
                case 188: {
                    n14 = 26;
                    break;
                }
                case 189: {
                    n14 = 0;
                    break;
                }
                case 190: {
                    n14 = 207;
                    break;
                }
                case 191: {
                    n14 = 199;
                    break;
                }
                case 192: {
                    n14 = 57;
                    break;
                }
                case 193: {
                    n14 = 138;
                    break;
                }
                case 194: {
                    n14 = 204;
                    break;
                }
                case 195: {
                    n14 = 177;
                    break;
                }
                case 196: {
                    n14 = 154;
                    break;
                }
                case 197: {
                    n14 = 163;
                    break;
                }
                case 198: {
                    n14 = 118;
                    break;
                }
                case 199: {
                    n14 = 178;
                    break;
                }
                case 200: {
                    n14 = 69;
                    break;
                }
                case 201: {
                    n14 = 158;
                    break;
                }
                case 202: {
                    n14 = 182;
                    break;
                }
                case 203: {
                    n14 = 116;
                    break;
                }
                case 204: {
                    n14 = 97;
                    break;
                }
                case 205: {
                    n14 = 242;
                    break;
                }
                case 206: {
                    n14 = 125;
                    break;
                }
                case 207: {
                    n14 = 198;
                    break;
                }
                case 208: {
                    n14 = 219;
                    break;
                }
                case 209: {
                    n14 = 100;
                    break;
                }
                case 210: {
                    n14 = 192;
                    break;
                }
                case 211: {
                    n14 = 253;
                    break;
                }
                case 212: {
                    n14 = 86;
                    break;
                }
                case 213: {
                    n14 = 15;
                    break;
                }
                case 214: {
                    n14 = 151;
                    break;
                }
                case 215: {
                    n14 = 16;
                    break;
                }
                case 216: {
                    n14 = 160;
                    break;
                }
                case 217: {
                    n14 = 4;
                    break;
                }
                case 218: {
                    n14 = 173;
                    break;
                }
                case 219: {
                    n14 = 48;
                    break;
                }
                case 220: {
                    n14 = 155;
                    break;
                }
                case 221: {
                    n14 = 243;
                    break;
                }
                case 222: {
                    n14 = 101;
                    break;
                }
                case 223: {
                    n14 = 189;
                    break;
                }
                case 224: {
                    n14 = 211;
                    break;
                }
                case 225: {
                    n14 = 23;
                    break;
                }
                case 226: {
                    n14 = 200;
                    break;
                }
                case 227: {
                    n14 = 59;
                    break;
                }
                case 228: {
                    n14 = 42;
                    break;
                }
                case 229: {
                    n14 = 44;
                    break;
                }
                case 230: {
                    n14 = 165;
                    break;
                }
                case 231: {
                    n14 = 92;
                    break;
                }
                case 232: {
                    n14 = 171;
                    break;
                }
                case 233: {
                    n14 = 11;
                    break;
                }
                case 234: {
                    n14 = 148;
                    break;
                }
                case 235: {
                    n14 = 248;
                    break;
                }
                case 236: {
                    n14 = 41;
                    break;
                }
                case 237: {
                    n14 = 229;
                    break;
                }
                case 238: {
                    n14 = 40;
                    break;
                }
                case 239: {
                    n14 = 93;
                    break;
                }
                case 240: {
                    n14 = 214;
                    break;
                }
                case 241: {
                    n14 = 124;
                    break;
                }
                case 242: {
                    n14 = 135;
                    break;
                }
                case 243: {
                    n14 = 83;
                    break;
                }
                case 244: {
                    n14 = 179;
                    break;
                }
                case 245: {
                    n14 = 115;
                    break;
                }
                case 246: {
                    n14 = 215;
                    break;
                }
                case 247: {
                    n14 = 213;
                    break;
                }
                case 248: {
                    n14 = 18;
                    break;
                }
                case 249: {
                    n14 = 238;
                    break;
                }
                case 250: {
                    n14 = 166;
                    break;
                }
                case 251: {
                    n14 = 68;
                    break;
                }
                case 252: {
                    n14 = 37;
                    break;
                }
                case 253: {
                    n14 = 123;
                    break;
                }
                case 254: {
                    n14 = 84;
                    break;
                }
                default: {
                    n14 = 150;
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
            oc_1.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5B9;
        if (g[n11] == null) {
            oc_1.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

