package com;

import java.awt.Component;
import java.awt.Shape;
import javax.swing.JToolTip;

public class Ql_2 extends JToolTip implements com.W2, com.yb_4 {
   @Override
   public Shape B() {
      return this.M().B();
   }

   public Rz_2 M() {
      return (Rz_2)this.getUI();
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
      // 00: invokestatic com/Rz_2.d ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/Ql_2.getUI ()Ljavax/swing/plaf/ToolTipUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/Ql_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/Ql_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/Ql_2.getUI ()Ljavax/swing/plaf/ToolTipUI;
      // 25: instanceof com/Rz_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/Ql_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zp Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 46
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Rz_2
      // 40: invokevirtual com/Ql_2.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Rz_2
      // 50: dup
      // 51: invokespecial com/Rz_2.<init> ()V
      // 54: invokevirtual com/Ql_2.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/Ql_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/Ql_2.getUI ()Ljavax/swing/plaf/ToolTipUI;
      // 67: invokevirtual com/Ql_2.setUI (Ljavax/swing/plaf/ComponentUI;)V
      // 6a: return
   }

   public com.Ql_2 u() {
      return (com.Ql_2)com.FN.A(this);
   }

   public com.Ql_2 A(boolean var1) {
      return (com.Ql_2)com.FN.O(this, var1);
   }

   @Override
   public boolean h() {
      return com.FN.k(this);
   }

   public com.Ql_2 Q() {
      return (com.Ql_2)com.FN.u(this);
   }

   public com.Ql_2 i(boolean var1) {
      return (com.Ql_2)com.FN.D(this, var1);
   }

   @Override
   public boolean K() {
      return com.FN.U(this);
   }

   public com.Ql_2 v() {
      return (com.Ql_2)com.FN.C(this);
   }

   public com.Ql_2 G(boolean var1) {
      return (com.Ql_2)com.FN.q(this, var1);
   }

   @Override
   public boolean l() {
      return com.FN.G(this);
   }

   public com.Ql_2 Z(boolean var1, boolean var2) {
      return (com.Ql_2)com.FN.K(this, var1, var2);
   }

   public com.Ql_2 c(int var1) {
      return (com.Ql_2)com.FN.p(this, var1);
   }

   public com.Ql_2 P(int var1) {
      return (com.Ql_2)com.FN.O(this, var1);
   }

   public com.Ql_2 S(int var1) {
      return (com.Ql_2)com.FN.K(this, var1);
   }

   @Override
   public int Y() {
      return com.FN.r(this);
   }

   public com.Ql_2 t(int var1, boolean var2, boolean var3) {
      return (com.Ql_2)com.FN.d(this, var1, var2, var3);
   }

   public com.Ql_2 Z(int var1, int var2) {
      return (com.Ql_2)com.FN.m(this, var1, var2);
   }

   public com.Ql_2 A(String var1) {
      return (com.Ql_2)com.FN.s(this, var1);
   }

   @Override
   public String D() {
      return com.FN.b(this);
   }

   @Override
   public Component N(String var1) {
      return this.A(var1);
   }

   @Override
   public Component e(int var1, int var2) {
      return this.Z(var1, var2);
   }

   @Override
   public Component t$Component(int var1, boolean var2, boolean var3) {
      return this.t(var1, var2, var3);
   }

   @Override
   public Component G(int var1) {
      return this.S(var1);
   }

   @Override
   public Component o(int var1) {
      return this.P(var1);
   }

   @Override
   public Component i(int var1) {
      return this.c(var1);
   }

   @Override
   public Component D(boolean var1, boolean var2) {
      return this.Z(var1, var2);
   }

   @Override
   public Component N(boolean var1) {
      return this.G(var1);
   }

   @Override
   public Component Q$Component() {
      return this.v();
   }

   @Override
   public Component u(boolean var1) {
      return this.i(var1);
   }

   @Override
   public Component R() {
      return this.Q();
   }

   @Override
   public Component c(boolean var1) {
      return this.A(var1);
   }

   @Override
   public Component a() {
      return this.u();
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





