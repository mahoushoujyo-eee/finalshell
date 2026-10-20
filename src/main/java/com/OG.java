/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.GO;
import com.O_;
import com.PY;
import com.RV;
import com.W2;
import com.aL;
import com.ac_0;
import com.cz_0;
import com.ht_0;
import com.i2_0;
import com.ky_2;
import com.lf_2;
import com.nz_1;
import com.os_0;
import com.rf_2;
import com.sa_0;
import com.uB;
import com.wd_0;
import com.wo_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class OG
extends O_
implements W2,
sa_0 {
    private ImageIcon z = lf_2.B;
    private Color Z = lf_2.R;
    private Color v = lf_2.f;
    private Color W = lf_2.X;
    private Color b = lf_2.O;
    public boolean H = lf_2.k;
    public boolean y = lf_2.w;
    private int D = lf_2.t;
    private int F = lf_2.C;
    private int T;
    private boolean p;
    private boolean k;
    private int q;
    private boolean C;
    private final List A;
    private long Y;
    private long g;
    private long f;
    private int X;
    private wo_0 w;
    private boolean G;
    private wd_0 a;
    private final O_ n;
    private static ky_2[] L;
    private static final String[] c;
    private static final String[] d;
    private static final long e;
    private static final long h;

    public OG() {
        ky_2[] ky_2Array = OG.P();
        this.T = lf_2.Z;
        this.p = lf_2.I;
        this.k = lf_2.i;
        this.q = lf_2.r;
        this.C = lf_2.s;
        this.A = new ArrayList(1);
        this.Y = 0L;
        this.g = 0L;
        this.f = 0L;
        this.X = (int)e;
        this.w = null;
        this.G = false;
        this.setOpaque(false);
        this.setFocusable(true);
        this.setHorizontalAlignment(0);
        this.R();
        this.n = new O_(this.z);
        this.n.S(OG.a(17374, 27814));
        this.z();
        this.B();
        this.addKeyListener(new nz_1(this));
        this.addMouseListener(new uB(this));
        this.addFocusListener(new os_0(this));
        this.w = wo_0.H(this, OG.a(17369, 31149), this.X, new rf_2(this));
        if (ky_2Array == null) {
            ky_2.K(new String[5]);
        }
    }

    public void I() {
        this.j();
        System.gc();
        this.B();
        this.c();
    }

    private void R() {
        block2: {
            O_ o_;
            block3: {
                ky_2[] ky_2Array = OG.P();
                o_ = this;
                if (ky_2Array == null) break block2;
                if (!o_.H) break block3;
                this.G(this.F + 2, this.F + 2 + this.D, this.F + 2, this.F + 2 + this.D);
                if (ky_2Array != null) break block2;
            }
            o_ = this.G(2, 2 + this.D, 2, 2 + this.D);
        }
    }

    protected void B() {
        MemoryUsage memoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        this.Y = memoryUsage.getUsed();
        ky_2[] ky_2Array = OG.P();
        this.g = memoryUsage.getCommitted();
        this.f = memoryUsage.getMax();
        this.setText(this.I());
        ky_2[] ky_2Array2 = ky_2Array;
        OG oG = this;
        if (ky_2Array2 != null) {
            if (oG.k) {
                this.n.setText(this.w());
                this.a.t();
            }
            oG = this;
        }
        oG.repaint();
    }

    /*
     * Unable to fully structure code
     */
    protected String I() {
        var1_1 = OG.P();
        v0 = this;
        if (var1_1 == null) ** GOTO lbl8
        if (v0.C) {
            v1 = this.f;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.g;
        }
        var2_2 = v1;
        return cz_0.n(this.Y, this.c(this.Y)) + " " + i2_0.O(OG.a(17373, -22417)) + " " + cz_0.n(var2_2, this.c(var2_2));
    }

    protected String w() {
        return OG.a(17372, -15655) + i2_0.O(OG.a(17361, 25525)) + OG.a(17368, -9167) + cz_0.n(this.g, this.c(this.g)) + OG.a(17360, 31184) + i2_0.O(OG.a(17363, -5569)) + OG.a(17371, -12719) + cz_0.n(this.Y, this.c(this.Y)) + this.a() + OG.a(17375, -16621);
    }

    private String a() {
        if (this.C) {
            return OG.a(17362, 14215) + i2_0.O(OG.a(17370, -22444)) + OG.a(17371, -12719) + cz_0.n(this.f, this.c(this.f));
        }
        return "";
    }

    private int c(long l2) {
        ky_2[] ky_2Array = OG.P();
        long l3 = l2 - h;
        long l4 = l3 == 0L ? (char)'\u0000' : (l3 < 0L ? (char)'\uffffffff' : '\u0001');
        if (ky_2Array != null) {
            l4 = l4 < 0 ? (long)0 : (long)2;
        }
        return (int)l4;
    }

    public int o() {
        return this.X;
    }

    public void Y(int n10) {
        this.X = n10;
        this.w.M(n10);
    }

    public int H() {
        return this.T;
    }

    public void k(int n10) {
        this.T = n10;
    }

    public int n() {
        return this.F;
    }

    public void z(int n10) {
        this.F = n10;
        this.R();
    }

    public Color y() {
        return this.Z;
    }

    public void H(Color color) {
        this.Z = color;
    }

    public Color e() {
        return this.v;
    }

    public void i(Color color) {
        this.v = color;
    }

    public Color b() {
        return this.W;
    }

    public void o(Color color) {
        this.W = color;
    }

    public Color L() {
        return this.b;
    }

    public void X(Color color) {
        this.b = color;
    }

    public int l() {
        return this.D;
    }

    public void F(int n10) {
        this.D = n10;
        this.R();
    }

    public boolean F() {
        return this.H;
    }

    public void T(boolean bl) {
        this.H = bl;
        this.R();
    }

    public boolean y() {
        return this.y;
    }

    public void u(boolean bl) {
        this.y = bl;
    }

    public boolean W() {
        return this.p;
    }

    public void L(boolean bl) {
        block3: {
            OG oG;
            block4: {
                boolean bl2;
                block2: {
                    this.p = bl;
                    ky_2[] ky_2Array = OG.P();
                    bl2 = bl;
                    if (ky_2Array == null) break block2;
                    if (bl2) break block3;
                    oG = this;
                    if (ky_2Array == null) break block4;
                    bl2 = oG.G;
                }
                if (!bl2) break block3;
                this.G = false;
                oG = this;
            }
            oG.repaint();
        }
    }

    public boolean L() {
        return this.k;
    }

    public void C(boolean bl) {
        this.k = bl;
        this.z();
    }

    private void z() {
        block4: {
            O_ o_;
            block2: {
                block3: {
                    ky_2[] ky_2Array = OG.P();
                    o_ = this;
                    if (ky_2Array == null) break block2;
                    if (!o_.k) break block3;
                    this.a = ac_0.o((Component)this, this.n, this.q);
                    if (ky_2Array != null) break block4;
                }
                o_ = this.n;
            }
            ac_0.o(o_);
        }
    }

    public long g() {
        return this.g;
    }

    public long i() {
        return this.Y;
    }

    public long p() {
        return this.f;
    }

    public ImageIcon l() {
        return this.z;
    }

    public void B(ImageIcon imageIcon) {
        this.z = imageIcon;
    }

    public int E() {
        return this.q;
    }

    public void o(int n10) {
        this.q = n10;
    }

    public boolean n() {
        return this.C;
    }

    public void A(boolean bl) {
        this.C = bl;
    }

    @Override
    public Shape B() {
        return GA.X(this, this.n(), this.H());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block10: {
            block9: {
                block7: {
                    block8: {
                        var3_2 = (Graphics2D)var1_1;
                        var4_3 = RV.X(var3_2);
                        var5_4 = this.isEnabled();
                        var2_5 = OG.P();
                        v0 = this.H;
                        if (var2_5 == null) break block7;
                        if (!v0) break block8;
                        v1 = this.isFocusOwner() != false ? GO.c : GO.r;
                        v2 = this.G;
                        if (var2_5 != null) {
                            v2 = v2 == false;
                        }
                        GA.r(var3_2, this, v1, this.F, this.T, this.y, v2);
                        if (var2_5 != null) break block9;
                    }
                    v0 = this.y;
                }
                if (var2_5 == null) break block10;
                if (!v0) break block9;
                v3 = this;
                if (var2_5 == null) ** GOTO lbl26
                if (!v3.G) {
                    v4 /* !! */  = GA.m(0, 0, 0, this.getHeight());
                } else {
                    v3 = this;
lbl26:
                    // 2 sources

                    v4 /* !! */  = v3.getBackground();
                }
                var3_2.setPaint(v4 /* !! */ );
                var3_2.fill(this.getVisibleRect());
            }
            v0 = this.C;
        }
        if (v0) {
            var3_2.setPaint(var5_4 != false ? this.Z : this.v);
            var6_6 = this.i(this.g, false);
            var3_2.drawLine(this.F + var6_6, this.F + 2, this.F + var6_6, this.getHeight() - this.F - 3);
        }
        v5 = Float.valueOf(0.5f);
        v6 = var5_4;
        if (var2_5 != null) {
            v6 = v6 == false;
        }
        var6_7 = RV.a(var3_2, v5, v6);
        var3_2.setPaint(this.b);
        var3_2.fill(this.R(this.Y, true));
        var3_2.setPaint(this.W);
        var3_2.draw(this.R(this.Y, false));
        v7 = var5_4;
        if (var2_5 != null) {
            v7 = v7 == false;
        }
        RV.E(var3_2, var6_7, v7);
        RV.X(var3_2, var4_3);
        super.paintComponent(var3_2);
        if (ky_2.F() != null) {
            OG.V(new ky_2[1]);
        }
    }

    private Shape R(long l2, boolean bl) {
        int n10 = Math.max(0, this.T - 1) * 2;
        if (this.H) {
            return new RoundRectangle2D.Double(this.F + 2, this.F + 2, this.i(l2, bl), this.getHeight() - 4 - this.F * 2 - (bl ? 0 : 1), n10, n10);
        }
        return new RoundRectangle2D.Double(1.0, 1.0, this.i(l2, bl), this.getHeight() - 2 - (bl ? 0 : 1), n10, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int i(long l2, boolean bl) {
        long l3;
        ky_2[] ky_2Array = OG.P();
        int n11 = this.getWidth();
        n11 = this.H;
        if (ky_2Array != null) {
            n11 = n11 != 0 ? 4 + this.F * 2 : 2;
        }
        int n13 = n10 - n11;
        n13 = bl;
        if (ky_2Array != null) {
            n13 = n13 != 0 ? 0 : 1;
        }
        float f10 = (float)(n12 - n13) * (float)l2;
        OG oG = this;
        if (ky_2Array != null) {
            if (oG.C) {
                l3 = this.f;
                return Math.round(f10 / (float)l3);
            }
            oG = this;
        }
        l3 = oG.g;
        return Math.round(f10 / (float)l3);
    }

    public void i(ht_0 ht_02) {
        this.A.add(ht_02);
    }

    public void v(ht_0 ht_02) {
        this.A.remove(ht_02);
    }

    public void j() {
        Iterator iterator = aL.J((Collection)this.A).iterator();
        ky_2[] ky_2Array = OG.P();
        while (iterator.hasNext()) {
            ht_0 ht_02 = (ht_0)iterator.next();
            ht_02.Q();
            if (ky_2Array != null) continue;
        }
    }

    public void c() {
        Iterator iterator = aL.J((Collection)this.A).iterator();
        ky_2[] ky_2Array = OG.P();
        while (iterator.hasNext()) {
            ht_0 ht_02 = (ht_0)iterator.next();
            ht_02.c();
            if (ky_2Array != null) continue;
        }
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public OG z(int n10) {
        return (OG)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    @Override
    public OG o(int n10) {
        return (OG)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public OG v(int n10) {
        return (OG)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public OG S(int n10) {
        return (OG)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    @Override
    public OG r(int n10) {
        return (OG)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public OG D(int n10) {
        return (OG)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public OG z(int n10, int n11) {
        return (OG)PY.O(this, n10, n11);
    }

    @Override
    public O_ u(int n10, int n11) {
        return this.z(n10, n11);
    }

    @Override
    public O_ G(int n10) {
        return this.D(n10);
    }

    @Override
    public O_ r(int n10) {
        return this.r(n10);
    }

    @Override
    public O_ m(int n10) {
        return this.S(n10);
    }

    @Override
    public O_ a(int n10) {
        return this.v(n10);
    }

    @Override
    public O_ V(int n10) {
        return this.o(n10);
    }

    @Override
    public O_ i(int n10) {
        return this.z(n10);
    }

    @Override
    public Component W(int n10, int n11) {
        return this.z(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.D(n10);
    }

    @Override
    public Component p(int n10) {
        return this.r(n10);
    }

    @Override
    public Component D(int n10) {
        return this.S(n10);
    }

    @Override
    public Component V(int n10) {
        return this.v(n10);
    }

    @Override
    public Component x(int n10) {
        return this.o(n10);
    }

    @Override
    public Component O(int n10) {
        return this.z(n10);
    }

    static boolean s(OG oG, boolean bl) {
        oG.G = bl;
        return oG.G;
    }

    static boolean f(OG oG) {
        return oG.p;
    }

    static boolean r(OG oG) {
        return oG.G;
    }

    public static void V(ky_2[] ky_2Array) {
        L = ky_2Array;
    }

    public static ky_2[] P() {
        return L;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var9 = new String[12];
                        var7_1 = 0;
                        var6_2 = "\u00f3Z\u001d\u009e\u0014\u0005\u00e3Z\u00a8\u00b1\u0083\u0004\u0010hYj\u00e21\u0081o\u009c\u00d7_c|\u0017\u0004J^\u00bc5\u000fQ\u00fc\u00aa]\u001f\u0094Q\u00a0J\u00fc2\u00f8\u00abc\u00b04\u00bd\u0004\u00c9BZ\u009d\u0006C(\u0082]wJ\u0016+\b\u00bb\u00f4\u0089\u0006\u00c6\u00ddXyA\u0010\u009a03\u00ee\u001d\u00baN+\u000e:\u000ez \u00c7\u00f2\u00fb\u00ba\u00fa\u00b1\u00a5O\u0084\u0010n\u001c\u000bL\u00abu\u00d1\r\u00f3\u00e6\u0012\u00c7\u00f1V\u0005\u00eaH\u00a1\u00ad\u008b\u0019\u0084lNx7\u0097\u0011\u00ef\u00a2?\u001e\u00d8q)N\u00cd\u00b2\u00de\u00bb\u00a7\u00be\u00a1\u00e5\u009fn";
                        var8_3 = "\u00f3Z\u001d\u009e\u0014\u0005\u00e3Z\u00a8\u00b1\u0083\u0004\u0010hYj\u00e21\u0081o\u009c\u00d7_c|\u0017\u0004J^\u00bc5\u000fQ\u00fc\u00aa]\u001f\u0094Q\u00a0J\u00fc2\u00f8\u00abc\u00b04\u00bd\u0004\u00c9BZ\u009d\u0006C(\u0082]wJ\u0016+\b\u00bb\u00f4\u0089\u0006\u00c6\u00ddXyA\u0010\u009a03\u00ee\u001d\u00baN+\u000e:\u000ez \u00c7\u00f2\u00fb\u00ba\u00fa\u00b1\u00a5O\u0084\u0010n\u001c\u000bL\u00abu\u00d1\r\u00f3\u00e6\u0012\u00c7\u00f1V\u0005\u00eaH\u00a1\u00ad\u008b\u0019\u0084lNx7\u0097\u0011\u00ef\u00a2?\u001e\u00d8q)N\u00cd\u00b2\u00de\u00bb\u00a7\u00be\u00a1\u00e5\u009fn".length();
                        var5_4 = 4;
                        var4_5 = -1;
                        OG.V(new ky_2[4]);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 110;
                            v1 = ++var4_5;
                            v2 = var6_2.substring(v1, v1 + var5_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var9[var7_1++] = v4.intern();
                            if ((var4_5 += var5_4) < var8_3) {
                                var5_4 = var6_2.charAt(var4_5);
                                ** continue;
                            }
                            var6_2 = "\u0018\u00d33\u0012\u0015\u0018\u0010W\u0010\u00d30.=\u0014\u00eb\u008c\u00fbb\u0001\u00b2\u008cr&\u00e5\u00e5\f\u00ad\u0007\u00d4p";
                            var8_3 = "\u0018\u00d33\u0012\u0015\u0018\u0010W\u0010\u00d30.=\u0014\u00eb\u008c\u00fbb\u0001\u00b2\u008cr&\u00e5\u00e5\f\u00ad\u0007\u00d4p".length();
                            var5_4 = 5;
                            var4_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 42;
                                v5 = ++var4_5;
                                v2 = var6_2.substring(v5, v5 + var5_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var9[var7_1++] = v4.intern();
                            if ((var4_5 += var5_4) < var8_3) {
                                var5_4 = var6_2.charAt(var4_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var10_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var10_6;
                        while (true) {
                            switch (var10_6 % 7) {
                                case 0: {
                                    v15 = 54;
                                    break;
                                }
                                case 1: {
                                    v15 = 62;
                                    break;
                                }
                                case 2: {
                                    v15 = 64;
                                    break;
                                }
                                case 3: {
                                    v15 = 52;
                                    break;
                                }
                                case 4: {
                                    v15 = 26;
                                    break;
                                }
                                case 5: {
                                    v15 = 58;
                                    break;
                                }
                                default: {
                                    v15 = 116;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var10_6;
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
                    } while (v10 > var10_6);
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
                OG.c = var9;
                OG.d = new String[12];
                break block23;
lbl101:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var2_7 = 3945171337024906484L;
            ** while (true)
            OG.e = 8431574065666074396L ^ var2_7;
            break block24;
lbl111:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 5904665441016238279L;
        ** while (true)
        OG.h = 5904665442089980103L ^ var0_8;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x43D8) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 112;
                    break;
                }
                case 1: {
                    n14 = 76;
                    break;
                }
                case 2: {
                    n14 = 164;
                    break;
                }
                case 3: {
                    n14 = 231;
                    break;
                }
                case 4: {
                    n14 = 79;
                    break;
                }
                case 5: {
                    n14 = 103;
                    break;
                }
                case 6: {
                    n14 = 195;
                    break;
                }
                case 7: {
                    n14 = 141;
                    break;
                }
                case 8: {
                    n14 = 73;
                    break;
                }
                case 9: {
                    n14 = 57;
                    break;
                }
                case 10: {
                    n14 = 233;
                    break;
                }
                case 11: {
                    n14 = 145;
                    break;
                }
                case 12: {
                    n14 = 196;
                    break;
                }
                case 13: {
                    n14 = 17;
                    break;
                }
                case 14: {
                    n14 = 9;
                    break;
                }
                case 15: {
                    n14 = 223;
                    break;
                }
                case 16: {
                    n14 = 45;
                    break;
                }
                case 17: {
                    n14 = 186;
                    break;
                }
                case 18: {
                    n14 = 108;
                    break;
                }
                case 19: {
                    n14 = 62;
                    break;
                }
                case 20: {
                    n14 = 235;
                    break;
                }
                case 21: {
                    n14 = 151;
                    break;
                }
                case 22: {
                    n14 = 250;
                    break;
                }
                case 23: {
                    n14 = 78;
                    break;
                }
                case 24: {
                    n14 = 198;
                    break;
                }
                case 25: {
                    n14 = 219;
                    break;
                }
                case 26: {
                    n14 = 46;
                    break;
                }
                case 27: {
                    n14 = 178;
                    break;
                }
                case 28: {
                    n14 = 152;
                    break;
                }
                case 29: {
                    n14 = 189;
                    break;
                }
                case 30: {
                    n14 = 207;
                    break;
                }
                case 31: {
                    n14 = 29;
                    break;
                }
                case 32: {
                    n14 = 138;
                    break;
                }
                case 33: {
                    n14 = 148;
                    break;
                }
                case 34: {
                    n14 = 87;
                    break;
                }
                case 35: {
                    n14 = 4;
                    break;
                }
                case 36: {
                    n14 = 14;
                    break;
                }
                case 37: {
                    n14 = 144;
                    break;
                }
                case 38: {
                    n14 = 104;
                    break;
                }
                case 39: {
                    n14 = 139;
                    break;
                }
                case 40: {
                    n14 = 162;
                    break;
                }
                case 41: {
                    n14 = 165;
                    break;
                }
                case 42: {
                    n14 = 0;
                    break;
                }
                case 43: {
                    n14 = 140;
                    break;
                }
                case 44: {
                    n14 = 38;
                    break;
                }
                case 45: {
                    n14 = 106;
                    break;
                }
                case 46: {
                    n14 = 150;
                    break;
                }
                case 47: {
                    n14 = 25;
                    break;
                }
                case 48: {
                    n14 = 116;
                    break;
                }
                case 49: {
                    n14 = 18;
                    break;
                }
                case 50: {
                    n14 = 199;
                    break;
                }
                case 51: {
                    n14 = 65;
                    break;
                }
                case 52: {
                    n14 = 182;
                    break;
                }
                case 53: {
                    n14 = 167;
                    break;
                }
                case 54: {
                    n14 = 70;
                    break;
                }
                case 55: {
                    n14 = 191;
                    break;
                }
                case 56: {
                    n14 = 204;
                    break;
                }
                case 57: {
                    n14 = 81;
                    break;
                }
                case 58: {
                    n14 = 168;
                    break;
                }
                case 59: {
                    n14 = 142;
                    break;
                }
                case 60: {
                    n14 = 44;
                    break;
                }
                case 61: {
                    n14 = 16;
                    break;
                }
                case 62: {
                    n14 = 69;
                    break;
                }
                case 63: {
                    n14 = 226;
                    break;
                }
                case 64: {
                    n14 = 28;
                    break;
                }
                case 65: {
                    n14 = 133;
                    break;
                }
                case 66: {
                    n14 = 247;
                    break;
                }
                case 67: {
                    n14 = 190;
                    break;
                }
                case 68: {
                    n14 = 220;
                    break;
                }
                case 69: {
                    n14 = 72;
                    break;
                }
                case 70: {
                    n14 = 169;
                    break;
                }
                case 71: {
                    n14 = 48;
                    break;
                }
                case 72: {
                    n14 = 123;
                    break;
                }
                case 73: {
                    n14 = 75;
                    break;
                }
                case 74: {
                    n14 = 59;
                    break;
                }
                case 75: {
                    n14 = 37;
                    break;
                }
                case 76: {
                    n14 = 205;
                    break;
                }
                case 77: {
                    n14 = 67;
                    break;
                }
                case 78: {
                    n14 = 244;
                    break;
                }
                case 79: {
                    n14 = 251;
                    break;
                }
                case 80: {
                    n14 = 77;
                    break;
                }
                case 81: {
                    n14 = 157;
                    break;
                }
                case 82: {
                    n14 = 243;
                    break;
                }
                case 83: {
                    n14 = 90;
                    break;
                }
                case 84: {
                    n14 = 225;
                    break;
                }
                case 85: {
                    n14 = 40;
                    break;
                }
                case 86: {
                    n14 = 221;
                    break;
                }
                case 87: {
                    n14 = 35;
                    break;
                }
                case 88: {
                    n14 = 5;
                    break;
                }
                case 89: {
                    n14 = 120;
                    break;
                }
                case 90: {
                    n14 = 95;
                    break;
                }
                case 91: {
                    n14 = 63;
                    break;
                }
                case 92: {
                    n14 = 41;
                    break;
                }
                case 93: {
                    n14 = 163;
                    break;
                }
                case 94: {
                    n14 = 239;
                    break;
                }
                case 95: {
                    n14 = 214;
                    break;
                }
                case 96: {
                    n14 = 117;
                    break;
                }
                case 97: {
                    n14 = 114;
                    break;
                }
                case 98: {
                    n14 = 115;
                    break;
                }
                case 99: {
                    n14 = 210;
                    break;
                }
                case 100: {
                    n14 = 187;
                    break;
                }
                case 101: {
                    n14 = 64;
                    break;
                }
                case 102: {
                    n14 = 119;
                    break;
                }
                case 103: {
                    n14 = 236;
                    break;
                }
                case 104: {
                    n14 = 149;
                    break;
                }
                case 105: {
                    n14 = 222;
                    break;
                }
                case 106: {
                    n14 = 58;
                    break;
                }
                case 107: {
                    n14 = 55;
                    break;
                }
                case 108: {
                    n14 = 98;
                    break;
                }
                case 109: {
                    n14 = 237;
                    break;
                }
                case 110: {
                    n14 = 54;
                    break;
                }
                case 111: {
                    n14 = 171;
                    break;
                }
                case 112: {
                    n14 = 161;
                    break;
                }
                case 113: {
                    n14 = 24;
                    break;
                }
                case 114: {
                    n14 = 200;
                    break;
                }
                case 115: {
                    n14 = 107;
                    break;
                }
                case 116: {
                    n14 = 146;
                    break;
                }
                case 117: {
                    n14 = 2;
                    break;
                }
                case 118: {
                    n14 = 27;
                    break;
                }
                case 119: {
                    n14 = 11;
                    break;
                }
                case 120: {
                    n14 = 88;
                    break;
                }
                case 121: {
                    n14 = 105;
                    break;
                }
                case 122: {
                    n14 = 232;
                    break;
                }
                case 123: {
                    n14 = 209;
                    break;
                }
                case 124: {
                    n14 = 32;
                    break;
                }
                case 125: {
                    n14 = 154;
                    break;
                }
                case 126: {
                    n14 = 51;
                    break;
                }
                case 127: {
                    n14 = 183;
                    break;
                }
                case 128: {
                    n14 = 188;
                    break;
                }
                case 129: {
                    n14 = 253;
                    break;
                }
                case 130: {
                    n14 = 26;
                    break;
                }
                case 131: {
                    n14 = 224;
                    break;
                }
                case 132: {
                    n14 = 89;
                    break;
                }
                case 133: {
                    n14 = 20;
                    break;
                }
                case 134: {
                    n14 = 185;
                    break;
                }
                case 135: {
                    n14 = 211;
                    break;
                }
                case 136: {
                    n14 = 52;
                    break;
                }
                case 137: {
                    n14 = 136;
                    break;
                }
                case 138: {
                    n14 = 8;
                    break;
                }
                case 139: {
                    n14 = 158;
                    break;
                }
                case 140: {
                    n14 = 180;
                    break;
                }
                case 141: {
                    n14 = 249;
                    break;
                }
                case 142: {
                    n14 = 177;
                    break;
                }
                case 143: {
                    n14 = 230;
                    break;
                }
                case 144: {
                    n14 = 84;
                    break;
                }
                case 145: {
                    n14 = 160;
                    break;
                }
                case 146: {
                    n14 = 56;
                    break;
                }
                case 147: {
                    n14 = 34;
                    break;
                }
                case 148: {
                    n14 = 96;
                    break;
                }
                case 149: {
                    n14 = 246;
                    break;
                }
                case 150: {
                    n14 = 22;
                    break;
                }
                case 151: {
                    n14 = 228;
                    break;
                }
                case 152: {
                    n14 = 252;
                    break;
                }
                case 153: {
                    n14 = 49;
                    break;
                }
                case 154: {
                    n14 = 241;
                    break;
                }
                case 155: {
                    n14 = 130;
                    break;
                }
                case 156: {
                    n14 = 39;
                    break;
                }
                case 157: {
                    n14 = 218;
                    break;
                }
                case 158: {
                    n14 = 203;
                    break;
                }
                case 159: {
                    n14 = 137;
                    break;
                }
                case 160: {
                    n14 = 124;
                    break;
                }
                case 161: {
                    n14 = 192;
                    break;
                }
                case 162: {
                    n14 = 60;
                    break;
                }
                case 163: {
                    n14 = 176;
                    break;
                }
                case 164: {
                    n14 = 238;
                    break;
                }
                case 165: {
                    n14 = 43;
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
                    n14 = 216;
                    break;
                }
                case 169: {
                    n14 = 23;
                    break;
                }
                case 170: {
                    n14 = 131;
                    break;
                }
                case 171: {
                    n14 = 166;
                    break;
                }
                case 172: {
                    n14 = 240;
                    break;
                }
                case 173: {
                    n14 = 86;
                    break;
                }
                case 174: {
                    n14 = 213;
                    break;
                }
                case 175: {
                    n14 = 181;
                    break;
                }
                case 176: {
                    n14 = 194;
                    break;
                }
                case 177: {
                    n14 = 85;
                    break;
                }
                case 178: {
                    n14 = 66;
                    break;
                }
                case 179: {
                    n14 = 179;
                    break;
                }
                case 180: {
                    n14 = 113;
                    break;
                }
                case 181: {
                    n14 = 206;
                    break;
                }
                case 182: {
                    n14 = 175;
                    break;
                }
                case 183: {
                    n14 = 6;
                    break;
                }
                case 184: {
                    n14 = 212;
                    break;
                }
                case 185: {
                    n14 = 234;
                    break;
                }
                case 186: {
                    n14 = 1;
                    break;
                }
                case 187: {
                    n14 = 132;
                    break;
                }
                case 188: {
                    n14 = 93;
                    break;
                }
                case 189: {
                    n14 = 242;
                    break;
                }
                case 190: {
                    n14 = 248;
                    break;
                }
                case 191: {
                    n14 = 91;
                    break;
                }
                case 192: {
                    n14 = 15;
                    break;
                }
                case 193: {
                    n14 = 99;
                    break;
                }
                case 194: {
                    n14 = 102;
                    break;
                }
                case 195: {
                    n14 = 13;
                    break;
                }
                case 196: {
                    n14 = 31;
                    break;
                }
                case 197: {
                    n14 = 155;
                    break;
                }
                case 198: {
                    n14 = 159;
                    break;
                }
                case 199: {
                    n14 = 125;
                    break;
                }
                case 200: {
                    n14 = 254;
                    break;
                }
                case 201: {
                    n14 = 215;
                    break;
                }
                case 202: {
                    n14 = 208;
                    break;
                }
                case 203: {
                    n14 = 3;
                    break;
                }
                case 204: {
                    n14 = 184;
                    break;
                }
                case 205: {
                    n14 = 227;
                    break;
                }
                case 206: {
                    n14 = 53;
                    break;
                }
                case 207: {
                    n14 = 229;
                    break;
                }
                case 208: {
                    n14 = 255;
                    break;
                }
                case 209: {
                    n14 = 30;
                    break;
                }
                case 210: {
                    n14 = 147;
                    break;
                }
                case 211: {
                    n14 = 100;
                    break;
                }
                case 212: {
                    n14 = 173;
                    break;
                }
                case 213: {
                    n14 = 201;
                    break;
                }
                case 214: {
                    n14 = 156;
                    break;
                }
                case 215: {
                    n14 = 42;
                    break;
                }
                case 216: {
                    n14 = 135;
                    break;
                }
                case 217: {
                    n14 = 68;
                    break;
                }
                case 218: {
                    n14 = 129;
                    break;
                }
                case 219: {
                    n14 = 193;
                    break;
                }
                case 220: {
                    n14 = 10;
                    break;
                }
                case 221: {
                    n14 = 109;
                    break;
                }
                case 222: {
                    n14 = 7;
                    break;
                }
                case 223: {
                    n14 = 83;
                    break;
                }
                case 224: {
                    n14 = 47;
                    break;
                }
                case 225: {
                    n14 = 170;
                    break;
                }
                case 226: {
                    n14 = 97;
                    break;
                }
                case 227: {
                    n14 = 111;
                    break;
                }
                case 228: {
                    n14 = 21;
                    break;
                }
                case 229: {
                    n14 = 71;
                    break;
                }
                case 230: {
                    n14 = 50;
                    break;
                }
                case 231: {
                    n14 = 143;
                    break;
                }
                case 232: {
                    n14 = 245;
                    break;
                }
                case 233: {
                    n14 = 153;
                    break;
                }
                case 234: {
                    n14 = 118;
                    break;
                }
                case 235: {
                    n14 = 217;
                    break;
                }
                case 236: {
                    n14 = 128;
                    break;
                }
                case 237: {
                    n14 = 127;
                    break;
                }
                case 238: {
                    n14 = 202;
                    break;
                }
                case 239: {
                    n14 = 80;
                    break;
                }
                case 240: {
                    n14 = 134;
                    break;
                }
                case 241: {
                    n14 = 174;
                    break;
                }
                case 242: {
                    n14 = 94;
                    break;
                }
                case 243: {
                    n14 = 172;
                    break;
                }
                case 244: {
                    n14 = 101;
                    break;
                }
                case 245: {
                    n14 = 197;
                    break;
                }
                case 246: {
                    n14 = 121;
                    break;
                }
                case 247: {
                    n14 = 92;
                    break;
                }
                case 248: {
                    n14 = 12;
                    break;
                }
                case 249: {
                    n14 = 36;
                    break;
                }
                case 250: {
                    n14 = 110;
                    break;
                }
                case 251: {
                    n14 = 126;
                    break;
                }
                case 252: {
                    n14 = 74;
                    break;
                }
                case 253: {
                    n14 = 19;
                    break;
                }
                case 254: {
                    n14 = 122;
                    break;
                }
                default: {
                    n14 = 33;
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
            OG.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

