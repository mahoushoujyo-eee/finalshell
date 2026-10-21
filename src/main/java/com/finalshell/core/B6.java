package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JColorChooser;
import javax.swing.colorchooser.ColorSelectionModel;

public class B6 extends JColorChooser implements OM {
   public B6() {
   }

   public B6(Color var1) {
      super(var1);
   }

   public B6(ColorSelectionModel var1) {
      super(var1);
   }

   public boolean T() {
      return this.R().c();
   }

   public void J(boolean var1) {
      this.R().K(var1);
   }

   public boolean C() {
      return this.R().X();
   }

   public void U(boolean var1) {
      this.R().Z(var1);
   }

   public Color V() {
      return this.R().o();
   }

   public void i(Color var1) {
      this.R().t(var1);
   }

   public void f() {
      this.R().j();
   }

   public void z(int var1) {
      this.R().i(var1);
   }

   public int Q() {
      return this.R().H();
   }

   public void f(O22_2 var1) {
      this.R().d(var1);
   }

   public void E(O22_2 var1) {
      this.R().j(var1);
   }

   public U_2 R() {
      return (U_2)this.getUI();
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
      // 00: invokestatic com/finalshell/ui/panel/N_2.g ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/core/B6.getUI ()Ljavax/swing/plaf/ColorChooserUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/B6.getUI ()Ljavax/swing/plaf/ColorChooserUI;
      // 25: instanceof com/finalshell/core/U_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/B6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.D Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 94
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/U_2
      // 40: invokevirtual com/finalshell/core/B6.setUI (Ljavax/swing/plaf/ColorChooserUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/U_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/U_2.<init> ()V
      // 54: invokevirtual com/finalshell/core/B6.setUI (Ljavax/swing/plaf/ColorChooserUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/B6.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/B6.getUI ()Ljavax/swing/plaf/ColorChooserUI;
      // 67: invokevirtual com/finalshell/core/B6.setUI (Ljavax/swing/plaf/ColorChooserUI;)V
      // 6a: return
   }

   public static Color t(Component var0) {
      return c(var0, null, null);
   }

   public static Color W(Component var0, String var1) {
      return c(var0, var1, null);
   }

   public static Color D(Component var0, Color var1) {
      return c(var0, null, var1);
   }

   public static Color c(Component var0, String var1, Color var2) {
      int var10000 = com.finalshell.ui.panel.N_2.W();
      com.finalshell.ui.dialog.S3 var4 = new com.finalshell.ui.dialog.S3(var0, var1);
      int var3 = var10000;
      if (var3 != 0) {
         if (var2 != null) {
            var4.n(var2);
         }

         var4.setVisible(true);
      }

      com.finalshell.ui.dialog.S3 var5 = var4;
      if (var3 != 0) {
         if (var4.b() != 0) {
            return null;
         }

         var5 = var4;
      }

      return var5.C();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





