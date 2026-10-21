package com.finalshell.task;

import com.finalshell.core.Fv2_2;
import com.finalshell.core.S0;

public class N2 implements Runnable {
   public final Fv2_2 K;
   public final S0 e;

   public N2(S0 var1, Fv2_2 var2) {
      this.e = var1;
      this.K = var2;
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
      // 00: invokestatic com/finalshell/core/S0.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 0
      // 07: getfield com/finalshell/task/N2.K Lcom/finalshell/core/Fv2_2;
      // 0a: invokeinterface com/finalshell/core/Fv2_2.f ()I 1
      // 0f: istore 2
      // 10: goto 23
      // 13: astore 3
      // 14: invokestatic com/finalshell/core/S0.g ()Lorg/slf4j/Logger;
      // 17: ldc ""
      // 19: aload 3
      // 1a: invokeinterface org/slf4j/Logger.debug (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 1f: aload 1
      // 20: ifnull 06
      // 23: aload 0
      // 24: getfield com/finalshell/task/N2.e Lcom/finalshell/core/S0;
      // 27: invokestatic com/finalshell/core/S0.P (Lcom/finalshell/core/S0;)Ljava/util/concurrent/Future;
      // 2a: invokeinterface java/util/concurrent/Future.isCancelled ()Z 1
      // 2f: aload 1
      // 30: ifnonnull 5c
      // 33: ifne 5d
      // 36: goto 3d
      // 39: invokestatic com/finalshell/task/N2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/finalshell/task/N2.e Lcom/finalshell/core/S0;
      // 41: invokestatic com/finalshell/core/S0.a (Lcom/finalshell/core/S0;)Ljava/util/concurrent/BlockingQueue;
      // 44: invokeinterface java/util/concurrent/BlockingQueue.take ()Ljava/lang/Object; 1
      // 49: checkcast java/util/function/Predicate
      // 4c: iload 2
      // 4d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 50: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // 55: goto 5c
      // 58: invokestatic com/finalshell/task/N2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 5b: athrow
      // 5c: pop
      // 5d: goto bf
      // 60: astore 3
      // 61: invokestatic com/finalshell/core/S0.g ()Lorg/slf4j/Logger;
      // 64: ldc ""
      // 66: aload 3
      // 67: invokeinterface org/slf4j/Logger.info (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 6c: goto bf
      // 6f: astore 4
      // 71: aload 0
      // 72: getfield com/finalshell/task/N2.e Lcom/finalshell/core/S0;
      // 75: invokestatic com/finalshell/core/S0.P (Lcom/finalshell/core/S0;)Ljava/util/concurrent/Future;
      // 78: invokeinterface java/util/concurrent/Future.isCancelled ()Z 1
      // 7d: aload 1
      // 7e: ifnonnull aa
      // 81: ifne ab
      // 84: goto 8b
      // 87: invokestatic com/finalshell/task/N2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield com/finalshell/task/N2.e Lcom/finalshell/core/S0;
      // 8f: invokestatic com/finalshell/core/S0.a (Lcom/finalshell/core/S0;)Ljava/util/concurrent/BlockingQueue;
      // 92: invokeinterface java/util/concurrent/BlockingQueue.take ()Ljava/lang/Object; 1
      // 97: checkcast java/util/function/Predicate
      // 9a: iload 2
      // 9b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9e: invokeinterface java/util/function/Predicate.test (Ljava/lang/Object;)Z 2
      // a3: goto aa
      // a6: invokestatic com/finalshell/task/N2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // a9: athrow
      // aa: pop
      // ab: goto bc
      // ae: astore 5
      // b0: invokestatic com/finalshell/core/S0.g ()Lorg/slf4j/Logger;
      // b3: ldc ""
      // b5: aload 5
      // b7: invokeinterface org/slf4j/Logger.info (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // bc: aload 4
      // be: athrow
      // bf: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // c2: ifnull d3
      // c5: bipush 2
      // c6: anewarray 87
      // c9: invokestatic com/finalshell/core/S0.q ([Lcom/finalshell/ui/panel/Ky4;)V
      // cc: goto d3
      // cf: invokestatic com/finalshell/task/N2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // d2: athrow
      // d3: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





