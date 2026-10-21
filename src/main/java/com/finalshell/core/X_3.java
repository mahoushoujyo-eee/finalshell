package com.finalshell.core;

import javax.swing.JDesktopPane;

public class X_3 extends JDesktopPane {
   public L_3 a() {
      return (L_3)this.getUI();
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
      // 09: invokevirtual com/finalshell/core/X_3.getUI ()Ljavax/swing/plaf/DesktopPaneUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/X_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/X_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/core/X_3.getUI ()Ljavax/swing/plaf/DesktopPaneUI;
      // 25: instanceof com/finalshell/core/L_3
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/X_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.V Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 37
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/L_3
      // 40: invokevirtual com/finalshell/core/X_3.setUI (Ljavax/swing/plaf/DesktopPaneUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/L_3
      // 50: dup
      // 51: invokespecial com/finalshell/core/L_3.<init> ()V
      // 54: invokevirtual com/finalshell/core/X_3.setUI (Ljavax/swing/plaf/DesktopPaneUI;)V
      // 57: aload 1
      // 58: ifnull 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/X_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/X_3.getUI ()Ljavax/swing/plaf/DesktopPaneUI;
      // 67: invokevirtual com/finalshell/core/X_3.setUI (Ljavax/swing/plaf/DesktopPaneUI;)V
      // 6a: return
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





