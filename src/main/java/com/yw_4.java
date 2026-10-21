package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class yw_4 implements com.ak_2 {
   public static com.yw_4 k = new com.yw_4();

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
      // 03: aload 1
      // 04: getfield com/nL_3.w Lcom/yM_3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 26
      // 11: ifnonnull 25
      // 14: goto 1b
      // 17: invokestatic com/yw_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 7
      // 1d: invokevirtual com/yM_3.Y ()V
      // 20: return
      // 21: invokestatic com/yw_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: aload 2
      // 26: checkcast com/xd_4
      // 29: astore 8
      // 2b: aload 7
      // 2d: aload 8
      // 2f: invokeinterface com/xd_4.V ()Ljava/lang/String; 1
      // 34: invokevirtual com/yM_3.write (Ljava/lang/String;)V
      // 37: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





