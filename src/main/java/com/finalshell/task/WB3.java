package com.finalshell.task;

import com.finalshell.core.Ip7;

public class WB3 implements Runnable {
   public final Ip7 D;

   public WB3(Ip7 var1) {
      this.D = var1;
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
      // 00: invokestatic com/finalshell/core/CT.U ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/task/WB3.D Lcom/finalshell/core/Ip7;
      // 07: invokestatic com/finalshell/core/Ip7.Y (Lcom/finalshell/core/Ip7;)Ljava/io/File;
      // 0a: invokevirtual java/io/File.lastModified ()J
      // 0d: lstore 2
      // 0e: astore 1
      // 0f: lload 2
      // 10: aload 1
      // 11: ifnonnull 2d
      // 14: invokestatic com/finalshell/core/Ip7.C ()Ljava/lang/Long;
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lcmp
      // 1b: ifle 45
      // 1e: goto 25
      // 21: invokestatic com/finalshell/task/WB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: lload 2
      // 26: goto 2d
      // 29: invokestatic com/finalshell/task/WB3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30: invokestatic com/finalshell/core/Ip7.e (Ljava/lang/Long;)Ljava/lang/Long;
      // 33: pop
      // 34: aload 0
      // 35: getfield com/finalshell/task/WB3.D Lcom/finalshell/core/Ip7;
      // 38: invokestatic com/finalshell/core/Ip7.R (Lcom/finalshell/core/Ip7;)V
      // 3b: goto 45
      // 3e: astore 4
      // 40: aload 4
      // 42: invokevirtual java/lang/Exception.printStackTrace ()V
      // 45: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





