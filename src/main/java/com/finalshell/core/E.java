package com.finalshell.core;

import com.finalshell.ui.listener.AJ;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.JWindow;

public class E extends JWindow implements Pj2, CX3_2, Eh2, W_3 {
   public boolean U = false;
   public C42 B;

   public E() {
      this.b();
   }

   public E(GraphicsConfiguration var1) {
      super(var1);
      this.b();
   }

   public E(Frame var1) {
      super(var1);
      this.b();
   }

   public E(Component var1) {
      super(FN.L(var1));
      this.b();
   }

   public E(Window var1) {
      super(var1);
      this.b();
   }

   public E(Window var1, GraphicsConfiguration var2) {
      super(var1, var2);
      this.b();
   }

   public void b() {
      this.setFocusable(true);
      FN.Y(this);
      this.B = new F(this, true);
      ON.b(this, this.B);
   }

   public boolean g() {
      return this.U;
   }

   public void W(boolean var1) {
      this.U = var1;
   }

   public List P() {
      return this.B.t();
   }

   public void b(Component var1) {
      this.B.p(var1);
   }

   public void u(Component var1) {
      this.B.C(var1);
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
   public void a(String var1, java.lang.Class var2) {
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
   public void I(String var1, String var2, java.lang.Class var3) {
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
   public void O(String var1, java.lang.Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this.getRootPane(), var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, java.lang.Class var3, boolean var4, boolean var5) {
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

   @Override
   public void w() {
      Cl4_2.O(this.getRootPane());
   }

   @Override
   public void m() {
      Cl4_2.G(this.getRootPane());
   }

   @Override
   public void e() {
      Cl4_2.H(this.getRootPane());
   }

   public E p(boolean var1) {
      return (E)SN.N(this, var1);
   }

   @Override
   public boolean N() {
      return SN.B(this);
   }

   public E s(float var1) {
      return (E)SN.s(this, var1);
   }

   @Override
   public float B() {
      return SN.A(this);
   }

   public E S() {
      return (E)SN.v(this);
   }

   public E z(Component var1) {
      return (E)SN.u(this, var1);
   }

   public E O(int var1, int var2) {
      return (E)SN.H(this, var1, var2);
   }

   public E j(Component var1, int var2, int var3) {
      return (E)SN.Q(this, var1, var2, var3);
   }

   public E B(int var1) {
      return (E)SN.W(this, var1);
   }

   public E L(int var1) {
      return (E)SN.G(this, var1);
   }

   public E n() {
      return (E)SN.D(this);
   }

   public E j(boolean var1) {
      return (E)SN.g(this, var1);
   }

   @Override
   public Window S(boolean var1) {
      return this.j(var1);
   }

   @Override
   public Window X() {
      return this.n();
   }

   @Override
   public Window o(int var1) {
      return this.L(var1);
   }

   @Override
   public Window U(int var1) {
      return this.B(var1);
   }

   @Override
   public Window A(Component var1, int var2, int var3) {
      return this.j(var1, var2, var3);
   }

   @Override
   public Window q(int var1, int var2) {
      return this.O(var1, var2);
   }

   @Override
   public Window I(Component var1) {
      return this.z(var1);
   }

   @Override
   public Window F() {
      return this.S();
   }

   @Override
   public Window D(float var1) {
      return this.s(var1);
   }

   @Override
   public Window h(boolean var1) {
      return this.p(var1);
   }
}





