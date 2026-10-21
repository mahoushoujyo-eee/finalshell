package org.V;

import java.io.IOException;
import java.io.InputStream;

public abstract class J {
   public static final org.V.U a = new org.V.Q();

   @org.F.c
   public final InputStream l(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/V/f.h ()[I
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual org/V/J.J (Ljava/lang/String;)Lorg/V/N;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic org/V/J.c (Ljava/io/IOException;)Ljava/io/IOException;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic org/V/J.c (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokeinterface org/V/N.o ()Ljava/io/InputStream; 1
      // 25: areturn
   }

   @org.F.c
   public abstract org.V.N J(String var1);

   private static IOException c(IOException var0) {
      return var0;
   }
}





