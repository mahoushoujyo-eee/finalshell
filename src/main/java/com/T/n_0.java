/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.FN;
import com.GO;
import com.GR;
import com.KD;
import com.OM;
import com.O_;
import com.P9;
import com.TA;
import com.aL;
import com.ch_1;
import com.ix_1;
import com.kh_2;
import com.ky_2;
import com.ne_2;
import com.t.L;
import com.t.O;
import com.t.P;
import com.t.V;
import com.t.X;
import com.t.a_0;
import com.t.d_0;
import com.t.g;
import com.t.h;
import com.t.k;
import com.t.o_0;
import com.t.t;
import com.t.v_0;
import com.t.y;
import com.t.z;
import com.uE;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.t.n
 */
public class n_0
extends ky_2
implements OM {
    private final List O;
    private final List F;
    private boolean Q;
    private Boolean v;
    private Color E;
    private Color R;
    private int e;
    private boolean T;
    private final L l;
    private final X q;
    private final kh_2 h;
    private final ne_2 N;
    private final ne_2 J;
    private final ne_2 C;
    private final ne_2 z;
    private final ne_2 Y;
    private final ne_2 G;
    private final ne_2 p;
    private ky_2 b;
    private static int s;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] f;

    public n_0() {
        this(false);
    }

    public n_0(boolean bl) {
        int n10 = n_0.W();
        this.O = new ArrayList(1);
        this.F = new ArrayList(1);
        this.Q = false;
        this.v = false;
        this.E = Color.WHITE;
        this.R = Color.WHITE;
        int n11 = n10;
        this.e = n_0.a(3146, 4759396790005649098L);
        this.T = false;
        this.Q = bl;
        this.setOpaque(false);
        this.u(false);
        this.N(2, 5, 2, 5);
        this.setLayout(new ix_1(new double[][]{{-1.0, 4.0, -2.0, 4.0, -2.0}, {-2.0, -2.0}}));
        this.l = new L();
        this.l.setOpaque(false);
        this.l.i(this.X());
        t t2 = new t(this);
        this.l.N(t2);
        this.add((Component)this.l, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34693 out of bounds for length 5");
        this.q = new X();
        this.q.setOpaque(false);
        this.q.l(this.X());
        this.q.M(new k(this));
        this.add((Component)this.q, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34694 out of bounds for length 5");
        JPanel jPanel = new JPanel();
        double[][] dArrayArray = new double[2][];
        dArrayArray[0] = new double[]{-2.0, 4.0, -1.0};
        double[] dArray = new double[n_0.a(27058, 3230988660151069493L)];
        dArray[0] = 3.0;
        dArray[1] = -1.0;
        dArray[2] = 5.0;
        dArray[3] = -2.0;
        dArray[4] = 4.0;
        dArray[5] = -2.0;
        dArray[n_0.a((int)18138, (long)3174907967061197904L)] = 1.0;
        dArray[n_0.a((int)79, (long)9093449316102521545L)] = -2.0;
        dArray[n_0.a((int)1, (long)8566485516493308563L)] = 1.0;
        dArray[n_0.a((int)25957, (long)1764619541134387180L)] = -2.0;
        dArray[n_0.a((int)31851, (long)5864792948963786479L)] = 1.0;
        dArray[n_0.a((int)359, (long)1808594342504973290L)] = -2.0;
        dArray[n_0.a((int)19696, (long)2290747509416038015L)] = 3.0;
        dArrayArray[1] = dArray;
        jPanel.setLayout(new ix_1(dArrayArray));
        jPanel.setOpaque(false);
        this.add((Component)jPanel, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34717 out of bounds for length 5");
        this.h = new kh_2();
        this.h.W(new d_0(this));
        this.B(this.R);
        this.h.W(this.E);
        jPanel.add((Component)this.h, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34707 out of bounds for length 5");
        jPanel.add((Component)new ch_1(0), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34743 out of bounds for length 5");
        JPanel jPanel2 = new JPanel();
        double[][] dArrayArray2 = new double[2][];
        dArrayArray2[0] = new double[]{-1.0, 5.0, -2.0, 4.0, -2.0};
        double[] dArray2 = new double[n_0.a(23237, 4324947592443926596L)];
        dArray2[0] = -2.0;
        dArray2[1] = 0.0;
        dArray2[2] = -2.0;
        dArray2[3] = 0.0;
        dArray2[4] = -2.0;
        dArray2[5] = 1.0;
        dArray2[n_0.a((int)18088, (long)6210645615587394603L)] = -2.0;
        dArray2[n_0.a((int)8974, (long)4520898657246962048L)] = 1.0;
        dArray2[n_0.a((int)14937, (long)8810667321751271626L)] = -2.0;
        dArray2[n_0.a((int)31043, (long)5577110205764484038L)] = 0.0;
        dArray2[n_0.a((int)29312, (long)5473133976913621004L)] = -2.0;
        dArray2[n_0.a((int)26373, (long)6604833949661373838L)] = 0.0;
        dArray2[n_0.a((int)20705, (long)3128534266782388835L)] = -2.0;
        dArrayArray2[1] = dArray2;
        jPanel2.setLayout(new ix_1(dArrayArray2));
        jPanel2.setOpaque(false);
        jPanel.add((Component)jPanel2, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34709 out of bounds for length 5");
        O_ o_ = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34710 out of bounds for length 5");
        o_.D(true);
        jPanel2.add((Component)o_, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34716 out of bounds for length 5");
        this.N = new ne_2();
        jPanel2.add((Component)this.N, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34699 out of bounds for length 5");
        O_ o_2 = new O_("\u00b0");
        o_2.D(true);
        jPanel2.add((Component)o_2, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34711 out of bounds for length 5");
        O_ o_3 = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34714 out of bounds for length 5");
        o_3.D(true);
        jPanel2.add((Component)o_3, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34700 out of bounds for length 5");
        this.J = new ne_2();
        jPanel2.add((Component)this.J, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34688 out of bounds for length 5");
        O_ o_4 = new O_("%");
        o_4.D(true);
        jPanel2.add((Component)o_4, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34736 out of bounds for length 5");
        O_ o_5 = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34740 out of bounds for length 5");
        o_5.D(true);
        jPanel2.add((Component)o_5, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34704 out of bounds for length 5");
        this.C = new ne_2();
        jPanel2.add((Component)this.C, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34697 out of bounds for length 5");
        O_ o_6 = new O_("%");
        o_6.D(true);
        jPanel2.add((Component)o_6, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34719 out of bounds for length 5");
        g g10 = new g(this, t2);
        this.N.addCaretListener(g10);
        this.J.addCaretListener(g10);
        this.C.addCaretListener(g10);
        jPanel2.add((Component)new ch_1(0), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34703 out of bounds for length 5");
        O_ o_7 = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34691 out of bounds for length 5");
        o_7.D(true);
        jPanel2.add((Component)o_7, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34689 out of bounds for length 5");
        this.z = new ne_2();
        this.z.setColumns(3);
        jPanel2.add((Component)this.z, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34708 out of bounds for length 5");
        O_ o_8 = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34713 out of bounds for length 5");
        o_8.D(true);
        jPanel2.add((Component)o_8, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34701 out of bounds for length 5");
        this.Y = new ne_2();
        this.Y.setColumns(3);
        jPanel2.add((Component)this.Y, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34695 out of bounds for length 5");
        O_ o_9 = new O_("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34737 out of bounds for length 5");
        o_9.D(true);
        jPanel2.add((Component)o_9, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34742 out of bounds for length 5");
        this.G = new ne_2();
        this.G.setColumns(3);
        jPanel2.add((Component)this.G, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34712 out of bounds for length 5");
        P p2 = new P(this, t2);
        this.z.addCaretListener(p2);
        this.Y.addCaretListener(p2);
        this.G.addCaretListener(p2);
        jPanel.add((Component)new ch_1(0), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34690 out of bounds for length 5");
        O_ o_10 = new O_("#");
        o_10.D(true);
        jPanel.add((Component)o_10, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34738 out of bounds for length 5");
        this.p = new ne_2();
        this.b(this.R);
        h h10 = new h(this, t2);
        this.p.addCaretListener(h10);
        jPanel.add((Component)this.p, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34715 out of bounds for length 5");
        if (n11 != 0) {
            if (bl) {
                this.add((Component)this.J(), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34705 out of bounds for length 5");
            }
            this.F(this.E);
            this.x(this.R);
        }
        if (n11 == 0) {
            ky_2.K(new String[1]);
        }
    }

    private ky_2 J() {
        int n10 = n_0.W();
        ky_2 ky_22 = this.b;
        if (n10 != 0) {
            if (ky_22 == null) {
                this.b = this.t();
            }
            ky_22 = this.b;
        }
        return ky_22;
    }

    private ky_2 t() {
        ky_2 ky_22 = new ky_2(new TA(2, 0));
        int n10 = n_0.W();
        ky_22.setOpaque(false);
        ky_22.N(5, 0, 3, 0);
        int n11 = n10;
        uE uE2 = new uE();
        uE2.u("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34696 out of bounds for length 5", new Object[0]);
        uE2.setSelected(this.X());
        uE2.f(0, 5, 0, 5);
        uE2.addActionListener(new O(this, uE2));
        ky_22.add(uE2);
        KD kD = new KD();
        kD.u("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34718 out of bounds for length 5", new Object[0]);
        kD.Y(this, GR.lZ);
        if (n11 != 0) {
            if (GO.A) {
                kD.u(GO.Fv);
            }
            kD.addActionListener(new V(this));
            this.l.S().addMouseListener(new z(this, kD));
            ky_22.add((Component)kD, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34692 out of bounds for length 5");
        }
        KD kD2 = new KD();
        kD2.u("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34739 out of bounds for length 5", new Object[0]);
        kD2.Y(this, GR.rj);
        if (n11 != 0) {
            if (GO.A) {
                kD2.u(GO.C);
            }
            kD2.addActionListener(new y(this));
            ky_22.add((Component)kD2, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34698 out of bounds for length 5");
        }
        KD kD3 = new KD();
        kD3.u("\u0000ERR:ArrayIndexOutOfBoundsException:Index 34702 out of bounds for length 5", new Object[0]);
        kD3.Y(this, GR.lD);
        int n12 = GO.A;
        if (n11 != 0) {
            if (n12 != 0) {
                kD3.u(GO.FN);
            }
            kD3.addActionListener(new v_0(this));
            ky_22.add((Component)kD3, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34698 out of bounds for length 5");
            n12 = 3;
        }
        Component[] componentArray = new Component[n12];
        componentArray[0] = kD;
        componentArray[1] = kD2;
        componentArray[2] = kD3;
        FN.b(componentArray);
        return ky_22;
    }

    public boolean G() {
        return this.Q;
    }

    public void n(boolean bl) {
        block3: {
            block6: {
                n_0 n_02;
                block4: {
                    block5: {
                        boolean bl2;
                        int n10;
                        block2: {
                            n10 = n_0.W();
                            bl2 = this.Q;
                            if (n10 == 0) break block2;
                            if (bl2 == bl) break block3;
                            n_02 = this;
                            if (n10 == 0) break block4;
                            n_02.Q = bl;
                            bl2 = bl;
                        }
                        if (!bl2) break block5;
                        this.add((Component)this.J(), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 34706 out of bounds for length 5");
                        if (n10 != 0) break block6;
                    }
                    n_02 = this;
                }
                n_02.remove(this.J());
            }
            this.revalidate();
        }
    }

    public boolean X() {
        return this.v;
    }

    public void N(boolean bl) {
        this.v = bl;
        this.l.i(bl);
        this.q.l(bl);
    }

    private void q(Color color, a_0 a_02) {
        this.T = true;
        int n10 = n_0.W();
        boolean bl = a_02.equals((Object)a_0.palette);
        if (n10 != 0) {
            if (!bl) {
                this.D(color);
            }
            bl = a_02.equals((Object)a_0.doubleField);
        }
        if (n10 != 0) {
            if (!bl) {
                this.B(color);
            }
            bl = a_02.equals((Object)a_0.hsbField);
        }
        if (n10 != 0) {
            if (!bl) {
                this.k(color);
            }
            bl = a_02.equals((Object)a_0.rgbField);
        }
        if (n10 != 0) {
            if (!bl) {
                this.O(color);
            }
            bl = a_02.equals((Object)a_0.hexField);
        }
        if (!bl) {
            this.b(color);
        }
        this.T = false;
        this.r();
    }

    private void D(Color color) {
        this.q.C(color);
        this.l.K(color);
        this.l.p(color);
    }

    private void B(Color color) {
        this.h.K(color);
    }

    private void b(Color color) {
        this.p.setText(P9.u(color).substring(1));
    }

    private void O(Color color) {
        this.z.setText("" + color.getRed());
        this.Y.setText("" + color.getGreen());
        this.G.setText("" + color.getBlue());
    }

    private void k(Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        this.N.setText("" + this.q.K());
        this.J.setText("" + Math.round(100.0f * fArray[1]));
        this.C.setText("" + Math.round(100.0f * fArray[2]));
    }

    public Color T() {
        return this.R;
    }

    public void x(Color color) {
        this.R = color;
        this.F(color);
        this.q(color, a_0.outer);
    }

    public Color t() {
        return this.E;
    }

    public void F(Color color) {
        this.E = color;
        this.h.W(color);
    }

    public void Z() {
        this.q(n_0.a(18740, 1157121537617988540L));
    }

    public void q(int n10) {
        this.e = n10;
    }

    public int V() {
        return this.e;
    }

    public void M(ChangeListener changeListener) {
        this.O.add(changeListener);
    }

    public void L(ChangeListener changeListener) {
        this.O.remove(changeListener);
    }

    private void r() {
        ChangeEvent changeEvent = new ChangeEvent(this);
        int n10 = n_0.g();
        for (ChangeListener changeListener : aL.J((Collection)this.O)) {
            changeListener.stateChanged(changeEvent);
            if (n10 == 0) continue;
        }
    }

    public void T(o_0 o_02) {
        this.F.add(o_02);
    }

    public void U(o_0 o_02) {
        this.F.remove(o_02);
    }

    private void Q(ActionEvent actionEvent) {
        Iterator iterator = aL.J((Collection)this.F).iterator();
        int n10 = n_0.W();
        while (iterator.hasNext()) {
            o_0 o_02 = (o_0)iterator.next();
            o_02.H(actionEvent);
            if (n10 != 0) continue;
        }
    }

    private void x(ActionEvent actionEvent) {
        Iterator iterator = aL.J((Collection)this.F).iterator();
        int n10 = n_0.g();
        while (iterator.hasNext()) {
            o_0 o_02 = (o_0)iterator.next();
            o_02.j(actionEvent);
            if (n10 == 0) continue;
        }
    }

    private void k(ActionEvent actionEvent) {
        Iterator iterator = aL.J((Collection)this.F).iterator();
        int n10 = n_0.g();
        while (iterator.hasNext()) {
            o_0 o_02 = (o_0)iterator.next();
            o_02.r(actionEvent);
            if (n10 == 0) continue;
        }
    }

    static Color y(n_0 n_02, Color color) {
        n_02.R = color;
        return n_02.R;
    }

    static L r(n_0 n_02) {
        return n_02.l;
    }

    static Color c(n_0 n_02) {
        return n_02.R;
    }

    static void a(n_0 n_02, Color color, a_0 a_02) {
        n_02.q(color, a_02);
    }

    static X u(n_0 n_02) {
        return n_02.q;
    }

    static kh_2 P(n_0 n_02) {
        return n_02.h;
    }

    static boolean N(n_0 n_02) {
        return n_02.T;
    }

    static ne_2 t(n_0 n_02) {
        return n_02.N;
    }

    static ne_2 f(n_0 n_02) {
        return n_02.J;
    }

    static ne_2 o(n_0 n_02) {
        return n_02.C;
    }

    static ne_2 U(n_0 n_02) {
        return n_02.z;
    }

    static ne_2 Z(n_0 n_02) {
        return n_02.Y;
    }

    static ne_2 l(n_0 n_02) {
        return n_02.G;
    }

    static ne_2 E(n_0 n_02) {
        return n_02.p;
    }

    static int l(n_0 n_02, int n10) {
        n_02.e = n10;
        return n_02.e;
    }

    static void O(n_0 n_02, ActionEvent actionEvent) {
        n_02.Q(actionEvent);
    }

    static void D(n_0 n_02, ActionEvent actionEvent) {
        n_02.x(actionEvent);
    }

    static void c(n_0 n_02, ActionEvent actionEvent) {
        n_02.k(actionEvent);
    }

    public static void L(int n10) {
        s = n10;
    }

    public static int g() {
        return s;
    }

    public static int W() {
        int n10 = n_0.g();
        if (n10 == 0) {
            return 10;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[39];
                        var11_1 = 0;
                        var10_2 = "\u00e1\u00ec&\u00c4\u00b83\u009a\u0007\u001c\u0088\u0099HI\u00a2`\u0003>@\u00d8\u0007B\u00aeR\u008c6:K\u0002y\u00f9\u0003\u00f2\u0081\u00c1\u00035\u00f3\u00f7\u0007\u0090*\u000e\u001c}(\u00e2\u0002\u0017\u0098\u0004\u00f5\u00f4\u00e6\u00da\u0004\u00b1\u0001ng\u0002q\u0005\u001aY\u00b2\u00cd/\u00a9LX\u00f5Z\u00c0z\u00d4\u0080\u00c0\u00c5\u00c7T\u00c3\u00ba\u00b1\u0006\u0000u\u0017\u0083Z\u0003F'S\u0003\u00f0\b\u0005\u0003\u00f1\u00c6\u00a1\u0007\u00few\u00cd\u00b7\u00ca]\u001a\u0002}\u0086\u0003U.\u00f1\u0003y\u00f6<\u0003\u008c\u007f\u00c8\u0004\u0097\u00b0\u00aaS\u0003\u00f2<\u00ea\u0003\u009c\u000f\u0088\u0003\u00bav\u00e3\u0003;\">\u001b\u00af}\u0013\u00d6rs#\u00125<\u0097K=3r\u00b9\u00a2\fdH\u00c92\u0017\u00fd~\u000e;\u0003\u00c0\u00aeE\u001a\u0013\u001d\u0084\u00da\u0080\u00f2}\"\u00fe:\u00ee\u008b\u0012+\u0097\u00ba\u001el\u00f3D/\u00b7Q\u00c50\u0084\u0007\u0097G\u00ef\u00b1f\u009dF\u0003\u0007\u00b7\u00f9\u0004\u00c0\u0091\u0002w\u0004s\u00dat\u001f\u0019\u00f8\"\u00f9=/\u000e\u0088\u00bd@\u00c99\u00f5\u00e8\u00e4\u00c8C\u00f5S\u008e\u00a3\u0091O\u00a8X\u00a0\u0003\u0091\u00e9\u00af\u00024\u00b6\u0004\u00de\u00f3\u00c19";
                        var12_3 = "\u00e1\u00ec&\u00c4\u00b83\u009a\u0007\u001c\u0088\u0099HI\u00a2`\u0003>@\u00d8\u0007B\u00aeR\u008c6:K\u0002y\u00f9\u0003\u00f2\u0081\u00c1\u00035\u00f3\u00f7\u0007\u0090*\u000e\u001c}(\u00e2\u0002\u0017\u0098\u0004\u00f5\u00f4\u00e6\u00da\u0004\u00b1\u0001ng\u0002q\u0005\u001aY\u00b2\u00cd/\u00a9LX\u00f5Z\u00c0z\u00d4\u0080\u00c0\u00c5\u00c7T\u00c3\u00ba\u00b1\u0006\u0000u\u0017\u0083Z\u0003F'S\u0003\u00f0\b\u0005\u0003\u00f1\u00c6\u00a1\u0007\u00few\u00cd\u00b7\u00ca]\u001a\u0002}\u0086\u0003U.\u00f1\u0003y\u00f6<\u0003\u008c\u007f\u00c8\u0004\u0097\u00b0\u00aaS\u0003\u00f2<\u00ea\u0003\u009c\u000f\u0088\u0003\u00bav\u00e3\u0003;\">\u001b\u00af}\u0013\u00d6rs#\u00125<\u0097K=3r\u00b9\u00a2\fdH\u00c92\u0017\u00fd~\u000e;\u0003\u00c0\u00aeE\u001a\u0013\u001d\u0084\u00da\u0080\u00f2}\"\u00fe:\u00ee\u008b\u0012+\u0097\u00ba\u001el\u00f3D/\u00b7Q\u00c50\u0084\u0007\u0097G\u00ef\u00b1f\u009dF\u0003\u0007\u00b7\u00f9\u0004\u00c0\u0091\u0002w\u0004s\u00dat\u001f\u0019\u00f8\"\u00f9=/\u000e\u0088\u00bd@\u00c99\u00f5\u00e8\u00e4\u00c8C\u00f5S\u008e\u00a3\u0091O\u00a8X\u00a0\u0003\u0091\u00e9\u00af\u00024\u00b6\u0004\u00de\u00f3\u00c19".length();
                        n_0.L(0);
                        var9_4 = 7;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 106;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
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
                            var10_2 = "VZ_\u0099\u009e\u0013\u0017\u0002\u000b\u0012";
                            var12_3 = "VZ_\u0099\u009e\u0013\u0017\u0002\u000b\u0012".length();
                            var9_4 = 7;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 13;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
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
                                    v15 = 83;
                                    break;
                                }
                                case 1: {
                                    v15 = 30;
                                    break;
                                }
                                case 2: {
                                    v15 = 80;
                                    break;
                                }
                                case 3: {
                                    v15 = 56;
                                    break;
                                }
                                case 4: {
                                    v15 = 114;
                                    break;
                                }
                                case 5: {
                                    v15 = 14;
                                    break;
                                }
                                default: {
                                    v15 = 103;
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
                n_0.a = var13;
                n_0.c = new String[39];
                var0_7 = 2422906105422922351L;
                var6_8 = new long[18];
                var3_9 = 0;
                var4_10 = "\u00bb\u0083\u00d7d\u000e\u00e8P\u0000\u00faR\u00ec\u00da'7FB\u009d\u009e\u00dek\u00f3O\u00f3[\u00ea{\u009eB\u00be\u0016\u00da&M\u00aa\u0002*D\u0094\u0080\u00a1\u00a4\u008d,8hEiW\u00be\u008d\u00e43=\u00e8|\u008af7\u00eb\u0005\u00e6\u0017\u00f9\u00a0\u00f3\u00f5\u00cff\u008a\u00e6F9\u007f+-\u0094\u00b3\u00dag\u00ea,\u008e\u00b2\u00e1\u0095\u0088\u00b6-\u001fo.g\u0098\u00dc\u00e5\u008a\u00a08\u00b3GKe#\u00e8\u00c7c\u0002Y\u0019\u0001L\u001c*\u00c9/\u0013\u00af\u00d5ri*^,\u0085\u00d6\u0011\u0081\u008e";
                var5_11 = "\u00bb\u0083\u00d7d\u000e\u00e8P\u0000\u00faR\u00ec\u00da'7FB\u009d\u009e\u00dek\u00f3O\u00f3[\u00ea{\u009eB\u00be\u0016\u00da&M\u00aa\u0002*D\u0094\u0080\u00a1\u00a4\u008d,8hEiW\u00be\u008d\u00e43=\u00e8|\u008af7\u00eb\u0005\u00e6\u0017\u00f9\u00a0\u00f3\u00f5\u00cff\u008a\u00e6F9\u007f+-\u0094\u00b3\u00dag\u00ea,\u008e\u00b2\u00e1\u0095\u0088\u00b6-\u001fo.g\u0098\u00dc\u00e5\u008a\u00a08\u00b3GKe#\u00e8\u00c7c\u0002Y\u0019\u0001L\u001c*\u00c9/\u0013\u00af\u00d5ri*^,\u0085\u00d6\u0011\u0081\u008e".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\b\u00e6N~\u00a1\u00c7\u0000\u00f4E\u0085\r\u00ba\u0082\u00fb\u00ba\u00ad";
                    var5_11 = "\b\u00e6N~\u00a1\u00c7\u0000\u00f4E\u0085\r\u00ba\u0082\u00fb\u00ba\u00ad".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        n_0.d = var6_8;
        n_0.f = new Integer[18];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFA185) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 17;
                    break;
                }
                case 1: {
                    n14 = 87;
                    break;
                }
                case 2: {
                    n14 = 99;
                    break;
                }
                case 3: {
                    n14 = 54;
                    break;
                }
                case 4: {
                    n14 = 114;
                    break;
                }
                case 5: {
                    n14 = 5;
                    break;
                }
                case 6: {
                    n14 = 62;
                    break;
                }
                case 7: {
                    n14 = 146;
                    break;
                }
                case 8: {
                    n14 = 192;
                    break;
                }
                case 9: {
                    n14 = 23;
                    break;
                }
                case 10: {
                    n14 = 163;
                    break;
                }
                case 11: {
                    n14 = 36;
                    break;
                }
                case 12: {
                    n14 = 212;
                    break;
                }
                case 13: {
                    n14 = 53;
                    break;
                }
                case 14: {
                    n14 = 205;
                    break;
                }
                case 15: {
                    n14 = 66;
                    break;
                }
                case 16: {
                    n14 = 1;
                    break;
                }
                case 17: {
                    n14 = 15;
                    break;
                }
                case 18: {
                    n14 = 119;
                    break;
                }
                case 19: {
                    n14 = 171;
                    break;
                }
                case 20: {
                    n14 = 231;
                    break;
                }
                case 21: {
                    n14 = 211;
                    break;
                }
                case 22: {
                    n14 = 239;
                    break;
                }
                case 23: {
                    n14 = 241;
                    break;
                }
                case 24: {
                    n14 = 178;
                    break;
                }
                case 25: {
                    n14 = 94;
                    break;
                }
                case 26: {
                    n14 = 7;
                    break;
                }
                case 27: {
                    n14 = 238;
                    break;
                }
                case 28: {
                    n14 = 95;
                    break;
                }
                case 29: {
                    n14 = 10;
                    break;
                }
                case 30: {
                    n14 = 188;
                    break;
                }
                case 31: {
                    n14 = 32;
                    break;
                }
                case 32: {
                    n14 = 221;
                    break;
                }
                case 33: {
                    n14 = 138;
                    break;
                }
                case 34: {
                    n14 = 159;
                    break;
                }
                case 35: {
                    n14 = 160;
                    break;
                }
                case 36: {
                    n14 = 249;
                    break;
                }
                case 37: {
                    n14 = 203;
                    break;
                }
                case 38: {
                    n14 = 141;
                    break;
                }
                case 39: {
                    n14 = 158;
                    break;
                }
                case 40: {
                    n14 = 129;
                    break;
                }
                case 41: {
                    n14 = 34;
                    break;
                }
                case 42: {
                    n14 = 74;
                    break;
                }
                case 43: {
                    n14 = 145;
                    break;
                }
                case 44: {
                    n14 = 21;
                    break;
                }
                case 45: {
                    n14 = 137;
                    break;
                }
                case 46: {
                    n14 = 71;
                    break;
                }
                case 47: {
                    n14 = 182;
                    break;
                }
                case 48: {
                    n14 = 59;
                    break;
                }
                case 49: {
                    n14 = 181;
                    break;
                }
                case 50: {
                    n14 = 183;
                    break;
                }
                case 51: {
                    n14 = 80;
                    break;
                }
                case 52: {
                    n14 = 255;
                    break;
                }
                case 53: {
                    n14 = 220;
                    break;
                }
                case 54: {
                    n14 = 81;
                    break;
                }
                case 55: {
                    n14 = 123;
                    break;
                }
                case 56: {
                    n14 = 46;
                    break;
                }
                case 57: {
                    n14 = 101;
                    break;
                }
                case 58: {
                    n14 = 8;
                    break;
                }
                case 59: {
                    n14 = 175;
                    break;
                }
                case 60: {
                    n14 = 0;
                    break;
                }
                case 61: {
                    n14 = 103;
                    break;
                }
                case 62: {
                    n14 = 69;
                    break;
                }
                case 63: {
                    n14 = 39;
                    break;
                }
                case 64: {
                    n14 = 228;
                    break;
                }
                case 65: {
                    n14 = 11;
                    break;
                }
                case 66: {
                    n14 = 223;
                    break;
                }
                case 67: {
                    n14 = 250;
                    break;
                }
                case 68: {
                    n14 = 187;
                    break;
                }
                case 69: {
                    n14 = 144;
                    break;
                }
                case 70: {
                    n14 = 44;
                    break;
                }
                case 71: {
                    n14 = 111;
                    break;
                }
                case 72: {
                    n14 = 89;
                    break;
                }
                case 73: {
                    n14 = 140;
                    break;
                }
                case 74: {
                    n14 = 202;
                    break;
                }
                case 75: {
                    n14 = 73;
                    break;
                }
                case 76: {
                    n14 = 219;
                    break;
                }
                case 77: {
                    n14 = 20;
                    break;
                }
                case 78: {
                    n14 = 64;
                    break;
                }
                case 79: {
                    n14 = 218;
                    break;
                }
                case 80: {
                    n14 = 199;
                    break;
                }
                case 81: {
                    n14 = 124;
                    break;
                }
                case 82: {
                    n14 = 85;
                    break;
                }
                case 83: {
                    n14 = 43;
                    break;
                }
                case 84: {
                    n14 = 97;
                    break;
                }
                case 85: {
                    n14 = 252;
                    break;
                }
                case 86: {
                    n14 = 189;
                    break;
                }
                case 87: {
                    n14 = 245;
                    break;
                }
                case 88: {
                    n14 = 25;
                    break;
                }
                case 89: {
                    n14 = 216;
                    break;
                }
                case 90: {
                    n14 = 67;
                    break;
                }
                case 91: {
                    n14 = 240;
                    break;
                }
                case 92: {
                    n14 = 24;
                    break;
                }
                case 93: {
                    n14 = 48;
                    break;
                }
                case 94: {
                    n14 = 91;
                    break;
                }
                case 95: {
                    n14 = 12;
                    break;
                }
                case 96: {
                    n14 = 6;
                    break;
                }
                case 97: {
                    n14 = 246;
                    break;
                }
                case 98: {
                    n14 = 174;
                    break;
                }
                case 99: {
                    n14 = 242;
                    break;
                }
                case 100: {
                    n14 = 234;
                    break;
                }
                case 101: {
                    n14 = 155;
                    break;
                }
                case 102: {
                    n14 = 51;
                    break;
                }
                case 103: {
                    n14 = 237;
                    break;
                }
                case 104: {
                    n14 = 38;
                    break;
                }
                case 105: {
                    n14 = 100;
                    break;
                }
                case 106: {
                    n14 = 179;
                    break;
                }
                case 107: {
                    n14 = 131;
                    break;
                }
                case 108: {
                    n14 = 26;
                    break;
                }
                case 109: {
                    n14 = 229;
                    break;
                }
                case 110: {
                    n14 = 156;
                    break;
                }
                case 111: {
                    n14 = 122;
                    break;
                }
                case 112: {
                    n14 = 149;
                    break;
                }
                case 113: {
                    n14 = 215;
                    break;
                }
                case 114: {
                    n14 = 118;
                    break;
                }
                case 115: {
                    n14 = 112;
                    break;
                }
                case 116: {
                    n14 = 75;
                    break;
                }
                case 117: {
                    n14 = 254;
                    break;
                }
                case 118: {
                    n14 = 49;
                    break;
                }
                case 119: {
                    n14 = 116;
                    break;
                }
                case 120: {
                    n14 = 68;
                    break;
                }
                case 121: {
                    n14 = 243;
                    break;
                }
                case 122: {
                    n14 = 109;
                    break;
                }
                case 123: {
                    n14 = 185;
                    break;
                }
                case 124: {
                    n14 = 133;
                    break;
                }
                case 125: {
                    n14 = 107;
                    break;
                }
                case 126: {
                    n14 = 92;
                    break;
                }
                case 127: {
                    n14 = 61;
                    break;
                }
                case 128: {
                    n14 = 108;
                    break;
                }
                case 129: {
                    n14 = 113;
                    break;
                }
                case 130: {
                    n14 = 79;
                    break;
                }
                case 131: {
                    n14 = 157;
                    break;
                }
                case 132: {
                    n14 = 248;
                    break;
                }
                case 133: {
                    n14 = 136;
                    break;
                }
                case 134: {
                    n14 = 126;
                    break;
                }
                case 135: {
                    n14 = 2;
                    break;
                }
                case 136: {
                    n14 = 3;
                    break;
                }
                case 137: {
                    n14 = 27;
                    break;
                }
                case 138: {
                    n14 = 42;
                    break;
                }
                case 139: {
                    n14 = 247;
                    break;
                }
                case 140: {
                    n14 = 37;
                    break;
                }
                case 141: {
                    n14 = 18;
                    break;
                }
                case 142: {
                    n14 = 55;
                    break;
                }
                case 143: {
                    n14 = 153;
                    break;
                }
                case 144: {
                    n14 = 217;
                    break;
                }
                case 145: {
                    n14 = 14;
                    break;
                }
                case 146: {
                    n14 = 207;
                    break;
                }
                case 147: {
                    n14 = 78;
                    break;
                }
                case 148: {
                    n14 = 201;
                    break;
                }
                case 149: {
                    n14 = 106;
                    break;
                }
                case 150: {
                    n14 = 210;
                    break;
                }
                case 151: {
                    n14 = 52;
                    break;
                }
                case 152: {
                    n14 = 226;
                    break;
                }
                case 153: {
                    n14 = 162;
                    break;
                }
                case 154: {
                    n14 = 143;
                    break;
                }
                case 155: {
                    n14 = 82;
                    break;
                }
                case 156: {
                    n14 = 170;
                    break;
                }
                case 157: {
                    n14 = 194;
                    break;
                }
                case 158: {
                    n14 = 204;
                    break;
                }
                case 159: {
                    n14 = 135;
                    break;
                }
                case 160: {
                    n14 = 4;
                    break;
                }
                case 161: {
                    n14 = 47;
                    break;
                }
                case 162: {
                    n14 = 236;
                    break;
                }
                case 163: {
                    n14 = 33;
                    break;
                }
                case 164: {
                    n14 = 121;
                    break;
                }
                case 165: {
                    n14 = 90;
                    break;
                }
                case 166: {
                    n14 = 72;
                    break;
                }
                case 167: {
                    n14 = 166;
                    break;
                }
                case 168: {
                    n14 = 120;
                    break;
                }
                case 169: {
                    n14 = 186;
                    break;
                }
                case 170: {
                    n14 = 167;
                    break;
                }
                case 171: {
                    n14 = 16;
                    break;
                }
                case 172: {
                    n14 = 224;
                    break;
                }
                case 173: {
                    n14 = 65;
                    break;
                }
                case 174: {
                    n14 = 22;
                    break;
                }
                case 175: {
                    n14 = 86;
                    break;
                }
                case 176: {
                    n14 = 41;
                    break;
                }
                case 177: {
                    n14 = 235;
                    break;
                }
                case 178: {
                    n14 = 56;
                    break;
                }
                case 179: {
                    n14 = 134;
                    break;
                }
                case 180: {
                    n14 = 206;
                    break;
                }
                case 181: {
                    n14 = 169;
                    break;
                }
                case 182: {
                    n14 = 214;
                    break;
                }
                case 183: {
                    n14 = 164;
                    break;
                }
                case 184: {
                    n14 = 57;
                    break;
                }
                case 185: {
                    n14 = 13;
                    break;
                }
                case 186: {
                    n14 = 165;
                    break;
                }
                case 187: {
                    n14 = 125;
                    break;
                }
                case 188: {
                    n14 = 142;
                    break;
                }
                case 189: {
                    n14 = 150;
                    break;
                }
                case 190: {
                    n14 = 147;
                    break;
                }
                case 191: {
                    n14 = 105;
                    break;
                }
                case 192: {
                    n14 = 50;
                    break;
                }
                case 193: {
                    n14 = 115;
                    break;
                }
                case 194: {
                    n14 = 180;
                    break;
                }
                case 195: {
                    n14 = 77;
                    break;
                }
                case 196: {
                    n14 = 96;
                    break;
                }
                case 197: {
                    n14 = 209;
                    break;
                }
                case 198: {
                    n14 = 227;
                    break;
                }
                case 199: {
                    n14 = 76;
                    break;
                }
                case 200: {
                    n14 = 128;
                    break;
                }
                case 201: {
                    n14 = 132;
                    break;
                }
                case 202: {
                    n14 = 83;
                    break;
                }
                case 203: {
                    n14 = 251;
                    break;
                }
                case 204: {
                    n14 = 58;
                    break;
                }
                case 205: {
                    n14 = 31;
                    break;
                }
                case 206: {
                    n14 = 196;
                    break;
                }
                case 207: {
                    n14 = 200;
                    break;
                }
                case 208: {
                    n14 = 232;
                    break;
                }
                case 209: {
                    n14 = 198;
                    break;
                }
                case 210: {
                    n14 = 9;
                    break;
                }
                case 211: {
                    n14 = 197;
                    break;
                }
                case 212: {
                    n14 = 19;
                    break;
                }
                case 213: {
                    n14 = 152;
                    break;
                }
                case 214: {
                    n14 = 190;
                    break;
                }
                case 215: {
                    n14 = 151;
                    break;
                }
                case 216: {
                    n14 = 161;
                    break;
                }
                case 217: {
                    n14 = 88;
                    break;
                }
                case 218: {
                    n14 = 244;
                    break;
                }
                case 219: {
                    n14 = 191;
                    break;
                }
                case 220: {
                    n14 = 102;
                    break;
                }
                case 221: {
                    n14 = 168;
                    break;
                }
                case 222: {
                    n14 = 253;
                    break;
                }
                case 223: {
                    n14 = 230;
                    break;
                }
                case 224: {
                    n14 = 93;
                    break;
                }
                case 225: {
                    n14 = 213;
                    break;
                }
                case 226: {
                    n14 = 172;
                    break;
                }
                case 227: {
                    n14 = 45;
                    break;
                }
                case 228: {
                    n14 = 110;
                    break;
                }
                case 229: {
                    n14 = 35;
                    break;
                }
                case 230: {
                    n14 = 84;
                    break;
                }
                case 231: {
                    n14 = 154;
                    break;
                }
                case 232: {
                    n14 = 127;
                    break;
                }
                case 233: {
                    n14 = 98;
                    break;
                }
                case 234: {
                    n14 = 184;
                    break;
                }
                case 235: {
                    n14 = 70;
                    break;
                }
                case 236: {
                    n14 = 28;
                    break;
                }
                case 237: {
                    n14 = 40;
                    break;
                }
                case 238: {
                    n14 = 29;
                    break;
                }
                case 239: {
                    n14 = 139;
                    break;
                }
                case 240: {
                    n14 = 173;
                    break;
                }
                case 241: {
                    n14 = 193;
                    break;
                }
                case 242: {
                    n14 = 195;
                    break;
                }
                case 243: {
                    n14 = 104;
                    break;
                }
                case 244: {
                    n14 = 63;
                    break;
                }
                case 245: {
                    n14 = 208;
                    break;
                }
                case 246: {
                    n14 = 148;
                    break;
                }
                case 247: {
                    n14 = 30;
                    break;
                }
                case 248: {
                    n14 = 222;
                    break;
                }
                case 249: {
                    n14 = 60;
                    break;
                }
                case 250: {
                    n14 = 225;
                    break;
                }
                case 251: {
                    n14 = 233;
                    break;
                }
                case 252: {
                    n14 = 117;
                    break;
                }
                case 253: {
                    n14 = 176;
                    break;
                }
                case 254: {
                    n14 = 130;
                    break;
                }
                default: {
                    n14 = 177;
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
            n_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4282;
        if (f[n11] == null) {
            n_0.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

