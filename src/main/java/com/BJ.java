package com;

import javax.swing.JViewport;

public class BJ extends JViewport {
   public com.WU q() {
      return (com.WU)this.getUI();
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
      // 00: invokestatic com/WU.p ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/BJ.getUI ()Ljavax/swing/plaf/ViewportUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/BJ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/BJ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/BJ.getUI ()Ljavax/swing/plaf/ViewportUI;
      // 25: instanceof com/WU
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/BJ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/a9.zf Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 36
      // 3a: invokestatic com/Kp_2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/WU
      // 40: invokevirtual com/BJ.setUI (Ljavax/swing/plaf/ViewportUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/nE_3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/WU
      // 50: dup
      // 51: invokespecial com/WU.<init> ()V
      // 54: invokevirtual com/BJ.setUI (Ljavax/swing/plaf/ViewportUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/BJ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/BJ.getUI ()Ljavax/swing/plaf/ViewportUI;
      // 67: invokevirtual com/BJ.setUI (Ljavax/swing/plaf/ViewportUI;)V
      // 6a: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 6d: ifnull 7e
      // 70: iinc 1 1
      // 73: iload 1
      // 74: invokestatic com/WU.M (I)V
      // 77: goto 7e
      // 7a: invokestatic com/BJ.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: return
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





