package com.finalshell.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class GB extends PipedOutputStream {
   public Gu2 i;

   public GB(PipedInputStream param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial java/io/PipedOutputStream.<init> (Ljava/io/PipedInputStream;)V
      // 05: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 08: aload 0
      // 09: aconst_null
      // 0a: putfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 0d: istore 3
      // 0e: iload 2
      // 0f: iload 3
      // 10: ifeq 28
      // 13: ifeq 3a
      // 16: goto 1d
      // 19: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: instanceof com/finalshell/io/Gu2
      // 21: goto 28
      // 24: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: ifeq 3a
      // 2b: aload 0
      // 2c: aload 1
      // 2d: checkcast com/finalshell/io/Gu2
      // 30: putfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 33: goto 3a
      // 36: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 39: athrow
      // 3a: return
   }

   @Override
   public void write(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 26
      // 09: getfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 1a: bipush 1
      // 1b: invokevirtual com/finalshell/io/Gu2.r (I)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: aload 0
      // 26: iload 1
      // 27: invokespecial java/io/PipedOutputStream.write (I)V
      // 2a: return
   }

   @Override
   public void write(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 28
      // 0b: getfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 0e: ifnull 27
      // 11: goto 18
      // 14: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/io/GB.i Lcom/finalshell/io/Gu2;
      // 1c: iload 3
      // 1d: invokevirtual com/finalshell/io/Gu2.r (I)V
      // 20: goto 27
      // 23: invokestatic com/finalshell/io/GB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: iload 2
      // 2a: iload 3
      // 2b: invokespecial java/io/PipedOutputStream.write ([BII)V
      // 2e: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





