package com.finalshell.task;

import com.finalshell.core.DB3;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.io.IOException;

public class TX3 implements Runnable {
   public final DB3 B;
   public final FileBrowserAddressBar Q;

   public TX3(FileBrowserAddressBar var1, DB3 var2) {
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
      // 00: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: new java/io/BufferedReader
      // 09: dup
      // 0a: new java/io/InputStreamReader
      // 0d: dup
      // 0e: aload 0
      // 0f: ldc2_w 480419807221594647
      // 12: astore 6
      // 14: ldc2_w 480419807221594647
      // 17: aload 6
      // 19: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c: checkcast com/finalshell/core/DB3
      // 1f: invokevirtual com/finalshell/core/DB3.B ()Ljava/io/InputStream;
      // 22: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 25: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 28: astore 2
      // 29: aload 2
      // 2a: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2d: dup
      // 2e: astore 3
      // 2f: ifnull 35
      // 32: goto 29
      // 35: aload 2
      // 36: iload 1
      // 37: ifeq 45
      // 3a: ifnull 91
      // 3d: goto 44
      // 40: invokestatic com/finalshell/task/TX3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 43: athrow
      // 44: aload 2
      // 45: invokevirtual java/io/BufferedReader.close ()V
      // 48: goto 91
      // 4b: astore 3
      // 4c: aload 3
      // 4d: invokevirtual java/io/IOException.printStackTrace ()V
      // 50: goto 91
      // 53: astore 3
      // 54: aload 3
      // 55: invokevirtual java/io/IOException.printStackTrace ()V
      // 58: aload 2
      // 59: iload 1
      // 5a: ifeq 61
      // 5d: ifnull 91
      // 60: aload 2
      // 61: invokevirtual java/io/BufferedReader.close ()V
      // 64: goto 91
      // 67: astore 3
      // 68: aload 3
      // 69: invokevirtual java/io/IOException.printStackTrace ()V
      // 6c: goto 91
      // 6f: astore 4
      // 71: aload 2
      // 72: iload 1
      // 73: ifeq 81
      // 76: ifnull 8e
      // 79: goto 80
      // 7c: invokestatic com/finalshell/task/TX3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 7f: athrow
      // 80: aload 2
      // 81: invokevirtual java/io/BufferedReader.close ()V
      // 84: goto 8e
      // 87: astore 5
      // 89: aload 5
      // 8b: invokevirtual java/io/IOException.printStackTrace ()V
      // 8e: aload 4
      // 90: athrow
      // 91: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





