/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DR;
import com.DW;
import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.NL;
import com.Q2;
import com.RV;
import com.TC;
import com.W2;
import com.WO;
import com.X;
import com.cf_2;
import com.ee_2;
import com.ky_2;
import com.li_0;
import com.ne_2;
import com.og_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import javax.swing.text.JTextComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Hl
 */
public class hl_0
extends BasicPasswordFieldUI
implements W2,
SwingConstants,
L0 {
    private boolean G = DR.u;
    private boolean Q = DR.t;
    private int f = DR.C;
    private boolean c = DR.g;
    private int T = DR.L;
    private boolean W = DR.Z;
    private boolean v = DR.P;
    private Insets R = DR.A;
    private String a = ee_2.h;
    private Font o = ee_2.K;
    private Color b = ee_2.j;
    private int L = ee_2.E;
    private boolean h = ee_2.S;
    private og_2 D = DR.H;
    private JPasswordField K;
    private JComponent U = null;
    private JComponent H = null;
    private boolean C = false;
    private FocusListener Z;
    private PropertyChangeListener J;
    private PropertyChangeListener m;
    private PropertyChangeListener O;
    private ComponentAdapter r;
    private static final String[] d;
    private static final String[] e;
    private static final long[] g;
    private static final Integer[] i;

    public static ComponentUI createUI(JComponent jComponent) {
        return new hl_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.K = (JPasswordField)jComponent;
        FN.Y(this.K);
        LookAndFeel.installProperty(this.K, hl_0.a(26519, -10295), Boolean.FALSE);
        this.K.putClientProperty(hl_0.a(26518, 25241), true);
        this.K.setFocusable(true);
        this.K.setMargin(DR.r);
        this.K.setBackground(Color.WHITE);
        boolean bl = ne_2.m();
        this.K.setSelectionColor(GO.F4);
        this.K.setForeground(Color.BLACK);
        boolean bl2 = bl;
        this.K.setSelectedTextColor(Color.BLACK);
        this.K.setCaretColor(Color.GRAY);
        this.K.setLayout(new TC(this.K));
        WO.t(this.K, this.D);
        this.h();
        this.Z = new li_0(this);
        this.K.addFocusListener(this.Z);
        this.J = new NL(this);
        this.K.addPropertyChangeListener(hl_0.a(26525, -8074), this.J);
        this.m = new DW(this);
        this.K.addPropertyChangeListener(hl_0.a(26516, -15856), this.m);
        this.O = new Q2(this);
        this.K.addPropertyChangeListener(hl_0.a(26527, -6757), this.O);
        this.r = new X(this);
        if (ky_2.F() != null) {
            ne_2.p(!bl2);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.K, this.D);
        this.K.putClientProperty(hl_0.a(26524, -20155), null);
        this.K.removeFocusListener(this.Z);
        this.K.removePropertyChangeListener(hl_0.a(26523, -7899), this.J);
        this.K.removePropertyChangeListener(hl_0.a(26522, 14070), this.m);
        this.K.removePropertyChangeListener(hl_0.a(26520, -31318), this.O);
        this.E();
        this.F();
        this.K.setLayout(null);
        this.K = null;
        super.uninstallUI(jComponent);
    }

    @Override
    public Shape B() {
        boolean bl = ne_2.A();
        hl_0 hl_02 = this;
        if (bl) {
            if (hl_02.G) {
                return GA.X(this.K, this.T, this.f);
            }
            hl_02 = this;
        }
        return FN.N(hl_02.K);
    }

    private void U() {
        block6: {
            JComponent jComponent;
            block5: {
                boolean bl = ne_2.A();
                jComponent = this.U;
                if (bl) {
                    if (jComponent != null) {
                        this.U.setEnabled(this.K.isEnabled());
                    }
                    jComponent = this.H;
                }
                if (!bl) break block5;
                if (jComponent == null) break block6;
                jComponent = this.H;
            }
            jComponent.setEnabled(this.K.isEnabled());
        }
    }

    public JComponent w() {
        return this.U;
    }

    public void K(JComponent jComponent) {
        block6: {
            JComponent jComponent2;
            block5: {
                boolean bl = ne_2.A();
                jComponent2 = this.U;
                if (!bl) break block5;
                if (jComponent2 == jComponent) {
                    return;
                }
                this.E();
                if (!bl) break block6;
                jComponent2 = jComponent;
            }
            if (jComponent2 != null) {
                this.U = jComponent;
                this.U.addComponentListener(this.r);
                this.K.add((Component)jComponent, hl_0.a(26521, -3579));
                this.U();
            }
            this.K.revalidate();
            this.h();
        }
    }

    private void E() {
        block3: {
            JComponent jComponent;
            block2: {
                boolean bl = ne_2.A();
                jComponent = this.U;
                if (!bl) break block2;
                if (jComponent == null) break block3;
                jComponent = this.U;
            }
            jComponent.removeComponentListener(this.r);
            this.K.remove(this.U);
            this.U = null;
        }
    }

    public JComponent f() {
        return this.H;
    }

    public void b(JComponent jComponent) {
        block6: {
            JComponent jComponent2;
            block5: {
                boolean bl = ne_2.m();
                jComponent2 = this.H;
                if (bl) break block5;
                if (jComponent2 == jComponent) {
                    return;
                }
                this.F();
                if (bl) break block6;
                jComponent2 = jComponent;
            }
            if (jComponent2 != null) {
                this.H = jComponent;
                this.H.addComponentListener(this.r);
                this.K.add((Component)jComponent, hl_0.a(26526, 30804));
                this.U();
            }
            this.K.revalidate();
            this.h();
        }
    }

    private void F() {
        block3: {
            JComponent jComponent;
            block2: {
                boolean bl = ne_2.A();
                jComponent = this.H;
                if (!bl) break block2;
                if (jComponent == null) break block3;
                jComponent = this.H;
            }
            jComponent.removeComponentListener(this.r);
            this.K.remove(this.H);
            this.H = null;
        }
    }

    public void S(Insets insets) {
        this.R = insets;
        this.h();
    }

    public Insets v() {
        return this.R;
    }

    public String P() {
        return this.a;
    }

    /*
     * Exception decompiling
     */
    public void w(String var1_1) {
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

    public Font M() {
        return this.o;
    }

    public void G(Font font) {
        this.o = font;
        this.O();
    }

    public Color t() {
        return this.b;
    }

    public void o(Color color) {
        this.b = color;
        this.O();
    }

    public int s() {
        return this.L;
    }

    public void U(int n10) {
        this.L = n10;
        this.O();
    }

    public boolean D() {
        return this.h;
    }

    public void T(boolean bl) {
        this.h = bl;
        this.O();
    }

    public boolean Z() {
        return this.c;
    }

    public void A(boolean bl) {
        this.c = bl;
    }

    public int G() {
        return this.T;
    }

    public void M(int n10) {
        this.T = n10;
        this.h();
    }

    public boolean b() {
        return this.W;
    }

    public void Y(boolean bl) {
        this.W = bl;
        this.p();
    }

    public boolean C() {
        return this.v;
    }

    public void m(boolean bl) {
        this.v = bl;
        this.p();
    }

    public int b() {
        return this.f;
    }

    public void b(int n10) {
        this.f = n10;
        this.p();
    }

    public boolean K() {
        return this.G;
    }

    public void g(boolean bl) {
        this.G = bl;
        this.h();
    }

    public boolean X() {
        return this.Q;
    }

    public void X(boolean bl) {
        this.Q = bl;
        this.p();
    }

    public og_2 o() {
        return this.D;
    }

    /*
     * Exception decompiling
     */
    public void f(og_2 var1_1) {
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

    private void O() {
        block3: {
            hl_0 hl_02;
            block2: {
                boolean bl = ne_2.A();
                hl_02 = this;
                if (!bl) break block2;
                if (!hl_02.Q(this.getComponent())) break block3;
                hl_02 = this;
            }
            hl_02.p();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Q(JTextComponent jTextComponent) {
        boolean bl;
        boolean bl2;
        block6: {
            block7: {
                bl2 = ne_2.A();
                bl = this.C;
                if (bl2) {
                    if (!bl) return false;
                    bl = jTextComponent.isEditable();
                }
                if (bl2) {
                    if (!bl) return false;
                    bl = jTextComponent.isEnabled();
                }
                if (bl2) {
                    if (!bl) return false;
                    bl = this.h;
                }
                if (!bl2) break block6;
                if (!bl) break block7;
                bl = jTextComponent.isFocusOwner();
                if (!bl2) break block6;
                if (bl) return false;
            }
            bl = jTextComponent.getText().equals("");
        }
        if (!bl2) return bl;
        if (!bl) return false;
        return true;
    }

    private void p() {
        block3: {
            JPasswordField jPasswordField;
            block2: {
                boolean bl = ne_2.A();
                jPasswordField = this.K;
                if (!bl) break block2;
                if (jPasswordField == null) break block3;
                jPasswordField = this.K;
            }
            jPasswordField.repaint();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void h() {
        block19: {
            block28: {
                block27: {
                    block25: {
                        block26: {
                            block23: {
                                block24: {
                                    block21: {
                                        block22: {
                                            block20: {
                                                block18: {
                                                    var1_1 = ne_2.A();
                                                    v0 = this.K;
                                                    if (!var1_1) break block18;
                                                    if (v0 == null) break block19;
                                                    v1 = this;
                                                    if (!var1_1) break block20;
                                                    v0 = v1.K;
                                                }
                                                if (FN.l(v0)) {
                                                    return;
                                                }
                                                v1 = this;
                                            }
                                            if (!var1_1) break block21;
                                            if (v1.D == null) break block22;
                                            var2_2 = this.D.B(this.getComponent());
                                            if (var1_1) break block23;
                                        }
                                        v1 = this;
                                    }
                                    if (!v1.G) break block24;
                                    var2_2 = new Insets(this.T + 1, this.T + 1, this.T + 1, this.T + 1);
                                    if (var1_1) break block23;
                                }
                                var2_2 = new Insets(0, 0, 0, 0);
                            }
                            var3_3 = this.K.getComponentOrientation().isLeftToRight();
                            v2 = var4_4 = this.K.getMargin();
                            if (!var1_1) break block25;
                            if (v2 == null) break block26;
                            v3 = var2_2;
                            v4 = v3;
                            v5 = v3.top;
                            v6 = var4_4;
                            if (!var1_1) ** GOTO lbl43
                            v4.top = v5 + v6.top;
                            v7 = var2_2;
                            v4 = v7;
                            v5 = v7.left;
                            if (var3_3) {
                                v8 = var4_4.left;
                            } else {
                                v6 = var4_4;
lbl43:
                                // 2 sources

                                v8 = v6.right;
                            }
                            v4.left = v5 + v8;
                            v9 = var2_2;
                            v10 = v9;
                            v11 = v9.bottom;
                            v12 = var4_4;
                            if (!var1_1) ** GOTO lbl58
                            v10.bottom = v11 + v12.bottom;
                            v13 = var2_2;
                            v10 = v13;
                            v11 = v13.right;
                            if (var3_3) {
                                v14 = var4_4.right;
                            } else {
                                v12 = var4_4;
lbl58:
                                // 2 sources

                                v14 = v12.left;
                            }
                            v10.right = v11 + v14;
                        }
                        v2 = this.R;
                    }
                    if (!var1_1) break block27;
                    if (v2 == null) break block28;
                    v15 = var2_2;
                    v16 = v15;
                    v17 = v15.top;
                    v18 = this.R;
                    if (!var1_1) ** GOTO lbl79
                    v16.top = v17 + v18.top;
                    v2 = var2_2;
                }
                v16 = v2;
                v17 = v2.left;
                if (var3_3) {
                    v19 = this.R.left;
                } else {
                    v18 = this.R;
lbl79:
                    // 2 sources

                    v19 = v18.right;
                }
                v16.left = v17 + v19;
                v20 = var2_2;
                v21 = v20;
                v22 = v20.bottom;
                v23 = this.R;
                if (!var1_1) ** GOTO lbl94
                v21.bottom = v22 + v23.bottom;
                v24 = var2_2;
                v21 = v24;
                v22 = v24.right;
                if (var3_3) {
                    v25 = this.R.right;
                } else {
                    v23 = this.R;
lbl94:
                    // 2 sources

                    v25 = v23.left;
                }
                v21.right = v22 + v25;
            }
            var5_5 = var3_3 != false ? this.U : this.H;
            var6_6 = var3_3 != false ? this.H : this.U;
            v26 = var5_5;
            if (var1_1) {
                if (v26 != null) {
                    var2_2.left += var5_5.getPreferredSize().width;
                }
                v26 = var6_6;
            }
            if (v26 != null) {
                var2_2.right += var6_6.getPreferredSize().width;
            }
            this.K.setBorder(GA.y(var2_2));
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintSafely(Graphics var1_1) {
        block28: {
            block29: {
                block32: {
                    block39: {
                        block40: {
                            block35: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block33: {
                                                block34: {
                                                    block30: {
                                                        block31: {
                                                            block19: {
                                                                block22: {
                                                                    block27: {
                                                                        block25: {
                                                                            block26: {
                                                                                block24: {
                                                                                    block23: {
                                                                                        block20: {
                                                                                            block21: {
                                                                                                block17: {
                                                                                                    block18: {
                                                                                                        block16: {
                                                                                                            block13: {
                                                                                                                block15: {
                                                                                                                    block14: {
                                                                                                                        var3_2 = this.getComponent();
                                                                                                                        var4_3 = (Graphics2D)var1_1;
                                                                                                                        var2_4 = ne_2.A();
                                                                                                                        if (!var3_2.isOpaque()) break block13;
                                                                                                                        v0 = this.D;
                                                                                                                        if (!var2_4) break block14;
                                                                                                                        if (v0 == null) break block15;
                                                                                                                        v0 = this.D;
                                                                                                                    }
                                                                                                                    if (!var2_4) break block16;
                                                                                                                    if (v0.d(this.K).booleanValue()) break block13;
                                                                                                                }
                                                                                                                var1_1.setColor(var3_2.getBackground());
                                                                                                                var1_1.fillRect(0, 0, var3_2.getWidth(), var3_2.getHeight());
                                                                                                            }
                                                                                                            v0 = this.D;
                                                                                                        }
                                                                                                        if (!var2_4) break block17;
                                                                                                        if (v0 != null) break block18;
                                                                                                        v0 = this;
                                                                                                        if (!var2_4) break block17;
                                                                                                        if (!v0.G) break block19;
                                                                                                    }
                                                                                                    v0 = RV.X(var4_3);
                                                                                                }
                                                                                                var5_5 = v0;
                                                                                                v1 = this;
                                                                                                if (!var2_4) break block20;
                                                                                                if (v1.D == null) break block21;
                                                                                                this.D.u(var4_3, FN.N(var3_2), var3_2);
                                                                                                if (var2_4) break block22;
                                                                                            }
                                                                                            v1 = this;
                                                                                        }
                                                                                        v2 = v1.G;
                                                                                        if (!var2_4) break block23;
                                                                                        if (!v2) break block22;
                                                                                        v2 = this.c;
                                                                                    }
                                                                                    if (!var2_4) break block24;
                                                                                    if (!v2) break block25;
                                                                                    v2 = this.Q;
                                                                                }
                                                                                if (!var2_4) break block26;
                                                                                if (!v2) ** GOTO lbl-1000
                                                                                v2 = var3_2.isFocusOwner();
                                                                            }
                                                                            if (v2) {
                                                                                v3 = GO.c;
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                v3 = var6_6 = GO.r;
                                                                            }
                                                                            if (var2_4) break block27;
                                                                        }
                                                                        var6_6 = null;
                                                                    }
                                                                    GA.r(var4_3, var3_2, var6_6, this.T, this.f, this.W, this.v);
                                                                }
                                                                RV.X(var4_3, var5_5);
                                                            }
                                                            var5_5 = FN.Y(var4_3);
                                                            super.paintSafely(var1_1);
                                                            if (!var2_4) break block28;
                                                            if (!this.Q(var3_2)) break block29;
                                                            var6_7 = var3_2.getComponentOrientation().isLeftToRight();
                                                            var7_8 = this.getVisibleEditorRect();
                                                            var8_9 = RV.n(var4_3, var7_8);
                                                            v4 = this.o;
                                                            if (var2_4) {
                                                                v4 = v4 != null ? this.o : var3_2.getFont();
                                                            }
                                                            var4_3.setFont(v4);
                                                            v5 = this.b;
                                                            if (var2_4) {
                                                                v5 = v5 != null ? this.b : var3_2.getForeground();
                                                            }
                                                            var4_3.setPaint(v5);
                                                            var9_10 = cf_2.X(this.a);
                                                            var10_11 = var4_3.getFontMetrics();
                                                            v6 = this.L;
                                                            if (!var2_4) break block30;
                                                            if (v6 != 0) break block31;
                                                            var11_12 = var7_8.x + var7_8.width / 2 - var10_11.stringWidth(var9_10) / 2;
                                                            if (var2_4) break block32;
                                                        }
                                                        v6 = (int)var6_7;
                                                    }
                                                    if (!var2_4) break block33;
                                                    if (v6 == 0) break block34;
                                                    v7 = this.L;
                                                    if (!var2_4) break block35;
                                                    if (v7 == hl_0.a(6699, 6081752597153439722L)) break block36;
                                                }
                                                v6 = (int)var6_7;
                                            }
                                            if (!var2_4) break block37;
                                            if (v6 != 0) break block38;
                                            v7 = this.L;
                                            if (!var2_4) break block35;
                                            if (v7 == hl_0.a(5214, 2167190049943703966L)) break block36;
                                        }
                                        v6 = this.L;
                                    }
                                    v8 = 2;
                                    if (!var2_4) break block39;
                                    if (v6 != v8) break block40;
                                }
                                v7 = var11_12 = var7_8.x;
                            }
                            if (var2_4) break block32;
                        }
                        v6 = var7_8.x + var7_8.width;
                        v8 = var10_11.stringWidth(var9_10);
                    }
                    var11_12 = v6 - v8;
                }
                var4_3.drawString(var9_10, var11_12, this.getBaseline(var3_2, var3_2.getWidth(), var3_2.getHeight()));
                RV.w(var4_3, var8_9);
            }
            FN.k(var4_3, (Map)var5_5);
        }
    }

    @Override
    protected void paintBackground(Graphics graphics) {
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        hl_0 hl_02;
        Dimension dimension;
        block6: {
            block7: {
                JComponent jComponent2;
                block4: {
                    block5: {
                        dimension = super.getPreferredSize(jComponent);
                        ++dimension.width;
                        boolean bl = ne_2.m();
                        jComponent2 = this.U;
                        if (bl) break block4;
                        if (jComponent2 != null) break block5;
                        hl_02 = this;
                        if (bl) break block6;
                        if (hl_02.H == null) break block7;
                    }
                    jComponent2 = jComponent;
                }
                Dimension dimension2 = jComponent2.getLayout().preferredLayoutSize(jComponent);
                dimension.height = Math.max(dimension.height, dimension2.height);
            }
            hl_02 = this;
        }
        if (hl_02.D != null) {
            dimension = FN.h(dimension, this.D.d(jComponent));
        }
        return dimension;
    }

    static JPasswordField s(hl_0 hl_02) {
        return hl_02.K;
    }

    static void i(hl_0 hl_02) {
        hl_02.U();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "Icd\u00c7\u0084\u00c0\u00aa\u00fb\u0006\u00bbE\u0017x\u009a\u00fb\u0014(\u009d\u00d8d\u00fd\u0014\u0098\u00f4b\u00b6\u001a>w9\u00b0\u0094$\u0010#?\u0007\u00d6O\u00a0\u00d2\u0018\u00007\u00140\u00f4\u00b6\u0096T\u00d3\u00dcs+P\u0017\u00e8\u00aa\u0086,\u001f\u00d9=\u0083\u009c\u00075r\u00dcu\u0097\u00f4\u00c6\u0006z\u0093/\u00a2\u009d\u00a0\u0007\u00cf9\u00aft\u00f8\u001d\u0089\u0014\u0017]?|\u0001\u0017\u0007\u0094\u0091\u00bad\u00bf\u00b8\tI\u0092\u001b\u00d0\u00c4'";
                        var12_3 = "Icd\u00c7\u0084\u00c0\u00aa\u00fb\u0006\u00bbE\u0017x\u009a\u00fb\u0014(\u009d\u00d8d\u00fd\u0014\u0098\u00f4b\u00b6\u001a>w9\u00b0\u0094$\u0010#?\u0007\u00d6O\u00a0\u00d2\u0018\u00007\u00140\u00f4\u00b6\u0096T\u00d3\u00dcs+P\u0017\u00e8\u00aa\u0086,\u001f\u00d9=\u0083\u009c\u00075r\u00dcu\u0097\u00f4\u00c6\u0006z\u0093/\u00a2\u009d\u00a0\u0007\u00cf9\u00aft\u00f8\u001d\u0089\u0014\u0017]?|\u0001\u0017\u0007\u0094\u0091\u00bad\u00bf\u00b8\tI\u0092\u001b\u00d0\u00c4'".length();
                        var9_4 = 8;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 126;
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
                            var10_2 = "\u00c4\u00ad\u0017\u00feIJ\u0014G\u009d\u00e6\u0005\u00e0\u001f\u00f4T\u0090\n\u00de\u001d-\u0086b\u00a1\u00aeT\u00d3\u000f";
                            var12_3 = "\u00c4\u00ad\u0017\u00feIJ\u0014G\u009d\u00e6\u0005\u00e0\u001f\u00f4T\u0090\n\u00de\u001d-\u0086b\u00a1\u00aeT\u00d3\u000f".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 99;
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
                                    v15 = 112;
                                    break;
                                }
                                case 1: {
                                    v15 = 120;
                                    break;
                                }
                                case 2: {
                                    v15 = 109;
                                    break;
                                }
                                case 3: {
                                    v15 = 68;
                                    break;
                                }
                                case 4: {
                                    v15 = 49;
                                    break;
                                }
                                case 5: {
                                    v15 = 40;
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
                hl_0.d = var13;
                hl_0.e = new String[11];
                var0_7 = 3553164578915780092L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "Q\u00f3\u00d6\u0012\u00d5aTi\u0093\u0084z\u00ecW\u00e5Z\u001c";
                var5_11 = "Q\u00f3\u00d6\u0012\u00d5aTi\u0093\u0084z\u00ecW\u00e5Z\u001c".length();
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
        hl_0.g = var6_8;
        hl_0.i = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x679E) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 32;
                    break;
                }
                case 1: {
                    n14 = 116;
                    break;
                }
                case 2: {
                    n14 = 205;
                    break;
                }
                case 3: {
                    n14 = 22;
                    break;
                }
                case 4: {
                    n14 = 124;
                    break;
                }
                case 5: {
                    n14 = 178;
                    break;
                }
                case 6: {
                    n14 = 201;
                    break;
                }
                case 7: {
                    n14 = 96;
                    break;
                }
                case 8: {
                    n14 = 155;
                    break;
                }
                case 9: {
                    n14 = 110;
                    break;
                }
                case 10: {
                    n14 = 238;
                    break;
                }
                case 11: {
                    n14 = 221;
                    break;
                }
                case 12: {
                    n14 = 197;
                    break;
                }
                case 13: {
                    n14 = 251;
                    break;
                }
                case 14: {
                    n14 = 144;
                    break;
                }
                case 15: {
                    n14 = 136;
                    break;
                }
                case 16: {
                    n14 = 52;
                    break;
                }
                case 17: {
                    n14 = 66;
                    break;
                }
                case 18: {
                    n14 = 253;
                    break;
                }
                case 19: {
                    n14 = 42;
                    break;
                }
                case 20: {
                    n14 = 248;
                    break;
                }
                case 21: {
                    n14 = 133;
                    break;
                }
                case 22: {
                    n14 = 241;
                    break;
                }
                case 23: {
                    n14 = 8;
                    break;
                }
                case 24: {
                    n14 = 203;
                    break;
                }
                case 25: {
                    n14 = 72;
                    break;
                }
                case 26: {
                    n14 = 100;
                    break;
                }
                case 27: {
                    n14 = 148;
                    break;
                }
                case 28: {
                    n14 = 77;
                    break;
                }
                case 29: {
                    n14 = 250;
                    break;
                }
                case 30: {
                    n14 = 168;
                    break;
                }
                case 31: {
                    n14 = 236;
                    break;
                }
                case 32: {
                    n14 = 130;
                    break;
                }
                case 33: {
                    n14 = 167;
                    break;
                }
                case 34: {
                    n14 = 60;
                    break;
                }
                case 35: {
                    n14 = 121;
                    break;
                }
                case 36: {
                    n14 = 113;
                    break;
                }
                case 37: {
                    n14 = 174;
                    break;
                }
                case 38: {
                    n14 = 215;
                    break;
                }
                case 39: {
                    n14 = 46;
                    break;
                }
                case 40: {
                    n14 = 235;
                    break;
                }
                case 41: {
                    n14 = 48;
                    break;
                }
                case 42: {
                    n14 = 12;
                    break;
                }
                case 43: {
                    n14 = 191;
                    break;
                }
                case 44: {
                    n14 = 160;
                    break;
                }
                case 45: {
                    n14 = 192;
                    break;
                }
                case 46: {
                    n14 = 105;
                    break;
                }
                case 47: {
                    n14 = 249;
                    break;
                }
                case 48: {
                    n14 = 218;
                    break;
                }
                case 49: {
                    n14 = 0;
                    break;
                }
                case 50: {
                    n14 = 87;
                    break;
                }
                case 51: {
                    n14 = 187;
                    break;
                }
                case 52: {
                    n14 = 56;
                    break;
                }
                case 53: {
                    n14 = 86;
                    break;
                }
                case 54: {
                    n14 = 75;
                    break;
                }
                case 55: {
                    n14 = 44;
                    break;
                }
                case 56: {
                    n14 = 28;
                    break;
                }
                case 57: {
                    n14 = 68;
                    break;
                }
                case 58: {
                    n14 = 134;
                    break;
                }
                case 59: {
                    n14 = 199;
                    break;
                }
                case 60: {
                    n14 = 74;
                    break;
                }
                case 61: {
                    n14 = 122;
                    break;
                }
                case 62: {
                    n14 = 153;
                    break;
                }
                case 63: {
                    n14 = 71;
                    break;
                }
                case 64: {
                    n14 = 229;
                    break;
                }
                case 65: {
                    n14 = 207;
                    break;
                }
                case 66: {
                    n14 = 128;
                    break;
                }
                case 67: {
                    n14 = 163;
                    break;
                }
                case 68: {
                    n14 = 102;
                    break;
                }
                case 69: {
                    n14 = 173;
                    break;
                }
                case 70: {
                    n14 = 143;
                    break;
                }
                case 71: {
                    n14 = 65;
                    break;
                }
                case 72: {
                    n14 = 18;
                    break;
                }
                case 73: {
                    n14 = 80;
                    break;
                }
                case 74: {
                    n14 = 59;
                    break;
                }
                case 75: {
                    n14 = 97;
                    break;
                }
                case 76: {
                    n14 = 70;
                    break;
                }
                case 77: {
                    n14 = 183;
                    break;
                }
                case 78: {
                    n14 = 106;
                    break;
                }
                case 79: {
                    n14 = 131;
                    break;
                }
                case 80: {
                    n14 = 95;
                    break;
                }
                case 81: {
                    n14 = 26;
                    break;
                }
                case 82: {
                    n14 = 244;
                    break;
                }
                case 83: {
                    n14 = 198;
                    break;
                }
                case 84: {
                    n14 = 217;
                    break;
                }
                case 85: {
                    n14 = 27;
                    break;
                }
                case 86: {
                    n14 = 3;
                    break;
                }
                case 87: {
                    n14 = 99;
                    break;
                }
                case 88: {
                    n14 = 34;
                    break;
                }
                case 89: {
                    n14 = 132;
                    break;
                }
                case 90: {
                    n14 = 57;
                    break;
                }
                case 91: {
                    n14 = 150;
                    break;
                }
                case 92: {
                    n14 = 138;
                    break;
                }
                case 93: {
                    n14 = 182;
                    break;
                }
                case 94: {
                    n14 = 15;
                    break;
                }
                case 95: {
                    n14 = 230;
                    break;
                }
                case 96: {
                    n14 = 208;
                    break;
                }
                case 97: {
                    n14 = 135;
                    break;
                }
                case 98: {
                    n14 = 194;
                    break;
                }
                case 99: {
                    n14 = 186;
                    break;
                }
                case 100: {
                    n14 = 101;
                    break;
                }
                case 101: {
                    n14 = 7;
                    break;
                }
                case 102: {
                    n14 = 224;
                    break;
                }
                case 103: {
                    n14 = 58;
                    break;
                }
                case 104: {
                    n14 = 243;
                    break;
                }
                case 105: {
                    n14 = 118;
                    break;
                }
                case 106: {
                    n14 = 202;
                    break;
                }
                case 107: {
                    n14 = 129;
                    break;
                }
                case 108: {
                    n14 = 190;
                    break;
                }
                case 109: {
                    n14 = 114;
                    break;
                }
                case 110: {
                    n14 = 246;
                    break;
                }
                case 111: {
                    n14 = 54;
                    break;
                }
                case 112: {
                    n14 = 149;
                    break;
                }
                case 113: {
                    n14 = 175;
                    break;
                }
                case 114: {
                    n14 = 212;
                    break;
                }
                case 115: {
                    n14 = 61;
                    break;
                }
                case 116: {
                    n14 = 145;
                    break;
                }
                case 117: {
                    n14 = 165;
                    break;
                }
                case 118: {
                    n14 = 11;
                    break;
                }
                case 119: {
                    n14 = 156;
                    break;
                }
                case 120: {
                    n14 = 226;
                    break;
                }
                case 121: {
                    n14 = 166;
                    break;
                }
                case 122: {
                    n14 = 220;
                    break;
                }
                case 123: {
                    n14 = 161;
                    break;
                }
                case 124: {
                    n14 = 9;
                    break;
                }
                case 125: {
                    n14 = 88;
                    break;
                }
                case 126: {
                    n14 = 252;
                    break;
                }
                case 127: {
                    n14 = 204;
                    break;
                }
                case 128: {
                    n14 = 125;
                    break;
                }
                case 129: {
                    n14 = 67;
                    break;
                }
                case 130: {
                    n14 = 177;
                    break;
                }
                case 131: {
                    n14 = 162;
                    break;
                }
                case 132: {
                    n14 = 169;
                    break;
                }
                case 133: {
                    n14 = 24;
                    break;
                }
                case 134: {
                    n14 = 137;
                    break;
                }
                case 135: {
                    n14 = 91;
                    break;
                }
                case 136: {
                    n14 = 40;
                    break;
                }
                case 137: {
                    n14 = 142;
                    break;
                }
                case 138: {
                    n14 = 176;
                    break;
                }
                case 139: {
                    n14 = 196;
                    break;
                }
                case 140: {
                    n14 = 247;
                    break;
                }
                case 141: {
                    n14 = 159;
                    break;
                }
                case 142: {
                    n14 = 90;
                    break;
                }
                case 143: {
                    n14 = 108;
                    break;
                }
                case 144: {
                    n14 = 10;
                    break;
                }
                case 145: {
                    n14 = 171;
                    break;
                }
                case 146: {
                    n14 = 158;
                    break;
                }
                case 147: {
                    n14 = 103;
                    break;
                }
                case 148: {
                    n14 = 6;
                    break;
                }
                case 149: {
                    n14 = 115;
                    break;
                }
                case 150: {
                    n14 = 43;
                    break;
                }
                case 151: {
                    n14 = 78;
                    break;
                }
                case 152: {
                    n14 = 30;
                    break;
                }
                case 153: {
                    n14 = 94;
                    break;
                }
                case 154: {
                    n14 = 233;
                    break;
                }
                case 155: {
                    n14 = 33;
                    break;
                }
                case 156: {
                    n14 = 2;
                    break;
                }
                case 157: {
                    n14 = 151;
                    break;
                }
                case 158: {
                    n14 = 231;
                    break;
                }
                case 159: {
                    n14 = 16;
                    break;
                }
                case 160: {
                    n14 = 104;
                    break;
                }
                case 161: {
                    n14 = 210;
                    break;
                }
                case 162: {
                    n14 = 239;
                    break;
                }
                case 163: {
                    n14 = 164;
                    break;
                }
                case 164: {
                    n14 = 50;
                    break;
                }
                case 165: {
                    n14 = 216;
                    break;
                }
                case 166: {
                    n14 = 170;
                    break;
                }
                case 167: {
                    n14 = 181;
                    break;
                }
                case 168: {
                    n14 = 64;
                    break;
                }
                case 169: {
                    n14 = 126;
                    break;
                }
                case 170: {
                    n14 = 13;
                    break;
                }
                case 171: {
                    n14 = 228;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 109;
                    break;
                }
                case 174: {
                    n14 = 76;
                    break;
                }
                case 175: {
                    n14 = 123;
                    break;
                }
                case 176: {
                    n14 = 157;
                    break;
                }
                case 177: {
                    n14 = 84;
                    break;
                }
                case 178: {
                    n14 = 73;
                    break;
                }
                case 179: {
                    n14 = 117;
                    break;
                }
                case 180: {
                    n14 = 225;
                    break;
                }
                case 181: {
                    n14 = 195;
                    break;
                }
                case 182: {
                    n14 = 188;
                    break;
                }
                case 183: {
                    n14 = 240;
                    break;
                }
                case 184: {
                    n14 = 21;
                    break;
                }
                case 185: {
                    n14 = 41;
                    break;
                }
                case 186: {
                    n14 = 14;
                    break;
                }
                case 187: {
                    n14 = 79;
                    break;
                }
                case 188: {
                    n14 = 39;
                    break;
                }
                case 189: {
                    n14 = 223;
                    break;
                }
                case 190: {
                    n14 = 4;
                    break;
                }
                case 191: {
                    n14 = 49;
                    break;
                }
                case 192: {
                    n14 = 213;
                    break;
                }
                case 193: {
                    n14 = 120;
                    break;
                }
                case 194: {
                    n14 = 245;
                    break;
                }
                case 195: {
                    n14 = 146;
                    break;
                }
                case 196: {
                    n14 = 25;
                    break;
                }
                case 197: {
                    n14 = 189;
                    break;
                }
                case 198: {
                    n14 = 55;
                    break;
                }
                case 199: {
                    n14 = 184;
                    break;
                }
                case 200: {
                    n14 = 219;
                    break;
                }
                case 201: {
                    n14 = 98;
                    break;
                }
                case 202: {
                    n14 = 255;
                    break;
                }
                case 203: {
                    n14 = 23;
                    break;
                }
                case 204: {
                    n14 = 29;
                    break;
                }
                case 205: {
                    n14 = 232;
                    break;
                }
                case 206: {
                    n14 = 5;
                    break;
                }
                case 207: {
                    n14 = 53;
                    break;
                }
                case 208: {
                    n14 = 37;
                    break;
                }
                case 209: {
                    n14 = 141;
                    break;
                }
                case 210: {
                    n14 = 237;
                    break;
                }
                case 211: {
                    n14 = 47;
                    break;
                }
                case 212: {
                    n14 = 234;
                    break;
                }
                case 213: {
                    n14 = 111;
                    break;
                }
                case 214: {
                    n14 = 89;
                    break;
                }
                case 215: {
                    n14 = 17;
                    break;
                }
                case 216: {
                    n14 = 185;
                    break;
                }
                case 217: {
                    n14 = 211;
                    break;
                }
                case 218: {
                    n14 = 180;
                    break;
                }
                case 219: {
                    n14 = 227;
                    break;
                }
                case 220: {
                    n14 = 36;
                    break;
                }
                case 221: {
                    n14 = 51;
                    break;
                }
                case 222: {
                    n14 = 193;
                    break;
                }
                case 223: {
                    n14 = 45;
                    break;
                }
                case 224: {
                    n14 = 85;
                    break;
                }
                case 225: {
                    n14 = 209;
                    break;
                }
                case 226: {
                    n14 = 1;
                    break;
                }
                case 227: {
                    n14 = 20;
                    break;
                }
                case 228: {
                    n14 = 206;
                    break;
                }
                case 229: {
                    n14 = 107;
                    break;
                }
                case 230: {
                    n14 = 147;
                    break;
                }
                case 231: {
                    n14 = 69;
                    break;
                }
                case 232: {
                    n14 = 62;
                    break;
                }
                case 233: {
                    n14 = 214;
                    break;
                }
                case 234: {
                    n14 = 172;
                    break;
                }
                case 235: {
                    n14 = 127;
                    break;
                }
                case 236: {
                    n14 = 140;
                    break;
                }
                case 237: {
                    n14 = 112;
                    break;
                }
                case 238: {
                    n14 = 38;
                    break;
                }
                case 239: {
                    n14 = 152;
                    break;
                }
                case 240: {
                    n14 = 200;
                    break;
                }
                case 241: {
                    n14 = 31;
                    break;
                }
                case 242: {
                    n14 = 35;
                    break;
                }
                case 243: {
                    n14 = 242;
                    break;
                }
                case 244: {
                    n14 = 19;
                    break;
                }
                case 245: {
                    n14 = 154;
                    break;
                }
                case 246: {
                    n14 = 92;
                    break;
                }
                case 247: {
                    n14 = 119;
                    break;
                }
                case 248: {
                    n14 = 139;
                    break;
                }
                case 249: {
                    n14 = 93;
                    break;
                }
                case 250: {
                    n14 = 179;
                    break;
                }
                case 251: {
                    n14 = 63;
                    break;
                }
                case 252: {
                    n14 = 254;
                    break;
                }
                case 253: {
                    n14 = 83;
                    break;
                }
                case 254: {
                    n14 = 81;
                    break;
                }
                default: {
                    n14 = 222;
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
            hl_0.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x45C0;
        if (i[n11] == null) {
            hl_0.i[n11] = (int)(g[n11] ^ l2);
        }
        return i[n11];
    }
}

