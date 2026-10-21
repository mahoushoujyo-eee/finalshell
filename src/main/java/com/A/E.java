package com.A;

import com.E_;
import com.Eh_2;
import com.IB;
import com.Pj_2;
import com.SN;
import com.e__2;
import com.i2_2;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.List;
import javax.swing.JWindow;

public class E extends JWindow implements Pj_2, com.cX_3, Eh_2, com.W_ {
   protected boolean U = false;
   protected com.c4_2 B;

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
      super(com.FN.L(var1));
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

   protected void b() {
      this.setFocusable(true);
      com.FN.Y(this);
      this.B = new com.A.f(this, true);
      com.ON.b(this, this.B);
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
      return com.Fs_2.G(this, var1);
   }

   @Override
   public com.aJ K(e__2 var1) {
      return com.Fs_2.c(this, var1);
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
   public void w() {
      com.cl_4.O(this.getRootPane());
   }

   @Override
   public void m() {
      com.cl_4.G(this.getRootPane());
   }

   @Override
   public void e() {
      com.cl_4.H(this.getRootPane());
   }

   public com.A.E p(boolean var1) {
      return (com.A.E)SN.N(this, var1);
   }

   @Override
   public boolean N() {
      return SN.B(this);
   }

   public com.A.E s(float var1) {
      return (com.A.E)SN.s(this, var1);
   }

   @Override
   public float B() {
      return SN.A(this);
   }

   public com.A.E S() {
      return (com.A.E)SN.v(this);
   }

   public com.A.E z(Component var1) {
      return (com.A.E)SN.u(this, var1);
   }

   public com.A.E O(int var1, int var2) {
      return (com.A.E)SN.H(this, var1, var2);
   }

   public com.A.E j(Component var1, int var2, int var3) {
      return (com.A.E)SN.Q(this, var1, var2, var3);
   }

   public com.A.E B(int var1) {
      return (com.A.E)SN.W(this, var1);
   }

   public com.A.E L(int var1) {
      return (com.A.E)SN.G(this, var1);
   }

   public com.A.E n() {
      return (com.A.E)SN.D(this);
   }

   public com.A.E j(boolean var1) {
      return (com.A.E)SN.g(this, var1);
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





