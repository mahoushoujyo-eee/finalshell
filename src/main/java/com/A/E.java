/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.f;
import com.E_;
import com.FN;
import com.IB;
import com.ON;
import com.SN;
import com.W_;
import com.aJ;
import com.c4_0;
import com.cl_2;
import com.cx_1;
import com.e__0;
import com.eh_0;
import com.fs_0;
import com.i2_0;
import com.pj_0;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.JWindow;

public class E
extends JWindow
implements pj_0,
cx_1,
eh_0,
W_ {
    protected boolean U = false;
    protected c4_0 B;

    public E() {
        this.b();
    }

    public E(GraphicsConfiguration graphicsConfiguration) {
        super(graphicsConfiguration);
        this.b();
    }

    public E(Frame frame) {
        super(frame);
        this.b();
    }

    public E(Component component) {
        super(FN.L(component));
        this.b();
    }

    public E(Window window) {
        super(window);
        this.b();
    }

    public E(Window window, GraphicsConfiguration graphicsConfiguration) {
        super(window, graphicsConfiguration);
        this.b();
    }

    protected void b() {
        this.setFocusable(true);
        FN.Y(this);
        this.B = new f(this, true);
        ON.b(this, this.B);
    }

    public boolean g() {
        return this.U;
    }

    public void W(boolean bl) {
        this.U = bl;
    }

    public List P() {
        return this.B.t();
    }

    public void b(Component component) {
        this.B.p(component);
    }

    public void u(Component component) {
        this.B.C(component);
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

    public E p(boolean bl) {
        return (E)SN.N(this, bl);
    }

    @Override
    public boolean N() {
        return SN.B(this);
    }

    public E s(float f10) {
        return (E)SN.s(this, f10);
    }

    @Override
    public float B() {
        return SN.A(this);
    }

    public E S() {
        return (E)SN.v(this);
    }

    public E z(Component component) {
        return (E)SN.u(this, component);
    }

    public E O(int n10, int n11) {
        return (E)SN.H(this, n10, n11);
    }

    public E j(Component component, int n10, int n11) {
        return (E)SN.Q(this, component, n10, n11);
    }

    public E B(int n10) {
        return (E)SN.W(this, n10);
    }

    public E L(int n10) {
        return (E)SN.G(this, n10);
    }

    public E n() {
        return (E)SN.D(this);
    }

    public E j(boolean bl) {
        return (E)SN.g(this, bl);
    }

    @Override
    public Window S(boolean bl) {
        return this.j(bl);
    }

    @Override
    public Window X() {
        return this.n();
    }

    @Override
    public Window o(int n10) {
        return this.L(n10);
    }

    @Override
    public Window U(int n10) {
        return this.B(n10);
    }

    @Override
    public Window A(Component component, int n10, int n11) {
        return this.j(component, n10, n11);
    }

    @Override
    public Window q(int n10, int n11) {
        return this.O(n10, n11);
    }

    @Override
    public Window I(Component component) {
        return this.z(component);
    }

    @Override
    public Window F() {
        return this.S();
    }

    @Override
    public Window D(float f10) {
        return this.s(f10);
    }

    @Override
    public Window h(boolean bl) {
        return this.p(bl);
    }
}

