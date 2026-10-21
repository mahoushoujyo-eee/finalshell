package com.finalshell.task;

import com.finalshell.core.CH;
import java.io.BufferedReader;
import java.io.IOException;

public class VU implements Runnable {
   public final BufferedReader D;
   public final CH w;

   public VU(BufferedReader var1, CH var2) {
      this.D = var1;
      this.w = var2;
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
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc2_w 123536913151790863
      // 08: astore 4
      // 0a: ldc2_w 123536913151790863
      // 0d: aload 4
      // 0f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12: checkcast java/io/BufferedReader
      // 15: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 18: dup
      // 19: astore 2
      // 1a: ifnull 74
      // 1d: aload 0
      // 1e: aload 1
      // 1f: ifnull 75
      // 22: ldc2_w 341893703860567688
      // 25: astore 6
      // 27: ldc2_w 341893703860567688
      // 2a: aload 6
      // 2c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f: checkcast com/finalshell/core/CH
      // 32: aload 1
      // 33: ifnull 58
      // 36: goto 3d
      // 39: invokestatic com/finalshell/task/VU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3c: athrow
      // 3d: ifnull 04
      // 40: goto 47
      // 43: invokestatic com/finalshell/task/VU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 46: athrow
      // 47: aload 0
      // 48: ldc2_w 341893703860567688
      // 4b: astore 8
      // 4d: ldc2_w 341893703860567688
      // 50: aload 8
      // 52: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 55: checkcast com/finalshell/core/CH
      // 58: new java/lang/StringBuilder
      // 5b: dup
      // 5c: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f: aload 2
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: ldc "\n"
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: invokeinterface com/finalshell/core/CH.d (Ljava/lang/String;)V 2
      // 70: aload 1
      // 71: ifnonnull 04
      // 74: aload 0
      // 75: ldc2_w 123536913151790863
      // 78: astore 10
      // 7a: ldc2_w 123536913151790863
      // 7d: aload 10
      // 7f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 82: checkcast java/io/BufferedReader
      // 85: invokevirtual java/io/BufferedReader.close ()V
      // 88: goto 90
      // 8b: astore 3
      // 8c: aload 3
      // 8d: invokevirtual java/io/IOException.printStackTrace ()V
      // 90: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





