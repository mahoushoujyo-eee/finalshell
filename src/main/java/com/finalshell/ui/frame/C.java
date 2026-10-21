package com.finalshell.ui.frame;

import com.finalshell.core.Au2;
import com.finalshell.core.C42;
import com.finalshell.core.CX3_2;
import com.finalshell.core.Cl4_2;
import com.finalshell.core.D;
import com.finalshell.core.E4;
import com.finalshell.core.E_;
import com.finalshell.core.E__2;
import com.finalshell.core.Eh2;
import com.finalshell.core.FN;
import com.finalshell.core.Fs2_2;
import com.finalshell.core.I22;
import com.finalshell.core.IB;
import com.finalshell.core.Ld4;
import com.finalshell.core.M;
import com.finalshell.core.ON;
import com.finalshell.core.Pj2;
import com.finalshell.core.SN;
import com.finalshell.core.W_3;
import com.finalshell.ui.listener.AJ;
import com.finalshell.ui.panel.K22;
import com.finalshell.ui.panel.M2;
import java.awt.Color;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class C extends JFrame implements Pj2, Au2, CX3_2, Eh2, W_3 {
   public boolean N = false;
   public C42 g;

   public C() {
      this.R$void();
   }

   public C(GraphicsConfiguration var1) {
      super(var1);
      this.R$void();
   }

   public C(String var1) {
      super(E4.y(var1, new Object[0]));
      E4.a(this, var1, new Object[0]);
      this.R$void();
   }

   public C(String var1, GraphicsConfiguration var2) {
      super(E4.y(var1, new Object[0]), var2);
      E4.a(this, var1, new Object[0]);
      this.R$void();
   }

   public void R$void() {
      FN.Y(this);
      this.g = new M(this, true);
      ON.b(this, this.g);
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

   public void i$void(Component var1) {
      this.g.p(var1);
   }

   public void w(Component var1) {
      this.g.C(var1);
   }

   public Color n() {
      return this.f$d().q$Color();
   }

   public void i(Color var1) {
      this.f$d().R(var1);
   }

   public Color E$Color() {
      return this.f$d().V();
   }

   public void q(Color var1) {
      this.f$d().k(var1);
   }

   public int y() {
      return this.f$d().x();
   }

   public void R(int var1) {
      this.f$d().f(var1);
   }

   public int u() {
      return this.f$d().d$int();
   }

   public void e(int var1) {
      this.f$d().b(var1);
   }

   public int r$int() {
      return this.f$d().u$int();
   }

   public void G(int var1) {
      this.f$d().Q(var1);
   }

   public boolean s$boolean() {
      return this.f$d().C();
   }

   public void l(boolean var1) {
      this.f$d().H(var1);
   }

   public ImageIcon b() {
      return this.f$d().l();
   }

   public void m(ImageIcon var1) {
      this.f$d().g(var1);
   }

   public int R$int() {
      return this.f$d().R$int();
   }

   public void V(int var1) {
      this.f$d().q(var1);
   }

   public String r$String() {
      return this.f$d().D();
   }

   public void k(String var1) {
      this.f$d().S(var1);
   }

   public JComponent e$JComponent() {
      return this.f$d().R$JComponent();
   }

   public void B(JComponent var1) {
      this.f$d().B(var1);
   }

   public K22 l() {
      return this.f$d().M$k2_2();
   }

   public M2 s$m_2() {
      return this.f$d().F();
   }

   public boolean f$boolean() {
      return this.f$d().i$boolean();
   }

   public void n(boolean var1) {
      this.f$d().m(var1);
   }

   public boolean w$boolean() {
      return this.f$d().A$boolean();
   }

   public void w$void(boolean var1) {
      this.f$d().V(var1);
   }

   public boolean E$boolean() {
      return this.f$d().y();
   }

   public void g(boolean var1) {
      this.f$d().r(var1);
   }

   public boolean F$boolean() {
      return this.f$d().k$boolean();
   }

   public void h$void(boolean var1) {
      this.f$d().v(var1);
   }

   public boolean W() {
      return this.f$d().t$boolean();
   }

   public void k(boolean var1) {
      this.f$d().L(var1);
   }

   public boolean J() {
      return this.f$d().w();
   }

   public void D(boolean var1) {
      this.f$d().E(var1);
   }

   public boolean x() {
      return this.f$d().v();
   }

   public void A(boolean var1) {
      this.f$d().f(var1);
   }

   public boolean R$boolean() {
      return this.f$d().z();
   }

   public void Z(boolean var1) {
      this.f$d().O(var1);
   }

   public boolean c() {
      return this.f$d().s$boolean();
   }

   public void r(boolean var1) {
      this.f$d().C(var1);
   }

   public D f$d() {
      return (D)super.getRootPane().getUI();
   }

   @Override
   public WindowAdapter H(E_ var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public AJ K(E__2 var1) {
      return Fs2_2.c(this, var1);
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this.getRootPane(), var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this.getRootPane(), var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this.getRootPane(), var1, var2);
   }

   @Override
   public void M() {
      I22.L(this.getRootPane());
   }

   @Override
   public boolean k() {
      return I22.Z(this.getRootPane());
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this.getRootPane(), var1);
   }

   public void i$void() {
      I22.o(this.getRootPane());
   }

   @Override
   public void o(String var1) {
      I22.f(this, var1);
   }

   @Override
   public void I() {
      I22.p(this);
   }

   @Override
   public String q() {
      return I22.O(this);
   }

   @Override
   public void p(String var1) {
      Cl4_2.c(this.getRootPane(), var1);
   }

   @Override
   public void a(String var1, Class var2) {
      Cl4_2.x(this.getRootPane(), var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this.getRootPane(), var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this.getRootPane(), var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      Cl4_2.t(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this.getRootPane(), var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this.getRootPane(), var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this.getRootPane(), var1);
   }

   public void w$void() {
      Cl4_2.O(this.getRootPane());
   }

   @Override
   public void m() {
      Cl4_2.G(this.getRootPane());
   }

   public void e$void() {
      Cl4_2.H(this.getRootPane());
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

   public C i$C() {
      return (C)SN.D(this);
   }

   public C w$C(boolean var1) {
      return (C)SN.g(this, var1);
   }

   @Override
   public Window S(boolean var1) {
      return this.w$C(var1);
   }

   @Override
   public Window X() {
      return this.i$C();
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
      return this.i$C(var1);
   }

   public Window F$Window() {
      return this.U();
   }

   @Override
   public Window D(float var1) {
      return this.T(var1);
   }

   public Window h$Window(boolean var1) {
      return this.V(var1);
   }
}





