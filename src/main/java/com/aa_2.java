package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class aa_2 implements com.ak_2 {
   private final String h;

   public aa_2(String var1) {
      this.h = var1;
   }

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
      // 03: astore 6
      // 05: aload 2
      // 06: aload 6
      // 08: ifnull 22
      // 0b: ifnonnull 21
      // 0e: goto 15
      // 11: invokestatic com/aa_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14: athrow
      // 15: aload 1
      // 16: getfield com/nL_3.w Lcom/yM_3;
      // 19: invokevirtual com/yM_3.Y ()V
      // 1c: return
      // 1d: invokestatic com/aa_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 20: athrow
      // 21: aload 2
      // 22: checkcast java/util/Date
      // 25: astore 7
      // 27: new java/text/SimpleDateFormat
      // 2a: dup
      // 2b: aload 0
      // 2c: getfield com/aa_2.h Ljava/lang/String;
      // 2f: aload 1
      // 30: getfield com/nL_3.y Ljava/util/Locale;
      // 33: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 36: astore 8
      // 38: aload 8
      // 3a: aload 1
      // 3b: getfield com/nL_3.D Ljava/util/TimeZone;
      // 3e: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 41: aload 8
      // 43: aload 7
      // 45: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 48: astore 9
      // 4a: aload 1
      // 4b: aload 9
      // 4d: invokevirtual com/nL_3.l (Ljava/lang/String;)V
      // 50: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





