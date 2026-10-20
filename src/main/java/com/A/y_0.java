/*
 * Decompiled with CFR 0.152.
 */
package com.a;

import com.A.d;
import com.E4;
import com.E_;
import com.FN;
import com.IB;
import com.ON;
import com.SN;
import com.W_;
import com.a.m_0;
import com.a.o_0;
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
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.A.y
 */
public class y_0
extends JDialog
implements pj_0,
au_0,
cx_1,
eh_0,
W_ {
    protected boolean a = false;
    protected c4_0 l;
    private static int[] D;

    public y_0() {
        this.j();
    }

    public y_0(Frame frame) {
        super(frame);
        this.j();
    }

    public y_0(Frame frame, boolean bl) {
        super(frame, bl);
        this.j();
    }

    public y_0(Frame frame, String string) {
        super(frame, E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Frame frame, String string, boolean bl) {
        super(frame, E4.y(string, new Object[0]), bl);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Frame frame, String string, boolean bl, GraphicsConfiguration graphicsConfiguration) {
        super(frame, E4.y(string, new Object[0]), bl, graphicsConfiguration);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Dialog dialog) {
        super(dialog);
        this.j();
    }

    public y_0(Dialog dialog, boolean bl) {
        super(dialog, bl);
        this.j();
    }

    public y_0(Dialog dialog, String string) {
        super(dialog, E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Dialog dialog, String string, boolean bl) {
        super(dialog, E4.y(string, new Object[0]), bl);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Dialog dialog, String string, boolean bl, GraphicsConfiguration graphicsConfiguration) {
        super(dialog, E4.y(string, new Object[0]), bl, graphicsConfiguration);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Component component) {
        super(FN.L(component));
        this.j();
    }

    public y_0(Component component, String string) {
        super(FN.L(component), E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Window window) {
        super(window);
        this.j();
    }

    public y_0(Window window, Dialog.ModalityType modalityType) {
        super(window, modalityType);
        this.j();
    }

    public y_0(Window window, String string) {
        super(window, E4.y(string, new Object[0]));
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Window window, String string, Dialog.ModalityType modalityType) {
        super(window, E4.y(string, new Object[0]), modalityType);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    public y_0(Window window, String string, Dialog.ModalityType modalityType, GraphicsConfiguration graphicsConfiguration) {
        super(window, E4.y(string, new Object[0]), modalityType, graphicsConfiguration);
        E4.a(this, string, new Object[0]);
        this.j();
    }

    protected void j() {
        FN.Y(this);
        this.setDefaultCloseOperation(2);
        this.l = new o_0(this, true);
        ON.b(this, this.l);
    }

    public boolean i() {
        return this.a;
    }

    public void r(boolean bl) {
        this.a = bl;
    }

    public List s() {
        return this.l.t();
    }

    public void q(Component component) {
        this.l.p(component);
    }

    public void t(Component component) {
        this.l.C(component);
    }

    public Color D() {
        return this.d().q();
    }

    public void X(Color color) {
        this.d().R(color);
    }

    public Color N() {
        return this.d().V();
    }

    public void K(Color color) {
        this.d().k(color);
    }

    public int G() {
        return this.d().x();
    }

    public void L(int n10) {
        this.d().f(n10);
    }

    public int X() {
        return this.d().d();
    }

    public void t(int n10) {
        this.d().b(n10);
    }

    public int S() {
        return this.d().u();
    }

    public void U(int n10) {
        this.d().Q(n10);
    }

    public boolean y() {
        return this.d().C();
    }

    public void y(boolean bl) {
        this.d().H(bl);
    }

    public ImageIcon E() {
        return this.d().l();
    }

    public void L(ImageIcon imageIcon) {
        this.d().g(imageIcon);
    }

    public int j() {
        return this.d().R();
    }

    public void Y(int n10) {
        this.d().q(n10);
    }

    public String D() {
        return this.d().D();
    }

    public void r(String string) {
        this.d().S(string);
    }

    public JComponent e() {
        return this.d().R();
    }

    public void P(JComponent jComponent) {
        this.d().B(jComponent);
    }

    public k2_0 T() {
        return this.d().M();
    }

    public m_0 A() {
        return this.d().F();
    }

    public boolean l() {
        return this.d().i();
    }

    public void j(boolean bl) {
        this.d().m(bl);
    }

    public boolean Q() {
        return this.d().A();
    }

    public void s(boolean bl) {
        this.d().V(bl);
    }

    public boolean B() {
        return this.d().y();
    }

    public void T(boolean bl) {
        this.d().r(bl);
    }

    public boolean R() {
        return this.d().k();
    }

    public void O(boolean bl) {
        this.d().v(bl);
    }

    public boolean K() {
        return this.d().t();
    }

    public void n(boolean bl) {
        this.d().L(bl);
    }

    public boolean o() {
        return this.d().w();
    }

    public void V(boolean bl) {
        this.d().E(bl);
    }

    public boolean A() {
        return this.d().v();
    }

    public void k(boolean bl) {
        this.d().f(bl);
    }

    public boolean I() {
        return this.d().z();
    }

    public void a(boolean bl) {
        this.d().O(bl);
    }

    public boolean T() {
        return this.d().s();
    }

    public void L(boolean bl) {
        this.d().C(bl);
    }

    public d d() {
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

    public y_0 Z(boolean bl) {
        return (y_0)SN.N(this, bl);
    }

    @Override
    public boolean N() {
        return SN.B(this);
    }

    public y_0 v(float f10) {
        return (y_0)SN.s(this, f10);
    }

    @Override
    public float B() {
        return SN.A(this);
    }

    public y_0 l() {
        return (y_0)SN.v(this);
    }

    public y_0 u(Component component) {
        return (y_0)SN.u(this, component);
    }

    public y_0 N(int n10, int n11) {
        return (y_0)SN.H(this, n10, n11);
    }

    public y_0 a(Component component, int n10, int n11) {
        return (y_0)SN.Q(this, component, n10, n11);
    }

    public y_0 y(int n10) {
        return (y_0)SN.W(this, n10);
    }

    @Override
    public y_0 o(int n10) {
        return (y_0)SN.G(this, n10);
    }

    public y_0 q() {
        return (y_0)SN.D(this);
    }

    public y_0 r(boolean bl) {
        return (y_0)SN.g(this, bl);
    }

    @Override
    public Window S(boolean bl) {
        return this.r(bl);
    }

    @Override
    public Window X() {
        return this.q();
    }

    @Override
    public Window o(int n10) {
        return this.o(n10);
    }

    @Override
    public Window U(int n10) {
        return this.y(n10);
    }

    @Override
    public Window A(Component component, int n10, int n11) {
        return this.a(component, n10, n11);
    }

    @Override
    public Window q(int n10, int n11) {
        return this.N(n10, n11);
    }

    @Override
    public Window I(Component component) {
        return this.u(component);
    }

    @Override
    public Window F() {
        return this.l();
    }

    @Override
    public Window D(float f10) {
        return this.v(f10);
    }

    @Override
    public Window h(boolean bl) {
        return this.Z(bl);
    }

    static void X(y_0 y_02, WindowEvent windowEvent) {
        y_02.processWindowEvent(windowEvent);
    }

    public static void s(int[] nArray) {
        D = nArray;
    }

    public static int[] M() {
        return D;
    }

    static {
        if (y_0.M() == null) {
            y_0.s(new int[3]);
        }
    }
}

