package com.finalshell.core;

import java.io.CharArrayReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;

public final class U7 extends U9 {
   public static ThreadLocal w;
   public Reader r;
   public char[] m;
   public int Q;
   public static String[] f;
   public static String[] g;
   public static long[] k;
   public static Integer[] o;

   public U7(String var1) {
      this(var1, Ok2.h);
   }

   public U7(String var1, int var2) {
      this(new StringReader(var1), var2);
   }

   public U7(char[] var1, int var2) {
      this(var1, var2, Ok2.h);
   }

   public U7(Reader var1) {
      this(var1, Ok2.h);
   }

   public U7(Reader param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 2
      // 02: invokespecial com/finalshell/core/U9.<init> (I)V
      // 05: invokestatic com/finalshell/core/Yn4.o ()Z
      // 08: aload 0
      // 09: aload 1
      // 0a: putfield com/finalshell/core/U7.r Ljava/io/Reader;
      // 0d: istore 3
      // 0e: aload 0
      // 0f: getstatic com/finalshell/core/U7.w Ljava/lang/ThreadLocal;
      // 12: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 15: checkcast [C
      // 18: putfield com/finalshell/core/U7.m [C
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/U7.m [C
      // 1f: iload 3
      // 20: ifne 4a
      // 23: ifnull 3b
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: getstatic com/finalshell/core/U7.w Ljava/lang/ThreadLocal;
      // 30: aconst_null
      // 31: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: iload 3
      // 3d: ifne 64
      // 40: getfield com/finalshell/core/U7.m [C
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: ifnonnull 63
      // 4d: aload 0
      // 4e: sipush 22853
      // 51: ldc2_w 5147085739708625868
      // 54: invokestatic com/finalshell/core/U7.b (IJ)I
      // 57: newarray 5
      // 59: putfield com/finalshell/core/U7.m [C
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 0
      // 64: aload 1
      // 65: aload 0
      // 66: getfield com/finalshell/core/U7.m [C
      // 69: invokevirtual java/io/Reader.read ([C)I
      // 6c: putfield com/finalshell/core/U7.Q I
      // 6f: goto 83
      // 72: astore 4
      // 74: new com/finalshell/core/Hi2
      // 77: dup
      // 78: aload 4
      // 7a: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 7d: aload 4
      // 7f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 82: athrow
      // 83: aload 0
      // 84: bipush -1
      // 85: putfield com/finalshell/core/U7.d I
      // 88: aload 0
      // 89: invokevirtual com/finalshell/core/U7.C$char ()C
      // 8c: pop
      // 8d: aload 0
      // 8e: getfield com/finalshell/core/U7.l C
      // 91: iload 3
      // 92: ifne b3
      // 95: sipush 29757
      // 98: ldc2_w 2093695566083923635
      // 9b: invokestatic com/finalshell/core/U7.b (IJ)I
      // 9e: if_icmpne b4
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: aload 0
      // a9: invokevirtual com/finalshell/core/U7.C$char ()C
      // ac: goto b3
      // af: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: pop
      // b4: return
   }

   public U7(char[] var1, int var2, int var3) {
      this(new CharArrayReader(var1, 0, var2), var3);
   }

   @Override
   public final char C(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: istore 2
      // 004: iload 1
      // 005: iload 2
      // 006: ifeq 1a4
      // 009: aload 0
      // 00a: getfield com/finalshell/core/U7.Q I
      // 00d: if_icmplt 19e
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield com/finalshell/core/U7.Q I
      // 01b: iload 2
      // 01c: ifeq 064
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush -1
      // 027: if_icmpne 060
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: iload 1
      // 032: iload 2
      // 033: ifeq 05f
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/U7.e I
      // 041: if_icmpge 056
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield com/finalshell/core/U7.m [C
      // 04f: iload 1
      // 050: caload
      // 051: ireturn
      // 052: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: sipush 15669
      // 059: ldc2_w 2896399328214996914
      // 05c: invokestatic com/finalshell/core/U7.b (IJ)I
      // 05f: ireturn
      // 060: aload 0
      // 061: getfield com/finalshell/core/U7.d I
      // 064: iload 2
      // 065: ifeq 0e0
      // 068: ifne 0d0
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/finalshell/core/U7.m [C
      // 076: arraylength
      // 077: bipush 3
      // 078: imul
      // 079: bipush 2
      // 07a: idiv
      // 07b: newarray 5
      // 07d: astore 3
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/U7.m [C
      // 082: aload 0
      // 083: getfield com/finalshell/core/U7.d I
      // 086: aload 3
      // 087: bipush 0
      // 088: aload 0
      // 089: getfield com/finalshell/core/U7.Q I
      // 08c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 08f: aload 3
      // 090: arraylength
      // 091: aload 0
      // 092: getfield com/finalshell/core/U7.Q I
      // 095: isub
      // 096: istore 4
      // 098: aload 0
      // 099: getfield com/finalshell/core/U7.r Ljava/io/Reader;
      // 09c: aload 3
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/U7.Q I
      // 0a1: iload 4
      // 0a3: invokevirtual java/io/Reader.read ([CII)I
      // 0a6: istore 5
      // 0a8: aload 0
      // 0a9: dup
      // 0aa: getfield com/finalshell/core/U7.Q I
      // 0ad: iload 5
      // 0af: iadd
      // 0b0: putfield com/finalshell/core/U7.Q I
      // 0b3: aload 0
      // 0b4: aload 3
      // 0b5: putfield com/finalshell/core/U7.m [C
      // 0b8: goto 0cc
      // 0bb: astore 5
      // 0bd: new com/finalshell/core/Hi2
      // 0c0: dup
      // 0c1: aload 5
      // 0c3: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 0c6: aload 5
      // 0c8: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0cb: athrow
      // 0cc: iload 2
      // 0cd: ifne 19e
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/core/U7.Q I
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/U7.d I
      // 0d8: isub
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: istore 3
      // 0e1: iload 2
      // 0e2: ifeq 11f
      // 0e5: iload 3
      // 0e6: ifle 108
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield com/finalshell/core/U7.m [C
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/core/U7.d I
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/U7.m [C
      // 0fc: bipush 0
      // 0fd: iload 3
      // 0fe: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: aload 0
      // 10a: getfield com/finalshell/core/U7.r Ljava/io/Reader;
      // 10d: aload 0
      // 10e: getfield com/finalshell/core/U7.m [C
      // 111: iload 3
      // 112: aload 0
      // 113: getfield com/finalshell/core/U7.m [C
      // 116: arraylength
      // 117: iload 3
      // 118: isub
      // 119: invokevirtual java/io/Reader.read ([CII)I
      // 11c: putfield com/finalshell/core/U7.Q I
      // 11f: goto 133
      // 122: astore 4
      // 124: new com/finalshell/core/Hi2
      // 127: dup
      // 128: aload 4
      // 12a: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 12d: aload 4
      // 12f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 132: athrow
      // 133: aload 0
      // 134: getfield com/finalshell/core/U7.Q I
      // 137: iload 2
      // 138: ifeq 15e
      // 13b: ifne 15a
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: new com/finalshell/core/Hi2
      // 148: dup
      // 149: sipush 31639
      // 14c: sipush -15977
      // 14f: invokestatic com/finalshell/core/U7.b (II)Ljava/lang/String;
      // 152: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 155: athrow
      // 156: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 0
      // 15b: getfield com/finalshell/core/U7.Q I
      // 15e: bipush -1
      // 15f: iload 2
      // 160: ifeq 18a
      // 163: if_icmpne 17b
      // 166: goto 16d
      // 169: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: sipush 15669
      // 170: ldc2_w 2896399328214996914
      // 173: invokestatic com/finalshell/core/U7.b (IJ)I
      // 176: ireturn
      // 177: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: aload 0
      // 17c: dup
      // 17d: getfield com/finalshell/core/U7.Q I
      // 180: iload 3
      // 181: iadd
      // 182: putfield com/finalshell/core/U7.Q I
      // 185: iload 1
      // 186: aload 0
      // 187: getfield com/finalshell/core/U7.d I
      // 18a: isub
      // 18b: istore 1
      // 18c: aload 0
      // 18d: dup
      // 18e: getfield com/finalshell/core/U7.S I
      // 191: aload 0
      // 192: getfield com/finalshell/core/U7.d I
      // 195: isub
      // 196: putfield com/finalshell/core/U7.S I
      // 199: aload 0
      // 19a: bipush 0
      // 19b: putfield com/finalshell/core/U7.d I
      // 19e: aload 0
      // 19f: getfield com/finalshell/core/U7.m [C
      // 1a2: iload 1
      // 1a3: caload
      // 1a4: ireturn
   }

   @Override
   public final int d(char param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: iload 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/U7.d I
      // 08: isub
      // 09: istore 4
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/U7.d I
      // 10: iload 4
      // 12: iadd
      // 13: istore 5
      // 15: aload 0
      // 16: iload 5
      // 18: invokevirtual com/finalshell/core/U7.C (I)C
      // 1b: istore 6
      // 1d: iload 1
      // 1e: iload 6
      // 20: if_icmpne 3a
      // 23: iload 4
      // 25: aload 0
      // 26: getfield com/finalshell/core/U7.d I
      // 29: iadd
      // 2a: iload 3
      // 2b: ifeq 3c
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: ireturn
      // 36: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: iload 6
      // 3c: iload 3
      // 3d: ifeq 5b
      // 40: sipush 15669
      // 43: ldc2_w 2896399328214996914
      // 46: invokestatic com/finalshell/core/U7.b (IJ)I
      // 49: if_icmpne 5c
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: bipush -1
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: ireturn
      // 5c: iinc 4 1
      // 5f: goto 0c
   }

   @Override
   public final String e(int var1, int var2, int var3, O12 var4) {
      return var4.n(this.m, var1, var2, var3);
   }

   @Override
   public final char C$char() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: dup
      // 005: getfield com/finalshell/core/U7.d I
      // 008: bipush 1
      // 009: iadd
      // 00a: dup_x1
      // 00b: putfield com/finalshell/core/U7.d I
      // 00e: istore 2
      // 00f: istore 1
      // 010: iload 2
      // 011: iload 1
      // 012: ifeq 18a
      // 015: aload 0
      // 016: getfield com/finalshell/core/U7.Q I
      // 019: if_icmplt 17f
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 0
      // 024: getfield com/finalshell/core/U7.Q I
      // 027: iload 1
      // 028: ifeq 04f
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: bipush -1
      // 033: if_icmpne 04b
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: sipush 15669
      // 040: ldc2_w 2896399328214996914
      // 043: invokestatic com/finalshell/core/U7.b (IJ)I
      // 046: ireturn
      // 047: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield com/finalshell/core/U7.e I
      // 04f: iload 1
      // 050: ifeq 0bb
      // 053: ifle 0a8
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield com/finalshell/core/U7.Q I
      // 061: aload 0
      // 062: getfield com/finalshell/core/U7.e I
      // 065: isub
      // 066: istore 3
      // 067: aload 0
      // 068: iload 1
      // 069: ifeq 098
      // 06c: getfield com/finalshell/core/U7.l C
      // 06f: sipush 26594
      // 072: ldc2_w 2219415280460008803
      // 075: invokestatic com/finalshell/core/U7.b (IJ)I
      // 078: if_icmpne 097
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: iload 3
      // 083: ifle 097
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: iinc 3 -1
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: getfield com/finalshell/core/U7.m [C
      // 09b: iload 3
      // 09c: aload 0
      // 09d: getfield com/finalshell/core/U7.m [C
      // 0a0: bipush 0
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/U7.e I
      // 0a5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a8: aload 0
      // 0a9: bipush -1
      // 0aa: putfield com/finalshell/core/U7.S I
      // 0ad: aload 0
      // 0ae: aload 0
      // 0af: getfield com/finalshell/core/U7.e I
      // 0b2: dup_x1
      // 0b3: putfield com/finalshell/core/U7.d I
      // 0b6: istore 2
      // 0b7: aload 0
      // 0b8: getfield com/finalshell/core/U7.d I
      // 0bb: istore 3
      // 0bc: aload 0
      // 0bd: getfield com/finalshell/core/U7.m [C
      // 0c0: arraylength
      // 0c1: iload 3
      // 0c2: isub
      // 0c3: istore 4
      // 0c5: iload 1
      // 0c6: ifeq 114
      // 0c9: iload 4
      // 0cb: ifne 0ff
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield com/finalshell/core/U7.m [C
      // 0d9: arraylength
      // 0da: bipush 2
      // 0db: imul
      // 0dc: newarray 5
      // 0de: astore 5
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/core/U7.m [C
      // 0e4: bipush 0
      // 0e5: aload 5
      // 0e7: bipush 0
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/core/U7.m [C
      // 0ec: arraylength
      // 0ed: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f0: aload 0
      // 0f1: aload 5
      // 0f3: putfield com/finalshell/core/U7.m [C
      // 0f6: aload 0
      // 0f7: getfield com/finalshell/core/U7.m [C
      // 0fa: arraylength
      // 0fb: iload 3
      // 0fc: isub
      // 0fd: istore 4
      // 0ff: aload 0
      // 100: aload 0
      // 101: getfield com/finalshell/core/U7.r Ljava/io/Reader;
      // 104: aload 0
      // 105: getfield com/finalshell/core/U7.m [C
      // 108: aload 0
      // 109: getfield com/finalshell/core/U7.d I
      // 10c: iload 4
      // 10e: invokevirtual java/io/Reader.read ([CII)I
      // 111: putfield com/finalshell/core/U7.Q I
      // 114: goto 125
      // 117: astore 3
      // 118: new com/finalshell/core/Hi2
      // 11b: dup
      // 11c: aload 3
      // 11d: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 120: aload 3
      // 121: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 124: athrow
      // 125: aload 0
      // 126: getfield com/finalshell/core/U7.Q I
      // 129: iload 1
      // 12a: ifeq 15b
      // 12d: ifne 14c
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: new com/finalshell/core/Hi2
      // 13a: dup
      // 13b: sipush 31638
      // 13e: sipush 19609
      // 141: invokestatic com/finalshell/core/U7.b (II)Ljava/lang/String;
      // 144: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 147: athrow
      // 148: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 0
      // 14d: iload 1
      // 14e: ifeq 173
      // 151: getfield com/finalshell/core/U7.Q I
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: bipush -1
      // 15c: if_icmpne 172
      // 15f: aload 0
      // 160: sipush 15669
      // 163: ldc2_w 2896399328214996914
      // 166: invokestatic com/finalshell/core/U7.b (IJ)I
      // 169: dup_x1
      // 16a: putfield com/finalshell/core/U7.l C
      // 16d: ireturn
      // 16e: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 0
      // 173: dup
      // 174: getfield com/finalshell/core/U7.Q I
      // 177: aload 0
      // 178: getfield com/finalshell/core/U7.d I
      // 17b: iadd
      // 17c: putfield com/finalshell/core/U7.Q I
      // 17f: aload 0
      // 180: aload 0
      // 181: getfield com/finalshell/core/U7.m [C
      // 184: iload 2
      // 185: caload
      // 186: dup_x1
      // 187: putfield com/finalshell/core/U7.l C
      // 18a: ireturn
   }

   @Override
   public final void l(int var1, int var2, char[] var3) {
      System.arraycopy(this.m, var1, var3, 0, var2);
   }

   @Override
   public final boolean P$boolean(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: iload 3
      // 07: aload 1
      // 08: arraylength
      // 09: if_icmpge 42
      // 0c: aload 0
      // 0d: aload 0
      // 0e: getfield com/finalshell/core/U7.d I
      // 11: iload 3
      // 12: iadd
      // 13: invokevirtual com/finalshell/core/U7.C (I)C
      // 16: iload 2
      // 17: ifeq 43
      // 1a: iload 2
      // 1b: ifeq 3a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: iload 3
      // 27: caload
      // 28: if_icmpeq 3b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 0
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: ireturn
      // 3b: iinc 3 1
      // 3e: iload 2
      // 3f: ifne 06
      // 42: bipush 1
      // 43: ireturn
   }

   @Override
   public byte[] e() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: getfield com/finalshell/core/U7.Y I
      // 0c: sipush 22933
      // 0f: ldc2_w 3031693160495461151
      // 12: invokestatic com/finalshell/core/U7.b (IJ)I
      // 15: if_icmpne 34
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: new com/finalshell/core/Hi2
      // 22: dup
      // 23: sipush 31636
      // 26: sipush -23037
      // 29: invokestatic com/finalshell/core/U7.b (II)Ljava/lang/String;
      // 2c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2f: athrow
      // 30: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/core/U7.m [C
      // 38: aload 0
      // 39: getfield com/finalshell/core/U7.S I
      // 3c: bipush 1
      // 3d: iadd
      // 3e: aload 0
      // 3f: getfield com/finalshell/core/U7.e I
      // 42: invokestatic com/finalshell/core/S7.U ([CII)[B
      // 45: areturn
   }

   @Override
   public final void w(int var1, char[] var2, int var3, int var4) {
      System.arraycopy(this.m, var1, var2, var3, var4);
   }

   @Override
   public final String z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/U7.L Z
      // 08: iload 1
      // 09: ifne 23
      // 0c: ifne 6a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/U7.S I
      // 1a: bipush 1
      // 1b: iadd
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: istore 2
      // 24: iload 2
      // 25: iload 1
      // 26: ifne 40
      // 29: ifge 3f
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: new java/lang/IllegalStateException
      // 36: dup
      // 37: invokespecial java/lang/IllegalStateException.<init> ()V
      // 3a: athrow
      // 3b: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: iload 2
      // 40: aload 0
      // 41: getfield com/finalshell/core/U7.m [C
      // 44: arraylength
      // 45: aload 0
      // 46: getfield com/finalshell/core/U7.e I
      // 49: isub
      // 4a: if_icmple 59
      // 4d: new java/lang/IllegalStateException
      // 50: dup
      // 51: invokespecial java/lang/IllegalStateException.<init> ()V
      // 54: athrow
      // 55: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: new java/lang/String
      // 5c: dup
      // 5d: aload 0
      // 5e: getfield com/finalshell/core/U7.m [C
      // 61: iload 2
      // 62: aload 0
      // 63: getfield com/finalshell/core/U7.e I
      // 66: invokespecial java/lang/String.<init> ([CII)V
      // 69: areturn
      // 6a: new java/lang/String
      // 6d: dup
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/U7.V [C
      // 72: bipush 0
      // 73: aload 0
      // 74: getfield com/finalshell/core/U7.e I
      // 77: invokespecial java/lang/String.<init> ([CII)V
      // 7a: areturn
   }

   @Override
   public final String R(int var1, int var2) {
      try {
         if (var2 < 0) {
            throw new StringIndexOutOfBoundsException(var2);
         }
      } catch (Hi2 var3) {
         throw b(var3);
      }

      return new String(this.m, var1, var2);
   }

   @Override
   public final char[] s(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 21
      // 09: ifge 20
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/StringIndexOutOfBoundsException
      // 16: dup
      // 17: iload 2
      // 18: invokespecial java/lang/StringIndexOutOfBoundsException.<init> (I)V
      // 1b: athrow
      // 1c: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: iload 1
      // 21: iload 3
      // 22: ifne 39
      // 25: ifne 38
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/U7.m [C
      // 33: areturn
      // 34: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: iload 2
      // 39: newarray 5
      // 3b: astore 4
      // 3d: aload 0
      // 3e: getfield com/finalshell/core/U7.m [C
      // 41: iload 1
      // 42: aload 4
      // 44: bipush 0
      // 45: iload 2
      // 46: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 49: aload 4
      // 4b: areturn
   }

   @Override
   public final String c$String() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/U7.S I
      // 07: istore 2
      // 08: istore 1
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifne 27
      // 0e: bipush -1
      // 0f: if_icmpne 1b
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: istore 2
      // 1b: aload 0
      // 1c: iload 2
      // 1d: aload 0
      // 1e: getfield com/finalshell/core/U7.e I
      // 21: iadd
      // 22: bipush 1
      // 23: isub
      // 24: invokevirtual com/finalshell/core/U7.C (I)C
      // 27: istore 3
      // 28: aload 0
      // 29: getfield com/finalshell/core/U7.e I
      // 2c: istore 4
      // 2e: iload 3
      // 2f: sipush 13184
      // 32: ldc2_w 6574460218966104320
      // 35: invokestatic com/finalshell/core/U7.b (IJ)I
      // 38: iload 1
      // 39: ifne 57
      // 3c: if_icmpeq b7
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: iload 3
      // 47: sipush 20570
      // 4a: ldc2_w 3883114863963454149
      // 4d: invokestatic com/finalshell/core/U7.b (IJ)I
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: iload 1
      // 58: ifne 76
      // 5b: if_icmpeq b7
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: iload 3
      // 66: sipush 4376
      // 69: ldc2_w 2012832365130480539
      // 6c: invokestatic com/finalshell/core/U7.b (IJ)I
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: iload 1
      // 77: ifne 95
      // 7a: if_icmpeq b7
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: iload 3
      // 85: sipush 26750
      // 88: ldc2_w 8301644516542415611
      // 8b: invokestatic com/finalshell/core/U7.b (IJ)I
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: iload 1
      // 96: ifne b4
      // 99: if_icmpeq b7
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: iload 3
      // a4: sipush 20094
      // a7: ldc2_w 4991264910050600177
      // aa: invokestatic com/finalshell/core/U7.b (IJ)I
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3: athrow
      // b4: if_icmpne ba
      // b7: iinc 4 -1
      // ba: new java/lang/String
      // bd: dup
      // be: aload 0
      // bf: getfield com/finalshell/core/U7.m [C
      // c2: iload 2
      // c3: iload 4
      // c5: invokespecial java/lang/String.<init> ([CII)V
      // c8: astore 5
      // ca: aload 5
      // cc: areturn
   }

   @Override
   public final BigDecimal c$BigDecimal() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/U7.S I
      // 07: istore 2
      // 08: istore 1
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifeq 27
      // 0e: bipush -1
      // 0f: if_icmpne 1b
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: istore 2
      // 1b: aload 0
      // 1c: iload 2
      // 1d: aload 0
      // 1e: getfield com/finalshell/core/U7.e I
      // 21: iadd
      // 22: bipush 1
      // 23: isub
      // 24: invokevirtual com/finalshell/core/U7.C (I)C
      // 27: istore 3
      // 28: aload 0
      // 29: getfield com/finalshell/core/U7.e I
      // 2c: istore 4
      // 2e: iload 3
      // 2f: sipush 16147
      // 32: ldc2_w 9145189710988301723
      // 35: invokestatic com/finalshell/core/U7.b (IJ)I
      // 38: iload 1
      // 39: ifeq 57
      // 3c: if_icmpeq c2
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: iload 3
      // 47: sipush 29422
      // 4a: ldc2_w 2135190967384381548
      // 4d: invokestatic com/finalshell/core/U7.b (IJ)I
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: iload 1
      // 58: ifeq 76
      // 5b: if_icmpeq c2
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: iload 3
      // 66: sipush 11201
      // 69: ldc2_w 732836544553435468
      // 6c: invokestatic com/finalshell/core/U7.b (IJ)I
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: iload 1
      // 77: ifeq 95
      // 7a: if_icmpeq c2
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: iload 3
      // 85: sipush 21038
      // 88: ldc2_w 8407480765995923618
      // 8b: invokestatic com/finalshell/core/U7.b (IJ)I
      // 8e: goto 95
      // 91: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: iload 1
      // 96: ifeq b4
      // 99: if_icmpeq c2
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: iload 3
      // a4: sipush 30468
      // a7: ldc2_w 2657723547539348890
      // aa: invokestatic com/finalshell/core/U7.b (IJ)I
      // ad: goto b4
      // b0: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b3: athrow
      // b4: iload 1
      // b5: ifeq d0
      // b8: if_icmpne c5
      // bb: goto c2
      // be: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1: athrow
      // c2: iinc 4 -1
      // c5: iload 4
      // c7: sipush 7062
      // ca: ldc2_w 4438276088353452317
      // cd: invokestatic com/finalshell/core/U7.b (IJ)I
      // d0: if_icmple e8
      // d3: new com/finalshell/core/Hi2
      // d6: dup
      // d7: sipush 31637
      // da: sipush -3912
      // dd: invokestatic com/finalshell/core/U7.b (II)Ljava/lang/String;
      // e0: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // e3: athrow
      // e4: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e7: athrow
      // e8: new java/math/BigDecimal
      // eb: dup
      // ec: aload 0
      // ed: getfield com/finalshell/core/U7.m [C
      // f0: iload 2
      // f1: iload 4
      // f3: getstatic java/math/MathContext.UNLIMITED Ljava/math/MathContext;
      // f6: invokespecial java/math/BigDecimal.<init> ([CIILjava/math/MathContext;)V
      // f9: areturn
   }

   @Override
   public void close() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/U9.close ()V
      // 07: istore 1
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 3b
      // 0d: getfield com/finalshell/core/U7.m [C
      // 10: arraylength
      // 11: sipush 30669
      // 14: ldc2_w 5605827137821809993
      // 17: invokestatic com/finalshell/core/U7.b (IJ)I
      // 1a: if_icmpgt 35
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: getstatic com/finalshell/core/U7.w Ljava/lang/ThreadLocal;
      // 27: aload 0
      // 28: getfield com/finalshell/core/U7.m [C
      // 2b: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: aconst_null
      // 37: putfield com/finalshell/core/U7.m [C
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/U7.r Ljava/io/Reader;
      // 3e: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 41: return
   }

   @Override
   public boolean A$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/U7.Q I
      // 08: iload 1
      // 09: ifne 78
      // 0c: bipush -1
      // 0d: if_icmpeq 77
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getfield com/finalshell/core/U7.d I
      // 1b: iload 1
      // 1c: ifne 78
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: getfield com/finalshell/core/U7.m [C
      // 2a: arraylength
      // 2b: if_icmpeq 77
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/core/U7.l C
      // 39: sipush 15669
      // 3c: ldc2_w 2896399328214996914
      // 3f: invokestatic com/finalshell/core/U7.b (IJ)I
      // 42: iload 1
      // 43: ifne 74
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: if_icmpne 7b
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/finalshell/core/U7.d I
      // 5b: bipush 1
      // 5c: iadd
      // 5d: iload 1
      // 5e: ifne 78
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: aload 0
      // 69: getfield com/finalshell/core/U7.m [C
      // 6c: arraylength
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: if_icmplt 7b
      // 77: bipush 1
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: ireturn
   }

   @Override
   public final boolean k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: aload 0
      // 07: getfield com/finalshell/core/U7.m [C
      // 0a: iload 2
      // 0b: caload
      // 0c: istore 3
      // 0d: iload 3
      // 0e: sipush 15669
      // 11: ldc2_w 2896399328214996914
      // 14: invokestatic com/finalshell/core/U7.b (IJ)I
      // 17: if_icmpne 36
      // 1a: aload 0
      // 1b: sipush 12224
      // 1e: ldc2_w 5941096270837695814
      // 21: invokestatic com/finalshell/core/U7.b (IJ)I
      // 24: putfield com/finalshell/core/U7.Y I
      // 27: iload 1
      // 28: ifeq 54
      // 2b: iload 1
      // 2c: ifne 58
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: iload 3
      // 37: invokestatic com/finalshell/core/U7.Y (C)Z
      // 3a: iload 1
      // 3b: ifeq 50
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: ifne 51
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/U7.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
      // 51: iinc 2 1
      // 54: iload 1
      // 55: ifne 06
      // 58: bipush 1
      // 59: ireturn
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 31636) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 79;
               break;
            case 1:
               var10000 = 169;
               break;
            case 2:
               var10000 = 20;
               break;
            case 3:
               var10000 = 48;
               break;
            case 4:
               var10000 = 215;
               break;
            case 5:
               var10000 = 51;
               break;
            case 6:
               var10000 = 87;
               break;
            case 7:
               var10000 = 55;
               break;
            case 8:
               var10000 = 147;
               break;
            case 9:
               var10000 = 248;
               break;
            case 10:
               var10000 = 15;
               break;
            case 11:
               var10000 = 75;
               break;
            case 12:
               var10000 = 240;
               break;
            case 13:
               var10000 = 44;
               break;
            case 14:
               var10000 = 59;
               break;
            case 15:
               var10000 = 174;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 123;
               break;
            case 18:
               var10000 = 185;
               break;
            case 19:
               var10000 = 6;
               break;
            case 20:
               var10000 = 78;
               break;
            case 21:
               var10000 = 89;
               break;
            case 22:
               var10000 = 223;
               break;
            case 23:
               var10000 = 253;
               break;
            case 24:
               var10000 = 38;
               break;
            case 25:
               var10000 = 95;
               break;
            case 26:
               var10000 = 88;
               break;
            case 27:
               var10000 = 142;
               break;
            case 28:
               var10000 = 211;
               break;
            case 29:
               var10000 = 108;
               break;
            case 30:
               var10000 = 254;
               break;
            case 31:
               var10000 = 255;
               break;
            case 32:
               var10000 = 241;
               break;
            case 33:
               var10000 = 54;
               break;
            case 34:
               var10000 = 102;
               break;
            case 35:
               var10000 = 122;
               break;
            case 36:
               var10000 = 53;
               break;
            case 37:
               var10000 = 193;
               break;
            case 38:
               var10000 = 74;
               break;
            case 39:
               var10000 = 32;
               break;
            case 40:
               var10000 = 187;
               break;
            case 41:
               var10000 = 68;
               break;
            case 42:
               var10000 = 180;
               break;
            case 43:
               var10000 = 7;
               break;
            case 44:
               var10000 = 132;
               break;
            case 45:
               var10000 = 86;
               break;
            case 46:
               var10000 = 46;
               break;
            case 47:
               var10000 = 62;
               break;
            case 48:
               var10000 = 30;
               break;
            case 49:
               var10000 = 91;
               break;
            case 50:
               var10000 = 160;
               break;
            case 51:
               var10000 = 229;
               break;
            case 52:
               var10000 = 76;
               break;
            case 53:
               var10000 = 200;
               break;
            case 54:
               var10000 = 161;
               break;
            case 55:
               var10000 = 195;
               break;
            case 56:
               var10000 = 67;
               break;
            case 57:
               var10000 = 24;
               break;
            case 58:
               var10000 = 45;
               break;
            case 59:
               var10000 = 238;
               break;
            case 60:
               var10000 = 149;
               break;
            case 61:
               var10000 = 99;
               break;
            case 62:
               var10000 = 121;
               break;
            case 63:
               var10000 = 100;
               break;
            case 64:
               var10000 = 227;
               break;
            case 65:
               var10000 = 194;
               break;
            case 66:
               var10000 = 228;
               break;
            case 67:
               var10000 = 139;
               break;
            case 68:
               var10000 = 162;
               break;
            case 69:
               var10000 = 2;
               break;
            case 70:
               var10000 = 93;
               break;
            case 71:
               var10000 = 130;
               break;
            case 72:
               var10000 = 231;
               break;
            case 73:
               var10000 = 73;
               break;
            case 74:
               var10000 = 5;
               break;
            case 75:
               var10000 = 208;
               break;
            case 76:
               var10000 = 154;
               break;
            case 77:
               var10000 = 192;
               break;
            case 78:
               var10000 = 205;
               break;
            case 79:
               var10000 = 214;
               break;
            case 80:
               var10000 = 197;
               break;
            case 81:
               var10000 = 242;
               break;
            case 82:
               var10000 = 39;
               break;
            case 83:
               var10000 = 144;
               break;
            case 84:
               var10000 = 136;
               break;
            case 85:
               var10000 = 189;
               break;
            case 86:
               var10000 = 31;
               break;
            case 87:
               var10000 = 11;
               break;
            case 88:
               var10000 = 69;
               break;
            case 89:
               var10000 = 198;
               break;
            case 90:
               var10000 = 252;
               break;
            case 91:
               var10000 = 222;
               break;
            case 92:
               var10000 = 126;
               break;
            case 93:
               var10000 = 177;
               break;
            case 94:
               var10000 = 183;
               break;
            case 95:
               var10000 = 66;
               break;
            case 96:
               var10000 = 71;
               break;
            case 97:
               var10000 = 237;
               break;
            case 98:
               var10000 = 17;
               break;
            case 99:
               var10000 = 133;
               break;
            case 100:
               var10000 = 151;
               break;
            case 101:
               var10000 = 22;
               break;
            case 102:
               var10000 = 202;
               break;
            case 103:
               var10000 = 34;
               break;
            case 104:
               var10000 = 56;
               break;
            case 105:
               var10000 = 220;
               break;
            case 106:
               var10000 = 36;
               break;
            case 107:
               var10000 = 81;
               break;
            case 108:
               var10000 = 57;
               break;
            case 109:
               var10000 = 1;
               break;
            case 110:
               var10000 = 186;
               break;
            case 111:
               var10000 = 25;
               break;
            case 112:
               var10000 = 204;
               break;
            case 113:
               var10000 = 70;
               break;
            case 114:
               var10000 = 43;
               break;
            case 115:
               var10000 = 129;
               break;
            case 116:
               var10000 = 226;
               break;
            case 117:
               var10000 = 212;
               break;
            case 118:
               var10000 = 239;
               break;
            case 119:
               var10000 = 218;
               break;
            case 120:
               var10000 = 234;
               break;
            case 121:
               var10000 = 249;
               break;
            case 122:
               var10000 = 64;
               break;
            case 123:
               var10000 = 251;
               break;
            case 124:
               var10000 = 168;
               break;
            case 125:
               var10000 = 26;
               break;
            case 126:
               var10000 = 232;
               break;
            case 127:
               var10000 = 47;
               break;
            case 128:
               var10000 = 201;
               break;
            case 129:
               var10000 = 210;
               break;
            case 130:
               var10000 = 120;
               break;
            case 131:
               var10000 = 0;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 196;
               break;
            case 134:
               var10000 = 146;
               break;
            case 135:
               var10000 = 9;
               break;
            case 136:
               var10000 = 243;
               break;
            case 137:
               var10000 = 92;
               break;
            case 138:
               var10000 = 216;
               break;
            case 139:
               var10000 = 135;
               break;
            case 140:
               var10000 = 191;
               break;
            case 141:
               var10000 = 33;
               break;
            case 142:
               var10000 = 119;
               break;
            case 143:
               var10000 = 83;
               break;
            case 144:
               var10000 = 28;
               break;
            case 145:
               var10000 = 60;
               break;
            case 146:
               var10000 = 42;
               break;
            case 147:
               var10000 = 158;
               break;
            case 148:
               var10000 = 49;
               break;
            case 149:
               var10000 = 170;
               break;
            case 150:
               var10000 = 104;
               break;
            case 151:
               var10000 = 141;
               break;
            case 152:
               var10000 = 118;
               break;
            case 153:
               var10000 = 27;
               break;
            case 154:
               var10000 = 171;
               break;
            case 155:
               var10000 = 233;
               break;
            case 156:
               var10000 = 137;
               break;
            case 157:
               var10000 = 52;
               break;
            case 158:
               var10000 = 18;
               break;
            case 159:
               var10000 = 152;
               break;
            case 160:
               var10000 = 225;
               break;
            case 161:
               var10000 = 236;
               break;
            case 162:
               var10000 = 199;
               break;
            case 163:
               var10000 = 178;
               break;
            case 164:
               var10000 = 246;
               break;
            case 165:
               var10000 = 176;
               break;
            case 166:
               var10000 = 82;
               break;
            case 167:
               var10000 = 111;
               break;
            case 168:
               var10000 = 61;
               break;
            case 169:
               var10000 = 164;
               break;
            case 170:
               var10000 = 19;
               break;
            case 171:
               var10000 = 184;
               break;
            case 172:
               var10000 = 209;
               break;
            case 173:
               var10000 = 8;
               break;
            case 174:
               var10000 = 94;
               break;
            case 175:
               var10000 = 4;
               break;
            case 176:
               var10000 = 247;
               break;
            case 177:
               var10000 = 250;
               break;
            case 178:
               var10000 = 90;
               break;
            case 179:
               var10000 = 131;
               break;
            case 180:
               var10000 = 12;
               break;
            case 181:
               var10000 = 138;
               break;
            case 182:
               var10000 = 163;
               break;
            case 183:
               var10000 = 37;
               break;
            case 184:
               var10000 = 96;
               break;
            case 185:
               var10000 = 143;
               break;
            case 186:
               var10000 = 190;
               break;
            case 187:
               var10000 = 58;
               break;
            case 188:
               var10000 = 127;
               break;
            case 189:
               var10000 = 114;
               break;
            case 190:
               var10000 = 203;
               break;
            case 191:
               var10000 = 107;
               break;
            case 192:
               var10000 = 221;
               break;
            case 193:
               var10000 = 110;
               break;
            case 194:
               var10000 = 29;
               break;
            case 195:
               var10000 = 156;
               break;
            case 196:
               var10000 = 140;
               break;
            case 197:
               var10000 = 113;
               break;
            case 198:
               var10000 = 105;
               break;
            case 199:
               var10000 = 85;
               break;
            case 200:
               var10000 = 172;
               break;
            case 201:
               var10000 = 13;
               break;
            case 202:
               var10000 = 219;
               break;
            case 203:
               var10000 = 117;
               break;
            case 204:
               var10000 = 167;
               break;
            case 205:
               var10000 = 80;
               break;
            case 206:
               var10000 = 235;
               break;
            case 207:
               var10000 = 40;
               break;
            case 208:
               var10000 = 63;
               break;
            case 209:
               var10000 = 244;
               break;
            case 210:
               var10000 = 98;
               break;
            case 211:
               var10000 = 97;
               break;
            case 212:
               var10000 = 50;
               break;
            case 213:
               var10000 = 134;
               break;
            case 214:
               var10000 = 3;
               break;
            case 215:
               var10000 = 35;
               break;
            case 216:
               var10000 = 230;
               break;
            case 217:
               var10000 = 179;
               break;
            case 218:
               var10000 = 165;
               break;
            case 219:
               var10000 = 157;
               break;
            case 220:
               var10000 = 166;
               break;
            case 221:
               var10000 = 101;
               break;
            case 222:
               var10000 = 155;
               break;
            case 223:
               var10000 = 145;
               break;
            case 224:
               var10000 = 124;
               break;
            case 225:
               var10000 = 14;
               break;
            case 226:
               var10000 = 128;
               break;
            case 227:
               var10000 = 245;
               break;
            case 228:
               var10000 = 188;
               break;
            case 229:
               var10000 = 10;
               break;
            case 230:
               var10000 = 65;
               break;
            case 231:
               var10000 = 116;
               break;
            case 232:
               var10000 = 125;
               break;
            case 233:
               var10000 = 148;
               break;
            case 234:
               var10000 = 224;
               break;
            case 235:
               var10000 = 16;
               break;
            case 236:
               var10000 = 72;
               break;
            case 237:
               var10000 = 182;
               break;
            case 238:
               var10000 = 77;
               break;
            case 239:
               var10000 = 173;
               break;
            case 240:
               var10000 = 21;
               break;
            case 241:
               var10000 = 206;
               break;
            case 242:
               var10000 = 106;
               break;
            case 243:
               var10000 = 112;
               break;
            case 244:
               var10000 = 150;
               break;
            case 245:
               var10000 = 213;
               break;
            case 246:
               var10000 = 217;
               break;
            case 247:
               var10000 = 41;
               break;
            case 248:
               var10000 = 153;
               break;
            case 249:
               var10000 = 109;
               break;
            case 250:
               var10000 = 159;
               break;
            case 251:
               var10000 = 207;
               break;
            case 252:
               var10000 = 115;
               break;
            case 253:
               var10000 = 103;
               break;
            case 254:
               var10000 = 23;
               break;
            default:
               var10000 = 175;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27279;
      if (o[var3] == null) {
         o[var3] = (int)(k[var3] ^ var1);
      }

      return o[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "ªM¼R\u0010?7\u001fT\u0016\bÄ¦(õðã\u0016\u0086Íx";
      int var12 = "ªM¼R\u0010?7\u001fT\u0016\bÄ¦(õðã\u0016\u0086Íx".length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 55;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 92;
                        break;
                     case 1:
                        var65 = 13;
                        break;
                     case 2:
                        var65 = 41;
                        break;
                     case 3:
                        var65 = 98;
                        break;
                     case 4:
                        var65 = 99;
                        break;
                     case 5:
                        var65 = 58;
                        break;
                     default:
                        var65 = 23;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     f = var13;
                     g = new String[4];
                     long var0 = 2052181861655698056L;
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "\u0005wê^\u0019\fþ=_g¹üúB:Ä\u0082\u001dTââô\u009b\u0086öþ±êÿablÞ?µ\u0083ã\u0016Ôj!´tyU,é\u008d\\»(á\t³)Dv\tÉí\u0001\u007f\u000f_¹Éª\u0090c\u0093\u008d \u0080,\u0094Ý\u0001Ñ\u001fÚÈ©`{\u0092hX5\u0002M¢T\b`ÇÁ\u000f\u0088E\u0007\u009a~!Qk\u0013\u001f«üíB·ß\u0010Ä\u0015ö\u0098WÉ^\u009b\u0082ÄË\u0015\u0083Ä";
                     int var5 = "\u0005wê^\u0019\fþ=_g¹üúB:Ä\u0082\u001dTââô\u009b\u0086öþ±êÿablÞ?µ\u0083ã\u0016Ôj!´tyU,é\u008d\\»(á\t³)Dv\tÉí\u0001\u007f\u000f_¹Éª\u0090c\u0093\u008d \u0080,\u0094Ý\u0001Ñ\u001fÚÈ©`{\u0092hX5\u0002M¢T\b`ÇÁ\u000f\u0088E\u0007\u009a~!Qk\u0013\u001f«üíB·ß\u0010Ä\u0015ö\u0098WÉ^\u009b\u0082ÄË\u0015\u0083Ä"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    k = var6;
                                    o = new Integer[18];
                                    w = new ThreadLocal();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "1>²\u0019\u0096è`\u001eP\u001dxý\u0084:ÇV";
                                 var5 = "1>²\u0019\u0096è`\u001eP\u001dxý\u0084:ÇV".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "qhÎ s°\u0098\n\u0004ÙU\u0099×øVÛ\u0080o\u0007nZ\u0012\u0019iP\rAÔ>^HÄ!Oñ\t\u0013\u008bÖ\u0087Æç@)ª\u0011\u0092º\nÞjJjÇ\u0097Óí0K\u0016/×\u0007s\u000eä";
                  var12 = "qhÎ s°\u0098\n\u0004ÙU\u0099×øVÛ\u0080o\u0007nZ\u0012\u0019iP\rAÔ>^HÄ!Oñ\t\u0013\u008bÖ\u0087Æç@)ª\u0011\u0092º\nÞjJjÇ\u0097Óí0K\u0016/×\u0007s\u000eä"
                     .length();
                  var9 = ' ';
                  var17 = -1;
            }

            var10000 = 11;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





