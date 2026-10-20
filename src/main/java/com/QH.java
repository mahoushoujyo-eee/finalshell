/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.IP;
import com.L0;
import com.RV;
import com.TC;
import com.W2;
import com.WO;
import com._q_0;
import com.c;
import com.cf_2;
import com.da_2;
import com.ee_2;
import com.ky_2;
import com.ne_2;
import com.og_2;
import com.ot_2;
import com.yl_2;
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
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QH
extends BasicTextFieldUI
implements W2,
SwingConstants,
L0 {
    private JTextField u = null;
    private boolean M = ee_2.n;
    private boolean G = ee_2.X;
    private int r = ee_2.J;
    private boolean V = ee_2.k;
    private int A = ee_2.x;
    private boolean b = ee_2.u;
    private boolean h = ee_2.N;
    private Insets U = ee_2.W;
    private String Q = ee_2.h;
    private Font S = ee_2.K;
    private Color f = ee_2.j;
    private int a = ee_2.E;
    private boolean J = ee_2.S;
    private og_2 e = ee_2.l;
    private JComponent y = null;
    private JComponent K = null;
    private boolean t = false;
    private FocusListener C;
    private PropertyChangeListener j;
    private PropertyChangeListener L;
    private PropertyChangeListener Y;
    private ComponentAdapter k;
    boolean O = true;
    private boolean F = false;
    Color z = new Color(QH.a(3872, 1008117158691340778L), QH.a(19021, 6848781374362076294L), QH.a(19021, 6848781374362076294L), QH.a(28851, 5840628270621621885L));
    private static final String[] c;
    private static final String[] d;
    private static final long[] i;
    private static final Integer[] l;

    public boolean K() {
        return this.F;
    }

    public void v(boolean bl) {
        this.F = bl;
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new QH();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.u = (JTextField)jComponent;
        FN.Y(this.u);
        LookAndFeel.installProperty(this.u, QH.a(-26633, 482), Boolean.FALSE);
        this.u.putClientProperty(QH.a(-26631, 24920), true);
        boolean bl = ne_2.m();
        this.u.setFocusable(true);
        this.u.setMargin(ee_2.Q);
        this.u.setBackground(ee_2.q);
        this.u.setSelectionColor(GO.F4);
        this.u.setForeground(ee_2.G);
        this.u.setSelectedTextColor(ee_2.i);
        this.u.setCaretColor(ee_2.p);
        this.u.setLayout(new TC(this.u));
        WO.t(this.u, this.e);
        this.h();
        this.C = new ot_2(this);
        this.u.addFocusListener(this.C);
        this.j = new IP(this);
        this.u.addPropertyChangeListener(QH.a(-26628, -20360), this.j);
        this.L = new yl_2(this);
        this.u.addPropertyChangeListener(QH.a(-26625, 9945), this.L);
        this.Y = new _q_0(this);
        this.u.addPropertyChangeListener(QH.a(-26627, -24143), this.Y);
        this.k = new da_2(this);
        boolean bl2 = bl;
        if (bl2) {
            ky_2.K(new String[1]);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.u, this.e);
        this.u.putClientProperty(QH.a(-26636, 26545), null);
        this.u.removeFocusListener(this.C);
        this.u.removePropertyChangeListener(QH.a(-26629, -29146), this.j);
        this.u.removePropertyChangeListener(QH.a(-26630, -2551), this.L);
        this.u.removePropertyChangeListener(QH.a(-26626, 18640), this.Y);
        this.B();
        this.W();
        this.u.setLayout(null);
        this.u = null;
        super.uninstallUI(jComponent);
    }

    @Override
    protected void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block3: {
            block2: {
                boolean bl = ne_2.A();
                super.propertyChange(propertyChangeEvent);
                boolean bl2 = bl;
                if (!bl2) break block2;
                if (!propertyChangeEvent.getPropertyName().equals(QH.a(-26628, -20360))) break block3;
                FN.o(this.y, this.u.isEnabled());
            }
            FN.o(this.K, this.u.isEnabled());
        }
    }

    @Override
    public Shape B() {
        boolean bl = ne_2.m();
        QH qH = this;
        if (!bl) {
            if (qH.M) {
                return GA.X(this.u, this.A, this.r);
            }
            qH = this;
        }
        return FN.N(qH.u);
    }

    private void J() {
        block6: {
            JComponent jComponent;
            block5: {
                boolean bl = ne_2.m();
                jComponent = this.y;
                if (!bl) {
                    if (jComponent != null) {
                        this.y.setEnabled(this.u.isEnabled());
                    }
                    jComponent = this.K;
                }
                if (bl) break block5;
                if (jComponent == null) break block6;
                jComponent = this.K;
            }
            jComponent.setEnabled(this.u.isEnabled());
        }
    }

    public JComponent v() {
        return this.y;
    }

    public void o(JComponent jComponent) {
        block6: {
            JComponent jComponent2;
            block5: {
                boolean bl = ne_2.A();
                jComponent2 = this.y;
                if (!bl) break block5;
                if (jComponent2 == jComponent) {
                    return;
                }
                this.B();
                if (!bl) break block6;
                jComponent2 = jComponent;
            }
            if (jComponent2 != null) {
                this.y = jComponent;
                this.y.addComponentListener(this.k);
                this.u.add((Component)jComponent, QH.a(-26632, -7327));
                this.J();
            }
            this.u.revalidate();
            this.h();
        }
    }

    private void B() {
        block3: {
            JComponent jComponent;
            block2: {
                boolean bl = ne_2.A();
                jComponent = this.y;
                if (!bl) break block2;
                if (jComponent == null) break block3;
                jComponent = this.y;
            }
            jComponent.removeComponentListener(this.k);
            this.u.remove(this.y);
            this.y = null;
        }
    }

    public JComponent d() {
        return this.K;
    }

    public void z(JComponent jComponent) {
        block6: {
            JComponent jComponent2;
            block5: {
                boolean bl = ne_2.A();
                jComponent2 = this.K;
                if (!bl) break block5;
                if (jComponent2 == jComponent) {
                    return;
                }
                this.W();
                if (!bl) break block6;
                jComponent2 = jComponent;
            }
            if (jComponent2 != null) {
                this.K = jComponent;
                this.K.addComponentListener(this.k);
                this.u.add((Component)jComponent, QH.a(-26634, -9662));
                this.J();
            }
            this.u.revalidate();
            this.h();
        }
    }

    private void W() {
        block3: {
            JComponent jComponent;
            block2: {
                boolean bl = ne_2.A();
                jComponent = this.K;
                if (!bl) break block2;
                if (jComponent == null) break block3;
                jComponent = this.K;
            }
            jComponent.removeComponentListener(this.k);
            this.u.remove(this.K);
            this.K = null;
        }
    }

    public void T(Insets insets) {
        this.U = insets;
        this.h();
    }

    public Insets Z() {
        return this.U;
    }

    public String F() {
        return this.Q;
    }

    /*
     * Exception decompiling
     */
    public void F(String var1_1) {
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

    public Font n() {
        return this.S;
    }

    public void B(Font font) {
        this.S = font;
        this.Y();
    }

    public Color u() {
        return this.f;
    }

    public void w(Color color) {
        this.f = color;
        this.Y();
    }

    public int O() {
        return this.a;
    }

    public void e(int n10) {
        this.a = n10;
        this.Y();
    }

    public boolean A() {
        return this.J;
    }

    public void k(boolean bl) {
        this.J = bl;
        this.Y();
    }

    public boolean T() {
        return this.V;
    }

    public void h(boolean bl) {
        this.V = bl;
    }

    public int a() {
        return this.A;
    }

    public void g(int n10) {
        this.A = n10;
        this.h();
    }

    public boolean G() {
        return this.b;
    }

    public void L(boolean bl) {
        this.b = bl;
        this.H();
    }

    public boolean q() {
        return this.h;
    }

    public void D(boolean bl) {
        this.h = bl;
        this.H();
    }

    public int k() {
        return this.r;
    }

    public void T(int n10) {
        this.r = n10;
        this.H();
    }

    public boolean R() {
        return this.M;
    }

    public void R(boolean bl) {
        this.M = bl;
        this.h();
    }

    public boolean C() {
        return this.G;
    }

    public void o(boolean bl) {
        this.G = bl;
        this.H();
    }

    public og_2 i() {
        return this.e;
    }

    /*
     * Exception decompiling
     */
    public void Y(og_2 var1_1) {
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

    private void Y() {
        block3: {
            QH qH;
            block2: {
                boolean bl = ne_2.m();
                qH = this;
                if (bl) break block2;
                if (!qH.L(this.getComponent())) break block3;
                qH = this;
            }
            qH.H();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean L(JTextComponent jTextComponent) {
        boolean bl;
        boolean bl2;
        block6: {
            block7: {
                bl2 = ne_2.A();
                bl = this.t;
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
                    bl = this.J;
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

    private void H() {
        block3: {
            JTextField jTextField;
            block2: {
                boolean bl = ne_2.A();
                jTextField = this.u;
                if (!bl) break block2;
                if (jTextField == null) break block3;
                jTextField = this.u;
            }
            jTextField.repaint();
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
                                                    v0 = this.u;
                                                    if (!var1_1) break block18;
                                                    if (v0 == null) break block19;
                                                    v1 = this;
                                                    if (!var1_1) break block20;
                                                    v0 = v1.u;
                                                }
                                                if (FN.l(v0)) {
                                                    return;
                                                }
                                                v1 = this;
                                            }
                                            if (!var1_1) break block21;
                                            if (v1.e == null) break block22;
                                            var2_2 = this.e.B(this.getComponent());
                                            if (var1_1) break block23;
                                        }
                                        v1 = this;
                                    }
                                    if (!v1.M) break block24;
                                    var2_2 = new Insets(this.A + 1, this.A + 1, this.A + 1, this.A + 1);
                                    if (var1_1) break block23;
                                }
                                var2_2 = new Insets(0, 0, 0, 0);
                            }
                            var3_3 = this.u.getComponentOrientation().isLeftToRight();
                            v2 = var4_4 = this.u.getMargin();
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
                        v2 = this.U;
                    }
                    if (!var1_1) break block27;
                    if (v2 == null) break block28;
                    v15 = var2_2;
                    v16 = v15;
                    v17 = v15.top;
                    v18 = this.U;
                    if (!var1_1) ** GOTO lbl79
                    v16.top = v17 + v18.top;
                    v2 = var2_2;
                }
                v16 = v2;
                v17 = v2.left;
                if (var3_3) {
                    v19 = this.U.left;
                } else {
                    v18 = this.U;
lbl79:
                    // 2 sources

                    v19 = v18.right;
                }
                v16.left = v17 + v19;
                v20 = var2_2;
                v21 = v20;
                v22 = v20.bottom;
                v23 = this.U;
                if (!var1_1) ** GOTO lbl94
                v21.bottom = v22 + v23.bottom;
                v24 = var2_2;
                v21 = v24;
                v22 = v24.right;
                if (var3_3) {
                    v25 = this.U.right;
                } else {
                    v23 = this.U;
lbl94:
                    // 2 sources

                    v25 = v23.left;
                }
                v21.right = v22 + v25;
            }
            var5_5 = var3_3 != false ? this.y : this.K;
            var6_6 = var3_3 != false ? this.K : this.y;
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
            this.u.setBorder(GA.y(var2_2));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void paintSafely(Graphics var1_1) {
        block36: {
            block37: {
                block40: {
                    block47: {
                        block48: {
                            block43: {
                                block44: {
                                    block45: {
                                        block46: {
                                            block41: {
                                                block42: {
                                                    block38: {
                                                        block39: {
                                                            block26: {
                                                                block35: {
                                                                    block22: {
                                                                        block23: {
                                                                            block29: {
                                                                                block34: {
                                                                                    block32: {
                                                                                        block33: {
                                                                                            block31: {
                                                                                                block30: {
                                                                                                    block27: {
                                                                                                        block28: {
                                                                                                            block24: {
                                                                                                                block25: {
                                                                                                                    block18: {
                                                                                                                        block19: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    try {
                                                                                                                                        v0 = (Graphics)lk_0.E((Object)this.getComponent(), (Object)var1_1);
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException v1) {
                                                                                                                                        throw v1.getTargetException();
                                                                                                                                    }
                                                                                                                                    var1_1 = v0;
                                                                                                                                    var3_2 = this.getComponent();
                                                                                                                                    var4_3 = (Graphics2D)var1_1;
                                                                                                                                    var2_4 = ne_2.m();
                                                                                                                                    v2 = var3_2.isOpaque();
                                                                                                                                    if (var2_4) break block18;
                                                                                                                                    if (v2 == 0) break block19;
                                                                                                                                    v3 = this.e;
                                                                                                                                    if (var2_4) break block20;
                                                                                                                                    if (v3 == null) break block21;
                                                                                                                                    v3 = this.e;
                                                                                                                                }
                                                                                                                                v2 = v3.d(this.u).booleanValue();
                                                                                                                                if (var2_4) break block18;
                                                                                                                                if (v2 != 0) break block19;
                                                                                                                            }
                                                                                                                            var1_1.setColor(var3_2.getBackground());
                                                                                                                            var1_1.fillRect(0, 0, var3_2.getWidth(), var3_2.getHeight());
                                                                                                                        }
                                                                                                                        v2 = this.F;
                                                                                                                    }
                                                                                                                    if (var2_4) break block22;
                                                                                                                    if (v2 != 0) break block23;
                                                                                                                    v4 = this.e;
                                                                                                                    if (var2_4) break block24;
                                                                                                                    if (v4 != null) break block25;
                                                                                                                    v4 = this;
                                                                                                                    if (var2_4) break block24;
                                                                                                                    if (!v4.M) break block26;
                                                                                                                }
                                                                                                                v4 = RV.X(var4_3);
                                                                                                            }
                                                                                                            var5_5 = v4;
                                                                                                            v5 = this;
                                                                                                            if (var2_4) break block27;
                                                                                                            if (v5.e == null) break block28;
                                                                                                            this.e.u(var4_3, FN.N(var3_2), var3_2);
                                                                                                            if (!var2_4) break block29;
                                                                                                        }
                                                                                                        v5 = this;
                                                                                                    }
                                                                                                    v6 = v5.M;
                                                                                                    if (var2_4) break block30;
                                                                                                    if (!v6) break block29;
                                                                                                    v6 = this.V;
                                                                                                }
                                                                                                if (var2_4) break block31;
                                                                                                if (!v6) break block32;
                                                                                                v6 = this.G;
                                                                                            }
                                                                                            if (var2_4) break block33;
                                                                                            if (!v6) ** GOTO lbl-1000
                                                                                            v6 = var3_2.isFocusOwner();
                                                                                        }
                                                                                        if (v6) {
                                                                                            v7 = GO.c;
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            v7 = var6_7 = GO.r;
                                                                                        }
                                                                                        if (!var2_4) break block34;
                                                                                    }
                                                                                    var6_7 = null;
                                                                                }
                                                                                GA.r(var4_3, var3_2, var6_7, this.A, this.r, this.b, this.h);
                                                                            }
                                                                            RV.X(var4_3, var5_5);
                                                                            if (!var2_4) break block26;
                                                                        }
                                                                        v2 = this.O;
                                                                    }
                                                                    if (var2_4) break block35;
                                                                    if (v2 == 0) break block26;
                                                                    var4_3.setColor(this.z);
                                                                    v2 = 0;
                                                                }
                                                                var5_6 = v2;
                                                                var6_8 = 1;
                                                                var4_3.fillRect(var5_6 + 3, var3_2.getHeight() - var6_8 - 3, var3_2.getWidth() - QH.a(30780, 2355298687250003700L), var6_8);
                                                            }
                                                            var5_5 = FN.Y(var4_3);
                                                            super.paintSafely(var1_1);
                                                            if (var2_4) break block36;
                                                            if (!this.L(var3_2)) break block37;
                                                            var6_9 = var3_2.getComponentOrientation().isLeftToRight();
                                                            var7_10 = this.getVisibleEditorRect();
                                                            var8_11 = RV.n(var4_3, var7_10);
                                                            v8 = this.S;
                                                            if (!var2_4) {
                                                                v8 = v8 != null ? this.S : var3_2.getFont();
                                                            }
                                                            var4_3.setFont(v8);
                                                            v9 = this.f;
                                                            if (!var2_4) {
                                                                v9 = v9 != null ? this.f : var3_2.getForeground();
                                                            }
                                                            var4_3.setPaint(v9);
                                                            var9_12 = cf_2.X(this.Q);
                                                            var10_13 = var4_3.getFontMetrics();
                                                            v10 = this.a;
                                                            if (var2_4) break block38;
                                                            if (v10 != 0) break block39;
                                                            var11_14 = var7_10.x + var7_10.width / 2 - var10_13.stringWidth(var9_12) / 2;
                                                            if (!var2_4) break block40;
                                                        }
                                                        v10 = (int)var6_9;
                                                    }
                                                    if (var2_4) break block41;
                                                    if (v10 == 0) break block42;
                                                    v11 = this.a;
                                                    if (var2_4) break block43;
                                                    if (v11 == QH.a(14608, 8443338771349125081L)) break block44;
                                                }
                                                v10 = (int)var6_9;
                                            }
                                            if (var2_4) break block45;
                                            if (v10 != 0) break block46;
                                            v11 = this.a;
                                            if (var2_4) break block43;
                                            if (v11 == QH.a(29044, 3711130744072929211L)) break block44;
                                        }
                                        v10 = this.a;
                                    }
                                    v12 = 2;
                                    if (var2_4) break block47;
                                    if (v10 != v12) break block48;
                                }
                                v11 = var11_14 = var7_10.x;
                            }
                            if (!var2_4) break block40;
                        }
                        v10 = var7_10.x + var7_10.width;
                        v12 = var10_13.stringWidth(var9_12);
                    }
                    var11_14 = v10 - v12;
                }
                var4_3.drawString(var9_12, var11_14, this.getBaseline(var3_2, var3_2.getWidth(), var3_2.getHeight()));
                var4_3.setClip(var8_11);
            }
            FN.k(var4_3, (Map)var5_5);
        }
    }

    @Override
    protected void paintBackground(Graphics graphics) {
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        QH qH;
        Dimension dimension;
        block6: {
            block7: {
                JComponent jComponent2;
                block4: {
                    block5: {
                        dimension = super.getPreferredSize(jComponent);
                        boolean bl = ne_2.A();
                        ++dimension.width;
                        jComponent2 = this.y;
                        if (!bl) break block4;
                        if (jComponent2 != null) break block5;
                        qH = this;
                        if (!bl) break block6;
                        if (qH.K == null) break block7;
                    }
                    jComponent2 = jComponent;
                }
                Dimension dimension2 = jComponent2.getLayout().preferredLayoutSize(jComponent);
                dimension.height = Math.max(dimension.height, dimension2.height);
            }
            qH = this;
        }
        if (qH.e != null) {
            dimension = FN.h(dimension, this.e.d(jComponent));
        }
        return dimension;
    }

    public boolean V() {
        return this.O;
    }

    public void n(boolean bl) {
        this.O = bl;
    }

    static JTextField P(QH qH) {
        return qH.u;
    }

    static void j(QH qH) {
        qH.J();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "\u00d1\u009589\u00f2\u009a\u0014\u00dc\u00adI\u00e6&\u0094Dj\u00ff\u0011\u00d6M\u00db\u00e4\u00f3\u0094@\u0017=\u0090\u0007\u00afL\u00ed\u00e9<.e\u0006\u00a4\u0088\u0096\u009a'\u00ee\u0014`I\u00dez\u00d4\u0007\u001a\u00184_\u00af\u0084\u00f4\u00dd\u0016\u00b3\u00fc\u00f3\u00aa\f\u0007\u00f6u\u00c6\u00ceY\u00ca\u00c9\u0007\u0017\u00ac\u00d6\u009dZi\u000b\u0014tB1\u00c4MIX\u00ae\u00bd\u009f\u00ba\u0096*\u00fa\u00ea+\r\u00bc\u008b\u00e3\b\u00d0\u000e51#W\u0088\u00f8";
                        var12_3 = "\u00d1\u009589\u00f2\u009a\u0014\u00dc\u00adI\u00e6&\u0094Dj\u00ff\u0011\u00d6M\u00db\u00e4\u00f3\u0094@\u0017=\u0090\u0007\u00afL\u00ed\u00e9<.e\u0006\u00a4\u0088\u0096\u009a'\u00ee\u0014`I\u00dez\u00d4\u0007\u001a\u00184_\u00af\u0084\u00f4\u00dd\u0016\u00b3\u00fc\u00f3\u00aa\f\u0007\u00f6u\u00c6\u00ceY\u00ca\u00c9\u0007\u0017\u00ac\u00d6\u009dZi\u000b\u0014tB1\u00c4MIX\u00ae\u00bd\u009f\u00ba\u0096*\u00fa\u00ea+\r\u00bc\u008b\u00e3\b\u00d0\u000e51#W\u0088\u00f8".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 101;
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
                            var10_2 = "\u0011\u001dZ&\u00f8\u008d\u0014\u00d7\u0094n5\u008d\\k'\u00f0\u00858\u00feQ\u00dc\u00ae\u00c4\u00aej\u00d4\u0012";
                            var12_3 = "\u0011\u001dZ&\u00f8\u008d\u0014\u00d7\u0094n5\u008d\\k'\u00f0\u00858\u00feQ\u00dc\u00ae\u00c4\u00aej\u00d4\u0012".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 38;
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
                                    v15 = 90;
                                    break;
                                }
                                case 1: {
                                    v15 = 106;
                                    break;
                                }
                                case 2: {
                                    v15 = 50;
                                    break;
                                }
                                case 3: {
                                    v15 = 37;
                                    break;
                                }
                                case 4: {
                                    v15 = 47;
                                    break;
                                }
                                case 5: {
                                    v15 = 53;
                                    break;
                                }
                                default: {
                                    v15 = 75;
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
                QH.c = var13;
                QH.d = new String[11];
                var0_7 = 3515604448399464222L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u0082\u00ccF\u007fbd\u0016b\u00d79\u00b8\u007f.\u008b\u00d3\u000eF0:\u00d2\u00d4\u00d8\u00e1\u00ed\u0007\u00d4\u009d\u00da5. \u00cd";
                var5_11 = "\u0082\u00ccF\u007fbd\u0016b\u00d79\u00b8\u007f.\u008b\u00d3\u000eF0:\u00d2\u00d4\u00d8\u00e1\u00ed\u0007\u00d4\u009d\u00da5. \u00cd".length();
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
                    var4_10 = "\u00d7Q\f\u0010\u001a#i\u001b\u0004\u000fj\"^\u00ddh\u00ae";
                    var5_11 = "\u00d7Q\f\u0010\u001a#i\u001b\u0004\u000fj\"^\u00ddh\u00ae".length();
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
        QH.i = var6_8;
        QH.l = new Integer[6];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF97FE) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 21;
                    break;
                }
                case 1: {
                    n14 = 44;
                    break;
                }
                case 2: {
                    n14 = 15;
                    break;
                }
                case 3: {
                    n14 = 60;
                    break;
                }
                case 4: {
                    n14 = 99;
                    break;
                }
                case 5: {
                    n14 = 67;
                    break;
                }
                case 6: {
                    n14 = 188;
                    break;
                }
                case 7: {
                    n14 = 70;
                    break;
                }
                case 8: {
                    n14 = 166;
                    break;
                }
                case 9: {
                    n14 = 93;
                    break;
                }
                case 10: {
                    n14 = 100;
                    break;
                }
                case 11: {
                    n14 = 118;
                    break;
                }
                case 12: {
                    n14 = 120;
                    break;
                }
                case 13: {
                    n14 = 185;
                    break;
                }
                case 14: {
                    n14 = 154;
                    break;
                }
                case 15: {
                    n14 = 6;
                    break;
                }
                case 16: {
                    n14 = 119;
                    break;
                }
                case 17: {
                    n14 = 245;
                    break;
                }
                case 18: {
                    n14 = 208;
                    break;
                }
                case 19: {
                    n14 = 216;
                    break;
                }
                case 20: {
                    n14 = 142;
                    break;
                }
                case 21: {
                    n14 = 241;
                    break;
                }
                case 22: {
                    n14 = 11;
                    break;
                }
                case 23: {
                    n14 = 76;
                    break;
                }
                case 24: {
                    n14 = 243;
                    break;
                }
                case 25: {
                    n14 = 90;
                    break;
                }
                case 26: {
                    n14 = 175;
                    break;
                }
                case 27: {
                    n14 = 197;
                    break;
                }
                case 28: {
                    n14 = 200;
                    break;
                }
                case 29: {
                    n14 = 207;
                    break;
                }
                case 30: {
                    n14 = 249;
                    break;
                }
                case 31: {
                    n14 = 145;
                    break;
                }
                case 32: {
                    n14 = 172;
                    break;
                }
                case 33: {
                    n14 = 40;
                    break;
                }
                case 34: {
                    n14 = 217;
                    break;
                }
                case 35: {
                    n14 = 139;
                    break;
                }
                case 36: {
                    n14 = 191;
                    break;
                }
                case 37: {
                    n14 = 101;
                    break;
                }
                case 38: {
                    n14 = 106;
                    break;
                }
                case 39: {
                    n14 = 35;
                    break;
                }
                case 40: {
                    n14 = 253;
                    break;
                }
                case 41: {
                    n14 = 198;
                    break;
                }
                case 42: {
                    n14 = 125;
                    break;
                }
                case 43: {
                    n14 = 202;
                    break;
                }
                case 44: {
                    n14 = 97;
                    break;
                }
                case 45: {
                    n14 = 10;
                    break;
                }
                case 46: {
                    n14 = 0;
                    break;
                }
                case 47: {
                    n14 = 32;
                    break;
                }
                case 48: {
                    n14 = 52;
                    break;
                }
                case 49: {
                    n14 = 178;
                    break;
                }
                case 50: {
                    n14 = 141;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 153;
                    break;
                }
                case 53: {
                    n14 = 221;
                    break;
                }
                case 54: {
                    n14 = 48;
                    break;
                }
                case 55: {
                    n14 = 68;
                    break;
                }
                case 56: {
                    n14 = 194;
                    break;
                }
                case 57: {
                    n14 = 143;
                    break;
                }
                case 58: {
                    n14 = 138;
                    break;
                }
                case 59: {
                    n14 = 47;
                    break;
                }
                case 60: {
                    n14 = 109;
                    break;
                }
                case 61: {
                    n14 = 171;
                    break;
                }
                case 62: {
                    n14 = 91;
                    break;
                }
                case 63: {
                    n14 = 214;
                    break;
                }
                case 64: {
                    n14 = 114;
                    break;
                }
                case 65: {
                    n14 = 193;
                    break;
                }
                case 66: {
                    n14 = 102;
                    break;
                }
                case 67: {
                    n14 = 186;
                    break;
                }
                case 68: {
                    n14 = 167;
                    break;
                }
                case 69: {
                    n14 = 117;
                    break;
                }
                case 70: {
                    n14 = 239;
                    break;
                }
                case 71: {
                    n14 = 43;
                    break;
                }
                case 72: {
                    n14 = 45;
                    break;
                }
                case 73: {
                    n14 = 176;
                    break;
                }
                case 74: {
                    n14 = 147;
                    break;
                }
                case 75: {
                    n14 = 85;
                    break;
                }
                case 76: {
                    n14 = 179;
                    break;
                }
                case 77: {
                    n14 = 94;
                    break;
                }
                case 78: {
                    n14 = 170;
                    break;
                }
                case 79: {
                    n14 = 110;
                    break;
                }
                case 80: {
                    n14 = 62;
                    break;
                }
                case 81: {
                    n14 = 192;
                    break;
                }
                case 82: {
                    n14 = 238;
                    break;
                }
                case 83: {
                    n14 = 55;
                    break;
                }
                case 84: {
                    n14 = 159;
                    break;
                }
                case 85: {
                    n14 = 96;
                    break;
                }
                case 86: {
                    n14 = 39;
                    break;
                }
                case 87: {
                    n14 = 228;
                    break;
                }
                case 88: {
                    n14 = 233;
                    break;
                }
                case 89: {
                    n14 = 222;
                    break;
                }
                case 90: {
                    n14 = 123;
                    break;
                }
                case 91: {
                    n14 = 181;
                    break;
                }
                case 92: {
                    n14 = 150;
                    break;
                }
                case 93: {
                    n14 = 88;
                    break;
                }
                case 94: {
                    n14 = 157;
                    break;
                }
                case 95: {
                    n14 = 205;
                    break;
                }
                case 96: {
                    n14 = 12;
                    break;
                }
                case 97: {
                    n14 = 246;
                    break;
                }
                case 98: {
                    n14 = 80;
                    break;
                }
                case 99: {
                    n14 = 4;
                    break;
                }
                case 100: {
                    n14 = 66;
                    break;
                }
                case 101: {
                    n14 = 242;
                    break;
                }
                case 102: {
                    n14 = 235;
                    break;
                }
                case 103: {
                    n14 = 65;
                    break;
                }
                case 104: {
                    n14 = 156;
                    break;
                }
                case 105: {
                    n14 = 247;
                    break;
                }
                case 106: {
                    n14 = 86;
                    break;
                }
                case 107: {
                    n14 = 209;
                    break;
                }
                case 108: {
                    n14 = 18;
                    break;
                }
                case 109: {
                    n14 = 224;
                    break;
                }
                case 110: {
                    n14 = 254;
                    break;
                }
                case 111: {
                    n14 = 152;
                    break;
                }
                case 112: {
                    n14 = 116;
                    break;
                }
                case 113: {
                    n14 = 51;
                    break;
                }
                case 114: {
                    n14 = 165;
                    break;
                }
                case 115: {
                    n14 = 126;
                    break;
                }
                case 116: {
                    n14 = 41;
                    break;
                }
                case 117: {
                    n14 = 5;
                    break;
                }
                case 118: {
                    n14 = 196;
                    break;
                }
                case 119: {
                    n14 = 163;
                    break;
                }
                case 120: {
                    n14 = 128;
                    break;
                }
                case 121: {
                    n14 = 211;
                    break;
                }
                case 122: {
                    n14 = 13;
                    break;
                }
                case 123: {
                    n14 = 103;
                    break;
                }
                case 124: {
                    n14 = 158;
                    break;
                }
                case 125: {
                    n14 = 34;
                    break;
                }
                case 126: {
                    n14 = 23;
                    break;
                }
                case 127: {
                    n14 = 204;
                    break;
                }
                case 128: {
                    n14 = 180;
                    break;
                }
                case 129: {
                    n14 = 20;
                    break;
                }
                case 130: {
                    n14 = 173;
                    break;
                }
                case 131: {
                    n14 = 61;
                    break;
                }
                case 132: {
                    n14 = 149;
                    break;
                }
                case 133: {
                    n14 = 226;
                    break;
                }
                case 134: {
                    n14 = 63;
                    break;
                }
                case 135: {
                    n14 = 69;
                    break;
                }
                case 136: {
                    n14 = 104;
                    break;
                }
                case 137: {
                    n14 = 24;
                    break;
                }
                case 138: {
                    n14 = 3;
                    break;
                }
                case 139: {
                    n14 = 14;
                    break;
                }
                case 140: {
                    n14 = 127;
                    break;
                }
                case 141: {
                    n14 = 83;
                    break;
                }
                case 142: {
                    n14 = 189;
                    break;
                }
                case 143: {
                    n14 = 237;
                    break;
                }
                case 144: {
                    n14 = 131;
                    break;
                }
                case 145: {
                    n14 = 19;
                    break;
                }
                case 146: {
                    n14 = 27;
                    break;
                }
                case 147: {
                    n14 = 248;
                    break;
                }
                case 148: {
                    n14 = 30;
                    break;
                }
                case 149: {
                    n14 = 113;
                    break;
                }
                case 150: {
                    n14 = 223;
                    break;
                }
                case 151: {
                    n14 = 81;
                    break;
                }
                case 152: {
                    n14 = 92;
                    break;
                }
                case 153: {
                    n14 = 227;
                    break;
                }
                case 154: {
                    n14 = 164;
                    break;
                }
                case 155: {
                    n14 = 187;
                    break;
                }
                case 156: {
                    n14 = 230;
                    break;
                }
                case 157: {
                    n14 = 174;
                    break;
                }
                case 158: {
                    n14 = 219;
                    break;
                }
                case 159: {
                    n14 = 220;
                    break;
                }
                case 160: {
                    n14 = 72;
                    break;
                }
                case 161: {
                    n14 = 199;
                    break;
                }
                case 162: {
                    n14 = 22;
                    break;
                }
                case 163: {
                    n14 = 250;
                    break;
                }
                case 164: {
                    n14 = 148;
                    break;
                }
                case 165: {
                    n14 = 136;
                    break;
                }
                case 166: {
                    n14 = 111;
                    break;
                }
                case 167: {
                    n14 = 255;
                    break;
                }
                case 168: {
                    n14 = 177;
                    break;
                }
                case 169: {
                    n14 = 140;
                    break;
                }
                case 170: {
                    n14 = 121;
                    break;
                }
                case 171: {
                    n14 = 206;
                    break;
                }
                case 172: {
                    n14 = 229;
                    break;
                }
                case 173: {
                    n14 = 169;
                    break;
                }
                case 174: {
                    n14 = 155;
                    break;
                }
                case 175: {
                    n14 = 133;
                    break;
                }
                case 176: {
                    n14 = 132;
                    break;
                }
                case 177: {
                    n14 = 28;
                    break;
                }
                case 178: {
                    n14 = 151;
                    break;
                }
                case 179: {
                    n14 = 16;
                    break;
                }
                case 180: {
                    n14 = 95;
                    break;
                }
                case 181: {
                    n14 = 168;
                    break;
                }
                case 182: {
                    n14 = 78;
                    break;
                }
                case 183: {
                    n14 = 64;
                    break;
                }
                case 184: {
                    n14 = 1;
                    break;
                }
                case 185: {
                    n14 = 26;
                    break;
                }
                case 186: {
                    n14 = 58;
                    break;
                }
                case 187: {
                    n14 = 240;
                    break;
                }
                case 188: {
                    n14 = 251;
                    break;
                }
                case 189: {
                    n14 = 124;
                    break;
                }
                case 190: {
                    n14 = 8;
                    break;
                }
                case 191: {
                    n14 = 201;
                    break;
                }
                case 192: {
                    n14 = 203;
                    break;
                }
                case 193: {
                    n14 = 162;
                    break;
                }
                case 194: {
                    n14 = 25;
                    break;
                }
                case 195: {
                    n14 = 36;
                    break;
                }
                case 196: {
                    n14 = 115;
                    break;
                }
                case 197: {
                    n14 = 184;
                    break;
                }
                case 198: {
                    n14 = 244;
                    break;
                }
                case 199: {
                    n14 = 215;
                    break;
                }
                case 200: {
                    n14 = 84;
                    break;
                }
                case 201: {
                    n14 = 122;
                    break;
                }
                case 202: {
                    n14 = 137;
                    break;
                }
                case 203: {
                    n14 = 42;
                    break;
                }
                case 204: {
                    n14 = 225;
                    break;
                }
                case 205: {
                    n14 = 218;
                    break;
                }
                case 206: {
                    n14 = 108;
                    break;
                }
                case 207: {
                    n14 = 49;
                    break;
                }
                case 208: {
                    n14 = 7;
                    break;
                }
                case 209: {
                    n14 = 2;
                    break;
                }
                case 210: {
                    n14 = 87;
                    break;
                }
                case 211: {
                    n14 = 33;
                    break;
                }
                case 212: {
                    n14 = 31;
                    break;
                }
                case 213: {
                    n14 = 134;
                    break;
                }
                case 214: {
                    n14 = 161;
                    break;
                }
                case 215: {
                    n14 = 17;
                    break;
                }
                case 216: {
                    n14 = 98;
                    break;
                }
                case 217: {
                    n14 = 71;
                    break;
                }
                case 218: {
                    n14 = 53;
                    break;
                }
                case 219: {
                    n14 = 144;
                    break;
                }
                case 220: {
                    n14 = 107;
                    break;
                }
                case 221: {
                    n14 = 56;
                    break;
                }
                case 222: {
                    n14 = 9;
                    break;
                }
                case 223: {
                    n14 = 112;
                    break;
                }
                case 224: {
                    n14 = 190;
                    break;
                }
                case 225: {
                    n14 = 146;
                    break;
                }
                case 226: {
                    n14 = 212;
                    break;
                }
                case 227: {
                    n14 = 89;
                    break;
                }
                case 228: {
                    n14 = 74;
                    break;
                }
                case 229: {
                    n14 = 73;
                    break;
                }
                case 230: {
                    n14 = 129;
                    break;
                }
                case 231: {
                    n14 = 82;
                    break;
                }
                case 232: {
                    n14 = 183;
                    break;
                }
                case 233: {
                    n14 = 231;
                    break;
                }
                case 234: {
                    n14 = 75;
                    break;
                }
                case 235: {
                    n14 = 37;
                    break;
                }
                case 236: {
                    n14 = 105;
                    break;
                }
                case 237: {
                    n14 = 57;
                    break;
                }
                case 238: {
                    n14 = 77;
                    break;
                }
                case 239: {
                    n14 = 135;
                    break;
                }
                case 240: {
                    n14 = 54;
                    break;
                }
                case 241: {
                    n14 = 79;
                    break;
                }
                case 242: {
                    n14 = 46;
                    break;
                }
                case 243: {
                    n14 = 182;
                    break;
                }
                case 244: {
                    n14 = 213;
                    break;
                }
                case 245: {
                    n14 = 195;
                    break;
                }
                case 246: {
                    n14 = 234;
                    break;
                }
                case 247: {
                    n14 = 236;
                    break;
                }
                case 248: {
                    n14 = 232;
                    break;
                }
                case 249: {
                    n14 = 210;
                    break;
                }
                case 250: {
                    n14 = 50;
                    break;
                }
                case 251: {
                    n14 = 160;
                    break;
                }
                case 252: {
                    n14 = 38;
                    break;
                }
                case 253: {
                    n14 = 59;
                    break;
                }
                case 254: {
                    n14 = 29;
                    break;
                }
                default: {
                    n14 = 130;
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
            QH.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xECA;
        if (l[n11] == null) {
            QH.l[n11] = (int)(i[n11] ^ l2);
        }
        return l[n11];
    }
}

