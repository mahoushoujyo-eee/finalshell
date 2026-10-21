package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class cu_4 extends JRadioButtonMenuItem implements com.au_2, Eh_2, com.yb_4 {
   public cu_4() {
   }

   public cu_4(Action var1) {
      super(var1);
   }

   public cu_4(Icon var1) {
      super(var1);
   }

   public cu_4(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public cu_4(String var1) {
      super(var1);
   }

   public cu_4(String var1, KeyStroke var2) {
      super(var1);
      this.setAccelerator(var2);
   }

   public cu_4(String var1, com.Cs_2 var2) {
      super(var1);
      this.y(var2);
   }

   public cu_4(String var1, Icon var2) {
      super(var1, var2);
   }

   public cu_4(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public cu_4(String var1, boolean var2) {
      super(var1, var2);
   }

   public cu_4(String var1, Icon var2, KeyStroke var3) {
      super(var1, var2);
      this.setAccelerator(var3);
   }

   public cu_4(String var1, Icon var2, boolean var3, KeyStroke var4) {
      super(var1, var2, var3);
      this.setAccelerator(var4);
   }

   public cu_4(String var1, Icon var2, com.Cs_2 var3) {
      super(var1, var2);
      this.y(var3);
   }

   public cu_4(String var1, Icon var2, boolean var3, com.Cs_2 var4) {
      super(var1, var2, var3);
      this.y(var4);
   }

   public void y(com.Cs_2 var1) {
      com.FN.H(this, var1);
   }

   @Override
   public Insets getMargin() {
      return this.v().s();
   }

   @Override
   public void setMargin(Insets var1) {
      this.v().L(var1);
   }

   public int R() {
      return this.v().W();
   }

   public void o(int var1) {
      this.v().d(var1);
   }

   public Color Q() {
      return this.v().S();
   }

   public void u(Color var1) {
      this.v().T(var1);
   }

   public Color T() {
      return this.v().f();
   }

   public void t(Color var1) {
      this.v().G(var1);
   }

   public Color u() {
      return this.v().w();
   }

   public void f(Color var1) {
      this.v().C(var1);
   }

   public Color l() {
      return this.v().x();
   }

   public void Z(Color var1) {
      this.v().u(var1);
   }

   public Color X() {
      return this.v().z();
   }

   public void T(Color var1) {
      this.v().a(var1);
   }

   public Color n() {
      return this.v().B();
   }

   public void R(Color var1) {
      this.v().o(var1);
   }

   public int I() {
      return this.v().A();
   }

   public void K(int var1) {
      this.v().U(var1);
   }

   public boolean V() {
      return this.v().X();
   }

   public void S(boolean var1) {
      this.v().E(var1);
   }

   public int T$int() {
      return this.v().h();
   }

   public void B(int var1) {
      this.v().v(var1);
   }

   public com.og_4 N() {
      return this.v().j();
   }

   public void u(com.og_4 var1) {
      this.v().P(var1);
   }

   public Color E() {
      return this.v().N();
   }

   public void B(Color var1) {
      this.v().J(var1);
   }

   public com.YN v() {
      return (com.YN)this.getUI();
   }

   @Override
   public void updateUI() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pb_4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/cu_4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/cu_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/cu_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/cu_4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/YN
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/cu_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.z7 Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 186
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/YN
      // 40: invokevirtual com/cu_4.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/YN
      // 50: dup
      // 51: invokespecial com/YN.<init> ()V
      // 54: invokevirtual com/cu_4.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/cu_4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/cu_4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/cu_4.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: return
   }

   @Override
   public void u(String var1, Object[] var2) {
      i2_2.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this, var1, var2);
   }

   @Override
   public void M() {
      i2_2.L(this);
   }

   @Override
   public boolean k() {
      return i2_2.Z(this);
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this, var1);
   }

   @Override
   public void i() {
      i2_2.o(this);
   }

   @Override
   public void p(String var1) {
      com.cl_4.c(this, var1);
   }

   @Override
   public void a(String var1, Class var2) {
      com.cl_4.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      com.cl_4.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      com.cl_4.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, Class var3) {
      com.cl_4.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      com.cl_4.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      com.cl_4.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, Class var2, boolean var3, boolean var4) {
      com.cl_4.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      com.cl_4.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, Class var3, boolean var4, boolean var5) {
      com.cl_4.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      com.cl_4.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      com.cl_4.a(this, var1);
   }

   @Override
   public void w() {
      com.cl_4.O(this);
   }

   @Override
   public void m() {
      com.cl_4.G(this);
   }

   @Override
   public void e() {
      com.cl_4.H(this);
   }

   public com.cu_4 O() {
      return (com.cu_4)com.FN.A(this);
   }

   public com.cu_4 m(boolean var1) {
      return (com.cu_4)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.cu_4 A() {
      return (com.cu_4)com.FN.u(this);
   }

   public com.cu_4 o(boolean var1) {
      return (com.cu_4)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.cu_4 I$comcu_4() {
      return (com.cu_4)com.FN.C(this);
   }

   public com.cu_4 z(boolean var1) {
      return (com.cu_4)com.FN.q(this, var1);
   }

   @Override
   public boolean l$boolean() {
      return com.FN.G(this);
   }

   public com.cu_4 B(boolean var1, boolean var2) {
      return (com.cu_4)com.FN.K(this, var1, var2);
   }

   public com.cu_4 g(int var1) {
      return (com.cu_4)com.FN.p(this, var1);
   }

   public com.cu_4 T(int var1) {
      return (com.cu_4)com.FN.O(this, var1);
   }

   public com.cu_4 A(int var1) {
      return (com.cu_4)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.cu_4 j(int var1, boolean var2, boolean var3) {
      return (com.cu_4)com.FN.d(this, var1, var2, var3);
   }

   public com.cu_4 J(int var1, int var2) {
      return (com.cu_4)com.FN.m(this, var1, var2);
   }

   public com.cu_4 p$comcu_4(String var1) {
      return (com.cu_4)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.p(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.J(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.j(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.A(var1);
   }

   @Override
   public Component o$Component(int var1) {
      return this.T(var1);
   }

   @Override
   public Component i(int var1) {
      return this.g(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.B(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.z(var1);
   }

   @Override
   public Component Q$Component() {
      return this.I();
   }

   @Override
   public Component u(boolean var1) {
      return this.o(var1);
   }

   @Override
   public Component R$Component() {
      return this.A();
   }

   @Override
   public Component c(boolean var1) {
      return this.m(var1);
   }

   @Override
   public Component a() {
      return this.O();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





