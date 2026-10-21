package com.finalshell.core;

public class DL3_2 implements FW3 {
   @Override
   public void w(TX param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.C ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/TX.C ()I
      // 08: bipush 1
      // 09: iload 2
      // 0a: ifne 72
      // 0d: if_icmpne 6d
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: getstatic com/finalshell/core/BN3.J Ljava/io/InputStream;
      // 1a: invokevirtual java/io/InputStream.available ()I
      // 1d: newarray 8
      // 1f: astore 3
      // 20: getstatic com/finalshell/core/BN3.J Ljava/io/InputStream;
      // 23: aload 3
      // 24: invokevirtual java/io/InputStream.read ([B)I
      // 27: istore 4
      // 29: invokestatic com/finalshell/core/BQ3.L$boolean ()Z
      // 2c: iload 2
      // 2d: ifne 71
      // 30: ifne 6d
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: iload 4
      // 3c: invokestatic com/finalshell/core/BQ3.Z (I)I
      // 3f: pop
      // 40: aload 3
      // 41: iload 4
      // 43: invokestatic com/finalshell/core/BQ3.S ([BI)V
      // 46: invokestatic com/finalshell/core/BQ3.u ()I
      // 49: invokestatic com/finalshell/core/BQ3.J ()I
      // 4c: iload 2
      // 4d: ifne 72
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: if_icmplt 6d
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: bipush 1
      // 62: invokestatic com/finalshell/core/BQ3.y (Z)Z
      // 65: pop
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 1
      // 6e: invokevirtual com/finalshell/core/TX.C ()I
      // 71: bipush 2
      // 72: iload 2
      // 73: ifne 8d
      // 76: if_icmpne a2
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: invokestatic com/finalshell/core/BQ3.L$int ()I
      // 83: invokestatic com/finalshell/core/BQ3.J ()I
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/DL3_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: if_icmpge a2
      // 90: invokestatic com/finalshell/core/BQ3.q ()[B
      // 93: astore 3
      // 94: getstatic com/finalshell/core/BN3.y Ljava/io/OutputStream;
      // 97: aload 3
      // 98: bipush 0
      // 99: aload 3
      // 9a: arraylength
      // 9b: invokevirtual java/io/OutputStream.write ([BII)V
      // 9e: invokestatic com/finalshell/core/BQ3.V ()I
      // a1: pop
      // a2: goto aa
      // a5: astore 3
      // a6: aload 3
      // a7: invokevirtual java/lang/Exception.printStackTrace ()V
      // aa: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





