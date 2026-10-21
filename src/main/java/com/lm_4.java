package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class lm_4 implements com.ak_2, X4 {
   public static final com.lm_4 m = new com.lm_4();

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
      // 0c: checkcast java/lang/Character
      // 0f: astore 8
      // 11: aload 8
      // 13: aload 6
      // 15: ifnull 30
      // 18: ifnonnull 2e
      // 1b: goto 22
      // 1e: invokestatic com/lm_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: aload 7
      // 24: ldc ""
      // 26: invokevirtual com/yM_3.y (Ljava/lang/String;)V
      // 29: return
      // 2a: invokestatic com/lm_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2d: athrow
      // 2e: aload 8
      // 30: invokevirtual java/lang/Character.charValue ()C
      // 33: istore 9
      // 35: aload 6
      // 37: ifnull 54
      // 3a: iload 9
      // 3c: ifne 59
      // 3f: goto 46
      // 42: invokestatic com/lm_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 45: athrow
      // 46: aload 7
      // 48: ldc "\u0000"
      // 4a: invokevirtual com/yM_3.y (Ljava/lang/String;)V
      // 4d: goto 54
      // 50: invokestatic com/lm_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 53: athrow
      // 54: aload 6
      // 56: ifnonnull 6a
      // 59: aload 7
      // 5b: aload 8
      // 5d: invokevirtual java/lang/Character.toString ()Ljava/lang/String;
      // 60: invokevirtual com/yM_3.y (Ljava/lang/String;)V
      // 63: goto 6a
      // 66: invokestatic com/lm_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 69: athrow
      // 6a: return
   }

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      String var10000 = nv_4.o();
      Object var5 = var1.M();
      String var4 = var10000;
      var10000 = (String)var5;
      if (var4 != null) {
         if (var5 == null) {
            return null;
         }

         var10000 = (String)var5;
      }

      return com.B8.S(var10000);
   }

   @Override
   public int j() {
      return 4;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





