/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D7;
import com.E4;
import com.FN;
import com.HT;
import com.O5;
import com.PY;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cs_0;
import com.fs_0;
import com.i1_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.og_2;
import com.ox_2;
import com.pp_0;
import com.rf_1;
import com.sa_0;
import com.sr_0;
import com.wd_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O_
extends JLabel
implements D7,
pp_0,
rf_1,
au_0,
yb_2,
sa_0 {
    boolean P = false;
    private static int[] R;
    private static final long[] ab;
    private static final Integer[] bb;

    public O_() {
    }

    public O_(Insets insets) {
        this.S(insets);
    }

    public O_(Icon icon) {
        super(icon);
    }

    public O_(Icon icon, Insets insets) {
        super(icon);
        this.S(insets);
    }

    public O_(int n10) {
        this.setHorizontalAlignment(n10);
    }

    public O_(int n10, Insets insets) {
        this.setHorizontalAlignment(n10);
        this.S(insets);
    }

    public O_(Icon icon, int n10) {
        super(icon, n10);
    }

    public O_(Icon icon, int n10, Insets insets) {
        super(icon, n10);
        this.S(insets);
    }

    public O_(String string) {
        super(E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
    }

    public O_(String string, Insets insets, Object[] objectArray) {
        super(E4.y(string, objectArray));
        E4.a(this, string, objectArray);
        this.S(insets);
    }

    public O_(String string, int n10, Object[] objectArray) {
        super(E4.y(string, objectArray), n10);
        E4.a(this, string, objectArray);
    }

    public O_(String string, int n10, Insets insets, Object[] objectArray) {
        super(E4.y(string, objectArray), n10);
        E4.a(this, string, objectArray);
        this.S(insets);
    }

    public O_(String string, Icon icon) {
        super(E4.y(string, new Object[0]), icon, O_.a(20961, 4942332477712218965L));
        E4.a(this, string, new Object[0]);
    }

    public O_(String string, Icon icon, Insets insets, Object[] objectArray) {
        super(E4.y(string, objectArray), icon, O_.a(15683, 4766077141184894966L));
        E4.a(this, string, objectArray);
        this.S(insets);
    }

    public O_(String string, Icon icon, int n10, Object[] objectArray) {
        super(E4.y(string, objectArray), icon, n10);
        E4.a(this, string, objectArray);
    }

    public O_(String string, Icon icon, int n10, Insets insets, Object[] objectArray) {
        super(E4.y(string, objectArray), icon, n10);
        E4.a(this, string, objectArray);
        this.S(insets);
    }

    public Insets N() {
        return this.R().C();
    }

    public O_ S(Insets insets) {
        this.R().q(insets);
        return this;
    }

    public O_ G(int n10, int n11, int n12, int n13) {
        this.S(new Insets(n10, n11, n12, n13));
        return this;
    }

    @Override
    public O_ x(int n10) {
        return this.G(n10, n10, n10, n10);
    }

    public og_2 Y() {
        return ox_2.y(this);
    }

    public O_ V(og_2 og_22) {
        ox_2.b(this, og_22);
        return this;
    }

    public boolean f() {
        return this.R().f();
    }

    public O_ D(boolean bl) {
        this.R().E(bl);
        return this;
    }

    public Color T() {
        return this.R().q();
    }

    public O_ q(Color color) {
        this.R().h(color);
        return this;
    }

    public Float x() {
        return this.R().I();
    }

    public O_ c(Float f10) {
        this.R().c(f10);
        return this;
    }

    @Override
    public String A() {
        return this.R().A();
    }

    @Override
    public void S(String string) {
        this.R().S(string);
    }

    public i1_0 R() {
        return (i1_0)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = O_.D();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw O_.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw O_.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof i1_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw O_.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((i1_0)kp_0.w(a9.zW, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new i1_0());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw O_.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public MouseAdapter o(O5 o5) {
        return fs_0.F(this, o5);
    }

    @Override
    public MouseAdapter j(HT hT2, O5 o5) {
        return fs_0.h(this, hT2, o5);
    }

    @Override
    public MouseAdapter e(O5 o5) {
        return fs_0.P(this, o5);
    }

    @Override
    public MouseAdapter N(O5 o5) {
        return fs_0.H(this, o5);
    }

    @Override
    public MouseAdapter a(O5 o5) {
        return fs_0.W(this, o5);
    }

    @Override
    public MouseAdapter L(HT hT2, O5 o5) {
        return fs_0.W(this, hT2, o5);
    }

    @Override
    public MouseAdapter h(O5 o5) {
        return fs_0.J(this, o5);
    }

    @Override
    public MouseAdapter d(HT hT2, O5 o5) {
        return fs_0.O((Component)this, hT2, o5);
    }

    @Override
    public MouseAdapter F(O5 o5) {
        return fs_0.q(this, o5);
    }

    @Override
    public MouseAdapter v(O5 o5) {
        return fs_0.o(this, o5);
    }

    @Override
    public KeyAdapter i(sr_0 sr_02) {
        return fs_0.G(this, sr_02);
    }

    @Override
    public KeyAdapter I(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.O((Component)this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter g(sr_0 sr_02) {
        return fs_0.Q(this, sr_02);
    }

    @Override
    public KeyAdapter U(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.R(this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter e(sr_0 sr_02) {
        return fs_0.u(this, sr_02);
    }

    @Override
    public KeyAdapter j(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.I(this, cs_02, sr_02);
    }

    @Override
    public FocusAdapter u(az_0 az_02) {
        return fs_0.K(this, az_02);
    }

    @Override
    public FocusAdapter e(az_0 az_02) {
        return fs_0.t(this, az_02);
    }

    @Override
    public wd_0 p(String string) {
        return ac_0.I(this, string);
    }

    @Override
    public wd_0 d(Icon icon, String string) {
        return ac_0.d(this, icon, string);
    }

    @Override
    public wd_0 V(String string, WF wF) {
        return ac_0.B(this, string, wF);
    }

    @Override
    public wd_0 X(Icon icon, String string, WF wF) {
        return ac_0.g((Component)this, icon, string, wF);
    }

    @Override
    public wd_0 y(String string, WF wF, int n10) {
        return ac_0.l(this, string, wF, n10);
    }

    @Override
    public wd_0 Y(Icon icon, String string, WF wF, int n10) {
        return ac_0.R(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 g(JComponent jComponent) {
        return ac_0.k(this, jComponent);
    }

    @Override
    public wd_0 I(JComponent jComponent, int n10) {
        return ac_0.o((Component)this, jComponent, n10);
    }

    @Override
    public wd_0 j(JComponent jComponent, WF wF) {
        return ac_0.R(this, jComponent, wF);
    }

    @Override
    public wd_0 g(JComponent jComponent, WF wF, int n10) {
        return ac_0.B(this, jComponent, wF, n10);
    }

    @Override
    public wd_0 s(String string) {
        return ac_0.Q((Component)this, string);
    }

    @Override
    public wd_0 u(Icon icon, String string) {
        return ac_0.o((Component)this, icon, string);
    }

    @Override
    public wd_0 u(String string, WF wF) {
        return ac_0.q(this, string, wF);
    }

    @Override
    public wd_0 h(Icon icon, String string, WF wF) {
        return ac_0.P(this, icon, string, wF);
    }

    @Override
    public wd_0 f(String string, WF wF, int n10) {
        return ac_0.r(this, string, wF, n10);
    }

    @Override
    public wd_0 o(Icon icon, String string, WF wF, int n10) {
        return ac_0.V(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 B(JComponent jComponent) {
        return ac_0.Q((Component)this, jComponent);
    }

    @Override
    public wd_0 p(JComponent jComponent, int n10) {
        return ac_0.S(this, jComponent, n10);
    }

    @Override
    public wd_0 n(JComponent jComponent, WF wF) {
        return ac_0.I(this, jComponent, wF);
    }

    @Override
    public wd_0 X(JComponent jComponent, WF wF, int n10) {
        return ac_0.U(this, jComponent, wF, n10);
    }

    @Override
    public void Q(wd_0 wd_02) {
        ac_0.s(this, wd_02);
    }

    @Override
    public void O() {
        ac_0.o(this);
    }

    @Override
    public void q(wd_0[] wd_0Array) {
        ac_0.Y(this, wd_0Array);
    }

    @Override
    public void W(List list) {
        ac_0.S(this, list);
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

    public O_ g() {
        return (O_)FN.A(this);
    }

    public O_ e(boolean bl) {
        return (O_)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public O_ A() {
        return (O_)FN.u(this);
    }

    public O_ B(boolean bl) {
        return (O_)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public O_ b() {
        return (O_)FN.C(this);
    }

    @Override
    public O_ u(boolean bl) {
        return (O_)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public O_ Q(boolean bl, boolean bl2) {
        return (O_)FN.K(this, bl, bl2);
    }

    public O_ U(int n10) {
        return (O_)FN.p((Component)this, n10);
    }

    public O_ N(int n10) {
        return (O_)FN.O((Component)this, n10);
    }

    public O_ h(int n10) {
        return (O_)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public O_ B(int n10, boolean bl, boolean bl2) {
        return (O_)FN.d(this, n10, bl, bl2);
    }

    public O_ E(int n10, int n11) {
        return (O_)FN.m(this, n10, n11);
    }

    public O_ S(String string) {
        return (O_)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    @Override
    public O_ i(int n10) {
        return (O_)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    @Override
    public O_ V(int n10) {
        return (O_)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public O_ a(int n10) {
        return (O_)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public O_ m(int n10) {
        return (O_)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public O_ r(int n10) {
        return (O_)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public O_ G(int n10) {
        return (O_)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public O_ u(int n10, int n11) {
        return (O_)PY.O(this, n10, n11);
    }

    public boolean Y() {
        return this.P;
    }

    public void d(boolean bl) {
        this.P = bl;
    }

    @Override
    public Component N(String string) {
        return this.S(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.E(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.B(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.h(n10);
    }

    @Override
    public Component o(int n10) {
        return this.N(n10);
    }

    @Override
    public Component i(int n10) {
        return this.U(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.Q(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.u(bl);
    }

    @Override
    public Component Q() {
        return this.b();
    }

    @Override
    public Component u(boolean bl) {
        return this.B(bl);
    }

    @Override
    public Component R() {
        return this.A();
    }

    @Override
    public Component c(boolean bl) {
        return this.e(bl);
    }

    @Override
    public Component a() {
        return this.g();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.u(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.G(n10);
    }

    @Override
    public Component p(int n10) {
        return this.r(n10);
    }

    @Override
    public Component D(int n10) {
        return this.m(n10);
    }

    @Override
    public Component V(int n10) {
        return this.a(n10);
    }

    @Override
    public Component x(int n10) {
        return this.V(n10);
    }

    @Override
    public Component O(int n10) {
        return this.i(n10);
    }

    public static void J(int[] nArray) {
        R = nArray;
    }

    public static int[] D() {
        return R;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5917306803444411442L;
        long[] lArray = new long[2];
        int n10 = 0;
        O_.J(new int[5]);
        String string = "\u0006\u00aa\u0003#\u00c2!;\u00ce\u0092\u00f9\u00c9\u00e9Q\u00a7\u00d7m";
        int n11 = "\u0006\u00aa\u0003#\u00c2!;\u00ce\u0092\u00f9\u00c9\u00e9Q\u00a7\u00d7m".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        ab = lArray;
        bb = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6AB5;
        if (bb[n11] == null) {
            O_.bb[n11] = (int)(ab[n11] ^ l2);
        }
        return bb[n11];
    }
}

