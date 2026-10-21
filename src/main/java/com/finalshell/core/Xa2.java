package com.finalshell.core;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;

public class Xa2 extends JEditorPane implements RS, Pp2, Au2, Eh2, Yb4 {
   public Xa2() {
   }

   public Xa2(URL var1) throws IOException {
      super(var1);
   }

   public Xa2(String var1, String var2) {
      super(var1, var2);
   }

   public Xa2(String var1) throws IOException {
      super(var1);
   }

   public void E() {
      this.setText("");
   }

   public DU g() {
      return (DU)this.getUI();
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
      // 00: invokestatic com/finalshell/core/Ne4.m$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/core/Xa2.getUI ()Ljavax/swing/plaf/TextUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Xa2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Xa2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/Xa2.getUI ()Ljavax/swing/plaf/TextUI;
      // 25: instanceof com/finalshell/core/DU
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Xa2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zm Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 65
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/DU
      // 40: invokevirtual com/finalshell/core/Xa2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/DU
      // 50: dup
      // 51: invokespecial com/finalshell/core/DU.<init> ()V
      // 54: invokevirtual com/finalshell/core/Xa2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Xa2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Xa2.getUI ()Ljavax/swing/plaf/TextUI;
      // 67: invokevirtual com/finalshell/core/Xa2.setUI (Ljavax/swing/plaf/TextUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/finalshell/core/Xa2.invalidate ()V
      // 6e: return
   }

   @Override
   public com.finalshell.ui.model.F5 i(Rk2 var1) {
      return Fs2_2.X(this, var1);
   }

   @Override
   public MouseAdapter o(O5 var1) {
      return Fs2_2.F(this, var1);
   }

   @Override
   public MouseAdapter j(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.h(this, var1, var2);
   }

   @Override
   public MouseAdapter e(O5 var1) {
      return Fs2_2.P(this, var1);
   }

   @Override
   public MouseAdapter N(O5 var1) {
      return Fs2_2.H(this, var1);
   }

   @Override
   public MouseAdapter a(O5 var1) {
      return Fs2_2.W(this, var1);
   }

   @Override
   public MouseAdapter L(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.W(this, var1, var2);
   }

   @Override
   public MouseAdapter h(O5 var1) {
      return Fs2_2.J(this, var1);
   }

   @Override
   public MouseAdapter d(com.finalshell.ui.model.HT var1, O5 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public MouseAdapter F(O5 var1) {
      return Fs2_2.q(this, var1);
   }

   @Override
   public MouseAdapter v(O5 var1) {
      return Fs2_2.o(this, var1);
   }

   @Override
   public KeyAdapter i(Sr2 var1) {
      return Fs2_2.G(this, var1);
   }

   @Override
   public KeyAdapter I(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.O(this, var1, var2);
   }

   @Override
   public KeyAdapter g(Sr2 var1) {
      return Fs2_2.Q(this, var1);
   }

   @Override
   public KeyAdapter U(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.R(this, var1, var2);
   }

   @Override
   public KeyAdapter e(Sr2 var1) {
      return Fs2_2.u(this, var1);
   }

   @Override
   public KeyAdapter j(com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      return Fs2_2.I(this, var1, var2);
   }

   @Override
   public FocusAdapter u(Az2 var1) {
      return Fs2_2.K(this, var1);
   }

   @Override
   public FocusAdapter e(Az2 var1) {
      return Fs2_2.t(this, var1);
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

   public Xa2 G() {
      return (Xa2)FN.A(this);
   }

   public Xa2 K(boolean var1) {
      return (Xa2)FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return FN.k(this);
   }

   public Xa2 K$Xa_2() {
      return (Xa2)FN.u(this);
   }

   public Xa2 R(boolean var1) {
      return (Xa2)FN.D(this, var1);
   }

   public boolean K$boolean() {
      return FN.U(this);
   }

   public Xa2 x() {
      return (Xa2)FN.C(this);
   }

   public Xa2 m(boolean var1) {
      return (Xa2)FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return FN.G(this);
   }

   public Xa2 w(boolean var1, boolean var2) {
      return (Xa2)FN.K(this, var1, var2);
   }

   public Xa2 x(int var1) {
      return (Xa2)FN.p(this, var1);
   }

   public Xa2 i$Xa_2(int var1) {
      return (Xa2)FN.O(this, var1);
   }

   public Xa2 U(int var1) {
      return (Xa2)FN.K(this, var1);
   }

   @Override
   public int Y() {
      return FN.r$int(this);
   }

   public Xa2 z(int var1, boolean var2, boolean var3) {
      return (Xa2)FN.d(this, var1, var2, var3);
   }

   public Xa2 d(int var1, int var2) {
      return (Xa2)FN.m(this, var1, var2);
   }

   public Xa2 T(String var1) {
      return (Xa2)FN.s(this, var1);
   }

   @Override
   public String D() {
      return FN.b$String(this);
   }

   @Override
   public Component N(String var1) {
      return this.T(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.d(var1, var2);
   }

   @Override
   public Component t(int var1, boolean var2, boolean var3) {
      return this.z(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.U(var1);
   }

   @Override
   public Component o(int var1) {
      return this.i$Xa_2(var1);
   }

   public Component i$Component(int var1) {
      return this.x(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.w(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.m(var1);
   }

   @Override
   public Component Q() {
      return this.x();
   }

   @Override
   public Component u(boolean var1) {
      return this.R(var1);
   }

   @Override
   public Component R() {
      return this.K$Xa_2();
   }

   @Override
   public Component c(boolean var1) {
      return this.K(var1);
   }

   @Override
   public Component a() {
      return this.G();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





