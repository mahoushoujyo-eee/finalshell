/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DU;
import com.F5;
import com.FN;
import com.HT;
import com.IB;
import com.O5;
import com.RS;
import com.a9;
import com.au_0;
import com.az_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.ne_2;
import com.pp_0;
import com.rk_0;
import com.sr_0;
import com.yb_2;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Xa
 */
public class xa_0
extends JEditorPane
implements RS,
pp_0,
au_0,
eh_0,
yb_2 {
    public xa_0() {
    }

    public xa_0(URL uRL) throws IOException {
        super(uRL);
    }

    public xa_0(String string, String string2) {
        super(string, string2);
    }

    public xa_0(String string) throws IOException {
        super(string);
    }

    public void E() {
        this.setText("");
    }

    public DU g() {
        return (DU)this.getUI();
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
                        var1_1 = ne_2.m();
                        v0 = this;
                        if (var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw xa_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw xa_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof DU)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw xa_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((DU)kp_0.w(a9.zm, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new DU());
                        if (!var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw xa_0.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        this.invalidate();
    }

    @Override
    public F5 i(rk_0 rk_02) {
        return fs_0.X(this, rk_02);
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

    public xa_0 G() {
        return (xa_0)FN.A(this);
    }

    public xa_0 K(boolean bl) {
        return (xa_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public xa_0 K() {
        return (xa_0)FN.u(this);
    }

    public xa_0 R(boolean bl) {
        return (xa_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public xa_0 x() {
        return (xa_0)FN.C(this);
    }

    public xa_0 m(boolean bl) {
        return (xa_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public xa_0 w(boolean bl, boolean bl2) {
        return (xa_0)FN.K(this, bl, bl2);
    }

    public xa_0 x(int n10) {
        return (xa_0)FN.p((Component)this, n10);
    }

    @Override
    public xa_0 i(int n10) {
        return (xa_0)FN.O((Component)this, n10);
    }

    public xa_0 U(int n10) {
        return (xa_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public xa_0 z(int n10, boolean bl, boolean bl2) {
        return (xa_0)FN.d(this, n10, bl, bl2);
    }

    public xa_0 d(int n10, int n11) {
        return (xa_0)FN.m(this, n10, n11);
    }

    public xa_0 T(String string) {
        return (xa_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.T(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.d(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.z(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.U(n10);
    }

    @Override
    public Component o(int n10) {
        return this.i(n10);
    }

    @Override
    public Component i(int n10) {
        return this.x(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.w(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.m(bl);
    }

    @Override
    public Component Q() {
        return this.x();
    }

    @Override
    public Component u(boolean bl) {
        return this.R(bl);
    }

    @Override
    public Component R() {
        return this.K();
    }

    @Override
    public Component c(boolean bl) {
        return this.K(bl);
    }

    @Override
    public Component a() {
        return this.G();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

