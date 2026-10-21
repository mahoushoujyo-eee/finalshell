import java.io.IOException;

class tX_3 implements Runnable {
   final com.dB_3 B;
   final F6 Q;

   tX_3(F6 var1, com.dB_3 var2) {
      this.Q = var1;
      this.B = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic F6.i ()Z
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: new java/io/BufferedReader
      // 09: dup
      // 0a: new java/io/InputStreamReader
      // 0d: dup
      // 0e: aload 0
      // 0f: ldc2_w 480419807221594647
      // 12: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 15: swap
      // 16: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 19: checkcast com/dB_3
      // 1c: invokevirtual com/dB_3.B ()Ljava/io/InputStream;
      // 1f: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 22: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 25: astore 2
      // 26: aload 2
      // 27: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2a: dup
      // 2b: astore 3
      // 2c: ifnull 32
      // 2f: goto 26
      // 32: aload 2
      // 33: iload 1
      // 34: ifeq 42
      // 37: ifnull 8e
      // 3a: goto 41
      // 3d: invokestatic tX_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 40: athrow
      // 41: aload 2
      // 42: invokevirtual java/io/BufferedReader.close ()V
      // 45: goto 8e
      // 48: astore 3
      // 49: aload 3
      // 4a: invokevirtual java/io/IOException.printStackTrace ()V
      // 4d: goto 8e
      // 50: astore 3
      // 51: aload 3
      // 52: invokevirtual java/io/IOException.printStackTrace ()V
      // 55: aload 2
      // 56: iload 1
      // 57: ifeq 5e
      // 5a: ifnull 8e
      // 5d: aload 2
      // 5e: invokevirtual java/io/BufferedReader.close ()V
      // 61: goto 8e
      // 64: astore 3
      // 65: aload 3
      // 66: invokevirtual java/io/IOException.printStackTrace ()V
      // 69: goto 8e
      // 6c: astore 4
      // 6e: aload 2
      // 6f: iload 1
      // 70: ifeq 7e
      // 73: ifnull 8b
      // 76: goto 7d
      // 79: invokestatic tX_3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7c: athrow
      // 7d: aload 2
      // 7e: invokevirtual java/io/BufferedReader.close ()V
      // 81: goto 8b
      // 84: astore 5
      // 86: aload 5
      // 88: invokevirtual java/io/IOException.printStackTrace ()V
      // 8b: aload 4
      // 8d: athrow
      // 8e: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





