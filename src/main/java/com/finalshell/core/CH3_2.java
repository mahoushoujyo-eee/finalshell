package com.finalshell.core;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JSeparator;

public class CH3_2 extends JSeparator {
   public static String f;

   public CH3_2() {
   }

   public CH3_2(int var1) {
      super(var1);
   }

   public CH3_2(boolean var1) {
      this.x(var1);
   }

   public CH3_2(int var1, boolean var2) {
      super(var1);
      this.x(var2);
   }

   public CH3_2(boolean var1, int var2) {
      super(var2);
      this.f(var1);
   }

   public CH3_2(boolean var1, int var2, boolean var3) {
      super(var2);
      this.f(var1);
      this.x(var3);
   }

   public CH3_2(boolean var1, boolean var2) {
      this.w(var1);
      this.I(var2);
   }

   public CH3_2(boolean var1, boolean var2, int var3) {
      super(var3);
      this.w(var1);
      this.I(var2);
   }

   public CH3_2(boolean var1, boolean var2, int var3, boolean var4) {
      super(var3);
      this.w(var1);
      this.I(var2);
      this.x(var4);
   }

   public Color X() {
      return this.o().K();
   }

   public void k(Color var1) {
      this.o().p(var1);
   }

   public Color F() {
      return this.o().A();
   }

   public void L(Color var1) {
      this.o().k(var1);
   }

   public Color e() {
      return this.o().o();
   }

   public void a(Color var1) {
      this.o().m(var1);
   }

   public Color T$Color() {
      return this.o().P();
   }

   public void u(Color var1) {
      this.o().y(var1);
   }

   public boolean v() {
      return this.o().X();
   }

   public void x(boolean var1) {
      this.o().Z(var1);
   }

   public void f(boolean var1) {
      this.w(var1);
      this.I(var1);
   }

   public boolean r() {
      return this.o().e();
   }

   public void w(boolean var1) {
      this.o().m(var1);
   }

   public boolean E() {
      return this.o().F();
   }

   public void I(boolean var1) {
      this.o().r(var1);
   }

   public Insets Q() {
      return this.o().Z();
   }

   public void V(Insets var1) {
      this.o().l(var1);
   }

   public CH3_2 R(int var1, int var2, int var3, int var4) {
      this.V(new Insets(var1, var2, var3, var4));
      return this;
   }

   public CH3_2 j(int var1) {
      return this.R(var1, var1, var1, var1);
   }

   public I62 o() {
      return (I62)this.getUI();
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
      // 00: invokestatic com/finalshell/core/CH3_2.B ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/finalshell/core/CH3_2.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/CH3_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/CH3_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/CH3_2.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 25: instanceof com/finalshell/core/I62
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/CH3_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.J Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 130
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/I62
      // 40: invokevirtual com/finalshell/core/CH3_2.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/I62
      // 50: dup
      // 51: invokespecial com/finalshell/core/I62.<init> ()V
      // 54: invokevirtual com/finalshell/core/CH3_2.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/CH3_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/CH3_2.getUI ()Ljavax/swing/plaf/SeparatorUI;
      // 67: invokevirtual com/finalshell/core/CH3_2.setUI (Ljavax/swing/plaf/SeparatorUI;)V
      // 6a: return
   }

   public static CH3_2 T$cH_3() {
      return new CH3_2(0);
   }

   public static CH3_2 O() {
      return new CH3_2(1);
   }

   public static void n(String var0) {
      f = var0;
   }

   public static String B() {
      return f;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (B() == null) {
         n("qMIAT");
      }
   }
}





