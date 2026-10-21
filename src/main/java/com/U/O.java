package com.U;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.ComponentListener;
import javax.swing.JSplitPane;

public class O extends JSplitPane {
   private static boolean X;

   public O() {
   }

   public O(int var1) {
      super(var1);
   }

   public O(int var1, boolean var2) {
      super(var1, var2);
   }

   public O(int var1, Component var2, Component var3) {
      super(var1, var2, var3);
   }

   public O(int var1, boolean var2, Component var3, Component var4) {
      super(var1, var2, var3, var4);
   }

   public void r(ComponentListener var1) {
      this.Q().getDivider().addComponentListener(var1);
   }

   public void I(ComponentListener var1) {
      this.Q().getDivider().removeComponentListener(var1);
   }

   public Insets v() {
      return this.Q().K();
   }

   public void v(Insets var1) {
      this.Q().N(var1);
   }

   public com.U.O I(int var1, int var2, int var3, int var4) {
      this.v(new Insets(var1, var2, var3, var4));
      return this;
   }

   public com.U.O h(int var1) {
      return this.I(var1, var1, var1, var1);
   }

   public Color B() {
      return this.Q().B();
   }

   public com.U.O I(Color var1) {
      this.Q().z(var1);
      return this;
   }

   public boolean z() {
      return this.Q().O();
   }

   public com.U.O q(boolean var1) {
      this.Q().b(var1);
      return this;
   }

   public Color r() {
      return this.Q().I();
   }

   public com.U.O l(Color var1) {
      this.Q().m(var1);
      return this;
   }

   public double S() {
      int var3;
      label14: {
         boolean var1 = r();
         com.U.O var10000 = this;
         if (var1) {
            if (this.getOrientation() == 1) {
               var3 = this.getWidth();
               break label14;
            }

            var10000 = this;
         }

         var3 = var10000.getHeight();
      }

      int var2 = var3;
      return Math.max(0.0, Math.min((double)this.getDividerLocation() / (double)(var2 - this.getDividerSize()), 1.0));
   }

   public y Q() {
      return (y)this.getUI();
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
      // 00: invokestatic com/U/O.U ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/U/O.getUI ()Ljavax/swing/plaf/SplitPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/U/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/U/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/U/O.getUI ()Ljavax/swing/plaf/SplitPaneUI;
      // 25: instanceof com/U/y
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/U/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.N Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 140
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/U/y
      // 40: invokevirtual com/U/O.setUI (Ljavax/swing/plaf/SplitPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/U/y
      // 50: dup
      // 51: invokespecial com/U/y.<init> ()V
      // 54: invokevirtual com/U/O.setUI (Ljavax/swing/plaf/SplitPaneUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/U/O.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/U/O.getUI ()Ljavax/swing/plaf/SplitPaneUI;
      // 67: invokevirtual com/U/O.setUI (Ljavax/swing/plaf/SplitPaneUI;)V
      // 6a: aload 0
      // 6b: invokevirtual com/U/O.revalidate ()V
      // 6e: return
   }

   public static void o(boolean var0) {
      X = var0;
   }

   public static boolean r$boolean() {
      return X;
   }

   public static boolean U() {
      boolean var0 = r();
      return !var0;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      if (U()) {
         o(true);
      }
   }
}





