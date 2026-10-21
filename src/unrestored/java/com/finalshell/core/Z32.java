package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;

public class Z32 implements Ak2 {
   public static Z32 L;

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: aload 6
      // 0e: ifnull 26
      // 11: ifnonnull 25
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Z32.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 7
      // 1d: invokevirtual com/finalshell/io/YM3.Y ()V
      // 20: return
      // 21: invokestatic com/finalshell/core/Z32.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 29: astore 8
      // 2b: aload 7
      // 2d: aload 8
      // 2f: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 32: return
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static void __vfClinit__() {
      L = new Z32();
   }
}





