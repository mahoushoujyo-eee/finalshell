package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class Cu4 extends JRadioButtonMenuItem implements Au2, Eh2, Yb4 {
   public Cu4() {
   }

   public Cu4(Action var1) {
      super(var1);
   }

   public Cu4(Icon var1) {
      super(var1);
   }

   public Cu4(Icon var1, boolean var2) {
      super(var1, var2);
   }

   public Cu4(String var1) {
      super(var1);
   }

   public Cu4(String var1, KeyStroke var2) {
      super(var1);
      this.setAccelerator(var2);
   }

   public Cu4(String var1, com.finalshell.ui.model.Cs2 var2) {
      super(var1);
      this.y(var2);
   }

   public Cu4(String var1, Icon var2) {
      super(var1, var2);
   }

   public Cu4(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public Cu4(String var1, boolean var2) {
      super(var1, var2);
   }

   public Cu4(String var1, Icon var2, KeyStroke var3) {
      super(var1, var2);
      this.setAccelerator(var3);
   }

   public Cu4(String var1, Icon var2, boolean var3, KeyStroke var4) {
      super(var1, var2, var3);
      this.setAccelerator(var4);
   }

   public Cu4(String var1, Icon var2, com.finalshell.ui.model.Cs2 var3) {
      super(var1, var2);
      this.y(var3);
   }

   public Cu4(String var1, Icon var2, boolean var3, com.finalshell.ui.model.Cs2 var4) {
      super(var1, var2, var3);
      this.y(var4);
   }

   public void y(com.finalshell.ui.model.Cs2 var1) {
      FN.H(this, var1);
   }

   @Override
   public Insets getMargin() {
      return this.v().s();
   }

   @Override
   public void setMargin(Insets var1) {
      this.v().L(var1);
   }

   public int R$int() {
      return this.v().W();
   }

   public void o$void(int var1) {
      this.v().d(var1);
   }

   public Color Q$Color() {
      return this.v().S();
   }

   public void u(Color var1) {
      this.v().T(var1);
   }

   public Color T$Color() {
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

   public Color l$Color() {
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

   public int I$int() {
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

   public Og4 N() {
      return this.v().j();
   }

   public void u(Og4 var1) {
      this.v().P(var1);
   }

   public Color E() {
      return this.v().N();
   }

   public void B(Color var1) {
      this.v().J(var1);
   }

   public YN_2 v() {
      return (YN_2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/Pb4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/core/Cu4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cu4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cu4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/Cu4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/YN_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Cu4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.z7 Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 188
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/YN_2
      // 40: invokevirtual com/finalshell/core/Cu4.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/YN_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/YN_2.<init> ()V
      // 54: invokevirtual com/finalshell/core/Cu4.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Cu4.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Cu4.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/Cu4.setUI (Ljavax/swing/plaf/ButtonUI;)V
      // 6a: return
   }

   @Override
   public void u(String var1, Object[] var2) {
      I22.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      I22.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      I22.q(this, var1, var2);
   }

   @Override
   public void M() {
      I22.L(this);
   }

   @Override
   public boolean k() {
      return I22.Z(this);
   }

   @Override
   public void M(Ld4 var1) {
      I22.g(this, var1);
   }

   @Override
   public void i() {
      I22.o(this);
   }

   public void p$void(String var1) {
      Cl4_2.c(this, var1);
   }

   @Override
   public void a(String var1, java.lang.Class var2) {
      Cl4_2.x(this, var1, var2);
   }

   @Override
   public void E(String var1, Object var2) {
      Cl4_2.e(this, var1, var2);
   }

   @Override
   public void n(String var1, String var2) {
      Cl4_2.B(this, var1, var2);
   }

   @Override
   public void I(String var1, String var2, java.lang.Class var3) {
      Cl4_2.t(this, var1, var2, var3);
   }

   @Override
   public void H(String var1, String var2, Object var3) {
      Cl4_2.a(this, var1, var2, var3);
   }

   @Override
   public void S(String var1, boolean var2, boolean var3) {
      Cl4_2.l(this, var1, var2, var3);
   }

   @Override
   public void O(String var1, java.lang.Class var2, boolean var3, boolean var4) {
      Cl4_2.X(this, var1, var2, var3, var4);
   }

   @Override
   public void h(String var1, Object var2, boolean var3, boolean var4) {
      Cl4_2.A(this, var1, var2, var3, var4);
   }

   @Override
   public void e(String var1, String var2, java.lang.Class var3, boolean var4, boolean var5) {
      Cl4_2.L(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void D(String var1, String var2, Object var3, boolean var4, boolean var5) {
      Cl4_2.y(this, var1, var2, var3, var4, var5);
   }

   @Override
   public void z(IB var1) {
      Cl4_2.a(this, var1);
   }

   @Override
   public void w() {
      Cl4_2.O(this);
   }

   @Override
   public void m() {
      Cl4_2.G(this);
   }

   @Override
   public void e() {
      Cl4_2.H(this);
   }

   public Cu4 O() {
      return (Cu4)FN.A(this);
   }

   public Cu4 m(boolean var1) {
      return (Cu4)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Cu4 A() {
      return (Cu4)FN.u(this);
   }

   public Cu4 o(boolean var1) {
      return (Cu4)FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return FN.U(this);
   }

   public Cu4 I$cu_4() {
      return (Cu4)FN.C(this);
   }

   public Cu4 z(boolean var1) {
      return (Cu4)FN.q(this, var1);
   }

   public boolean l$boolean() {
      return FN.G(this);
   }

   public Cu4 B(boolean var1, boolean var2) {
      return (Cu4)FN.K(this, var1, var2);
   }

   public Cu4 g(int var1) {
      return (Cu4)FN.p(this, var1);
   }

   public Cu4 T(int var1) {
      return (Cu4)FN.O(this, var1);
   }

   public Cu4 A(int var1) {
      return (Cu4)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Cu4 j(int var1, boolean var2, boolean var3) {
      return (Cu4)FN.d(this, var1, var2, var3);
   }

   public Cu4 J(int var1, int var2) {
      return (Cu4)FN.m(this, var1, var2);
   }

   public Cu4 p$cu_4(String var1) {
      return (Cu4)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public Component N(String var1) {
      return this.p$cu_4(var1);
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

   public Component Q$Component() {
      return this.I$cu_4();
   }

   @Override
   public Component u(boolean var1) {
      return this.o(var1);
   }

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

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





