package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;

public abstract class J_5 {
   public static U2_3 a;

   @C_9
   public final InputStream l(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/F_6.h ()[I
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/J_5.c (Ljava/io/IOException;)Ljava/io/IOException;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/J_5.c (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 25: areturn
   }

   @C_9
   public abstract N_6 J(String var1);

   static {
      __vfClinit__();
   }

   public static IOException c(IOException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      a = new Q_4();
   }
}





