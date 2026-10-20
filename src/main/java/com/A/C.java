/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.M;
import com.A.d;
import com.E4;
import com.E_;
import com.FN;
import com.IB;
import com.ON;
import com.SN;
import com.W_;
import com.a.m_0;
import com.aJ;
import com.au_0;
import com.c4_0;
import com.cl_2;
import com.cx_1;
import com.e__0;
import com.eh_0;
import com.fs_0;
import com.i2_0;
import com.k2_0;
import com.ld_2;
import com.pj_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class C
extends JFrame
implements pj_0,
au_0,
cx_1,
eh_0,
W_ {
    protected boolean N = false;
    protected c4_0 g;

    public C() {
        this.R();
    }

    public C(GraphicsConfiguration graphicsConfiguration) {
        super(graphicsConfiguration);
        this.R();
    }

    public C(String string) {
        super(E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
        this.R();
    }

    public C(String string, GraphicsConfiguration graphicsConfiguration) {
        super(E4.y(string, new Object[0]), graphicsConfiguration);
        E4.a(this, string, new Object[0]);
        this.R();
    }

    protected void R() {
        FN.Y(this);
        this.g = new M(this, true);
        ON.b(this, this.g);
    }

    public boolean Q() {
        return this.N;
    }

    public void Q(boolean bl) {
        this.N = bl;
    }

    public List R() {
        return this.g.t();
    }

    public void i(Component component) {
        this.g.p(component);
    }

    public void w(Component component) {
        this.g.C(component);
    }

    public Color n() {
        return this.f().q();
    }

    public void i(Color color) {
        this.f().R(color);
    }

    public Color E() {
        return this.f().V();
    }

    public void q(Color color) {
        this.f().k(color);
    }

    public int y() {
        return this.f().x();
    }

    public void R(int n10) {
        this.f().f(n10);
    }

    public int u() {
        return this.f().d();
    }

    public void e(int n10) {
        this.f().b(n10);
    }

    public int r() {
        return this.f().u();
    }

    public void G(int n10) {
        this.f().Q(n10);
    }

    public boolean s() {
        return this.f().C();
    }

    public void l(boolean bl) {
        this.f().H(bl);
    }

    public ImageIcon b() {
        return this.f().l();
    }

    public void m(ImageIcon imageIcon) {
        this.f().g(imageIcon);
    }

    public int R() {
        return this.f().R();
    }

    public void V(int n10) {
        this.f().q(n10);
    }

    public String r() {
        return this.f().D();
    }

    public void k(String string) {
        this.f().S(string);
    }

    public JComponent e() {
        return this.f().R();
    }

    public void B(JComponent jComponent) {
        this.f().B(jComponent);
    }

    public k2_0 l() {
        return this.f().M();
    }

    public m_0 s() {
        return this.f().F();
    }

    public boolean f() {
        return this.f().i();
    }

    public void n(boolean bl) {
        this.f().m(bl);
    }

    public boolean w() {
        return this.f().A();
    }

    public void w(boolean bl) {
        this.f().V(bl);
    }

    public boolean E() {
        return this.f().y();
    }

    public void g(boolean bl) {
        this.f().r(bl);
    }

    public boolean F() {
        return this.f().k();
    }

    public void h(boolean bl) {
        this.f().v(bl);
    }

    public boolean W() {
        return this.f().t();
    }

    public void k(boolean bl) {
        this.f().L(bl);
    }

    public boolean J() {
        return this.f().w();
    }

    public void D(boolean bl) {
        this.f().E(bl);
    }

    public boolean x() {
        return this.f().v();
    }

    public void A(boolean bl) {
        this.f().f(bl);
    }

    public boolean R() {
        return this.f().z();
    }

    public void Z(boolean bl) {
        this.f().O(bl);
    }

    public boolean c() {
        return this.f().s();
    }

    public void r(boolean bl) {
        this.f().C(bl);
    }

    public d f() {
        return (d)super.getRootPane().getUI();
    }

    @Override
    public WindowAdapter H(E_ e_) {
        return fs_0.G(this, e_);
    }

    @Override
    public aJ K(e__0 e__02) {
        return fs_0.c(this, e__02);
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this.getRootPane(), string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this.getRootPane(), objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this.getRootPane(), string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this.getRootPane());
    }

    @Override
    public boolean k() {
        return i2_0.Z(this.getRootPane());
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this.getRootPane(), ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this.getRootPane());
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
    public void p(String string) {
        cl_2.c(this.getRootPane(), string);
    }

    @Override
    public void a(String string, Class clazz) {
        cl_2.x(this.getRootPane(), string, clazz);
    }

    @Override
    public void E(String string, Object object) {
        cl_2.e(this.getRootPane(), string, object);
    }

    @Override
    public void n(String string, String string2) {
        cl_2.B(this.getRootPane(), string, string2);
    }

    @Override
    public void I(String string, String string2, Class clazz) {
        cl_2.t(this.getRootPane(), string, string2, clazz);
    }

    @Override
    public void H(String string, String string2, Object object) {
        cl_2.a(this.getRootPane(), string, string2, object);
    }

    @Override
    public void S(String string, boolean bl, boolean bl2) {
        cl_2.l(this.getRootPane(), string, bl, bl2);
    }

    @Override
    public void O(String string, Class clazz, boolean bl, boolean bl2) {
        cl_2.X(this.getRootPane(), string, clazz, bl, bl2);
    }

    @Override
    public void h(String string, Object object, boolean bl, boolean bl2) {
        cl_2.A(this.getRootPane(), string, object, bl, bl2);
    }

    @Override
    public void e(String string, String string2, Class clazz, boolean bl, boolean bl2) {
        cl_2.L(this.getRootPane(), string, string2, clazz, bl, bl2);
    }

    @Override
    public void D(String string, String string2, Object object, boolean bl, boolean bl2) {
        cl_2.y(this.getRootPane(), string, string2, object, bl, bl2);
    }

    @Override
    public void z(IB iB) {
        cl_2.a(this.getRootPane(), iB);
    }

    @Override
    public void w() {
        cl_2.O(this.getRootPane());
    }

    @Override
    public void m() {
        cl_2.G(this.getRootPane());
    }

    @Override
    public void e() {
        cl_2.H(this.getRootPane());
    }

    public C V(boolean bl) {
        return (C)SN.N(this, bl);
    }

    @Override
    public boolean N() {
        return SN.B(this);
    }

    public C T(float f10) {
        return (C)SN.s(this, f10);
    }

    @Override
    public float B() {
        return SN.A(this);
    }

    public C U() {
        return (C)SN.v(this);
    }

    public C i(Component component) {
        return (C)SN.u(this, component);
    }

    public C k(int n10, int n11) {
        return (C)SN.H(this, n10, n11);
    }

    public C e(Component component, int n10, int n11) {
        return (C)SN.Q(this, component, n10, n11);
    }

    public C Y(int n10) {
        return (C)SN.W(this, n10);
    }

    public C k(int n10) {
        return (C)SN.G(this, n10);
    }

    public C i() {
        return (C)SN.D(this);
    }

    public C w(boolean bl) {
        return (C)SN.g(this, bl);
    }

    @Override
    public Window S(boolean bl) {
        return this.w(bl);
    }

    @Override
    public Window X() {
        return this.i();
    }

    @Override
    public Window o(int n10) {
        return this.k(n10);
    }

    @Override
    public Window U(int n10) {
        return this.Y(n10);
    }

    @Override
    public Window A(Component component, int n10, int n11) {
        return this.e(component, n10, n11);
    }

    @Override
    public Window q(int n10, int n11) {
        return this.k(n10, n11);
    }

    @Override
    public Window I(Component component) {
        return this.i(component);
    }

    @Override
    public Window F() {
        return this.U();
    }

    @Override
    public Window D(float f10) {
        return this.T(f10);
    }

    @Override
    public Window h(boolean bl) {
        return this.V(bl);
    }
}

