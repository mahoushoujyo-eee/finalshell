package com.finalshell.task;

import com.finalshell.core.Ai2_2;

public class LG implements Runnable {
   public final Ai2_2 r;
   public static long a;

   public LG(Ai2_2 var1) {
      this.r = var1;
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
      // 00: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 08: invokestatic com/finalshell/core/Ai2_2.r (Lcom/finalshell/core/Ai2_2;)Z
      // 0b: ifne ba
      // 0e: aload 0
      // 0f: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 12: invokestatic com/finalshell/core/Ai2_2.q (Lcom/finalshell/core/Ai2_2;)Ljava/util/Map;
      // 15: aload 0
      // 16: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 19: invokestatic com/finalshell/core/Ai2_2.E (Lcom/finalshell/core/Ai2_2;)I
      // 1c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 24: checkcast com/finalshell/core/Kj4
      // 27: getfield com/finalshell/core/Kj4.p I
      // 2a: istore 2
      // 2b: iload 2
      // 2c: aload 1
      // 2d: ifnull 45
      // 30: ifne 44
      // 33: goto 3a
      // 36: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 39: athrow
      // 3a: getstatic com/finalshell/task/LG.a J
      // 3d: goto 46
      // 40: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 43: athrow
      // 44: iload 2
      // 45: i2l
      // 46: invokestatic java/lang/Thread.sleep (J)V
      // 49: goto 4d
      // 4c: astore 3
      // 4d: aload 0
      // 4e: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 51: invokestatic com/finalshell/core/Ai2_2.E (Lcom/finalshell/core/Ai2_2;)I
      // 54: aload 1
      // 55: ifnull 8d
      // 58: aload 0
      // 59: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 5c: invokestatic com/finalshell/core/Ai2_2.C (Lcom/finalshell/core/Ai2_2;)I
      // 5f: bipush 1
      // 60: isub
      // 61: if_icmpne 7f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 6f: bipush 0
      // 70: invokestatic com/finalshell/core/Ai2_2.g (Lcom/finalshell/core/Ai2_2;I)I
      // 73: pop
      // 74: aload 1
      // 75: ifnonnull 8e
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 83: invokestatic com/finalshell/core/Ai2_2.z (Lcom/finalshell/core/Ai2_2;)I
      // 86: goto 8d
      // 89: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 8c: athrow
      // 8d: pop
      // 8e: aload 0
      // 8f: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // 92: invokestatic com/finalshell/core/Ai2_2.I (Lcom/finalshell/core/Ai2_2;)Lcom/finalshell/core/CJ3;
      // 95: aload 1
      // 96: ifnull b1
      // 99: ifnull b6
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // a2: athrow
      // a3: aload 0
      // a4: getfield com/finalshell/task/LG.r Lcom/finalshell/core/Ai2_2;
      // a7: invokestatic com/finalshell/core/Ai2_2.I (Lcom/finalshell/core/Ai2_2;)Lcom/finalshell/core/CJ3;
      // aa: goto b1
      // ad: invokestatic com/finalshell/task/LG.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // b0: athrow
      // b1: invokeinterface com/finalshell/core/CJ3.n ()V 1
      // b6: aload 1
      // b7: ifnonnull 04
      // ba: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3088718530540375175L;
      long var10002 = 3088718530540375267L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





