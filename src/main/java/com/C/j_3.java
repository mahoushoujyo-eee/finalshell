package com.c;

import com.i2_2;
import com.nE_3;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

public class j_3 extends JInternalFrame implements com.au_2 {
   public j_3() {
   }

   public j_3(String var1) {
      super(var1);
   }

   public j_3(String var1, boolean var2) {
      super(var1, var2);
   }

   public j_3(String var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
   }

   public j_3(String var1, boolean var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public j_3(String var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   public R_2 Z() {
      return (R_2)this.getUI();
   }

   @Override
   public void setIcon(boolean var1) {
      try {
         super.setIcon(var1);
      } catch (PropertyVetoException var3) {
         nE_3.g(this, var3);
      }
   }

   public void t() {
      try {
         this.setClosed(true);
      } catch (PropertyVetoException var2) {
         nE_3.g(this, var2);
      }
   }

   public void q() {
      try {
         this.setClosed(false);
         this.setVisible(true);
      } catch (PropertyVetoException var2) {
         nE_3.g(this, var2);
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
      // 00: invokestatic com/c/D_2.W ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 33
      // 09: invokevirtual com/c/j_3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/c/j_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 68
      // 1b: goto 22
      // 1e: invokestatic com/c/j_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/c/j_3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 25: instanceof com/c/R_2
      // 28: ifne 60
      // 2b: goto 32
      // 2e: invokestatic com/c/j_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zh Ljava/lang/String;
      // 36: bipush 1
      // 37: anewarray 77
      // 3a: dup
      // 3b: bipush 0
      // 3c: aload 0
      // 3d: aastore
      // 3e: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 41: checkcast com/c/R_2
      // 44: invokevirtual com/c/j_3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 47: goto 6f
      // 4a: astore 2
      // 4b: aload 0
      // 4c: aload 2
      // 4d: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 50: aload 0
      // 51: new com/c/R_2
      // 54: dup
      // 55: aload 0
      // 56: invokespecial com/c/R_2.<init> (Ljavax/swing/JInternalFrame;)V
      // 59: invokevirtual com/c/j_3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 5c: aload 1
      // 5d: ifnull 6f
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic com/c/j_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: invokevirtual com/c/j_3.getUI ()Ljavax/swing/plaf/InternalFrameUI;
      // 6c: invokevirtual com/c/j_3.setUI (Ljavax/swing/plaf/InternalFrameUI;)V
      // 6f: aload 0
      // 70: invokevirtual com/c/j_3.invalidate ()V
      // 73: return
   }

   @Override
   public void u(String var1, Object[] var2) {
      i2_2.n(this, var1, var2);
   }

   @Override
   public void F(Object[] var1) {
      i2_2.U(this, var1);
   }

   @Override
   public void N(String var1, Object[] var2) {
      i2_2.q(this, var1, var2);
   }

   @Override
   public void M() {
      i2_2.L(this);
   }

   @Override
   public boolean k() {
      return i2_2.Z(this);
   }

   @Override
   public void M(com.ld_4 var1) {
      i2_2.g(this, var1);
   }

   @Override
   public void i() {
      i2_2.o(this);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





