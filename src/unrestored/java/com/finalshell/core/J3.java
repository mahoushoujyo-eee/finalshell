package com.finalshell.core;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

public class J3 extends JInternalFrame implements Au2 {
   public J3() {
   }

   public J3(String var1) {
      super(var1);
   }

   public J3(String var1, boolean var2) {
      super(var1, var2);
   }

   public J3(String var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
   }

   public J3(String var1, boolean var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public J3(String var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   public R_2_2 Z() {
      return (R_2_2)this.getUI();
   }

   @Override
   public void setIcon(boolean var1) {
      try {
         super.setIcon(var1);
      } catch (PropertyVetoException var3) {
         NE3.g(this, var3);
      }
   }

   public void t() {
      try {
         this.setClosed(true);
      } catch (PropertyVetoException var2) {
         NE3.g(this, var2);
      }
   }

   public void q() {
      try {
         this.setClosed(false);
         this.setVisible(true);
      } catch (PropertyVetoException var2) {
         NE3.g(this, var2);
      }
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
      // 00: invokestatic com/finalshell/core/D_2_2.W ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/finalshell/core/J3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/J3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 68
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/J3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/J3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 25: instanceof com/finalshell/core/R_2_2
      // 28: ifne 60
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/J3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zh Ljava/lang/String;
      // 36: bipush 1
      // 37: anewarray 75
      // 3a: dup
      // 3b: bipush 0
      // 3c: aload 0
      // 3d: aastore
      // 3e: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 41: checkcast com/finalshell/core/R_2_2
      // 44: invokevirtual com/finalshell/core/J3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 47: goto 6f
      // 4a: astore 2
      // 4b: aload 0
      // 4c: aload 2
      // 4d: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 50: aload 0
      // 51: new com/finalshell/core/R_2_2
      // 54: dup
      // 55: aload 0
      // 56: invokespecial com/finalshell/core/R_2_2.<init> (Ljavax/swing/JInternalFrame;)V
      // 59: invokevirtual com/finalshell/core/J3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 5c: aload 1
      // 5d: ifnull 6f
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/J3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: invokevirtual com/finalshell/core/J3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 6c: invokevirtual com/finalshell/core/J3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 6f: aload 0
      // 70: invokevirtual com/finalshell/core/J3.invalidate ()V
      // 73: return
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

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





