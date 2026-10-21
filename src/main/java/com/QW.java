package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class QW extends JMenuItem implements com.au_2, com.yb_4 {
   public QW() {
   }

   public QW(Icon var1) {
      super(var1);
   }

   public QW(String var1) {
      super(var1);
   }

   public QW(String var1, KeyStroke var2) {
      super(var1);
      this.setAccelerator(var2);
   }

   public QW(String var1, com.Cs_2 var2) {
      super(var1);
      this.D(var2);
   }

   public QW(Action var1) {
      super(var1);
   }

   public QW(String var1, Icon var2) {
      super(var1, var2);
   }

   public QW(String var1, int var2) {
      super(var1, var2);
   }

   public QW(String var1, Icon var2, KeyStroke var3) {
      super(var1, var2);
      this.setAccelerator(var3);
   }

   public QW(String var1, Icon var2, com.Cs_2 var3) {
      super(var1, var2);
      this.D(var3);
   }

   public void D(com.Cs_2 var1) {
      com.FN.H(this, var1);
   }

   @Override
   public Insets getMargin() {
      return this.N().s();
   }

   @Override
   public void setMargin(Insets var1) {
      this.N().L(var1);
   }

   public int G() {
      return this.N().W();
   }

   public void r(int var1) {
      this.N().d(var1);
   }

   public Color J() {
      return this.N().S();
   }

   public void R(Color var1) {
      this.N().T(var1);
   }

   public Color B() {
      return this.N().f();
   }

   public void b(Color var1) {
      this.N().G(var1);
   }

   public Color c() {
      return this.N().w();
   }

   public void V(Color var1) {
      this.N().C(var1);
   }

   public Color C() {
      return this.N().x();
   }

   public void P(Color var1) {
      this.N().u(var1);
   }

   public Color h() {
      return this.N().z();
   }

   public void F(Color var1) {
      this.N().a(var1);
   }

   public Color G$Color() {
      return this.N().B();
   }

   public void G(Color var1) {
      this.N().o(var1);
   }

   public int I() {
      return this.N().A();
   }

   public void e(int var1) {
      this.N().U(var1);
   }

   public boolean E() {
      return this.N().X();
   }

   public void F(boolean var1) {
      this.N().E(var1);
   }

   public int E$int() {
      return this.N().h();
   }

   public void u(int var1) {
      this.N().v(var1);
   }

   public com.og_4 z() {
      return this.N().j();
   }

   public void E(com.og_4 var1) {
      this.N().P(var1);
   }

   public com.Yh_2 N() {
      return (com.Yh_2)this.getUI();
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
      // 09: invokevirtual com/QW.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/QW.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/QW.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/QW.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/Yh_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/QW.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zH Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 171
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Yh_2
      // 40: invokevirtual com/QW.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Yh_2
      // 50: dup
      // 51: invokespecial com/Yh_2.<init> ()V
      // 54: invokevirtual com/QW.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/QW.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/QW.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/QW.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   public com.QW L() {
      return (com.QW)com.FN.A(this);
   }

   public com.QW b(boolean var1) {
      return (com.QW)com.FN.O(this, var1);
   }

   @Override
   public boolean h$boolean() {
      return com.FN.k(this);
   }

   public com.QW j() {
      return (com.QW)com.FN.u(this);
   }

   public com.QW u(boolean var1) {
      return (com.QW)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.QW b() {
      return (com.QW)com.FN.C(this);
   }

   public com.QW c(boolean var1) {
      return (com.QW)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.QW O(boolean var1, boolean var2) {
      return (com.QW)com.FN.K(this, var1, var2);
   }

   public com.QW B(int var1) {
      return (com.QW)com.FN.p(this, var1);
   }

   public com.QW w(int var1) {
      return (com.QW)com.FN.O(this, var1);
   }

   public com.QW u$comQW(int var1) {
      return (com.QW)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.QW u(int var1, boolean var2, boolean var3) {
      return (com.QW)com.FN.d(this, var1, var2, var3);
   }

   public com.QW d(int var1, int var2) {
      return (com.QW)com.FN.m(this, var1, var2);
   }

   public com.QW z(String var1) {
      return (com.QW)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.z(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.d(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.u(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.u(var1);
   }

   @Override
   public Component o(int var1) {
      return this.w(var1);
   }

   @Override
   public Component i(int var1) {
      return this.B(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.O(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.c(var1);
   }

   @Override
   public Component Q() {
      return this.b();
   }

   @Override
   public Component u$Component(boolean var1) {
      return this.u(var1);
   }

   @Override
   public Component R() {
      return this.j();
   }

   @Override
   public Component c$Component(boolean var1) {
      return this.b(var1);
   }

   @Override
   public Component a() {
      return this.L();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





