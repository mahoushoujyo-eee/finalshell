package org.s;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

class Q extends FilterReader {
   final Writer n;
   final boolean w;

   Q(Reader var1, Writer var2, boolean var3) {
      super(var1);
      this.n = var2;
      this.w = var3;
   }

   @Override
   public void close() throws IOException {
      this.in.close();
      this.n.close();
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
      // 00: invokestatic org/s/W.v ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield org/s/Q.in Ljava/io/Reader;
      // 07: invokevirtual java/io/Reader.read ()I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: iload 2
      // 0d: aload 1
      // 0e: ifnull 32
      // 11: bipush -1
      // 12: if_icmpne 59
      // 15: goto 1c
      // 18: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: ifnull 4f
      // 21: goto 28
      // 24: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: getfield org/s/Q.w Z
      // 2b: goto 32
      // 2e: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 31: athrow
      // 32: ifeq 47
      // 35: aload 0
      // 36: getfield org/s/Q.n Ljava/io/Writer;
      // 39: invokevirtual java/io/Writer.close ()V
      // 3c: aload 1
      // 3d: ifnonnull 68
      // 40: goto 47
      // 43: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 46: athrow
      // 47: aload 0
      // 48: goto 4f
      // 4b: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4e: athrow
      // 4f: getfield org/s/Q.n Ljava/io/Writer;
      // 52: invokevirtual java/io/Writer.flush ()V
      // 55: aload 1
      // 56: ifnonnull 68
      // 59: aload 0
      // 5a: getfield org/s/Q.n Ljava/io/Writer;
      // 5d: iload 2
      // 5e: invokevirtual java/io/Writer.write (I)V
      // 61: goto 68
      // 64: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 67: athrow
      // 68: iload 2
      // 69: ireturn
   }

   @Override
   public int read(@org.F.c char[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/s/W.v ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield org/s/Q.in Ljava/io/Reader;
      // 07: aload 1
      // 08: iload 2
      // 09: iload 3
      // 0a: invokevirtual java/io/Reader.read ([CII)I
      // 0d: istore 5
      // 0f: astore 4
      // 11: iload 5
      // 13: aload 4
      // 15: ifnull 3a
      // 18: bipush -1
      // 19: if_icmpne 6a
      // 1c: goto 23
      // 1f: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22: athrow
      // 23: aload 0
      // 24: aload 4
      // 26: ifnull 5f
      // 29: goto 30
      // 2c: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2f: athrow
      // 30: getfield org/s/Q.w Z
      // 33: goto 3a
      // 36: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 39: athrow
      // 3a: ifeq 5e
      // 3d: aload 0
      // 3e: getfield org/s/Q.n Ljava/io/Writer;
      // 41: invokevirtual java/io/Writer.close ()V
      // 44: aload 4
      // 46: ifnonnull 7c
      // 49: goto 50
      // 4c: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4f: athrow
      // 50: bipush 3
      // 51: anewarray 45
      // 54: invokestatic com/ky_4.K ([Ljava/lang/String;)V
      // 57: goto 5e
      // 5a: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield org/s/Q.n Ljava/io/Writer;
      // 62: invokevirtual java/io/Writer.flush ()V
      // 65: aload 4
      // 67: ifnonnull 7c
      // 6a: aload 0
      // 6b: getfield org/s/Q.n Ljava/io/Writer;
      // 6e: aload 1
      // 6f: iload 2
      // 70: iload 5
      // 72: invokevirtual java/io/Writer.write ([CII)V
      // 75: goto 7c
      // 78: invokestatic org/s/Q.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7b: athrow
      // 7c: iload 5
      // 7e: ireturn
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





