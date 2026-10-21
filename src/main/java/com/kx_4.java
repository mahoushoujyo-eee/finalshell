package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class kx_4 implements com.ak_2 {
   public static com.kx_4 b = new com.kx_4();

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 2
      // 04: checkcast com/CN
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 7
      // 0d: aload 6
      // 0f: ifnull 27
      // 12: ifnonnull 25
      // 15: goto 1c
      // 18: invokestatic com/kx_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual com/nL_3.e ()V
      // 20: return
      // 21: invokestatic com/kx_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: aload 7
      // 27: aload 1
      // 28: aload 3
      // 29: aload 4
      // 2b: iload 5
      // 2d: invokeinterface com/CN.G (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 5
      // 32: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





