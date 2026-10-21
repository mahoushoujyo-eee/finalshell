package com.A;

import com.E4;
import com.E_;
import com.Eh_2;
import com.IB;
import com.Pj_2;
import com.SN;
import com.e__2;
import com.i2_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class C extends JFrame implements Pj_2, com.au_2, com.cX_3, Eh_2, com.W_ {
   protected boolean N = false;
   protected com.c4_2 g;

   public C() {
      this.R();
   }

   public C(GraphicsConfiguration var1) {
      super(var1);
      this.R();
   }

   public C(String var1) {
      super(E4.y(var1, new Object[0]));
      E4.a(this, var1, new Object[0]);
      this.R();
   }

   public C(String var1, GraphicsConfiguration var2) {
      super(E4.y(var1, new Object[0]), var2);
      E4.a(this, var1, new Object[0]);
      this.R();
   }

   protected void R() {
      com.FN.Y(this);
      this.g = new com.A.M(this, true);
      com.ON.b(this, this.g);
   }

   public boolean Q() {
      return this.N;
   }

   public void Q(boolean var1) {
      this.N = var1;
   }

   public List R$List() {
      return this.g.t();
   }

   public void i(Component var1) {
      this.g.p(var1);
   }

   public void w(Component var1) {
      this.g.C(var1);
   }

   public Color n() {
      return this.f().q();
   }

   public void i(Color var1) {
      this.f().R(var1);
   }

   public Color E() {
      return this.f().V();
   }

   public void q(Color var1) {
      this.f().k(var1);
   }

   public int y() {
      return this.f().x();
   }

   public void R(int var1) {
      this.f().f(var1);
   }

   public int u() {
      return this.f().d();
   }

   public void e(int var1) {
      this.f().b(var1);
   }

   public int r() {
      return this.f().u();
   }

   public void G(int var1) {
      this.f().Q(var1);
   }

   public boolean s() {
      return this.f().C();
   }

   public void l(boolean var1) {
      this.f().H(var1);
   }

   public ImageIcon b() {
      return this.f().l();
   }

   public void m(ImageIcon var1) {
      this.f().g(var1);
   }

   public int R$int() {
      return this.f().R();
   }

   public void V(int var1) {
      this.f().q(var1);
   }

   public String r$String() {
      return this.f().D();
   }

   public void k(String var1) {
      this.f().S(var1);
   }

   public JComponent e() {
      return this.f().R();
   }

   public void B(JComponent var1) {
      this.f().B(var1);
   }

   public com.k2_2 l() {
      return this.f().M();
   }

   public com.A.m_2 s$comAm_2() {
      return this.f().F();
   }

   public boolean f() {
      return this.f().i();
   }

   public void n(boolean var1) {
      this.f().m(var1);
   }

   public boolean w() {
      return this.f().A();
   }

   public void w(boolean var1) {
      this.f().V(var1);
   }

   public boolean E$boolean() {
      return this.f().y();
   }

   public void g(boolean var1) {
      this.f().r(var1);
   }

   public boolean F() {
      return this.f().k();
   }

   public void h(boolean var1) {
      this.f().v(var1);
   }

   public boolean W() {
      return this.f().t();
   }

   public void k(boolean var1) {
      this.f().L(var1);
   }

   public boolean J() {
      return this.f().w();
   }

   public void D(boolean var1) {
      this.f().E(var1);
   }

   public boolean x() {
      return this.f().v();
   }

   public void A(boolean var1) {
      this.f().f(var1);
   }

   public boolean R$boolean() {
      return this.f().z();
   }

   public void Z(boolean var1) {
      this.f().O(var1);
   }

   public boolean c() {
      return this.f().s();
   }

   public void r(boolean var1) {
      this.f().C(var1);
   }

   public com.A.d f$comAd() {
      return (com.A.d)super.getRootPane().getUI();
   }

   @Override
   public WindowAdapter H(E_ var1) {
      return com.Fs_2.G(this, var1);
   }

   @Override
   public com.aJ K(e__2 var1) {
      return com.Fs_2.c(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      i2_2.n(this.getRootPane(), var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this.getRootPane(), var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this.getRootPane(), var1, var2);
   }

   @Override
   public void M() {
      i2_2.L(this.getRootPane());
   }

   @Override
   public boolean k() {
      return i2_2.Z(this.getRootPane());
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this.getRootPane(), var1);
   }

   @Override
   public void i() {
      i2_2.o(this.getRootPane());
   }

   @Override
   public void o(String var1) {
      i2_2.f(this, var1);
   }

   @Override
   public void I() {
      i2_2.p(this);
   }

   @Override
   public String q() {
      return i2_2.O(this);
   }

   @Override
   public void p(String var1) {
      com.cl_4.c(this.getRootPane(), var1);
   }

   @Override
   public void a(String var1, Class var2) {
      com.cl_4.x(this.getRootPane(), var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      com.cl_4.e(this.getRootPane(), var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      com.cl_4.B(this.getRootPane(), var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      com.cl_4.t(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      com.cl_4.a(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      com.cl_4.l(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      com.cl_4.X(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      com.cl_4.A(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      com.cl_4.L(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      com.cl_4.y(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      com.cl_4.a(this.getRootPane(), var1);
   }

   @Override
   public void w$void() {
      com.cl_4.O(this.getRootPane());
   }

   @Override
   public void m() {
      com.cl_4.G(this.getRootPane());
   }

   @Override
   public void e$void() {
      com.cl_4.H(this.getRootPane());
   }

   public C V(boolean var1) {
      return (C)SN.N(this, var1);
   }

   @Override
   public boolean N() {
      return SN.B(this);
   }

   public C T(float var1) {
      return (C)SN.s(this, var1);
   }

   @Override
   public float B() {
      return SN.A(this);
   }

   public C U() {
      return (C)SN.v(this);
   }

   public C i$C(Component var1) {
      return (C)SN.u(this, var1);
   }

   public C k(int var1, int var2) {
      return (C)SN.H(this, var1, var2);
   }

   public C e(Component var1, int var2, int var3) {
      return (C)SN.Q(this, var1, var2, var3);
   }

   public C Y(int var1) {
      return (C)SN.W(this, var1);
   }

   public C k(int var1) {
      return (C)SN.G(this, var1);
   }

   public C i$C_2() {
      return (C)SN.D(this);
   }

   public C w$C(boolean var1) {
      return (C)SN.g(this, var1);
   }

   @Override
   public Window S(boolean var1) {
      return this.w(var1);
   }

   @Override
   public Window X() {
      return this.i();
   }

   @Override
   public Window o(int var1) {
      return this.k(var1);
   }

   @Override
   public Window U(int var1) {
      return this.Y(var1);
   }

   @Override
   public Window A(Component var1, int var2, int var3) {
      return this.e(var1, var2, var3);
   }

   @Override
   public Window q(int var1, int var2) {
      return this.k(var1, var2);
   }

   @Override
   public Window I(Component var1) {
      return this.i(var1);
   }

   @Override
   public Window F$Window() {
      return this.U();
   }

   @Override
   public Window D(float var1) {
      return this.T(var1);
   }

   @Override
   public Window h$Window(boolean var1) {
      return this.V(var1);
   }
}





