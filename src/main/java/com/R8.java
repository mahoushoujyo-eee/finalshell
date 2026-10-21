package com;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JScrollBar;

public class R8 extends JScrollBar implements com.D7, Sa_2 {
   public R8() {
   }

   public R8(int var1) {
      super(var1);
   }

   public R8(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   public boolean o() {
      return this.n().t();
   }

   public R8 s(boolean var1) {
      this.n().R(var1);
      return this;
   }

   public boolean b() {
      return this.n().q();
   }

   public R8 L(boolean var1) {
      this.n().Y(var1);
      return this;
   }

   public Insets g() {
      return this.n().Z();
   }

   public R8 W(Insets var1) {
      this.n().i(var1);
      return this;
   }

   public R8 k(int var1, int var2, int var3, int var4) {
      return this.W(new Insets(var1, var2, var3, var4));
   }

   public R8 e(int var1) {
      return this.k(var1, var1, var1, var1);
   }

   public com.og_4 I() {
      return com.ox_4.y(this);
   }

   public R8 M(com.og_4 var1) {
      com.ox_4.b(this, var1);
      return this;
   }

   public com.og_4 C() {
      return this.n().h();
   }

   public R8 s(com.og_4 var1) {
      this.n().r(var1);
      return this;
   }

   public com.og_4 o$comog_4() {
      return this.n().y();
   }

   public R8 p(com.og_4 var1) {
      this.n().S(var1);
      return this;
   }

   @Override
   public String A() {
      return this.n().A();
   }

   @Override
   public void S(String var1) {
      this.n().S(var1);
   }

   public Xm_2 n() {
      return (Xm_2)this.getUI();
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
      // 00: invokestatic com/SZ.L ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/R8.getUI ()Ljavax/swing/plaf/ScrollBarUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/R8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/R8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/R8.getUI ()Ljavax/swing/plaf/ScrollBarUI;
      // 25: instanceof com/Xm_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/R8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.p Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 126
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/Xm_2
      // 40: invokevirtual com/R8.setUI (Ljavax/swing/plaf/ScrollBarUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/Xm_2
      // 50: dup
      // 51: invokespecial com/Xm_2.<init> ()V
      // 54: invokevirtual com/R8.setUI (Ljavax/swing/plaf/ScrollBarUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/R8.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/R8.getUI ()Ljavax/swing/plaf/ScrollBarUI;
      // 67: invokevirtual com/R8.setUI (Ljavax/swing/plaf/ScrollBarUI;)V
      // 6a: return
   }

   @Override
   public int M() {
      return PY.f(this);
   }

   public R8 W(int var1) {
      return (R8)PY.Q(this, var1);
   }

   @Override
   public int m() {
      return PY.m(this);
   }

   public R8 a(int var1) {
      return (R8)PY.j(this, var1);
   }

   @Override
   public int A$int() {
      return PY.S(this);
   }

   public R8 g(int var1) {
      return (R8)PY.N(this, var1);
   }

   @Override
   public int Q() {
      return PY.Z(this);
   }

   public R8 z(int var1) {
      return (R8)PY.w(this, var1);
   }

   @Override
   public int i() {
      return PY.J(this);
   }

   public R8 O(int var1) {
      return (R8)PY.b(this, var1);
   }

   @Override
   public int a() {
      return PY.i(this);
   }

   public R8 p(int var1) {
      return (R8)PY.y(this, var1);
   }

   @Override
   public Dimension getPreferredSize() {
      return PY.W(this, super.getPreferredSize());
   }

   public R8 t(int var1, int var2) {
      return (R8)PY.O(this, var1, var2);
   }

   @Override
   public Component W(int var1, int var2) {
      return this.t(var1, var2);
   }

   @Override
   public Component d(int var1) {
      return this.p(var1);
   }

   @Override
   public Component p$Component(int var1) {
      return this.O(var1);
   }

   @Override
   public Component D(int var1) {
      return this.z(var1);
   }

   @Override
   public Component V(int var1) {
      return this.g(var1);
   }

   @Override
   public Component x(int var1) {
      return this.a(var1);
   }

   @Override
   public Component O$Component(int var1) {
      return this.W(var1);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





