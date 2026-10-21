package com.finalshell.task;

public class N1 implements Runnable {
   public static long a;

   N1() {
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
      // 08: bipush 0
      // 09: istore 2
      // 0a: iload 2
      // 0b: getstatic com/finalshell/task/N1.a J
      // 0e: l2i
      // 0f: if_icmpge 2d
      // 12: getstatic com/finalshell/core/BN3.y Ljava/io/OutputStream;
      // 15: bipush 4
      // 16: newarray 8
      // 18: invokevirtual java/io/OutputStream.write ([B)V
      // 1b: iinc 2 1
      // 1e: iload 1
      // 1f: ifne 62
      // 22: iload 1
      // 23: ifeq 0a
      // 26: goto 2d
      // 29: invokestatic com/finalshell/task/N1.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2c: athrow
      // 2d: goto 62
      // 30: astore 2
      // 31: goto 62
      // 34: astore 2
      // 35: aload 2
      // 36: invokevirtual java/lang/Exception.printStackTrace ()V
      // 39: iload 1
      // 3a: ifne 5c
      // 3d: invokestatic com/finalshell/core/Ba4.A ()Ljava/lang/Exception;
      // 40: ifnonnull 56
      // 43: goto 4a
      // 46: invokestatic com/finalshell/task/N1.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 49: athrow
      // 4a: aload 2
      // 4b: invokestatic com/finalshell/core/Ba4.c (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: pop
      // 4f: goto 56
      // 52: invokestatic com/finalshell/task/N1.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 55: athrow
      // 56: invokestatic com/finalshell/core/Ba4.y ()Ljava/lang/Thread;
      // 59: invokevirtual java/lang/Thread.interrupt ()V
      // 5c: invokestatic com/finalshell/core/Ba4.D ()Ljava/lang/Thread;
      // 5f: invokevirtual java/lang/Thread.interrupt ()V
      // 62: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5760534633227030836L;
      long var10002 = -3745896377162067236L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





