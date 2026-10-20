/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.IB;
import com.KV;
import com.W2;
import com.a9;
import com.au_0;
import com.c;
import com.cl_2;
import com.cx_1;
import com.eh_0;
import com.i2_0;
import com.ij_2;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.og_2;
import com.so_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JTabbedPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Hd
 */
public class hd_0
extends JTabbedPane
implements W2,
au_0,
eh_0,
yb_2,
cx_1 {
    private static String x;

    public hd_0() {
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
    }

    public hd_0(int n10) {
        super(n10);
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
    }

    public hd_0(int n10, int n11) {
        super(n10, n11);
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
    }

    public hd_0(ij_2 ij_22) {
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
        this.U(ij_22);
    }

    public hd_0(int n10, ij_2 ij_22) {
        super(n10);
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
        this.U(ij_22);
    }

    public hd_0(int n10, int n11, ij_2 ij_22) {
        super(n10, n11);
        this.setFocusable(false);
        this.setBackground((Color)cy_1.o);
        this.U(ij_22);
    }

    public int N(Point point) {
        return this.p(point.x, point.y);
    }

    public int p(int n10, int n11) {
        return this.indexAtLocation(n10, n11);
    }

    public Rectangle s(Point point) {
        return this.y(point.x, point.y);
    }

    public Rectangle y(int n10, int n11) {
        int n12 = this.p(n10, n11);
        return n12 != -1 ? this.getBoundsAt(n12) : null;
    }

    public int u() {
        return this.P().e();
    }

    public void i(int n10) {
        this.P().l(n10);
    }

    public int O() {
        return this.P().N();
    }

    public void o(int n10) {
        this.P().M(n10);
    }

    public boolean y() {
        return this.P().S();
    }

    public void s(boolean bl) {
        this.P().J(bl);
    }

    public Insets H() {
        return this.P().h();
    }

    public void f(Insets insets) {
        this.P().Z(insets);
    }

    public Insets o() {
        return this.P().r();
    }

    public void N(Insets insets) {
        this.P().S(insets);
    }

    public Color Z() {
        return this.P().O();
    }

    public void P(Color color) {
        this.P().R(color);
    }

    public Color G() {
        return this.P().n();
    }

    public void M(Color color) {
        this.P().t(color);
    }

    public Color g() {
        return this.P().T();
    }

    public void r(Color color) {
        this.P().T(color);
    }

    public Color M() {
        return this.P().z();
    }

    public void y(Color color) {
        this.P().u(color);
    }

    public void M(int n10, Color color) {
        this.P().x(n10, color);
    }

    public Color s(int n10) {
        return this.P().m(n10);
    }

    public void Y(int n10, og_2 og_22) {
        this.P().v(n10, og_22);
    }

    public og_2 N(int n10) {
        return this.P().k(n10);
    }

    public ij_2 q() {
        return this.P().t();
    }

    public void U(ij_2 ij_22) {
        this.P().e(ij_22);
    }

    public og_2 V() {
        return this.P().Q();
    }

    public void v(og_2 og_22) {
        this.P().G(og_22);
    }

    public int F() {
        return this.P().s();
    }

    public void q(int n10) {
        this.P().g(n10);
    }

    public int G() {
        return this.P().c();
    }

    public void R(int n10) {
        this.P().j(n10);
    }

    public so_0 w() {
        return this.P().d();
    }

    public void O(so_0 so_02) {
        this.P().x(so_02);
    }

    public Color U() {
        return this.P().r();
    }

    public void U(Color color) {
        this.P().P(color);
    }

    public Color h() {
        return this.P().k();
    }

    public void j(Color color) {
        this.P().k(color);
    }

    public boolean g() {
        return this.P().U();
    }

    public void A(boolean bl) {
        this.P().I(bl);
    }

    public boolean Z() {
        return this.P().h();
    }

    public void b(boolean bl) {
        this.P().m(bl);
    }

    public Color L() {
        return this.P().D();
    }

    public void k(Color color) {
        this.P().H(color);
    }

    public boolean O() {
        return this.P().f();
    }

    public void j(boolean bl) {
        this.P().R(bl);
    }

    @Override
    public Shape B() {
        return this.P().B();
    }

    public KV P() {
        return (KV)this.getUI();
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
                        var1_1 = hd_0.X();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw hd_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw hd_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof KV)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw hd_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((KV)kp_0.w(a9.z9, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new KV());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw hd_0.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
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

    public hd_0 m() {
        return (hd_0)FN.A(this);
    }

    public hd_0 s(boolean bl) {
        return (hd_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    @Override
    public hd_0 R() {
        return (hd_0)FN.u(this);
    }

    public hd_0 z(boolean bl) {
        return (hd_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public hd_0 N() {
        return (hd_0)FN.C(this);
    }

    public hd_0 i(boolean bl) {
        return (hd_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public hd_0 l(boolean bl, boolean bl2) {
        return (hd_0)FN.K(this, bl, bl2);
    }

    public hd_0 w(int n10) {
        return (hd_0)FN.p((Component)this, n10);
    }

    public hd_0 z(int n10) {
        return (hd_0)FN.O((Component)this, n10);
    }

    public hd_0 K(int n10) {
        return (hd_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public hd_0 M(int n10, boolean bl, boolean bl2) {
        return (hd_0)FN.d(this, n10, bl, bl2);
    }

    public hd_0 M(int n10, int n11) {
        return (hd_0)FN.m(this, n10, n11);
    }

    public hd_0 u(String string) {
        return (hd_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public void o(String string) {
        i2_0.f(this, string);
    }

    @Override
    public void I() {
        i2_0.p(this);
    }

    @Override
    public String q() {
        return i2_0.O(this);
    }

    @Override
    public Component N(String string) {
        return this.u(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.M(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.M(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.K(n10);
    }

    @Override
    public Component o(int n10) {
        return this.z(n10);
    }

    @Override
    public Component i(int n10) {
        return this.w(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.l(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.i(bl);
    }

    @Override
    public Component Q() {
        return this.N();
    }

    @Override
    public Component u(boolean bl) {
        return this.z(bl);
    }

    @Override
    public Component R() {
        return this.R();
    }

    @Override
    public Component c(boolean bl) {
        return this.s(bl);
    }

    @Override
    public Component a() {
        return this.m();
    }

    public static void E(String string) {
        x = string;
    }

    public static String X() {
        return x;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (hd_0.X() == null) {
            hd_0.E("ka6m1");
        }
    }
}

