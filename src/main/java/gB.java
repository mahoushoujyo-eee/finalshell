import java.io.BufferedReader;
import java.io.IOException;

class gB implements Runnable {
   final BufferedReader a;
   final CH i;

   gB(BufferedReader var1, CH var2) {
      this.a = var1;
      this.i = var2;
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
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc2_w 633959313544576926
      // 08: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b: swap
      // 0c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f: checkcast java/io/BufferedReader
      // 12: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 15: dup
      // 16: astore 2
      // 17: ifnull 6b
      // 1a: aload 0
      // 1b: aload 1
      // 1c: ifnull 6c
      // 1f: ldc2_w 127949613846953157
      // 22: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 25: swap
      // 26: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 29: checkcast CH
      // 2c: aload 1
      // 2d: ifnull 4f
      // 30: goto 37
      // 33: invokestatic gB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 36: athrow
      // 37: ifnull 04
      // 3a: goto 41
      // 3d: invokestatic gB.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 40: athrow
      // 41: aload 0
      // 42: ldc2_w 127949613846953157
      // 45: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 48: swap
      // 49: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4c: checkcast CH
      // 4f: new java/lang/StringBuilder
      // 52: dup
      // 53: invokespecial java/lang/StringBuilder.<init> ()V
      // 56: aload 2
      // 57: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a: ldc "\n"
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokeinterface CH.d (Ljava/lang/String;)V 2
      // 67: aload 1
      // 68: ifnonnull 04
      // 6b: aload 0
      // 6c: ldc2_w 633959313544576926
      // 6f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 72: swap
      // 73: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 76: checkcast java/io/BufferedReader
      // 79: invokevirtual java/io/BufferedReader.close ()V
      // 7c: goto 84
      // 7f: astore 3
      // 80: aload 3
      // 81: invokevirtual java/io/IOException.printStackTrace ()V
      // 84: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





