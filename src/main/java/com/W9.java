package com;

import java.awt.Color;
import java.awt.Shape;
import javax.swing.JMenuBar;

public class W9 extends JMenuBar implements com.W2 {
   public W9() {
   }

   public W9(com.Bj_2 var1) {
      this.E(var1);
   }

   public boolean d() {
      return this.D().O();
   }

   public void t(boolean var1) {
      this.D().j(var1);
   }

   public com.Bj_2 x() {
      return this.D().w();
   }

   public void E(com.Bj_2 var1) {
      this.D().v(var1);
   }

   public Color t() {
      return this.D().O();
   }

   public void C(Color var1) {
      this.D().w(var1);
   }

   public int e() {
      return this.D().K();
   }

   public void Q(int var1) {
      this.D().N(var1);
   }

   public int b() {
      return this.D().g();
   }

   public void S(int var1) {
      this.D().g(var1);
   }

   @Override
   public Shape B() {
      return this.D().B();
   }

   public com.zl_2 D() {
      return (com.zl_2)this.getUI();
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
      // 00: invokestatic com/pb_4.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 33
      // 09: invokevirtual com/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 63
      // 1b: goto 22
      // 1e: invokestatic com/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 25: instanceof com/zl_2
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.s Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 93
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/zl_2
      // 40: invokevirtual com/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/zl_2
      // 50: dup
      // 51: invokespecial com/zl_2.<init> ()V
      // 54: invokevirtual com/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 57: aload 1
      // 58: ifnonnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/W9.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/W9.getUI ()Ljavax/swing/plaf/MenuBarUI;
      // 67: invokevirtual com/W9.setUI (Ljavax/swing/plaf/MenuBarUI;)V
      // 6a: return
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





