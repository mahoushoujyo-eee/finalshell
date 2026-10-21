package com;

class wB_3 implements Runnable {
   final com.yF_3 D;

   wB_3(com.yF_3 var1) {
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
      // 00: invokestatic com/CT.U ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/wB_3.D Lcom/yF_3;
      // 07: invokestatic com/yF_3.Y (Lcom/yF_3;)Ljava/io/File;
      // 0a: invokevirtual java/io/File.lastModified ()J
      // 0d: lstore 2
      // 0e: astore 1
      // 0f: lload 2
      // 10: aload 1
      // 11: ifnonnull 2d
      // 14: invokestatic com/yF_3.C ()Ljava/lang/Long;
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lcmp
      // 1b: ifle 45
      // 1e: goto 25
      // 21: invokestatic com/wB_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: lload 2
      // 26: goto 2d
      // 29: invokestatic com/wB_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30: invokestatic com/yF_3.e (Ljava/lang/Long;)Ljava/lang/Long;
      // 33: pop
      // 34: aload 0
      // 35: getfield com/wB_3.D Lcom/yF_3;
      // 38: invokestatic com/yF_3.R (Lcom/yF_3;)V
      // 3b: goto 45
      // 3e: astore 4
      // 40: aload 4
      // 42: invokevirtual java/lang/Exception.printStackTrace ()V
      // 45: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





