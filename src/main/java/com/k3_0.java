/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.GO;
import com.IB;
import com.KD;
import com.O6;
import com.O_;
import com.RQ;
import com.W2;
import com.WC;
import com.YA;
import com._J;
import com.aL;
import com.au_0;
import com.cl_2;
import com.eh_0;
import com.i2_0;
import com.ki_1;
import com.ky_2;
import com.ld_2;
import com.lp_1;
import com.pv_0;
import com.r9_0;
import com.tn_0;
import com.x7_0;
import com.xg_0;
import com.xk_2;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.k3
 */
public class k3_0
extends ky_2
implements SwingConstants,
W2,
au_0,
eh_0 {
    protected boolean Q;
    protected ImageIcon U;
    protected ImageIcon v;
    protected Insets x;
    protected boolean G;
    protected boolean S;
    protected int E;
    protected int r;
    protected Insets t;
    protected List P;
    protected ImageIcon X;
    protected ImageIcon R;
    protected ImageIcon s;
    protected ImageIcon i;
    protected E h;
    protected boolean C;
    protected float k;
    protected float H;
    protected WC p;
    protected boolean K;
    protected ky_2 j;
    protected Component M;
    protected KD g;
    protected ky_2 Z;
    protected Component Y;
    private static int[] A;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public k3_0() {
        this("");
    }

    public k3_0(String string) {
        this(null, string);
    }

    public k3_0(ImageIcon imageIcon, String string) {
        this(imageIcon, string, null);
    }

    public k3_0(String string, Component component) {
        this(null, string, component);
    }

    public k3_0(Icon icon, String string, Component component) {
        int[] nArray = k3_0.L();
        this.Q = YA.K;
        this.U = YA.C;
        int[] nArray2 = nArray;
        this.v = YA.h;
        this.x = YA.W;
        this.G = YA.o;
        this.S = YA.x;
        this.E = YA.i;
        this.r = YA.w;
        this.t = YA.V;
        this.P = new ArrayList(1);
        this.X = null;
        this.R = null;
        this.s = null;
        this.i = null;
        this.h = null;
        this.C = true;
        this.k = 1.0f;
        this.H = 0.1f;
        this.p = null;
        this.K = false;
        this.Y = null;
        this.Y = component;
        this.setFocusable(true);
        this.i(true);
        this.T(false);
        this.u(false);
        this.Y(GO.Fx);
        this.setLayout(new BorderLayout(0, 0));
        this.j = new ky_2();
        this.j.setOpaque(true);
        this.j.T(false);
        this.j.D(0);
        this.j.setLayout(new BorderLayout());
        this.j.addMouseListener(new tn_0(this));
        this.j.addKeyListener(new RQ(this));
        this.c();
        this.K(icon, string);
        this.J();
        this.g = new KD(this.v);
        this.g.G(true);
        this.g.setFocusable(false);
        this.g.t(false);
        this.g.addActionListener(new x7_0(this));
        this.r();
        this.L();
        this.z();
        this.Z = new ki_1(this);
        this.Z.setOpaque(false);
        this.Z.setLayout(new BorderLayout(0, 0));
        this.Z.b(this.t);
        this.add((Component)this.Z, k3_0.b(-74, 11445));
        k3_0 k3_02 = this;
        if (nArray2 != null) {
            if (k3_02.Y != null) {
                this.Z.add(this.Y, k3_0.b(-73, -20720));
            }
            k3_02 = this;
        }
        k3_02.addPropertyChangeListener(k3_0.b(-79, -1081), new lp_1(this));
        if (nArray2 == null) {
            ky_2.K(new String[2]);
        }
    }

    protected void o() {
        block3: {
            k3_0 k3_02;
            block5: {
                block6: {
                    boolean bl;
                    int[] nArray;
                    block4: {
                        block2: {
                            nArray = k3_0.L();
                            bl = this.isShowing();
                            if (nArray == null) break block2;
                            if (!bl) break block3;
                            bl = this.isEnabled();
                        }
                        if (nArray == null) break block4;
                        if (!bl) break block3;
                        k3_02 = this;
                        if (nArray == null) break block5;
                        bl = k3_02.isFocusable();
                    }
                    if (!bl) break block6;
                    this.requestFocusInWindow();
                    if (nArray != null) break block3;
                }
                k3_02 = this;
            }
            k3_02.transferFocus();
        }
    }

    protected void D() {
        this.K(this.u(), this.Q());
    }

    protected void K(Icon icon, String string) {
        block5: {
            ky_2 ky_22;
            block6: {
                Component component;
                block4: {
                    int[] nArray = k3_0.L();
                    component = this;
                    if (nArray == null) break block4;
                    if (component.K) break block5;
                    ky_22 = this;
                    if (nArray == null) break block6;
                    component = ((k3_0)ky_22).M;
                }
                if (component != null) {
                    this.j.remove(this.M);
                }
                this.M = this.C(icon, string);
                ky_22 = this.j;
            }
            ky_22.add(this.M, k3_0.b(-73, -20720));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void J() {
        block7: {
            block14: {
                block13: {
                    block11: {
                        block12: {
                            block10: {
                                block9: {
                                    block8: {
                                        block6: {
                                            var1_1 = k3_0.L();
                                            v0 = this;
                                            if (var1_1 == null) break block6;
                                            if (v0.M == null) break block7;
                                            v0 = this;
                                        }
                                        if (var1_1 == null) break block8;
                                        if (v0.K) break block7;
                                        v0 = this;
                                    }
                                    if (var1_1 == null) break block9;
                                    if (v0.u() != null) ** GOTO lbl-1000
                                    v0 = this;
                                }
                                v1 = v0.r;
                                v2 = 2;
                                if (var1_1 == null) break block10;
                                if (v1 != v2) ** GOTO lbl-1000
                                v1 = this.r;
                                v2 = 4;
                            }
                            if (v1 == v2) lbl-1000:
                            // 3 sources

                            {
                                v3 = new Insets(2, 2, 2, 2);
                            } else {
                                v3 = new Insets(2, 4, 2, 2);
                            }
                            var2_2 = v3;
                            v4 = this.r;
                            v5 = 2;
                            if (var1_1 == null) break block11;
                            if (v4 != v5) break block12;
                            var2_2 = new Insets(var2_2.right, var2_2.top, var2_2.left, var2_2.bottom);
                            if (var1_1 != null) break block13;
                        }
                        v6 /* !! */  = this;
                        if (var1_1 == null) break block14;
                        v4 = v6 /* !! */ .r;
                        v5 = 4;
                    }
                    if (v4 == v5) {
                        var2_2 = new Insets(var2_2.left, var2_2.bottom, var2_2.right, var2_2.top);
                    }
                }
                v6 /* !! */  = this.M;
            }
            ((O_)v6 /* !! */ ).S(var2_2);
        }
    }

    protected void c() {
        k3_0 k3_02;
        block11: {
            block6: {
                int n10;
                int n11;
                block9: {
                    int[] nArray;
                    block10: {
                        block7: {
                            block8: {
                                block4: {
                                    block5: {
                                        int[] nArray2 = k3_0.L();
                                        this.v();
                                        nArray = nArray2;
                                        n11 = this.r;
                                        n10 = 1;
                                        if (nArray == null) break block4;
                                        if (n11 != n10) break block5;
                                        this.add((Component)this.j, k3_0.b(-76, -4305));
                                        if (nArray != null) break block6;
                                    }
                                    n11 = this.r;
                                    n10 = 3;
                                }
                                if (nArray == null) break block7;
                                if (n11 != n10) break block8;
                                this.add((Component)this.j, k3_0.b(-69, 25372));
                                if (nArray != null) break block6;
                            }
                            n11 = this.r;
                            n10 = 2;
                        }
                        if (nArray == null) break block9;
                        if (n11 != n10) break block10;
                        this.add((Component)this.j, k3_0.b(-70, 21403));
                        if (nArray != null) break block6;
                    }
                    k3_02 = this;
                    if (nArray == null) break block11;
                    n11 = k3_02.r;
                    n10 = 4;
                }
                if (n11 == n10) {
                    this.add((Component)this.j, k3_0.b(-67, -14514));
                }
            }
            k3_02 = this;
        }
        k3_02.revalidate();
    }

    /*
     * Exception decompiling
     */
    protected void v() {
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

    protected void z() {
        ky_2 ky_22;
        block11: {
            block8: {
                ky_2 ky_23;
                block2: {
                    block3: {
                        int n10;
                        int n11;
                        int[] nArray;
                        block9: {
                            block10: {
                                block6: {
                                    block7: {
                                        ky_2 ky_24;
                                        block4: {
                                            block5: {
                                                nArray = k3_0.L();
                                                ky_23 = this;
                                                if (nArray == null) break block2;
                                                if (!ky_23.S) break block3;
                                                ky_24 = this;
                                                if (nArray == null) break block4;
                                                if (((k3_0)ky_24).r == 1) break block5;
                                                n11 = this.r;
                                                n10 = 3;
                                                if (nArray == null) break block6;
                                                if (n11 != n10) break block7;
                                            }
                                            ky_24 = this.j;
                                        }
                                        ky_24.add((Component)this.g, this.E == 4 ? k3_0.b(-80, -11735) : k3_0.b(-72, 13545));
                                        if (nArray != null) break block8;
                                    }
                                    n11 = this.r;
                                    n10 = 2;
                                }
                                if (nArray == null) break block9;
                                if (n11 != n10) break block10;
                                this.j.add((Component)this.g, this.E == 4 ? k3_0.b(-68, -21518) : k3_0.b(-78, -23822));
                                if (nArray != null) break block8;
                            }
                            ky_22 = this;
                            if (nArray == null) break block11;
                            n11 = ((k3_0)ky_22).r;
                            n10 = 4;
                        }
                        if (n11 != n10) break block8;
                        this.j.add((Component)this.g, this.E == 4 ? k3_0.b(-71, 4570) : k3_0.b(-77, 17959));
                        if (nArray != null) break block8;
                    }
                    ky_23 = this.j;
                }
                ky_23.remove(this.g);
            }
            ky_22 = this.j;
        }
        ky_22.revalidate();
    }

    protected void L() {
        this.g.setMargin(this.x);
    }

    protected JComponent C(Icon icon, String string) {
        O_ o_;
        block4: {
            block5: {
                int n10;
                int n11;
                int[] nArray;
                block2: {
                    block3: {
                        nArray = k3_0.L();
                        n11 = this.r;
                        n10 = 2;
                        if (nArray == null) break block2;
                        if (n11 != n10) break block3;
                        o_ = new O6(string, icon, k3_0.a(6164, 4125383535685872407L), false);
                        if (nArray != null) break block4;
                    }
                    n11 = this.r;
                    n10 = 4;
                }
                if (n11 != n10) break block5;
                o_ = new O6(string, icon, k3_0.a(7403, 4557693452061224937L), true);
                if (nArray != null) break block4;
            }
            o_ = new O_(string, icon, k3_0.a(7403, 4557693452061224937L), new Object[0]);
        }
        o_.D(true);
        return o_;
    }

    public E y() {
        return this.h;
    }

    public void B(E e2) {
        this.h = e2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean W() {
        int[] nArray = k3_0.L();
        Object object = this.h;
        if (nArray != null) {
            if (object == null) return true;
            object = this.h.J();
        }
        boolean bl = (Boolean)object;
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean K() {
        int[] nArray = k3_0.L();
        WC wC = this.p;
        if (nArray != null) {
            if (wC == null) return false;
            wC = this.p;
        }
        boolean bl = wC.i();
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public boolean q() {
        return this.W(this.Q);
    }

    public boolean W(boolean bl) {
        int[] nArray = k3_0.L();
        boolean bl2 = this.Y();
        if (nArray != null) {
            bl2 = !bl2;
        }
        return this.x(bl2, bl);
    }

    public boolean Y() {
        return this.C;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean u(boolean bl) {
        boolean bl2;
        block5: {
            int[] nArray;
            block4: {
                nArray = k3_0.L();
                bl2 = this.isShowing();
                if (nArray == null) break block4;
                if (!bl2) break block5;
                bl2 = this.Q;
            }
            if (nArray == null) return this.x(bl, bl2);
            if (bl2) {
                bl2 = true;
                return this.x(bl, bl2);
            }
        }
        bl2 = false;
        return this.x(bl, bl2);
    }

    public boolean x(boolean bl, boolean bl2) {
        int[] nArray = k3_0.L();
        boolean bl3 = this.isEnabled();
        if (nArray != null) {
            if (bl3) {
                boolean bl4 = bl;
                if (nArray != null) {
                    if (bl4) {
                        return this.e(bl2);
                    }
                    bl4 = this.n(bl2);
                }
                return bl4;
            }
            bl3 = false;
        }
        return bl3;
    }

    public boolean X() {
        return this.n(this.Q);
    }

    public boolean n(boolean bl) {
        block11: {
            k3_0 k3_02;
            block10: {
                block8: {
                    block9: {
                        boolean bl2;
                        int[] nArray;
                        block6: {
                            block7: {
                                boolean bl3;
                                block4: {
                                    block5: {
                                        nArray = k3_0.L();
                                        bl3 = this.C;
                                        if (nArray == null) break block4;
                                        if (!bl3) break block5;
                                        bl2 = this.W();
                                        if (nArray == null) break block6;
                                        if (bl2) break block7;
                                    }
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            this.n();
                            this.C = false;
                            this.r();
                            this.f();
                            if (nArray == null) break block8;
                            bl2 = bl;
                        }
                        if (!bl2) break block9;
                        k3_02 = this;
                        if (nArray == null) break block10;
                        if (!k3_02.isShowing()) break block9;
                        this.p = new WC(k3_0.b(-75, -30534), GO.L, (ActionListener)new _J(this));
                        this.p.u();
                        if (nArray != null) break block11;
                    }
                    this.k = 0.0f;
                }
                k3_02 = this;
            }
            k3_02.u();
        }
        return true;
    }

    protected void u() {
        int[] nArray = k3_0.L();
        this.v();
        int[] nArray2 = nArray;
        k3_0 k3_02 = this;
        if (nArray2 != null) {
            if (k3_02.Y != null) {
                this.Y.setVisible(false);
            }
            this.revalidate();
            this.repaint();
            k3_02 = this;
        }
        k3_02.G();
    }

    public boolean l() {
        return this.e(this.Q);
    }

    public boolean e(boolean bl) {
        block18: {
            k3_0 k3_02;
            block17: {
                block15: {
                    block16: {
                        k3_0 k3_03;
                        int[] nArray;
                        block14: {
                            Component component;
                            block12: {
                                block13: {
                                    boolean bl2;
                                    block10: {
                                        block11: {
                                            nArray = k3_0.L();
                                            bl2 = this.C;
                                            if (nArray == null) break block10;
                                            if (bl2) break block11;
                                            component = this;
                                            if (nArray == null) break block12;
                                            if (component.W()) break block13;
                                        }
                                        bl2 = false;
                                    }
                                    return bl2;
                                }
                                this.n();
                                this.C = true;
                                this.r();
                                k3_03 = this;
                                if (nArray == null) break block14;
                                component = k3_03.Y;
                            }
                            if (component != null) {
                                this.Y.setVisible(true);
                            }
                            this.v();
                            k3_03 = this;
                        }
                        k3_03.P();
                        if (nArray == null) break block15;
                        if (!bl) break block16;
                        k3_02 = this;
                        if (nArray == null) break block17;
                        if (!k3_02.isShowing()) break block16;
                        this.p = new WC(k3_0.b(-65, -11696), GO.L, (ActionListener)new r9_0(this));
                        this.p.u();
                        if (nArray != null) break block18;
                    }
                    this.k = 1.0f;
                }
                k3_02 = this;
            }
            k3_02.K();
        }
        return true;
    }

    protected void K() {
        this.revalidate();
        this.repaint();
        this.Z();
    }

    protected void n() {
        block5: {
            WC wC;
            int[] nArray;
            block4: {
                nArray = k3_0.L();
                wC = this.p;
                if (nArray == null) break block4;
                if (wC == null) break block5;
                wC = this.p;
            }
            if (nArray != null && wC.i()) {
                wC = this.p.Y();
            }
        }
    }

    public int N() {
        return this.r;
    }

    public void D(int n10) {
        this.r = n10;
        this.D();
        this.J();
        this.c();
        this.V();
        this.z();
    }

    public Insets h() {
        return this.t;
    }

    public void j(Insets insets) {
        this.t = insets;
        this.Z.b(insets);
        this.revalidate();
    }

    public void h(int n10, int n11, int n12, int n13) {
        this.j(new Insets(n10, n11, n12, n13));
    }

    public void h(int n10) {
        this.h(n10, n10, n10, n10);
    }

    public boolean O() {
        return this.Q;
    }

    public void l(boolean bl) {
        this.Q = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Icon u() {
        int[] nArray = k3_0.L();
        Component component = this;
        if (nArray != null) {
            if (component.K) {
                return null;
            }
            component = this.M;
        }
        Icon icon = ((O_)component).getIcon();
        return icon;
    }

    public void C(Icon icon) {
        block3: {
            k3_0 k3_02;
            block2: {
                int[] nArray = k3_0.L();
                k3_02 = this;
                if (nArray == null) break block2;
                if (k3_02.K) break block3;
                ((O_)this.M).setIcon(icon);
                k3_02 = this;
            }
            k3_02.J();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String Q() {
        int[] nArray = k3_0.L();
        Component component = this;
        if (nArray != null) {
            if (component.K) {
                return null;
            }
            component = this.M;
        }
        String string = ((O_)component).getText();
        return string;
    }

    public void u(String string) {
        block3: {
            Component component;
            block2: {
                int[] nArray = k3_0.L();
                component = this;
                if (nArray == null) break block2;
                if (component.K) break block3;
                component = this.M;
            }
            ((O_)component).setText(string);
        }
    }

    public void b(int n10) {
        block3: {
            Component component;
            block2: {
                int[] nArray = k3_0.L();
                component = this;
                if (nArray == null) break block2;
                if (component.K) break block3;
                component = this.M;
            }
            ((O_)component).setHorizontalAlignment(n10);
        }
    }

    public ImageIcon D() {
        return this.v;
    }

    public void I(ImageIcon imageIcon) {
        this.v = imageIcon;
        this.t();
        this.r();
    }

    public ImageIcon i() {
        return this.U;
    }

    public void x(ImageIcon imageIcon) {
        this.U = imageIcon;
        this.A();
        this.r();
    }

    public Insets G() {
        return this.x;
    }

    public void h(Insets insets) {
        this.x = insets;
        this.L();
    }

    public boolean A() {
        return this.G;
    }

    public void q(boolean bl) {
        this.G = bl;
        this.V();
    }

    public boolean B() {
        return this.S;
    }

    public void S(boolean bl) {
        this.S = bl;
        this.z();
    }

    public int U() {
        return this.E;
    }

    public void g(int n10) {
        this.E = n10;
        this.z();
    }

    protected void V() {
        this.t();
        this.A();
        this.r();
    }

    protected void r() {
        block4: {
            k3_0 k3_02;
            block2: {
                block3: {
                    int[] nArray = k3_0.L();
                    k3_02 = this;
                    if (nArray == null) break block2;
                    if (!k3_02.C) break block3;
                    this.g.setIcon(this.y());
                    this.g.setDisabledIcon(this.E());
                    if (nArray != null) break block4;
                }
                this.g.setIcon(this.a());
                k3_02 = this;
            }
            k3_02.g.setDisabledIcon(this.h());
        }
    }

    protected void t() {
        this.s = null;
        this.i = null;
    }

    protected ImageIcon y() {
        ImageIcon imageIcon;
        block4: {
            k3_0 k3_02;
            block12: {
                block5: {
                    int n10;
                    int n11;
                    block10: {
                        int[] nArray;
                        block11: {
                            block8: {
                                block9: {
                                    block6: {
                                        k3_0 k3_03;
                                        block7: {
                                            nArray = k3_0.L();
                                            imageIcon = this.s;
                                            if (nArray == null) break block4;
                                            if (imageIcon != null) break block5;
                                            k3_03 = this;
                                            if (nArray == null) break block6;
                                            if (!k3_03.G) break block7;
                                            k3_03 = this;
                                            if (nArray == null) break block6;
                                            if (k3_03.r == 1) break block7;
                                            n11 = this.r;
                                            n10 = 3;
                                            if (nArray == null) break block8;
                                            if (n11 != n10) break block9;
                                        }
                                        k3_03 = this;
                                    }
                                    k3_03.s = new xk_2(this.v);
                                    if (nArray != null) break block5;
                                }
                                n11 = this.r;
                                n10 = 2;
                            }
                            if (nArray == null) break block10;
                            if (n11 != n10) break block11;
                            this.s = xg_0.h(this.v);
                            if (nArray != null) break block5;
                        }
                        k3_02 = this;
                        if (nArray == null) break block12;
                        n11 = k3_02.r;
                        n10 = 4;
                    }
                    if (n11 == n10) {
                        this.s = xg_0.U(this.v);
                    }
                }
                k3_02 = this;
            }
            imageIcon = k3_02.s;
        }
        return imageIcon;
    }

    protected ImageIcon E() {
        int[] nArray = k3_0.L();
        ImageIcon imageIcon = this.i;
        if (nArray != null) {
            if (imageIcon == null) {
                this.i = xg_0.J(this.y());
            }
            imageIcon = this.i;
        }
        return imageIcon;
    }

    protected void A() {
        this.X = null;
        this.R = null;
    }

    protected ImageIcon a() {
        ImageIcon imageIcon;
        block2: {
            k3_0 k3_02;
            block15: {
                block3: {
                    block16: {
                        int n10;
                        block13: {
                            int[] nArray;
                            block14: {
                                block10: {
                                    int n11;
                                    block11: {
                                        block12: {
                                            block8: {
                                                block9: {
                                                    block6: {
                                                        block7: {
                                                            block4: {
                                                                k3_0 k3_03;
                                                                block5: {
                                                                    nArray = k3_0.L();
                                                                    imageIcon = this.X;
                                                                    if (nArray == null) break block2;
                                                                    if (imageIcon != null) break block3;
                                                                    n11 = this.getComponentOrientation().isLeftToRight();
                                                                    k3_03 = this;
                                                                    if (nArray == null) break block4;
                                                                    if (!k3_03.G) break block5;
                                                                    k3_03 = this;
                                                                    if (nArray == null) break block4;
                                                                    if (k3_03.r == 1) break block5;
                                                                    n10 = this.r;
                                                                    if (nArray == null) break block6;
                                                                    if (n10 != 3) break block7;
                                                                }
                                                                k3_03 = this;
                                                            }
                                                            k3_03.X = this.U;
                                                            if (nArray != null) break block3;
                                                        }
                                                        n10 = n11;
                                                    }
                                                    if (nArray == null) break block8;
                                                    if (n10 == 0) break block9;
                                                    n10 = this.r;
                                                    if (nArray == null) break block10;
                                                    if (n10 != 2) break block11;
                                                    break block12;
                                                }
                                                n10 = this.r;
                                            }
                                            if (nArray == null) break block10;
                                            if (n10 != 4) break block11;
                                        }
                                        this.X = xg_0.h(this.U);
                                        if (nArray != null) break block3;
                                    }
                                    n10 = n11;
                                }
                                if (nArray == null) break block13;
                                if (n10 == 0) break block14;
                                k3_02 = this;
                                if (nArray == null) break block15;
                                if (k3_02.r != 4) break block3;
                                break block16;
                            }
                            k3_02 = this;
                            if (nArray == null) break block15;
                            n10 = k3_02.r;
                        }
                        if (n10 != 2) break block3;
                    }
                    this.X = xg_0.U(this.U);
                }
                k3_02 = this;
            }
            imageIcon = k3_02.X;
        }
        return imageIcon;
    }

    protected ImageIcon h() {
        int[] nArray = k3_0.L();
        ImageIcon imageIcon = this.R;
        if (nArray != null) {
            if (imageIcon == null) {
                this.R = xg_0.J(this.a());
            }
            imageIcon = this.R;
        }
        return imageIcon;
    }

    public ky_2 g() {
        return this.j;
    }

    public KD m() {
        return this.g;
    }

    public Component t() {
        return this.M;
    }

    public void u(Component component) {
        int[] nArray = k3_0.L();
        Component component2 = this.M;
        if (nArray != null) {
            if (component2 != null) {
                this.j.remove(this.M);
            }
            component2 = component;
        }
        if (component2 != null) {
            this.j.add(component, k3_0.b(-73, -20720));
        }
        this.M = component;
        this.K = true;
    }

    public Component F() {
        return this.Y;
    }

    public void V(Component component) {
        float f10;
        int[] nArray = k3_0.L();
        Component component2 = this.Y;
        if (nArray != null) {
            if (component2 != null) {
                this.Z.remove(this.Y);
            }
            this.Y = component;
            component2 = component;
        }
        float f11 = (f10 = this.k - 0.0f) == 0.0f ? (char)'\u0000' : (f10 > 0.0f ? (char)'\u0001' : '\uffffffff');
        if (nArray != null) {
            f11 = f11 > 0 ? 1.0f : 0.0f;
        }
        component2.setVisible((boolean)f11);
        this.Z.add(component, k3_0.b(-73, -20720));
        this.revalidate();
    }

    public List Y() {
        return aL.J((Collection)this.P);
    }

    public void u(List list) {
        this.P = list;
    }

    public void m(pv_0 pv_02) {
        this.P.add(pv_02);
    }

    public void B(pv_0 pv_02) {
        this.P.remove(pv_02);
    }

    public void P() {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            pv_0 pv_02 = (pv_0)iterator.next();
            pv_02.q(this);
            if (nArray != null) continue;
        }
    }

    public void Z() {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            pv_0 pv_02 = (pv_0)iterator.next();
            pv_02.E(this);
            if (nArray != null) continue;
        }
    }

    public void f() {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            pv_0 pv_02 = (pv_0)iterator.next();
            pv_02.A(this);
            if (nArray != null) continue;
        }
    }

    public void G() {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            pv_0 pv_02 = (pv_0)iterator.next();
            pv_02.D(this);
            if (nArray != null) continue;
        }
    }

    public float q() {
        return this.k;
    }

    public Dimension u() {
        Dimension dimension;
        Dimension dimension2;
        block10: {
            block9: {
                int n10;
                int n11;
                block8: {
                    Component component;
                    int[] nArray;
                    block6: {
                        block7: {
                            block5: {
                                block4: {
                                    dimension2 = this.getPreferredSize();
                                    nArray = k3_0.L();
                                    component = this;
                                    if (nArray == null) break block4;
                                    if (component.Y == null) break block5;
                                    component = this;
                                }
                                if (nArray == null) break block6;
                                if (!(component.k <= 0.0f)) break block7;
                            }
                            return dimension2;
                        }
                        component = this.Y;
                    }
                    dimension = ((Component)component).getPreferredSize();
                    n11 = this.r;
                    n10 = 1;
                    if (nArray == null) break block8;
                    if (n11 == n10) break block9;
                    n11 = this.r;
                    n10 = 3;
                }
                if (n11 != n10) break block10;
            }
            return new Dimension(dimension2.width, dimension2.height - Math.round((float)dimension.height * this.k));
        }
        return new Dimension(dimension2.width - Math.round((float)dimension.width * this.k), dimension2.height);
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

    @Override
    public void p(String string) {
        cl_2.c(this, string);
    }

    @Override
    public void a(String string, Class clazz) {
        cl_2.x(this, string, clazz);
    }

    @Override
    public void E(String string, Object object) {
        cl_2.e(this, string, object);
    }

    @Override
    public void n(String string, String string2) {
        cl_2.B(this, string, string2);
    }

    @Override
    public void I(String string, String string2, Class clazz) {
        cl_2.t(this, string, string2, clazz);
    }

    @Override
    public void H(String string, String string2, Object object) {
        cl_2.a(this, string, string2, object);
    }

    @Override
    public void S(String string, boolean bl, boolean bl2) {
        cl_2.l(this, string, bl, bl2);
    }

    @Override
    public void O(String string, Class clazz, boolean bl, boolean bl2) {
        cl_2.X(this, string, clazz, bl, bl2);
    }

    @Override
    public void h(String string, Object object, boolean bl, boolean bl2) {
        cl_2.A(this, string, object, bl, bl2);
    }

    @Override
    public void e(String string, String string2, Class clazz, boolean bl, boolean bl2) {
        cl_2.L(this, string, string2, clazz, bl, bl2);
    }

    @Override
    public void D(String string, String string2, Object object, boolean bl, boolean bl2) {
        cl_2.y(this, string, string2, object, bl, bl2);
    }

    @Override
    public void z(IB iB) {
        cl_2.a(this, iB);
    }

    @Override
    public void w() {
        cl_2.O(this);
    }

    @Override
    public void m() {
        cl_2.G(this);
    }

    @Override
    public void e() {
        cl_2.H(this);
    }

    public static void x(int[] nArray) {
        A = nArray;
    }

    public static int[] L() {
        return A;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[15];
                        var11_1 = 0;
                        var10_2 = "(7\u00f3Q\u00a1r\u0013\u00f8\u008bg\u00bcS\u0086\u0080\u0016\u0086\u00d8\u00b1\u00feT\u0005OL`\u0003\u00f4\u0005c \u0004v\u00b8\u0004[IIU Na\u0082\u00e3as\u0002\u0095\u0085\u0018\u00e2\f<\nM\u00bd\t\u00da\u00dc\u00b9\u00df/A\u00f1\u00fcp\u00cc\u0087B\u0017\u00fd\u0015\u0005Hfh\u007f)\u0006m\u00a5|L9I\u0006.\u00dc\u0014c4\u00ac\u0004\f'\u00a3\u0098\u0006\u0018%\u00fbG\u00d7G\u0005\u008b\u00b1\u00a9\u0085\u00f6\u0006\u00fa*\u00a7\u00a6\\{\u0005\u000b\u00f8\u00e8\u0095\u00e5";
                        var12_3 = "(7\u00f3Q\u00a1r\u0013\u00f8\u008bg\u00bcS\u0086\u0080\u0016\u0086\u00d8\u00b1\u00feT\u0005OL`\u0003\u00f4\u0005c \u0004v\u00b8\u0004[IIU Na\u0082\u00e3as\u0002\u0095\u0085\u0018\u00e2\f<\nM\u00bd\t\u00da\u00dc\u00b9\u00df/A\u00f1\u00fcp\u00cc\u0087B\u0017\u00fd\u0015\u0005Hfh\u007f)\u0006m\u00a5|L9I\u0006.\u00dc\u0014c4\u00ac\u0004\f'\u00a3\u0098\u0006\u0018%\u00fbG\u00d7G\u0005\u008b\u00b1\u00a9\u0085\u00f6\u0006\u00fa*\u00a7\u00a6\\{\u0005\u000b\u00f8\u00e8\u0095\u00e5".length();
                        k3_0.x(new int[1]);
                        var9_4 = 20;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 101;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "ZcRo\u0003\u001e\u00f4\u0017\u00a4\\\u00d4\u00f5\u00c54\f]\u00a2\u00d5E@\u0013\u0085\u00b3\u00ac\u00fa\u0000}\u00b3\u009c\u0083\u008e\u0086i\u00d2\u0006\u00cd";
                            var12_3 = "ZcRo\u0003\u001e\u00f4\u0017\u00a4\\\u00d4\u00f5\u00c54\f]\u00a2\u00d5E@\u0013\u0085\u00b3\u00ac\u00fa\u0000}\u00b3\u009c\u0083\u008e\u0086i\u00d2\u0006\u00cd".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 118;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 85;
                                    break;
                                }
                                case 2: {
                                    v15 = 30;
                                    break;
                                }
                                case 3: {
                                    v15 = 38;
                                    break;
                                }
                                case 4: {
                                    v15 = 122;
                                    break;
                                }
                                case 5: {
                                    v15 = 69;
                                    break;
                                }
                                default: {
                                    v15 = 70;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                k3_0.a = var13;
                k3_0.b = new String[15];
                var0_7 = 8995761735352616496L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "J\u009eB\u009a\u00fa\u0085)\u00d3O\u00fc\u00bc\u00c2\u0011s\u00ad-";
                var5_11 = "J\u009eB\u009a\u00fa\u0085)\u00d3O\u00fc\u00bc\u00c2\u0011s\u00ad-".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl108:
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
        k3_0.c = var6_8;
        k3_0.d = new Integer[2];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFFFB1) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 220;
                    break;
                }
                case 1: {
                    n14 = 53;
                    break;
                }
                case 2: {
                    n14 = 74;
                    break;
                }
                case 3: {
                    n14 = 103;
                    break;
                }
                case 4: {
                    n14 = 128;
                    break;
                }
                case 5: {
                    n14 = 183;
                    break;
                }
                case 6: {
                    n14 = 93;
                    break;
                }
                case 7: {
                    n14 = 157;
                    break;
                }
                case 8: {
                    n14 = 12;
                    break;
                }
                case 9: {
                    n14 = 86;
                    break;
                }
                case 10: {
                    n14 = 239;
                    break;
                }
                case 11: {
                    n14 = 79;
                    break;
                }
                case 12: {
                    n14 = 222;
                    break;
                }
                case 13: {
                    n14 = 232;
                    break;
                }
                case 14: {
                    n14 = 197;
                    break;
                }
                case 15: {
                    n14 = 23;
                    break;
                }
                case 16: {
                    n14 = 52;
                    break;
                }
                case 17: {
                    n14 = 3;
                    break;
                }
                case 18: {
                    n14 = 191;
                    break;
                }
                case 19: {
                    n14 = 106;
                    break;
                }
                case 20: {
                    n14 = 78;
                    break;
                }
                case 21: {
                    n14 = 111;
                    break;
                }
                case 22: {
                    n14 = 214;
                    break;
                }
                case 23: {
                    n14 = 38;
                    break;
                }
                case 24: {
                    n14 = 144;
                    break;
                }
                case 25: {
                    n14 = 177;
                    break;
                }
                case 26: {
                    n14 = 168;
                    break;
                }
                case 27: {
                    n14 = 5;
                    break;
                }
                case 28: {
                    n14 = 205;
                    break;
                }
                case 29: {
                    n14 = 66;
                    break;
                }
                case 30: {
                    n14 = 90;
                    break;
                }
                case 31: {
                    n14 = 174;
                    break;
                }
                case 32: {
                    n14 = 238;
                    break;
                }
                case 33: {
                    n14 = 137;
                    break;
                }
                case 34: {
                    n14 = 123;
                    break;
                }
                case 35: {
                    n14 = 24;
                    break;
                }
                case 36: {
                    n14 = 138;
                    break;
                }
                case 37: {
                    n14 = 77;
                    break;
                }
                case 38: {
                    n14 = 17;
                    break;
                }
                case 39: {
                    n14 = 224;
                    break;
                }
                case 40: {
                    n14 = 215;
                    break;
                }
                case 41: {
                    n14 = 30;
                    break;
                }
                case 42: {
                    n14 = 98;
                    break;
                }
                case 43: {
                    n14 = 223;
                    break;
                }
                case 44: {
                    n14 = 198;
                    break;
                }
                case 45: {
                    n14 = 148;
                    break;
                }
                case 46: {
                    n14 = 195;
                    break;
                }
                case 47: {
                    n14 = 110;
                    break;
                }
                case 48: {
                    n14 = 184;
                    break;
                }
                case 49: {
                    n14 = 84;
                    break;
                }
                case 50: {
                    n14 = 217;
                    break;
                }
                case 51: {
                    n14 = 94;
                    break;
                }
                case 52: {
                    n14 = 219;
                    break;
                }
                case 53: {
                    n14 = 176;
                    break;
                }
                case 54: {
                    n14 = 130;
                    break;
                }
                case 55: {
                    n14 = 182;
                    break;
                }
                case 56: {
                    n14 = 201;
                    break;
                }
                case 57: {
                    n14 = 112;
                    break;
                }
                case 58: {
                    n14 = 221;
                    break;
                }
                case 59: {
                    n14 = 251;
                    break;
                }
                case 60: {
                    n14 = 21;
                    break;
                }
                case 61: {
                    n14 = 22;
                    break;
                }
                case 62: {
                    n14 = 48;
                    break;
                }
                case 63: {
                    n14 = 46;
                    break;
                }
                case 64: {
                    n14 = 179;
                    break;
                }
                case 65: {
                    n14 = 107;
                    break;
                }
                case 66: {
                    n14 = 18;
                    break;
                }
                case 67: {
                    n14 = 81;
                    break;
                }
                case 68: {
                    n14 = 229;
                    break;
                }
                case 69: {
                    n14 = 160;
                    break;
                }
                case 70: {
                    n14 = 49;
                    break;
                }
                case 71: {
                    n14 = 247;
                    break;
                }
                case 72: {
                    n14 = 210;
                    break;
                }
                case 73: {
                    n14 = 202;
                    break;
                }
                case 74: {
                    n14 = 11;
                    break;
                }
                case 75: {
                    n14 = 135;
                    break;
                }
                case 76: {
                    n14 = 118;
                    break;
                }
                case 77: {
                    n14 = 213;
                    break;
                }
                case 78: {
                    n14 = 70;
                    break;
                }
                case 79: {
                    n14 = 146;
                    break;
                }
                case 80: {
                    n14 = 101;
                    break;
                }
                case 81: {
                    n14 = 163;
                    break;
                }
                case 82: {
                    n14 = 54;
                    break;
                }
                case 83: {
                    n14 = 88;
                    break;
                }
                case 84: {
                    n14 = 211;
                    break;
                }
                case 85: {
                    n14 = 124;
                    break;
                }
                case 86: {
                    n14 = 243;
                    break;
                }
                case 87: {
                    n14 = 147;
                    break;
                }
                case 88: {
                    n14 = 203;
                    break;
                }
                case 89: {
                    n14 = 141;
                    break;
                }
                case 90: {
                    n14 = 33;
                    break;
                }
                case 91: {
                    n14 = 115;
                    break;
                }
                case 92: {
                    n14 = 234;
                    break;
                }
                case 93: {
                    n14 = 0;
                    break;
                }
                case 94: {
                    n14 = 173;
                    break;
                }
                case 95: {
                    n14 = 248;
                    break;
                }
                case 96: {
                    n14 = 109;
                    break;
                }
                case 97: {
                    n14 = 190;
                    break;
                }
                case 98: {
                    n14 = 83;
                    break;
                }
                case 99: {
                    n14 = 161;
                    break;
                }
                case 100: {
                    n14 = 63;
                    break;
                }
                case 101: {
                    n14 = 108;
                    break;
                }
                case 102: {
                    n14 = 237;
                    break;
                }
                case 103: {
                    n14 = 196;
                    break;
                }
                case 104: {
                    n14 = 172;
                    break;
                }
                case 105: {
                    n14 = 43;
                    break;
                }
                case 106: {
                    n14 = 188;
                    break;
                }
                case 107: {
                    n14 = 113;
                    break;
                }
                case 108: {
                    n14 = 31;
                    break;
                }
                case 109: {
                    n14 = 200;
                    break;
                }
                case 110: {
                    n14 = 175;
                    break;
                }
                case 111: {
                    n14 = 9;
                    break;
                }
                case 112: {
                    n14 = 185;
                    break;
                }
                case 113: {
                    n14 = 7;
                    break;
                }
                case 114: {
                    n14 = 204;
                    break;
                }
                case 115: {
                    n14 = 155;
                    break;
                }
                case 116: {
                    n14 = 25;
                    break;
                }
                case 117: {
                    n14 = 60;
                    break;
                }
                case 118: {
                    n14 = 4;
                    break;
                }
                case 119: {
                    n14 = 37;
                    break;
                }
                case 120: {
                    n14 = 166;
                    break;
                }
                case 121: {
                    n14 = 152;
                    break;
                }
                case 122: {
                    n14 = 119;
                    break;
                }
                case 123: {
                    n14 = 145;
                    break;
                }
                case 124: {
                    n14 = 140;
                    break;
                }
                case 125: {
                    n14 = 206;
                    break;
                }
                case 126: {
                    n14 = 165;
                    break;
                }
                case 127: {
                    n14 = 167;
                    break;
                }
                case 128: {
                    n14 = 139;
                    break;
                }
                case 129: {
                    n14 = 153;
                    break;
                }
                case 130: {
                    n14 = 226;
                    break;
                }
                case 131: {
                    n14 = 2;
                    break;
                }
                case 132: {
                    n14 = 249;
                    break;
                }
                case 133: {
                    n14 = 212;
                    break;
                }
                case 134: {
                    n14 = 126;
                    break;
                }
                case 135: {
                    n14 = 99;
                    break;
                }
                case 136: {
                    n14 = 169;
                    break;
                }
                case 137: {
                    n14 = 45;
                    break;
                }
                case 138: {
                    n14 = 55;
                    break;
                }
                case 139: {
                    n14 = 15;
                    break;
                }
                case 140: {
                    n14 = 57;
                    break;
                }
                case 141: {
                    n14 = 62;
                    break;
                }
                case 142: {
                    n14 = 68;
                    break;
                }
                case 143: {
                    n14 = 250;
                    break;
                }
                case 144: {
                    n14 = 181;
                    break;
                }
                case 145: {
                    n14 = 253;
                    break;
                }
                case 146: {
                    n14 = 171;
                    break;
                }
                case 147: {
                    n14 = 136;
                    break;
                }
                case 148: {
                    n14 = 87;
                    break;
                }
                case 149: {
                    n14 = 233;
                    break;
                }
                case 150: {
                    n14 = 29;
                    break;
                }
                case 151: {
                    n14 = 120;
                    break;
                }
                case 152: {
                    n14 = 129;
                    break;
                }
                case 153: {
                    n14 = 193;
                    break;
                }
                case 154: {
                    n14 = 100;
                    break;
                }
                case 155: {
                    n14 = 19;
                    break;
                }
                case 156: {
                    n14 = 20;
                    break;
                }
                case 157: {
                    n14 = 170;
                    break;
                }
                case 158: {
                    n14 = 132;
                    break;
                }
                case 159: {
                    n14 = 10;
                    break;
                }
                case 160: {
                    n14 = 16;
                    break;
                }
                case 161: {
                    n14 = 199;
                    break;
                }
                case 162: {
                    n14 = 44;
                    break;
                }
                case 163: {
                    n14 = 189;
                    break;
                }
                case 164: {
                    n14 = 133;
                    break;
                }
                case 165: {
                    n14 = 194;
                    break;
                }
                case 166: {
                    n14 = 56;
                    break;
                }
                case 167: {
                    n14 = 14;
                    break;
                }
                case 168: {
                    n14 = 236;
                    break;
                }
                case 169: {
                    n14 = 34;
                    break;
                }
                case 170: {
                    n14 = 89;
                    break;
                }
                case 171: {
                    n14 = 178;
                    break;
                }
                case 172: {
                    n14 = 156;
                    break;
                }
                case 173: {
                    n14 = 41;
                    break;
                }
                case 174: {
                    n14 = 252;
                    break;
                }
                case 175: {
                    n14 = 246;
                    break;
                }
                case 176: {
                    n14 = 235;
                    break;
                }
                case 177: {
                    n14 = 187;
                    break;
                }
                case 178: {
                    n14 = 82;
                    break;
                }
                case 179: {
                    n14 = 104;
                    break;
                }
                case 180: {
                    n14 = 231;
                    break;
                }
                case 181: {
                    n14 = 40;
                    break;
                }
                case 182: {
                    n14 = 134;
                    break;
                }
                case 183: {
                    n14 = 209;
                    break;
                }
                case 184: {
                    n14 = 85;
                    break;
                }
                case 185: {
                    n14 = 228;
                    break;
                }
                case 186: {
                    n14 = 95;
                    break;
                }
                case 187: {
                    n14 = 116;
                    break;
                }
                case 188: {
                    n14 = 225;
                    break;
                }
                case 189: {
                    n14 = 36;
                    break;
                }
                case 190: {
                    n14 = 72;
                    break;
                }
                case 191: {
                    n14 = 6;
                    break;
                }
                case 192: {
                    n14 = 114;
                    break;
                }
                case 193: {
                    n14 = 96;
                    break;
                }
                case 194: {
                    n14 = 143;
                    break;
                }
                case 195: {
                    n14 = 75;
                    break;
                }
                case 196: {
                    n14 = 69;
                    break;
                }
                case 197: {
                    n14 = 186;
                    break;
                }
                case 198: {
                    n14 = 142;
                    break;
                }
                case 199: {
                    n14 = 150;
                    break;
                }
                case 200: {
                    n14 = 42;
                    break;
                }
                case 201: {
                    n14 = 91;
                    break;
                }
                case 202: {
                    n14 = 50;
                    break;
                }
                case 203: {
                    n14 = 131;
                    break;
                }
                case 204: {
                    n14 = 105;
                    break;
                }
                case 205: {
                    n14 = 255;
                    break;
                }
                case 206: {
                    n14 = 122;
                    break;
                }
                case 207: {
                    n14 = 59;
                    break;
                }
                case 208: {
                    n14 = 227;
                    break;
                }
                case 209: {
                    n14 = 67;
                    break;
                }
                case 210: {
                    n14 = 216;
                    break;
                }
                case 211: {
                    n14 = 180;
                    break;
                }
                case 212: {
                    n14 = 102;
                    break;
                }
                case 213: {
                    n14 = 230;
                    break;
                }
                case 214: {
                    n14 = 151;
                    break;
                }
                case 215: {
                    n14 = 65;
                    break;
                }
                case 216: {
                    n14 = 92;
                    break;
                }
                case 217: {
                    n14 = 127;
                    break;
                }
                case 218: {
                    n14 = 162;
                    break;
                }
                case 219: {
                    n14 = 32;
                    break;
                }
                case 220: {
                    n14 = 26;
                    break;
                }
                case 221: {
                    n14 = 27;
                    break;
                }
                case 222: {
                    n14 = 47;
                    break;
                }
                case 223: {
                    n14 = 149;
                    break;
                }
                case 224: {
                    n14 = 76;
                    break;
                }
                case 225: {
                    n14 = 39;
                    break;
                }
                case 226: {
                    n14 = 28;
                    break;
                }
                case 227: {
                    n14 = 125;
                    break;
                }
                case 228: {
                    n14 = 158;
                    break;
                }
                case 229: {
                    n14 = 64;
                    break;
                }
                case 230: {
                    n14 = 71;
                    break;
                }
                case 231: {
                    n14 = 1;
                    break;
                }
                case 232: {
                    n14 = 73;
                    break;
                }
                case 233: {
                    n14 = 242;
                    break;
                }
                case 234: {
                    n14 = 51;
                    break;
                }
                case 235: {
                    n14 = 154;
                    break;
                }
                case 236: {
                    n14 = 159;
                    break;
                }
                case 237: {
                    n14 = 80;
                    break;
                }
                case 238: {
                    n14 = 241;
                    break;
                }
                case 239: {
                    n14 = 8;
                    break;
                }
                case 240: {
                    n14 = 208;
                    break;
                }
                case 241: {
                    n14 = 192;
                    break;
                }
                case 242: {
                    n14 = 244;
                    break;
                }
                case 243: {
                    n14 = 207;
                    break;
                }
                case 244: {
                    n14 = 117;
                    break;
                }
                case 245: {
                    n14 = 245;
                    break;
                }
                case 246: {
                    n14 = 121;
                    break;
                }
                case 247: {
                    n14 = 240;
                    break;
                }
                case 248: {
                    n14 = 58;
                    break;
                }
                case 249: {
                    n14 = 13;
                    break;
                }
                case 250: {
                    n14 = 164;
                    break;
                }
                case 251: {
                    n14 = 218;
                    break;
                }
                case 252: {
                    n14 = 254;
                    break;
                }
                case 253: {
                    n14 = 35;
                    break;
                }
                case 254: {
                    n14 = 97;
                    break;
                }
                default: {
                    n14 = 61;
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
            k3_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3302;
        if (d[n11] == null) {
            k3_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

