package com.finalshell.core;

import java.sql.Connection;

public class C72 {
   public static void N(Connection param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D52_2.k ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 38
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/C72.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: ifnonnull 2f
      // 18: invokeinterface java/sql/Connection.isClosed ()Z 1
      // 1d: ifne 38
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/C72.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/C72.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: invokeinterface java/sql/Connection.close ()V 1
      // 34: goto 38
      // 37: astore 2
      // 38: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





