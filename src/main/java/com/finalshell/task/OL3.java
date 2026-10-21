package com.finalshell.task;

import com.finalshell.ui.dialog.DownloadDialog;
import java.io.IOException;

public class OL3 implements Runnable {
   public final DownloadDialog R;

   public OL3(DownloadDialog var1) {
      this.R = var1;
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
      // 00: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: new java/io/BufferedReader
      // 09: dup
      // 0a: new java/io/InputStreamReader
      // 0d: dup
      // 0e: aload 0
      // 0f: ldc2_w 577694541665101301
      // 12: astore 6
      // 14: ldc2_w 577694541665101301
      // 17: aload 6
      // 19: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c: ldc2_w 207607350854790523
      // 1f: astore 8
      // 21: ldc2_w 207607350854790523
      // 24: aload 8
      // 26: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29: checkcast com/finalshell/core/DB3
      // 2c: invokevirtual com/finalshell/core/DB3.B ()Ljava/io/InputStream;
      // 2f: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 32: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 35: astore 2
      // 36: aload 2
      // 37: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 3a: dup
      // 3b: astore 3
      // 3c: ifnull 8b
      // 3f: aload 0
      // 40: ldc2_w 577694541665101301
      // 43: astore 10
      // 45: ldc2_w 577694541665101301
      // 48: aload 10
      // 4a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: ldc ""
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 3
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 63: ldc2_w 228243458517053156
      // 66: astore 13
      // 68: astore 12
      // 6a: ldc2_w 228243458517053156
      // 6d: aload 12
      // 6f: aload 13
      // 71: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 74: pop
      // 75: goto 7c
      // 78: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: iload 1
      // 7d: ifne e7
      // 80: iload 1
      // 81: ifeq 36
      // 84: goto 8b
      // 87: invokestatic com/finalshell/task/OL3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 8a: athrow
      // 8b: aload 2
      // 8c: iload 1
      // 8d: ifne 9b
      // 90: ifnull e7
      // 93: goto 9a
      // 96: invokestatic com/finalshell/task/OL3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 99: athrow
      // 9a: aload 2
      // 9b: invokevirtual java/io/BufferedReader.close ()V
      // 9e: goto e7
      // a1: astore 3
      // a2: aload 3
      // a3: invokevirtual java/io/IOException.printStackTrace ()V
      // a6: goto e7
      // a9: astore 3
      // aa: aload 3
      // ab: invokevirtual java/io/IOException.printStackTrace ()V
      // ae: aload 2
      // af: iload 1
      // b0: ifne b7
      // b3: ifnull e7
      // b6: aload 2
      // b7: invokevirtual java/io/BufferedReader.close ()V
      // ba: goto e7
      // bd: astore 3
      // be: aload 3
      // bf: invokevirtual java/io/IOException.printStackTrace ()V
      // c2: goto e7
      // c5: astore 4
      // c7: aload 2
      // c8: iload 1
      // c9: ifne d7
      // cc: ifnull e4
      // cf: goto d6
      // d2: invokestatic com/finalshell/task/OL3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // d5: athrow
      // d6: aload 2
      // d7: invokevirtual java/io/BufferedReader.close ()V
      // da: goto e4
      // dd: astore 5
      // df: aload 5
      // e1: invokevirtual java/io/IOException.printStackTrace ()V
      // e4: aload 4
      // e6: athrow
      // e7: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





