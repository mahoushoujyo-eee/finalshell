package com.finalshell.task;

import com.finalshell.core.DB3;
import com.finalshell.core.KX3_2;
import java.io.IOException;

public class Ky4 implements Runnable {
   final DB3 n;
   final KX3_2 f;
   public static long a;

   Ky4(KX3_2 var1, DB3 var2) {
      this.f = var1;
      this.n = var2;
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
      // 000: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 003: aconst_null
      // 004: astore 2
      // 005: istore 1
      // 006: getstatic com/finalshell/task/Ky4.a J
      // 009: invokestatic java/lang/Thread.sleep (J)V
      // 00c: aload 0
      // 00d: ldc2_w 454714620785316824
      // 010: astore 6
      // 012: ldc2_w 454714620785316824
      // 015: aload 6
      // 017: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01a: checkcast com/finalshell/core/DB3
      // 01d: invokevirtual com/finalshell/core/DB3.B ()Z
      // 020: ifeq 006
      // 023: iload 1
      // 024: ifne 00c
      // 027: goto 02a
      // 02a: aload 2
      // 02b: iload 1
      // 02c: ifne 03a
      // 02f: ifnull 086
      // 032: goto 039
      // 035: invokestatic com/finalshell/task/Ky4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 038: athrow
      // 039: aload 2
      // 03a: invokevirtual java/io/BufferedReader.close ()V
      // 03d: goto 086
      // 040: astore 3
      // 041: aload 3
      // 042: invokevirtual java/io/IOException.printStackTrace ()V
      // 045: goto 086
      // 048: astore 3
      // 049: aload 3
      // 04a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 04d: iload 1
      // 04e: ifne 0f3
      // 051: aload 2
      // 052: ifnull 086
      // 055: aload 2
      // 056: invokevirtual java/io/BufferedReader.close ()V
      // 059: goto 086
      // 05c: astore 3
      // 05d: aload 3
      // 05e: invokevirtual java/io/IOException.printStackTrace ()V
      // 061: goto 086
      // 064: astore 4
      // 066: aload 2
      // 067: iload 1
      // 068: ifne 076
      // 06b: ifnull 083
      // 06e: goto 075
      // 071: invokestatic com/finalshell/task/Ky4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 074: athrow
      // 075: aload 2
      // 076: invokevirtual java/io/BufferedReader.close ()V
      // 079: goto 083
      // 07c: astore 5
      // 07e: aload 5
      // 080: invokevirtual java/io/IOException.printStackTrace ()V
      // 083: aload 4
      // 085: athrow
      // 086: aload 0
      // 087: ldc2_w 324752085636403853
      // 08a: astore 8
      // 08c: ldc2_w 324752085636403853
      // 08f: aload 8
      // 091: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 094: ldc2_w 369360735988696977
      // 097: astore 10
      // 099: ldc2_w 369360735988696977
      // 09c: aload 10
      // 09e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a1: aload 0
      // 0a2: ldc2_w 324752085636403853
      // 0a5: astore 12
      // 0a7: ldc2_w 324752085636403853
      // 0aa: aload 12
      // 0ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0af: ldc2_w 466244736603743442
      // 0b2: astore 14
      // 0b4: ldc2_w 466244736603743442
      // 0b7: aload 14
      // 0b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0bf: ldc2_w 191716730601734423
      // 0c2: astore 17
      // 0c4: astore 16
      // 0c6: ldc2_w 191716730601734423
      // 0c9: aload 16
      // 0cb: aload 17
      // 0cd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d0: goto 0d7
      // 0d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0da: ldc2_w 596624758422184723
      // 0dd: astore 19
      // 0df: astore 18
      // 0e1: ldc2_w 596624758422184723
      // 0e4: aload 18
      // 0e6: aload 19
      // 0e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0eb: pop
      // 0ec: goto 0f3
      // 0ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: goto 0fb
      // 0f6: astore 3
      // 0f7: aload 3
      // 0f8: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0fb: aload 0
      // 0fc: ldc2_w 324752085636403853
      // 0ff: astore 20
      // 101: ldc2_w 324752085636403853
      // 104: aload 20
      // 106: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 109: ldc2_w 605310980757093367
      // 10c: astore 22
      // 10e: ldc2_w 605310980757093367
      // 111: aload 22
      // 113: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 116: ldc2_w 617203282718759544
      // 119: astore 24
      // 11b: ldc2_w 617203282718759544
      // 11e: aload 24
      // 120: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 123: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 126: ldc2_w 553191921490783868
      // 129: astore 27
      // 12b: astore 26
      // 12d: ldc2_w 553191921490783868
      // 130: aload 26
      // 132: aload 27
      // 134: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 137: pop
      // 138: goto 13f
      // 13b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2293401380359536478L;
      long var10002 = 2293401380359536442L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





