package com.finalshell.io;

import com.finalshell.core.F_4;
import com.finalshell.core.N2_4;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class K3 extends FilterReader {
   public final N2_4 D;

   public K3(Reader var1, N2_4 var2) {
      super(var1);
      this.D = var2;
   }

   @Override
   public int read() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial java/io/FilterReader.read ()I
      // 07: istore 2
      // 08: astore 1
      // 09: iload 2
      // 0a: aload 1
      // 0b: ifnull 29
      // 0e: iflt 28
      // 11: goto 18
      // 14: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/io/K3.D Lcom/finalshell/core/N2_4;
      // 1c: iload 2
      // 1d: i2c
      // 1e: invokevirtual com/finalshell/core/N2_4.v (C)V
      // 21: goto 28
      // 24: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: iload 2
      // 29: ireturn
   }

   @F_4(false)
   @Override
   public int read(char[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: astore 4
      // 05: iload 3
      // 06: aload 4
      // 08: ifnull 1f
      // 0b: ifgt 1b
      // 0e: goto 15
      // 11: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual com/finalshell/io/K3.read ()I
      // 1f: istore 5
      // 21: iload 5
      // 23: aload 4
      // 25: ifnull 3f
      // 28: ifge 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 31: athrow
      // 32: bipush -1
      // 33: ireturn
      // 34: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 37: athrow
      // 38: aload 1
      // 39: iload 2
      // 3a: iload 5
      // 3c: i2c
      // 3d: castore
      // 3e: bipush 1
      // 3f: ireturn
   }

   @Override
   public long skip(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: astore 3
      // 04: lload 1
      // 05: lconst_0
      // 06: lcmp
      // 07: aload 3
      // 08: ifnull 1f
      // 0b: ifgt 1b
      // 0e: goto 15
      // 11: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14: athrow
      // 15: lconst_0
      // 16: lreturn
      // 17: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual com/finalshell/io/K3.read ()I
      // 1f: istore 4
      // 21: iload 4
      // 23: ifge 2c
      // 26: lconst_0
      // 27: lreturn
      // 28: invokestatic com/finalshell/io/K3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2b: athrow
      // 2c: lconst_1
      // 2d: lreturn
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public void mark(int var1) throws IOException {
      throw new IOException();
   }

   @Override
   public void reset() throws IOException {
      throw new IOException();
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





