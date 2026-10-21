package com.finalshell.core;

import java.io.File;
import java.util.Iterator;

public class Z3_3 {
   public final Iterator w;
   public final Iterator Y;
   public final W3_5 M;

   public Z3_3(W3_5 param1, File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield com/finalshell/core/Z3_3.M Lcom/finalshell/core/W3_5;
      // 005: invokestatic com/finalshell/core/F3_3.s ()Z
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: aload 2
      // 00d: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 010: astore 4
      // 012: istore 3
      // 013: aload 4
      // 015: ifnonnull 028
      // 018: new com/finalshell/core/A2_5
      // 01b: dup
      // 01c: aload 2
      // 01d: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 020: invokespecial com/finalshell/core/A2_5.<init> (Ljava/lang/String;)V
      // 023: athrow
      // 024: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 027: athrow
      // 028: new java/util/ArrayList
      // 02b: dup
      // 02c: invokespecial java/util/ArrayList.<init> ()V
      // 02f: astore 5
      // 031: new java/util/ArrayList
      // 034: dup
      // 035: invokespecial java/util/ArrayList.<init> ()V
      // 038: astore 6
      // 03a: aload 4
      // 03c: astore 7
      // 03e: aload 7
      // 040: arraylength
      // 041: istore 8
      // 043: bipush 0
      // 044: istore 9
      // 046: iload 9
      // 048: iload 8
      // 04a: if_icmpge 108
      // 04d: aload 7
      // 04f: iload 9
      // 051: aaload
      // 052: astore 10
      // 054: iload 3
      // 055: ifeq 11e
      // 058: aload 10
      // 05a: invokevirtual java/io/File.isDirectory ()Z
      // 05d: iload 3
      // 05e: ifeq 0be
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 067: athrow
      // 068: ifeq 0b9
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 071: athrow
      // 072: aload 1
      // 073: getfield com/finalshell/core/W3_5.h Ljava/io/FilenameFilter;
      // 076: aload 2
      // 077: aload 10
      // 079: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 07c: invokeinterface java/io/FilenameFilter.accept (Ljava/io/File;Ljava/lang/String;)Z 3
      // 081: iload 3
      // 082: ifeq 0a6
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 08b: athrow
      // 08c: ifeq 101
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 095: athrow
      // 096: aload 5
      // 098: aload 10
      // 09a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0a5: athrow
      // 0a6: pop
      // 0a7: iload 3
      // 0a8: ifne 101
      // 0ab: bipush 1
      // 0ac: anewarray 71
      // 0af: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0b8: athrow
      // 0b9: aload 10
      // 0bb: invokevirtual java/io/File.isFile ()Z
      // 0be: iload 3
      // 0bf: ifeq 0e2
      // 0c2: ifeq 101
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: getfield com/finalshell/core/W3_5.c Ljava/io/FilenameFilter;
      // 0d0: aload 2
      // 0d1: aload 10
      // 0d3: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 0d6: invokeinterface java/io/FilenameFilter.accept (Ljava/io/File;Ljava/lang/String;)Z 3
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0e1: athrow
      // 0e2: iload 3
      // 0e3: ifeq 100
      // 0e6: ifeq 101
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0ef: athrow
      // 0f0: aload 6
      // 0f2: aload 10
      // 0f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Z3_3.a (Lcom/finalshell/core/A2_5;)Lcom/finalshell/core/A2_5;
      // 0ff: athrow
      // 100: pop
      // 101: iinc 9 1
      // 104: iload 3
      // 105: ifne 046
      // 108: aload 0
      // 109: aload 5
      // 10b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 110: putfield com/finalshell/core/Z3_3.w Ljava/util/Iterator;
      // 113: aload 0
      // 114: aload 6
      // 116: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11b: putfield com/finalshell/core/Z3_3.Y Ljava/util/Iterator;
      // 11e: return
   }

   public static A2_5 a(A2_5 var0) {
      return var0;
   }
}





