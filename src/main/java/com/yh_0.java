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
import com.XN;
import com.a9;
import com.c;
import com.fu_0;
import com.og_2;
import com.pb_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import javax.swing.text.View;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Yh
 */
public class yh_0
extends BasicMenuItemUI
implements L0 {
    protected Insets O = OP.c;
    protected int J = OP.L;
    protected Color P = OP.l;
    protected Color e = OP.I;
    protected Color p = OP.x;
    protected Color t = OP.M;
    protected Color B = OP.R;
    protected Color x = OP.S;
    protected int s = OP.E;
    protected boolean I = OP.o;
    protected int l = OP.J;
    protected og_2 w = OP.P;
    protected PropertyChangeListener C;
    protected XN f;
    private static final String[] a;
    private static final String[] c;
    private static final long[] i;
    private static final Integer[] j;

    public static ComponentUI createUI(JComponent jComponent) {
        return new yh_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.menuItem);
        LookAndFeel.installProperty(this.menuItem, yh_0.a(25224, -23116), Boolean.FALSE);
        this.menuItem.setIconTextGap(OP.v);
        WO.t(this.menuItem, this.w);
        this.h();
        this.C = new fu_0(this);
        this.menuItem.addPropertyChangeListener(yh_0.a(25226, 22175), this.C);
        this.f = XN.y(this.menuItem);
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.menuItem, this.w);
        this.menuItem.removePropertyChangeListener(yh_0.a(25225, 19862), this.C);
        this.C = null;
        XN.s(this.f, this.menuItem);
        this.f = null;
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
                        var3_3 = new Insets(this.O.top, var2_2 != 0 ? this.O.left : this.O.right, this.O.bottom, var2_2 != 0 ? this.O.right : this.O.left);
                        if (var1_1 == null) break block12;
                        if (this.w == null) break block13;
                        var4_4 = this.w.B(this.menuItem);
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
                    v11 = v11 != 0 ? 4 : yh_0.a(6864, 2997439150569465652L);
                }
                var3_3.left = v10 + (v11 + this.J);
                var3_3.bottom += cy_1.c;
                v12 = var3_3.right;
                v13 = var2_2;
                if (var1_1 != null) {
                    v13 = v13 != 0 ? yh_0.a(32590, 4534993889300628140L) : 4;
                }
                var3_3.right = v12 + (v13 + this.J);
            }
            this.menuItem.setBorder(GA.y(var3_3));
        }
    }

    public Insets s() {
        return this.O;
    }

    public void L(Insets insets) {
        this.O = insets;
        this.h();
    }

    public int W() {
        return this.J;
    }

    public void d(int n10) {
        this.J = n10;
        this.h();
    }

    public Color S() {
        return this.P;
    }

    public void T(Color color) {
        this.P = color;
    }

    public Color f() {
        return this.e;
    }

    public void G(Color color) {
        this.e = color;
    }

    public Color w() {
        return this.p;
    }

    public void C(Color color) {
        this.p = color;
    }

    public Color x() {
        return this.t;
    }

    public void u(Color color) {
        this.t = color;
    }

    public Color z() {
        return this.B;
    }

    public void a(Color color) {
        this.B = color;
    }

    public Color B() {
        return this.x;
    }

    public void o(Color color) {
        this.x = color;
    }

    public int A() {
        return this.s;
    }

    public void U(int n10) {
        this.s = n10;
    }

    public boolean X() {
        return this.I;
    }

    public void E(boolean bl) {
        this.I = bl;
    }

    public int h() {
        return this.l;
    }

    public void v(int n10) {
        this.l = n10;
    }

    public og_2 j() {
        return this.w;
    }

    public void P(og_2 og_22) {
        WO.C(this.menuItem, this.w);
        this.w = og_22;
        WO.t(this.menuItem, this.w);
        this.h();
    }

    public Paint S() {
        return this.e;
    }

    public Paint u() {
        return this.p;
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

    protected void W(Graphics2D graphics2D, JMenuItem jMenuItem, int n10, int n11, int n12, int n13, boolean bl, boolean bl2) {
        block6: {
            block5: {
                og_2 og_22;
                int[] nArray;
                block4: {
                    nArray = pb_2.g();
                    og_22 = this.w;
                    if (nArray == null) break block4;
                    if (og_22 == null) break block5;
                    og_22 = this.w;
                }
                og_22.u(graphics2D, FN.N(jMenuItem), jMenuItem);
                if (nArray != null) break block6;
            }
            if (bl) {
                graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, this.e, 0.0f, jMenuItem.getHeight(), this.p));
                graphics2D.fillRect(0, 0, jMenuItem.getWidth(), jMenuItem.getHeight());
            }
        }
    }

    /*
     * Exception decompiling
     */
    protected void j(Graphics2D var1_1, JMenuItem var2_2, int var3_3, int var4_4, int var5_5, int var6_6, boolean var7_7, boolean var8_8) {
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
    protected void n(Graphics2D var1_1, JMenuItem var2_2, FontMetrics var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8, boolean var9_9) {
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
                        v1 = this.P;
                    }
                    var1_1.setPaint(v1);
                    var11_11 = RV.b(var1_1, var2_2.getFont());
                    v2 = var12_12 = (View)var2_2.getClientProperty(yh_0.a(25227, -15632));
                    if (var10_10 == null) break block6;
                    if (v2 == null) break block7;
                    v2 = var12_12;
                }
                v2.paint(var1_1, new Rectangle(var4_4, var5_5, var6_6, var7_7));
                if (var10_10 != null) break block8;
            }
            v3 = a9.R();
            if (var10_10 != null) {
                v3 = v3 != 0 ? -1 : var2_2.getDisplayedMnemonicIndex();
            }
            var13_13 = v3;
            FN.W(var1_1, var2_2.getText(), var13_13, var4_4, var5_5 + var7_7 / 2 + GA.d(var3_3));
        }
        RV.j(var1_1, var11_11);
    }

    protected void f(Graphics2D graphics2D, JMenuItem jMenuItem, String string, FontMetrics fontMetrics, int n10, int n11, int n12, int n13, boolean bl, boolean bl2) {
        if (bl && this.t != null) {
            int n14 = fontMetrics.getHeight();
            graphics2D.setPaint(this.t);
            graphics2D.fillRoundRect(n10 - 3, n11 + n13 / 2 - n14 / 2, n12 + yh_0.a(26947, 4322182182839997603L), n14, 4, 4);
        }
        Font font = RV.b(graphics2D, this.acceleratorFont);
        graphics2D.setPaint(jMenuItem.isEnabled() ? this.B : this.x);
        graphics2D.drawString(string, n10, n11 + n13 / 2 + GA.d(fontMetrics));
        RV.j(graphics2D, font);
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

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u00e6\u0097\u00a7\u00dc\u0080Y\u008e\u008aX\u00a4_\u0080`C\u00dd\u009e,+\u00cb\u009d\u0004A?9\u00ad\u0006\u00f8\u00c0\u00e5\u00cb_\u0091";
                        var12_3 = "\u00e6\u0097\u00a7\u00dc\u0080Y\u008e\u008aX\u00a4_\u0080`C\u00dd\u009e,+\u00cb\u009d\u0004A?9\u00ad\u0006\u00f8\u00c0\u00e5\u00cb_\u0091".length();
                        var9_4 = 20;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 114;
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
                            var10_2 = "\u00ea\u0019\u00c2\u00e9\u00c8\u001bc&\u0001\u00d5\u0090J}\u00fe\u009a\u00cd \u00a5\u00ae\u00a8\u0004\fut\u0000";
                            var12_3 = "\u00ea\u0019\u00c2\u00e9\u00c8\u001bc&\u0001\u00d5\u0090J}\u00fe\u009a\u00cd \u00a5\u00ae\u00a8\u0004\fut\u0000".length();
                            var9_4 = 20;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 63;
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
                                    v15 = 24;
                                    break;
                                }
                                case 1: {
                                    v15 = 44;
                                    break;
                                }
                                case 2: {
                                    v15 = 38;
                                    break;
                                }
                                case 3: {
                                    v15 = 101;
                                    break;
                                }
                                case 4: {
                                    v15 = 35;
                                    break;
                                }
                                case 5: {
                                    v15 = 66;
                                    break;
                                }
                                default: {
                                    v15 = 33;
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
                yh_0.a = var13;
                yh_0.c = new String[5];
                var0_7 = 2561882545638317819L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "\u009f\u00e9\u00a7@\u008f\u00b8\u00ca^\u0013\u00d2\u00e1}*\u00ac\u001e\u0081+\u00c7\f\u00de'_\\P";
                var5_11 = "\u009f\u00e9\u00a7@\u008f\u00b8\u00ca^\u0013\u00d2\u00e1}*\u00ac\u001e\u0081+\u00c7\f\u00de'_\\P".length();
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
                    var4_10 = "2\u00ddV>%\u0092\u0092\u00cbm\u00a2\u009e\u00b8\u00ac\u00819\u00c8";
                    var5_11 = "2\u00ddV>%\u0092\u0092\u00cbm\u00a2\u009e\u00b8\u00ac\u00819\u00c8".length();
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
        yh_0.i = var6_8;
        yh_0.j = new Integer[5];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x628A) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 80;
                    break;
                }
                case 1: {
                    n14 = 193;
                    break;
                }
                case 2: {
                    n14 = 85;
                    break;
                }
                case 3: {
                    n14 = 204;
                    break;
                }
                case 4: {
                    n14 = 116;
                    break;
                }
                case 5: {
                    n14 = 145;
                    break;
                }
                case 6: {
                    n14 = 3;
                    break;
                }
                case 7: {
                    n14 = 161;
                    break;
                }
                case 8: {
                    n14 = 223;
                    break;
                }
                case 9: {
                    n14 = 2;
                    break;
                }
                case 10: {
                    n14 = 31;
                    break;
                }
                case 11: {
                    n14 = 111;
                    break;
                }
                case 12: {
                    n14 = 160;
                    break;
                }
                case 13: {
                    n14 = 42;
                    break;
                }
                case 14: {
                    n14 = 241;
                    break;
                }
                case 15: {
                    n14 = 59;
                    break;
                }
                case 16: {
                    n14 = 196;
                    break;
                }
                case 17: {
                    n14 = 78;
                    break;
                }
                case 18: {
                    n14 = 224;
                    break;
                }
                case 19: {
                    n14 = 228;
                    break;
                }
                case 20: {
                    n14 = 186;
                    break;
                }
                case 21: {
                    n14 = 227;
                    break;
                }
                case 22: {
                    n14 = 47;
                    break;
                }
                case 23: {
                    n14 = 117;
                    break;
                }
                case 24: {
                    n14 = 110;
                    break;
                }
                case 25: {
                    n14 = 192;
                    break;
                }
                case 26: {
                    n14 = 166;
                    break;
                }
                case 27: {
                    n14 = 26;
                    break;
                }
                case 28: {
                    n14 = 21;
                    break;
                }
                case 29: {
                    n14 = 253;
                    break;
                }
                case 30: {
                    n14 = 182;
                    break;
                }
                case 31: {
                    n14 = 73;
                    break;
                }
                case 32: {
                    n14 = 203;
                    break;
                }
                case 33: {
                    n14 = 68;
                    break;
                }
                case 34: {
                    n14 = 96;
                    break;
                }
                case 35: {
                    n14 = 33;
                    break;
                }
                case 36: {
                    n14 = 65;
                    break;
                }
                case 37: {
                    n14 = 29;
                    break;
                }
                case 38: {
                    n14 = 15;
                    break;
                }
                case 39: {
                    n14 = 159;
                    break;
                }
                case 40: {
                    n14 = 119;
                    break;
                }
                case 41: {
                    n14 = 171;
                    break;
                }
                case 42: {
                    n14 = 208;
                    break;
                }
                case 43: {
                    n14 = 173;
                    break;
                }
                case 44: {
                    n14 = 36;
                    break;
                }
                case 45: {
                    n14 = 25;
                    break;
                }
                case 46: {
                    n14 = 107;
                    break;
                }
                case 47: {
                    n14 = 234;
                    break;
                }
                case 48: {
                    n14 = 32;
                    break;
                }
                case 49: {
                    n14 = 178;
                    break;
                }
                case 50: {
                    n14 = 37;
                    break;
                }
                case 51: {
                    n14 = 189;
                    break;
                }
                case 52: {
                    n14 = 230;
                    break;
                }
                case 53: {
                    n14 = 16;
                    break;
                }
                case 54: {
                    n14 = 239;
                    break;
                }
                case 55: {
                    n14 = 40;
                    break;
                }
                case 56: {
                    n14 = 7;
                    break;
                }
                case 57: {
                    n14 = 5;
                    break;
                }
                case 58: {
                    n14 = 134;
                    break;
                }
                case 59: {
                    n14 = 172;
                    break;
                }
                case 60: {
                    n14 = 248;
                    break;
                }
                case 61: {
                    n14 = 105;
                    break;
                }
                case 62: {
                    n14 = 206;
                    break;
                }
                case 63: {
                    n14 = 194;
                    break;
                }
                case 64: {
                    n14 = 235;
                    break;
                }
                case 65: {
                    n14 = 83;
                    break;
                }
                case 66: {
                    n14 = 129;
                    break;
                }
                case 67: {
                    n14 = 34;
                    break;
                }
                case 68: {
                    n14 = 153;
                    break;
                }
                case 69: {
                    n14 = 104;
                    break;
                }
                case 70: {
                    n14 = 140;
                    break;
                }
                case 71: {
                    n14 = 24;
                    break;
                }
                case 72: {
                    n14 = 157;
                    break;
                }
                case 73: {
                    n14 = 69;
                    break;
                }
                case 74: {
                    n14 = 167;
                    break;
                }
                case 75: {
                    n14 = 112;
                    break;
                }
                case 76: {
                    n14 = 28;
                    break;
                }
                case 77: {
                    n14 = 81;
                    break;
                }
                case 78: {
                    n14 = 131;
                    break;
                }
                case 79: {
                    n14 = 23;
                    break;
                }
                case 80: {
                    n14 = 254;
                    break;
                }
                case 81: {
                    n14 = 125;
                    break;
                }
                case 82: {
                    n14 = 8;
                    break;
                }
                case 83: {
                    n14 = 121;
                    break;
                }
                case 84: {
                    n14 = 150;
                    break;
                }
                case 85: {
                    n14 = 179;
                    break;
                }
                case 86: {
                    n14 = 246;
                    break;
                }
                case 87: {
                    n14 = 135;
                    break;
                }
                case 88: {
                    n14 = 191;
                    break;
                }
                case 89: {
                    n14 = 63;
                    break;
                }
                case 90: {
                    n14 = 158;
                    break;
                }
                case 91: {
                    n14 = 198;
                    break;
                }
                case 92: {
                    n14 = 49;
                    break;
                }
                case 93: {
                    n14 = 156;
                    break;
                }
                case 94: {
                    n14 = 103;
                    break;
                }
                case 95: {
                    n14 = 106;
                    break;
                }
                case 96: {
                    n14 = 122;
                    break;
                }
                case 97: {
                    n14 = 120;
                    break;
                }
                case 98: {
                    n14 = 126;
                    break;
                }
                case 99: {
                    n14 = 212;
                    break;
                }
                case 100: {
                    n14 = 128;
                    break;
                }
                case 101: {
                    n14 = 93;
                    break;
                }
                case 102: {
                    n14 = 154;
                    break;
                }
                case 103: {
                    n14 = 45;
                    break;
                }
                case 104: {
                    n14 = 162;
                    break;
                }
                case 105: {
                    n14 = 0;
                    break;
                }
                case 106: {
                    n14 = 139;
                    break;
                }
                case 107: {
                    n14 = 113;
                    break;
                }
                case 108: {
                    n14 = 91;
                    break;
                }
                case 109: {
                    n14 = 86;
                    break;
                }
                case 110: {
                    n14 = 142;
                    break;
                }
                case 111: {
                    n14 = 97;
                    break;
                }
                case 112: {
                    n14 = 64;
                    break;
                }
                case 113: {
                    n14 = 109;
                    break;
                }
                case 114: {
                    n14 = 238;
                    break;
                }
                case 115: {
                    n14 = 39;
                    break;
                }
                case 116: {
                    n14 = 231;
                    break;
                }
                case 117: {
                    n14 = 101;
                    break;
                }
                case 118: {
                    n14 = 19;
                    break;
                }
                case 119: {
                    n14 = 243;
                    break;
                }
                case 120: {
                    n14 = 149;
                    break;
                }
                case 121: {
                    n14 = 100;
                    break;
                }
                case 122: {
                    n14 = 137;
                    break;
                }
                case 123: {
                    n14 = 62;
                    break;
                }
                case 124: {
                    n14 = 46;
                    break;
                }
                case 125: {
                    n14 = 89;
                    break;
                }
                case 126: {
                    n14 = 219;
                    break;
                }
                case 127: {
                    n14 = 200;
                    break;
                }
                case 128: {
                    n14 = 225;
                    break;
                }
                case 129: {
                    n14 = 77;
                    break;
                }
                case 130: {
                    n14 = 187;
                    break;
                }
                case 131: {
                    n14 = 249;
                    break;
                }
                case 132: {
                    n14 = 88;
                    break;
                }
                case 133: {
                    n14 = 138;
                    break;
                }
                case 134: {
                    n14 = 17;
                    break;
                }
                case 135: {
                    n14 = 229;
                    break;
                }
                case 136: {
                    n14 = 147;
                    break;
                }
                case 137: {
                    n14 = 115;
                    break;
                }
                case 138: {
                    n14 = 170;
                    break;
                }
                case 139: {
                    n14 = 174;
                    break;
                }
                case 140: {
                    n14 = 176;
                    break;
                }
                case 141: {
                    n14 = 76;
                    break;
                }
                case 142: {
                    n14 = 220;
                    break;
                }
                case 143: {
                    n14 = 114;
                    break;
                }
                case 144: {
                    n14 = 209;
                    break;
                }
                case 145: {
                    n14 = 66;
                    break;
                }
                case 146: {
                    n14 = 183;
                    break;
                }
                case 147: {
                    n14 = 185;
                    break;
                }
                case 148: {
                    n14 = 27;
                    break;
                }
                case 149: {
                    n14 = 222;
                    break;
                }
                case 150: {
                    n14 = 201;
                    break;
                }
                case 151: {
                    n14 = 14;
                    break;
                }
                case 152: {
                    n14 = 217;
                    break;
                }
                case 153: {
                    n14 = 13;
                    break;
                }
                case 154: {
                    n14 = 164;
                    break;
                }
                case 155: {
                    n14 = 71;
                    break;
                }
                case 156: {
                    n14 = 1;
                    break;
                }
                case 157: {
                    n14 = 22;
                    break;
                }
                case 158: {
                    n14 = 144;
                    break;
                }
                case 159: {
                    n14 = 75;
                    break;
                }
                case 160: {
                    n14 = 57;
                    break;
                }
                case 161: {
                    n14 = 55;
                    break;
                }
                case 162: {
                    n14 = 199;
                    break;
                }
                case 163: {
                    n14 = 54;
                    break;
                }
                case 164: {
                    n14 = 195;
                    break;
                }
                case 165: {
                    n14 = 175;
                    break;
                }
                case 166: {
                    n14 = 95;
                    break;
                }
                case 167: {
                    n14 = 53;
                    break;
                }
                case 168: {
                    n14 = 152;
                    break;
                }
                case 169: {
                    n14 = 233;
                    break;
                }
                case 170: {
                    n14 = 155;
                    break;
                }
                case 171: {
                    n14 = 188;
                    break;
                }
                case 172: {
                    n14 = 251;
                    break;
                }
                case 173: {
                    n14 = 165;
                    break;
                }
                case 174: {
                    n14 = 79;
                    break;
                }
                case 175: {
                    n14 = 211;
                    break;
                }
                case 176: {
                    n14 = 90;
                    break;
                }
                case 177: {
                    n14 = 43;
                    break;
                }
                case 178: {
                    n14 = 242;
                    break;
                }
                case 179: {
                    n14 = 148;
                    break;
                }
                case 180: {
                    n14 = 58;
                    break;
                }
                case 181: {
                    n14 = 221;
                    break;
                }
                case 182: {
                    n14 = 56;
                    break;
                }
                case 183: {
                    n14 = 180;
                    break;
                }
                case 184: {
                    n14 = 87;
                    break;
                }
                case 185: {
                    n14 = 9;
                    break;
                }
                case 186: {
                    n14 = 146;
                    break;
                }
                case 187: {
                    n14 = 197;
                    break;
                }
                case 188: {
                    n14 = 118;
                    break;
                }
                case 189: {
                    n14 = 130;
                    break;
                }
                case 190: {
                    n14 = 214;
                    break;
                }
                case 191: {
                    n14 = 141;
                    break;
                }
                case 192: {
                    n14 = 132;
                    break;
                }
                case 193: {
                    n14 = 18;
                    break;
                }
                case 194: {
                    n14 = 98;
                    break;
                }
                case 195: {
                    n14 = 10;
                    break;
                }
                case 196: {
                    n14 = 38;
                    break;
                }
                case 197: {
                    n14 = 240;
                    break;
                }
                case 198: {
                    n14 = 4;
                    break;
                }
                case 199: {
                    n14 = 72;
                    break;
                }
                case 200: {
                    n14 = 60;
                    break;
                }
                case 201: {
                    n14 = 202;
                    break;
                }
                case 202: {
                    n14 = 168;
                    break;
                }
                case 203: {
                    n14 = 74;
                    break;
                }
                case 204: {
                    n14 = 61;
                    break;
                }
                case 205: {
                    n14 = 232;
                    break;
                }
                case 206: {
                    n14 = 84;
                    break;
                }
                case 207: {
                    n14 = 67;
                    break;
                }
                case 208: {
                    n14 = 41;
                    break;
                }
                case 209: {
                    n14 = 169;
                    break;
                }
                case 210: {
                    n14 = 218;
                    break;
                }
                case 211: {
                    n14 = 181;
                    break;
                }
                case 212: {
                    n14 = 136;
                    break;
                }
                case 213: {
                    n14 = 177;
                    break;
                }
                case 214: {
                    n14 = 44;
                    break;
                }
                case 215: {
                    n14 = 82;
                    break;
                }
                case 216: {
                    n14 = 226;
                    break;
                }
                case 217: {
                    n14 = 50;
                    break;
                }
                case 218: {
                    n14 = 11;
                    break;
                }
                case 219: {
                    n14 = 92;
                    break;
                }
                case 220: {
                    n14 = 143;
                    break;
                }
                case 221: {
                    n14 = 213;
                    break;
                }
                case 222: {
                    n14 = 123;
                    break;
                }
                case 223: {
                    n14 = 207;
                    break;
                }
                case 224: {
                    n14 = 99;
                    break;
                }
                case 225: {
                    n14 = 247;
                    break;
                }
                case 226: {
                    n14 = 133;
                    break;
                }
                case 227: {
                    n14 = 215;
                    break;
                }
                case 228: {
                    n14 = 250;
                    break;
                }
                case 229: {
                    n14 = 30;
                    break;
                }
                case 230: {
                    n14 = 252;
                    break;
                }
                case 231: {
                    n14 = 151;
                    break;
                }
                case 232: {
                    n14 = 127;
                    break;
                }
                case 233: {
                    n14 = 48;
                    break;
                }
                case 234: {
                    n14 = 124;
                    break;
                }
                case 235: {
                    n14 = 245;
                    break;
                }
                case 236: {
                    n14 = 35;
                    break;
                }
                case 237: {
                    n14 = 20;
                    break;
                }
                case 238: {
                    n14 = 244;
                    break;
                }
                case 239: {
                    n14 = 205;
                    break;
                }
                case 240: {
                    n14 = 210;
                    break;
                }
                case 241: {
                    n14 = 255;
                    break;
                }
                case 242: {
                    n14 = 94;
                    break;
                }
                case 243: {
                    n14 = 216;
                    break;
                }
                case 244: {
                    n14 = 70;
                    break;
                }
                case 245: {
                    n14 = 102;
                    break;
                }
                case 246: {
                    n14 = 236;
                    break;
                }
                case 247: {
                    n14 = 190;
                    break;
                }
                case 248: {
                    n14 = 163;
                    break;
                }
                case 249: {
                    n14 = 51;
                    break;
                }
                case 250: {
                    n14 = 52;
                    break;
                }
                case 251: {
                    n14 = 237;
                    break;
                }
                case 252: {
                    n14 = 184;
                    break;
                }
                case 253: {
                    n14 = 12;
                    break;
                }
                case 254: {
                    n14 = 108;
                    break;
                }
                default: {
                    n14 = 6;
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
            yh_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3DE0;
        if (j[n11] == null) {
            yh_0.j[n11] = (int)(i[n11] ^ l2);
        }
        return j[n11];
    }
}

