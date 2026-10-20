/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B7;
import com.FN;
import com.G2;
import com.K7;
import com.KQ;
import com.NE;
import com.O8;
import com.O_;
import com.RV;
import com.W2;
import com.WC;
import com.WF;
import com.aL;
import com.ac_0;
import com.fh_0;
import com.ic_1;
import com.ij_1;
import com.ky_2;
import com.w6_0;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Wd
 */
public class wd_0
extends JComponent
implements W2 {
    private static final int Y;
    private static final long R;
    private static final int L;
    private static final int Z;
    private final String i;
    private final WeakReference C;
    private JComponent x;
    private Point T;
    private Rectangle N;
    private WeakReference e;
    private WF W;
    private boolean c;
    private int f;
    private boolean m;
    private int d;
    private int K;
    private int X;
    private int u;
    private int H;
    private Color t;
    private Color w;
    private Color E;
    private Color I;
    private Color J;
    private float r;
    private final List k;
    private AncestorListener n;
    private final O8 M;
    private int P;
    private final WC v;
    private ic_1 a;
    private float q;
    private static final String[] b;
    private static final String[] g;
    private static final long[] h;
    private static final Integer[] j;

    public wd_0(Component component, String string) {
        this(component, null, string);
    }

    public wd_0(Component component, Icon icon, String string) {
        this(component, wd_0.B(icon, string));
    }

    public wd_0(Component component, String string, WF wF) {
        this(component, null, string, wF);
    }

    public wd_0(Component component, Icon icon, String string, WF wF) {
        this(component, (JComponent)wd_0.B(icon, string), wF);
    }

    public wd_0(Component component, String string, boolean bl) {
        this(component, null, string, bl);
    }

    public wd_0(Component component, Icon icon, String string, boolean bl) {
        this(component, (JComponent)wd_0.B(icon, string), bl);
    }

    public wd_0(Component component, String string, WF wF, boolean bl) {
        this(component, null, string, wF, bl);
    }

    public wd_0(Component component, Icon icon, String string, WF wF, boolean bl) {
        this(component, wd_0.B(icon, string), wF, bl);
    }

    public wd_0(Component component, JComponent jComponent) {
        this(component, jComponent, B7.s);
    }

    public wd_0(Component component, JComponent jComponent, WF wF) {
        this(component, jComponent, wF, B7.D);
    }

    public wd_0(Component component, JComponent jComponent, boolean bl) {
        this(component, jComponent, B7.s, bl);
    }

    public wd_0(Component component, JComponent jComponent, WF wF, boolean bl) {
        ky_2[] ky_2Array;
        block5: {
            Component component2;
            block4: {
                this.W = B7.s;
                this.c = B7.D;
                this.f = B7.M;
                this.m = B7.Y;
                this.d = B7.t;
                this.K = B7.v;
                this.X = B7.U;
                this.u = B7.a;
                this.H = B7.j;
                this.t = B7.b;
                this.w = B7.z;
                this.E = B7.E;
                this.I = B7.I;
                this.J = B7.d;
                ky_2[] ky_2Array2 = ac_0.n();
                this.r = B7.Z;
                this.k = new ArrayList(2);
                this.P = 0;
                this.q = 0.0f;
                FN.Y(this);
                this.setOpaque(false);
                this.i = NE.E(wd_0.a(27627, -22657));
                this.C = new WeakReference<Component>(component);
                this.x = jComponent;
                this.c = bl;
                ky_2Array = ky_2Array2;
                this.W = wF;
                this.M = new O8();
                this.M.setFont(G2.c());
                this.setLayout(new BorderLayout(wd_0.a(7962, 3496361729458523100L), wd_0.a(4442, 2789570448754165146L)));
                this.add((Component)jComponent, wd_0.a(27616, -4745));
                this.v = new WC(wd_0.a(27620, 144), (long)(wd_0.a(32038, 962395468089502180L) / Y));
                this.v.q(new KQ(this));
                this.addAncestorListener(new K7(this));
                component2 = component;
                if (ky_2Array != null) break block4;
                if (!(component2 instanceof JComponent)) break block5;
                this.n = new fh_0(this);
                component2 = component;
            }
            ((JComponent)component2).addAncestorListener(this.n);
        }
        if (ky_2Array != null) {
            ky_2.K(new String[4]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void x() {
        ky_2[] ky_2Array = ac_0.n();
        wd_0 wd_02 = this;
        if (ky_2Array == null) {
            if (wd_02.c) {
                Component component = this.N();
                if (ky_2Array != null) return;
                if (component instanceof JComponent) {
                    String string = w6_0.S((JComponent)component);
                    if (ky_2Array != null) return;
                    if (!NE.B(string)) {
                        this.M.setText(string);
                        wd_0 wd_03 = this;
                        O8 o8 = this.M;
                        if (ky_2Array == null) {
                            if (wd_03.getComponentZOrder(o8) != -1) {
                                this.remove(this.M);
                            }
                            wd_03 = this;
                            o8 = this.M;
                        }
                        wd_03.add((Component)o8, this.F());
                        return;
                    }
                }
            }
            wd_02 = this;
        }
        wd_02.remove(this.M);
    }

    private String F() {
        switch (this.f) {
            case 10: {
                return wd_0.a(27621, 2391);
            }
            case 11: {
                return wd_0.a(27618, 22900);
            }
            case 2: {
                return wd_0.a(27622, -2123);
            }
            case 4: {
                return wd_0.a(27626, -6560);
            }
        }
        return wd_0.a(27617, -17155);
    }

    public void j() {
        ky_2[] ky_2Array = ac_0.n();
        wd_0 wd_02 = this;
        if (ky_2Array == null) {
            if (wd_02.getParent() == null) {
                return;
            }
            this.a = ic_1.fadeOut;
            wd_02 = this;
        }
        WC wC = wd_02.v;
        if (ky_2Array == null && !wC.i()) {
            wC = this.v.u();
        }
    }

    public void R() {
        Component component = this.N();
        ky_2[] ky_2Array = ac_0.n();
        if (ky_2Array == null) {
            if (component instanceof JComponent) {
                ((JComponent)component).removeAncestorListener(this.n);
            }
            this.w();
        }
    }

    public WF p() {
        Component component;
        Component component2;
        ky_2[] ky_2Array;
        Component component3;
        block14: {
            block15: {
                WF wF;
                block18: {
                    block19: {
                        WF wF2;
                        block23: {
                            block24: {
                                block22: {
                                    boolean bl;
                                    boolean bl2;
                                    block20: {
                                        block21: {
                                            boolean bl3;
                                            block16: {
                                                block17: {
                                                    component3 = this.N();
                                                    ky_2Array = ac_0.n();
                                                    component2 = this;
                                                    if (ky_2Array != null) break block14;
                                                    if (((wd_0)component2).W == null) break block15;
                                                    bl3 = this.W.equals((Object)WF.leading);
                                                    if (ky_2Array != null) break block16;
                                                    if (bl3) break block17;
                                                    wF = this.W;
                                                    if (ky_2Array != null) break block18;
                                                    if (!wF.equals((Object)WF.trailing)) break block19;
                                                }
                                                bl3 = component3.getComponentOrientation().isLeftToRight();
                                            }
                                            bl2 = bl3;
                                            bl = this.W.equals((Object)WF.leading);
                                            if (ky_2Array != null) break block20;
                                            if (!bl) break block21;
                                            bl = bl2;
                                            if (ky_2Array != null) break block20;
                                            if (bl) break block22;
                                        }
                                        wF2 = this.W;
                                        if (ky_2Array != null) break block23;
                                        bl = wF2.equals((Object)WF.trailing);
                                    }
                                    if (!bl || bl2) break block24;
                                }
                                return WF.left;
                            }
                            wF2 = WF.right;
                        }
                        return wF2;
                    }
                    wF = this.W;
                }
                return wF;
            }
            component2 = component3;
        }
        if (ky_2Array == null) {
            if (!component2.isShowing()) {
                return WF.down;
            }
            component2 = SwingUtilities.getRootPane(component3).getGlassPane();
        }
        Component component4 = component = component2;
        if (ky_2Array == null) {
            if (!component4.isShowing()) {
                return WF.down;
            }
            component4 = component;
        }
        Dimension dimension = component4.getSize();
        Rectangle rectangle = FN.J(component3, component);
        Dimension dimension2 = this.getPreferredSize();
        int n10 = rectangle.y + this.e((Component)component3, (WF)WF.down).y + dimension2.height;
        int n11 = dimension.height - this.X;
        if (ky_2Array == null) {
            if (n10 < n11) {
                return WF.down;
            }
            n10 = rectangle.y + this.e((Component)component3, (WF)WF.up).y - dimension2.height;
            n11 = this.X;
        }
        if (ky_2Array == null) {
            if (n10 > n11) {
                return WF.up;
            }
            n10 = rectangle.x + this.e((Component)component3, (WF)WF.right).x + dimension2.width;
            n11 = dimension.width - this.X;
        }
        if (ky_2Array == null) {
            if (n10 < n11) {
                return WF.right;
            }
            n10 = rectangle.x + this.e((Component)component3, (WF)WF.left).x - dimension2.width;
            n11 = this.X;
        }
        if (n10 > n11) {
            return WF.left;
        }
        return WF.down;
    }

    private Point e(Component component, WF wF) {
        ky_2[] ky_2Array = ac_0.n();
        Point point = this.T;
        if (ky_2Array == null) {
            if (point == null) {
                boolean bl = wF.equals((Object)WF.down);
                if (ky_2Array == null) {
                    if (bl) {
                        return new Point(component.getWidth() / 2, component.getHeight() - L / 2 + this.H);
                    }
                    bl = wF.equals((Object)WF.up);
                }
                if (ky_2Array == null) {
                    if (bl) {
                        return new Point(component.getWidth() / 2, L / 2 - this.H);
                    }
                    bl = wF.equals((Object)WF.left);
                }
                if (bl) {
                    return new Point(L / 2 - this.H, this.getHeight() / 2);
                }
                return new Point(component.getWidth() - L / 2 + this.H, this.getHeight() / 2);
            }
            point = this.T;
        }
        return point;
    }

    public void N() {
        WF wF = this.p();
        ky_2[] ky_2Array = ac_0.n();
        int n10 = wF.equals((Object)WF.right);
        if (ky_2Array == null) {
            n10 = n10 != 0 ? L : 0;
        }
        int n11 = this.H + this.d + this.K + n10;
        int n12 = wF.equals((Object)WF.left);
        if (ky_2Array == null) {
            n12 = n12 != 0 ? L : 0;
        }
        int n13 = this.H + this.d + this.K + n12;
        int n14 = wF.equals((Object)WF.down);
        if (ky_2Array == null) {
            n14 = n14 != 0 ? L : 0;
        }
        int n15 = this.H + this.d + n14;
        int n16 = wF.equals((Object)WF.up);
        if (ky_2Array == null) {
            n16 = n16 != 0 ? L : 0;
        }
        int n17 = this.H + this.d + n16;
        Insets insets = this.x();
        this.setBorder(BorderFactory.createEmptyBorder(n15 + insets.top, n11 + insets.left, n17 + insets.bottom, n13 + insets.right));
        this.revalidate();
        if (ky_2.F() != null) {
            ac_0.G(new ky_2[4]);
        }
    }

    /*
     * Exception decompiling
     */
    private Insets x() {
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
    public void applyComponentOrientation(ComponentOrientation componentOrientation) {
        super.applyComponentOrientation(componentOrientation);
        this.j();
    }

    public int N() {
        return this.d;
    }

    public void S(int n10) {
        this.d = n10;
        this.N();
    }

    public int Y() {
        return this.K;
    }

    public void t(int n10) {
        this.K = n10;
        this.N();
        this.t();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void t() {
        block27: {
            block46: {
                block60: {
                    block59: {
                        block57: {
                            block58: {
                                block56: {
                                    block50: {
                                        block51: {
                                            block52: {
                                                block55: {
                                                    block53: {
                                                        block54: {
                                                            block49: {
                                                                block48: {
                                                                    block47: {
                                                                        block31: {
                                                                            block32: {
                                                                                block43: {
                                                                                    block45: {
                                                                                        block44: {
                                                                                            block41: {
                                                                                                block42: {
                                                                                                    block40: {
                                                                                                        block34: {
                                                                                                            block35: {
                                                                                                                block36: {
                                                                                                                    block39: {
                                                                                                                        block37: {
                                                                                                                            block38: {
                                                                                                                                block33: {
                                                                                                                                    block30: {
                                                                                                                                        block29: {
                                                                                                                                            block28: {
                                                                                                                                                block26: {
                                                                                                                                                    var2_1 = this.N();
                                                                                                                                                    var1_2 = ac_0.n();
                                                                                                                                                    v0 = this.getParent();
                                                                                                                                                    if (var1_2 != null) break block26;
                                                                                                                                                    if (v0 == null) break block27;
                                                                                                                                                    v0 = this.getParent();
                                                                                                                                                }
                                                                                                                                                v1 = v0.isShowing();
                                                                                                                                                if (var1_2 != null) break block28;
                                                                                                                                                if (!v1) break block27;
                                                                                                                                                v1 = var2_1.isShowing();
                                                                                                                                            }
                                                                                                                                            if (!v1) break block27;
                                                                                                                                            var3_3 = this.p();
                                                                                                                                            var4_4 = this.getParent().getLocationOnScreen();
                                                                                                                                            var5_5 = var2_1.getLocationOnScreen();
                                                                                                                                            var6_6 = this.getPreferredSize();
                                                                                                                                            var7_7 = var5_5.x - var4_4.x;
                                                                                                                                            var8_8 = var5_5.y - var4_4.y;
                                                                                                                                            v2 = var3_3.equals((Object)WF.up);
                                                                                                                                            if (var1_2 != null) break block29;
                                                                                                                                            if (v2) break block30;
                                                                                                                                            v2 = var3_3.equals((Object)WF.down);
                                                                                                                                        }
                                                                                                                                        if (var1_2 != null) break block31;
                                                                                                                                        if (!v2) break block32;
                                                                                                                                    }
                                                                                                                                    v3 = this;
                                                                                                                                    if (var1_2 != null) break block33;
                                                                                                                                    if (v3.T != null) break block34;
                                                                                                                                    v3 = this;
                                                                                                                                }
                                                                                                                                v4 = v3.N;
                                                                                                                                if (var1_2 != null) break block35;
                                                                                                                                if (v4 != null) break block36;
                                                                                                                                v5 /* !! */  = var11_9 /* !! */  = this.y();
                                                                                                                                if (var1_2 != null) break block37;
                                                                                                                                if (v5 /* !! */  != null) break block38;
                                                                                                                                var9_16 = var7_7 + var2_1.getWidth() / 2;
                                                                                                                                v6 = var3_3.equals((Object)WF.up);
                                                                                                                                if (var1_2 != null) ** GOTO lbl46
                                                                                                                                if (v6 != 0) {
                                                                                                                                    v7 = wd_0.L / 2 - this.H - var6_6.height;
                                                                                                                                } else {
                                                                                                                                    v6 = var2_1.getHeight() - wd_0.L / 2;
lbl46:
                                                                                                                                    // 2 sources

                                                                                                                                    v7 = v6 + this.H;
                                                                                                                                }
                                                                                                                                var10_17 = var8_8 + v7;
                                                                                                                                if (var1_2 == null) break block39;
                                                                                                                            }
                                                                                                                            v5 /* !! */  = var11_9 /* !! */ ;
                                                                                                                        }
                                                                                                                        var12_18 = FN.J((Component)v5 /* !! */ , var2_1);
                                                                                                                        var9_16 = var7_7 + var12_18.x + var12_18.width / 2;
                                                                                                                        v8 = var8_8 + var12_18.y;
                                                                                                                        v9 = var3_3.equals((Object)WF.up);
                                                                                                                        if (var1_2 != null) ** GOTO lbl61
                                                                                                                        if (v9 != 0) {
                                                                                                                            v10 = wd_0.L / 2 - this.H - var6_6.height;
                                                                                                                        } else {
                                                                                                                            v9 = var12_18.height - wd_0.L / 2;
lbl61:
                                                                                                                            // 2 sources

                                                                                                                            v10 = v9 + this.H;
                                                                                                                        }
                                                                                                                        var10_17 = v8 + v10;
                                                                                                                    }
                                                                                                                    if (var1_2 == null) break block40;
                                                                                                                }
                                                                                                                v4 = this.N;
                                                                                                            }
                                                                                                            var11_9 /* !! */  = v4;
                                                                                                            var9_16 = var7_7 + var11_9 /* !! */ .x + var11_9 /* !! */ .width / 2;
                                                                                                            v11 = var8_8 + var11_9 /* !! */ .y;
                                                                                                            v12 = var3_3.equals((Object)WF.up);
                                                                                                            if (var1_2 != null) ** GOTO lbl77
                                                                                                            if (v12 != 0) {
                                                                                                                v13 = wd_0.L / 2 - this.H - var6_6.height;
                                                                                                            } else {
                                                                                                                v12 = var11_9 /* !! */ .height - wd_0.L / 2;
lbl77:
                                                                                                                // 2 sources

                                                                                                                v13 = v12 + this.H;
                                                                                                            }
                                                                                                            var10_17 = v11 + v13;
                                                                                                            if (var1_2 == null) break block40;
                                                                                                        }
                                                                                                        var9_16 = var7_7 + this.T.x;
                                                                                                        v14 = var8_8 + this.T.y;
                                                                                                        v15 = var3_3.equals((Object)WF.up);
                                                                                                        if (var1_2 == null) {
                                                                                                            v15 = v15 != 0 ? var6_6.height : 0;
                                                                                                        }
                                                                                                        var10_17 = v14 - v15;
                                                                                                    }
                                                                                                    v16 = var9_16 - var6_6.width / 2;
                                                                                                    v17 = this.X;
                                                                                                    if (var1_2 != null) break block41;
                                                                                                    if (v16 >= v17) break block42;
                                                                                                    var11_10 = this.X - (var9_16 - var6_6.width / 2);
                                                                                                    this.P = Math.max(this.H + this.u + wd_0.Z + 1, this.getWidth() / 2 - var11_10);
                                                                                                    this.setLocation(this.X, var10_17);
                                                                                                    if (var1_2 == null) break block43;
                                                                                                }
                                                                                                v16 = var9_16 + var6_6.width / 2;
                                                                                                v17 = this.getParent().getWidth() - this.X;
                                                                                            }
                                                                                            if (var1_2 != null) break block44;
                                                                                            if (v16 <= v17) break block45;
                                                                                            v16 = var9_16 + var6_6.width / 2;
                                                                                            v17 = this.getParent().getWidth() - this.X;
                                                                                        }
                                                                                        var11_11 = v16 - v17;
                                                                                        this.P = Math.min(var6_6.width - this.H - this.u - wd_0.Z - 1, this.getWidth() / 2 + var11_11);
                                                                                        this.setLocation(this.getParent().getWidth() - this.X - var6_6.width, var10_17);
                                                                                        if (var1_2 == null) break block43;
                                                                                    }
                                                                                    this.P = this.getWidth() / 2;
                                                                                    this.setLocation(var9_16 - var6_6.width / 2, var10_17);
                                                                                }
                                                                                if (var1_2 == null) break block46;
                                                                            }
                                                                            v2 = var3_3.equals((Object)WF.left);
                                                                        }
                                                                        if (var1_2 != null) break block47;
                                                                        if (v2) break block48;
                                                                        v2 = var3_3.equals((Object)WF.right);
                                                                    }
                                                                    if (!v2) break block46;
                                                                }
                                                                v18 = this;
                                                                if (var1_2 != null) break block49;
                                                                if (v18.T != null) break block50;
                                                                v18 = this;
                                                            }
                                                            v19 = v18.N;
                                                            if (var1_2 != null) break block51;
                                                            if (v19 != null) break block52;
                                                            v20 = var11_12 = this.y();
                                                            if (var1_2 != null) break block53;
                                                            if (v20 != null) break block54;
                                                            var9_16 = var8_8 + var2_1.getHeight() / 2;
                                                            v21 = var3_3.equals((Object)WF.left);
                                                            if (var1_2 != null) ** GOTO lbl141
                                                            if (v21 != 0) {
                                                                v22 = wd_0.L / 2 - this.H - var6_6.width;
                                                            } else {
                                                                v21 = var2_1.getWidth() - wd_0.L / 2;
lbl141:
                                                                // 2 sources

                                                                v22 = v21 + this.H;
                                                            }
                                                            var10_17 = var7_7 + v22;
                                                            if (var1_2 == null) break block55;
                                                        }
                                                        v20 = var11_12;
                                                    }
                                                    var12_18 = FN.J(v20, var2_1);
                                                    var9_16 = var8_8 + var12_18.y + var12_18.height / 2;
                                                    v23 = var7_7 + var12_18.x;
                                                    v24 = var3_3.equals((Object)WF.left);
                                                    if (var1_2 != null) ** GOTO lbl156
                                                    if (v24 != 0) {
                                                        v25 = wd_0.L / 2 - this.H - var6_6.width;
                                                    } else {
                                                        v24 = var12_18.width - wd_0.L / 2;
lbl156:
                                                        // 2 sources

                                                        v25 = v24 + this.H;
                                                    }
                                                    var10_17 = v23 + v25;
                                                }
                                                if (var1_2 == null) break block56;
                                            }
                                            v19 = this.N;
                                        }
                                        var11_13 = v19;
                                        var9_16 = var8_8 + var11_13.y + var11_13.height / 2;
                                        v26 = var7_7 + var11_13.x;
                                        v27 = var3_3.equals((Object)WF.left);
                                        if (var1_2 != null) ** GOTO lbl172
                                        if (v27 != 0) {
                                            v28 = wd_0.L / 2 - this.H - var6_6.width;
                                        } else {
                                            v27 = var11_13.width - wd_0.L / 2;
lbl172:
                                            // 2 sources

                                            v28 = v27 + this.H;
                                        }
                                        var10_17 = v26 + v28;
                                        if (var1_2 == null) break block56;
                                    }
                                    var9_16 = var8_8 + this.T.y;
                                    v29 = var7_7 + this.T.x;
                                    v30 = var3_3.equals((Object)WF.left);
                                    if (var1_2 == null) {
                                        v30 = v30 != 0 ? var6_6.width : 0;
                                    }
                                    var10_17 = v29 - v30;
                                }
                                v31 = var9_16 - var6_6.height / 2;
                                v32 = this.X;
                                if (var1_2 != null) break block57;
                                if (v31 >= v32) break block58;
                                var11_14 = this.X - (var9_16 - var6_6.height / 2);
                                this.P = Math.max(this.H + this.u + wd_0.Z + 1, this.getHeight() / 2 - var11_14);
                                this.setLocation(var10_17, this.X);
                                if (var1_2 == null) break block46;
                            }
                            v31 = var9_16 + var6_6.height / 2;
                            v32 = this.getParent().getHeight() - this.X;
                        }
                        if (var1_2 != null) break block59;
                        if (v31 <= v32) break block60;
                        v31 = var9_16 + var6_6.height / 2;
                        v32 = this.getParent().getHeight() - this.X;
                    }
                    var11_15 = v31 - v32;
                    this.P = Math.min(var6_6.height - this.H - this.u - wd_0.Z - 1, this.getHeight() / 2 + var11_15);
                    this.setLocation(var10_17, this.getParent().getHeight() - this.X - var6_6.height);
                    if (var1_2 == null) break block46;
                }
                this.P = this.getHeight() / 2;
                this.setLocation(var10_17, var9_16 - var6_6.height / 2);
            }
            this.setSize(this.getPreferredSize());
        }
    }

    public Point C() {
        return this.T;
    }

    public void d(int n10, int n11) {
        this.G(new Point(n10, n11));
    }

    public void G(Point point) {
        this.T = point;
        this.t();
    }

    public Rectangle j() {
        return this.N;
    }

    public void Q(Rectangle rectangle) {
        this.N = rectangle;
        this.t();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Component y() {
        ky_2[] ky_2Array = ac_0.n();
        WeakReference weakReference = this.e;
        if (ky_2Array == null) {
            if (weakReference == null) return null;
            weakReference = this.e.get();
        }
        Component component = (Component)((Object)weakReference);
        return component;
    }

    public void L(Component component) {
        this.e = new WeakReference<Component>(component);
        this.t();
    }

    public int h() {
        return this.X;
    }

    public void N(int n10) {
        this.X = n10;
        this.t();
    }

    public int H() {
        return this.u;
    }

    public void J(int n10) {
        this.u = n10;
        this.t();
    }

    public int r() {
        return this.H;
    }

    public void Y(int n10) {
        this.H = n10;
        this.N();
        this.t();
    }

    public Color q() {
        return this.t;
    }

    public void H(Color color) {
        this.t = color;
        this.repaint();
    }

    public Component N() {
        return (Component)this.C.get();
    }

    public String j() {
        return this.i;
    }

    public JComponent T() {
        return this.x;
    }

    public void a(String string) {
        block3: {
            JComponent jComponent;
            block4: {
                ky_2[] ky_2Array;
                block2: {
                    ky_2Array = ac_0.n();
                    jComponent = this.x;
                    if (ky_2Array != null) break block2;
                    if (jComponent == null) break block3;
                    jComponent = this.x;
                }
                if (ky_2Array != null) break block4;
                if (!(jComponent instanceof JLabel)) break block3;
                jComponent = this.x;
            }
            ((JLabel)jComponent).setText(string);
            this.N();
            this.t();
        }
    }

    public void K(JComponent jComponent) {
        ky_2[] ky_2Array = ac_0.n();
        wd_0 wd_02 = this;
        if (ky_2Array == null) {
            if (wd_02.x != null) {
                this.remove(this.x);
            }
            this.x = jComponent;
            this.add((Component)jComponent, wd_0.a(27623, 15637));
            this.N();
            wd_02 = this;
        }
        wd_02.t();
    }

    public WF k() {
        return this.W;
    }

    public void A(WF wF) {
        this.W = wF;
        this.N();
        this.t();
    }

    public boolean k() {
        return this.c;
    }

    public void e(boolean bl) {
        this.c = bl;
        this.x();
        this.N();
        this.t();
    }

    public int k() {
        return this.f;
    }

    public void D(int n10) {
        this.f = n10;
        this.x();
        this.N();
        this.t();
    }

    public boolean R() {
        return this.m;
    }

    public void X(boolean bl) {
        this.m = bl;
    }

    public Color F() {
        return this.J;
    }

    public void e(Color color) {
        this.J = color;
    }

    public Color Z() {
        return this.M.getForeground();
    }

    public void Z(Color color) {
        this.M.setForeground(color);
    }

    public Color N() {
        return this.E;
    }

    public void K(Color color) {
        this.E = color;
    }

    public Color I() {
        return this.I;
    }

    public void n(Color color) {
        this.I = color;
    }

    public Color t() {
        return this.w;
    }

    public void y(Color color) {
        this.w = color;
    }

    public float j() {
        return this.r;
    }

    public void k(float f10) {
        this.r = f10;
    }

    @Override
    public Shape B() {
        return this.f(this.p(), true);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Color color;
        Shape shape;
        Composite composite;
        Object object;
        Graphics2D graphics2D;
        block13: {
            block14: {
                WF wF;
                block17: {
                    block15: {
                        ky_2[] ky_2Array;
                        block16: {
                            block11: {
                                wd_0 wd_02;
                                block12: {
                                    block10: {
                                        super.paintComponent(graphics);
                                        graphics2D = (Graphics2D)graphics;
                                        ky_2Array = ac_0.n();
                                        object = RV.X(graphics2D);
                                        if (this.q < 1.0f) {
                                            RV.p(graphics2D, Float.valueOf(this.q));
                                        }
                                        composite = null;
                                        if (this.r < 1.0f) {
                                            composite = RV.p(graphics2D, Float.valueOf(this.r));
                                        }
                                        wF = this.p();
                                        shape = null;
                                        wd_02 = this;
                                        if (ky_2Array != null) break block10;
                                        if (wd_02.H <= 0) break block11;
                                        wd_02 = this;
                                    }
                                    if (ky_2Array != null) break block12;
                                    if (wd_02.t == null) break block11;
                                    wd_02 = this;
                                }
                                shape = wd_02.f(wF, false);
                            }
                            RV.y(graphics2D, shape, B7.l, this.t, this.H);
                            color = this.E;
                            if (ky_2Array != null) break block13;
                            if (color == null) break block14;
                            if (this.I == null) break block15;
                            if (!wF.equals((Object)WF.down)) break block16;
                            graphics2D.setPaint(new GradientPaint(0.0f, this.getHeight() * 2 / 3, this.E, 0.0f, this.getHeight(), this.I));
                            if (ky_2Array == null) break block17;
                        }
                        graphics2D.setPaint(new GradientPaint(0.0f, this.getHeight() / 3, this.E, 0.0f, this.getHeight(), this.I));
                        if (ky_2Array == null) break block17;
                    }
                    graphics2D.setPaint(this.E);
                }
                graphics2D.fill(this.f(wF, true));
            }
            color = this.w;
        }
        if (color != null) {
            graphics2D.setPaint(this.w);
            graphics2D.draw(shape);
        }
        if (composite != null) {
            RV.c(graphics2D, composite);
        }
        RV.X(graphics2D, object);
    }

    /*
     * Exception decompiling
     */
    private Shape f(WF var1_1, boolean var2_2) {
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

    public void e(ij_1 ij_12) {
        this.k.add(ij_12);
    }

    public void R(ij_1 ij_12) {
        this.k.remove(ij_12);
    }

    public void b() {
        this.k.clear();
    }

    private void y() {
        Iterator iterator = aL.J((Collection)this.k).iterator();
        ky_2[] ky_2Array = ac_0.n();
        while (iterator.hasNext()) {
            ij_1 ij_12 = (ij_1)iterator.next();
            ij_12.R();
            if (ky_2Array == null) continue;
        }
    }

    private void n() {
        Iterator iterator = aL.J((Collection)this.k).iterator();
        ky_2[] ky_2Array = ac_0.n();
        while (iterator.hasNext()) {
            ij_1 ij_12 = (ij_1)iterator.next();
            ij_12.G();
            if (ky_2Array == null) continue;
        }
    }

    private void F() {
        Iterator iterator = aL.J((Collection)this.k).iterator();
        ky_2[] ky_2Array = ac_0.n();
        while (iterator.hasNext()) {
            ij_1 ij_12 = (ij_1)iterator.next();
            ij_12.d();
            if (ky_2Array == null) continue;
        }
    }

    private void w() {
        Iterator iterator = aL.J((Collection)this.k).iterator();
        ky_2[] ky_2Array = ac_0.n();
        while (iterator.hasNext()) {
            ij_1 ij_12 = (ij_1)iterator.next();
            ij_12.M();
            if (ky_2Array == null) continue;
        }
    }

    public static O_ B(Icon icon, String string) {
        O_ o_ = new O_(string, icon);
        o_.S(wd_0.a(27619, 29080));
        o_.setFont(G2.b());
        return o_;
    }

    static long J() {
        return R;
    }

    static int x() {
        return Y;
    }

    static ic_1 q(wd_0 wd_02) {
        return wd_02.a;
    }

    static float Y(wd_0 wd_02) {
        return wd_02.q;
    }

    static float F(wd_0 wd_02, float f10) {
        wd_02.q = f10;
        return wd_02.q;
    }

    static void Y(wd_0 wd_02) {
        wd_02.n();
    }

    static WC N(wd_0 wd_02) {
        return wd_02.v;
    }

    static void L(wd_0 wd_02) {
        wd_02.x();
    }

    static ic_1 D(wd_0 wd_02, ic_1 ic_12) {
        wd_02.a = ic_12;
        return wd_02.a;
    }

    static void A(wd_0 wd_02) {
        wd_02.y();
    }

    static void I(wd_0 wd_02) {
        wd_02.F();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "!*\u0087\u0098\u00b5\u0014=GeU\u0013e0\\F\u00a04/V\u0092\u00e7\u00e7\u00abm\u0090\u00b7\u0006\u00fcKd\u00c6\u0087\b\u0005r\u0095\u00edo\u00f8\u0004\u00ec\u009b\u00ed\u00dc\u0006BK\u00b3\u00c6}\b\u0015d\u00c1\u00ed\u00a0+\u00147\u00b4\u00d6\u00feg\u00a3Z\u007f\u0087\u00c2$R\u00c3\u00dc\u00ad\u0006\u0080\u0012\u00c2\u00f6Ma";
                        var12_3 = "!*\u0087\u0098\u00b5\u0014=GeU\u0013e0\\F\u00a04/V\u0092\u00e7\u00e7\u00abm\u0090\u00b7\u0006\u00fcKd\u00c6\u0087\b\u0005r\u0095\u00edo\u00f8\u0004\u00ec\u009b\u00ed\u00dc\u0006BK\u00b3\u00c6}\b\u0015d\u00c1\u00ed\u00a0+\u00147\u00b4\u00d6\u00feg\u00a3Z\u007f\u0087\u00c2$R\u00c3\u00dc\u00ad\u0006\u0080\u0012\u00c2\u00f6Ma".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 102;
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
                            var10_2 = "k\u00c6\u00a9\u0017\u0003Yb\u0098";
                            var12_3 = "k\u00c6\u00a9\u0017\u0003Yb\u0098".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 43;
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
                                    v15 = 97;
                                    break;
                                }
                                case 1: {
                                    v15 = 102;
                                    break;
                                }
                                case 2: {
                                    v15 = 56;
                                    break;
                                }
                                case 3: {
                                    v15 = 116;
                                    break;
                                }
                                case 4: {
                                    v15 = 96;
                                    break;
                                }
                                case 5: {
                                    v15 = 124;
                                    break;
                                }
                                default: {
                                    v15 = 91;
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
                wd_0.b = var13;
                wd_0.g = new String[10];
                var0_7 = 8012813881211990188L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "y\u0010\u00a9\\8\u001e\u001a\u00a0\u0002\u0005`F\u00e4\u00c7:\u00ef\u00der\u0083\u001ci\u001e\u00f50";
                var5_11 = "y\u0010\u00a9\\8\u001e\u001a\u00a0\u0002\u0005`F\u00e4\u00c7:\u00ef\u00der\u0083\u001ci\u001e\u00f50".length();
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
                    var4_10 = "k4x\u0092\u00f6$\u00f1\u0014\u00e6\u001b\u00e4\u00a2\u009aP\u00fbv";
                    var5_11 = "k4x\u0092\u00f6$\u00f1\u0014\u00e6\u001b\u00e4\u00a2\u009aP\u00fbv".length();
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
        wd_0.h = var6_8;
        wd_0.j = new Integer[5];
        wd_0.Y = B7.r;
        wd_0.R = B7.T;
        wd_0.L = B7.e;
        wd_0.Z = B7.W;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6BE2) & 0xFFFF;
        if (g[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 172;
                    break;
                }
                case 1: {
                    n14 = 137;
                    break;
                }
                case 2: {
                    n14 = 64;
                    break;
                }
                case 3: {
                    n14 = 138;
                    break;
                }
                case 4: {
                    n14 = 204;
                    break;
                }
                case 5: {
                    n14 = 178;
                    break;
                }
                case 6: {
                    n14 = 90;
                    break;
                }
                case 7: {
                    n14 = 167;
                    break;
                }
                case 8: {
                    n14 = 246;
                    break;
                }
                case 9: {
                    n14 = 17;
                    break;
                }
                case 10: {
                    n14 = 225;
                    break;
                }
                case 11: {
                    n14 = 186;
                    break;
                }
                case 12: {
                    n14 = 98;
                    break;
                }
                case 13: {
                    n14 = 28;
                    break;
                }
                case 14: {
                    n14 = 68;
                    break;
                }
                case 15: {
                    n14 = 29;
                    break;
                }
                case 16: {
                    n14 = 1;
                    break;
                }
                case 17: {
                    n14 = 76;
                    break;
                }
                case 18: {
                    n14 = 128;
                    break;
                }
                case 19: {
                    n14 = 59;
                    break;
                }
                case 20: {
                    n14 = 42;
                    break;
                }
                case 21: {
                    n14 = 183;
                    break;
                }
                case 22: {
                    n14 = 36;
                    break;
                }
                case 23: {
                    n14 = 247;
                    break;
                }
                case 24: {
                    n14 = 215;
                    break;
                }
                case 25: {
                    n14 = 158;
                    break;
                }
                case 26: {
                    n14 = 152;
                    break;
                }
                case 27: {
                    n14 = 37;
                    break;
                }
                case 28: {
                    n14 = 109;
                    break;
                }
                case 29: {
                    n14 = 230;
                    break;
                }
                case 30: {
                    n14 = 243;
                    break;
                }
                case 31: {
                    n14 = 196;
                    break;
                }
                case 32: {
                    n14 = 220;
                    break;
                }
                case 33: {
                    n14 = 252;
                    break;
                }
                case 34: {
                    n14 = 153;
                    break;
                }
                case 35: {
                    n14 = 95;
                    break;
                }
                case 36: {
                    n14 = 127;
                    break;
                }
                case 37: {
                    n14 = 160;
                    break;
                }
                case 38: {
                    n14 = 13;
                    break;
                }
                case 39: {
                    n14 = 83;
                    break;
                }
                case 40: {
                    n14 = 151;
                    break;
                }
                case 41: {
                    n14 = 62;
                    break;
                }
                case 42: {
                    n14 = 170;
                    break;
                }
                case 43: {
                    n14 = 169;
                    break;
                }
                case 44: {
                    n14 = 93;
                    break;
                }
                case 45: {
                    n14 = 105;
                    break;
                }
                case 46: {
                    n14 = 213;
                    break;
                }
                case 47: {
                    n14 = 221;
                    break;
                }
                case 48: {
                    n14 = 119;
                    break;
                }
                case 49: {
                    n14 = 132;
                    break;
                }
                case 50: {
                    n14 = 216;
                    break;
                }
                case 51: {
                    n14 = 49;
                    break;
                }
                case 52: {
                    n14 = 210;
                    break;
                }
                case 53: {
                    n14 = 33;
                    break;
                }
                case 54: {
                    n14 = 107;
                    break;
                }
                case 55: {
                    n14 = 161;
                    break;
                }
                case 56: {
                    n14 = 101;
                    break;
                }
                case 57: {
                    n14 = 14;
                    break;
                }
                case 58: {
                    n14 = 63;
                    break;
                }
                case 59: {
                    n14 = 54;
                    break;
                }
                case 60: {
                    n14 = 206;
                    break;
                }
                case 61: {
                    n14 = 240;
                    break;
                }
                case 62: {
                    n14 = 73;
                    break;
                }
                case 63: {
                    n14 = 86;
                    break;
                }
                case 64: {
                    n14 = 219;
                    break;
                }
                case 65: {
                    n14 = 67;
                    break;
                }
                case 66: {
                    n14 = 217;
                    break;
                }
                case 67: {
                    n14 = 122;
                    break;
                }
                case 68: {
                    n14 = 223;
                    break;
                }
                case 69: {
                    n14 = 15;
                    break;
                }
                case 70: {
                    n14 = 162;
                    break;
                }
                case 71: {
                    n14 = 211;
                    break;
                }
                case 72: {
                    n14 = 182;
                    break;
                }
                case 73: {
                    n14 = 126;
                    break;
                }
                case 74: {
                    n14 = 168;
                    break;
                }
                case 75: {
                    n14 = 212;
                    break;
                }
                case 76: {
                    n14 = 236;
                    break;
                }
                case 77: {
                    n14 = 44;
                    break;
                }
                case 78: {
                    n14 = 50;
                    break;
                }
                case 79: {
                    n14 = 205;
                    break;
                }
                case 80: {
                    n14 = 229;
                    break;
                }
                case 81: {
                    n14 = 188;
                    break;
                }
                case 82: {
                    n14 = 129;
                    break;
                }
                case 83: {
                    n14 = 165;
                    break;
                }
                case 84: {
                    n14 = 141;
                    break;
                }
                case 85: {
                    n14 = 32;
                    break;
                }
                case 86: {
                    n14 = 79;
                    break;
                }
                case 87: {
                    n14 = 16;
                    break;
                }
                case 88: {
                    n14 = 235;
                    break;
                }
                case 89: {
                    n14 = 131;
                    break;
                }
                case 90: {
                    n14 = 222;
                    break;
                }
                case 91: {
                    n14 = 39;
                    break;
                }
                case 92: {
                    n14 = 102;
                    break;
                }
                case 93: {
                    n14 = 194;
                    break;
                }
                case 94: {
                    n14 = 85;
                    break;
                }
                case 95: {
                    n14 = 135;
                    break;
                }
                case 96: {
                    n14 = 96;
                    break;
                }
                case 97: {
                    n14 = 65;
                    break;
                }
                case 98: {
                    n14 = 7;
                    break;
                }
                case 99: {
                    n14 = 92;
                    break;
                }
                case 100: {
                    n14 = 253;
                    break;
                }
                case 101: {
                    n14 = 52;
                    break;
                }
                case 102: {
                    n14 = 106;
                    break;
                }
                case 103: {
                    n14 = 30;
                    break;
                }
                case 104: {
                    n14 = 200;
                    break;
                }
                case 105: {
                    n14 = 244;
                    break;
                }
                case 106: {
                    n14 = 175;
                    break;
                }
                case 107: {
                    n14 = 224;
                    break;
                }
                case 108: {
                    n14 = 43;
                    break;
                }
                case 109: {
                    n14 = 228;
                    break;
                }
                case 110: {
                    n14 = 2;
                    break;
                }
                case 111: {
                    n14 = 124;
                    break;
                }
                case 112: {
                    n14 = 226;
                    break;
                }
                case 113: {
                    n14 = 91;
                    break;
                }
                case 114: {
                    n14 = 136;
                    break;
                }
                case 115: {
                    n14 = 3;
                    break;
                }
                case 116: {
                    n14 = 99;
                    break;
                }
                case 117: {
                    n14 = 201;
                    break;
                }
                case 118: {
                    n14 = 150;
                    break;
                }
                case 119: {
                    n14 = 69;
                    break;
                }
                case 120: {
                    n14 = 24;
                    break;
                }
                case 121: {
                    n14 = 157;
                    break;
                }
                case 122: {
                    n14 = 251;
                    break;
                }
                case 123: {
                    n14 = 179;
                    break;
                }
                case 124: {
                    n14 = 113;
                    break;
                }
                case 125: {
                    n14 = 149;
                    break;
                }
                case 126: {
                    n14 = 100;
                    break;
                }
                case 127: {
                    n14 = 8;
                    break;
                }
                case 128: {
                    n14 = 134;
                    break;
                }
                case 129: {
                    n14 = 203;
                    break;
                }
                case 130: {
                    n14 = 0;
                    break;
                }
                case 131: {
                    n14 = 140;
                    break;
                }
                case 132: {
                    n14 = 77;
                    break;
                }
                case 133: {
                    n14 = 237;
                    break;
                }
                case 134: {
                    n14 = 185;
                    break;
                }
                case 135: {
                    n14 = 146;
                    break;
                }
                case 136: {
                    n14 = 46;
                    break;
                }
                case 137: {
                    n14 = 163;
                    break;
                }
                case 138: {
                    n14 = 123;
                    break;
                }
                case 139: {
                    n14 = 181;
                    break;
                }
                case 140: {
                    n14 = 176;
                    break;
                }
                case 141: {
                    n14 = 234;
                    break;
                }
                case 142: {
                    n14 = 11;
                    break;
                }
                case 143: {
                    n14 = 75;
                    break;
                }
                case 144: {
                    n14 = 104;
                    break;
                }
                case 145: {
                    n14 = 139;
                    break;
                }
                case 146: {
                    n14 = 9;
                    break;
                }
                case 147: {
                    n14 = 81;
                    break;
                }
                case 148: {
                    n14 = 233;
                    break;
                }
                case 149: {
                    n14 = 115;
                    break;
                }
                case 150: {
                    n14 = 10;
                    break;
                }
                case 151: {
                    n14 = 5;
                    break;
                }
                case 152: {
                    n14 = 97;
                    break;
                }
                case 153: {
                    n14 = 147;
                    break;
                }
                case 154: {
                    n14 = 241;
                    break;
                }
                case 155: {
                    n14 = 35;
                    break;
                }
                case 156: {
                    n14 = 174;
                    break;
                }
                case 157: {
                    n14 = 207;
                    break;
                }
                case 158: {
                    n14 = 71;
                    break;
                }
                case 159: {
                    n14 = 189;
                    break;
                }
                case 160: {
                    n14 = 27;
                    break;
                }
                case 161: {
                    n14 = 177;
                    break;
                }
                case 162: {
                    n14 = 173;
                    break;
                }
                case 163: {
                    n14 = 209;
                    break;
                }
                case 164: {
                    n14 = 171;
                    break;
                }
                case 165: {
                    n14 = 195;
                    break;
                }
                case 166: {
                    n14 = 82;
                    break;
                }
                case 167: {
                    n14 = 61;
                    break;
                }
                case 168: {
                    n14 = 23;
                    break;
                }
                case 169: {
                    n14 = 133;
                    break;
                }
                case 170: {
                    n14 = 40;
                    break;
                }
                case 171: {
                    n14 = 51;
                    break;
                }
                case 172: {
                    n14 = 218;
                    break;
                }
                case 173: {
                    n14 = 254;
                    break;
                }
                case 174: {
                    n14 = 57;
                    break;
                }
                case 175: {
                    n14 = 21;
                    break;
                }
                case 176: {
                    n14 = 56;
                    break;
                }
                case 177: {
                    n14 = 25;
                    break;
                }
                case 178: {
                    n14 = 148;
                    break;
                }
                case 179: {
                    n14 = 193;
                    break;
                }
                case 180: {
                    n14 = 22;
                    break;
                }
                case 181: {
                    n14 = 66;
                    break;
                }
                case 182: {
                    n14 = 238;
                    break;
                }
                case 183: {
                    n14 = 87;
                    break;
                }
                case 184: {
                    n14 = 159;
                    break;
                }
                case 185: {
                    n14 = 120;
                    break;
                }
                case 186: {
                    n14 = 26;
                    break;
                }
                case 187: {
                    n14 = 245;
                    break;
                }
                case 188: {
                    n14 = 154;
                    break;
                }
                case 189: {
                    n14 = 55;
                    break;
                }
                case 190: {
                    n14 = 111;
                    break;
                }
                case 191: {
                    n14 = 145;
                    break;
                }
                case 192: {
                    n14 = 164;
                    break;
                }
                case 193: {
                    n14 = 180;
                    break;
                }
                case 194: {
                    n14 = 31;
                    break;
                }
                case 195: {
                    n14 = 94;
                    break;
                }
                case 196: {
                    n14 = 190;
                    break;
                }
                case 197: {
                    n14 = 88;
                    break;
                }
                case 198: {
                    n14 = 198;
                    break;
                }
                case 199: {
                    n14 = 255;
                    break;
                }
                case 200: {
                    n14 = 156;
                    break;
                }
                case 201: {
                    n14 = 242;
                    break;
                }
                case 202: {
                    n14 = 80;
                    break;
                }
                case 203: {
                    n14 = 187;
                    break;
                }
                case 204: {
                    n14 = 4;
                    break;
                }
                case 205: {
                    n14 = 121;
                    break;
                }
                case 206: {
                    n14 = 214;
                    break;
                }
                case 207: {
                    n14 = 20;
                    break;
                }
                case 208: {
                    n14 = 117;
                    break;
                }
                case 209: {
                    n14 = 70;
                    break;
                }
                case 210: {
                    n14 = 84;
                    break;
                }
                case 211: {
                    n14 = 110;
                    break;
                }
                case 212: {
                    n14 = 114;
                    break;
                }
                case 213: {
                    n14 = 19;
                    break;
                }
                case 214: {
                    n14 = 184;
                    break;
                }
                case 215: {
                    n14 = 250;
                    break;
                }
                case 216: {
                    n14 = 89;
                    break;
                }
                case 217: {
                    n14 = 155;
                    break;
                }
                case 218: {
                    n14 = 72;
                    break;
                }
                case 219: {
                    n14 = 103;
                    break;
                }
                case 220: {
                    n14 = 6;
                    break;
                }
                case 221: {
                    n14 = 199;
                    break;
                }
                case 222: {
                    n14 = 47;
                    break;
                }
                case 223: {
                    n14 = 202;
                    break;
                }
                case 224: {
                    n14 = 12;
                    break;
                }
                case 225: {
                    n14 = 232;
                    break;
                }
                case 226: {
                    n14 = 143;
                    break;
                }
                case 227: {
                    n14 = 108;
                    break;
                }
                case 228: {
                    n14 = 38;
                    break;
                }
                case 229: {
                    n14 = 227;
                    break;
                }
                case 230: {
                    n14 = 58;
                    break;
                }
                case 231: {
                    n14 = 248;
                    break;
                }
                case 232: {
                    n14 = 60;
                    break;
                }
                case 233: {
                    n14 = 130;
                    break;
                }
                case 234: {
                    n14 = 74;
                    break;
                }
                case 235: {
                    n14 = 249;
                    break;
                }
                case 236: {
                    n14 = 116;
                    break;
                }
                case 237: {
                    n14 = 78;
                    break;
                }
                case 238: {
                    n14 = 231;
                    break;
                }
                case 239: {
                    n14 = 144;
                    break;
                }
                case 240: {
                    n14 = 112;
                    break;
                }
                case 241: {
                    n14 = 239;
                    break;
                }
                case 242: {
                    n14 = 208;
                    break;
                }
                case 243: {
                    n14 = 166;
                    break;
                }
                case 244: {
                    n14 = 197;
                    break;
                }
                case 245: {
                    n14 = 34;
                    break;
                }
                case 246: {
                    n14 = 118;
                    break;
                }
                case 247: {
                    n14 = 45;
                    break;
                }
                case 248: {
                    n14 = 41;
                    break;
                }
                case 249: {
                    n14 = 53;
                    break;
                }
                case 250: {
                    n14 = 192;
                    break;
                }
                case 251: {
                    n14 = 191;
                    break;
                }
                case 252: {
                    n14 = 125;
                    break;
                }
                case 253: {
                    n14 = 48;
                    break;
                }
                case 254: {
                    n14 = 142;
                    break;
                }
                default: {
                    n14 = 18;
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
            wd_0.g[n12] = new String(cArray).intern();
        }
        return g[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x54C2;
        if (j[n11] == null) {
            wd_0.j[n11] = (int)(h[n11] ^ l2);
        }
        return j[n11];
    }
}

