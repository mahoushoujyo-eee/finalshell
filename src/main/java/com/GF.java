package com;

import java.io.IOException;
import java.io.PipedOutputStream;

class GF extends Gu_2 {
   PipedOutputStream h;

   GF(PipedOutputStream var1, int var2) throws IOException {
      super(var1, var2);
      this.h = var1;
   }

   GF(PipedOutputStream var1) throws IOException {
      super(var1);
      this.h = var1;
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.F ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 25
      // 09: getfield com/GF.h Ljava/io/PipedOutputStream;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/GF.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/GF.h Ljava/io/PipedOutputStream;
      // 1a: invokevirtual java/io/PipedOutputStream.close ()V
      // 1d: goto 24
      // 20: invokestatic com/GF.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 23: athrow
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield com/GF.h Ljava/io/PipedOutputStream;
      // 29: return
   }

   private static IOException b(IOException var0) {
      return var0;
   }
}





