package com.finalshell.task;

public class CK3 implements Runnable {
   CK3() {
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.C ()I
      // 03: istore 1
      // 04: bipush 2
      // 05: invokestatic com/finalshell/core/BN3.E (I)V
      // 08: goto 3d
      // 0b: astore 2
      // 0c: goto 3d
      // 0f: astore 2
      // 10: aload 2
      // 11: invokevirtual java/lang/Exception.printStackTrace ()V
      // 14: iload 1
      // 15: ifne 37
      // 18: invokestatic com/finalshell/core/Bg4.D ()Ljava/lang/Exception;
      // 1b: ifnonnull 31
      // 1e: goto 25
      // 21: invokestatic com/finalshell/task/CK3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 24: athrow
      // 25: aload 2
      // 26: invokestatic com/finalshell/core/Bg4.t (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: pop
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/task/CK3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 30: athrow
      // 31: invokestatic com/finalshell/core/Bg4.b ()Ljava/lang/Thread;
      // 34: invokevirtual java/lang/Thread.interrupt ()V
      // 37: invokestatic com/finalshell/core/Bg4.Y ()Ljava/lang/Thread;
      // 3a: invokevirtual java/lang/Thread.interrupt ()V
      // 3d: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





