package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;

public class LZ extends JCheckBoxMenuItem implements Au2, Eh2, Yb4 {
   public LZ() {
   }

   public LZ(Action var1) {
      super(var1);
   }

   public LZ(Icon var1) {
      super(var1);
   }

   public LZ(String var1) {
      super(var1);
   }

   public LZ(String var1, KeyStroke var2) {
      super(var1);
      this.setAccelerator(var2);
   }

   public LZ(String var1, com.finalshell.ui.model.Cs2 var2) {
      super(var1);
      this.s(var2);
   }

   public LZ(String var1, boolean var2) {
      super(var1, var2);
   }

   public LZ(String var1, Icon var2) {
      super(var1, var2);
   }

   public LZ(String var1, Icon var2, boolean var3) {
      super(var1, var2, var3);
   }

   public LZ(String var1, Icon var2, KeyStroke var3) {
      super(var1, var2);
      this.setAccelerator(var3);
   }

   public LZ(String var1, Icon var2, boolean var3, KeyStroke var4) {
      super(var1, var2, var3);
      this.setAccelerator(var4);
   }

   public LZ(String var1, Icon var2, com.finalshell.ui.model.Cs2 var3) {
      super(var1, var2);
      this.s(var3);
   }

   public LZ(String var1, Icon var2, boolean var3, com.finalshell.ui.model.Cs2 var4) {
      super(var1, var2, var3);
      this.s(var4);
   }

   public void s(com.finalshell.ui.model.Cs2 var1) {
      FN.H(this, var1);
   }

   @Override
   public Insets getMargin() {
      return this.f().s();
   }

   @Override
   public void setMargin(Insets var1) {
      this.f().L(var1);
   }

   public int K$int() {
      return this.f().W();
   }

   public void K(int var1) {
      this.f().d(var1);
   }

   public Color H() {
      return this.f().S();
   }

   public void v(Color var1) {
      this.f().T(var1);
   }

   public Color w$Color() {
      return this.f().f();
   }

   public void q(Color var1) {
      this.f().G(var1);
   }

   public Color e$Color() {
      return this.f().w();
   }

   public void F(Color var1) {
      this.f().C(var1);
   }

   public Color y$Color() {
      return this.f().x();
   }

   public void H(Color var1) {
      this.f().u(var1);
   }

   public Color d() {
      return this.f().z();
   }

   public void h(Color var1) {
      this.f().a(var1);
   }

   public Color m$Color() {
      return this.f().B();
   }

   public void K(Color var1) {
      this.f().o(var1);
   }

   public int N() {
      return this.f().A();
   }

   public void q$void(int var1) {
      this.f().U(var1);
   }

   public boolean v() {
      return this.f().X();
   }

   public void W(boolean var1) {
      this.f().E(var1);
   }

   public int e$int() {
      return this.f().h();
   }

   public void C(int var1) {
      this.f().v(var1);
   }

   public Og4 y$og_4() {
      return this.f().j();
   }

   public void d(Og4 var1) {
      this.f().P(var1);
   }

   public Color G() {
      return this.f().Z();
   }

   public void G(Color var1) {
      this.f().Q(var1);
   }

   public YV f() {
      return (YV)this.getUI();
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
      // 09: invokevirtual com/finalshell/core/LZ.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/LZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/LZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/LZ.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 25: instanceof com/finalshell/core/YV
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/LZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.C Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 182
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/YV
      // 40: invokevirtual com/finalshell/core/LZ.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/YV
      // 50: dup
      // 51: invokespecial com/finalshell/core/YV.<init> ()V
      // 54: invokevirtual com/finalshell/core/LZ.setUI (Ljavax/swing/plaf/MenuItemUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/LZ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/LZ.getUI ()Ljavax/swing/plaf/ButtonUI;
      // 67: invokevirtual com/finalshell/core/LZ.setUI (Ljavax/swing/plaf/ButtonUI;)V
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

   @Override
   public void p(String var1) {
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

   public void w$void() {
      Cl4_2.O(this);
   }

   public void m$void() {
      Cl4_2.G(this);
   }

   public void e$void() {
      Cl4_2.H(this);
   }

   public LZ O() {
      return (LZ)FN.A(this);
   }

   public LZ h(boolean var1) {
      return (LZ)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public LZ a$LZ() {
      return (LZ)FN.u(this);
   }

   public LZ l(boolean var1) {
      return (LZ)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public LZ F() {
      return (LZ)FN.C(this);
   }

   public LZ F(boolean var1) {
      return (LZ)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public LZ V(boolean var1, boolean var2) {
      return (LZ)FN.K(this, var1, var2);
   }

   public LZ q$LZ(int var1) {
      return (LZ)FN.p(this, var1);
   }

   public LZ T(int var1) {
      return (LZ)FN.O(this, var1);
   }

   public LZ A(int var1) {
      return (LZ)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public LZ v(int var1, boolean var2, boolean var3) {
      return (LZ)FN.d(this, var1, var2, var3);
   }

   public LZ t(int var1, int var2) {
      return (LZ)FN.m(this, var1, var2);
   }

   public LZ f(String var1) {
      return (LZ)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public Component N(String var1) {
      return this.f(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.t(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.v(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.A(var1);
   }

   @Override
   public Component o(int var1) {
      return this.T(var1);
   }

   @Override
   public Component i(int var1) {
      return this.q$LZ(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.V(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.F(var1);
   }

   @Override
   public Component Q() {
      return this.F();
   }

   @Override
   public Component u(boolean var1) {
      return this.l(var1);
   }

   @Override
   public Component R() {
      return this.a$LZ();
   }

   @Override
   public Component c(boolean var1) {
      return this.h(var1);
   }

   public Component a$Component() {
      return this.O();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





