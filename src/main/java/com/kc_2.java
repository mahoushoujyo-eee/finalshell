/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EF;
import com.EV;
import com.FN;
import com.GA;
import com.GO;
import com.RV;
import com.aL;
import com.au_0;
import com.b.V;
import com.cz_0;
import com.eg_0;
import com.i2_0;
import com.k0_0;
import com.ky_2;
import com.kz_2;
import com.ld_2;
import com.lk_0;
import com.lx_1;
import com.rg_2;
import com.ts_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Stroke;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.kc
 */
public class kc_2
extends ky_2
implements au_0 {
    public static final ImageIcon x;
    protected static final BasicStroke R;
    protected int k = GO.Fx;
    protected int C = kc_2.a(19829, 4603493099291900748L);
    protected Color P = new Color(kc_2.a(22771, 2767082641087590088L), kc_2.a(5640, 8817336692447551536L), kc_2.a(5640, 8817336692447551536L));
    protected Color K = new Color(kc_2.a(16443, 4004741338188936708L), kc_2.a(30220, 2937408803649830962L), kc_2.a(30220, 2937408803649830962L));
    protected final List J = new ArrayList(1);
    protected boolean i = true;
    protected boolean l = false;
    protected boolean M = false;
    protected int t = kc_2.a(4663, 8095145250011128845L);
    protected boolean e = true;
    protected boolean Y = false;
    protected V O = null;
    protected boolean N = true;
    protected float q = 1.0f;
    protected String W = null;
    protected List m = new ArrayList();
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public kc_2() {
        super(kc_2.b(8703, -14547), (LayoutManager)new ts_0(true));
        this.setFont(FN.V().deriveFont(1).deriveFont(20.0f));
        this.W(true);
        this.setTransferHandler(new eg_0(this));
        this.addMouseListener(new rg_2(this));
        this.Q(new EF(this));
    }

    public boolean H() {
        return this.N;
    }

    public void y(boolean bl) {
        this.N = bl;
        this.repaint();
    }

    public boolean y() {
        return this.M;
    }

    public void z(boolean bl) {
        this.M = bl;
    }

    public int X() {
        return this.t;
    }

    public void y(int n10) {
        this.t = n10;
    }

    public boolean T() {
        return this.e;
    }

    public void Q(boolean bl) {
        this.e = bl;
    }

    public List O() {
        return aL.J((Collection)this.m);
    }

    public void b(List list) {
        this.z();
        this.g(list);
    }

    /*
     * Exception decompiling
     */
    public void g(List var1_1) {
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
    public void c(File[] var1_1) {
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

    public void E(File file) {
        block3: {
            kc_2 kc_22;
            block2: {
                String string = kz_2.M();
                kc_22 = this;
                if (string == null) break block2;
                if (!kc_22.F(file)) break block3;
                this.revalidate();
                kc_22 = this;
            }
            kc_22.n();
        }
    }

    protected boolean F(File file) {
        boolean bl;
        block4: {
            block5: {
                boolean bl2;
                block6: {
                    block7: {
                        kc_2 kc_22;
                        String string;
                        block2: {
                            block3: {
                                string = kz_2.M();
                                kc_22 = this;
                                if (string == null) break block2;
                                if (kc_22.O == null) break block3;
                                bl = this.O.accept(file);
                                if (string == null) break block4;
                                if (!bl) break block5;
                            }
                            kc_22 = this;
                        }
                        bl2 = kc_22.Y;
                        if (string == null) break block6;
                        if (bl2) break block7;
                        bl = cz_0.y(this.m, file);
                        if (string == null) break block4;
                        if (bl) break block5;
                    }
                    this.add(this.R(file));
                    this.m.add(file);
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    public void z() {
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
    public void H(List var1_1) {
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
    public void C(File[] var1_1) {
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

    public void S(File file) {
        block3: {
            kc_2 kc_22;
            block2: {
                String string = kz_2.M();
                kc_22 = this;
                if (string == null) break block2;
                if (!kc_22.R(file, true)) break block3;
                this.revalidate();
                kc_22 = this;
            }
            kc_22.n();
        }
    }

    protected boolean R(File file, boolean bl) {
        boolean bl2;
        block6: {
            block7: {
                boolean bl3;
                String string;
                block5: {
                    string = kz_2.M();
                    bl2 = cz_0.y(this.m, file);
                    if (string == null) break block6;
                    if (!bl2) break block7;
                    for (k0_0 k0_02 : this.K(file)) {
                        block8: {
                            block9: {
                                bl3 = bl;
                                if (string == null) break block5;
                                if (string == null) break block8;
                                if (!bl3) break block9;
                                k0_02.P();
                                if (string != null) break block8;
                            }
                            this.remove(k0_02);
                            this.m.remove(file);
                        }
                        if (string != null) continue;
                    }
                    bl3 = bl;
                }
                if (string != null) {
                    bl3 = !bl3;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public List K(File file) {
        ArrayList<k0_0> arrayList = new ArrayList<k0_0>(1);
        int n10 = 0;
        String string = kz_2.M();
        while (n10 < this.getComponentCount()) {
            block5: {
                block6: {
                    Component component = this.getComponent(n10);
                    if (string == null) break block5;
                    if (!(component instanceof k0_0)) break block6;
                    k0_0 k0_02 = (k0_0)component;
                    if (string == null) break block5;
                    if (file.getAbsolutePath().equals(k0_02.y().getAbsolutePath())) {
                        arrayList.add(k0_02);
                    }
                }
                ++n10;
            }
            if (string != null) continue;
        }
        return arrayList;
    }

    public boolean M() {
        return this.Y;
    }

    public void U(boolean bl) {
        this.Y = bl;
        this.b(this.m);
    }

    public V B() {
        return this.O;
    }

    public void r(V v2) {
        this.O = v2;
        this.b(this.m);
    }

    public boolean d() {
        return this.i;
    }

    public void k(boolean bl) {
        this.i = bl;
        String string = kz_2.M();
        for (int i2 = 0; i2 < this.getComponentCount(); ++i2) {
            ((k0_0)this.getComponent(i2)).b(bl);
            if (string != null) continue;
        }
    }

    public boolean Y() {
        return this.l;
    }

    public void x(boolean bl) {
        this.l = bl;
        String string = kz_2.M();
        for (int i2 = 0; i2 < this.getComponentCount(); ++i2) {
            ((k0_0)this.getComponent(i2)).V(bl);
            if (string != null) continue;
        }
    }

    public Color y() {
        return this.P;
    }

    public void R(Color color) {
        this.P = color;
        this.repaint();
    }

    public Color K() {
        return this.K;
    }

    public void C(Color color) {
        this.K = color;
        this.repaint();
    }

    public int C() {
        return this.k;
    }

    public void a(int n10) {
        this.k = n10;
        this.repaint();
    }

    public int u() {
        return this.C;
    }

    public void n(int n10) {
        this.C = n10;
        this.repaint();
    }

    public String m() {
        return this.W;
    }

    public void z(String string) {
        this.W = string;
        this.repaint();
    }

    public void W(boolean bl) {
        block4: {
            block3: {
                String string;
                block2: {
                    string = kz_2.M();
                    if (string == null) break block2;
                    if (!bl) break block3;
                    this.u(kc_2.b(8700, 15809), new Object[0]);
                }
                if (string != null) break block4;
            }
            this.M();
        }
        this.repaint();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean G() {
        String string = kz_2.M();
        kc_2 kc_22 = this;
        if (string != null) {
            if (kc_22.W == null) return 0 != 0;
            kc_22 = this;
        }
        int n10 = kc_22.N;
        if (string != null) {
            if (n10 == 0) return 0 != 0;
            float f10 = this.q - 0.0f;
            n10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        }
        if (string == null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        return 1 != 0;
    }

    protected k0_0 R(File file) {
        k0_0 k0_02 = new k0_0(file);
        k0_02.V(this.l);
        this.addMouseListener(new lx_1(this));
        k0_02.y(new lk_0(this, file));
        return k0_02;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block4: {
            Composite composite;
            Graphics2D graphics2D;
            block6: {
                int n10;
                int n11;
                FontMetrics fontMetrics;
                int n12;
                int n13;
                int n14;
                int n15;
                block5: {
                    String string = kz_2.M();
                    super.paintComponent(graphics);
                    String string2 = string;
                    if (!this.G()) break block4;
                    graphics2D = (Graphics2D)graphics;
                    composite = RV.p(graphics2D, Float.valueOf(this.q));
                    Object object = RV.X(graphics2D);
                    Insets insets = this.getInsets();
                    int n16 = Math.round(R.getLineWidth() / 2.0f);
                    int n17 = Math.round(R.getLineWidth());
                    n15 = this.C + insets.left;
                    n14 = this.C + insets.top;
                    n13 = this.getWidth() - this.C * 2 - insets.left - insets.right;
                    n12 = this.getHeight() - this.C * 2 - insets.top - insets.bottom;
                    graphics2D.setPaint(this.P);
                    graphics2D.fillRoundRect(n15 + n16, n14 + n16, n13 - n17, n12 - n17, this.k * 2, this.k * 2);
                    Stroke stroke = RV.M(graphics2D, R);
                    graphics2D.setPaint(this.K);
                    graphics2D.drawRoundRect(n15, n14, n13, n12, this.k * 2, this.k * 2);
                    RV.p(graphics2D, stroke);
                    RV.X(graphics2D, object);
                    fontMetrics = graphics2D.getFontMetrics();
                    n11 = n13;
                    n10 = fontMetrics.stringWidth(this.W);
                    if (string2 == null) break block5;
                    if (n11 < n10) break block6;
                    n11 = n12;
                    n10 = fontMetrics.getHeight();
                }
                if (n11 > n10) {
                    Map map = FN.Y(graphics2D);
                    Point point = GA.A(fontMetrics, this.W);
                    graphics2D.drawString(this.W, n15 + n13 / 2 + point.x, n14 + n12 / 2 + point.y);
                    FN.k(graphics2D, map);
                }
            }
            RV.c(graphics2D, composite);
        }
    }

    public void Q(EV eV) {
        this.J.add(eV);
    }

    public void l(EV eV) {
        this.J.remove(eV);
    }

    protected void n() {
        Iterator iterator = aL.J((Collection)this.J).iterator();
        String string = kz_2.M();
        while (iterator.hasNext()) {
            EV eV = (EV)iterator.next();
            eV.Y(aL.J((Collection)this.m));
            if (string != null) continue;
        }
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this, string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this, objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this, string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this);
    }

    @Override
    public boolean k() {
        return i2_0.Z(this);
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this, ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "Qy\u00f4\u00bb\u00cc\u00e5\u0010\u00de\u0098a\u0017\u00bc\u0091\u00e5\u00f1\u0017:\u00c5I\u00e8\u00c5\u0084,\u0085\u00ec\u00a2yu\u00f7x\u00a1NFp\u00c7\n\u0096\u001cd\t\u00c6\u00d2\u00eb\u008e\u0012bO\u0011_";
                    var12_3 = "Qy\u00f4\u00bb\u00cc\u00e5\u0010\u00de\u0098a\u0017\u00bc\u0091\u00e5\u00f1\u0017:\u00c5I\u00e8\u00c5\u0084,\u0085\u00ec\u00a2yu\u00f7x\u00a1NFp\u00c7\n\u0096\u001cd\t\u00c6\u00d2\u00eb\u008e\u0012bO\u0011_".length();
                    var9_4 = 15;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 19;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 71;
                                    break;
                                }
                                case 1: {
                                    v11 = 38;
                                    break;
                                }
                                case 2: {
                                    v11 = 108;
                                    break;
                                }
                                case 3: {
                                    v11 = 64;
                                    break;
                                }
                                case 4: {
                                    v11 = 95;
                                    break;
                                }
                                case 5: {
                                    v11 = 103;
                                    break;
                                }
                                default: {
                                    v11 = 109;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                kc_2.a = var13;
                kc_2.b = new String[3];
                var0_7 = 1333366873389657049L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u00f7\u00db5B\u0005\u0085\u0005\u00e3\u0093\u00c7\u00f9\u00d2S\u00b3O\u00d6i\u00a77\u0091\u0006\u00e8\u0090\u009f\u00ce\u0086\u0088\u00c61\u00f3K\u001b";
                var5_11 = "\u00f7\u00db5B\u0005\u0085\u0005\u00e3\u0093\u00c7\u00f9\u00d2S\u00b3O\u00d6i\u00a77\u0091\u0006\u00e8\u0090\u009f\u00ce\u0086\u0088\u00c61\u00f3K\u001b".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0019\u001b\u000bR+\u00bb\u001d\u001d\u00bdo\u00cdd6\u000e\u00ab+";
                    var5_11 = "\u0019\u001b\u000bR+\u00bb\u001d\u001d\u00bdo\u00cdd6\u000e\u00ab+".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        kc_2.c = var6_8;
        kc_2.d = new Integer[6];
        kc_2.x = new ImageIcon(kc_2.class.getResource(kc_2.b(8701, 17537)));
        kc_2.R = new BasicStroke(3.0f, 1, 1, 1.0f, new float[]{8.0f, 8.0f}, 0.0f);
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x21FD) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 84;
                    break;
                }
                case 1: {
                    n14 = 91;
                    break;
                }
                case 2: {
                    n14 = 104;
                    break;
                }
                case 3: {
                    n14 = 72;
                    break;
                }
                case 4: {
                    n14 = 162;
                    break;
                }
                case 5: {
                    n14 = 21;
                    break;
                }
                case 6: {
                    n14 = 109;
                    break;
                }
                case 7: {
                    n14 = 178;
                    break;
                }
                case 8: {
                    n14 = 36;
                    break;
                }
                case 9: {
                    n14 = 134;
                    break;
                }
                case 10: {
                    n14 = 244;
                    break;
                }
                case 11: {
                    n14 = 129;
                    break;
                }
                case 12: {
                    n14 = 125;
                    break;
                }
                case 13: {
                    n14 = 60;
                    break;
                }
                case 14: {
                    n14 = 49;
                    break;
                }
                case 15: {
                    n14 = 250;
                    break;
                }
                case 16: {
                    n14 = 141;
                    break;
                }
                case 17: {
                    n14 = 149;
                    break;
                }
                case 18: {
                    n14 = 55;
                    break;
                }
                case 19: {
                    n14 = 153;
                    break;
                }
                case 20: {
                    n14 = 22;
                    break;
                }
                case 21: {
                    n14 = 3;
                    break;
                }
                case 22: {
                    n14 = 32;
                    break;
                }
                case 23: {
                    n14 = 112;
                    break;
                }
                case 24: {
                    n14 = 123;
                    break;
                }
                case 25: {
                    n14 = 160;
                    break;
                }
                case 26: {
                    n14 = 138;
                    break;
                }
                case 27: {
                    n14 = 71;
                    break;
                }
                case 28: {
                    n14 = 197;
                    break;
                }
                case 29: {
                    n14 = 77;
                    break;
                }
                case 30: {
                    n14 = 204;
                    break;
                }
                case 31: {
                    n14 = 154;
                    break;
                }
                case 32: {
                    n14 = 214;
                    break;
                }
                case 33: {
                    n14 = 124;
                    break;
                }
                case 34: {
                    n14 = 64;
                    break;
                }
                case 35: {
                    n14 = 226;
                    break;
                }
                case 36: {
                    n14 = 212;
                    break;
                }
                case 37: {
                    n14 = 215;
                    break;
                }
                case 38: {
                    n14 = 61;
                    break;
                }
                case 39: {
                    n14 = 66;
                    break;
                }
                case 40: {
                    n14 = 10;
                    break;
                }
                case 41: {
                    n14 = 63;
                    break;
                }
                case 42: {
                    n14 = 38;
                    break;
                }
                case 43: {
                    n14 = 127;
                    break;
                }
                case 44: {
                    n14 = 230;
                    break;
                }
                case 45: {
                    n14 = 19;
                    break;
                }
                case 46: {
                    n14 = 159;
                    break;
                }
                case 47: {
                    n14 = 133;
                    break;
                }
                case 48: {
                    n14 = 201;
                    break;
                }
                case 49: {
                    n14 = 164;
                    break;
                }
                case 50: {
                    n14 = 176;
                    break;
                }
                case 51: {
                    n14 = 221;
                    break;
                }
                case 52: {
                    n14 = 144;
                    break;
                }
                case 53: {
                    n14 = 170;
                    break;
                }
                case 54: {
                    n14 = 27;
                    break;
                }
                case 55: {
                    n14 = 210;
                    break;
                }
                case 56: {
                    n14 = 135;
                    break;
                }
                case 57: {
                    n14 = 217;
                    break;
                }
                case 58: {
                    n14 = 238;
                    break;
                }
                case 59: {
                    n14 = 65;
                    break;
                }
                case 60: {
                    n14 = 116;
                    break;
                }
                case 61: {
                    n14 = 188;
                    break;
                }
                case 62: {
                    n14 = 62;
                    break;
                }
                case 63: {
                    n14 = 73;
                    break;
                }
                case 64: {
                    n14 = 240;
                    break;
                }
                case 65: {
                    n14 = 177;
                    break;
                }
                case 66: {
                    n14 = 29;
                    break;
                }
                case 67: {
                    n14 = 140;
                    break;
                }
                case 68: {
                    n14 = 41;
                    break;
                }
                case 69: {
                    n14 = 207;
                    break;
                }
                case 70: {
                    n14 = 235;
                    break;
                }
                case 71: {
                    n14 = 4;
                    break;
                }
                case 72: {
                    n14 = 139;
                    break;
                }
                case 73: {
                    n14 = 157;
                    break;
                }
                case 74: {
                    n14 = 184;
                    break;
                }
                case 75: {
                    n14 = 92;
                    break;
                }
                case 76: {
                    n14 = 195;
                    break;
                }
                case 77: {
                    n14 = 86;
                    break;
                }
                case 78: {
                    n14 = 94;
                    break;
                }
                case 79: {
                    n14 = 11;
                    break;
                }
                case 80: {
                    n14 = 251;
                    break;
                }
                case 81: {
                    n14 = 83;
                    break;
                }
                case 82: {
                    n14 = 81;
                    break;
                }
                case 83: {
                    n14 = 28;
                    break;
                }
                case 84: {
                    n14 = 31;
                    break;
                }
                case 85: {
                    n14 = 98;
                    break;
                }
                case 86: {
                    n14 = 80;
                    break;
                }
                case 87: {
                    n14 = 146;
                    break;
                }
                case 88: {
                    n14 = 169;
                    break;
                }
                case 89: {
                    n14 = 25;
                    break;
                }
                case 90: {
                    n14 = 253;
                    break;
                }
                case 91: {
                    n14 = 192;
                    break;
                }
                case 92: {
                    n14 = 132;
                    break;
                }
                case 93: {
                    n14 = 110;
                    break;
                }
                case 94: {
                    n14 = 229;
                    break;
                }
                case 95: {
                    n14 = 76;
                    break;
                }
                case 96: {
                    n14 = 252;
                    break;
                }
                case 97: {
                    n14 = 148;
                    break;
                }
                case 98: {
                    n14 = 44;
                    break;
                }
                case 99: {
                    n14 = 53;
                    break;
                }
                case 100: {
                    n14 = 228;
                    break;
                }
                case 101: {
                    n14 = 190;
                    break;
                }
                case 102: {
                    n14 = 23;
                    break;
                }
                case 103: {
                    n14 = 189;
                    break;
                }
                case 104: {
                    n14 = 121;
                    break;
                }
                case 105: {
                    n14 = 227;
                    break;
                }
                case 106: {
                    n14 = 5;
                    break;
                }
                case 107: {
                    n14 = 14;
                    break;
                }
                case 108: {
                    n14 = 220;
                    break;
                }
                case 109: {
                    n14 = 248;
                    break;
                }
                case 110: {
                    n14 = 168;
                    break;
                }
                case 111: {
                    n14 = 142;
                    break;
                }
                case 112: {
                    n14 = 246;
                    break;
                }
                case 113: {
                    n14 = 171;
                    break;
                }
                case 114: {
                    n14 = 172;
                    break;
                }
                case 115: {
                    n14 = 74;
                    break;
                }
                case 116: {
                    n14 = 182;
                    break;
                }
                case 117: {
                    n14 = 107;
                    break;
                }
                case 118: {
                    n14 = 186;
                    break;
                }
                case 119: {
                    n14 = 68;
                    break;
                }
                case 120: {
                    n14 = 193;
                    break;
                }
                case 121: {
                    n14 = 205;
                    break;
                }
                case 122: {
                    n14 = 37;
                    break;
                }
                case 123: {
                    n14 = 147;
                    break;
                }
                case 124: {
                    n14 = 247;
                    break;
                }
                case 125: {
                    n14 = 118;
                    break;
                }
                case 126: {
                    n14 = 224;
                    break;
                }
                case 127: {
                    n14 = 183;
                    break;
                }
                case 128: {
                    n14 = 35;
                    break;
                }
                case 129: {
                    n14 = 17;
                    break;
                }
                case 130: {
                    n14 = 225;
                    break;
                }
                case 131: {
                    n14 = 113;
                    break;
                }
                case 132: {
                    n14 = 185;
                    break;
                }
                case 133: {
                    n14 = 0;
                    break;
                }
                case 134: {
                    n14 = 40;
                    break;
                }
                case 135: {
                    n14 = 102;
                    break;
                }
                case 136: {
                    n14 = 255;
                    break;
                }
                case 137: {
                    n14 = 82;
                    break;
                }
                case 138: {
                    n14 = 198;
                    break;
                }
                case 139: {
                    n14 = 223;
                    break;
                }
                case 140: {
                    n14 = 34;
                    break;
                }
                case 141: {
                    n14 = 95;
                    break;
                }
                case 142: {
                    n14 = 199;
                    break;
                }
                case 143: {
                    n14 = 143;
                    break;
                }
                case 144: {
                    n14 = 101;
                    break;
                }
                case 145: {
                    n14 = 145;
                    break;
                }
                case 146: {
                    n14 = 57;
                    break;
                }
                case 147: {
                    n14 = 7;
                    break;
                }
                case 148: {
                    n14 = 51;
                    break;
                }
                case 149: {
                    n14 = 202;
                    break;
                }
                case 150: {
                    n14 = 103;
                    break;
                }
                case 151: {
                    n14 = 59;
                    break;
                }
                case 152: {
                    n14 = 187;
                    break;
                }
                case 153: {
                    n14 = 181;
                    break;
                }
                case 154: {
                    n14 = 75;
                    break;
                }
                case 155: {
                    n14 = 119;
                    break;
                }
                case 156: {
                    n14 = 208;
                    break;
                }
                case 157: {
                    n14 = 239;
                    break;
                }
                case 158: {
                    n14 = 234;
                    break;
                }
                case 159: {
                    n14 = 128;
                    break;
                }
                case 160: {
                    n14 = 88;
                    break;
                }
                case 161: {
                    n14 = 115;
                    break;
                }
                case 162: {
                    n14 = 167;
                    break;
                }
                case 163: {
                    n14 = 89;
                    break;
                }
                case 164: {
                    n14 = 46;
                    break;
                }
                case 165: {
                    n14 = 236;
                    break;
                }
                case 166: {
                    n14 = 117;
                    break;
                }
                case 167: {
                    n14 = 105;
                    break;
                }
                case 168: {
                    n14 = 232;
                    break;
                }
                case 169: {
                    n14 = 20;
                    break;
                }
                case 170: {
                    n14 = 213;
                    break;
                }
                case 171: {
                    n14 = 222;
                    break;
                }
                case 172: {
                    n14 = 16;
                    break;
                }
                case 173: {
                    n14 = 97;
                    break;
                }
                case 174: {
                    n14 = 111;
                    break;
                }
                case 175: {
                    n14 = 242;
                    break;
                }
                case 176: {
                    n14 = 106;
                    break;
                }
                case 177: {
                    n14 = 78;
                    break;
                }
                case 178: {
                    n14 = 126;
                    break;
                }
                case 179: {
                    n14 = 156;
                    break;
                }
                case 180: {
                    n14 = 196;
                    break;
                }
                case 181: {
                    n14 = 67;
                    break;
                }
                case 182: {
                    n14 = 180;
                    break;
                }
                case 183: {
                    n14 = 47;
                    break;
                }
                case 184: {
                    n14 = 99;
                    break;
                }
                case 185: {
                    n14 = 24;
                    break;
                }
                case 186: {
                    n14 = 241;
                    break;
                }
                case 187: {
                    n14 = 9;
                    break;
                }
                case 188: {
                    n14 = 18;
                    break;
                }
                case 189: {
                    n14 = 137;
                    break;
                }
                case 190: {
                    n14 = 12;
                    break;
                }
                case 191: {
                    n14 = 108;
                    break;
                }
                case 192: {
                    n14 = 216;
                    break;
                }
                case 193: {
                    n14 = 211;
                    break;
                }
                case 194: {
                    n14 = 191;
                    break;
                }
                case 195: {
                    n14 = 56;
                    break;
                }
                case 196: {
                    n14 = 54;
                    break;
                }
                case 197: {
                    n14 = 173;
                    break;
                }
                case 198: {
                    n14 = 70;
                    break;
                }
                case 199: {
                    n14 = 33;
                    break;
                }
                case 200: {
                    n14 = 179;
                    break;
                }
                case 201: {
                    n14 = 114;
                    break;
                }
                case 202: {
                    n14 = 15;
                    break;
                }
                case 203: {
                    n14 = 194;
                    break;
                }
                case 204: {
                    n14 = 249;
                    break;
                }
                case 205: {
                    n14 = 158;
                    break;
                }
                case 206: {
                    n14 = 85;
                    break;
                }
                case 207: {
                    n14 = 26;
                    break;
                }
                case 208: {
                    n14 = 45;
                    break;
                }
                case 209: {
                    n14 = 30;
                    break;
                }
                case 210: {
                    n14 = 58;
                    break;
                }
                case 211: {
                    n14 = 203;
                    break;
                }
                case 212: {
                    n14 = 130;
                    break;
                }
                case 213: {
                    n14 = 174;
                    break;
                }
                case 214: {
                    n14 = 166;
                    break;
                }
                case 215: {
                    n14 = 206;
                    break;
                }
                case 216: {
                    n14 = 42;
                    break;
                }
                case 217: {
                    n14 = 87;
                    break;
                }
                case 218: {
                    n14 = 50;
                    break;
                }
                case 219: {
                    n14 = 13;
                    break;
                }
                case 220: {
                    n14 = 163;
                    break;
                }
                case 221: {
                    n14 = 237;
                    break;
                }
                case 222: {
                    n14 = 200;
                    break;
                }
                case 223: {
                    n14 = 2;
                    break;
                }
                case 224: {
                    n14 = 100;
                    break;
                }
                case 225: {
                    n14 = 175;
                    break;
                }
                case 226: {
                    n14 = 48;
                    break;
                }
                case 227: {
                    n14 = 79;
                    break;
                }
                case 228: {
                    n14 = 96;
                    break;
                }
                case 229: {
                    n14 = 136;
                    break;
                }
                case 230: {
                    n14 = 131;
                    break;
                }
                case 231: {
                    n14 = 6;
                    break;
                }
                case 232: {
                    n14 = 39;
                    break;
                }
                case 233: {
                    n14 = 69;
                    break;
                }
                case 234: {
                    n14 = 155;
                    break;
                }
                case 235: {
                    n14 = 52;
                    break;
                }
                case 236: {
                    n14 = 43;
                    break;
                }
                case 237: {
                    n14 = 165;
                    break;
                }
                case 238: {
                    n14 = 150;
                    break;
                }
                case 239: {
                    n14 = 161;
                    break;
                }
                case 240: {
                    n14 = 122;
                    break;
                }
                case 241: {
                    n14 = 209;
                    break;
                }
                case 242: {
                    n14 = 90;
                    break;
                }
                case 243: {
                    n14 = 8;
                    break;
                }
                case 244: {
                    n14 = 152;
                    break;
                }
                case 245: {
                    n14 = 233;
                    break;
                }
                case 246: {
                    n14 = 243;
                    break;
                }
                case 247: {
                    n14 = 254;
                    break;
                }
                case 248: {
                    n14 = 151;
                    break;
                }
                case 249: {
                    n14 = 93;
                    break;
                }
                case 250: {
                    n14 = 1;
                    break;
                }
                case 251: {
                    n14 = 120;
                    break;
                }
                case 252: {
                    n14 = 231;
                    break;
                }
                case 253: {
                    n14 = 219;
                    break;
                }
                case 254: {
                    n14 = 218;
                    break;
                }
                default: {
                    n14 = 245;
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
            kc_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x363B;
        if (d[n11] == null) {
            kc_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

