/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.HT;
import com.O5;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cs_0;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.oj_0;
import com.pp_0;
import com.rf_1;
import com.sr_0;
import com.wd_0;
import com.wv_2;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Xi
 */
public class xi_0
extends JLabel
implements pp_0,
rf_1,
au_0,
yb_2 {
    private static final String a;
    private static final long b;

    public xi_0() {
    }

    public xi_0(Icon icon) {
        super(icon);
    }

    public xi_0(Icon icon, int n10) {
        super(icon, n10);
    }

    public xi_0(String string) {
        super(string);
    }

    public xi_0(String string, int n10) {
        super(string, n10);
    }

    public xi_0(String string, Icon icon) {
        super(string, icon, (int)b);
    }

    public xi_0(String string, Icon icon, int n10) {
        super(string, icon, n10);
    }

    public boolean c() {
        return this.d().Z();
    }

    public void p(boolean bl) {
        this.d().B(bl);
    }

    public Color D() {
        return this.d().F();
    }

    public void x(Color color) {
        this.d().l(color);
    }

    public wv_2 d() {
        return (wv_2)this.getUI();
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
                        var1_1 = oj_0.V();
                        v0 = this;
                        if (var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw xi_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw xi_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof wv_2)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw xi_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((wv_2)kp_0.w(a9.a, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new wv_2());
                        if (!var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw xi_0.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public String getUIClassID() {
        return a;
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

    public xi_0 w() {
        return (xi_0)FN.A(this);
    }

    public xi_0 D(boolean bl) {
        return (xi_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public xi_0 J() {
        return (xi_0)FN.u(this);
    }

    public xi_0 F(boolean bl) {
        return (xi_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public xi_0 j() {
        return (xi_0)FN.C(this);
    }

    public xi_0 y(boolean bl) {
        return (xi_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public xi_0 h(boolean bl, boolean bl2) {
        return (xi_0)FN.K(this, bl, bl2);
    }

    public xi_0 w(int n10) {
        return (xi_0)FN.p((Component)this, n10);
    }

    @Override
    public xi_0 i(int n10) {
        return (xi_0)FN.O((Component)this, n10);
    }

    public xi_0 M(int n10) {
        return (xi_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public xi_0 c(int n10, boolean bl, boolean bl2) {
        return (xi_0)FN.d(this, n10, bl, bl2);
    }

    public xi_0 V(int n10, int n11) {
        return (xi_0)FN.m(this, n10, n11);
    }

    public xi_0 g(String string) {
        return (xi_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.g(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.V(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.c(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.M(n10);
    }

    @Override
    public Component o(int n10) {
        return this.i(n10);
    }

    @Override
    public Component i(int n10) {
        return this.w(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.h(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.y(bl);
    }

    @Override
    public Component Q() {
        return this.j();
    }

    @Override
    public Component u(boolean bl) {
        return this.F(bl);
    }

    @Override
    public Component R() {
        return this.J();
    }

    @Override
    public Component c(boolean bl) {
        return this.D(bl);
    }

    @Override
    public Component a() {
        return this.w();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = ")\u001f|U\u0006-\u001c\n\u000f\\@\r\u0004\u00191#".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 115;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 23;
                            break;
                        }
                        case 1: {
                            n17 = 25;
                            break;
                        }
                        case 2: {
                            n17 = 99;
                            break;
                        }
                        case 3: {
                            n17 = 82;
                            break;
                        }
                        case 4: {
                            n17 = 28;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 6;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 148688673252694591L;
        b = 0x5A9100967F59DA35L ^ l2;
    }
}

