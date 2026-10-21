package com.finalshell.task;

import com.finalshell.core.OB3;

public class JZ extends Thread {
   public final OB3 y;
   public static long a;
   public static long b;

   public JZ(OB3 var1) {
      this.y = var1;
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
      // 00: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 1
      // 07: ifnonnull 30
      // 0a: aload 0
      // 0b: getfield com/finalshell/task/JZ.y Lcom/finalshell/core/OB3;
      // 0e: getfield com/finalshell/core/OB3.k Ljava/lang/String;
      // 11: ifnull 1f
      // 14: goto 1b
      // 17: invokestatic com/finalshell/task/JZ.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: ifnonnull 38
      // 1f: getstatic com/finalshell/task/JZ.b J
      // 22: invokestatic java/lang/Thread.sleep (J)V
      // 25: goto 2d
      // 28: astore 3
      // 29: aload 3
      // 2a: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 2d: iinc 2 1
      // 30: iload 2
      // 31: getstatic com/finalshell/task/JZ.a J
      // 34: l2i
      // 35: if_icmplt 0a
      // 38: aload 1
      // 39: ifnull 25
      // 3c: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 7401182919832832537L;
      long var10002 = 2882239577631951367L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 5282880152178032161L;
      var10002 = 5282880152178032073L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





