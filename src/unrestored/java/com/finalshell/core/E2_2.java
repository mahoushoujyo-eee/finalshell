package com.finalshell.core;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class E2_2 extends JOptionPane {
   public static int W;

   public E2_2() {
   }

   public E2_2(Object var1) {
      super(var1);
   }

   public E2_2(Object var1, int var2) {
      super(var1, var2);
   }

   public E2_2(Object var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public E2_2(Object var1, int var2, int var3, Icon var4) {
      super(var1, var2, var3, var4);
   }

   public E2_2(Object var1, int var2, int var3, Icon var4, Object[] var5) {
      super(var1, var2, var3, var4, var5);
   }

   public E2_2(Object var1, int var2, int var3, Icon var4, Object[] var5, Object var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public S_2 U() {
      return (S_2)this.getUI();
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
      // 00: invokestatic com/finalshell/core/E2_2.f ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 33
      // 09: invokevirtual com/finalshell/core/E2_2.getUI ()Ljavax/swing/plaf/OptionPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/E2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/E2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/E2_2.getUI ()Ljavax/swing/plaf/OptionPaneUI;
      // 25: instanceof com/finalshell/core/S_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/E2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zw Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 56
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/S_2
      // 40: invokevirtual com/finalshell/core/E2_2.setUI (Ljavax/swing/plaf/OptionPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/S_2
      // 50: dup
      // 51: invokespecial com/finalshell/core/S_2.<init> ()V
      // 54: invokevirtual com/finalshell/core/E2_2.setUI (Ljavax/swing/plaf/OptionPaneUI;)V
      // 57: iload 1
      // 58: ifeq 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/E2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/E2_2.getUI ()Ljavax/swing/plaf/OptionPaneUI;
      // 67: invokevirtual com/finalshell/core/E2_2.setUI (Ljavax/swing/plaf/OptionPaneUI;)V
      // 6a: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 6d: ifnull 7e
      // 70: iinc 1 1
      // 73: iload 1
      // 74: invokestatic com/finalshell/core/E2_2.U (I)V
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/E2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: return
   }

   public static void U(int var0) {
      W = var0;
   }

   public static int D() {
      return W;
   }

   public static int f() {
      int var0 = D();
      return var0 == 0 ? 75 : 0;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (D() == 0) {
         U(3);
      }
   }
}





